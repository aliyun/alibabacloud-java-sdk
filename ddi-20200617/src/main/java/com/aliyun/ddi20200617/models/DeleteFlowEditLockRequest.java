// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DeleteFlowEditLockRequest extends TeaModel {
    @NameInMap("EntityId")
    public String entityId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteFlowEditLockRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowEditLockRequest self = new DeleteFlowEditLockRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFlowEditLockRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public DeleteFlowEditLockRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteFlowEditLockRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
