// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class MetaEntityDef extends TeaModel {
    @NameInMap("AttributeDefs")
    public java.util.List<MetaEntityAttributeDef> attributeDefs;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <strong>example:</strong>
     * <p>custom_entity-customer_api</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <strong>example:</strong>
     * <p>NONE</p>
     */
    @NameInMap("Extend")
    public String extend;

    @NameInMap("ModifyTime")
    public Long modifyTime;

    /**
     * <strong>example:</strong>
     * <p>customer_api</p>
     */
    @NameInMap("Name")
    public String name;

    public static MetaEntityDef build(java.util.Map<String, ?> map) throws Exception {
        MetaEntityDef self = new MetaEntityDef();
        return TeaModel.build(map, self);
    }

    public MetaEntityDef setAttributeDefs(java.util.List<MetaEntityAttributeDef> attributeDefs) {
        this.attributeDefs = attributeDefs;
        return this;
    }
    public java.util.List<MetaEntityAttributeDef> getAttributeDefs() {
        return this.attributeDefs;
    }

    public MetaEntityDef setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public MetaEntityDef setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public MetaEntityDef setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public MetaEntityDef setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public MetaEntityDef setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public MetaEntityDef setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public Long getModifyTime() {
        return this.modifyTime;
    }

    public MetaEntityDef setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
