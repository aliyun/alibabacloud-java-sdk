// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CreateScalingGroupRequest extends TeaModel {
    /**
     * <p>The collection of information about the ALB server groups.</p>
     */
    @NameInMap("AlbServerGroups")
    public java.util.List<CreateScalingGroupRequestAlbServerGroups> albServerGroups;

    /**
     * <p>The capacity allocation policy, which determines how the scaling group selects available instance types to meet the capacity requirements. The capacity distribution policy applies to both pay-as-you-go and spot capacities. This parameter takes effect only when the MultiAZPolicy parameter is set to COMPOSABLE. Valid values:</p>
     * <ul>
     * <li>priority: Creates instances based on the order of the configured instance types.</li>
     * <li>lowestPrice: Creates instances based on the unit price per vCPU of the instance types in ascending order.</li>
     * </ul>
     * <p>Default value: priority.</p>
     * 
     * <strong>example:</strong>
     * <p>priority</p>
     */
    @NameInMap("AllocationStrategy")
    public String allocationStrategy;

    /**
     * <p>Specifies whether to enable automatic balancing for the scaling group. This parameter takes effect only when BalancedOnly is enabled for the zone-balanced scaling group. Valid values:</p>
     * <ul>
     * <li>false: Does not enable automatic balancing for the scaling group.</li>
     * <li>true: Enables automatic balancing for the scaling group. The scaling group automatically detects the capacity across zones. When the capacity is unbalanced across zones, the scaling group proactively scales out or in to rebalance the capacity across zones.</li>
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
     * <blockquote>
     * <p>If the MultiAZPolicy parameter is set to COMPOSABLE and the AzBalance parameter is set to true, the effect is the same as when the MultiAZPolicy parameter is set to BALANCE.</p>
     * </blockquote>
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
     * <li><p>BalancedBestEffort: When resource creation fails in a zone, the system falls back to other zones to ensure best-effort delivery of resources.</p>
     * </li>
     * <li><p>BalancedOnly: When resource creation fails in a zone, the system does not fall back to other zones. The scale-out activity partially succeeds to avoid excessive imbalance of resources across different zones.</p>
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
    public CreateScalingGroupRequestCapacityOptions capacityOptions;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25965.html">Ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to automatically attempt to create pay-as-you-go instances to meet the required number of ECS instances when the MultiAZPolicy parameter is set to COST_OPTIMIZED and sufficient spot instances cannot be created due to price or inventory reasons. Valid values:</p>
     * <ul>
     * <li>true: allows the creation.</li>
     * <li>false: does not allow the creation.</li>
     * </ul>
     * <p>Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CompensateWithOnDemand")
    public Boolean compensateWithOnDemand;

    /**
     * <p>The ECI instance ID, which is the container group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>eci-uf6fonnghi50u374****</p>
     */
    @NameInMap("ContainerGroupId")
    public String containerGroupId;

    /**
     * <p>The ARN of the Function Compute function for the custom scale-in policy. This parameter takes effect only when the first removal policy configured in RemovalPolicies is CustomPolicy.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:fc:cn-zhangjiakou:16145688****:services/ess_custom_terminate_policy.LATEST/functions/ess_custom_terminate_policy_name</p>
     */
    @NameInMap("CustomPolicyARN")
    public String customPolicyARN;

    /**
     * <p>The IDs of the ApsaraDB RDS instances. The value can be a JSON array that contains multiple ApsaraDB RDS instance IDs. Separate multiple IDs with commas (,). </p>
     * <p>&lt;props=&quot;china&quot;&gt;The maximum number of ApsaraDB RDS instances that can be associated with a scaling group depends on your Auto Scaling usage. Go to <a href="https://quotas.console.aliyun.com/products/ess/quotas">Quota Center</a> to check the quota for the <strong>maximum number of ApsaraDB RDS instances that can be associated with a scaling group</strong>.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;The maximum number of ApsaraDB RDS instances that can be associated with a scaling group depends on your Auto Scaling usage. Go to <a href="https://quotas.console.aliyun.com/products/ess/quotas">Quota Center</a> to check the quota for the <strong>maximum number of ApsaraDB RDS instances that can be associated with a scaling group</strong>.</p>
     * <p>&lt;props=&quot;partner&quot;&gt;The maximum number of ApsaraDB RDS instances that can be associated with a scaling group depends on your Auto Scaling usage. Go to Quota Center to check the quota for the <strong>maximum number of ApsaraDB RDS instances that can be associated with a scaling group</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;rm-bp142f86de0t7****&quot;, &quot;rm-bp18l1z42ar4o****&quot;, &quot;rm-bp1lqr97h4aqk****&quot;]</p>
     */
    @NameInMap("DBInstanceIds")
    public String DBInstanceIds;

    /**
     * <p>The list of databases associated with the scaling group.</p>
     */
    @NameInMap("DBInstances")
    public java.util.List<CreateScalingGroupRequestDBInstances> DBInstances;

    /**
     * <p>The cooldown time after a scaling activity (adding or removing instances) is completed. Valid values: 0 to 86400. Unit: seconds.</p>
     * <p>During the cooldown time, the scaling group does not execute other scaling activities. This parameter takes effect only for scaling activities triggered by CloudMonitor event-triggered tasks.  </p>
     * <p>Default value: 300.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("DefaultCooldown")
    public Integer defaultCooldown;

    /**
     * <p>The expected number of instances in the scaling group. The scaling group automatically maintains the number of instances at the expected number. The value cannot be greater than MaxSize or less than MinSize.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("DesiredCapacity")
    public Integer desiredCapacity;

    /**
     * <p>Specifies whether to enable deletion protection for the scaling group. Valid values:</p>
     * <ul>
     * <li>true: enables deletion protection for the scaling group. In this case, the scaling group cannot be deleted.</li>
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
     * <p>The type of instances managed by the scaling group. Valid values:</p>
     * <ul>
     * <li><p>ECS: the scaling group manages ECS instances.</p>
     * </li>
     * <li><p>ECI: the scaling group manages ECI instances.</p>
     * </li>
     * </ul>
     * <p>Default value: ECS.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>The health check type of the scaling group. Valid values:</p>
     * <ul>
     * <li>NONE: disables health checks.</li>
     * <li>ECS: performs health checks on instances in the scaling group. This value is used to enable instance health checks for both ECS and ECI scaling groups.</li>
     * <li>LOAD_BALANCER: determines the health status of instances based on the health check results of the load balancer. CLB is not supported.</li>
     * </ul>
     * <p>Default value: ECS.</p>
     * <blockquote>
     * <p>If you want to enable both instance health checks and load balancer health checks, use the <code>HealthCheckTypes</code> parameter.</p>
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
     * <p>You can set multiple values for this parameter to enable multiple health check options. If the HealthCheckType parameter is specified, this parameter is ignored.</p>
     * </blockquote>
     */
    @NameInMap("HealthCheckTypes")
    public java.util.List<String> healthCheckTypes;

    /**
     * <p>The ID of the instance. When you create a scaling group, Auto Scaling obtains the required configuration information from the specified instance and automatically creates a scaling configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>i-28wt4****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the launch template. This parameter is used to specify the launch template from which the scaling group obtains launch configurations.</p>
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
    public java.util.List<CreateScalingGroupRequestLaunchTemplateOverrides> launchTemplateOverrides;

    /**
     * <p>The version of the launch template. Valid values:</p>
     * <ul>
     * <li><p>A specific version number.</p>
     * </li>
     * <li><p>Default: always uses the default version of the launch template.</p>
     * </li>
     * <li><p>Latest: always uses the latest version of the launch template.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("LaunchTemplateVersion")
    public String launchTemplateVersion;

    /**
     * <p>The list of lifecycle hook information.</p>
     */
    @NameInMap("LifecycleHooks")
    public java.util.List<CreateScalingGroupRequestLifecycleHooks> lifecycleHooks;

    /**
     * <p>The list of load balancing configurations.</p>
     */
    @NameInMap("LoadBalancerConfigs")
    public java.util.List<CreateScalingGroupRequestLoadBalancerConfigs> loadBalancerConfigs;

    /**
     * <p>The IDs of the Classic Load Balancer (CLB) instances. The value can be a JSON array that contains multiple CLB instance IDs. Separate multiple IDs with commas (,).</p>
     * <p>&lt;props=&quot;china&quot;&gt;The maximum number of CLB instances that can be associated with a scaling group depends on your Auto Scaling usage. Go to <a href="https://quotas.console.aliyun.com/products/ess/quotas">Quota Center</a> to check the quota for the <strong>maximum number of load balancing instances that can be associated with a scaling group</strong>.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;The maximum number of CLB instances that can be associated with a scaling group depends on your Auto Scaling usage. Go to <a href="https://quotas.console.aliyun.com/products/ess/quotas">Quota Center</a> to check the quota for the <strong>maximum number of load balancing instances that can be associated with a scaling group</strong>.</p>
     * <p>&lt;props=&quot;partner&quot;&gt;The maximum number of CLB instances that can be associated with a scaling group depends on your Auto Scaling usage. Go to Quota Center to check the quota for the <strong>maximum number of load balancing instances that can be associated with a scaling group</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;lb-bp1u7etiogg38yvwz****&quot;, &quot;lb-bp168cqrux9ai9l7f****&quot;, &quot;lb-bp1jv3m9zvj22ufxp****&quot;]</p>
     */
    @NameInMap("LoadBalancerIds")
    public String loadBalancerIds;

    /**
     * <p>The maximum lifetime of an instance in the scaling group. Unit: seconds.</p>
     * <p>Valid values: [86400, Integer.maxValue].</p>
     * <p>Default value: null.</p>
     * 
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("MaxInstanceLifetime")
    public Integer maxInstanceLifetime;

    /**
     * <p>The maximum number of instances in the scaling group. If the number of instances in the scaling group is greater than the value of MaxSize, Auto Scaling automatically removes instances. </p>
     * <p>&lt;props=&quot;china&quot;&gt;The value range of MaxSize depends on your Auto Scaling usage. Go to <a href="https://quotas.console.aliyun.com/products/ess/quotas">Quota Center</a> to check the quota for the <strong>maximum number of instances in a scaling group</strong>.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;The value range of MaxSize depends on your Auto Scaling usage. Go to <a href="https://quotas.console.aliyun.com/products/ess/quotas">Quota Center</a> to check the quota for the <strong>maximum number of instances in a scaling group</strong>.</p>
     * <p>&lt;props=&quot;partner&quot;&gt;The value range of MaxSize depends on your Auto Scaling usage. Go to Quota Center to check the quota for the <strong>maximum number of instances in a scaling group</strong>.</p>
     * <p>If the quota for the <strong>maximum number of instances in a scaling group</strong> is 2000, the value range of MaxSize is 0 to 2000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxSize")
    public Integer maxSize;

    /**
     * <p>The minimum number of instances in the scaling group. If the number of instances in the scaling group is less than the value of MinSize, Auto Scaling automatically creates instances. </p>
     * <blockquote>
     * <p>The value of MinSize must be less than or equal to the value of MaxSize.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MinSize")
    public Integer minSize;

    /**
     * <p>The multi-zone scaling policy for ECS instances in the scaling group. Valid values: </p>
     * <ul>
     * <li><p>PRIORITY: the vSwitches specified by VSwitchIds are prioritized. Auto Scaling preferentially attempts to scale ECS instances in the zone where the highest-priority vSwitch resides. If the scaling fails, Auto Scaling automatically attempts to scale instances in the zone of the next highest-priority vSwitch.  </p>
     * </li>
     * <li><p>COST_OPTIMIZED: during scale-out, Auto Scaling attempts to create ECS instances in ascending order of vCPU unit price. During scale-in, Auto Scaling attempts to remove ECS instances in descending order of vCPU unit price. If the scaling configuration settings specify multiple instance types that use the preemptible billing method, spot instances are preferentially created. You can use the CompensateWithOnDemand parameter to specify whether to automatically attempt to create pay-as-you-go instances when spot instances cannot be created due to insufficient inventory or other reasons. </p>
     * <blockquote>
     * <p>COST_OPTIMIZED takes effect only when the scaling configuration settings specify multiple instance types or use spot instances. </p>
     * </blockquote>
     * </li>
     * <li><p>BALANCE: evenly distributes ECS instances across the zones specified for the scaling group. If the instances are unevenly allocated across zones due to insufficient inventory or other reasons, you can invoke the <a href="https://help.aliyun.com/document_detail/71516.html">RebalanceInstance</a> operation to balance the resources.</p>
     * <blockquote>
     * <p>If the <code>MultiAZPolicy</code> parameter is set to <code>BALANCE</code>, the effect is the same as when the <code>MultiAZPolicy</code> parameter is set to <code>COMPOSABLE</code> and the <code>AzBalance</code> parameter is set to <code>true</code>. </p>
     * </blockquote>
     * </li>
     * <li><p>COMPOSABLE: a combined policy that allows you to combine the preceding multi-zone scaling policies for ECS instances based on your needs. You can also specify additional parameters to control the capacity of the scaling group in a more fine-grained manner.</p>
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
     * <p>The minimum number of pay-as-you-go instances required in the scaling group. Valid values: 0 to 1000. If the number of pay-as-you-go instances is less than this value, pay-as-you-go instances are preferentially created.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("OnDemandBaseCapacity")
    public Integer onDemandBaseCapacity;

    /**
     * <p>The percentage of pay-as-you-go instances in the excess instances after the scaling group meets the minimum number of pay-as-you-go instances (OnDemandBaseCapacity). Valid values: 0 to 100.</p>
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
     * <p>The filtering policy for the instance removal policy. Valid values:</p>
     * <ul>
     * <li>OldestInstance: removes the ECS instances that were added to the scaling group at the earliest point in time.</li>
     * <li>NewestInstance: removes the ECS instances that were added to the scaling group at the latest point in time.</li>
     * <li>OldestScalingConfiguration: removes the ECS instances that were created based on the earliest scaling configuration.</li>
     * <li>CustomPolicy: removes ECS instances based on a custom scale-in policy function.</li>
     * </ul>
     * <p>The scaling configuration mentioned in OldestScalingConfiguration refers to the instance configuration source in the scaling group, including scaling configurations and launch templates. CustomPolicy can only be set as the first removal policy. If you specify CustomPolicy, you must also specify the CustomPolicyARN parameter.</p>
     * <blockquote>
     * <p>The removal of ECS instances from a scaling group is also affected by the multi-zone scaling policy (MultiAZPolicy) of the scaling group. For more information, see <a href="https://help.aliyun.com/document_detail/254822.html">Configure a combined policy for removing instances</a>.</p>
     * </blockquote>
     */
    @NameInMap("RemovalPolicies")
    public java.util.List<String> removalPolicies;

    /**
     * <p>The ID of the resource group to which the newly created scaling group belongs.</p>
     * <blockquote>
     * <p>Assigns the newly created scaling group to the specified resource group. If you do not specify this parameter, the scaling group belongs to the default resource group.</p>
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
     * <p>The name of the scaling group. The name must be unique within a region.</p>
     * <p>It must be 2 to 64 characters in length. It must start with a digit, a letter, or a Chinese character, and can contain digits, underscores (_), hyphens (-), and periods (.).</p>
     * <p>Default value: the value of ScalingGroupId.</p>
     * 
     * <strong>example:</strong>
     * <p>scalinggroup****</p>
     */
    @NameInMap("ScalingGroupName")
    public String scalingGroupName;

    /**
     * <p>The reclaim mode of the scaling group. Valid values: </p>
     * <ul>
     * <li>recycle: sets the reclaim mode of the scaling group to shutdown and reclaim mode.  </li>
     * <li>release: sets the reclaim mode of the scaling group to release mode.</li>
     * <li>forcerelease: sets the reclaim mode of the scaling group to force release mode.<blockquote>
     * <p>If you select forcerelease, the system forcibly releases instances in the <code>Running</code> state during scale-down activities. Forcibly releasing an instance is equivalent to a power-off operation, which erases temporary data in the memory and storage of the instance. The data cannot be recovered. Proceed with caution.</p>
     * </blockquote>
     * </li>
     * <li>forcerecycle: sets the reclaim mode of the scaling group to force shutdown and reclaim mode.<blockquote>
     * <p>If you select forcerecycle, the system forcibly shuts down instances in the <code>Running</code> state during scale-down activities. Forcibly shutting down an instance is equivalent to a power-off operation, which erases temporary data in the memory and storage of the instance. The data cannot be recovered. Proceed with caution.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <p>The ScalingPolicy parameter specifies the reclaim mode of the scaling group, but the specific action taken when an instance is removed from the scaling group is determined by the RemovePolicy parameter of RemoveInstances. For more information, see <a href="https://help.aliyun.com/document_detail/25955.html">RemoveInstances</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>recycle</p>
     */
    @NameInMap("ScalingPolicy")
    public String scalingPolicy;

    /**
     * <p>The collection of information about the server groups.</p>
     * <blockquote>
     * <p>You cannot configure the same server group settings in both AlbServerGroups and ServerGroups at the same time.</p>
     * </blockquote>
     */
    @NameInMap("ServerGroups")
    public java.util.List<CreateScalingGroupRequestServerGroups> serverGroups;

    /**
     * <p>The spot capacity distribution policy. You can use this parameter to separately specify the distribution policy for spot capacity. This parameter takes effect only when the MultiAZPolicy parameter is set to COMPOSABLE. Valid values:</p>
     * <ul>
     * <li>priority: Creates instances based on the order of the configured instance types.</li>
     * <li>lowestPrice: Creates instances based on the unit price per vCPU of the instance types in ascending order.</li>
     * </ul>
     * <p>Default value: priority.</p>
     * 
     * <strong>example:</strong>
     * <p>lowestPrice</p>
     */
    @NameInMap("SpotAllocationStrategy")
    public String spotAllocationStrategy;

    /**
     * <p>The number of available instance types. The scaling group evenly creates spot instances across multiple instance types with the lowest cost. Valid values: 1 to 10.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("SpotInstancePools")
    public Integer spotInstancePools;

    /**
     * <p>Specifies whether to enable the Auto Scaling policy to supplement spot instances. After this feature is enabled, when a system message indicating that a spot instance is to be reclaimed is received, the scaling group attempts to create a new instance to replace the spot instance to be reclaimed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SpotInstanceRemedy")
    public Boolean spotInstanceRemedy;

    /**
     * <p>The timeout period for waiting for an ECS instance to be stopped during the scale-in process. Unit: seconds.
     * Valid values: 30 to 240.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter takes effect only in the scale-in process when ScalingPolicy is set to release.  </li>
     * <li>If this parameter is specified, the system waits for a maximum of the StopInstanceTimeout period for the instance to be stopped. After the timeout period elapses, the scale-in process continues regardless of whether the instance is stopped.  </li>
     * <li>If this parameter is not specified, the system waits for a long time for the instance to be stopped. The scale-in process continues only after the instance is stopped. If the instance fails to be stopped, the scale-in process is rolled back and the scale-in fails.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("StopInstanceTimeout")
    public Integer stopInstanceTimeout;

    /**
     * <blockquote>
     * <p>This parameter is not available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SyncAlarmRuleToCms")
    public Boolean syncAlarmRuleToCms;

    /**
     * <p>The collection of tag information for the scaling group.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateScalingGroupRequestTags> tags;

    /**
     * <p>The collection of information about the virtual server groups associated with the scaling group.</p>
     */
    @NameInMap("VServerGroups")
    public java.util.List<CreateScalingGroupRequestVServerGroups> VServerGroups;

    /**
     * <p>The ID of the vSwitch. After this parameter is specified, the network type of the scaling group is VPC.</p>
     * <blockquote>
     * <p>If neither VSwitchId nor VSwitchIds is specified for the scaling group, the network type of the scaling group is classic network by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp14zolna43z266bq****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The IDs of one or more vSwitches. If you use the VSwitchIds parameter, the VSwitchId parameter is ignored. After this parameter is specified, the network type of the scaling group is VPC.</p>
     * <p>When you specify multiple vSwitches:</p>
     * <ul>
     * <li><p>The vSwitches must belong to the same VPC.</p>
     * </li>
     * <li><p>The vSwitches can belong to different zones.</p>
     * </li>
     * <li><p>The vSwitches are prioritized in ascending order of numbers. 1 indicates the highest priority. If instances cannot be created in the zone of a higher-priority vSwitch, the system automatically selects the next highest-priority vSwitch to create instances.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If neither VSwitchId nor VSwitchIds is specified for the scaling group, the network type of the scaling group is classic network by default.</p>
     * </blockquote>
     */
    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    /**
     * <p>The behavior policy of the scaling group during zone shift.</p>
     */
    @NameInMap("ZoneShiftPolicy")
    public CreateScalingGroupRequestZoneShiftPolicy zoneShiftPolicy;

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

    public CreateScalingGroupRequest setAutoRebalance(Boolean autoRebalance) {
        this.autoRebalance = autoRebalance;
        return this;
    }
    public Boolean getAutoRebalance() {
        return this.autoRebalance;
    }

    public CreateScalingGroupRequest setAzBalance(Boolean azBalance) {
        this.azBalance = azBalance;
        return this;
    }
    public Boolean getAzBalance() {
        return this.azBalance;
    }

    public CreateScalingGroupRequest setBalanceMode(String balanceMode) {
        this.balanceMode = balanceMode;
        return this;
    }
    public String getBalanceMode() {
        return this.balanceMode;
    }

    public CreateScalingGroupRequest setCapacityOptions(CreateScalingGroupRequestCapacityOptions capacityOptions) {
        this.capacityOptions = capacityOptions;
        return this;
    }
    public CreateScalingGroupRequestCapacityOptions getCapacityOptions() {
        return this.capacityOptions;
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

    public CreateScalingGroupRequest setStopInstanceTimeout(Integer stopInstanceTimeout) {
        this.stopInstanceTimeout = stopInstanceTimeout;
        return this;
    }
    public Integer getStopInstanceTimeout() {
        return this.stopInstanceTimeout;
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

    public CreateScalingGroupRequest setZoneShiftPolicy(CreateScalingGroupRequestZoneShiftPolicy zoneShiftPolicy) {
        this.zoneShiftPolicy = zoneShiftPolicy;
        return this;
    }
    public CreateScalingGroupRequestZoneShiftPolicy getZoneShiftPolicy() {
        return this.zoneShiftPolicy;
    }

    public static class CreateScalingGroupRequestAlbServerGroups extends TeaModel {
        /**
         * <p>The ID of the ALB server group.</p>
         * <p>A scaling group supports a limited number of associated ALB server groups. To view or manually apply for a quota increase, go to the <a href="https://quotas.console.aliyun.com/products/ess/quotas">Quota Center</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-ddwb0y0g6y9bjm****</p>
         */
        @NameInMap("AlbServerGroupId")
        public String albServerGroupId;

        /**
         * <p>The port number used by the instance after Auto Scaling adds the instance to the ALB server group. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The weight of the instance as a backend server after Auto Scaling adds the instance to the ALB server group. A higher weight specifies that more requests are distributed to the instance. If the weight is 0, the instance does not receive requests. Valid values: 0 to 100.</p>
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

    public static class CreateScalingGroupRequestCapacityOptions extends TeaModel {
        /**
         * <p>Specifies whether to allow the system to automatically attempt to create pay-as-you-go instances to meet the required number of ECS instances when the MultiAZPolicy parameter is set to COST_OPTIMIZED and sufficient spot instances cannot be created due to price or inventory reasons. Valid values:</p>
         * <ul>
         * <li>true: Allowed.</li>
         * <li>false: Not allowed.</li>
         * </ul>
         * <p>Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CompensateWithOnDemand")
        public Boolean compensateWithOnDemand;

        /**
         * <p>The minimum number of pay-as-you-go instances required in the scaling group. When the number of pay-as-you-go instances in the scaling group is less than this value, the system preferentially creates pay-as-you-go instances. Valid values: 0 to 1000.</p>
         * <p>When the MultiAZPolicy parameter is set to COMPOSABLE, the default value is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("OnDemandBaseCapacity")
        public Integer onDemandBaseCapacity;

        /**
         * <p>The percentage of pay-as-you-go instances in the excess instances after the scaling group meets the minimum number of pay-as-you-go instances specified by OnDemandBaseCapacity. Valid values: 0 to 100.</p>
         * <p>When the MultiAZPolicy parameter is set to COMPOSABLE, the default value is 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("OnDemandPercentageAboveBaseCapacity")
        public Integer onDemandPercentageAboveBaseCapacity;

        /**
         * <p>The price comparison mode for the cost optimization policy of the scaling group. Valid values:</p>
         * <ul>
         * <li><p>PricePerUnit: Compares prices based on the price per unit of capacity.</p>
         * <p>The capacity of an instance in the scaling group is equal to the weight set for the instance type. The default weight is 1, which means one ECS instance occupies a capacity of 1.</p>
         * </li>
         * <li><p>PricePerVCpu: Compares prices based on the price per vCPU.</p>
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
         * <p>Specifies whether to attempt to use spot instances to replace pay-as-you-go capacity when CompensateWithOnDemand is enabled and the proportion of pay-as-you-go instances exceeds the OnDemandPercentageAboveBaseCapacity value. In common scenarios where CompensateWithOnDemand downgrades spot instances to pay-as-you-go instances due to spot inventory or price reasons, this parameter attempts to use spot instances to replace the excess pay-as-you-go capacity to avoid long-term existence of pay-as-you-go instances. Valid values:</p>
         * <ul>
         * <li>true: Allowed.</li>
         * <li>false: Not allowed.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SpotAutoReplaceOnDemand")
        public Boolean spotAutoReplaceOnDemand;

        public static CreateScalingGroupRequestCapacityOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingGroupRequestCapacityOptions self = new CreateScalingGroupRequestCapacityOptions();
            return TeaModel.build(map, self);
        }

        public CreateScalingGroupRequestCapacityOptions setCompensateWithOnDemand(Boolean compensateWithOnDemand) {
            this.compensateWithOnDemand = compensateWithOnDemand;
            return this;
        }
        public Boolean getCompensateWithOnDemand() {
            return this.compensateWithOnDemand;
        }

        public CreateScalingGroupRequestCapacityOptions setOnDemandBaseCapacity(Integer onDemandBaseCapacity) {
            this.onDemandBaseCapacity = onDemandBaseCapacity;
            return this;
        }
        public Integer getOnDemandBaseCapacity() {
            return this.onDemandBaseCapacity;
        }

        public CreateScalingGroupRequestCapacityOptions setOnDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
            this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
            return this;
        }
        public Integer getOnDemandPercentageAboveBaseCapacity() {
            return this.onDemandPercentageAboveBaseCapacity;
        }

        public CreateScalingGroupRequestCapacityOptions setPriceComparisonMode(String priceComparisonMode) {
            this.priceComparisonMode = priceComparisonMode;
            return this;
        }
        public String getPriceComparisonMode() {
            return this.priceComparisonMode;
        }

        public CreateScalingGroupRequestCapacityOptions setSpotAutoReplaceOnDemand(Boolean spotAutoReplaceOnDemand) {
            this.spotAutoReplaceOnDemand = spotAutoReplaceOnDemand;
            return this;
        }
        public Boolean getSpotAutoReplaceOnDemand() {
            return this.spotAutoReplaceOnDemand;
        }

    }

    public static class CreateScalingGroupRequestDBInstances extends TeaModel {
        /**
         * <p>The association mode between the scaling group and the database. Valid values:</p>
         * <ul>
         * <li>SecurityIp: Modifies the IP whitelist mode by automatically adding scaled-out instances to the IP whitelist of the database. Only ApsaraDB RDS databases are supported.</li>
         * <li>SecurityGroup: Uses the security group mode by adding the security group of the scaling configuration to the security group whitelist of the database to allow instances in the security group to access the database.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SecurityIp</p>
         */
        @NameInMap("AttachMode")
        public String attachMode;

        /**
         * <p>The database instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-m5eqju85s45mu0***</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The type of the database. Valid values:</p>
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
         * <p>If you want the scaling group to scale based on the capacity of the instance type, specify both this parameter and LaunchTemplateOverrides.WeightedCapacity.</p>
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
         * <p>This parameter is used to specify the maximum price for the overridden instance type (namely, <code>LaunchTemplateOverride.InstanceType</code>) in the launch template.</p>
         * <blockquote>
         * <p>This parameter takes effect only when the <code>LaunchTemplateId</code> parameter is specified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.025</p>
         */
        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        /**
         * <p>If you want the scaling group to scale based on the capacity of the instance type, specify this parameter after you specify LaunchTemplateOverrides.InstanceType.</p>
         * <p>This parameter is used to specify the weight of the instance type, which indicates the capacity represented by a single instance of the instance type in the scaling group. A larger weight indicates that fewer instances of this instance type are required to meet the expected capacity.</p>
         * <p>Because performance metrics such as the number of vCPUs and memory size vary among instance types, you can configure different weights for different instance types based on your needs.</p>
         * <p>Example:</p>
         * <ul>
         * <li><p>Current capacity: 0.</p>
         * </li>
         * <li><p>Expected capacity: 6.</p>
         * </li>
         * <li><p>Capacity of the ecs.c5.xlarge instance type: 4.</p>
         * </li>
         * </ul>
         * <p>To meet the expected capacity, the scaling group scales out two ecs.c5.xlarge instances for you.</p>
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
         * <p>The action to be performed after the wait state ends. Valid values:</p>
         * <ul>
         * <li><p>CONTINUE: continues the response to the scale-out activity or continues the response to the scale-down activity.</p>
         * </li>
         * <li><p>ABANDON: directly releases the instances created by the scale-out activity or directly removes the instances in the scale-down activity from the scaling group.</p>
         * </li>
         * </ul>
         * <p>When a scale-down activity (SCALE_IN) occurs in the scaling group and triggers multiple lifecycle hooks, if the wait state triggered by a lifecycle hook whose DefaultResult is ABANDON ends, the other corresponding wait states end in advance. In other cases, the next action is subject to the next action of the last wait state that ends.</p>
         * <p>Default value: CONTINUE.</p>
         * 
         * <strong>example:</strong>
         * <p>CONTINUE</p>
         */
        @NameInMap("DefaultResult")
        public String defaultResult;

        /**
         * <p>The wait time set by the lifecycle hook for the scaling group activity. After the wait state times out, the next action is performed. Valid values: 30 to 21600. Unit: seconds.</p>
         * <p>After you create a lifecycle hook, you can call RecordLifecycleActionHeartbeat to extend the wait time of the instance, or call CompleteLifecycleAction to end the wait state of the scaling activity in advance.</p>
         * <p>Default value: 600.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("HeartbeatTimeout")
        public Integer heartbeatTimeout;

        /**
         * <p>The name of the lifecycle hook. The name cannot be modified after it is specified. If you do not specify this parameter, the default value is the same as the lifecycle hook ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lifecyclehook****</p>
         */
        @NameInMap("LifecycleHookName")
        public String lifecycleHookName;

        /**
         * <p>The type of scaling activity to which the lifecycle hook applies. Valid values:</p>
         * <ul>
         * <li><p>SCALE_OUT: scale-out activities of the scaling group.</p>
         * </li>
         * <li><p>SCALE_IN: scale-down activities of the scaling group.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If you specify a lifecycle hook for the scaling group, this parameter is required, and other related parameters are optional.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SCALE_OUT</p>
         */
        @NameInMap("LifecycleTransition")
        public String lifecycleTransition;

        /**
         * <p>The identifier of the notification recipient for the lifecycle hook. Simple Message Queue (formerly MNS) queues or topics are supported. The parameter value format is acs:ess:{region}:{account-id}:{resource-relative-id}.</p>
         * <ul>
         * <li><p>region: the region where the scaling group resides.</p>
         * </li>
         * <li><p>account-id: the Alibaba Cloud account ID.</p>
         * </li>
         * </ul>
         * <p>Examples:</p>
         * <ul>
         * <li><p>Simple Message Queue (formerly MNS) queue: acs:ess:{region}:{account-id}:queue/{queuename}.</p>
         * </li>
         * <li><p>Simple Message Queue (formerly MNS) topic: acs:ess:{region}:{account-id}:topic/{topicname}.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acs:ess:cn-hangzhou:1111111111:queue/queue2</p>
         */
        @NameInMap("NotificationArn")
        public String notificationArn;

        /**
         * <p>The fixed string information for the wait state of the scaling activity. The value cannot exceed 4,096 characters in length. Each time Auto Scaling pushes a message to the notification recipient, it also sends the predefined value of the NotificationMetadata parameter to help you manage and mark different types of notification information. The NotificationMetadata parameter takes effect only when you also specify the NotificationArn parameter.</p>
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
         * <p>lb-2zen1olhfg9yw3f4q****</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The weight of the instance as a backend server after Auto Scaling adds the instance to the CLB server group. A higher weight specifies that more requests are distributed to the instance. If the weight is 0, the instance does not receive requests. Valid values: 0 to 100.</p>
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
         * <p>The port number used by the instance after Auto Scaling adds the instance to the server group. Valid values: 1 to 65535.</p>
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
         * <li>ALB: Application Load Balancer (ALB).</li>
         * <li>NLB: Network Load Balancer (NLB).</li>
         * <li>GWLB: Gateway Load Balancer (GWLB).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALB</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The weight of the instance as a backend server after Auto Scaling adds the instance to the server group. Valid values: 0 to 100.</p>
         * <p>A higher weight specifies that more access requests are allocated to the instance. If the weight is 0, the instance does not receive access requests.</p>
         * <blockquote>
         * <p>This parameter is required for ALB and NLB. You cannot configure this parameter for GWLB.</p>
         * </blockquote>
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
         * <p>The tag key of the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>Department</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Specifies whether the tag is a propagatable tag. Valid values:</p>
         * <ul>
         * <li>true: tags on the scaling group are propagated only to newly created instances, not to existing instances in the scaling group.</li>
         * <li>false: tags on the scaling group are not propagated to instances.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Propagate")
        public Boolean propagate;

        /**
         * <p>The tag value of the scaling group.</p>
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
         * <p>The port number used by the instance after Auto Scaling adds the instance to the virtual server group. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the virtual server group.</p>
         * 
         * <strong>example:</strong>
         * <p>rsp-bp1443g77****</p>
         */
        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        /**
         * <p>The weight of the instance as a backend server after Auto Scaling adds the instance to the virtual server group. A higher weight indicates that more access requests are allocated to the instance. If the weight is 0, the instance does not receive access requests. Valid values: 0 to 100.</p>
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
         * <p>The ID of the Classic Load Balancer (CLB) instance to which the virtual server group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp1u7etiogg38yvwz****</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The attributes of the backend server group.</p>
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

    public static class CreateScalingGroupRequestZoneShiftPolicy extends TeaModel {
        /**
         * <p>The health check behavior in impaired zones. Valid values: </p>
         * <ul>
         * <li>ReplaceUnhealthy: Replaces unhealthy instances in all zones normally. </li>
         * <li>IgnoreUnhealthy: Does not replace unhealthy instances in impaired zones. Healthy zones are not affected.</li>
         * </ul>
         * <p>Default value: ReplaceUnhealthy.</p>
         * 
         * <strong>example:</strong>
         * <p>ReplaceUnhealthy</p>
         */
        @NameInMap("ImpairedZoneHealthCheckBehavior")
        public String impairedZoneHealthCheckBehavior;

        /**
         * <p>Blocks scale-in triggered by specified types of scaling rules. The blocking scope applies to all zones under the scaling group, not just the impaired zones. This prevents false scale-in caused by fake improvements in monitoring metrics due to unreachable instances in impaired zones. Valid values: </p>
         * <ul>
         * <li>StepScalingRule: Blocks scale-in triggered by step scaling rules. </li>
         * <li>TargetTrackingScalingRule: Blocks scale-in triggered by target tracking scaling rules. </li>
         * <li>None: Does not block.</li>
         * </ul>
         * <p>Default value: None.</p>
         * 
         * <strong>example:</strong>
         * <p>StepScalingRule</p>
         */
        @NameInMap("ScaleInBlockedRuleTypes")
        public java.util.List<String> scaleInBlockedRuleTypes;

        /**
         * <p>Specifies whether scale-out creates instances only in healthy zones during zone shift. Valid values: </p>
         * <ul>
         * <li>true: Scale-out creates instances only in healthy zones and skips impaired zones. </li>
         * <li>false: Scale-out is not restricted by zone and can create instances in any zone of the scaling group.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ScaleOutInHealthyZonesOnly")
        public Boolean scaleOutInHealthyZonesOnly;

        public static CreateScalingGroupRequestZoneShiftPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingGroupRequestZoneShiftPolicy self = new CreateScalingGroupRequestZoneShiftPolicy();
            return TeaModel.build(map, self);
        }

        public CreateScalingGroupRequestZoneShiftPolicy setImpairedZoneHealthCheckBehavior(String impairedZoneHealthCheckBehavior) {
            this.impairedZoneHealthCheckBehavior = impairedZoneHealthCheckBehavior;
            return this;
        }
        public String getImpairedZoneHealthCheckBehavior() {
            return this.impairedZoneHealthCheckBehavior;
        }

        public CreateScalingGroupRequestZoneShiftPolicy setScaleInBlockedRuleTypes(java.util.List<String> scaleInBlockedRuleTypes) {
            this.scaleInBlockedRuleTypes = scaleInBlockedRuleTypes;
            return this;
        }
        public java.util.List<String> getScaleInBlockedRuleTypes() {
            return this.scaleInBlockedRuleTypes;
        }

        public CreateScalingGroupRequestZoneShiftPolicy setScaleOutInHealthyZonesOnly(Boolean scaleOutInHealthyZonesOnly) {
            this.scaleOutInHealthyZonesOnly = scaleOutInHealthyZonesOnly;
            return this;
        }
        public Boolean getScaleOutInHealthyZonesOnly() {
            return this.scaleOutInHealthyZonesOnly;
        }

    }

}
