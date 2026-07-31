// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteMetaEntityDefRequest extends TeaModel {
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
     * <p>Specifies whether to force delete the entity definition. Default value: false. Valid values:</p>
     * <ul>
     * <li>true: Automatically deletes all entity objects created under this entity type.</li>
     * <li>false: Checks whether entity objects exist under this entity type. If objects exist, the deletion is failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Force")
    public Boolean force;

    public static DeleteMetaEntityDefRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetaEntityDefRequest self = new DeleteMetaEntityDefRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMetaEntityDefRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public DeleteMetaEntityDefRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
