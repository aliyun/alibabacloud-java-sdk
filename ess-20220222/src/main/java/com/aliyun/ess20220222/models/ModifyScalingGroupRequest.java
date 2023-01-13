// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ModifyScalingGroupRequest extends TeaModel {
    /**
     * <p>The health check mode of the scaling group. Valid values:</p>
     * <br>
     * <p>*   NONE: Auto Scaling does not perform health checks on instances in the scaling group.</p>
     * <p>*   ECS: Auto Scaling performs health checks on ECS instances in the scaling group.</p>
     */
    @NameInMap("ActiveScalingConfigurationId")
    public String activeScalingConfigurationId;

    /**
     * <p>The allocation policy of preemptible instances. You can use this parameter to individually specify the allocation policy of preemptible instances. This parameter takes effect only when you set the `MultiAZPolicy` parameter to `COMPOSABLE`. Valid values:</p>
     * <br>
     * <p>*   priority: Auto Scaling selects instance types based on the specified order to create the required number of preemptible instances.</p>
     * <p>*   lowestPrice: Auto Scaling selects instance types that have the lowest unit price of vCPUs to create the required number of preemptible instances.</p>
     * <br>
     * <p>Default value: priority.</p>
     */
    @NameInMap("AllocationStrategy")
    public String allocationStrategy;

    /**
     * <p>The allocation policy. Auto Scaling selects instance types based on the allocation policy to create the required number of instances. The policy can be applied to pay-as-you-go instances and preemptible instances at the same time. This parameter takes effect only when you set the MultiAZPolicy parameter to COMPOSABLE. Valid values:</p>
     * <br>
     * <p>*   priority: Auto Scaling selects instance types based on the specified order to create the required number of instances.</p>
     * <p>*   lowestPrice: Auto Scaling selects instance types that have the lowest unit price of vCPUs to create the required number of instances.</p>
     * <br>
     * <p>Default value: priority.</p>
     */
    @NameInMap("AzBalance")
    public Boolean azBalance;

    /**
     * <p>The number of instance types that you specify. Auto Scaling creates preemptible instances of multiple instance types that are provided at the lowest price. Valid values: 0 to 10.</p>
     * <br>
     * <p>If you set the `MultiAZPolicy` parameter to `COMPOSABLE` Policy, the default value is 2.</p>
     */
    @NameInMap("CompensateWithOnDemand")
    public Boolean compensateWithOnDemand;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("CustomPolicyARN")
    public String customPolicyARN;

    /**
     * <p>The policy that is used to remove ECS instances from the scaling group. Valid values:</p>
     * <br>
     * <p>*   OldestInstance: removes ECS instances that are added at the earliest point in time to the scaling group.</p>
     * <p>*   NewestInstance: removes ECS instances that are most recently added to the scaling group.</p>
     * <p>*   OldestScalingConfiguration: removes ECS instances that are created based on the earliest scaling configuration.</p>
     */
    @NameInMap("DefaultCooldown")
    public Integer defaultCooldown;

    /**
     * <p>Specifies whether to enable deletion protection for the scaling group. Valid values:</p>
     * <br>
     * <p>*   true: enables deletion protection for the scaling group. This way, the scaling group cannot be deleted.</p>
     * <p>*   false: disables deletion protection for the scaling group.</p>
     */
    @NameInMap("DesiredCapacity")
    public Integer desiredCapacity;

    /**
     * <p>The scaling policy for the multi-zone scaling group that contains ECS instances. Valid values:</p>
     * <br>
     * <p>*   PRIORITY: ECS instances are scaled based on the vSwitch priority. The first vSwitch specified by using the VSwitchIds parameter has the highest priority. Auto Scaling preferentially scales instances in the zone where the vSwitch that has the highest priority resides. If the scaling fails, Auto Scaling scales instances in the zone where the vSwitch that has the next highest priority resides.</p>
     * <p>*   COST_OPTIMIZED: During a scale-out activity, Auto Scaling preferentially creates ECS instances of the instance type that has the lowest unit price of vCPU. During a scale-in activity, Auto Scaling preferentially removes ECS instances of the instance types that have the highest unit price of vCPU. Auto Scaling preferentially creates preemptible instances when preemptible instance types are specified in the scaling configuration. You can use the `CompensateWithOnDemand` parameter to specify whether to automatically create pay-as-you-go instances when Auto Scaling fails to create preemptible instances.</p>
     * <br>
     * <p>> The `COST_OPTIMIZED` setting takes effect only when multiple instance types are specified or at least one instance type is specified for preemptible instances.</p>
     * <br>
     * <p>*   BALANCE: ECS instances are evenly distributed across zones that are specified in the scaling group. If ECS instances are unevenly distributed among zones due to insufficient resources, you can call the RebalanceInstance operation to evenly distribute the instances among the zones.</p>
     * <p>*   COMPOSABLE: You can flexibly combine the preceding policies based on your business requirements.</p>
     */
    @NameInMap("GroupDeletionProtection")
    public Boolean groupDeletionProtection;

    /**
     * <p>The ID of the launch template that is used by Auto Scaling to create instances.</p>
     */
    @NameInMap("HealthCheckType")
    public String healthCheckType;

    /**
     * <p>The version number of the launch template. Valid values:</p>
     * <br>
     * <p>*   A fixed template version number.</p>
     * <p>*   Default: The default template version is always used.</p>
     * <p>*   Latest: The latest template version is always used.</p>
     */
    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    /**
     * <p>Details of the instance types that are specified in the extended configurations of the launch template.</p>
     */
    @NameInMap("LaunchTemplateOverrides")
    public java.util.List<ModifyScalingGroupRequestLaunchTemplateOverrides> launchTemplateOverrides;

    /**
     * <p>The minimum number of pay-as-you-go instances that must be included in the scaling group. Valid values: 0 to 1000. If the number of pay-as-you-go instances is less than the value of this parameter, Auto Scaling preferentially creates pay-as-you-go instances.</p>
     * <br>
     * <p>If you set the `MultiAZPolicy` parameter to `COMPOSABLE` Policy, the default value is 0.</p>
     */
    @NameInMap("LaunchTemplateVersion")
    public String launchTemplateVersion;

    /**
     * <p>Specifies whether to evenly distribute instances in the scaling group across zones. This parameter takes effect only when you set the `MultiAZPolicy` parameter to `COMPOSABLE`. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("MaxInstanceLifetime")
    public Integer maxInstanceLifetime;

    /**
     * <p>The default cooldown time of the scaling group. This parameter takes effect only for scaling groups that have simple scaling rules. Valid values: 0 to 86400. Unit: seconds. During the cooldown time, Auto Scaling executes only scaling activities that are triggered by event-triggered tasks associated with CloudMonitor.</p>
     */
    @NameInMap("MaxSize")
    public Integer maxSize;

    /**
     * <p>The maximum number of ECS instances in the scaling group. When the number of ECS instances in the scaling group is greater than the value of the MaxSize parameter, Auto Scaling automatically removes ECS instances from the scaling group until the number of instances is equal to the value of the MaxSize parameter.</p>
     * <br>
     * <p>The value range of the MaxSize parameter varies based on the instance quota. You can go to [Quota Center](https://quotas.console.aliyun.com/products/ess/quotas) to check the quota of **instances that can be included in a scaling group**.</p>
     * <br>
     * <p>For example, if the quota of instances that can be included in a scaling group is 2000, the valid values of the MaxSize parameter range from 0 to 2000.</p>
     */
    @NameInMap("MinSize")
    public Integer minSize;

    /**
     * <p>The IDs of vSwitches.</p>
     * <br>
     * <p>This parameter takes effect only when the network type of the scaling group is virtual private cloud (VPC). The specified vSwitches and the scaling group must reside in the same VPC.</p>
     * <br>
     * <p>The vSwitches can reside in different zones. The vSwitches are sorted in ascending order. The first vSwitch specified by using the VSwitchIds parameter has the highest priority. If Auto Scaling fails to create ECS instances in the zone where the vSwitch that has the highest priority resides, Auto Scaling creates ECS instances in the zone where the vSwitch that has the next highest priority resides.</p>
     */
    @NameInMap("MultiAZPolicy")
    public String multiAZPolicy;

    /**
     * <p>The expected percentage of pay-as-you-go instances in the excess instances when the minimum number of pay-as-you-go instances reaches the requirement. Valid values: 0 to 100.</p>
     * <br>
     * <p>If you set the `MultiAZPolicy` parameter to `COMPOSABLE` Policy, the default value is 100.</p>
     */
    @NameInMap("OnDemandBaseCapacity")
    public Integer onDemandBaseCapacity;

    /**
     * <p>Specifies whether to supplement preemptible instances. If this parameter is set to true, Auto Scaling creates an instance to replace a preemptible instance when Auto Scaling receives the system message that the preemptible instance is to be reclaimed.</p>
     */
    @NameInMap("OnDemandPercentageAboveBaseCapacity")
    public Integer onDemandPercentageAboveBaseCapacity;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The policy that is used to remove ECS instances from the scaling group. Valid values:</p>
     * <br>
     * <p>*   OldestInstance: removes ECS instances that are added at the earliest point in time to the scaling group.</p>
     * <p>*   NewestInstance: removes ECS instances that are most recently added to the scaling group.</p>
     * <p>*   OldestScalingConfiguration: removes ECS instances that are created based on the earliest scaling configuration.</p>
     */
    @NameInMap("RemovalPolicies")
    public java.util.List<String> removalPolicies;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The name of the scaling group. The name of each scaling group must be unique in a region. The name must be 2 to 64 characters in length and can contain letters, digits, underscores (\_), hyphens (-), and periods (.). The name must start with a letter or a digit.</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    /**
     * <p>The minimum number of ECS instances in the scaling group. When the number of ECS instances in the scaling group is less than the value of the MinSize parameter, Auto Scaling automatically creates ECS instances and adds the instances to the scaling group until the number of instances is equal to the value of the MinSize parameter.</p>
     * <br>
     * <p>> The value of the MinSize parameter must be less than or equal to the value of the MaxSize parameter.</p>
     */
    @NameInMap("ScalingGroupName")
    public String scalingGroupName;

    /**
     * <p>The ARN of the custom scaling policy (Function). This parameter takes effect only when you specify CustomPolicy as the first step of the instance removal policy.</p>
     */
    @NameInMap("SpotAllocationStrategy")
    public String spotAllocationStrategy;

    /**
     * <p>The expected number of ECS instances in the scaling group. Auto Scaling automatically maintains the specified expected number of ECS instances. The expected number cannot be greater than the value of the MaxSize parameter and cannot be less than the value of the MinSize parameter.</p>
     */
    @NameInMap("SpotInstancePools")
    public Integer spotInstancePools;

    /**
     * <p>Specifies whether to automatically create pay-as-you-go instances to meet the requirements on the number of ECS instances in the scaling group when the number of preemptible instances cannot be reached due to reasons such as costs and insufficient resources. This parameter takes effect only if you set the MultiAZPolicy parameter in the CreateScalingGroup operation to COST_OPTIMIZED. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("SpotInstanceRemedy")
    public Boolean spotInstanceRemedy;

    /**
     * <p>The IDs of vSwitches.</p>
     * <br>
     * <p>This parameter takes effect only when the network type of the scaling group is VPC. The specified vSwitches and the scaling group must reside in the same VPC.</p>
     * <br>
     * <p>The vSwitches can reside in different zones. The vSwitches are sorted in ascending order. The first vSwitch specified by using the VSwitchIds parameter has the highest priority. If Auto Scaling fails to create ECS instances in the zone where the vSwitch that has the highest priority resides, Auto Scaling creates ECS instances in the zone where the vSwitch that has the next highest priority resides.</p>
     */
    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    public static ModifyScalingGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyScalingGroupRequest self = new ModifyScalingGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyScalingGroupRequest setActiveScalingConfigurationId(String activeScalingConfigurationId) {
        this.activeScalingConfigurationId = activeScalingConfigurationId;
        return this;
    }
    public String getActiveScalingConfigurationId() {
        return this.activeScalingConfigurationId;
    }

    public ModifyScalingGroupRequest setAllocationStrategy(String allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
        return this;
    }
    public String getAllocationStrategy() {
        return this.allocationStrategy;
    }

    public ModifyScalingGroupRequest setAzBalance(Boolean azBalance) {
        this.azBalance = azBalance;
        return this;
    }
    public Boolean getAzBalance() {
        return this.azBalance;
    }

    public ModifyScalingGroupRequest setCompensateWithOnDemand(Boolean compensateWithOnDemand) {
        this.compensateWithOnDemand = compensateWithOnDemand;
        return this;
    }
    public Boolean getCompensateWithOnDemand() {
        return this.compensateWithOnDemand;
    }

    public ModifyScalingGroupRequest setCustomPolicyARN(String customPolicyARN) {
        this.customPolicyARN = customPolicyARN;
        return this;
    }
    public String getCustomPolicyARN() {
        return this.customPolicyARN;
    }

    public ModifyScalingGroupRequest setDefaultCooldown(Integer defaultCooldown) {
        this.defaultCooldown = defaultCooldown;
        return this;
    }
    public Integer getDefaultCooldown() {
        return this.defaultCooldown;
    }

    public ModifyScalingGroupRequest setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
        return this;
    }
    public Integer getDesiredCapacity() {
        return this.desiredCapacity;
    }

    public ModifyScalingGroupRequest setGroupDeletionProtection(Boolean groupDeletionProtection) {
        this.groupDeletionProtection = groupDeletionProtection;
        return this;
    }
    public Boolean getGroupDeletionProtection() {
        return this.groupDeletionProtection;
    }

    public ModifyScalingGroupRequest setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
        return this;
    }
    public String getHealthCheckType() {
        return this.healthCheckType;
    }

    public ModifyScalingGroupRequest setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    public ModifyScalingGroupRequest setLaunchTemplateOverrides(java.util.List<ModifyScalingGroupRequestLaunchTemplateOverrides> launchTemplateOverrides) {
        this.launchTemplateOverrides = launchTemplateOverrides;
        return this;
    }
    public java.util.List<ModifyScalingGroupRequestLaunchTemplateOverrides> getLaunchTemplateOverrides() {
        return this.launchTemplateOverrides;
    }

    public ModifyScalingGroupRequest setLaunchTemplateVersion(String launchTemplateVersion) {
        this.launchTemplateVersion = launchTemplateVersion;
        return this;
    }
    public String getLaunchTemplateVersion() {
        return this.launchTemplateVersion;
    }

    public ModifyScalingGroupRequest setMaxInstanceLifetime(Integer maxInstanceLifetime) {
        this.maxInstanceLifetime = maxInstanceLifetime;
        return this;
    }
    public Integer getMaxInstanceLifetime() {
        return this.maxInstanceLifetime;
    }

    public ModifyScalingGroupRequest setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }
    public Integer getMaxSize() {
        return this.maxSize;
    }

    public ModifyScalingGroupRequest setMinSize(Integer minSize) {
        this.minSize = minSize;
        return this;
    }
    public Integer getMinSize() {
        return this.minSize;
    }

    public ModifyScalingGroupRequest setMultiAZPolicy(String multiAZPolicy) {
        this.multiAZPolicy = multiAZPolicy;
        return this;
    }
    public String getMultiAZPolicy() {
        return this.multiAZPolicy;
    }

    public ModifyScalingGroupRequest setOnDemandBaseCapacity(Integer onDemandBaseCapacity) {
        this.onDemandBaseCapacity = onDemandBaseCapacity;
        return this;
    }
    public Integer getOnDemandBaseCapacity() {
        return this.onDemandBaseCapacity;
    }

    public ModifyScalingGroupRequest setOnDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
        this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
        return this;
    }
    public Integer getOnDemandPercentageAboveBaseCapacity() {
        return this.onDemandPercentageAboveBaseCapacity;
    }

    public ModifyScalingGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyScalingGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyScalingGroupRequest setRemovalPolicies(java.util.List<String> removalPolicies) {
        this.removalPolicies = removalPolicies;
        return this;
    }
    public java.util.List<String> getRemovalPolicies() {
        return this.removalPolicies;
    }

    public ModifyScalingGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyScalingGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyScalingGroupRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public ModifyScalingGroupRequest setScalingGroupName(String scalingGroupName) {
        this.scalingGroupName = scalingGroupName;
        return this;
    }
    public String getScalingGroupName() {
        return this.scalingGroupName;
    }

    public ModifyScalingGroupRequest setSpotAllocationStrategy(String spotAllocationStrategy) {
        this.spotAllocationStrategy = spotAllocationStrategy;
        return this;
    }
    public String getSpotAllocationStrategy() {
        return this.spotAllocationStrategy;
    }

    public ModifyScalingGroupRequest setSpotInstancePools(Integer spotInstancePools) {
        this.spotInstancePools = spotInstancePools;
        return this;
    }
    public Integer getSpotInstancePools() {
        return this.spotInstancePools;
    }

    public ModifyScalingGroupRequest setSpotInstanceRemedy(Boolean spotInstanceRemedy) {
        this.spotInstanceRemedy = spotInstanceRemedy;
        return this;
    }
    public Boolean getSpotInstanceRemedy() {
        return this.spotInstanceRemedy;
    }

    public ModifyScalingGroupRequest setVSwitchIds(java.util.List<String> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    public static class ModifyScalingGroupRequestLaunchTemplateOverrides extends TeaModel {
        /**
         * <p>The weight of the instance type. The weight specifies the capacity of a single instance of the specified instance type in the scaling group. If you want Auto Scaling to scale instances in the scaling group based on the weighted capacity of instances, you must specify the WeightedCapacity parameter after you specify the InstanceType parameter.</p>
         * <br>
         * <p>A higher weight specifies that a smaller number of instances of the specified instance type are required to meet the expected capacity.</p>
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
         * <p>> The capacity of the scaling group cannot exceed the sum of the maximum number of instances that is specified by the MaxSize parameter and the maximum weight of the instance type.</p>
         * <br>
         * <p>Valid values of the WeightedCapacity parameter: 1 to 500.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        /**
         * <p>The maximum life span of the instance in the scaling group. Unit: seconds.</p>
         * <br>
         * <p>Valid values: 86400 to Integer.maxValue. ``You can also set this parameter to 0. A value of 0 indicates that the instance has an unlimited life span in the scaling group.</p>
         * <br>
         * <p>Default value: null.</p>
         * <br>
         * <p>> You cannot specify this parameter for scaling groups that manage elastic container instances or scaling groups whose ScalingPolicy is set to recycle.</p>
         */
        @NameInMap("WeightedCapacity")
        public Integer weightedCapacity;

        public static ModifyScalingGroupRequestLaunchTemplateOverrides build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingGroupRequestLaunchTemplateOverrides self = new ModifyScalingGroupRequestLaunchTemplateOverrides();
            return TeaModel.build(map, self);
        }

        public ModifyScalingGroupRequestLaunchTemplateOverrides setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ModifyScalingGroupRequestLaunchTemplateOverrides setSpotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public ModifyScalingGroupRequestLaunchTemplateOverrides setWeightedCapacity(Integer weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public Integer getWeightedCapacity() {
            return this.weightedCapacity;
        }

    }

}
