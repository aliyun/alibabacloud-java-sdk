// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateCustomAttributeShrinkRequest extends TeaModel {
    /**
     * <p>The description of the custom attribute. The value must be less than 256 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>test comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>Specifies whether to display the attribute on the details page. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DisplayEnabled")
    public Boolean displayEnabled;

    /**
     * <p>The display name of the custom attribute. The value must be less than 128 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BusinessOwner</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The list of applicable entity types. Exact entity types and wildcard patterns such as <code>*-table</code> and <code>*-column</code> are supported. Examples:</p>
     * <ul>
     * <li>dataworks-project: workspace</li>
     * <li>dataworks-dataset: DataWorks dataset</li>
     * <li>maxcompute-table: MaxCompute table</li>
     * <li>*-column: all column types</li>
     * </ul>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EntityTypes")
    public String entityTypesShrink;

    /**
     * <p>The custom attribute ID. The value must match <code>^custom-attribute:[A-Za-z][A-Za-z0-9_]{0,98}$</code>. The part after custom-attribute: must be less than 100 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>custom-attribute:biz_owner</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Specifies whether the attribute can be used as a filter condition on the DataWorks Data Map search page. Default value: false. Currently, only the ENUM type supports setting this value to true.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SearchFilterEnabled")
    public Boolean searchFilterEnabled;

    /**
     * <p>The type of the custom attribute. Valid values: ENUM, TEXT, and HYPERLINK.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TEXT</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The enumeration values. This parameter is required when type is set to ENUM. This parameter is not supported for TEXT or HYPERLINK types.</p>
     */
    @NameInMap("ValueEnums")
    public String valueEnumsShrink;

    public static CreateCustomAttributeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomAttributeShrinkRequest self = new CreateCustomAttributeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomAttributeShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateCustomAttributeShrinkRequest setDisplayEnabled(Boolean displayEnabled) {
        this.displayEnabled = displayEnabled;
        return this;
    }
    public Boolean getDisplayEnabled() {
        return this.displayEnabled;
    }

    public CreateCustomAttributeShrinkRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateCustomAttributeShrinkRequest setEntityTypesShrink(String entityTypesShrink) {
        this.entityTypesShrink = entityTypesShrink;
        return this;
    }
    public String getEntityTypesShrink() {
        return this.entityTypesShrink;
    }

    public CreateCustomAttributeShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateCustomAttributeShrinkRequest setSearchFilterEnabled(Boolean searchFilterEnabled) {
        this.searchFilterEnabled = searchFilterEnabled;
        return this;
    }
    public Boolean getSearchFilterEnabled() {
        return this.searchFilterEnabled;
    }

    public CreateCustomAttributeShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateCustomAttributeShrinkRequest setValueEnumsShrink(String valueEnumsShrink) {
        this.valueEnumsShrink = valueEnumsShrink;
        return this;
    }
    public String getValueEnumsShrink() {
        return this.valueEnumsShrink;
    }

}
