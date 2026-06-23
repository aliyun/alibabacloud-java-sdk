// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CustomAttribute extends TeaModel {
    /**
     * <p>Description of the custom attribute. It must be fewer than 256 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>Creation time as a millisecond UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1750817692000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>Indicates whether this attribute is displayed on the page. Default is true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DisplayEnabled")
    public Boolean displayEnabled;

    /**
     * <p>Display name for the custom attribute. It must be fewer than 128 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>业务负责人</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>List of applicable entity types. Supports exact entity types and wildcard patterns such as <code>*-table</code> and <code>*-column</code>, for example:</p>
     * <ul>
     * <li><p>dataworks-project</p>
     * </li>
     * <li><p>dataworks-dataset</p>
     * </li>
     * <li><p>maxcompute-table</p>
     * </li>
     * <li><p>maxcompute-column</p>
     * </li>
     * </ul>
     */
    @NameInMap("EntityTypes")
    public java.util.List<String> entityTypes;

    /**
     * <p>Custom attribute ID. It must match the regular expression ^custom-attribute:[A-Za-z][A-Za-z0-9_]{0,98}$. The part after <code>custom-attribute:</code> must be fewer than 100 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>custom-attribute:biz_owner</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Modification time as a millisecond UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1763380628000</p>
     */
    @NameInMap("ModifyTime")
    public Long modifyTime;

    /**
     * <p>Indicates whether this attribute can be used as a filter on the search page (only affects search in Data Map). Only ENUM attributes can be set to true. Default is false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SearchFilterEnabled")
    public Boolean searchFilterEnabled;

    /**
     * <p>Custom attribute type. Supported types are ENUM, TEXT, and HYPERLINK.</p>
     * 
     * <strong>example:</strong>
     * <p>TEXT</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>Enumeration values. Required when Type is ENUM. Not supported for TEXT or HYPERLINK types.</p>
     */
    @NameInMap("ValueEnums")
    public java.util.List<String> valueEnums;

    public static CustomAttribute build(java.util.Map<String, ?> map) throws Exception {
        CustomAttribute self = new CustomAttribute();
        return TeaModel.build(map, self);
    }

    public CustomAttribute setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CustomAttribute setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public CustomAttribute setDisplayEnabled(Boolean displayEnabled) {
        this.displayEnabled = displayEnabled;
        return this;
    }
    public Boolean getDisplayEnabled() {
        return this.displayEnabled;
    }

    public CustomAttribute setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CustomAttribute setEntityTypes(java.util.List<String> entityTypes) {
        this.entityTypes = entityTypes;
        return this;
    }
    public java.util.List<String> getEntityTypes() {
        return this.entityTypes;
    }

    public CustomAttribute setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CustomAttribute setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public Long getModifyTime() {
        return this.modifyTime;
    }

    public CustomAttribute setSearchFilterEnabled(Boolean searchFilterEnabled) {
        this.searchFilterEnabled = searchFilterEnabled;
        return this;
    }
    public Boolean getSearchFilterEnabled() {
        return this.searchFilterEnabled;
    }

    public CustomAttribute setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CustomAttribute setValueEnums(java.util.List<String> valueEnums) {
        this.valueEnums = valueEnums;
        return this;
    }
    public java.util.List<String> getValueEnums() {
        return this.valueEnums;
    }

}
