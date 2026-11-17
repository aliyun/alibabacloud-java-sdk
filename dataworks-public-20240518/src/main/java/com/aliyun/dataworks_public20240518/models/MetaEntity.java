// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class MetaEntity extends TeaModel {
    /**
     * <p>The entity properties. Complex values are represented as JSON strings.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key1&quot;: &quot;v1&quot;}</p>
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
     * <p>The creation time. The value is a timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1780553640613</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The custom attribute values. The key is the custom attribute identifier, and the value is a list of attribute values.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;owner_name&quot;:[&quot;Zhang San&quot;]}</p>
     */
    @NameInMap("CustomAttributes")
    public java.util.Map<String, java.util.List<String>> customAttributes;

    /**
     * <p>The entity type.</p>
     * 
     * <strong>example:</strong>
     * <p>custom_entity-customer_api</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The entity ID.</p>
     * 
     * <strong>example:</strong>
     * <p>custom_entity-customer_api:api_001</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The property definition of the custom entity. <notice>This legacy property is not populated. To retrieve the entity type definition, call GetMetaEntityDef.</notice></p>
     */
    @NameInMap("MetaEntityDef")
    public MetaEntityDef metaEntityDef;

    /**
     * <p>The modification time. The value is a timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1763380628000</p>
     */
    @NameInMap("ModifyTime")
    public Long modifyTime;

    /**
     * <p>The entity name.</p>
     * 
     * <strong>example:</strong>
     * <p>api_001</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The owner ID. Default value: the Alibaba Cloud UID of the creator.</p>
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
