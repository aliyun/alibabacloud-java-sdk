// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CreateScalingGroupRequest extends TeaModel {
    /**
     * <p>The Application Load Balancer (ALB) server groups to associate with the scaling group.</p>
     */
    @NameInMap("AlbServerGroups")
    public java.util.List<CreateScalingGroupRequestAlbServerGroups> albServerGroups;

    /**
     * <p>The capacity allocation policy determines how the scaling group selects available instance types to meet capacity requirements. The policy applies to both on-demand and preemptible capacity (effective only when the <code>MultiAZPolicy</code> parameter is set to <code>COMPOSABLE</code>). Valid values:</p>
     * <ul>
     * <li><p>priority: Creates instances in the order of the configured instance types.</p>
     * </li>
     * <li><p>lowestPrice: Create instances based on the price per vCPU of instance types, from lowest to highest.</p>
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
     * <p>Specifies whether to enable automatic balancing for the scaling group. This setting takes effect only when BalancedOnly is enabled for a scaling group that is balanced across availability zones. Value range:</p>
     * <ul>
     * <li><p>false: Does not enable automatic balancing for the scaling group.</p>
     * </li>
     * <li><p>true: When automatic balancing for the scaling group is enabled, the scaling group automatically detects the capacity across availability zones. If the capacity is imbalanced, the scaling group proactively performs scaling across availability zones to rebalance the capacity.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRebalance")
    public Boolean autoRebalance;

    /**
     * <p>Specifies whether to evenly distribute the capacity of the scaling group across multiple availability zones. This parameter is valid only when <code>MultiAZPolicy</code> is set to <code>COMPOSABLE</code>. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The capacity of the scaling group is evenly distributed across multiple availability zones.</p>
     * </li>
     * <li><p><code>false</code>: The capacity of the scaling group is not evenly distributed across multiple availability zones.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If <code>MultiAZPolicy</code> is set to <code>COMPOSABLE</code> and <code>AzBalance</code> is set to <code>true</code>, the effect is the same as setting <code>MultiAZPolicy</code> to <code>BALANCE</code>.</p>
     * </blockquote>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AzBalance")
    public Boolean azBalance;

    /**
     * <p>The zone balancing mode is effective only when enabled. Valid values:</p>
     * <ul>
     * <li><p>BalancedBestEffort: If a resource fails to be created in an availability zone, the system falls back to other availability zones to ensure best-effort delivery.</p>
     * </li>
     * <li><p>BalancedOnly:
     * If resource creation fails in an availability zone, the system does not fall back to other availability zones. The scaling activity is partially successful, which prevents an excessive imbalance of resources across different availability zones.</p>
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
     * <p>A client-generated token to ensure the idempotence of the request.</p>
     * <p>The token must be unique across requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25965.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is effective only when <code>MultiAZPolicy</code> is set to <code>COST_OPTIMIZED</code>. If <code>true</code>, Auto Scaling creates on-demand instances to meet capacity requirements when spot instances are unavailable due to price or inventory. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Yes.</p>
     * </li>
     * <li><p><code>false</code>: No.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CompensateWithOnDemand")
    public Boolean compensateWithOnDemand;

    /**
     * <p>The ID of the ECI instance, also known as the container group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>eci-uf6fonnghi50u374****</p>
     */
    @NameInMap("ContainerGroupId")
    public String containerGroupId;

    /**
     * <p>The ARN of the custom scale-in policy function. This parameter is valid only when the first removal policy in <code>RemovalPolicies</code> is <code>CustomPolicy</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:fc:cn-zhangjiakou:16145688****:services/ess_custom_terminate_policy.LATEST/functions/ess_custom_terminate_policy_name</p>
     */
    @NameInMap("CustomPolicyARN")
    public String customPolicyARN;

    /**
     * <p>A JSON array of RDS instance IDs.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>The number of RDS instances that you can associate with a single scaling group varies based on your Auto Scaling usage. Go to <a href="https://quotas.console.aliyun.com/products/ess/quotas">Quota Center</a> to view the quota for <strong>Maximum number of RDS instances that can be associated with a single scaling group</strong>.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p>The number of RDS instances that you can associate with a single scaling group varies based on your Auto Scaling usage. Go to <a href="https://quotas.console.aliyun.com/products/ess/quotas">Quota Center</a> to view the quota for <strong>Maximum number of RDS instances that can be associated with a single scaling group</strong>.</p>
     * <p>&lt;props=&quot;partner&quot;&gt;</p>
     * <p>The number of RDS instances that you can associate with a single scaling group varies based on your Auto Scaling usage. Go to Quota Center to view the quota for <strong>Maximum number of RDS instances that can be associated with a single scaling group</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;rm-bp142f86de0t7****&quot;, &quot;rm-bp18l1z42ar4o****&quot;, &quot;rm-bp1lqr97h4aqk****&quot;]</p>
     */
    @NameInMap("DBInstanceIds")
    public String DBInstanceIds;

    /**
     * <p>The databases that are associated with the scaling group.</p>
     */
    @NameInMap("DBInstances")
    public java.util.List<CreateScalingGroupRequestDBInstances> DBInstances;

    /**
     * <p>The cooldown period, in seconds, after a scaling activity completes. Valid values: 0 to 86400.</p>
     * <p>During the cooldown period, the scaling group does not execute other scaling activities that are triggered by CloudMonitor alarm tasks.</p>
     * <p>Default value: 300.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("DefaultCooldown")
    public Integer defaultCooldown;

    /**
     * <p>The desired number of instances in the scaling group. Auto Scaling automatically maintains this number of instances. The value must be less than or equal to <code>MaxSize</code> and greater than or equal to <code>MinSize</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("DesiredCapacity")
    public Integer desiredCapacity;

    /**
     * <p>Specifies whether to enable deletion protection for the scaling group. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Enables deletion protection. The scaling group cannot be deleted.</p>
     * </li>
     * <li><p><code>false</code>: Disables deletion protection.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("GroupDeletionProtection")
    public Boolean groupDeletionProtection;

    /**
     * <p>The type of instances managed by the scaling group. Valid values:</p>
     * <ul>
     * <li><p><code>ECS</code>: The scaling group manages ECS instances.</p>
     * </li>
     * <li><p><code>ECI</code>: The scaling group manages ECI instances.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>ECS</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>The health check method for the scaling group. Valid values:</p>
     * <ul>
     * <li><p><code>NONE</code>: No health checks are performed.</p>
     * </li>
     * <li><p><code>ECS</code>: Health checks are performed on instances in the scaling group. This value enables health checks for scaling groups of both the ECS and ECI types.</p>
     * </li>
     * <li><p><code>LOAD_BALANCER</code>: The instance health status is based on health check results from the attached load balancer. This option does not support Classic Load Balancer (CLB) instances.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>ECS</code>.</p>
     * <blockquote>
     * <p>To enable both instance health checks and load balancer health checks, use the <code>HealthCheckTypes</code> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("HealthCheckType")
    public String healthCheckType;

    /**
     * <p>The health check methods for the scaling group.</p>
     * <blockquote>
     * <p>You can use this parameter to set multiple values and enable multiple health check options. If you set the <code>HealthCheckType</code> parameter, this parameter is ignored.</p>
     * </blockquote>
     */
    @NameInMap("HealthCheckTypes")
    public java.util.List<String> healthCheckTypes;

    /**
     * <p>The ID of an existing instance to use as a template. Auto Scaling uses this instance to create a new scaling configuration for the scaling group.</p>
     * 
     * <strong>example:</strong>
     * <p>i-28wt4****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the launch template that provides the configuration for the scaling group.</p>
     * 
     * <strong>example:</strong>
     * <p>lt-m5e3ofjr1zn1aw7****</p>
     */
    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    /**
     * <p>The instance type information for extending the launch template.</p>
     */
    @NameInMap("LaunchTemplateOverrides")
    public java.util.List<CreateScalingGroupRequestLaunchTemplateOverrides> launchTemplateOverrides;

    /**
     * <p>The version of the launch template. Valid values:</p>
     * <ul>
     * <li><p>A specific version number of the template.</p>
     * </li>
     * <li><p><code>Default</code>: Uses the default version of the template.</p>
     * </li>
     * <li><p><code>Latest</code>: Uses the latest version of the template.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("LaunchTemplateVersion")
    public String launchTemplateVersion;

    /**
     * <p>The list of lifecycle hooks.</p>
     */
    @NameInMap("LifecycleHooks")
    public java.util.List<CreateScalingGroupRequestLifecycleHooks> lifecycleHooks;

    /**
     * <p>The load balancer configurations.</p>
     */
    @NameInMap("LoadBalancerConfigs")
    public java.util.List<CreateScalingGroupRequestLoadBalancerConfigs> loadBalancerConfigs;

    /**
     * <p>A JSON array of Classic Load Balancer (CLB) instance IDs.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>The number of CLB instances that you can associate with a single scaling group varies based on your Auto Scaling usage. Go to <a href="https://quotas.console.aliyun.com/products/ess/quotas">Quota Center</a> to view the quota for <strong>Maximum number of load balancer instances that can be associated with a single scaling group</strong>.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p>The number of CLB instances that you can associate with a single scaling group varies based on your Auto Scaling usage. Go to <a href="https://quotas.console.aliyun.com/products/ess/quotas">Quota Center</a> to view the quota for <strong>Maximum number of load balancer instances that can be associated with a single scaling group</strong>.</p>
     * <p>&lt;props=&quot;partner&quot;&gt;</p>
     * <p>The number of CLB instances that you can associate with a single scaling group varies based on your Auto Scaling usage. Go to Quota Center to view the quota for <strong>Maximum number of load balancer instances that can be associated with a single scaling group</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;lb-bp1u7etiogg38yvwz****&quot;, &quot;lb-bp168cqrux9ai9l7f****&quot;, &quot;lb-bp1jv3m9zvj22ufxp****&quot;]</p>
     */
    @NameInMap("LoadBalancerIds")
    public String loadBalancerIds;

    /**
     * <p>The maximum lifetime of an instance in the scaling group. Unit: seconds.</p>
     * <p>Value range: [86400, Integer.maxValue].</p>
     * <p>Default value: null.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("MaxInstanceLifetime")
    public Integer maxInstanceLifetime;

    /**
     * <p>The maximum number of instances in the scaling group. If the total number of instances exceeds this value, Auto Scaling removes instances to meet this maximum.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>The value range of <code>MaxSize</code> depends on your Auto Scaling usage. Go to <a href="https://quotas.console.aliyun.com/products/ess/quotas">Quota Center</a> to view the quota for <strong>Maximum number of instances per scaling group</strong>.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p>The value range of <code>MaxSize</code> depends on your Auto Scaling usage. Go to <a href="https://quotas.console.aliyun.com/products/ess/quotas">Quota Center</a> to view the quota for <strong>Maximum number of instances per scaling group</strong>.</p>
     * <p>&lt;props=&quot;partner&quot;&gt;</p>
     * <p>The value range of <code>MaxSize</code> depends on your Auto Scaling usage. Go to Quota Center to view the quota for <strong>Maximum number of instances per scaling group</strong>.</p>
     * <p>If the quota for <strong>Maximum number of instances per scaling group</strong> is 2,000, the value of <code>MaxSize</code> can range from 0 to 2,000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxSize")
    public Integer maxSize;

    /**
     * <p>The minimum number of instances in the scaling group. If the total number of instances falls below this value, Auto Scaling adds instances to meet this minimum.</p>
     * <blockquote>
     * <p>The value of <code>MinSize</code> must be less than or equal to the value of <code>MaxSize</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MinSize")
    public Integer minSize;

    /**
     * <p>The scaling policy for ECS instances in a multi-zone scaling group. Valid values:</p>
     * <ul>
     * <li><p><code>PRIORITY</code>: Auto Scaling prioritizes the vSwitches specified in <code>VSwitchIds</code>. If an operation fails in a higher-priority availability zone, Auto Scaling automatically attempts it in the next-highest-priority zone.</p>
     * </li>
     * <li><p><code>COST_OPTIMIZED</code>: During scale-out, creates instances from the instance types with the lowest vCPU unit price. During scale-in, removes instances from the instance types with the highest vCPU unit price. If the scaling configuration includes multiple spot instance types, spot instances are prioritized for creation. You can use the <code>CompensateWithOnDemand</code> parameter to specify whether to automatically create on-demand instances when spot instances cannot be created due to reasons such as insufficient inventory.</p>
     * <blockquote>
     * <p>The <code>COST_OPTIMIZED</code> policy takes effect only when the scaling configuration specifies multiple instance types or includes spot instances.</p>
     * </blockquote>
     * </li>
     * <li><p><code>BALANCE</code>: Distributes ECS instances evenly across the specified availability zones in the scaling group. If the distribution of instances becomes uneven due to insufficient inventory, you can call the <a href="https://help.aliyun.com/document_detail/71516.html">RebalanceInstance</a> API operation to rebalance the instances.</p>
     * <blockquote>
     * <p>If <code>MultiAZPolicy</code> is set to <code>BALANCE</code>, the effect is the same as setting <code>MultiAZPolicy</code> to <code>COMPOSABLE</code> and <code>AzBalance</code> to <code>true</code>.</p>
     * </blockquote>
     * </li>
     * <li><p><code>COMPOSABLE</code>: A composite policy that allows you to combine the preceding policies for multi-zone scaling groups as needed. You can also specify additional parameters to gain finer control over the capacity of your scaling group.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>PRIORITY</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>PRIORITY</p>
     */
    @NameInMap("MultiAZPolicy")
    public String multiAZPolicy;

    /**
     * <p>The minimum number of on-demand instances required in the scaling group. Valid values: 0 to 1,000. If the number of on-demand instances is less than this value, Auto Scaling preferentially creates on-demand instances.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("OnDemandBaseCapacity")
    public Integer onDemandBaseCapacity;

    /**
     * <p>The percentage of on-demand instances among the excess instances after the minimum number of on-demand instances (<code>OnDemandBaseCapacity</code>) is met. Valid values: 0 to 100.</p>
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
     * <p>The ID of the region where the scaling group resides.</p>
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
     * <li><p><code>OldestInstance</code>: Removes the ECS instance that was first added to the scaling group.</p>
     * </li>
     * <li><p><code>NewestInstance</code>: Removes the ECS instance that was most recently added to the scaling group.</p>
     * </li>
     * <li><p><code>OldestScalingConfiguration</code>: Removes the ECS instance that was created based on the earliest scaling configuration.</p>
     * </li>
     * <li><p><code>CustomPolicy</code>: Removes ECS instances based on a custom scale-in policy defined by a function.</p>
     * </li>
     * </ul>
     * <p>The term <code>scaling configuration</code> in <code>OldestScalingConfiguration</code> refers to the source of instance configuration information, which includes both scaling configurations and launch templates. <code>CustomPolicy</code> can only be set as the first removal policy. If you specify <code>CustomPolicy</code>, you must also specify the <code>CustomPolicyARN</code> parameter.</p>
     * <blockquote>
     * <p>The removal of instances is also affected by the scaling group\&quot;s multi-AZ policy (<code>MultiAZPolicy</code>). For more information, see <a href="https://help.aliyun.com/document_detail/254822.html">Configure a combination of removal policies</a>.</p>
     * </blockquote>
     */
    @NameInMap("RemovalPolicies")
    public java.util.List<String> removalPolicies;

    /**
     * <p>The ID of the resource group to which the new scaling group belongs.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the new scaling group is added to the default resource group.</p>
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
     * <p>The name must be 2 to 64 characters in length. It must start with a letter, a digit, or a Chinese character and can contain digits, underscores (_), hyphens (-), and periods (.).</p>
     * <p>If you do not specify this parameter, the value of <code>ScalingGroupId</code> is used.</p>
     * 
     * <strong>example:</strong>
     * <p>scalinggroup****</p>
     */
    @NameInMap("ScalingGroupName")
    public String scalingGroupName;

    /**
     * <p>The reclamation mode of the scaling group. Valid values:</p>
     * <ul>
     * <li><p><code>recycle</code>: The reclamation mode is Economical Mode.</p>
     * </li>
     * <li><p><code>release</code>: The reclamation mode is Release Mode.</p>
     * </li>
     * <li><p><code>forcerelease</code>: The reclamation mode is Force Release Mode.</p>
     * <blockquote>
     * <p>A forced release is equivalent to a power-off operation, which erases data in the memory and ephemeral storage of the instances. This data cannot be recovered. Use this option with caution.</p>
     * </blockquote>
     * </li>
     * <li><p><code>forcerecycle</code>: The reclamation mode is Force Economical Mode.</p>
     * <blockquote>
     * <p>A forced stop is equivalent to a power-off operation, which erases data in the memory and ephemeral storage of the instances. This data cannot be recovered. Use this option with caution.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <p><code>ScalingPolicy</code> specifies the reclamation mode of the scaling group. The specific action taken when an instance is removed from the scaling group is determined by the <code>RemovePolicy</code> parameter of the <code>RemoveInstances</code> operation. For more information, see <a href="https://help.aliyun.com/document_detail/25955.html">RemoveInstances</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>recycle</p>
     */
    @NameInMap("ScalingPolicy")
    public String scalingPolicy;

    /**
     * <p>The load balancer server groups.</p>
     * <blockquote>
     * <p>You cannot specify the same server group in both <code>AlbServerGroups</code> and <code>ServerGroups</code>.</p>
     * </blockquote>
     */
    @NameInMap("ServerGroups")
    public java.util.List<CreateScalingGroupRequestServerGroups> serverGroups;

    /**
     * <p>The distribution strategy for spot capacity. You can use this parameter to specify a separate strategy for spot capacity (effective only when the <code>MultiAZPolicy</code> parameter is set to <code>COMPOSABLE</code>). Valid values:</p>
     * <ul>
     * <li><p>priority: Creates instances in the order of the configured instance types.</p>
     * </li>
     * <li><p>lowestPrice: Creates instances in ascending order of the price per vCPU of the instance types.</p>
     * </li>
     * </ul>
     * <p>Default value: priority.</p>
     * 
     * <strong>example:</strong>
     * <p>lowestPrice</p>
     */
    @NameInMap("SpotAllocationStrategy")
    public String spotAllocationStrategy;

    /**
     * <p>The number of instance types to use. The scaling group creates spot instances in a balanced manner across the specified number of lowest-cost instance types. Valid values: 1 to 10.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("SpotInstancePools")
    public Integer spotInstancePools;

    /**
     * <p>If set to <code>true</code>, Auto Scaling attempts to create a new instance to replace a spot instance that is about to be reclaimed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SpotInstanceRemedy")
    public Boolean spotInstanceRemedy;

    /**
     * <p>The timeout period for the system to wait for an ECS instance to be stopped during a scale-in event. Unit: seconds.
     * Valid values: 30 to 240.</p>
     * <blockquote>
     * <ul>
     * <li><p>This parameter takes effect only during scale-in events when <code>ScalingPolicy</code> is set to <code>release</code>.</p>
     * </li>
     * <li><p>If this parameter is set, the system waits for the specified <code>StopInstanceTimeout</code> period for the instance to be stopped. If the instance is not stopped after the timeout period, the scale-in process continues regardless of the instance status.</p>
     * </li>
     * <li><p>If this parameter is not set, the system waits for an extended period for the instance to be stopped. The scale-in process continues only after the instance is stopped. If the instance fails to stop, the scale-in process is rolled back, and the scale-in event fails.</p>
     * </li>
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
     * <p>This parameter is not yet available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SyncAlarmRuleToCms")
    public Boolean syncAlarmRuleToCms;

    /**
     * <p>The tags to apply to the scaling group.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateScalingGroupRequestTags> tags;

    /**
     * <p>The vServer groups to associate with the scaling group.</p>
     */
    @NameInMap("VServerGroups")
    public java.util.List<CreateScalingGroupRequestVServerGroups> VServerGroups;

    /**
     * <p>The ID of the vSwitch. If you specify this parameter, the network type of the scaling group is Virtual Private Cloud (VPC).</p>
     * <blockquote>
     * <p>If you do not specify the <code>VSwitchId</code> or <code>VSwitchIds</code> parameter, the network type of the scaling group defaults to classic network.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp14zolna43z266bq****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The IDs of one or more vSwitches. If you specify this parameter, the <code>VSwitchId</code> parameter is ignored. If you specify this parameter, the network type of the scaling group is Virtual Private Cloud (VPC).</p>
     * <p>If you specify multiple vSwitches:</p>
     * <ul>
     * <li><p>They must belong to the same VPC.</p>
     * </li>
     * <li><p>They can be in different availability zones.</p>
     * </li>
     * <li><p>The vSwitches are prioritized based on their order in the list, with the first vSwitch having the highest priority. If an instance cannot be created in the availability zone of a higher-priority vSwitch, Auto Scaling automatically attempts to create the instance in the availability zone of the next-highest-priority vSwitch.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify the <code>VSwitchId</code> or <code>VSwitchIds</code> parameter, the network type of the scaling group defaults to classic network.</p>
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

    public static class CreateScalingGroupRequestAlbServerGroups extends TeaModel {
        /**
         * <p>The ID of the ALB server group.</p>
         * <p>A scaling group can be associated with a limited number of ALB server groups. To view or request a quota increase, go to <a href="https://quotas.console.aliyun.com/products/ess/quotas">Quota Center</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-ddwb0y0g6y9bjm****</p>
         */
        @NameInMap("AlbServerGroupId")
        public String albServerGroupId;

        /**
         * <p>The port number used by an instance after it is added to the ALB server group. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The weight of an instance as a backend server after the instance is added to the ALB server group. The higher the weight, the more access requests are distributed to the instance. If the weight is 0, no access requests are distributed to the instance. Valid values: 0 to 100.</p>
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
         * <p>When <code>MultiAZPolicy</code> is set to <code>COST_OPTIMIZED</code>, this parameter specifies whether to automatically create on-demand instances to meet capacity requirements when spot instances are unavailable due to price or inventory. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Yes.</p>
         * </li>
         * <li><p><code>false</code>: No.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CompensateWithOnDemand")
        public Boolean compensateWithOnDemand;

        /**
         * <p>The minimum number of on-demand instances required in the scaling group. When the number of on-demand instances in the scaling group is less than this value, the system preferentially creates on-demand instances. Valid values: 0 to 1,000.</p>
         * <p>When <code>MultiAZPolicy</code> is set to <code>COMPOSABLE</code>, the default value is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("OnDemandBaseCapacity")
        public Integer onDemandBaseCapacity;

        /**
         * <p>The percentage of on-demand instances among the excess instances after the <code>OnDemandBaseCapacity</code> requirement is met. Valid values: 0 to 100.</p>
         * <p>When <code>MultiAZPolicy</code> is set to <code>COMPOSABLE</code>, the default value is 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("OnDemandPercentageAboveBaseCapacity")
        public Integer onDemandPercentageAboveBaseCapacity;

        /**
         * <p>The price comparison mode for the cost optimization strategy of the scaling group. Valid values:</p>
         * <ul>
         * <li><p><code>PricePerUnit</code>: Compares prices based on per-unit capacity.</p>
         * <p>The capacity of an instance in a scaling group is equal to the weight set for the instance type, with a default of 1, meaning one ECS instance equals one unit of capacity.</p>
         * </li>
         * <li><p><code>PricePerVCpu</code>: Compares prices based on per-vCPU price.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>PricePerUnit</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>PricePerUnit</p>
         */
        @NameInMap("PriceComparisonMode")
        public String priceComparisonMode;

        /**
         * <p>After you enable <code>CompensateWithOnDemand</code>, if the on-demand percentage exceeds the <code>OnDemandPercentageAboveBaseCapacity</code> ratio, the system attempts to replace on-demand capacity with spot capacity. A common scenario is when <code>CompensateWithOnDemand</code> leads to on-demand instances being created due to spot inventory or price issues. To avoid the prolonged existence of these on-demand instances, the system attempts to replace the excess on-demand capacity with spot instances. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Allows replacement.</p>
         * </li>
         * <li><p><code>false</code>: Does not allow replacement.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
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
         * <p>The method that is used to associate the scaling group with the database. Valid values:</p>
         * <ul>
         * <li><p><code>SecurityIp</code>: The IP address whitelist mode. This mode automatically adds the scaled-out instances to the IP address whitelist of the database. This mode is supported only by RDS databases.</p>
         * </li>
         * <li><p><code>SecurityGroup</code>: The security group mode. This mode adds the security group of the scaling configuration to the security group whitelist of the database. This allows instances in the security group to access the database.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SecurityIp</p>
         */
        @NameInMap("AttachMode")
        public String attachMode;

        /**
         * <p>The ID of the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-m5eqju85s45mu0***</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The type of the database. Valid values:</p>
         * <ul>
         * <li><p>RDS</p>
         * </li>
         * <li><p>Redis</p>
         * </li>
         * <li><p>MongoDB</p>
         * </li>
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
         * <p>To enable the scaling group to scale based on instance type capacity, you must specify both this parameter and <code>LaunchTemplateOverrides.WeightedCapacity</code>.</p>
         * <p>This parameter specifies the instance type, which overrides the instance type specified in the launch template.</p>
         * <blockquote>
         * <p>This parameter takes effect only when the <code>LaunchTemplateId</code> parameter is specified.</p>
         * </blockquote>
         * <p>Must be a valid ECS instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c5.xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The maximum hourly price for the instance type specified in <code>LaunchTemplateOverride.InstanceType</code>.</p>
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
         * <p>To enable the scaling group to scale based on instance type capacity, you must specify this parameter after you specify <code>LaunchTemplateOverrides.InstanceType</code>.</p>
         * <p>This parameter specifies the weight of the instance type, which represents the capacity of a single instance of that type in the scaling group. A higher weight means that fewer instances of this type are needed to meet the desired capacity.</p>
         * <p>Because instance types have different performance metrics, such as the number of vCPUs and memory size, you can assign different weights to different instance types based on your requirements.</p>
         * <p>Example:</p>
         * <ul>
         * <li><p>Current capacity: 0.</p>
         * </li>
         * <li><p>Desired capacity: 6.</p>
         * </li>
         * <li><p>Capacity of ecs.c5.xlarge: 4.</p>
         * </li>
         * </ul>
         * <p>To meet the desired capacity, the scaling group will create two ecs.c5.xlarge instances.</p>
         * <blockquote>
         * <p>During a scale-out activity, the capacity of the scaling group cannot exceed the sum of the maximum capacity (<code>MaxSize</code>) and the maximum weight of an instance type.</p>
         * </blockquote>
         * <p>Valid values: 1 to 500.</p>
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
         * <p>The action to take after the wait state ends. Valid values:</p>
         * <ul>
         * <li><p><code>CONTINUE</code>: Continues the scale-out or scale-in activity.</p>
         * </li>
         * <li><p><code>ABANDON</code>: Aborts the scale-out activity by releasing the created instances, or aborts the scale-in activity by keeping the instances in the scaling group.</p>
         * </li>
         * </ul>
         * <p>If a scale-in (SCALE_IN) activity triggers multiple lifecycle hooks, and the <code>DefaultResult</code> of one of the lifecycle hooks is <code>ABANDON</code>, the wait state of the other lifecycle hooks ends prematurely. In other cases, the action is determined by the last lifecycle hook to complete.</p>
         * <p>Default value: <code>CONTINUE</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>CONTINUE</p>
         */
        @NameInMap("DefaultResult")
        public String defaultResult;

        /**
         * <p>The wait time that is defined in the lifecycle hook for a scaling activity. After the wait time expires, the next action is performed. Valid values: 30 to 21600. Unit: seconds.</p>
         * <p>After you create a lifecycle hook, you can call the <code>RecordLifecycleActionHeartbeat</code> operation to extend the wait time of an instance, or call the <code>CompleteLifecycleAction</code> operation to end the wait state of the scaling activity in advance.</p>
         * <p>Default value: 600.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("HeartbeatTimeout")
        public Integer heartbeatTimeout;

        /**
         * <p>The name of the lifecycle hook. The name cannot be modified after it is specified. If you do not specify a name, the ID of the lifecycle hook is used.</p>
         * 
         * <strong>example:</strong>
         * <p>lifecyclehook****</p>
         */
        @NameInMap("LifecycleHookName")
        public String lifecycleHookName;

        /**
         * <p>The type of scaling activity to which the lifecycle hook applies. Valid values:</p>
         * <ul>
         * <li><p><code>SCALE_OUT</code>: A scale-out activity.</p>
         * </li>
         * <li><p><code>SCALE_IN</code>: A scale-in activity.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required if you specify a lifecycle hook for the scaling group. Other related parameters are optional.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SCALE_OUT</p>
         */
        @NameInMap("LifecycleTransition")
        public String lifecycleTransition;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the notification recipient for the lifecycle hook. Message Service (MNS) queues and topics are supported. The format is <code>acs:ess:{region}:{account-id}:{resource-relative-id}</code>.</p>
         * <ul>
         * <li><p><code>region</code>: the region where the scaling group is located.</p>
         * </li>
         * <li><p><code>account-id</code>: the ID of your Alibaba Cloud account.</p>
         * </li>
         * </ul>
         * <p>Examples:</p>
         * <ul>
         * <li><p>MNS queue: <code>acs:ess:{region}:{account-id}:queue/{queuename}</code>.</p>
         * </li>
         * <li><p>MNS topic: <code>acs:ess:{region}:{account-id}:topic/{topicname}</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acs:ess:cn-hangzhou:1111111111:queue/queue2</p>
         */
        @NameInMap("NotificationArn")
        public String notificationArn;

        /**
         * <p>A fixed string of information for the wait state of a scaling activity. The value cannot exceed 4,096 characters in length. When Auto Scaling sends a message to the specified notification recipient, it includes the value of this parameter. This allows you to manage and categorize notifications. This parameter is valid only when you specify the <code>NotificationArn</code> parameter.</p>
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
         * <p>The weight of an instance as a backend server after the instance is added to the SLB server group. The higher the weight, the more access requests are distributed to the instance. If the weight is 0, no access requests are distributed to the instance. Valid values: 0 to 100.</p>
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
         * <p>The port number used by an instance after it is added to the server group. Valid values: 1 to 65535.</p>
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
         * <li><p><code>ALB</code>: Application Load Balancer.</p>
         * </li>
         * <li><p><code>NLB</code>: Network Load Balancer.</p>
         * </li>
         * <li><p><code>GWLB</code>: Gateway Load Balancer.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALB</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The weight of an instance as a backend server after the instance is added to the server group. Valid values: 0 to 100.</p>
         * <p>A higher weight indicates that more access requests are distributed to the instance. If the weight is 0, no access requests are distributed to the instance.</p>
         * <blockquote>
         * <p>This parameter is required for ALB and NLB server groups. You cannot set this parameter for GWLB server groups.</p>
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
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>Department</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Specifies whether the tag can be propagated. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: The tag is propagated from the scaling group only to newly created instances, not to instances that are already running in the scaling group.</p>
         * </li>
         * <li><p><code>false</code>: The tag is not propagated from the scaling group to any instances.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Propagate")
        public Boolean propagate;

        /**
         * <p>The value of the tag.</p>
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
         * <p>The port number used by an instance after it is added to the vServer group. Valid values: 1 to 65535.</p>
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
         * <p>The weight of an instance as a backend server after the instance is added to the vServer group. The higher the weight, the more access requests are distributed to the instance. If the weight is 0, no access requests are distributed to the instance. Valid values: 0 to 100.</p>
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
         * <p>The ID of the Classic Load Balancer (CLB) instance to which the vServer group belongs.</p>
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

}
