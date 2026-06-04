// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateMetaEntityShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("Attributes")
    public String attributesShrink;

    /**
     * <strong>example:</strong>
     * <p>this is a comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("CustomAttributes")
    public String customAttributesShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>custom_entity-customer_api:api_001</p>
     */
    @NameInMap("Id")
    public String id;

    public static UpdateMetaEntityShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetaEntityShrinkRequest self = new UpdateMetaEntityShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMetaEntityShrinkRequest setAttributesShrink(String attributesShrink) {
        this.attributesShrink = attributesShrink;
        return this;
    }
    public String getAttributesShrink() {
        return this.attributesShrink;
    }

    public UpdateMetaEntityShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public UpdateMetaEntityShrinkRequest setCustomAttributesShrink(String customAttributesShrink) {
        this.customAttributesShrink = customAttributesShrink;
        return this;
    }
    public String getCustomAttributesShrink() {
        return this.customAttributesShrink;
    }

    public UpdateMetaEntityShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
