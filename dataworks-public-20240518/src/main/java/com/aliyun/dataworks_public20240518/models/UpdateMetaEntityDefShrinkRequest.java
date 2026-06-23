// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateMetaEntityDefShrinkRequest extends TeaModel {
    /**
     * <p>The new description.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The new display name. The maximum length is 32 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>Business API</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The entity type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>custom_entity-customer_api</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The new attribute definitions. New attributes must be optional.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("NewAttributeDefs")
    public String newAttributeDefsShrink;

    /**
     * <p>The updates to existing attribute definitions. You can modify only the display name and description. You can also add enumerated values for attributes of the ENUM type.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("UpdateAttributeDefs")
    public String updateAttributeDefsShrink;

    public static UpdateMetaEntityDefShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetaEntityDefShrinkRequest self = new UpdateMetaEntityDefShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMetaEntityDefShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateMetaEntityDefShrinkRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateMetaEntityDefShrinkRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public UpdateMetaEntityDefShrinkRequest setNewAttributeDefsShrink(String newAttributeDefsShrink) {
        this.newAttributeDefsShrink = newAttributeDefsShrink;
        return this;
    }
    public String getNewAttributeDefsShrink() {
        return this.newAttributeDefsShrink;
    }

    public UpdateMetaEntityDefShrinkRequest setUpdateAttributeDefsShrink(String updateAttributeDefsShrink) {
        this.updateAttributeDefsShrink = updateAttributeDefsShrink;
        return this;
    }
    public String getUpdateAttributeDefsShrink() {
        return this.updateAttributeDefsShrink;
    }

}
