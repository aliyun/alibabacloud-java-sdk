// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DeleteScalingGroupRequest extends TeaModel {
    /**
     * <p>Specifies whether to enforce the deletion of the scaling group, including the removal of the current ECS instances or elastic container instances from the scaling group and their subsequent release, even if the scaling group is actively undergoing scaling activities. Valid values:</p>
     * <ul>
     * <li><p>true: enforces the deletion of the scaling group. In this case, the scaling group first enters the Disabled state, ceasing acceptance of new scaling requests. Auto Scaling awaits the conclusion of all ongoing scaling activities in the scaling group before it automatically removes the current ECS instances or elastic container instances from the scaling group and enforces the deletion operation. Note that manually added instances are merely removed from the scaling group, whereas auto-provisioned instances are removed and deleted.</p>
     * </li>
     * <li><p>false: does not enforce the deletion of the scaling group. The scaling group will be disabled and then deleted once all the following requirements are satisfied:</p>
     * <ul>
     * <li>The scaling group has no ongoing scaling activities.</li>
     * <li>The scaling group contains no ECS instances or elastic container instances (Total Capacity=0).</li>
     * </ul>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForceDelete")
    public Boolean forceDelete;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the scaling group.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The ID of the scaling group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp18p2yfxow2dloq****</p>
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
