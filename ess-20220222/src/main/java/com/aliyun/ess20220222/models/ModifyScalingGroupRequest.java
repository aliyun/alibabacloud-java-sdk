// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ModifyScalingGroupRequest extends TeaModel {
    /**
     * <p>The ID of the active scaling configuration in the scaling group.</p>
     * 
     * <strong>example:</strong>
     * <p>asc-bp17pelvl720x5ub****</p>
     */
    @NameInMap("ActiveScalingConfigurationId")
    public String activeScalingConfigurationId;

    /**
     * <p>The allocation policy. Auto Scaling selects instance types based on the allocation policy to create the required number of instances. The policy can be applied to pay-as-you-go instances and preemptible instances at the same time. This parameter takes effect only when you set the MultiAZPolicy parameter to COMPOSABLE. Valid values:</p>
     * <ul>
     * <li>priority: Auto Scaling selects instance types based on the specified order to create the required number of instances.</li>
     * <li>lowestPrice: Auto Scaling selects instance types that have the lowest unit price of vCPUs to create the required number of instances.</li>
     * </ul>
     * <p>Default value: priority.</p>
     * 
     * <strong>example:</strong>
     * <p>priority</p>
     */
    @NameInMap("AllocationStrategy")
    public String allocationStrategy;

    /**
     * <p>Specifies whether to evenly distribute instances in the scaling group across zones. This parameter takes effect only when you set the <code>MultiAZPolicy</code> parameter to <code>COMPOSABLE</code>. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AzBalance")
    public Boolean azBalance;

    /**
     * <p>Specifies whether to automatically create pay-as-you-go instances to meet the requirements on the number of ECS instances in the scaling group when the number of preemptible instances cannot be reached due to reasons such as cost-related issues and insufficient resources. This parameter takes effect only if you set <code>MultiAZPolicy</code> in the <code>CreateScalingGroup</code> operation to <code>COST_OPTIMIZED</code>. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CompensateWithOnDemand")
    public Boolean compensateWithOnDemand;

    /**
     * <p>The ARN of the custom scaling policy (Function). This parameter takes effect only when you specify CustomPolicy as the first step of the instance removal policy.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:fc:cn-zhangjiakou:16145688****:services/ess_custom_terminate_policy.LATEST/functions/ess_custom_terminate_policy_name</p>
     */
    @NameInMap("CustomPolicyARN")
    public String customPolicyARN;

    /**
     * <p>The cooldown period of the scaling group. This parameter is available only if you set ScalingRuleType to SimpleScalingRule. Valid values: 0 to 86400. Unit: seconds.</p>
     * <p>During the cooldown period, Auto Scaling does not execute scaling activities that are triggered by CloudMonitor event-triggered tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("DefaultCooldown")
    public Integer defaultCooldown;

    /**
     * <p>The expected number of ECS instances or elastic container instances in the scaling group. Auto Scaling maintains the expected number of ECS instances or elastic container instances in the scaling group. Make sure that you adhere to the following rule when specifying this parameter: Value of MaxSize ≥ Value of DesiredCapacity ≥ Value of MinSize</p>
     * <blockquote>
     * <p> If you re-enable the Expected Number of Instances feature, you must specify a value for <code>DesiredCapacity</code> again.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("DesiredCapacity")
    public Integer desiredCapacity;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisableDesiredCapacity")
    public Boolean disableDesiredCapacity;

    /**
     * <p>Specifies whether to enable deletion protection for the scaling group. Valid values:</p>
     * <ul>
     * <li>true: enables deletion protection for the scaling group. This way, the scaling group cannot be deleted.</li>
     * <li>false: disables deletion protection for the scaling group.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("GroupDeletionProtection")
    public Boolean groupDeletionProtection;

    /**
     * <p>The health check mode of the scaling group. Valid values:</p>
     * <ul>
     * <li>NONE: Auto Scaling does not perform health checks.</li>
     * <li>ECS: Auto Scaling checks the health status of ECS instances in the scaling group.</li>
     * <li>ECI: Auto Scaling checks the health status of elastic container instances in the scaling group.</li>
     * <li>LOAD_BALANCER: Auto Scaling checks the health status of instances in the scaling group based on the health check results of load balancers. The health check results of Classic Load Balancer (CLB) instances are not supported as the health check basis for instances in the scaling group.</li>
     * </ul>
     * <blockquote>
     * <p> HealthCheckType has the same effect as <code>HealthCheckTypes</code>. You can select one of them to specify based on your business requirements. If you specify <code>HealthCheckTypes</code>, <code>HealthCheckType</code> is ignored. HealthCheckType is optional.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("HealthCheckType")
    public String healthCheckType;

    /**
     * <p>The health check modes of the scaling group. Valid values:</p>
     * <ul>
     * <li>NONE: Auto Scaling does not perform health checks.</li>
     * <li>ECS: Auto Scaling checks the health status of ECS instances in the scaling group.</li>
     * <li>ECI: Auto Scaling checks the health status of elastic container instances in the scaling group.</li>
     * <li>LOAD_BALANCER: Auto Scaling checks the health status of instances in the scaling group based on the health check results of load balancers. The health check results of CLB instances are not supported as the health check basis for instances in the scaling group.</li>
     * </ul>
     */
    @NameInMap("HealthCheckTypes")
    public java.util.List<String> healthCheckTypes;

    /**
     * <p>The ID of the launch template that is used by Auto Scaling to create instances.</p>
     * 
     * <strong>example:</strong>
     * <p>lt-m5e3ofjr1zn1aw7****</p>
     */
    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    /**
     * <p>Details of the instance types that are specified in the extended configurations of the launch template.</p>
     */
    @NameInMap("LaunchTemplateOverrides")
    public java.util.List<ModifyScalingGroupRequestLaunchTemplateOverrides> launchTemplateOverrides;

    /**
     * <p>The version number of the launch template. Valid values:</p>
     * <ul>
     * <li>A fixed template version number.</li>
     * <li>Default: The default template version is always used.</li>
     * <li>Latest: The latest template version is always used.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("LaunchTemplateVersion")
    public String launchTemplateVersion;

    /**
     * <p>The maximum life span of the instance in the scaling group. Unit: seconds.</p>
     * <p>Valid values: 86400 to Integer.maxValue. ``You can also set this parameter to 0. A value of 0 indicates that the instance has an unlimited life span in the scaling group.</p>
     * <p>Default value: null.</p>
     * <blockquote>
     * <p>You cannot specify this parameter for scaling groups that manage elastic container instances or scaling groups whose ScalingPolicy is set to recycle.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("MaxInstanceLifetime")
    public Integer maxInstanceLifetime;

    /**
     * <p>The maximum number of ECS instances or elastic container instances that can be contained in the scaling group. If the total number of instances in the scaling group is greater than the value of MaxSize, Auto Scaling proactively removes the surplus instances from the scaling group to restore the total number to match the maximum limit.</p>
     * <p>The value range of MaxSize is directly correlated with the degree of dependency your business has on Auto Scaling. You can go to <a href="https://quotas.console.aliyun.com/products/ess/quotas">Quota Center</a> to check <strong>the maximum number of instances that a single scaling group can contain.</strong></p>
     * <p>For example, if a scaling group can contain up to <strong>2,000</strong> instances, the value range of MaxSize is 0 to 2000.</p>
     * 
     * <strong>example:</strong>
     * <p>99</p>
     */
    @NameInMap("MaxSize")
    public Integer maxSize;

    /**
     * <p>The minimum number of ECS instances or elastic container instances that must be contained in the scaling group. If the total number of instances in the scaling group is less than the value of MinSize, Auto Scaling proactively adds instances to the scaling group to ensure that the total number aligns with the minimum threshold.</p>
     * <blockquote>
     * <p> The value of MinSize must be less than or equal to the value of MaxSize.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinSize")
    public Integer minSize;

    /**
     * <p>The scaling policy for the multi-zone scaling group that contains ECS instances. Valid values:</p>
     * <ul>
     * <li>PRIORITY: ECS instances are scaled based on the vSwitch priority. The first vSwitch specified by using the VSwitchIds parameter has the highest priority. Auto Scaling preferentially scales instances in the zone where the vSwitch that has the highest priority resides. If the scaling fails, Auto Scaling scales instances in the zone where the vSwitch that has the next highest priority resides.</li>
     * <li>COST_OPTIMIZED: During a scale-out activity, Auto Scaling preferentially creates ECS instances of the instance type that has the lowest unit price of vCPU. During a scale-in activity, Auto Scaling preferentially removes ECS instances of the instance types that have the highest unit price of vCPU. Auto Scaling preferentially creates preemptible instances when preemptible instance types are specified in the scaling configuration. You can use the <code>CompensateWithOnDemand</code> parameter to specify whether to automatically create pay-as-you-go instances when Auto Scaling fails to create preemptible instances.</li>
     * </ul>
     * <blockquote>
     * <p>The <code>COST_OPTIMIZED</code> setting takes effect only when multiple instance types are specified or at least one instance type is specified for preemptible instances.</p>
     * </blockquote>
     * <ul>
     * <li>BALANCE: ECS instances are evenly distributed across zones that are specified in the scaling group. If ECS instances are unevenly distributed among zones due to insufficient resources, you can call the RebalanceInstance operation to evenly distribute the instances among the zones.</li>
     * <li>COMPOSABLE: You can flexibly combine the preceding policies based on your business requirements.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIORITY</p>
     */
    @NameInMap("MultiAZPolicy")
    public String multiAZPolicy;

    /**
     * <p>The minimum number of pay-as-you-go instances that must be included in the scaling group. Valid values: 0 to 1000. If the number of pay-as-you-go instances is less than the value of this parameter, Auto Scaling preferentially creates pay-as-you-go instances.</p>
     * <p>If you set the <code>MultiAZPolicy</code> parameter to <code>COMPOSABLE</code> Policy, the default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("OnDemandBaseCapacity")
    public Integer onDemandBaseCapacity;

    /**
     * <p>The expected percentage of pay-as-you-go instances in the excess instances when the minimum number of pay-as-you-go instances reaches the requirement. Valid values: 0 to 100.</p>
     * <p>If you set the <code>MultiAZPolicy</code> parameter to <code>COMPOSABLE</code> Policy, the default value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("OnDemandPercentageAboveBaseCapacity")
    public Integer onDemandPercentageAboveBaseCapacity;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The policy that is used to remove ECS instances from the scaling group. Valid values:</p>
     * <ul>
     * <li>OldestInstance: removes ECS instances that are added at the earliest point in time to the scaling group.</li>
     * <li>NewestInstance: removes ECS instances that are most recently added to the scaling group.</li>
     * <li>OldestScalingConfiguration: removes ECS instances that are created based on the earliest scaling configuration.</li>
     * </ul>
     */
    @NameInMap("RemovalPolicies")
    public java.util.List<String> removalPolicies;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the scaling group that you want to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp1ffogfdauy0jw0****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    /**
     * <p>The name of the scaling group. The name of each scaling group must be unique in a region. The name must be 2 to 64 characters in length and can contain letters, digits, underscores (_), hyphens (-), and periods (.). The name must start with a letter or a digit.</p>
     * 
     * <strong>example:</strong>
     * <p>scalinggroup****</p>
     */
    @NameInMap("ScalingGroupName")
    public String scalingGroupName;

    /**
     * <p>The reclaim mode of the scaling group. Valid values:</p>
     * <ul>
     * <li><p>recycle: economical mode</p>
     * </li>
     * <li><p>release: release mode</p>
     * </li>
     * <li><p>forcerelease: forced release mode</p>
     * <p>**</p>
     * <p><strong>Note</strong> If you set the value to <code>forcerelease</code>, Auto Scaling forcibly releases instances that are in the <code>Running</code> state during scale-ins. Forced release is equivalent to power outage. If an instance is forcibly released, ephemeral data on the instance will be cleared and cannot be recovered. Exercise caution when you select this option.</p>
     * </li>
     * <li><p>forcerecycle: forced recycle mode</p>
     * <p>**</p>
     * <p><strong>Note</strong> If you set the value to <code>forcerecycle</code>, Auto Scaling forcibly shuts down instances that are in the <code>Running</code> state during scale-ins. Forced shutdown is equivalent to power outage. If an instance is forcibly shut down, ephemeral data on the instance will be cleared and cannot be recovered. Exercise caution when you select this option.</p>
     * </li>
     * </ul>
     * <p>ScalingPolicy specifies only the reclaim mode of the scaling group. RemovePolicy of the RemoveInstances operation specifies the manner how instances are removed from the scaling group. For more information, see <a href="https://help.aliyun.com/document_detail/25955.html">RemoveInstances</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>recycle</p>
     */
    @NameInMap("ScalingPolicy")
    public String scalingPolicy;

    /**
     * <p>The allocation policy of preemptible instances. You can use this parameter to individually specify the allocation policy of preemptible instances. This parameter takes effect only when you set the <code>MultiAZPolicy</code> parameter to <code>COMPOSABLE</code>. Valid values:</p>
     * <ul>
     * <li>priority: Auto Scaling selects instance types based on the specified order to create the required number of preemptible instances.</li>
     * <li>lowestPrice: Auto Scaling selects instance types that have the lowest unit price of vCPUs to create the required number of preemptible instances.</li>
     * </ul>
     * <p>Default value: priority.</p>
     * 
     * <strong>example:</strong>
     * <p>lowestPrice</p>
     */
    @NameInMap("SpotAllocationStrategy")
    public String spotAllocationStrategy;

    /**
     * <p>The number of instance types that you specify. Auto Scaling creates preemptible instances of multiple instance types that are provided at the lowest price. Valid values: 0 to 10.</p>
     * <p>If you set the <code>MultiAZPolicy</code> parameter to <code>COMPOSABLE</code> Policy, the default value is 2.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("SpotInstancePools")
    public Integer spotInstancePools;

    /**
     * <p>Specifies whether to supplement preemptible instances. If this parameter is set to true, Auto Scaling creates an instance to replace a preemptible instance when Auto Scaling receives the system message that the preemptible instance is to be reclaimed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SpotInstanceRemedy")
    public Boolean spotInstanceRemedy;

    /**
     * <p>The IDs of vSwitches.</p>
     * <p>This parameter takes effect only when the network type of the scaling group is virtual private cloud (VPC). The specified vSwitches and the scaling group must reside in the same VPC.</p>
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

    public ModifyScalingGroupRequest setDisableDesiredCapacity(Boolean disableDesiredCapacity) {
        this.disableDesiredCapacity = disableDesiredCapacity;
        return this;
    }
    public Boolean getDisableDesiredCapacity() {
        return this.disableDesiredCapacity;
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

    public ModifyScalingGroupRequest setHealthCheckTypes(java.util.List<String> healthCheckTypes) {
        this.healthCheckTypes = healthCheckTypes;
        return this;
    }
    public java.util.List<String> getHealthCheckTypes() {
        return this.healthCheckTypes;
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

    public ModifyScalingGroupRequest setScalingPolicy(String scalingPolicy) {
        this.scalingPolicy = scalingPolicy;
        return this;
    }
    public String getScalingPolicy() {
        return this.scalingPolicy;
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
         * <p>The instance type. The instance type that you specify by using the InstanceType parameter overwrites the instance type that is specified in the launch template.</p>
         * <p>If you want Auto Scaling to scale instances in the scaling group based on the instance type weight, you must specify both the InstanceType and WeightedCapacity parameters.</p>
         * <blockquote>
         * <p>This parameter takes effect only after you specify the LaunchTemplateId parameter.</p>
         * </blockquote>
         * <p>You can use the InstanceType parameter to specify only instance types that are available for purchase.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c5.xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <strong>example:</strong>
         * <p>0.025</p>
         */
        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        /**
         * <p>The weight of the instance type. The weight specifies the capacity of a single instance of the specified instance type in the scaling group. If you want Auto Scaling to scale instances in the scaling group based on the weighted capacity of instances, you must specify the WeightedCapacity parameter after you specify the InstanceType parameter.</p>
         * <p>A higher weight specifies that a smaller number of instances of the specified instance type are required to meet the expected capacity.</p>
         * <p>Performance metrics, such as the number of vCPUs and the memory size of each instance type, may vary. You can specify different weights for different instance types based on your business requirements.</p>
         * <p>Example:</p>
         * <ul>
         * <li>Current capacity: 0</li>
         * <li>Expected capacity: 6</li>
         * <li>Capacity of ecs.c5.xlarge: 4</li>
         * </ul>
         * <p>To meet the expected capacity requirement, Auto Scaling must create and add two ecs.c5.xlarge instances.</p>
         * <blockquote>
         * <p>The capacity of the scaling group cannot exceed the sum of the maximum number of instances that is specified by the MaxSize parameter and the maximum weight of the instance type.</p>
         * </blockquote>
         * <p>Valid values of the WeightedCapacity parameter: 1 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
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
