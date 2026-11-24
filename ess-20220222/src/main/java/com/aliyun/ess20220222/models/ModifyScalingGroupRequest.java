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
     * <p>The capacity allocation policy, which determines how the scaling group selects available instance types to meet the capacity requirements. The capacity distribution policy applies to both pay-as-you-go and spot capacities. This parameter takes effect only when the MultiAZPolicy parameter is set to COMPOSABLE. Valid values:                              </p>
     * <ul>
     * <li><p>priority: creates instances in the order of the configured instance types.</p>
     * </li>
     * <li><p>lowestPrice: creates instances in ascending order of the vCPU unit price of the instance types.</p>
     * </li>
     * </ul>
     * <p>Default value: priority.</p>
     * 
     * <strong>example:</strong>
     * <p>priority</p>
     */
    @NameInMap("AllocationStrategy")
    public String allocationStrategy;

    /**
     * <p>Specifies whether to enable automatic balancing for the scaling group. This parameter takes effect only when BalancedOnly is enabled for a zone-balanced scaling group. Valid values:</p>
     * <ul>
     * <li>false: disables automatic balancing for the scaling group.</li>
     * <li>true: enables automatic balancing for the scaling group. The scaling group automatically detects the capacity across zones. If the capacity is unbalanced across zones, the scaling group proactively scales across zones to rebalance the capacity.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRebalance")
    public Boolean autoRebalance;

    /**
     * <p>Specifies whether the capacity of the scaling group is evenly distributed across multiple zones. This parameter takes effect only when the MultiAZPolicy parameter is set to COMPOSABLE. Valid values:</p>
     * <ul>
     * <li>true: The capacity of the scaling group is evenly distributed across multiple zones.</li>
     * <li>false: The capacity of the scaling group is not evenly distributed across multiple zones.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AzBalance")
    public Boolean azBalance;

    /**
     * <p>The zone balancing mode. This parameter takes effect only when the zone balancing mode is enabled. Valid values:</p>
     * <ul>
     * <li><p>BalancedBestEffort: If resource creation fails in a zone, the system degrades to other zones to ensure best-effort delivery of resources.</p>
     * </li>
     * <li><p>BalancedOnly: If resource creation fails in a zone, the system does not degrade to other zones. The scale-out activity partially succeeds to avoid excessive imbalance of resources across different zones.</p>
     * </li>
     * </ul>
     * <p>Default value: BalancedBestEffort.</p>
     * 
     * <strong>example:</strong>
     * <p>BalancedBestEffort</p>
     */
    @NameInMap("BalanceMode")
    public String balanceMode;

    /**
     * <p>The capacity options.</p>
     */
    @NameInMap("CapacityOptions")
    public ModifyScalingGroupRequestCapacityOptions capacityOptions;

    /**
     * <p>Specifies whether to automatically attempt to create pay-as-you-go instances to meet the required number of ECS instances if sufficient spot instances cannot be created due to price or inventory reasons when the MultiAZPolicy parameter of the CreateScalingGroup operation is set to COST_OPTIMIZED. Valid values:</p>
     * <ul>
     * <li><p>true: allows the creation of pay-as-you-go instances.</p>
     * </li>
     * <li><p>false: does not allow the creation of pay-as-you-go instances.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CompensateWithOnDemand")
    public Boolean compensateWithOnDemand;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the Function Compute function for the custom scale-in policy. This parameter takes effect only when the first removal policy configured in RemovalPolicies is CustomPolicy.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:fc:cn-zhangjiakou:16145688****:services/ess_custom_terminate_policy.LATEST/functions/ess_custom_terminate_policy_name</p>
     */
    @NameInMap("CustomPolicyARN")
    public String customPolicyARN;

    /**
     * <p>The default cooldown time of the scaling group. This parameter applies only to simple scaling rules. Valid values: 0 to 86400. Unit: seconds.</p>
     * <p>During the cooldown time, the scaling group does not execute any other scaling activities. This applies only to scaling activities triggered by CloudMonitor event-triggered tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("DefaultCooldown")
    public Integer defaultCooldown;

    /**
     * <p>The expected number of ECS instances or elastic container instances in the scaling group. The scaling group automatically maintains the number of ECS instances or elastic container instances at the expected number. Valid values: MinSize to MaxSize.</p>
     * <blockquote>
     * <p>If the expected number of instances feature is disabled and then re-enabled, you must reset the DesiredCapacity value.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("DesiredCapacity")
    public Integer desiredCapacity;

    /**
     * <p>Specifies whether to disable the expected number of instances feature for the scaling group. Valid values:</p>
     * <ul>
     * <li>false: enables the expected number of instances feature.</li>
     * <li>true: disables the expected number of instances feature.</li>
     * </ul>
     * <blockquote>
     * <p>You can change the Settings of this parameter to true (that is, shutdown the expected number of instances feature) only when no scaling activity is in progress in the scaling group. When you shutdown the expected number of instances feature, the current DesiredCapacity property of the scaling group is cleared, but the current number of instances in the scaling group remains unchanged.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisableDesiredCapacity")
    public Boolean disableDesiredCapacity;

    /**
     * <p>Specifies whether to enable deletion protection for the scaling group. Valid values:</p>
     * <ul>
     * <li>true: enables deletion protection for the scaling group. In this case, the scaling group cannot be deleted.</li>
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
     * <li>NONE: disables health checks.</li>
     * <li>ECS: performs health checks on instances in the scaling group. This value applies to both ECS and elastic container instance scaling groups.</li>
     * <li>LOAD_BALANCER: determines the health status of instances based on the health check results of load balancing. Classic Load Balancer (CLB) is not supported.
     * Default value: ECS.</li>
     * </ul>
     * <blockquote>
     * <p>To enable both instance health checks and load balancer health checks, use the HealthCheckTypes parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("HealthCheckType")
    public String healthCheckType;

    /**
     * <p>The health check modes of the scaling group.</p>
     * <blockquote>
     * <p>You can use this parameter to specify multiple values to enable multiple health check options. If the HealthCheckType parameter is configured, this parameter is ignored.</p>
     * </blockquote>
     */
    @NameInMap("HealthCheckTypes")
    public java.util.List<String> healthCheckTypes;

    /**
     * <p>The ID of the instance launch template, which is used to specify that the scaling group obtains launch configuration information from the instance launch template.</p>
     * 
     * <strong>example:</strong>
     * <p>lt-m5e3ofjr1zn1aw7****</p>
     */
    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    /**
     * <p>The extended instance type information of the launch template.</p>
     */
    @NameInMap("LaunchTemplateOverrides")
    public java.util.List<ModifyScalingGroupRequestLaunchTemplateOverrides> launchTemplateOverrides;

    /**
     * <p>The version of the instance launch template. Valid values:</p>
     * <ul>
     * <li>A specific template version number.</li>
     * <li>Default: always uses the default version of the template.</li>
     * <li>Latest: always uses the latest version of the template.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("LaunchTemplateVersion")
    public String launchTemplateVersion;

    /**
     * <p>The maximum lifetime of an instance in the scaling group. Unit: seconds.</p>
     * <p>Valid values: 0 or [86400, Integer.maxValue]. A value of 0 indicates that the configured value of MaxInstanceLifetime is cleared (that is, MaxInstanceLifetime is not configured).</p>
     * <p>Default value: null.</p>
     * <blockquote>
     * <p>This parameter cannot be configured for scaling groups of the elastic container instance type or scaling groups that have the no fees for stopped instances feature enabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("MaxInstanceLifetime")
    public Integer maxInstanceLifetime;

    /**
     * <p>The maximum number of ECS instances or elastic container instances in the scaling group. If the number of ECS instances or elastic container instances in the scaling group exceeds the value of MaxSize, Auto Scaling automatically removes ECS instances or elastic container instances.</p>
     * <p>&lt;props=&quot;china&quot;&gt;The value range of MaxSize varies based on the usage of Auto Scaling. Go to the <a href="https://quotas.console.aliyun.com/products/ess/quotas">Quota Center</a> to view the quota value for the <strong>maximum number of instances in a single scaling group</strong>.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;The value range of MaxSize varies based on the usage of Auto Scaling. Go to the <a href="https://quotas.console.aliyun.com/products/ess/quotas">Quota Center</a> to view the quota value for the <strong>maximum number of instances in a single scaling group</strong>.</p>
     * <p>&lt;props=&quot;partner&quot;&gt;The value range of MaxSize varies based on the usage of Auto Scaling. Go to the Quota Center to view the quota value for the <strong>maximum number of instances in a single scaling group</strong>.</p>
     * <p>For example, if the quota value for the <strong>maximum number of instances in a single scaling group</strong> is 2000, the value range of MaxSize is 0 to 2000.</p>
     * 
     * <strong>example:</strong>
     * <p>99</p>
     */
    @NameInMap("MaxSize")
    public Integer maxSize;

    /**
     * <p>The minimum number of ECS instances or elastic container instances in the scaling group. If the number of ECS instances or elastic container instances in the scaling group is less than the value of MinSize, Auto Scaling initiates the automatic creation of ECS instances or elastic container instances.</p>
     * <blockquote>
     * <p>The value of MinSize must be less than or equal to the value of MaxSize.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinSize")
    public Integer minSize;

    /**
     * <p>The scaling policy for ECS instances in a multi-zone scaling group. Valid values:</p>
     * <ul>
     * <li><p>PRIORITY: scales the scaling group based on the priorities of vSwitches (VSwitchIds.N). Auto Scaling preferentially attempts to scale the scaling group in the zone where the vSwitch with the highest priority resides. If the scaling fails, Auto Scaling automatically attempts to scale the scaling group in the zone where the vSwitch with the next highest priority resides.</p>
     * </li>
     * <li><p>COST_OPTIMIZED: during scale-out, Auto Scaling attempts to create ECS instances in ascending order of vCPU unit price. During scale-in, Auto Scaling attempts to remove ECS instances in descending order of vCPU unit price. If the scaling configuration specifies multiple instance types that use the spot billing method, spot instances are preferentially created. You can use the CompensateWithOnDemand parameter to specify whether Auto Scaling automatically attempts to create pay-as-you-go instances when spot instances cannot be created.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>COST_OPTIMIZED takes effect only when the scaling configuration specifies multiple instance types or uses spot instances.</p>
     * </blockquote>
     * <ul>
     * <li><p>BALANCE: evenly allocate ECS instances across the active zones specified for the scaling group. If the instances are unevenly distributed across zones due to insufficient inventory, you can call the RebalanceInstance operation to balance the resources.</p>
     * </li>
     * <li><p>COMPOSABLE: a composite policy that allows you to combine the preceding scaling policies for ECS instances in a multi-zone scaling group based on your needs.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIORITY</p>
     */
    @NameInMap("MultiAZPolicy")
    public String multiAZPolicy;

    /**
     * <p>The minimum number of pay-as-you-go instances required in the scaling group. Valid values: 0 to 1000. If the number of pay-as-you-go instances is less than this value, pay-as-you-go instances are preferentially created.</p>
     * <p>Default value: 0 when the MultiAZPolicy parameter is set to COMPOSABLE.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("OnDemandBaseCapacity")
    public Integer onDemandBaseCapacity;

    /**
     * <p>The percentage of pay-as-you-go instances among the extra instances that exceed the minimum number of pay-as-you-go instances specified by OnDemandBaseCapacity. Valid values: 0 to 100.</p>
     * <p>Default value: 100 when the MultiAZPolicy parameter is set to COMPOSABLE.</p>
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
     * <p>The scale-in policy of the scaling group, which specifies the ECS instances to be removed. Valid values:</p>
     * <ul>
     * <li><p>OldestInstance: removes the ECS instances that were added to the scaling group at the earliest point in time.</p>
     * </li>
     * <li><p>NewestInstance: removes the ECS instances that were added to the scaling group at the latest point in time.</p>
     * </li>
     * <li><p>OldestScalingConfiguration: removes the ECS instances that were created by using the earliest scaling configuration.</p>
     * </li>
     * </ul>
     */
    @NameInMap("RemovalPolicies")
    public java.util.List<String> removalPolicies;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the scaling group to be modified.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp1ffogfdauy0jw0****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    /**
     * <p>The name of the scaling group. The name must be unique within a region. The name must be 2 to 64 characters in length and start with a letter, digit, or Chinese character. It can contain digits, underscores (_), hyphens (-), and periods (.).</p>
     * 
     * <strong>example:</strong>
     * <p>scalinggroup****</p>
     */
    @NameInMap("ScalingGroupName")
    public String scalingGroupName;

    /**
     * <p>The revoke pattern of the scaling group. Valid values: </p>
     * <ul>
     * <li><p>recycle: The revoke pattern of the scaling group is shutdown and revoke pattern.  </p>
     * </li>
     * <li><p>release: The revoke pattern of the scaling group is release pattern.</p>
     * </li>
     * <li><p>forcerelease: The revoke pattern of the scaling group is forcible release pattern.</p>
     * <blockquote>
     * <p>If you select forcerelease, the system forcibly releases instances in the Running state during scale-down activities. Forcibly releasing an instance is equivalent to a power-off operation, which erases temporary data in the memory and storage of the instance. The data cannot be recovered. Proceed with caution.</p>
     * </blockquote>
     * </li>
     * <li><p>forcerecycle: The revoke pattern of the scaling group is forcible shutdown and revoke pattern.</p>
     * <blockquote>
     * <p>If you select forcerecycle, the system forcibly shuts down instances in the Running state during scale-down activities. Forcible shutdown is equivalent to a power-off operation, which erases temporary data in the memory and storage of the instance. The data cannot be recovered. Proceed with caution.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <p>The ScalingPolicy parameter specifies the revoke pattern of the scaling group. However, the specific action when an instance is removed from the scaling group is determined by the RemovePolicy parameter of the RemoveInstances operation. For more information, see <a href="https://help.aliyun.com/document_detail/25955.html">RemoveInstances</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>recycle</p>
     */
    @NameInMap("ScalingPolicy")
    public String scalingPolicy;

    /**
     * <p>The spot capacity distribution policy. You can use this parameter to separately specify the distribution policy for spot capacity. This parameter takes effect only when the MultiAZPolicy parameter is set to COMPOSABLE. Valid values:</p>
     * <ul>
     * <li>priority: creates instances in the order of the configured instance types.</li>
     * <li>lowestPrice: creates instances in ascending order of the vCPU unit price of the instance types.</li>
     * </ul>
     * <p>Default value: priority.</p>
     * 
     * <strong>example:</strong>
     * <p>lowestPrice</p>
     */
    @NameInMap("SpotAllocationStrategy")
    public String spotAllocationStrategy;

    /**
     * <p>The number of available instance types. The scaling group evenly creates spot instances across multiple instance types with the lowest cost. Valid values: 0 to 10.</p>
     * <p>Default value: 2 when the MultiAZPolicy parameter is set to COMPOSABLE.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("SpotInstancePools")
    public Integer spotInstancePools;

    /**
     * <p>Specifies whether to enable the spot instance replenishment feature. After this feature is enabled, when the scaling group receives a system message indicating that a spot instance will be reclaimed, the scaling group attempts to create a new instance to replace the spot instance to be reclaimed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SpotInstanceRemedy")
    public Boolean spotInstanceRemedy;

    /**
     * <p>The timeout period for waiting for an ECS instance to be successfully stopped during the scale-in flow. Unit: seconds.
     * Valid values: 30 to 240.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter takes effect only in the scale-in flow when ScalingPolicy is set to the release pattern.  </li>
     * <li>If the Settings of this parameter are configured, the system waits for a maximum of the StopInstanceTimeout period for the instance to be successfully stopped. After the timeout period elapses, the scale-in flow continues regardless of whether the instance is successfully stopped.  </li>
     * <li>If the Settings of this parameter are not configured, the system waits for a long time for the instance to be successfully stopped. The scale-in flow continues only after the instance is successfully stopped. If the instance stop has failed, the scale-in flow will rollback and the scale-in has failed.</li>
     * <li>A value of 0 indicates that the parameter settings of this parameter are canceled.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("StopInstanceTimeout")
    public Integer stopInstanceTimeout;

    /**
     * <p>The IDs of one or more vSwitches.</p>
     * <p>This parameter takes effect only when the network type of the scaling group is VPC. The VPC to which the specified vSwitches belong must be the same as the VPC to which the scaling group belongs.</p>
     * <p>The vSwitches can reside in different zones. The priorities of vSwitches are sorted in ascending order of numbers. 1 indicates the highest priority. If ECS instances cannot be created in the zone where the vSwitch with a higher priority resides, the vSwitch with the next highest priority is automatically selected to create ECS instances.</p>
     */
    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    /**
     * <p>The behavior policy of the scaling group during zone shift.</p>
     */
    @NameInMap("ZoneShiftPolicy")
    public ModifyScalingGroupRequestZoneShiftPolicy zoneShiftPolicy;

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

    public ModifyScalingGroupRequest setAutoRebalance(Boolean autoRebalance) {
        this.autoRebalance = autoRebalance;
        return this;
    }
    public Boolean getAutoRebalance() {
        return this.autoRebalance;
    }

    public ModifyScalingGroupRequest setAzBalance(Boolean azBalance) {
        this.azBalance = azBalance;
        return this;
    }
    public Boolean getAzBalance() {
        return this.azBalance;
    }

    public ModifyScalingGroupRequest setBalanceMode(String balanceMode) {
        this.balanceMode = balanceMode;
        return this;
    }
    public String getBalanceMode() {
        return this.balanceMode;
    }

    public ModifyScalingGroupRequest setCapacityOptions(ModifyScalingGroupRequestCapacityOptions capacityOptions) {
        this.capacityOptions = capacityOptions;
        return this;
    }
    public ModifyScalingGroupRequestCapacityOptions getCapacityOptions() {
        return this.capacityOptions;
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

    public ModifyScalingGroupRequest setStopInstanceTimeout(Integer stopInstanceTimeout) {
        this.stopInstanceTimeout = stopInstanceTimeout;
        return this;
    }
    public Integer getStopInstanceTimeout() {
        return this.stopInstanceTimeout;
    }

    public ModifyScalingGroupRequest setVSwitchIds(java.util.List<String> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    public ModifyScalingGroupRequest setZoneShiftPolicy(ModifyScalingGroupRequestZoneShiftPolicy zoneShiftPolicy) {
        this.zoneShiftPolicy = zoneShiftPolicy;
        return this;
    }
    public ModifyScalingGroupRequestZoneShiftPolicy getZoneShiftPolicy() {
        return this.zoneShiftPolicy;
    }

    public static class ModifyScalingGroupRequestCapacityOptions extends TeaModel {
        /**
         * <p>Specifies whether to automatically attempt to create pay-as-you-go instances to meet the required number of ECS instances if sufficient spot instances cannot be created due to price or inventory reasons when the MultiAZPolicy parameter of the CreateScalingGroup operation is set to COST_OPTIMIZED. Valid values:</p>
         * <ul>
         * <li>true: allows the creation of pay-as-you-go instances.</li>
         * <li>false: does not allow the creation of pay-as-you-go instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CompensateWithOnDemand")
        public Boolean compensateWithOnDemand;

        /**
         * <p>The minimum number of pay-as-you-go instances required in the scaling group. If the number of pay-as-you-go instances in the scaling group is less than this value, the system preferentially creates pay-as-you-go instances. Valid values: 0 to 1000.</p>
         * <p>Default value: 0 when the MultiAZPolicy parameter is set to COMPOSABLE.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("OnDemandBaseCapacity")
        public Integer onDemandBaseCapacity;

        /**
         * <p>The percentage of pay-as-you-go instances among the extra instances that exceed the minimum number of pay-as-you-go instances specified by OnDemandBaseCapacity. Valid values: 0 to 100.</p>
         * <p>Default value: 100 when the MultiAZPolicy parameter is set to COMPOSABLE.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("OnDemandPercentageAboveBaseCapacity")
        public Integer onDemandPercentageAboveBaseCapacity;

        /**
         * <p>The price comparison mode for the cost optimization policy of the scaling group. Valid values:</p>
         * <ul>
         * <li><p>PricePerUnit: compares prices based on the price per unit of capacity.</p>
         * <p>The capacity of an instance in the scaling group equals the weight configured for the instance type. The default weight is 1, which means one ECS instance occupies a capacity of 1.</p>
         * </li>
         * <li><p>PricePerVCpu: compares prices based on the price per vCPU.</p>
         * </li>
         * </ul>
         * <p>Default value: PricePerUnit.</p>
         * 
         * <strong>example:</strong>
         * <p>PricePerUnit</p>
         */
        @NameInMap("PriceComparisonMode")
        public String priceComparisonMode;

        /**
         * <p>Specifies whether to attempt to use spot instances to replace pay-as-you-go capacity when the percentage of pay-as-you-go instances exceeds the OnDemandPercentageAboveBaseCapacity value after CompensateWithOnDemand is enabled. In common scenarios where CompensateWithOnDemand downgrades spot instances to pay-as-you-go instances due to spot inventory or price reasons, this feature attempts to use spot instances to replace the excess pay-as-you-go capacity to avoid long-term retention of pay-as-you-go instances. Valid values:</p>
         * <ul>
         * <li>true: allows the replacement.</li>
         * <li>false: does not allow the replacement.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SpotAutoReplaceOnDemand")
        public Boolean spotAutoReplaceOnDemand;

        public static ModifyScalingGroupRequestCapacityOptions build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingGroupRequestCapacityOptions self = new ModifyScalingGroupRequestCapacityOptions();
            return TeaModel.build(map, self);
        }

        public ModifyScalingGroupRequestCapacityOptions setCompensateWithOnDemand(Boolean compensateWithOnDemand) {
            this.compensateWithOnDemand = compensateWithOnDemand;
            return this;
        }
        public Boolean getCompensateWithOnDemand() {
            return this.compensateWithOnDemand;
        }

        public ModifyScalingGroupRequestCapacityOptions setOnDemandBaseCapacity(Integer onDemandBaseCapacity) {
            this.onDemandBaseCapacity = onDemandBaseCapacity;
            return this;
        }
        public Integer getOnDemandBaseCapacity() {
            return this.onDemandBaseCapacity;
        }

        public ModifyScalingGroupRequestCapacityOptions setOnDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
            this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
            return this;
        }
        public Integer getOnDemandPercentageAboveBaseCapacity() {
            return this.onDemandPercentageAboveBaseCapacity;
        }

        public ModifyScalingGroupRequestCapacityOptions setPriceComparisonMode(String priceComparisonMode) {
            this.priceComparisonMode = priceComparisonMode;
            return this;
        }
        public String getPriceComparisonMode() {
            return this.priceComparisonMode;
        }

        public ModifyScalingGroupRequestCapacityOptions setSpotAutoReplaceOnDemand(Boolean spotAutoReplaceOnDemand) {
            this.spotAutoReplaceOnDemand = spotAutoReplaceOnDemand;
            return this;
        }
        public Boolean getSpotAutoReplaceOnDemand() {
            return this.spotAutoReplaceOnDemand;
        }

    }

    public static class ModifyScalingGroupRequestLaunchTemplateOverrides extends TeaModel {
        /**
         * <p>When you need the scaling group to scale based on the instance type capacity, specify both this parameter and LaunchTemplateOverrides.WeightedCapacity.</p>
         * <p>This parameter is used to specify the instance type and overrides the instance type in the launch template.</p>
         * <blockquote>
         * <p>This parameter takes effect only when the LaunchTemplateId parameter is specified.</p>
         * </blockquote>
         * <p>Valid values of InstanceType: available ECS instance types.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c5.xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>This parameter is used to specify the maximum hourly price for the instance type that overrides the launch template (that is, LaunchTemplateOverride.N.InstanceType). You can specify N values for this parameter to extend the launch template to support N instance types. Valid values of N: 1 to 20.</p>
         * <blockquote>
         * <p>This parameter takes effect only when the LaunchTemplateId parameter is specified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.025</p>
         */
        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        /**
         * <p>When you need the scaling group to scale based on the instance type capacity, specify this parameter after you specify LaunchTemplateOverrides.InstanceType. The two parameters correspond to each other.</p>
         * <p>This parameter is used to specify the weight of the instance type, which indicates the capacity that a single instance of the instance type represents in the scaling group.</p>
         * <p>A greater weight indicates that fewer instances of this instance type are required to meet the expected capacity.</p>
         * <p>Because performance metrics such as the number of vCPUs and memory size vary with instance types, you can configure different weights for different instance types based on your needs.</p>
         * <p>Example:</p>
         * <ul>
         * <li><p>Current capacity: 0.</p>
         * </li>
         * <li><p>Expected capacity: 6.</p>
         * </li>
         * <li><p>Capacity of the ecs.c5.xlarge instance type: 4.</p>
         * </li>
         * </ul>
         * <p>To meet the expected capacity, the scaling group scales out two ecs.c5.xlarge instances.</p>
         * <blockquote>
         * <p>During scale-out, the capacity of the scaling group cannot exceed the sum of the maximum capacity (MaxSize) and the maximum weight of the instance type.</p>
         * </blockquote>
         * <p>Valid values of WeightedCapacity: 1 to 500.</p>
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

    public static class ModifyScalingGroupRequestZoneShiftPolicy extends TeaModel {
        /**
         * <p>The health check behavior in impaired zones. Valid values: </p>
         * <ul>
         * <li>ReplaceUnhealthy: normally replaces unhealthy instances in all zones. </li>
         * <li>IgnoreUnhealthy: does not replace unhealthy instances in impaired zones. Healthy zones are not affected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ReplaceUnhealthy</p>
         */
        @NameInMap("ImpairedZoneHealthCheckBehavior")
        public String impairedZoneHealthCheckBehavior;

        /**
         * <p>Blocks scale-in activities triggered by specified types of scaling rules. The blocking scope covers all zones under the scaling group, not just the impaired zones. This prevents false scale-in activities caused by fake improvements in monitoring metrics due to unreachable instances in impaired zones. Valid values: </p>
         * <ul>
         * <li>StepScalingRule: blocks scale-in activities triggered by step scaling rules. </li>
         * <li>TargetTrackingScalingRule: blocks scale-in activities triggered by target tracking scaling rules. </li>
         * <li>None: does not block any scale-in activities.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>StepScalingRule</p>
         */
        @NameInMap("ScaleInBlockedRuleTypes")
        public java.util.List<String> scaleInBlockedRuleTypes;

        /**
         * <p>Specifies whether scale-out creates instances only in healthy zones during zone shift. Valid values: </p>
         * <ul>
         * <li>true: creates instances only in healthy zones during scale-out and skips impaired zones. </li>
         * <li>false: does not restrict zones, and scale-out can create instances in any zone under the scaling group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ScaleOutInHealthyZonesOnly")
        public Boolean scaleOutInHealthyZonesOnly;

        public static ModifyScalingGroupRequestZoneShiftPolicy build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingGroupRequestZoneShiftPolicy self = new ModifyScalingGroupRequestZoneShiftPolicy();
            return TeaModel.build(map, self);
        }

        public ModifyScalingGroupRequestZoneShiftPolicy setImpairedZoneHealthCheckBehavior(String impairedZoneHealthCheckBehavior) {
            this.impairedZoneHealthCheckBehavior = impairedZoneHealthCheckBehavior;
            return this;
        }
        public String getImpairedZoneHealthCheckBehavior() {
            return this.impairedZoneHealthCheckBehavior;
        }

        public ModifyScalingGroupRequestZoneShiftPolicy setScaleInBlockedRuleTypes(java.util.List<String> scaleInBlockedRuleTypes) {
            this.scaleInBlockedRuleTypes = scaleInBlockedRuleTypes;
            return this;
        }
        public java.util.List<String> getScaleInBlockedRuleTypes() {
            return this.scaleInBlockedRuleTypes;
        }

        public ModifyScalingGroupRequestZoneShiftPolicy setScaleOutInHealthyZonesOnly(Boolean scaleOutInHealthyZonesOnly) {
            this.scaleOutInHealthyZonesOnly = scaleOutInHealthyZonesOnly;
            return this;
        }
        public Boolean getScaleOutInHealthyZonesOnly() {
            return this.scaleOutInHealthyZonesOnly;
        }

    }

}
