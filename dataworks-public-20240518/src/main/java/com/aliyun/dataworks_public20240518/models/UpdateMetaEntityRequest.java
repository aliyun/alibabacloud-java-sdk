// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateMetaEntityRequest extends TeaModel {
    /**
     * <p>The entity attributes. Complex values must be serialized into a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("Attributes")
    public java.util.Map<String, String> attributes;

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
    public java.util.Map<String, java.util.List<String>> customAttributes;

    /**
     * <p>The ID of the entity to update. The entity name, entity type, and parent-child relationship are determined by the ID and cannot be modified using this operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>custom_entity-customer_api:api_001</p>
     */
    @NameInMap("Id")
    public String id;

    public static UpdateMetaEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetaEntityRequest self = new UpdateMetaEntityRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMetaEntityRequest setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.Map<String, String> getAttributes() {
        return this.attributes;
    }

    public UpdateMetaEntityRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public UpdateMetaEntityRequest setCustomAttributes(java.util.Map<String, java.util.List<String>> customAttributes) {
        this.customAttributes = customAttributes;
        return this;
    }
    public java.util.Map<String, java.util.List<String>> getCustomAttributes() {
        return this.customAttributes;
    }

    public UpdateMetaEntityRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
