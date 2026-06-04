// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateMetaEntityDefRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>Business API</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>custom_entity-customer_api</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("NewAttributeDefs")
    public java.util.List<MetaEntityAttributeDef> newAttributeDefs;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("UpdateAttributeDefs")
    public java.util.List<MetaEntityAttributeDef> updateAttributeDefs;

    public static UpdateMetaEntityDefRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetaEntityDefRequest self = new UpdateMetaEntityDefRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMetaEntityDefRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateMetaEntityDefRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateMetaEntityDefRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public UpdateMetaEntityDefRequest setNewAttributeDefs(java.util.List<MetaEntityAttributeDef> newAttributeDefs) {
        this.newAttributeDefs = newAttributeDefs;
        return this;
    }
    public java.util.List<MetaEntityAttributeDef> getNewAttributeDefs() {
        return this.newAttributeDefs;
    }

    public UpdateMetaEntityDefRequest setUpdateAttributeDefs(java.util.List<MetaEntityAttributeDef> updateAttributeDefs) {
        this.updateAttributeDefs = updateAttributeDefs;
        return this;
    }
    public java.util.List<MetaEntityAttributeDef> getUpdateAttributeDefs() {
        return this.updateAttributeDefs;
    }

}
