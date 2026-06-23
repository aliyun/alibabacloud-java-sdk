// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class MetaEntity extends TeaModel {
    /**
     * <p>Entity attributes. Complex values are represented as JSON strings.</p>
     */
    @NameInMap("Attributes")
    public java.util.Map<String, String> attributes;

    /**
     * <p>Comment</p>
     * 
     * <strong>example:</strong>
     * <p>this is a comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>Creation time as a millisecond-level timestamp</p>
     * 
     * <strong>example:</strong>
     * <p>1780553640613</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>Custom attribute values. The key is the custom attribute identifier. The value is a list of attribute values.</p>
     */
    @NameInMap("CustomAttributes")
    public java.util.Map<String, java.util.List<String>> customAttributes;

    /**
     * <p>Entity type</p>
     * 
     * <strong>example:</strong>
     * <p>custom_entity-customer_api</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>Entity ID</p>
     * 
     * <strong>example:</strong>
     * <p>custom_entity-customer_api:api_001</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Attribute definition of the custom entity.</p>
     * <blockquote>
     * <p>Notice: For historical reasons, this property is not returned and its value is empty. We recommend that you use the GetMetaEntityDef API to obtain the entity type definition.</p>
     * </blockquote>
     */
    @NameInMap("MetaEntityDef")
    public MetaEntityDef metaEntityDef;

    /**
     * <p>Modification time as a millisecond-level timestamp</p>
     * 
     * <strong>example:</strong>
     * <p>1763380628000</p>
     */
    @NameInMap("ModifyTime")
    public Long modifyTime;

    /**
     * <p>Entity name</p>
     * 
     * <strong>example:</strong>
     * <p>api_001</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Owner ID. The default value is the Alibaba Cloud UID of the creator.</p>
     * 
     * <strong>example:</strong>
     * <p>207924799988354</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    public static MetaEntity build(java.util.Map<String, ?> map) throws Exception {
        MetaEntity self = new MetaEntity();
        return TeaModel.build(map, self);
    }

    public MetaEntity setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.Map<String, String> getAttributes() {
        return this.attributes;
    }

    public MetaEntity setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public MetaEntity setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public MetaEntity setCustomAttributes(java.util.Map<String, java.util.List<String>> customAttributes) {
        this.customAttributes = customAttributes;
        return this;
    }
    public java.util.Map<String, java.util.List<String>> getCustomAttributes() {
        return this.customAttributes;
    }

    public MetaEntity setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public MetaEntity setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public MetaEntity setMetaEntityDef(MetaEntityDef metaEntityDef) {
        this.metaEntityDef = metaEntityDef;
        return this;
    }
    public MetaEntityDef getMetaEntityDef() {
        return this.metaEntityDef;
    }

    public MetaEntity setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public Long getModifyTime() {
        return this.modifyTime;
    }

    public MetaEntity setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MetaEntity setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

}
