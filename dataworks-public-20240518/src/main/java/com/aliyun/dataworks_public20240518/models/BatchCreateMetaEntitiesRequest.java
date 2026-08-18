// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class BatchCreateMetaEntitiesRequest extends TeaModel {
    /**
     * <p>The list of entities. A maximum of five entities are supported. All entities in the same batch must have the same entityType.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("Entities")
    public java.util.List<BatchCreateMetaEntitiesRequestEntities> entities;

    public static BatchCreateMetaEntitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateMetaEntitiesRequest self = new BatchCreateMetaEntitiesRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateMetaEntitiesRequest setEntities(java.util.List<BatchCreateMetaEntitiesRequestEntities> entities) {
        this.entities = entities;
        return this;
    }
    public java.util.List<BatchCreateMetaEntitiesRequestEntities> getEntities() {
        return this.entities;
    }

    public static class BatchCreateMetaEntitiesRequestEntities extends TeaModel {
        /**
         * <p>The entity attributes. Complex values must be serialized as JSON strings.</p>
         */
        @NameInMap("Attributes")
        public java.util.Map<String, String> attributes;

        /**
         * <p>The comment.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a comment</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The custom attribute values. The key is the custom attribute identifier, and the value currently supports only a single value.
         * <notice>The custom attributes used here must be created in advance by calling the CreateCustomAttribute operation. For example, after you call the API to create a custom attribute with the ID <code>custom-attribute:owner_name</code>, you can configure {\&quot;owner_name\&quot;: [\&quot;Bob\&quot;]} here to complete the custom attribute configuration.</notice></p>
         */
        @NameInMap("CustomAttributes")
        public java.util.Map<String, java.util.List<String>> customAttributes;

        /**
         * <p>The entity type. All entities in the same batch must have the same type. The following types are supported:</p>
         * <ul>
         * <li>Custom entity types, such as custom_entity-biz_api.</li>
         * <li>Extension table types. If the metadata entity type custom_dw-table is registered, you can create objects of the corresponding database type custom_dw-database and table type custom_dw-table.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>custom_entity-customer_api</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        /**
         * <p>The entity name. The name can contain uppercase letters, lowercase letters, digits, and underscores (_). It must start with a letter and can be up to 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>api_001</p>
         */
        @NameInMap("Name")
        public String name;

        public static BatchCreateMetaEntitiesRequestEntities build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateMetaEntitiesRequestEntities self = new BatchCreateMetaEntitiesRequestEntities();
            return TeaModel.build(map, self);
        }

        public BatchCreateMetaEntitiesRequestEntities setAttributes(java.util.Map<String, String> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.Map<String, String> getAttributes() {
            return this.attributes;
        }

        public BatchCreateMetaEntitiesRequestEntities setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public BatchCreateMetaEntitiesRequestEntities setCustomAttributes(java.util.Map<String, java.util.List<String>> customAttributes) {
            this.customAttributes = customAttributes;
            return this;
        }
        public java.util.Map<String, java.util.List<String>> getCustomAttributes() {
            return this.customAttributes;
        }

        public BatchCreateMetaEntitiesRequestEntities setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public BatchCreateMetaEntitiesRequestEntities setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
