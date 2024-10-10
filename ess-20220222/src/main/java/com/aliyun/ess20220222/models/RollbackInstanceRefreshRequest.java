// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class RollbackInstanceRefreshRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ir-a12ds234fasd*****</p>
     */
    @NameInMap("InstanceRefreshTaskId")
    public String instanceRefreshTaskId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp18p2yfxow2dloq****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static RollbackInstanceRefreshRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackInstanceRefreshRequest self = new RollbackInstanceRefreshRequest();
        return TeaModel.build(map, self);
    }

    public RollbackInstanceRefreshRequest setInstanceRefreshTaskId(String instanceRefreshTaskId) {
        this.instanceRefreshTaskId = instanceRefreshTaskId;
        return this;
    }
    public String getInstanceRefreshTaskId() {
        return this.instanceRefreshTaskId;
    }

    public RollbackInstanceRefreshRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RollbackInstanceRefreshRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RollbackInstanceRefreshRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RollbackInstanceRefreshRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}
