// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class EnableScalingGroupRequest extends TeaModel {
    /**
     * <p>The ID of the scaling configuration that you want to put into the Active state.</p>
     */
    @NameInMap("ActiveScalingConfigurationId")
    public String activeScalingConfigurationId;

    /**
     * <p>The IDs of ECS instances that you want to add to the scaling group after you enable the scaling group.</p>
     * <br>
     * <p>The ECS instances must meet the following requirements:</p>
     * <br>
     * <p>*   The ECS instances and the scaling group must reside in the same region.</p>
     * <p>*   The ECS instances must be in the Running state.</p>
     * <p>*   The ECS instances are not added to other scaling groups.</p>
     * <p>*   The billing method of the ECS instances must be subscription or pay-as-you-go, or the ECS instances must be preemptible instances.</p>
     * <p>*   If you specify the VswitchID parameter for the scaling group, the ECS instances must reside in the same virtual private cloud (VPC) as the specified vSwitch. You cannot add the ECS instances that reside in the classic network or other VPCs to the scaling group.</p>
     * <p>*   If you do not specify the VswitchID parameter for the scaling group, you cannot add ECS instances that reside in VPCs to the scaling group.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The ID of the launch template that is used by Auto Scaling to create ECS instances.</p>
     */
    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    /**
     * <p>Details of the instance types that you specify by using the Extended Configurations feature of the launch template.</p>
     */
    @NameInMap("LaunchTemplateOverrides")
    public java.util.List<EnableScalingGroupRequestLaunchTemplateOverrides> launchTemplateOverrides;

    /**
     * <p>The version number of the launch template. Valid values:</p>
     * <br>
     * <p>*   A fixed template version number.</p>
     * <p>*   Default: the default template version.</p>
     * <p>*   Latest: the latest template version.</p>
     */
    @NameInMap("LaunchTemplateVersion")
    public String launchTemplateVersion;

    /**
     * <p>The weight of an ECS instance as a backend server in the backend vServer group.</p>
     * <br>
     * <p>Default value: 50.</p>
     */
    @NameInMap("LoadBalancerWeights")
    public java.util.List<Integer> loadBalancerWeights;

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

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the scaling group.</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static EnableScalingGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableScalingGroupRequest self = new EnableScalingGroupRequest();
        return TeaModel.build(map, self);
    }

    public EnableScalingGroupRequest setActiveScalingConfigurationId(String activeScalingConfigurationId) {
        this.activeScalingConfigurationId = activeScalingConfigurationId;
        return this;
    }
    public String getActiveScalingConfigurationId() {
        return this.activeScalingConfigurationId;
    }

    public EnableScalingGroupRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public EnableScalingGroupRequest setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    public EnableScalingGroupRequest setLaunchTemplateOverrides(java.util.List<EnableScalingGroupRequestLaunchTemplateOverrides> launchTemplateOverrides) {
        this.launchTemplateOverrides = launchTemplateOverrides;
        return this;
    }
    public java.util.List<EnableScalingGroupRequestLaunchTemplateOverrides> getLaunchTemplateOverrides() {
        return this.launchTemplateOverrides;
    }

    public EnableScalingGroupRequest setLaunchTemplateVersion(String launchTemplateVersion) {
        this.launchTemplateVersion = launchTemplateVersion;
        return this;
    }
    public String getLaunchTemplateVersion() {
        return this.launchTemplateVersion;
    }

    public EnableScalingGroupRequest setLoadBalancerWeights(java.util.List<Integer> loadBalancerWeights) {
        this.loadBalancerWeights = loadBalancerWeights;
        return this;
    }
    public java.util.List<Integer> getLoadBalancerWeights() {
        return this.loadBalancerWeights;
    }

    public EnableScalingGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public EnableScalingGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public EnableScalingGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EnableScalingGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public EnableScalingGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public EnableScalingGroupRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public static class EnableScalingGroupRequestLaunchTemplateOverrides extends TeaModel {
        /**
         * <p>The instance type that you want to use to override the instance type that is specified in the launch template.</p>
         * <br>
         * <p>If you want to scale instances based on the weighted capacities of the instances, you must specify both the InstanceType and WeightedCapacity parameters.</p>
         * <br>
         * <p>> This parameter is supported only if you specify the LaunchTemplateId parameter.</p>
         * <br>
         * <p>You can specify an instance type that is available for purchase as the value of the InstanceType parameter.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The weight of the instance type. The weight specifies the capacity of a single instance of the specified instance type in the scaling group. If you want to scale instances based on the weighted capacities of the instances, you must specify the WeightedCapacity parameter after you specify the InstanceType parameter.</p>
         * <br>
         * <p>A higher weight specifies that a smaller number of instances of the specified instance type are required to meet the expected capacity requirement.</p>
         * <br>
         * <p>Performance metrics, such as the number of vCPUs and the memory size of each instance type, may vary. You can specify different weights for different instance types based on your business requirements.</p>
         * <br>
         * <p>Example:</p>
         * <br>
         * <p>*   Current capacity: 0</p>
         * <p>*   Expected capacity: 6</p>
         * <p>*   Capacity of ecs.c5.xlarge: 4</p>
         * <br>
         * <p>To meet the expected capacity requirement, Auto Scaling must create and add two ecs.c5.xlarge instances.</p>
         * <br>
         * <p>> The capacity of the scaling group cannot exceed the sum of the maximum number of instances that is specified by the MaxSize parameter and the maximum weight of the instance types.</p>
         * <br>
         * <p>Valid values of the WeightedCapacity parameter: 1 to 500.</p>
         */
        @NameInMap("WeightedCapacity")
        public Integer weightedCapacity;

        public static EnableScalingGroupRequestLaunchTemplateOverrides build(java.util.Map<String, ?> map) throws Exception {
            EnableScalingGroupRequestLaunchTemplateOverrides self = new EnableScalingGroupRequestLaunchTemplateOverrides();
            return TeaModel.build(map, self);
        }

        public EnableScalingGroupRequestLaunchTemplateOverrides setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public EnableScalingGroupRequestLaunchTemplateOverrides setWeightedCapacity(Integer weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public Integer getWeightedCapacity() {
            return this.weightedCapacity;
        }

    }

}
