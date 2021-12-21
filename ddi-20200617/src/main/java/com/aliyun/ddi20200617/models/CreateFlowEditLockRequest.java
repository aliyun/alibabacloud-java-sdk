// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class CreateFlowEditLockRequest extends TeaModel {
    @NameInMap("EntityId")
    public String entityId;

    @NameInMap("Force")
    public Boolean force;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateFlowEditLockRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowEditLockRequest self = new CreateFlowEditLockRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowEditLockRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public CreateFlowEditLockRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public CreateFlowEditLockRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateFlowEditLockRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
