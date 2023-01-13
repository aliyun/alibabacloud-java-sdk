// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class AttachInstancesRequest extends TeaModel {
    /**
     * <p>The IDs of the ECS instances or elastic container instances that you want to add.</p>
     */
    @NameInMap("Entrusted")
    public Boolean entrusted;

    /**
     * <p>The IDs of the ECS instances or elastic container instances that you want to add. You can specify 1 to 20 instance IDs.</p>
     * <br>
     * <p>Examples:</p>
     * <br>
     * <p>*   The ID of the ECS instance that you want to add is `i-28wt4****`.</p>
     * <p>*   The ID of the elastic container instance that you want to add is `eci-bp17gw49eu09yiwm****`.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The region ID of the scaling group.</p>
     */
    @NameInMap("LifecycleHook")
    public Boolean lifecycleHook;

    /**
     * <p>The weights of the ECS instances or elastic container instances as the backend servers of the associated CLB instance. Valid values: 1 to 100. Default value: 50.</p>
     */
    @NameInMap("LoadBalancerWeights")
    public java.util.List<Integer> loadBalancerWeights;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the scaling activity.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether the scaling group manages the lifecycles of instances that are manually added to the scaling group. Valid values:</p>
     * <br>
     * <p>*   true: The scaling group manages the lifecycles of instances that are manually added in a similar manner in which the scaling group manages the lifecycles of automatically created instances. After Auto Scaling removes instances from the scaling group, Auto Scaling releases the instances. After you call the DetachInstances operation to remove instances from the scaling group, Auto Scaling does not release the instances.</p>
     * <p>*   false: The scaling group does not manage the lifecycles of instances that are manually added. After Auto Scaling removes instances from the scaling group, Auto Scaling does not release the instances.</p>
     * <br>
     * <p>> You cannot specify this parameter for subscription instances.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static AttachInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachInstancesRequest self = new AttachInstancesRequest();
        return TeaModel.build(map, self);
    }

    public AttachInstancesRequest setEntrusted(Boolean entrusted) {
        this.entrusted = entrusted;
        return this;
    }
    public Boolean getEntrusted() {
        return this.entrusted;
    }

    public AttachInstancesRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public AttachInstancesRequest setLifecycleHook(Boolean lifecycleHook) {
        this.lifecycleHook = lifecycleHook;
        return this;
    }
    public Boolean getLifecycleHook() {
        return this.lifecycleHook;
    }

    public AttachInstancesRequest setLoadBalancerWeights(java.util.List<Integer> loadBalancerWeights) {
        this.loadBalancerWeights = loadBalancerWeights;
        return this;
    }
    public java.util.List<Integer> getLoadBalancerWeights() {
        return this.loadBalancerWeights;
    }

    public AttachInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AttachInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AttachInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AttachInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AttachInstancesRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}
