// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class MetaEntityDef extends TeaModel {
    /**
     * <p>A list of entity attribute definition objects.</p>
     */
    @NameInMap("AttributeDefs")
    public java.util.List<MetaEntityAttributeDef> attributeDefs;

    /**
     * <p>The time when the definition was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1780553640613</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The display name.</p>
     * 
     * <strong>example:</strong>
     * <p>业务API</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The entity type.</p>
     * 
     * <strong>example:</strong>
     * <p>custom_entity-biz_api</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The extension mode. Valid values: NONE and TABLE. NONE indicates a custom type. TABLE indicates that the type extends a table type.</p>
     * 
     * <strong>example:</strong>
     * <p>NONE</p>
     */
    @NameInMap("Extend")
    public String extend;

    /**
     * <p>The time when the definition was last updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1780553640613</p>
     */
    @NameInMap("ModifyTime")
    public Long modifyTime;

    /**
     * <p>The name of the type definition.</p>
     * 
     * <strong>example:</strong>
     * <p>biz_api</p>
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
