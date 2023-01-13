// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DetachInstancesRequest extends TeaModel {
    /**
     * <p>Specifies whether to remove the instances from the default server group and vServer groups of the Classic Load Balancer (CLB) instance that is associated with the scaling group, and whether to remove the IP addresses of the instances from the whitelist that manages access to the ApsaraDB RDS instance that is associated with the scaling group.</p>
     * <br>
     * <p>If you set this parameter to both, the instances are removed from the default sever group and vServer groups of the associated CLB instance, and the IP addresses of the instances are removed from the whitelist that manages access to the associated ApsaraDB RDS instance.</p>
     */
    @NameInMap("DecreaseDesiredCapacity")
    public Boolean decreaseDesiredCapacity;

    /**
     * <p>The IDs of the ECS instances or elastic container instances that you want to remove from the scaling group.</p>
     */
    @NameInMap("DetachOption")
    public String detachOption;

    /**
     * <p>The IDs of the ECS instances or elastic container instances that you want to remove from the scaling group. You can specify 1 to 20 instance IDs.</p>
     * <br>
     * <p>Examples:</p>
     * <br>
     * <p>*   The ID of the ECS instance that you want to remove is `i-bp109k5j3dum1ce6****`.</p>
     * <p>*   The ID of the elastic container instance that you want to remove is `eci-bp17gw49eu09yiwm****`.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The ID of the scaling activity.</p>
     */
    @NameInMap("LifecycleHook")
    public Boolean lifecycleHook;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to adjust the expected number of instances in the scaling group. Valid values:</p>
     * <br>
     * <p>*   true: After a specific number of instances are removed from the scaling group, the expected number of instances in the scaling group decreases.</p>
     * <p>*   false: After a specific number of instances are removed from the scaling group, the expected number of instances in the scaling group remains unchanged.</p>
     * <br>
     * <p>Default value: true.</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static DetachInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachInstancesRequest self = new DetachInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DetachInstancesRequest setDecreaseDesiredCapacity(Boolean decreaseDesiredCapacity) {
        this.decreaseDesiredCapacity = decreaseDesiredCapacity;
        return this;
    }
    public Boolean getDecreaseDesiredCapacity() {
        return this.decreaseDesiredCapacity;
    }

    public DetachInstancesRequest setDetachOption(String detachOption) {
        this.detachOption = detachOption;
        return this;
    }
    public String getDetachOption() {
        return this.detachOption;
    }

    public DetachInstancesRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DetachInstancesRequest setLifecycleHook(Boolean lifecycleHook) {
        this.lifecycleHook = lifecycleHook;
        return this;
    }
    public Boolean getLifecycleHook() {
        return this.lifecycleHook;
    }

    public DetachInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DetachInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DetachInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DetachInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DetachInstancesRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}
