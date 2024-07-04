// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CreateScalingGroupRequest extends TeaModel {
    /**
     * <p>The Application Load Balancer (ALB) server groups.</p>
     */
    @NameInMap("AlbServerGroups")
    public java.util.List<CreateScalingGroupRequestAlbServerGroups> albServerGroups;

    /**
     * <p>The allocation policy of instances. Auto Scaling selects instance types based on the allocation policy to create the required number of instances. The policy can be applied to pay-as-you-go instances and preemptible instances. This parameter takes effect only when you set the <code>MultiAZPolicy</code> parameter to <code>COMPOSABLE</code>. Valid values:</p>
     * <ul>
     * <li>priority: Auto Scaling selects instance types based on the specified order of the instance types to create the required number of instances.</li>
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
     * <p>Specifies whether to evenly distribute instances in the scaling group across multiple zones. This parameter takes effect only if you set <code>MultiAZPolicy</code> to <code>COMPOSABLE</code>. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <blockquote>
     * <p> If you set <code>MultiAZPolicy</code> to <code>COMPOSABLE</code> and enable <code>AzBalance</code> to <code>true</code>, this setting has an equivalent effect to setting <code>MultiAZPolicy</code> to <code>BALANCE</code>.</p>
     * </blockquote>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AzBalance")
    public Boolean azBalance;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25965.html">Ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to automatically create pay-as-you-go instances to meet the requirement on the number of ECS instances when the expected capacity of preemptible instances cannot be provided due to reasons such as cost-related issues and insufficient resources. This parameter is available only if you set the MultiAZPolicy parameter to COST_OPTIMIZED. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CompensateWithOnDemand")
    public Boolean compensateWithOnDemand;

    /**
     * <p>The ID of the elastic container instance.</p>
     * 
     * <strong>example:</strong>
     * <p>eci-uf6fonnghi50u374****</p>
     */
    @NameInMap("ContainerGroupId")
    public String containerGroupId;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the custom scale-in policy (Function). This parameter is available only if you specify CustomPolicy as the first step to remove instances.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:fc:cn-zhangjiakou:16145688****:services/ess_custom_terminate_policy.LATEST/functions/ess_custom_terminate_policy_name</p>
     */
    @NameInMap("CustomPolicyARN")
    public String customPolicyARN;

    /**
     * <p>The IDs of the ApsaraDB RDS instances that you want to associate with the scaling group. The value can be a JSON array that contains multiple ApsaraDB RDS instance IDs. Separate multiple IDs with commas (,).</p>
     * <p>You can associate only a limited number of ApsaraDB RDS instances with a scaling group. Go to <a href="https://quotas.console.aliyun.com/products/ess/quotas">Quota Center</a> to check the maximum number of ApsaraDB RDS instances that you can associate with a scaling group.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;rm-bp142f86de0t7****&quot;, &quot;rm-bp18l1z42ar4o****&quot;, &quot;rm-bp1lqr97h4aqk****&quot;]</p>
     */
    @NameInMap("DBInstanceIds")
    public String DBInstanceIds;

    /**
     * <p>The databases that you want to attach to the scaling group.</p>
     */
    @NameInMap("DBInstances")
    public java.util.List<CreateScalingGroupRequestDBInstances> DBInstances;

    /**
     * <p>The cooldown period of the scaling group after a scaling activity is complete in the scaling group. Valid values: 0 to 86400. Unit: seconds.</p>
     * <p>During the cooldown period, Auto Scaling does not execute scaling activities that are triggered by CloudMonitor event-triggered tasks.</p>
     * <p>Default value: 300.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("DefaultCooldown")
    public Integer defaultCooldown;

    /**
     * <p>The expected number of ECS instances in the scaling group. Auto Scaling automatically maintains the specified expected number of ECS instances. The DesiredCapacity value cannot be greater than the MaxSize value or less than the MinSize value.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("DesiredCapacity")
    public Integer desiredCapacity;

    /**
     * <p>Specifies whether to enable deletion protection for the scaling group. Valid values:</p>
     * <ul>
     * <li>true: enables deletion protection for the scaling group. This way, the scaling group cannot be deleted.</li>
     * <li>false: disables deletion protection for the scaling group.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("GroupDeletionProtection")
    public Boolean groupDeletionProtection;

    /**
     * <p>The type of the instances that are managed by the scaling group. Valid values:</p>
     * <ul>
     * <li>ECS: ECS instances.</li>
     * <li>ECI: elastic container instances.</li>
     * </ul>
     * <p>Default value: ECS.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>The health check mode of the scaling group. Valid values:</p>
     * <ul>
     * <li>NONE: Auto Scaling does not check the health status of instances.</li>
     * <li>ECS: Auto Scaling checks the health status of ECS instances in the scaling group.</li>
     * <li>ECI: Auto Scaling checks the health status of elastic container instances in the scaling group.</li>
     * <li>LOAD_BALANCER: Auto Scaling checks the health status of instances in the scaling group based on the health check results of load balancers. The health check results of CLB instances are not supported as the health check basis for instances in the scaling group.</li>
     * </ul>
     * <p>Default value: ECS.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("HealthCheckType")
    public String healthCheckType;

    /**
     * <p>The health check modes of the scaling group. Valid values:</p>
     * <ul>
     * <li>NONE: Auto Scaling does not check the health status of instances.</li>
     * <li>ECS: Auto Scaling checks the health status of ECS instances in the scaling group.</li>
     * <li>ECI: Auto Scaling checks the health status of elastic container instances in the scaling group.</li>
     * <li>LOAD_BALANCER: Auto Scaling checks the health status of instances based on the health check results of load balancers. The health check results of CLB instances are not supported as the health check basis for instances in the scaling group.</li>
     * </ul>
     * <blockquote>
     * <p> HealthCheckTypes has the same effect as <code>HealthCheckType</code>. You can select one of them to specify based on your business requirements. If you specify <code>HealthCheckType</code>, <code>HealthCheckTypes</code> is ignored. HealthCheckTypes is optional.</p>
     * </blockquote>
     * <p>Default value: ECS.</p>
     */
    @NameInMap("HealthCheckTypes")
    public java.util.List<String> healthCheckTypes;

    /**
     * <p>The ID of the ECS instance. When you create a scaling group, you can specify an existing ECS instance. Auto Scaling obtains the configurations of the ECS instance and automatically creates a scaling configuration from the obtained configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>i-28wt4****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the launch template that provides instance configurations for Auto Scaling to create instances.</p>
     * 
     * <strong>example:</strong>
     * <p>lt-m5e3ofjr1zn1aw7****</p>
     */
    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    /**
     * <p>Details of the instance types that you specify by using the Extended Configurations feature of the launch template.</p>
     */
    @NameInMap("LaunchTemplateOverrides")
    public java.util.List<CreateScalingGroupRequestLaunchTemplateOverrides> launchTemplateOverrides;

    /**
     * <p>The version number of the launch template. Valid values:</p>
     * <ul>
     * <li>A fixed template version number.</li>
     * <li>Default: the default template version.</li>
     * <li>Latest: the latest template version.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("LaunchTemplateVersion")
    public String launchTemplateVersion;

    /**
     * <p>The lifecycle hooks.</p>
     */
    @NameInMap("LifecycleHooks")
    public java.util.List<CreateScalingGroupRequestLifecycleHooks> lifecycleHooks;

    /**
     * <p>The load balancer configurations.</p>
     */
    @NameInMap("LoadBalancerConfigs")
    public java.util.List<CreateScalingGroupRequestLoadBalancerConfigs> loadBalancerConfigs;

    /**
     * <p>The IDs of the CLB instances that you want to associate with the scaling group. The value can be a JSON array that contains multiple CLB instance IDs. Separate multiple IDs with commas (,).</p>
     * <p>You can associate only a limited number of CLB instances with a scaling group. Go to <a href="https://quotas.console.aliyun.com/products/ess/quotas">Quota Center</a> to check the maximum number of CLB instances that you can associate with a scaling group.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;lb-bp1u7etiogg38yvwz****&quot;, &quot;lb-bp168cqrux9ai9l7f****&quot;, &quot;lb-bp1jv3m9zvj22ufxp****&quot;]</p>
     */
    @NameInMap("LoadBalancerIds")
    public String loadBalancerIds;

    /**
     * <p>The maximum life span of an instance in the scaling group. Unit: seconds.</p>
     * <p>Valid values: 86400 to the value of the Integer.maxValue parameter.</p>
     * <p>Default value: null.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("MaxInstanceLifetime")
    public Integer maxInstanceLifetime;

    /**
     * <p>The maximum number of instances that can be contained in the scaling group. When the total number of ECS instances in the scaling group exceeds the value of MaxSize, Auto Scaling automatically removes ECS instances from the scaling group until the total number equals the maximum number.</p>
     * <p>The value range of MaxSize is directly correlated with the degree of dependency your business has on Auto Scaling. You can go to <a href="https://quotas.console.aliyun.com/products/ess/quotas">Quota Center</a> to check <strong>the maximum number of instances that a single scaling group can contain.</strong></p>
     * <p>If <strong>a single scaling group can contain up to 2,000 ECS instances</strong>, the value range of MaxSize is 0 to 2,000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxSize")
    public Integer maxSize;

    /**
     * <p>The minimum number of instances that must be contained in the scaling group. When the total number of ECS instances in the scaling group is less than the value of MinSize, Auto Scaling automatically creates ECS instances in the scaling group until the total number reaches the minimum number.</p>
     * <blockquote>
     * <p> The value of MinSize must be less than or equal to the value of MaxSize.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MinSize")
    public Integer minSize;

    /**
     * <p>The scaling policy for ECS instances in the multi-zone scaling group. Valid values:</p>
     * <ul>
     * <li><p>PRIORITY: scale ECS instances based on the priority of the vSwitches specified by VSwitchIds. Auto Scaling preferentially scales instances in the zone where the vSwitch of the highest priority resides. If the scaling fails, Auto Scaling scales instances in the zone where the vSwitch of the next highest priority resides.</p>
     * </li>
     * <li><p>COST_OPTIMIZED: create ECS instances that have the lowest unit price of vCPUs during scale-out events and removes ECS instances that have the highest unit price of vCPUs during scale-in events. If you specify preemptible instance types in your scaling configuration, Auto Scaling will preferentially create preemptible instances. You can also specify CompensateWithOnDemand to allow Auto Scaling to create pay-as-you-go instances in the case that preemptible instances cannot be created due to limited stock.</p>
     * <p>**</p>
     * <p><strong>Note</strong> The COST_OPTIMIZED setting takes effect only when your scaling configuration contains multiple instance types or specifically contains preemptible instance types.</p>
     * </li>
     * <li><p>BALANCE: evenly distribute ECS instances across the zones that are specified for the scaling group. If ECS instances are unevenly distributed across the specified zones due to insufficient inventory, you can call the <a href="https://help.aliyun.com/document_detail/71516.html">RebalanceInstance</a> operation to evenly distribute the instances across the zones.</p>
     * <p>**</p>
     * <p><strong>Note</strong> When you set <code>MultiAZPolicy</code> to <code>BALANCE</code>, this setting has an equivalent effect to setting <code>MultiAZPolicy</code> to <code>COMPOSABLE</code> and enabling <code>AzBalance</code> to <code>true</code>.</p>
     * </li>
     * <li><p>COMPOSABLE: combine the preceding policies into a custom scaling policy based on your business requirements. Alternatively, you can specify custom parameters to finely control the capacity of the scaling group.</p>
     * </li>
     * </ul>
     * <p>Default value: PRIORITY.</p>
     * 
     * <strong>example:</strong>
     * <p>PRIORITY</p>
     */
    @NameInMap("MultiAZPolicy")
    public String multiAZPolicy;

    /**
     * <p>The minimum number of pay-as-you-go instances that must be contained in the scaling group. Valid values: 0 to 1000. If the number of pay-as-you-go instances is less than the value of this parameter, Auto Scaling preferentially creates pay-as-you-go instances.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("OnDemandBaseCapacity")
    public Integer onDemandBaseCapacity;

    /**
     * <p>The percentage of pay-as-you-go instances in the excess instances when the minimum number of pay-as-you-go instances reaches the requirement. Valid values: 0 to 100.</p>
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
     * <p>The region ID of the scaling group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The instance removal policies. Valid values:</p>
     * <ul>
     * <li>OldestInstance: removes ECS instances that are added at the earliest point in time to the scaling group.</li>
     * <li>NewestInstance: removes ECS instances that are most recently added to the scaling group.</li>
     * <li>OldestScalingConfiguration: removes ECS instances that are created based on the earliest scaling configuration.</li>
     * <li>CustomPolicy: removes ECS instances based on the custom scale-in policy (Function).</li>
     * </ul>
     * <p>The scaling configuration source specified by the OldestScalingConfiguration setting can be a scaling configuration or a launch template. The CustomPolicy setting takes effect only if you specify it as the first step to remove instances. If you specify CustomPolicy, you must also specify the CustomPolicyARN parameter.</p>
     * <blockquote>
     * <p>The removal of ECS instances from a scaling group is also affected by the value of the MultiAZPolicy parameter. For more information, see the <a href="https://help.aliyun.com/document_detail/254822.html">Configure a combination policy for removing instances</a> topic.</p>
     * </blockquote>
     */
    @NameInMap("RemovalPolicies")
    public java.util.List<String> removalPolicies;

    /**
     * <p>The ID of the resource group to which you want to add the scaling group.</p>
     * <blockquote>
     * <p>If you specify this parameter, new scaling groups are added to the specified resource group. If you do not specify this parameter, new scaling groups are added to the default resource group.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rg-123******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The name of the scaling group. The name of each scaling group must be unique in a region.</p>
     * <p>The name must be 2 to 64 characters in length, and can contain letters, digits, underscores (_), hyphens (-), and periods (.). The name must start with a letter or a digit.</p>
     * <p>If you do not specify this parameter, the value of the ScalingGroupId parameter is used.</p>
     * 
     * <strong>example:</strong>
     * <p>scalinggroup****</p>
     */
    @NameInMap("ScalingGroupName")
    public String scalingGroupName;

    /**
     * <p>The reclaim mode of the scaling group. Valid values:</p>
     * <ul>
     * <li><p>recycle: the economical mode</p>
     * </li>
     * <li><p>release: the release mode</p>
     * </li>
     * <li><p>forcerelease: the forced release mode</p>
     * <p>**</p>
     * <p><strong>Note</strong> If you set the value to forcerelease, Auto Scaling will forcibly release the ECS instances that are in the <code>Running</code> state during the scale-out events. Forced release equates to an immediate power-off, resulting in the irreversible deletion of all ephemeral data stored on the instance. Once executed, this action cannot be undone and the lost data cannot be recovered. Exercise caution when you select this option.</p>
     * </li>
     * <li><p>forcerecycle: the forced recycle mode</p>
     * <p>**</p>
     * <p><strong>Note</strong> If you set the value to forcerecycle, Auto Scaling will forcibly shut down the ECS instances that are in the <code>Running</code> state during the scale-out events. Forced recycle equates to an immediate power-off, resulting in the irreversible deletion of all ephemeral data stored on the instance. Once executed, this action cannot be undone and the lost data cannot be recovered. Exercise caution when you select this option.</p>
     * </li>
     * </ul>
     * <p>ScalingPolicy specifies the reclaim mode of the scaling group. RemovePolicy of the RemoveInstances operation specifies the specific instance removal action. For more information, see <a href="https://help.aliyun.com/document_detail/25955.html">RemoveInstances</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>recycle</p>
     */
    @NameInMap("ScalingPolicy")
    public String scalingPolicy;

    /**
     * <p>The server groups.</p>
     * <blockquote>
     * <p> You cannot use AlbServerGroups and ServerGroups to specify the same server group.</p>
     * </blockquote>
     */
    @NameInMap("ServerGroups")
    public java.util.List<CreateScalingGroupRequestServerGroups> serverGroups;

    /**
     * <p>The allocation policy of preemptible instances. You can use this parameter to individually specify the allocation policy of preemptible instances. This parameter takes effect only if you set the <code>MultiAZPolicy</code> parameter to <code>COMPOSABLE</code>. Valid values:</p>
     * <ul>
     * <li>priority: Auto Scaling selects instance types based on the specified order of the instance types to create the required number of preemptible instances.</li>
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
     * <p>The number of available instance types. Auto Scaling evenly creates preemptible instances of multiple instance types that are provided at the lowest cost in the scaling group. Valid values: 1 to 10.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("SpotInstancePools")
    public Integer spotInstancePools;

    /**
     * <p>Specifies whether to supplement preemptible instances. If you set this parameter to true, Auto Scaling creates an instance to replace a preemptible instance when Auto Scaling receives a system message which indicates that the preemptible instance is to be reclaimed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SpotInstanceRemedy")
    public Boolean spotInstanceRemedy;

    /**
     * <blockquote>
     * <p>This parameter is unavailable.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SyncAlarmRuleToCms")
    public Boolean syncAlarmRuleToCms;

    /**
     * <p>The tags that you want to add to the scaling group.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateScalingGroupRequestTags> tags;

    /**
     * <p>The backend vServer group that you want to associate with the scaling group.</p>
     */
    @NameInMap("VServerGroups")
    public java.util.List<CreateScalingGroupRequestVServerGroups> VServerGroups;

    /**
     * <p>The ID of the vSwitch. If you specify the VSwitchId parameter, the network type of the scaling group is VPC.</p>
     * <blockquote>
     * <p>If you do not specify the VSwitchId or VSwitchIds parameter, the network type of the scaling group is classic network.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp14zolna43z266bq****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The IDs of the vSwitches. If you specify VSwitchIds, VSwitchId is ignored. If you specify VSwitchIds, the network type of the scaling group is VPC.</p>
     * <p>If you specify multiple vSwitches, take note of the following items:</p>
     * <ul>
     * <li>The vSwitches must belong to the same VPC.</li>
     * <li>The vSwitches can belong to different zones.</li>
     * <li>vSwitches are sorted in ascending order based on their priorities. The first vSwitch has the highest priority. If Auto Scaling fails to create ECS instances in the zone where the vSwitch of the highest priority resides, Auto Scaling attempts to create ECS instances in the zone where the vSwitch of the next highest priority resides.</li>
     * </ul>
     * <blockquote>
     * <p> If you do not specify VSwitchId or VSwitchIds for your scaling group, the network type of the scaling group is classic network.</p>
     * </blockquote>
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

    public CreateScalingGroupRequest setDBInstances(java.util.List<CreateScalingGroupRequestDBInstances> DBInstances) {
        this.DBInstances = DBInstances;
        return this;
    }
    public java.util.List<CreateScalingGroupRequestDBInstances> getDBInstances() {
        return this.DBInstances;
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

    public CreateScalingGroupRequest setHealthCheckTypes(java.util.List<String> healthCheckTypes) {
        this.healthCheckTypes = healthCheckTypes;
        return this;
    }
    public java.util.List<String> getHealthCheckTypes() {
        return this.healthCheckTypes;
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

    public CreateScalingGroupRequest setLoadBalancerConfigs(java.util.List<CreateScalingGroupRequestLoadBalancerConfigs> loadBalancerConfigs) {
        this.loadBalancerConfigs = loadBalancerConfigs;
        return this;
    }
    public java.util.List<CreateScalingGroupRequestLoadBalancerConfigs> getLoadBalancerConfigs() {
        return this.loadBalancerConfigs;
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

    public CreateScalingGroupRequest setServerGroups(java.util.List<CreateScalingGroupRequestServerGroups> serverGroups) {
        this.serverGroups = serverGroups;
        return this;
    }
    public java.util.List<CreateScalingGroupRequestServerGroups> getServerGroups() {
        return this.serverGroups;
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
         * <p>You can attach only a limited number of ALB server groups to a scaling group. To view the predefined quota limit or manually request a quota increase, go to <a href="https://quotas.console.aliyun.com/products/ess/quotas">Quota Center</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-ddwb0y0g6y9bjm****</p>
         */
        @NameInMap("AlbServerGroupId")
        public String albServerGroupId;

        /**
         * <p>The port number used by each ECS instance as a backend server in the ALB server group. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The weight of an ECS instance as a backend server in the ALB server group. If you increase the weight for an ECS instance, the number of requests that are forwarded to the ECS instance also increases. If you set the weight for an ECS instance to 0, no requests are forwarded to the ECS instance. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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

    public static class CreateScalingGroupRequestDBInstances extends TeaModel {
        /**
         * <p>The mode in which you want to attach the database to the scaling group. Valid values:</p>
         * <ul>
         * <li>SecurityIp: the mode in which Auto Scaling automatically adds the private IP addresses of ECS instances to the IP address whitelist of the database during scale-out events. You can set the value to SecurityIp only if you set Type to RDS.</li>
         * <li>SecurityGroup: the mode in which Auto Scaling adds the security group of the applied scaling configuration to the security group whitelist of the database. This setting allows ECS instances created from the scaling configuration to access the database.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SecurityIp</p>
         */
        @NameInMap("AttachMode")
        public String attachMode;

        /**
         * <p>The database ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-m5eqju85s45mu0***</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The database type. Valid values:</p>
         * <ul>
         * <li>RDS</li>
         * <li>Redis</li>
         * <li>MongoDB</li>
         * </ul>
         * <p>Default value: RDS.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateScalingGroupRequestDBInstances build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingGroupRequestDBInstances self = new CreateScalingGroupRequestDBInstances();
            return TeaModel.build(map, self);
        }

        public CreateScalingGroupRequestDBInstances setAttachMode(String attachMode) {
            this.attachMode = attachMode;
            return this;
        }
        public String getAttachMode() {
            return this.attachMode;
        }

        public CreateScalingGroupRequestDBInstances setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public CreateScalingGroupRequestDBInstances setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateScalingGroupRequestLaunchTemplateOverrides extends TeaModel {
        /**
         * <p>The instance type that you want to use to override the instance type that is specified in the launch template.</p>
         * <p>If you want to scale instances based on the weighted capacities of the instances, you must specify both the InstanceType and WeightedCapacity parameters.</p>
         * <blockquote>
         * <p>This parameter is available only if you specify the LaunchTemplateId parameter.</p>
         * </blockquote>
         * <p>You can use the InstanceType parameter to specify only instance types that are available for purchase.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c5.xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The maximum bid price of the instance type that is specified by the <code>InstanceType</code> parameter. You can specify 1 to 10 instance types by using the Extended Configurations feature of the launch template.</p>
         * <blockquote>
         * <p>This parameter is available only if you specify the <code>LaunchTemplateId</code> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.025</p>
         */
        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        /**
         * <p>The weight of the instance type. The weight specifies the capacity of an instance of the specified instance type in the scaling group. If you want to scale instances based on the weighted capacities of the instances, you must specify the WeightedCapacity parameter after you specify the InstanceType parameter.</p>
         * <p>A higher weight specifies that a smaller number of instances of the specified instance type are required to meet the expected capacity requirement.</p>
         * <p>Performance metrics, such as the number of vCPUs and the memory size of each instance type, may vary. You can specify different weights for different instance types based on your business requirements.</p>
         * <p>Example:</p>
         * <ul>
         * <li>Current capacity: 0</li>
         * <li>Expected capacity: 6</li>
         * <li>Capacity of ecs.c5.xlarge: 4</li>
         * </ul>
         * <p>To meet the expected capacity requirement, Auto Scaling must create and add two ecs.c5.xlarge instances.</p>
         * <blockquote>
         * <p>The capacity of the scaling group cannot exceed the sum of the maximum number of instances that is specified by the MaxSize parameter and the maximum weight of the instance types.</p>
         * </blockquote>
         * <p>Valid values of the WeightedCapacity parameter: 1 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
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
         * <p>The action that Auto Scaling performs when the lifecycle hook times out. Valid values:</p>
         * <ul>
         * <li>CONTINUE: Auto Scaling continues to respond to a scale-in or scale-out request.</li>
         * <li>ABANDON: Auto Scaling releases ECS instances that are created during scale-out events, or removes ECS instances from the scaling group during scale-in events.</li>
         * </ul>
         * <p>If multiple lifecycle hooks in the scaling group are triggered during scale-in events, and you set DefaultResult to ABANDON for one of the lifecycle hooks, Auto Scaling immediately performs the action after the lifecycle hook whose DefaultResult is set to ABANDON times out. In this case, other lifecycle hooks time out ahead of schedule. In other cases, Auto Scaling performs the action only after all lifecycle hooks time out. The action that Auto Scaling performs is determined by the value of DefaultResult that you specify for the lifecycle hook that most recently times out.</p>
         * <p>Default value: CONTINUE.</p>
         * 
         * <strong>example:</strong>
         * <p>CONTINUE</p>
         */
        @NameInMap("DefaultResult")
        public String defaultResult;

        /**
         * <p>The period of time before the lifecycle hook times out. When the lifecycle hook times out, Auto Scaling performs the action that is specified by DefaultResult. Valid values: 30 to 21600. Unit: seconds.</p>
         * <p>After you create a lifecycle hook, you can call the RecordLifecycleActionHeartbeat operation to extend the timeout period of the lifecycle hook. You can also call the CompleteLifecycleAction operation to end the timeout period of the lifecycle hook ahead of scheduled.</p>
         * <p>Default value: 600.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("HeartbeatTimeout")
        public Integer heartbeatTimeout;

        /**
         * <p>The name of the lifecycle hook. After you specify this parameter, you cannot change the name of the lifecycle hook. If you do not specify this parameter, the name of the lifecycle hook is the same as the ID of the lifecycle hook.</p>
         * 
         * <strong>example:</strong>
         * <p>lifecyclehook****</p>
         */
        @NameInMap("LifecycleHookName")
        public String lifecycleHookName;

        /**
         * <p>The type of the scaling activity to which you want to apply the lifecycle hook. Valid values:</p>
         * <ul>
         * <li>SCALE_OUT</li>
         * <li>SCALE_IN</li>
         * </ul>
         * <blockquote>
         * <p> If you specify lifecycle hooks for the scaling group, you must specify LifecycleTransition. Other parameters are optional.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SCALE_OUT</p>
         */
        @NameInMap("LifecycleTransition")
        public String lifecycleTransition;

        /**
         * <p>The identifier of the notification recipient party when the lifecycle hook takes effect. You can specify a Message Service (MNS) topic or queue as the notification recipient party. Specify the value in the acs:ess:{region}:{account-id}:{resource-relative-id} format.</p>
         * <ul>
         * <li>region: the region ID of the scaling group</li>
         * <li>account-id: the ID of your Alibaba Cloud account.</li>
         * </ul>
         * <p>Examples:</p>
         * <ul>
         * <li>MNS queue: acs:ess:{region}:{account-id}:queue/{queuename}</li>
         * <li>MNS topic: acs:ess:{region}:{account-id}:topic/{topicname}</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acs:ess:cn-hangzhou:1111111111:queue/queue2</p>
         */
        @NameInMap("NotificationArn")
        public String notificationArn;

        /**
         * <p>The fixed string that you want to include in a notification. When a lifecycle hook takes effect, Auto Scaling sends a notification. The fixed string can contain up to 4,096 characters in length. When Auto Scaling sends a notification to the recipient party, it includes predefined notification metadata into the notification. This helps in managing and labeling notifications of different categories. notificationmetadata takes effect only if you specify notificationarn.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
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

    public static class CreateScalingGroupRequestLoadBalancerConfigs extends TeaModel {
        /**
         * <p>The ID of the CLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-2zen1olhfg9yw3f4qgte4</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The weight of each ECS instance as a backend server in the CLB backend server group. If you increase the weight for an ECS instance, the number of requests that are forwarded to the ECS instance also increases. If you set the weight for an ECS instance to 0, no requests are forwarded to the ECS instance. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static CreateScalingGroupRequestLoadBalancerConfigs build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingGroupRequestLoadBalancerConfigs self = new CreateScalingGroupRequestLoadBalancerConfigs();
            return TeaModel.build(map, self);
        }

        public CreateScalingGroupRequestLoadBalancerConfigs setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public CreateScalingGroupRequestLoadBalancerConfigs setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class CreateScalingGroupRequestServerGroups extends TeaModel {
        /**
         * <p>The port number used by each ECS instance as backend server in the vServer group. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-5yc3bd9lfyh*****</p>
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        /**
         * <p>The type of the server group. Valid values:</p>
         * <ul>
         * <li>ALB</li>
         * <li>NLB</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALB</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The weight of each ECS instance as a backend server in the server group. Valid values: 0 to 100.</p>
         * <p>If you increase the weight for an ECS instance, the number of requests that are forwarded to the ECS instance also increases. If you set the weight for an ECS instance to 0, no requests are forwarded to the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static CreateScalingGroupRequestServerGroups build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingGroupRequestServerGroups self = new CreateScalingGroupRequestServerGroups();
            return TeaModel.build(map, self);
        }

        public CreateScalingGroupRequestServerGroups setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateScalingGroupRequestServerGroups setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        public CreateScalingGroupRequestServerGroups setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateScalingGroupRequestServerGroups setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class CreateScalingGroupRequestTags extends TeaModel {
        /**
         * <p>The tag key that you want to add to the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>Department</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Specifies whether to propagate the tag that you want to add to the scaling group. Valid values:</p>
         * <ul>
         * <li>true: propagates the tag to only instances that are newly created.</li>
         * <li>false: does not propagate the tag to any instances.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Propagate")
        public Boolean propagate;

        /**
         * <p>The tag value that you want to add to the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>Finance</p>
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

        public CreateScalingGroupRequestTags setPropagate(Boolean propagate) {
            this.propagate = propagate;
            return this;
        }
        public Boolean getPropagate() {
            return this.propagate;
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
         * <p>The port number used by each ECS instance as a backend server in the vServer group. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the vServer group.</p>
         * 
         * <strong>example:</strong>
         * <p>rsp-bp1443g77****</p>
         */
        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        /**
         * <p>The weight of each ECS instance as a backend server in the vServer group. If you increase the weight for an ECS instance, the number of requests that are forwarded to the ECS instance also increases. If you set the weight for an ECS instance to 0, no requests are forwarded to the ECS instance. Valid values: 0 to 100.</p>
         * <p>Default value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
         * <p>The ID of the CLB instance to which the backend vServer group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp1u7etiogg38yvwz****</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The attributes of the backend vServer group.</p>
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
