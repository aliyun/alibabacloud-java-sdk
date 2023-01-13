// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CreateScalingGroupRequest extends TeaModel {
    /**
     * <p>Details of the ALB server groups.</p>
     */
    @NameInMap("AlbServerGroups")
    public java.util.List<CreateScalingGroupRequestAlbServerGroups> albServerGroups;

    /**
     * <p>The allocation policy. Auto Scaling selects instance types based on the allocation policy to create the required number of instances. The policy can be applied to pay-as-you-go instances and preemptible instances at the same time. This parameter takes effect only when you set the `MultiAZPolicy` parameter to `COMPOSABLE`. Valid values:</p>
     * <br>
     * <p>*   priority: Auto Scaling selects instance types based on the specified order to create the required number of instances.</p>
     * <p>*   lowestPrice: Auto Scaling selects instance types that have the lowest unit price of vCPUs to create the required number of instances.</p>
     * <br>
     * <p>Default value: priority.</p>
     */
    @NameInMap("AllocationStrategy")
    public String allocationStrategy;

    /**
     * <p>Specifies whether to evenly distribute instances in the scaling group across zones. This parameter takes effect only when you set the `MultiAZPolicy` parameter to `COMPOSABLE`. Valid values:</p>
     * <br>
     * <p>*   true: evenly distributes instances in the scaling group across zones.</p>
     * <p>*   false: distributes instances in the scaling group across zones.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("AzBalance")
    public Boolean azBalance;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that the value is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25965~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to automatically create pay-as-you-go instances to meet the requirements on the number of ECS instances when the expected capacity of preemptible instances cannot be fulfilled due to reasons such as costs and insufficient resources. This parameter takes effect only when MultiAZPolicy is set to COST_OPTIMIZED. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>Default value: true.</p>
     */
    @NameInMap("CompensateWithOnDemand")
    public Boolean compensateWithOnDemand;

    /**
     * <p>The ID of the elastic container instance.</p>
     */
    @NameInMap("ContainerGroupId")
    public String containerGroupId;

    /**
     * <p>The ARN of the custom scaling policy (Function). This parameter takes effect only if you specify CustomPolicy as the first step of the instance removal policy.</p>
     */
    @NameInMap("CustomPolicyARN")
    public String customPolicyARN;

    /**
     * <p>The IDs of the ApsaraDB RDS instances. The value can be a JSON array that contains multiple ApsaraDB RDS instance IDs. Separate multiple IDs with commas (,).</p>
     * <br>
     * <p>You can associate only a limited number of ApsaraDB RDS instances with a scaling group. Go to [Quota Center](https://quotas.console.aliyun.com/products/ess/quotas) to check the quota of ApsaraDB RDS instances that can be associated with a scaling group.</p>
     */
    @NameInMap("DBInstanceIds")
    public String DBInstanceIds;

    /**
     * <p>The cooldown time of the scaling group after a scale-in or scale-out activity is executed. Valid values: 0 to 86400. Unit: seconds.</p>
     * <br>
     * <p>During the cooldown time, Auto Scaling executes only scaling activities that are triggered by event-triggered tasks associated with CloudMonitor.</p>
     * <br>
     * <p>Default value: 300.</p>
     */
    @NameInMap("DefaultCooldown")
    public Integer defaultCooldown;

    /**
     * <p>The expected number of ECS instances in the scaling group. Auto Scaling automatically maintains the expected number of ECS instances that you specify. The expected number cannot be greater than the value of the MaxSize parameter and cannot be less than the value of the MinSize parameter.</p>
     */
    @NameInMap("DesiredCapacity")
    public Integer desiredCapacity;

    /**
     * <p>Specifies whether to enable deletion protection for the scaling group. Valid values:</p>
     * <br>
     * <p>*   true: enables deletion protection for the scaling group. This way, the scaling group cannot be deleted.</p>
     * <p>*   false: disables deletion protection for the scaling group.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("GroupDeletionProtection")
    public Boolean groupDeletionProtection;

    /**
     * <p>The type of instances that are managed by the scaling group. Valid values:</p>
     * <br>
     * <p>*   ECS: ECS instances</p>
     * <p>*   ECI: elastic container instances</p>
     * <br>
     * <p>Default value: ECS.</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>The health check mode of the scaling group. Valid values:</p>
     * <br>
     * <p>*   NONE: Auto Scaling does not perform health checks on instances in the scaling group.</p>
     * <p>*   ECS: Auto Scaling performs health checks on ECS instances in the scaling group.</p>
     * <br>
     * <p>Default value: ECS.</p>
     */
    @NameInMap("HealthCheckType")
    public String healthCheckType;

    /**
     * <p>The ID of the ECS instance. Auto Scaling obtains configuration information based on the ECS instance and uses the information to create a scaling configuration.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the launch template that is used by Auto Scaling to create instances.</p>
     */
    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    /**
     * <p>Details of the instance types that are specified in the extended configurations of the launch template.</p>
     */
    @NameInMap("LaunchTemplateOverrides")
    public java.util.List<CreateScalingGroupRequestLaunchTemplateOverrides> launchTemplateOverrides;

    /**
     * <p>The version number of the launch template. Valid values:</p>
     * <br>
     * <p>*   A fixed template version number.</p>
     * <p>*   Default: The default template version is always used.</p>
     * <p>*   Latest: The latest template version is always used.</p>
     */
    @NameInMap("LaunchTemplateVersion")
    public String launchTemplateVersion;

    /**
     * <p>Details of the lifecycle hooks.</p>
     */
    @NameInMap("LifecycleHooks")
    public java.util.List<CreateScalingGroupRequestLifecycleHooks> lifecycleHooks;

    /**
     * <p>The IDs of CLB instances. The value can be a JSON array that contains multiple CLB instance IDs. Separate multiple IDs with commas (,).</p>
     * <br>
     * <p>You can associate only a limited number of CLB instances with a scaling group. Go to [Quota Center](https://quotas.console.aliyun.com/products/ess/quotas) to check the quota of CLB instances that can be associated with a scaling group.</p>
     */
    @NameInMap("LoadBalancerIds")
    public String loadBalancerIds;

    /**
     * <p>The maximum life span of the instance in the scaling group. Unit: seconds.</p>
     * <br>
     * <p>Valid values: 86400 to Integer.maxValue.</p>
     * <br>
     * <p>Default value: null.</p>
     */
    @NameInMap("MaxInstanceLifetime")
    public Integer maxInstanceLifetime;

    /**
     * <p>The maximum number of ECS instances in the scaling group. When the number of existing ECS instances in the scaling group is greater than the value of the MaxSize parameter, Auto Scaling automatically removes ECS instances from the scaling group until the number of instances is equal to the value of the MaxSize parameter.</p>
     * <br>
     * <p>The value range of the MaxSize parameter varies based on the instance quota. You can go to [Quota Center](https://quotas.console.aliyun.com/products/ess/quotas) to check the quota of **instances that can be included in a scaling group**.</p>
     * <br>
     * <p>For example, if the quota of instances that can be included in a scaling group is 2,000, the value range of the **MaxSize** parameter is 0 to 2000.</p>
     */
    @NameInMap("MaxSize")
    public Integer maxSize;

    /**
     * <p>The minimum number of ECS instances in the scaling group. When the number of existing ECS instances in the scaling group is less than the value of the MinSize parameter, Auto Scaling automatically creates ECS instances and adds the instances to the scaling group until the number of instances is equal to the value of the MinSize parameter.</p>
     * <br>
     * <p>> The value of the MinSize parameter must be less than or equal to the value of the MaxSize parameter.</p>
     */
    @NameInMap("MinSize")
    public Integer minSize;

    /**
     * <p>The scaling policy for the multi-zone scaling group that contains ECS instances. Valid values:</p>
     * <br>
     * <p>*   PRIORITY: ECS instances are scaled based on the priority of the vSwitch that is specified by the VSwitchIds.N parameter. Auto Scaling preferentially scales instances in the zone where the vSwitch that has the highest priority resides. If the scaling fails, Auto Scaling scales instances in the zone where the vSwitch that has the next highest priority resides.</p>
     * <br>
     * <p>*   COST_OPTIMIZED: During a scale-out activity, Auto Scaling preferentially creates ECS instances that have vCPUs provided at the lowest price. During a scale-in activity, Auto Scaling preferentially removes ECS instances whose vCPUs are provided at the highest price. Preemptible instances are preferentially created when preemptible instance types are specified in the scaling configuration. You can specify the CompensateWithOnDemand parameter to determine whether to automatically create pay-as-you-go instances when preemptible instances cannot be created due to insufficient resources.</p>
     * <br>
     * <p>    **</p>
     * <br>
     * <p>    **Note**The COST_OPTIMIZED setting takes effect only when multiple instance types are specified or at least one instance type is specified for preemptible instances.</p>
     * <br>
     * <p>*   BALANCE: ECS instances are evenly distributed across zones that are specified for the scaling group. If ECS instances are unevenly distributed across zones due to insufficient resources, you can call the [RebalanceInstance](~~71516~~) operation to balance the instances across zones.</p>
     * <br>
     * <p>Default value: PRIORITY.</p>
     */
    @NameInMap("MultiAZPolicy")
    public String multiAZPolicy;

    /**
     * <p>The minimum number of pay-as-you-go instances that must be included in the scaling group. Valid values: 0 to 1000. If the number of pay-as-you-go instances is less than the value of this parameter, Auto Scaling preferentially creates pay-as-you-go instances.</p>
     */
    @NameInMap("OnDemandBaseCapacity")
    public Integer onDemandBaseCapacity;

    /**
     * <p>The percentage of pay-as-you-go instances in the excess instances when the minimum number of pay-as-you-go instances reaches the requirement. Valid values: 0 to 100.</p>
     */
    @NameInMap("OnDemandPercentageAboveBaseCapacity")
    public Integer onDemandPercentageAboveBaseCapacity;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the scaling group.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The first step of the instance removal policy. Valid values:</p>
     * <br>
     * <p>*   OldestInstance: removes ECS instances that are added at the earliest point in time to the scaling group.</p>
     * <p>*   NewestInstance: removes ECS instances that are most recently added to the scaling group.</p>
     * <p>*   OldestScalingConfiguration: removes ECS instances that are created based on the earliest scaling configuration.</p>
     * <p>*   CustomPolicy: removes ECS instances based on the custom scaling policy (Function).</p>
     * <br>
     * <p>> The scaling configuration mentioned in OldestScalingConfiguration refers to the instance configuration source of a scaling group. The instance configuration source can be a scaling configuration or a launch template. The CustomPolicy setting is available only for the RemovalPolicies parameter. If you set the RemovalPolicies parameter to CustomPolicy, you must also specify the CustomPolicyARN parameter.</p>
     * <br>
     * <p>The version of a launch template does not indicate the order in which the template is added. For example, if you use the lt-foress V2 template to create a scaling group, and then replace the template with the lt-foress V1 template when you modify the scaling group, Auto Scaling considers the lt-foress V2 launch template as the earliest template.</p>
     * <br>
     * <p>If you do not specify the RemovalPolicy.1 parameter and the RemovalPolicy.2 parameter, the following rules apply:</p>
     * <br>
     * <p>*   OldestScalingConfiguration is used as the value of the RemovalPolicy.1 parameter.</p>
     * <p>*   OldestInstance is used as the value of the RemovalPolicy.2 parameter.</p>
     * <br>
     * <p>> The removal of ECS instances from a scaling group is also affected by the value of the MultiAZPolicy parameter. For more information, see [Configure a combination policy for removing instances](~~254822~~) in Auto Scaling Best Practices.</p>
     */
    @NameInMap("RemovalPolicies")
    public java.util.List<String> removalPolicies;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The name of the scaling group. The name of each scaling group must be unique in a region.</p>
     * <br>
     * <p>The name must be 2 to 64 characters in length, and can contain letters, digits, underscores (\_), hyphens (-), and periods (.). The name must start with a letter or a digit.</p>
     * <br>
     * <p>If you do not specify this parameter, the value of the ScalingGroupId parameter is used.</p>
     */
    @NameInMap("ScalingGroupName")
    public String scalingGroupName;

    /**
     * <p>The reclaim mode of the scaling group. Valid values:</p>
     * <br>
     * <p>*   recycle: economical mode.</p>
     * <p>*   release: release mode.</p>
     * <br>
     * <p>The ScalingPolicy parameter specifies the reclaim mode of the scaling group. The RemovePolicy parameter of the RemoveInstances operation specifies how to remove instances in a specific manner.</p>
     */
    @NameInMap("ScalingPolicy")
    public String scalingPolicy;

    /**
     * <p>The allocation policy of preemptible instances. You can use this parameter to individually specify the allocation policy of preemptible instances. This parameter takes effect only when you set the `MultiAZPolicy` parameter to `COMPOSABLE`. Valid values:</p>
     * <br>
     * <p>*   priority: Auto Scaling selects instance types based on the specified order to create the required number of preemptible instances.</p>
     * <p>*   lowestPrice: Auto Scaling selects instance types that have the lowest unit price of vCPUs to create the required number of preemptible instances.</p>
     * <br>
     * <p>Default value: priority.</p>
     */
    @NameInMap("SpotAllocationStrategy")
    public String spotAllocationStrategy;

    /**
     * <p>The number of instance types that you specified. Auto Scaling creates preemptible instances of multiple instance types that are provided at the lowest price. Valid values: 1 to 10.</p>
     */
    @NameInMap("SpotInstancePools")
    public Integer spotInstancePools;

    /**
     * <p>Specifies whether to supplement preemptible instances. If this parameter is set to true, Auto Scaling creates an instance to replace a preemptible instance when Auto Scaling receives the system message that the preemptible instance is to be reclaimed.</p>
     */
    @NameInMap("SpotInstanceRemedy")
    public Boolean spotInstanceRemedy;

    /**
     * <p>> This parameter is unavailable.</p>
     */
    @NameInMap("SyncAlarmRuleToCms")
    public Boolean syncAlarmRuleToCms;

    /**
     * <p>Details of the tags that are added to the scaling group.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateScalingGroupRequestTags> tags;

    /**
     * <p>Details of the vServer groups that are associated with the scaling group.</p>
     */
    @NameInMap("VServerGroups")
    public java.util.List<CreateScalingGroupRequestVServerGroups> VServerGroups;

    /**
     * <p>The ID of the vSwitch. If you specify the VSwitchId parameter, the network type of the scaling group is VPC.</p>
     * <br>
     * <p>> If you do not specify the VSwitchId or VSwitchIds parameter, the network type of the scaling group is classic network.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The IDs of vSwitches. If you specify the VSwitchIds parameter, the VSwitchId parameter is ignored. If you specify the VSwitchIds parameter, the network type of the scaling group is VPC.</p>
     * <br>
     * <p>If you specify multiple vSwitches, the following rules apply:</p>
     * <br>
     * <p>*   The vSwitches must belong to the same VPC.</p>
     * <p>*   The vSwitches can belong to different zones.</p>
     * <p>*   vSwitches are sorted in ascending order. 1 indicates the highest priority. If Auto Scaling fails to create ECS instances in the zone where the vSwitch that has the highest priority resides, Auto Scaling creates ECS instances in the zone where the vSwitch that has the next highest priority resides.</p>
     * <br>
     * <p>> If you do not specify the VSwitchId or VSwitchIds parameter, the network type of the scaling group is classic network.</p>
     */
    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    public static CreateScalingGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScalingGroupRequest self = new CreateScalingGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateScalingGroupRequest setAlbServerGroups(java.util.List<CreateScalingGroupRequestAlbServerGroups> albServerGroups) {
        this.albServerGroups = albServerGroups;
        return this;
    }
    public java.util.List<CreateScalingGroupRequestAlbServerGroups> getAlbServerGroups() {
        return this.albServerGroups;
    }

    public CreateScalingGroupRequest setAllocationStrategy(String allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
        return this;
    }
    public String getAllocationStrategy() {
        return this.allocationStrategy;
    }

    public CreateScalingGroupRequest setAzBalance(Boolean azBalance) {
        this.azBalance = azBalance;
        return this;
    }
    public Boolean getAzBalance() {
        return this.azBalance;
    }

    public CreateScalingGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateScalingGroupRequest setCompensateWithOnDemand(Boolean compensateWithOnDemand) {
        this.compensateWithOnDemand = compensateWithOnDemand;
        return this;
    }
    public Boolean getCompensateWithOnDemand() {
        return this.compensateWithOnDemand;
    }

    public CreateScalingGroupRequest setContainerGroupId(String containerGroupId) {
        this.containerGroupId = containerGroupId;
        return this;
    }
    public String getContainerGroupId() {
        return this.containerGroupId;
    }

    public CreateScalingGroupRequest setCustomPolicyARN(String customPolicyARN) {
        this.customPolicyARN = customPolicyARN;
        return this;
    }
    public String getCustomPolicyARN() {
        return this.customPolicyARN;
    }

    public CreateScalingGroupRequest setDBInstanceIds(String DBInstanceIds) {
        this.DBInstanceIds = DBInstanceIds;
        return this;
    }
    public String getDBInstanceIds() {
        return this.DBInstanceIds;
    }

    public CreateScalingGroupRequest setDefaultCooldown(Integer defaultCooldown) {
        this.defaultCooldown = defaultCooldown;
        return this;
    }
    public Integer getDefaultCooldown() {
        return this.defaultCooldown;
    }

    public CreateScalingGroupRequest setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
        return this;
    }
    public Integer getDesiredCapacity() {
        return this.desiredCapacity;
    }

    public CreateScalingGroupRequest setGroupDeletionProtection(Boolean groupDeletionProtection) {
        this.groupDeletionProtection = groupDeletionProtection;
        return this;
    }
    public Boolean getGroupDeletionProtection() {
        return this.groupDeletionProtection;
    }

    public CreateScalingGroupRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public CreateScalingGroupRequest setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
        return this;
    }
    public String getHealthCheckType() {
        return this.healthCheckType;
    }

    public CreateScalingGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateScalingGroupRequest setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    public CreateScalingGroupRequest setLaunchTemplateOverrides(java.util.List<CreateScalingGroupRequestLaunchTemplateOverrides> launchTemplateOverrides) {
        this.launchTemplateOverrides = launchTemplateOverrides;
        return this;
    }
    public java.util.List<CreateScalingGroupRequestLaunchTemplateOverrides> getLaunchTemplateOverrides() {
        return this.launchTemplateOverrides;
    }

    public CreateScalingGroupRequest setLaunchTemplateVersion(String launchTemplateVersion) {
        this.launchTemplateVersion = launchTemplateVersion;
        return this;
    }
    public String getLaunchTemplateVersion() {
        return this.launchTemplateVersion;
    }

    public CreateScalingGroupRequest setLifecycleHooks(java.util.List<CreateScalingGroupRequestLifecycleHooks> lifecycleHooks) {
        this.lifecycleHooks = lifecycleHooks;
        return this;
    }
    public java.util.List<CreateScalingGroupRequestLifecycleHooks> getLifecycleHooks() {
        return this.lifecycleHooks;
    }

    public CreateScalingGroupRequest setLoadBalancerIds(String loadBalancerIds) {
        this.loadBalancerIds = loadBalancerIds;
        return this;
    }
    public String getLoadBalancerIds() {
        return this.loadBalancerIds;
    }

    public CreateScalingGroupRequest setMaxInstanceLifetime(Integer maxInstanceLifetime) {
        this.maxInstanceLifetime = maxInstanceLifetime;
        return this;
    }
    public Integer getMaxInstanceLifetime() {
        return this.maxInstanceLifetime;
    }

    public CreateScalingGroupRequest setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }
    public Integer getMaxSize() {
        return this.maxSize;
    }

    public CreateScalingGroupRequest setMinSize(Integer minSize) {
        this.minSize = minSize;
        return this;
    }
    public Integer getMinSize() {
        return this.minSize;
    }

    public CreateScalingGroupRequest setMultiAZPolicy(String multiAZPolicy) {
        this.multiAZPolicy = multiAZPolicy;
        return this;
    }
    public String getMultiAZPolicy() {
        return this.multiAZPolicy;
    }

    public CreateScalingGroupRequest setOnDemandBaseCapacity(Integer onDemandBaseCapacity) {
        this.onDemandBaseCapacity = onDemandBaseCapacity;
        return this;
    }
    public Integer getOnDemandBaseCapacity() {
        return this.onDemandBaseCapacity;
    }

    public CreateScalingGroupRequest setOnDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
        this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
        return this;
    }
    public Integer getOnDemandPercentageAboveBaseCapacity() {
        return this.onDemandPercentageAboveBaseCapacity;
    }

    public CreateScalingGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateScalingGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateScalingGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateScalingGroupRequest setRemovalPolicies(java.util.List<String> removalPolicies) {
        this.removalPolicies = removalPolicies;
        return this;
    }
    public java.util.List<String> getRemovalPolicies() {
        return this.removalPolicies;
    }

    public CreateScalingGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateScalingGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateScalingGroupRequest setScalingGroupName(String scalingGroupName) {
        this.scalingGroupName = scalingGroupName;
        return this;
    }
    public String getScalingGroupName() {
        return this.scalingGroupName;
    }

    public CreateScalingGroupRequest setScalingPolicy(String scalingPolicy) {
        this.scalingPolicy = scalingPolicy;
        return this;
    }
    public String getScalingPolicy() {
        return this.scalingPolicy;
    }

    public CreateScalingGroupRequest setSpotAllocationStrategy(String spotAllocationStrategy) {
        this.spotAllocationStrategy = spotAllocationStrategy;
        return this;
    }
    public String getSpotAllocationStrategy() {
        return this.spotAllocationStrategy;
    }

    public CreateScalingGroupRequest setSpotInstancePools(Integer spotInstancePools) {
        this.spotInstancePools = spotInstancePools;
        return this;
    }
    public Integer getSpotInstancePools() {
        return this.spotInstancePools;
    }

    public CreateScalingGroupRequest setSpotInstanceRemedy(Boolean spotInstanceRemedy) {
        this.spotInstanceRemedy = spotInstanceRemedy;
        return this;
    }
    public Boolean getSpotInstanceRemedy() {
        return this.spotInstanceRemedy;
    }

    public CreateScalingGroupRequest setSyncAlarmRuleToCms(Boolean syncAlarmRuleToCms) {
        this.syncAlarmRuleToCms = syncAlarmRuleToCms;
        return this;
    }
    public Boolean getSyncAlarmRuleToCms() {
        return this.syncAlarmRuleToCms;
    }

    public CreateScalingGroupRequest setTags(java.util.List<CreateScalingGroupRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateScalingGroupRequestTags> getTags() {
        return this.tags;
    }

    public CreateScalingGroupRequest setVServerGroups(java.util.List<CreateScalingGroupRequestVServerGroups> VServerGroups) {
        this.VServerGroups = VServerGroups;
        return this;
    }
    public java.util.List<CreateScalingGroupRequestVServerGroups> getVServerGroups() {
        return this.VServerGroups;
    }

    public CreateScalingGroupRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateScalingGroupRequest setVSwitchIds(java.util.List<String> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    public static class CreateScalingGroupRequestAlbServerGroups extends TeaModel {
        /**
         * <p>The ID of the ALB server group.</p>
         * <br>
         * <p>You can associate only a limited number of ALB server groups with a scaling group. To view the quota or manually request a quota increase, go to [Quota Center](https://quotas.console.aliyun.com/products/ess/quotas).</p>
         */
        @NameInMap("AlbServerGroupId")
        public String albServerGroupId;

        /**
         * <p>The port number used by the ECS instance after the instance is added to the ALB server group. Valid values: 1 to 65535.</p>
         * <br>
         * <p>> If the N values are the same but the port numbers are different, Auto Scaling associates multiple ports in the scaling group with the ALB server group.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The weight of the ECS instance as a backend server after the instance is added to the ALB server group. If you increase the weight of an ECS instance in an ALB server group, the number of access requests that are forwarded to the ECS instance increases. If you set the Weight parameter for an ECS instance to 0, no access requests are forwarded to the ECS instance. Valid values: 0 to 100.</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static CreateScalingGroupRequestAlbServerGroups build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingGroupRequestAlbServerGroups self = new CreateScalingGroupRequestAlbServerGroups();
            return TeaModel.build(map, self);
        }

        public CreateScalingGroupRequestAlbServerGroups setAlbServerGroupId(String albServerGroupId) {
            this.albServerGroupId = albServerGroupId;
            return this;
        }
        public String getAlbServerGroupId() {
            return this.albServerGroupId;
        }

        public CreateScalingGroupRequestAlbServerGroups setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateScalingGroupRequestAlbServerGroups setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class CreateScalingGroupRequestLaunchTemplateOverrides extends TeaModel {
        /**
         * <p>The instance type. The instance type that you specify by using the InstanceType parameter overwrites the instance type that is specified in the launch template.</p>
         * <br>
         * <p>If you want Auto Scaling to scale instances in the scaling group based on the instance type weight, you must specify both the InstanceType parameter and the WeightedCapacity parameter. You can specify 1 to 10 instance types in the extended configurations of the launch template.</p>
         * <br>
         * <p>> This parameter takes effect only when you specify the LaunchTemplateId parameter.</p>
         * <br>
         * <p>You can use the InstanceType parameter to specify only instance types that are available for purchase.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        /**
         * <p>The weight of the instance type. The weight specifies the capacity of a single instance of the specified instance type in the scaling group. If you want Auto Scaling to scale instances in the scaling group based on the instance type weight, you must specify the WeightedCapacity parameter after you specify the InstanceType parameter.</p>
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
         * <p>To meet the expected capacity, Auto Scaling must create and add two ecs.c5.xlarge instances.</p>
         * <br>
         * <p>> The capacity of the scaling group cannot exceed the sum of the maximum number of instances that is specified by the MaxSize parameter and the maximum weight of the instance type.</p>
         * <br>
         * <p>Valid values of the WeightedCapacity parameter: 1 to 500.</p>
         */
        @NameInMap("WeightedCapacity")
        public Integer weightedCapacity;

        public static CreateScalingGroupRequestLaunchTemplateOverrides build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingGroupRequestLaunchTemplateOverrides self = new CreateScalingGroupRequestLaunchTemplateOverrides();
            return TeaModel.build(map, self);
        }

        public CreateScalingGroupRequestLaunchTemplateOverrides setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CreateScalingGroupRequestLaunchTemplateOverrides setSpotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public CreateScalingGroupRequestLaunchTemplateOverrides setWeightedCapacity(Integer weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public Integer getWeightedCapacity() {
            return this.weightedCapacity;
        }

    }

    public static class CreateScalingGroupRequestLifecycleHooks extends TeaModel {
        /**
         * <p>The action that Auto Scaling performs in the scaling group when the lifecycle hook times out. Valid values:</p>
         * <br>
         * <p>*   CONTINUE: Auto Scaling continues to respond to scaling requests.</p>
         * <p>*   ABANDON: Auto Scaling releases ECS instances that are created during scale-out activities, or removes ECS instances from the scaling group during scale-in activities.</p>
         * <br>
         * <p>If multiple lifecycle hooks in the scaling group are triggered during a scale-in activity and you set the DefaultResult parameter to ABANDON for one of the lifecycle hooks, Auto Scaling immediately starts to perform the action after the lifecycle hook whose DefaultResult is set to ABANDON times out. In this case, other lifecycle hooks time out ahead of schedule. In other cases, Auto Scaling performs the action only after all lifecycle hooks time out.</p>
         * <br>
         * <p>Default value: CONTINUE.</p>
         */
        @NameInMap("DefaultResult")
        public String defaultResult;

        /**
         * <p>The period of time before the lifecycle hook times out. When the lifecycle hook times out, Auto Scaling performs the default action. Valid values: 30 to 21600. Unit: seconds.</p>
         * <br>
         * <p>After you create a lifecycle hook, you can call the RecordLifecycleActionHeartbeat operation to extend the timeout period of the lifecycle hook. You can also call the CompleteLifecycleAction operation to end the timeout period ahead of schedule.</p>
         * <br>
         * <p>Default value: 600.</p>
         */
        @NameInMap("HeartbeatTimeout")
        public Integer heartbeatTimeout;

        /**
         * <p>The name of the lifecycle hook. After you specify this parameter, you cannot modify the name of the lifecycle hook. If you do not specify this parameter, the ID of the lifecycle hook is used by default.</p>
         */
        @NameInMap("LifecycleHookName")
        public String lifecycleHookName;

        /**
         * <p>The type of scaling activities to which the lifecycle hook applies. Valid values:</p>
         * <br>
         * <p>*   SCALE_OUT</p>
         * <p>*   SCALE_IN</p>
         * <br>
         * <p>> If you create lifecycle hooks for your scaling group, you must specify the LifecycleTransition parameter.</p>
         */
        @NameInMap("LifecycleTransition")
        public String lifecycleTransition;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the notification method that Auto Scaling uses to send a notification when a lifecycle hook takes effect. This method can be a Message Service (MNS) queue or an MNS topic. The value of this parameter is in the following format: acs:ess:{region}:{account-id}:{resource-relative-id}.</p>
         * <br>
         * <p>*   region: the region where the scaling group resides</p>
         * <p>*   account-id: the ID of the Alibaba Cloud account</p>
         * <br>
         * <p>Example:</p>
         * <br>
         * <p>*   MNS queue: acs:ess:{region}:{account-id}:queue/{queuename}</p>
         * <p>*   MNS topic: acs:ess:{region}:{account-id}:topic/{topicname}</p>
         */
        @NameInMap("NotificationArn")
        public String notificationArn;

        /**
         * <p>The fixed string that is included in a notification when Auto Scaling sends the notification which indicates that the scaling activity is pending. The value of this parameter cannot exceed 4,096 characters in length. Auto Scaling sends the value of the notificationmetadata parameter together with the notification. This way, you can categorize and manage your notifications in an efficient manner. The notificationmetadata parameter takes effect only after you specify the notificationarn parameter.</p>
         */
        @NameInMap("NotificationMetadata")
        public String notificationMetadata;

        public static CreateScalingGroupRequestLifecycleHooks build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingGroupRequestLifecycleHooks self = new CreateScalingGroupRequestLifecycleHooks();
            return TeaModel.build(map, self);
        }

        public CreateScalingGroupRequestLifecycleHooks setDefaultResult(String defaultResult) {
            this.defaultResult = defaultResult;
            return this;
        }
        public String getDefaultResult() {
            return this.defaultResult;
        }

        public CreateScalingGroupRequestLifecycleHooks setHeartbeatTimeout(Integer heartbeatTimeout) {
            this.heartbeatTimeout = heartbeatTimeout;
            return this;
        }
        public Integer getHeartbeatTimeout() {
            return this.heartbeatTimeout;
        }

        public CreateScalingGroupRequestLifecycleHooks setLifecycleHookName(String lifecycleHookName) {
            this.lifecycleHookName = lifecycleHookName;
            return this;
        }
        public String getLifecycleHookName() {
            return this.lifecycleHookName;
        }

        public CreateScalingGroupRequestLifecycleHooks setLifecycleTransition(String lifecycleTransition) {
            this.lifecycleTransition = lifecycleTransition;
            return this;
        }
        public String getLifecycleTransition() {
            return this.lifecycleTransition;
        }

        public CreateScalingGroupRequestLifecycleHooks setNotificationArn(String notificationArn) {
            this.notificationArn = notificationArn;
            return this;
        }
        public String getNotificationArn() {
            return this.notificationArn;
        }

        public CreateScalingGroupRequestLifecycleHooks setNotificationMetadata(String notificationMetadata) {
            this.notificationMetadata = notificationMetadata;
            return this;
        }
        public String getNotificationMetadata() {
            return this.notificationMetadata;
        }

    }

    public static class CreateScalingGroupRequestTags extends TeaModel {
        /**
         * <p>The tag key of the scaling group.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the scaling group.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateScalingGroupRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingGroupRequestTags self = new CreateScalingGroupRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateScalingGroupRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateScalingGroupRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateScalingGroupRequestVServerGroupsVServerGroupAttributes extends TeaModel {
        /**
         * <p>The port number used by the ECS instance after the instance is added to the vServer group. Valid values: 1 to 65535.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the vServer group.</p>
         */
        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        /**
         * <p>The weight of the ECS instance as a backend server after the instance is added to the vServer group. If you increase the weight of an ECS instance, the number of access requests that are forwarded to the ECS instance increases. If you set the Weight parameter for an ECS instance to 0, no access requests are forwarded to the ECS instance. Valid values: 0 to 100. Default value: 50.</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static CreateScalingGroupRequestVServerGroupsVServerGroupAttributes build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingGroupRequestVServerGroupsVServerGroupAttributes self = new CreateScalingGroupRequestVServerGroupsVServerGroupAttributes();
            return TeaModel.build(map, self);
        }

        public CreateScalingGroupRequestVServerGroupsVServerGroupAttributes setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateScalingGroupRequestVServerGroupsVServerGroupAttributes setVServerGroupId(String VServerGroupId) {
            this.VServerGroupId = VServerGroupId;
            return this;
        }
        public String getVServerGroupId() {
            return this.VServerGroupId;
        }

        public CreateScalingGroupRequestVServerGroupsVServerGroupAttributes setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class CreateScalingGroupRequestVServerGroups extends TeaModel {
        /**
         * <p>The ID of the CLB instance to which the vServer group belongs.</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>Details of the vServer group attributes.</p>
         */
        @NameInMap("VServerGroupAttributes")
        public java.util.List<CreateScalingGroupRequestVServerGroupsVServerGroupAttributes> VServerGroupAttributes;

        public static CreateScalingGroupRequestVServerGroups build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingGroupRequestVServerGroups self = new CreateScalingGroupRequestVServerGroups();
            return TeaModel.build(map, self);
        }

        public CreateScalingGroupRequestVServerGroups setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public CreateScalingGroupRequestVServerGroups setVServerGroupAttributes(java.util.List<CreateScalingGroupRequestVServerGroupsVServerGroupAttributes> VServerGroupAttributes) {
            this.VServerGroupAttributes = VServerGroupAttributes;
            return this;
        }
        public java.util.List<CreateScalingGroupRequestVServerGroupsVServerGroupAttributes> getVServerGroupAttributes() {
            return this.VServerGroupAttributes;
        }

    }

}
