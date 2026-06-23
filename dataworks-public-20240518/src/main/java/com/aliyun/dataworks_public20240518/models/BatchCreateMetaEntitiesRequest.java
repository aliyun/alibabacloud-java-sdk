// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class BatchCreateMetaEntitiesRequest extends TeaModel {
    /**
     * <p>An entity list. You can create up to five entities in a batch. All entities in the batch must have the same <code>EntityType</code>.</p>
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
         * <p>The entity attributes. Complex values must be serialized into a JSON string.</p>
         */
        @NameInMap("Attributes")
        public java.util.Map<String, String> attributes;

        /**
         * <p>The comment for the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a comment</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The custom attribute values. The key is the identifier of the custom attribute, and the value is a single-element list.</p>
         * <blockquote>
         * <p>Notice: The custom attributes used here must be created in advance by using the CreateCustomAttribute API. For example, after you create a custom attribute with the ID <code>custom-attribute:owner_name</code>, you can configure the custom attribute by setting this parameter to {\&quot;owner_name\&quot;: [\&quot;Bob\&quot;]}.</p>
         * </blockquote>
         */
        @NameInMap("CustomAttributes")
        public java.util.Map<String, java.util.List<String>> customAttributes;

        /**
         * <p>The entity type. All entities in a batch must have the same type. The following types are supported:</p>
         * <ul>
         * <li><p>Custom types, such as <code>custom_entity-biz_api</code>.</p>
         * </li>
         * <li><p>Extended table types. For example, if you have registered the <code>custom_dw-table</code> metadata entity type, you can create objects of the corresponding <code>custom_dw-database</code> (database) and <code>custom_dw-table</code> (table) types.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>custom_entity-customer_api</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        /**
         * <p>The entity name. The name can contain uppercase letters, lowercase letters, digits, and underscores (_). It must start with a letter and not exceed 64 characters.</p>
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
