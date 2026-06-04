// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateCustomAttributeShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DisplayEnabled")
    public Boolean displayEnabled;

    /**
     * <strong>example:</strong>
     * <p>业务负责人</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("EntityTypes")
    public String entityTypesShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>custom-attribute:biz_owner</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SearchFilterEnabled")
    public Boolean searchFilterEnabled;

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
