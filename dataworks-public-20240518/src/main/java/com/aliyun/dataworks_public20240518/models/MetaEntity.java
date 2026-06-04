// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class MetaEntity extends TeaModel {
    @NameInMap("Attributes")
    public java.util.Map<String, String> attributes;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("CustomAttributes")
    public java.util.Map<String, java.util.List<String>> customAttributes;

    /**
     * <strong>example:</strong>
     * <p>custom_entity-customer_api</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <strong>example:</strong>
     * <p>custom_entity-customer_api:api_001</p>
     */
    @NameInMap("Id")
    public String id;

    @NameInMap("MetaEntityDef")
    public MetaEntityDef metaEntityDef;

    @NameInMap("ModifyTime")
    public Long modifyTime;

    /**
     * <strong>example:</strong>
     * <p>api_001</p>
     */
    @NameInMap("Name")
    public String name;

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
