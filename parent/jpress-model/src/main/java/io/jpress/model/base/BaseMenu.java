package io.jpress.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMenu<M extends BaseMenu<M>> extends JbootModel<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setPid(java.lang.Long pid) {
		set("pid", pid);
	}
	
	public java.lang.Long getPid() {
		return getLong("pid");
	}

	public void setText(java.lang.String text) {
		set("text", text);
	}
	
	public java.lang.String getText() {
		return getStr("text");
	}

	public void setUrl(java.lang.String url) {
		set("url", url);
	}
	
	public java.lang.String getUrl() {
		return getStr("url");
	}

	public void setTarget(java.lang.String target) {
		set("target", target);
	}
	
	public java.lang.String getTarget() {
		return getStr("target");
	}

	public void setIcon(java.lang.String icon) {
		set("icon", icon);
	}
	
	public java.lang.String getIcon() {
		return getStr("icon");
	}

	public void setFlag(java.lang.String flag) {
		set("flag", flag);
	}
	
	public java.lang.String getFlag() {
		return getStr("flag");
	}

	public void setType(java.lang.String type) {
		set("type", type);
	}
	
	public java.lang.String getType() {
		return getStr("type");
	}

	public void setOrderNumber(java.lang.Integer orderNumber) {
		set("order_number", orderNumber);
	}
	
	public java.lang.Integer getOrderNumber() {
		return getInt("order_number");
	}

	public void setRelativeTable(java.lang.String relativeTable) {
		set("relative_table", relativeTable);
	}
	
	public java.lang.String getRelativeTable() {
		return getStr("relative_table");
	}

	public void setRelativeId(java.lang.Long relativeId) {
		set("relative_id", relativeId);
	}
	
	public java.lang.Long getRelativeId() {
		return getLong("relative_id");
	}

	public void setCreated(java.util.Date created) {
		set("created", created);
	}
	
	public java.util.Date getCreated() {
		return get("created");
	}

	public void setModified(java.util.Date modified) {
		set("modified", modified);
	}
	
	public java.util.Date getModified() {
		return get("modified");
	}

}
