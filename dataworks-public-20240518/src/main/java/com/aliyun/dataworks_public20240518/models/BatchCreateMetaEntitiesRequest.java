// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class BatchCreateMetaEntitiesRequest extends TeaModel {
    /**
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
        @NameInMap("Attributes")
        public java.util.Map<String, String> attributes;

        /**
         * <strong>example:</strong>
         * <p>this is a comment</p>
         */
        @NameInMap("Comment")
        public String comment;

        @NameInMap("CustomAttributes")
        public java.util.Map<String, java.util.List<String>> customAttributes;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>custom_entity-customer_api</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        /**
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
