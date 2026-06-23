// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateCustomAttributeShrinkRequest extends TeaModel {
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
    public String entityTypesShrink;

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
    public String valueEnumsShrink;

    public static UpdateCustomAttributeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomAttributeShrinkRequest self = new UpdateCustomAttributeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomAttributeShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public UpdateCustomAttributeShrinkRequest setDisplayEnabled(Boolean displayEnabled) {
        this.displayEnabled = displayEnabled;
        return this;
    }
    public Boolean getDisplayEnabled() {
        return this.displayEnabled;
    }

    public UpdateCustomAttributeShrinkRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateCustomAttributeShrinkRequest setEntityTypesShrink(String entityTypesShrink) {
        this.entityTypesShrink = entityTypesShrink;
        return this;
    }
    public String getEntityTypesShrink() {
        return this.entityTypesShrink;
    }

    public UpdateCustomAttributeShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateCustomAttributeShrinkRequest setSearchFilterEnabled(Boolean searchFilterEnabled) {
        this.searchFilterEnabled = searchFilterEnabled;
        return this;
    }
    public Boolean getSearchFilterEnabled() {
        return this.searchFilterEnabled;
    }

    public UpdateCustomAttributeShrinkRequest setValueEnumsShrink(String valueEnumsShrink) {
        this.valueEnumsShrink = valueEnumsShrink;
        return this;
    }
    public String getValueEnumsShrink() {
        return this.valueEnumsShrink;
    }

}
