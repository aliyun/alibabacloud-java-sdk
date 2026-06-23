// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateMetaEntityShrinkRequest extends TeaModel {
    /**
     * <p>The entity attributes. Complex values must be serialized into a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("Attributes")
    public String attributesShrink;

    /**
     * <p>The comment on the entity.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The custom attribute values. Each key specifies a custom attribute, and its value is an array that can contain at most one item. To delete an attribute value, provide an empty array.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("CustomAttributes")
    public String customAttributesShrink;

    /**
     * <p>The ID of the entity to update. The entity name, entity type, and parent-child relationship are determined by the ID and cannot be modified using this operation.</p>
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
