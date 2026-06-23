// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateCustomAttributeRequest extends TeaModel {
    /**
     * <p>The new description for the custom attribute. It must be 256 characters or less.</p>
     * 
     * <strong>example:</strong>
     * <p>test comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>Whether to display the custom attribute in the UI.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DisplayEnabled")
    public Boolean displayEnabled;

    /**
     * <p>The new display name for the custom attribute. It must be 128 characters or less.</p>
     * 
     * <strong>example:</strong>
     * <p>业务负责人</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The applicable entity types. This parameter supports specific types and wildcard formats, such as <code>*-table</code> and <code>*-column</code>. For example:</p>
     * <ul>
     * <li><p><code>dataworks-project</code>: A DataWorks workspace</p>
     * </li>
     * <li><p><code>dataworks-dataset</code>: A DataWorks dataset</p>
     * </li>
     * <li><p><code>maxcompute-table</code>: A MaxCompute table</p>
     * </li>
     * <li><p><code>*-column</code>: All column types</p>
     * </li>
     * </ul>
     */
    @NameInMap("EntityTypes")
    public java.util.List<String> entityTypes;

    /**
     * <p>The custom attribute ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>custom-attribute:biz_owner</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Whether the custom attribute can be used as a filter condition.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SearchFilterEnabled")
    public Boolean searchFilterEnabled;

    /**
     * <p>The enumerated values. This applies only to custom attributes of the <code>enum</code> type. You can only append new values during an update.</p>
     */
    @NameInMap("ValueEnums")
    public java.util.List<String> valueEnums;

    public static UpdateCustomAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomAttributeRequest self = new UpdateCustomAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomAttributeRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public UpdateCustomAttributeRequest setDisplayEnabled(Boolean displayEnabled) {
        this.displayEnabled = displayEnabled;
        return this;
    }
    public Boolean getDisplayEnabled() {
        return this.displayEnabled;
    }

    public UpdateCustomAttributeRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateCustomAttributeRequest setEntityTypes(java.util.List<String> entityTypes) {
        this.entityTypes = entityTypes;
        return this;
    }
    public java.util.List<String> getEntityTypes() {
        return this.entityTypes;
    }

    public UpdateCustomAttributeRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateCustomAttributeRequest setSearchFilterEnabled(Boolean searchFilterEnabled) {
        this.searchFilterEnabled = searchFilterEnabled;
        return this;
    }
    public Boolean getSearchFilterEnabled() {
        return this.searchFilterEnabled;
    }

    public UpdateCustomAttributeRequest setValueEnums(java.util.List<String> valueEnums) {
        this.valueEnums = valueEnums;
        return this;
    }
    public java.util.List<String> getValueEnums() {
        return this.valueEnums;
    }

}
