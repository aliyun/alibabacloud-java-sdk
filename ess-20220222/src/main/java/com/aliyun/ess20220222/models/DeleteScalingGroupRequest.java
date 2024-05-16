// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DeleteScalingGroupRequest extends TeaModel {
    /**
     * <p>Specifies whether to forcibly delete the scaling group and release Elastic Compute Service (ECS) instances in the scaling group when ECS instances or ongoing scaling activities exist in the scaling group. Valid values:</p>
     * <br>
     * <p>*   true: forcibly deletes the scaling group. The scaling group is disabled and new scaling requests are rejected. After all existing scaling requests are processed, the ECS instances are removed from the scaling group. Then, the scaling group is deleted. If the ECS instances are manually added to the scaling group, the ECS instances are only removed from the scaling group. If the ECS instances are automatically created and added to the scaling group, the ECS instances are removed from the scaling group and then released.</p>
     * <br>
     * <p>*   false: does not forcibly delete the scaling group. The scaling group is disabled and then deleted if the following conditions are met:</p>
     * <br>
     * <p>    *   No scaling activities are in process in the scaling group.</p>
     * <p>    *   The Total Capacity parameter is set to 0. A value of 0 specifies that no ECS instances exist in the scaling group.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("ForceDelete")
    public Boolean forceDelete;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the scaling group.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The ID of the scaling group.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static DeleteScalingGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteScalingGroupRequest self = new DeleteScalingGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteScalingGroupRequest setForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
        return this;
    }
    public Boolean getForceDelete() {
        return this.forceDelete;
    }

    public DeleteScalingGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteScalingGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteScalingGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteScalingGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteScalingGroupRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}
