// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CreateScalingConfigurationRequest extends TeaModel {
    @NameInMap("ImageOptions")
    public CreateScalingConfigurationRequestImageOptions imageOptions;

    @NameInMap("PrivatePoolOptions")
    public CreateScalingConfigurationRequestPrivatePoolOptions privatePoolOptions;

    @NameInMap("SystemDisk")
    public CreateScalingConfigurationRequestSystemDisk systemDisk;

    /**
     * <p>Specifies whether to associate the instance on a dedicated host with the dedicated host. Valid values:</p>
     * <ul>
     * <li><p>default: The instance is not associated with the dedicated host. If an instance with the economical mode enabled is stopped and then started, and the resources of the original dedicated host are insufficient, the instance is automatically deployed to another dedicated host in the automatic deployment resource pool.</p>
     * </li>
     * <li><p>host: The instance is associated with the dedicated host. If an instance with the economical mode enabled is stopped and then started, it remains on the original dedicated host. If the resources of the original dedicated host are insufficient, the instance fails to start.</p>
     * </li>
     * </ul>
     * <p>Default value: default.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Affinity")
    public String affinity;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">Ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The number of vCPUs. Unit: cores.</p>
     * <p>You can specify both Cpu and Memory to define the range of instance types. For example, if you set Cpu to 2 and Memory to 16, all instance types with 2 vCPUs and 16 GiB of memory are matched. Auto Scaling determines the available instance types based on factors such as I/O optimization and zone, and creates instances with the lowest price.</p>
     * <blockquote>
     * <p>This configuration takes effect only when the scaling mode is set to cost optimization and no instance type is specified in the scaling configuration.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Cpu")
    public Integer cpu;

    /**
     * <p>Specifies the running pattern of the burstable instance. Valid values:</p>
     * <ul>
     * <li><p>Standard: standard pattern.</p>
     * </li>
     * <li><p>Unlimited: unlimited pattern.</p>
     * </li>
     * </ul>
     * <p>For more information, see the performance schema section in <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("CreditSpecification")
    public String creditSpecification;

    /**
     * <p>The custom priority of the ECS instance type and vSwitch combination.</p>
     * <blockquote>
     * <p>Notice: This parameter takes effect only when the scaling policy of the scaling group is set to the priority-based policy.</p>
     * </blockquote>
     * <p>If an instance cannot be created based on the instance type and vSwitch combination with a higher priority, Auto Scaling automatically selects the combination with the next highest priority to create the instance.</p>
     * <blockquote>
     * <p>If you specify custom priorities for only some instance type and vSwitch combinations, the unspecified combinations have lower priorities than the specified ones. The priorities of the unspecified combinations are determined based on the vSwitch sequence in the scaling group and the instance type sequence in the scaling configuration.</p>
     * <ul>
     * <li>Example: If the vSwitch sequence in the scaling group is vsw1 and vsw2, the instance type sequence in the scaling configuration is type1 and type2, and the custom priority sequence is [&quot;vsw2+type2&quot;, &quot;vsw1+type2&quot;], the final priority sequence is: &quot;vsw2+type2&quot; &gt; &quot;vsw1+type2&quot; &gt; &quot;vsw1+type1&quot; &gt; &quot;vsw2+type1&quot;.</li>
     * </ul>
     * </blockquote>
     */
    @NameInMap("CustomPriorities")
    public java.util.List<CreateScalingConfigurationRequestCustomPriorities> customPriorities;

    /**
     * <p>The collection of data cloud disk information.</p>
     */
    @NameInMap("DataDisks")
    public java.util.List<CreateScalingConfigurationRequestDataDisks> dataDisks;

    /**
     * <p>The ID of the dedicated host cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>dc-2zedxc67zqzt7lb4****</p>
     */
    @NameInMap("DedicatedHostClusterId")
    public String dedicatedHostClusterId;

    /**
     * <p>Specifies whether to create the ECS instance on a dedicated host. Because dedicated hosts do not support spot instances, the SpotStrategy and SpotPriceLimit parameters are automatically ignored if DedicatedHostId is specified.</p>
     * <p>You can call the DescribeDedicatedHosts operation to query the list of dedicated host IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>dh-bp67acfmxazb4p****</p>
     */
    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    /**
     * <p>The release protection property of the instance. This property specifies whether the instance can be directly released by using the ECS console or the DeleteInstance API operation, which prevents accidental deletion of the instance. Valid values:</p>
     * <ul>
     * <li><p>true: enables release protection for the instance. The instance cannot be directly released by using the ECS console or the DeleteInstance API operation.</p>
     * </li>
     * <li><p>false: shutdown release protection for the instance. The instance can be directly released by using the ECS console or the DeleteInstance API operation.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>This property applies only to pay-as-you-go instances to prevent instances created by Auto Scaling during scale-out from being accidentally deleted. It does not affect normal scale-in activities. Instances with release protection enabled can still be released during scale-in activities.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>The ID of the deployment set to which the ECS instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-bp1frxuzdg87zh4pz****</p>
     */
    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    /**
     * <p>The hostname of the ECS instance. The hostname cannot start or end with a period (.) or a hyphen (-) and cannot contain consecutive periods (.) or hyphens (-). The naming requirements for different instance types are as follows:</p>
     * <ul>
     * <li>Windows instances: The hostname must be 2 to 15 characters in length and can contain letters, digits, and hyphens (-). It cannot contain periods (.) or contain only digits.</li>
     * <li>Other instance types such as Linux instances: The hostname must be 2 to 64 characters in length and can contain multiple periods (.). The string between two periods is a segment, which can contain letters, digits, and hyphens (-).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>host****</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The ID of the HPC cluster to which the ECS instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>hpc-clusterid</p>
     */
    @NameInMap("HpcClusterId")
    public String hpcClusterId;

    /**
     * <p>Specifies whether to enable the access channel for instance metadata. Valid values:</p>
     * <ul>
     * <li>enabled: enables the access channel.</li>
     * <li>disabled: disables the access channel.</li>
     * </ul>
     * <p>Default value: enabled.</p>
     * <blockquote>
     * <p>For more information about instance metadata, see <a href="https://help.aliyun.com/document_detail/108460.html">Overview of instance metadata</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("HttpEndpoint")
    public String httpEndpoint;

    /**
     * <p>Specifies whether to forcibly use the security-hardened mode (IMDSv2) to access instance metadata. Valid values:</p>
     * <ul>
     * <li>optional: does not forcibly use the security-hardened mode.</li>
     * <li>required: forcibly uses the security-hardened mode. After you set this value, you cannot access instance metadata in normal mode.</li>
     * </ul>
     * <p>Default value: optional.</p>
     * <blockquote>
     * <p>For more information about the modes for accessing instance metadata, see <a href="https://help.aliyun.com/document_detail/108460.html">Access modes of instance metadata</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>optional</p>
     */
    @NameInMap("HttpTokens")
    public String httpTokens;

    /**
     * <p>The name of the image family. You can set this parameter to obtain the latest available image in the image family to create instances. If <code>ImageId</code> is specified, you cannot specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>hangzhou-daily-update</p>
     */
    @NameInMap("ImageFamily")
    public String imageFamily;

    /**
     * <p>The ID of the image file. The image resource used during automatic creation of instances.</p>
     * 
     * <strong>example:</strong>
     * <p>centos6u5_64_20G_aliaegis****.vhd</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The name of the image file. The image name must be unique within a region. If ImageId is specified, ImageName is ignored.</p>
     * <p>You cannot use ImageName to specify an Alibaba Cloud Marketplace image.</p>
     * 
     * <strong>example:</strong>
     * <p>image****</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The description of the ECS instance. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Test instance.</p>
     */
    @NameInMap("InstanceDescription")
    public String instanceDescription;

    /**
     * <p>The name of the ECS instance during automatic creation by using this scaling configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>instance****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The collection of intelligent configuration information used to filter instance types that meet your requirements.</p>
     */
    @NameInMap("InstancePatternInfos")
    public java.util.List<CreateScalingConfigurationRequestInstancePatternInfos> instancePatternInfos;

    /**
     * <p>The instance type of the ECS instance. For more information, see instance families.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g6.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>After you enable the candidate mode, if issues such as insufficient stock occur, the system supplements the currently selected instance types with similar instance types of the same size, or creates vSwitches in candidate zones and adds them to the scaling group.</p>
     */
    @NameInMap("InstanceTypeCandidateOptions")
    public CreateScalingConfigurationRequestInstanceTypeCandidateOptions instanceTypeCandidateOptions;

    /**
     * <p>The information used to specify instance types.</p>
     */
    @NameInMap("InstanceTypeOverrides")
    public java.util.List<CreateScalingConfigurationRequestInstanceTypeOverrides> instanceTypeOverrides;

    /**
     * <p>The multiple instance types. If InstanceTypes is specified, InstanceType is ignored.</p>
     * <p>If an instance cannot be created based on the instance type with a higher priority, Auto Scaling automatically selects the instance type with the next highest priority to create the instance.</p>
     */
    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    /**
     * <p>The network billing method. Valid values:</p>
     * <ul>
     * <li><p>PayByBandwidth: pay-by-bandwidth. In this case, InternetMaxBandwidthOut specifies the fixed bandwidth value.</p>
     * </li>
     * <li><p>PayByTraffic: pay-by-traffic. In this case, InternetMaxBandwidthOut specifies only the maximum bandwidth, and you are billed based on the actual network traffic.</p>
     * </li>
     * </ul>
     * <p>If this parameter is not specified, the default value is PayByBandwidth for the classic network and PayByTraffic for a VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>PayByTraffic</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The maximum inbound public bandwidth. Unit: Mbit/s. Valid values:</p>
     * <ul>
     * <li>If the purchased outbound public bandwidth is less than or equal to 10 Mbit/s: 1 to 10. Default value: 10.</li>
     * <li>If the purchased outbound public bandwidth is greater than 10 Mbit/s: 1 to the value of <code>InternetMaxBandwidthOut</code>. Default value: the value of <code>InternetMaxBandwidthOut</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("InternetMaxBandwidthIn")
    public Integer internetMaxBandwidthIn;

    /**
     * <p>The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.</p>
     * <p>Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    /**
     * <p>Specifies whether the instance is an I/O optimization instance. Valid values:</p>
     * <ul>
     * <li>none: The instance is not an I/O optimization instance.</li>
     * <li>optimized: The instance is an I/O optimization instance.</li>
     * </ul>
     * <p>The default value is none for retired instance types and optimized for other instance types.</p>
     * 
     * <strong>example:</strong>
     * <p>optimized</p>
     */
    @NameInMap("IoOptimized")
    public String ioOptimized;

    /**
     * <p>The number of IPv6 addresses that are randomly generated for the network interface controller (NIC).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    /**
     * <p>The name of the key pair used to log on to the ECS instance. </p>
     * <ul>
     * <li>For Windows instances, this parameter is ignored and left empty by default. </li>
     * <li>For Linux instances, password-based logon is disabled by default.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>KeyPairTest</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The weight of the ECS instance as a load balancing backend server. Valid values: 1 to 100.</p>
     * <p>Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("LoadBalancerWeight")
    public Integer loadBalancerWeight;

    /**
     * <p>The memory size. Unit: GiB.</p>
     * <p>You can specify both Cpu and Memory to define the range of instance types. For example, if you set Cpu to 2 and Memory to 16, all instance types with 2 vCPUs and 16 GiB of memory are matched. Auto Scaling determines the available instance types based on factors such as I/O optimization and zone, and creates instances with the lowest price.</p>
     * <blockquote>
     * <p>This configuration takes effect only when the scaling mode is set to cost optimization and no instance type is specified in the scaling configuration.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("Memory")
    public Integer memory;

    /**
     * <p>The list of network interface controller (NIC) devices.</p>
     */
    @NameInMap("NetworkInterfaces")
    public java.util.List<CreateScalingConfigurationRequestNetworkInterfaces> networkInterfaces;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The password of the ECS instance. The password must be 8 to 30 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include:</p>
     * <p>\<code>()</code> ~!@#$%^&amp;*-_+=\|{}[]:;\&quot;&lt;&gt;,.?/`</p>
     * <p>For Windows instances, the password cannot start with a forward slash (/).</p>
     * <blockquote>
     * <p>If you specify the Password parameter, send requests over HTTPS to prevent password leaks.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123abc****</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>Specifies whether to use the preset password of the image. When you use this parameter, make sure that a password is preset in the image. Valid values:</p>
     * <ul>
     * <li>true: uses the preset password of the image.</li>
     * <li>false: does not use the preset password of the image.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    /**
     * <p>The name of the Resource Access Management (RAM) role for the ECS instance. RAM roles are provided and maintained by RAM. You can call the ListRoles operation to query available RAM roles.</p>
     * 
     * <strong>example:</strong>
     * <p>ramrole****</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The ID of the resource group to which the ECS instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-resource****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The resource pool policy used when creating the instance. Take note of the following items when you configure this parameter:</p>
     * <ul>
     * <li><p>This parameter takes effect only when you create pay-as-you-go instances.</p>
     * </li>
     * <li><p>You cannot configure this parameter together with PrivatePoolOptions.MatchCriteria or PrivatePoolOptions.Id.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ResourcePoolOptions")
    public CreateScalingConfigurationRequestResourcePoolOptions resourcePoolOptions;

    /**
     * <p>The name of the scaling configuration. The name must be 2 to 64 characters in length and can contain letters, digits, underscores (_), hyphens (-), and periods (.). It must start with a letter, digit, or Chinese character.</p>
     * <p>The name must be unique within a scaling group in a region. If you do not specify this parameter, the ID of the scaling configuration is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>scalingconfig****</p>
     */
    @NameInMap("ScalingConfigurationName")
    public String scalingConfigurationName;

    /**
     * <p>The ID of the scaling group to which the scaling configuration belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp14wlu85wrpchm0****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    /**
     * <p>The scheduling options.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;testManagedPrivateSpaceId****&quot;]</p>
     */
    @NameInMap("SchedulerOptions")
    public java.util.Map<String, ?> schedulerOptions;

    /**
     * <p>Specifies whether a vSwitch available for secondary elastic network interfaces (ENIs) must be selected from the list when the VSwitchIds parameter is specified for the secondary ENIs. Valid values:</p>
     * <ul>
     * <li>Strict: strict mode. If no vSwitch in the VSwitchIds list meets the requirements, instance creation fails.</li>
     * <li>Tolerant: fault-tolerant mode. If no vSwitch in the VSwitchIds list meets the requirements, no secondary ENI is configured, and the instance is still created.</li>
     * </ul>
     * <p>Default value: Strict.</p>
     * 
     * <strong>example:</strong>
     * <p>Strict</p>
     */
    @NameInMap("SecondaryEniVSwitchConstraint")
    public String secondaryEniVSwitchConstraint;

    /**
     * <p>Specifies whether to enable security hardening. Valid values:</p>
     * <ul>
     * <li>Active: enables security hardening. This value applies only to public images.</li>
     * <li>Deactive: disables security hardening. This value applies to all image types.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("SecurityEnhancementStrategy")
    public String securityEnhancementStrategy;

    /**
     * <p>The ID of the security group to which the ECS instance belongs. ECS instances in the same security group can access each other.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-280ih****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>Adds the ECS instance to multiple security groups at the same time. For more information, see the Security groups section in <a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>.</p>
     * <blockquote>
     * <p>You cannot specify both SecurityGroupId and SecurityGroupIds at the same time.</p>
     * </blockquote>
     */
    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    /**
     * <p>The security options.</p>
     */
    @NameInMap("SecurityOptions")
    public CreateScalingConfigurationRequestSecurityOptions securityOptions;

    /**
     * <p>The protection period of the spot instance. Unit: hours. Valid values:</p>
     * <ul>
     * <li>1: Alibaba Cloud guarantees that the instance runs for 1 hour after it is created and is not automatically released. After 1 hour, the system automatically compares your bid with the market price and checks resource inventory to determine whether to retain automatic release the instance.</li>
     * <li>0: Alibaba Cloud does not guarantee that the instance runs for 1 hour after it is created. The system automatically compares your bid with the market price and checks resource inventory to determine whether to retain automatic release the instance.</li>
     * </ul>
     * <blockquote>
     * <p>Alibaba Cloud sends you a notification by using ECS system events 5 minutes before the instance is released. Spot instances are billed by the second. Select an appropriate protection period based on the execution duration of your tasks.</p>
     * </blockquote>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SpotDuration")
    public Integer spotDuration;

    /**
     * <p>The break mode of the spot instance. Currently, only terminate (default) is supported, which releases the instance directly.</p>
     * 
     * <strong>example:</strong>
     * <p>Terminate</p>
     */
    @NameInMap("SpotInterruptionBehavior")
    public String spotInterruptionBehavior;

    /**
     * <p>The collection of billing information for spot instances.</p>
     */
    @NameInMap("SpotPriceLimits")
    public java.util.List<CreateScalingConfigurationRequestSpotPriceLimits> spotPriceLimits;

    /**
     * <p>The preemption policy for the pay-as-you-go instance. Valid values:</p>
     * <ul>
     * <li>NoSpot: regular pay-as-you-go instance.</li>
     * <li>SpotWithPriceLimit: spot instance with a maximum hourly price.</li>
     * <li>SpotAsPriceGo: spot instance whose price is automatically set based on the current market price.</li>
     * </ul>
     * <p>Default value: NoSpot.</p>
     * 
     * <strong>example:</strong>
     * <p>NoSpot</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The ID of the storage set.</p>
     * 
     * <strong>example:</strong>
     * <p>ss-bp67acfmxazb4p****</p>
     */
    @NameInMap("StorageSetId")
    public String storageSetId;

    /**
     * <p>The maximum number of partitions in the storage set. Valid values: integers greater than or equal to 2.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("StorageSetPartitionNumber")
    public Integer storageSetPartitionNumber;

    /**
     * <p>The disk types for the system cloud disk. If a disk type with a higher priority is unavailable, Auto Scaling automatically attempts to use the disk type with the next highest priority to create the system cloud disk. Valid values:</p>
     * <ul>
     * <li>cloud: basic cloud disk.</li>
     * <li>cloud_efficiency: ultra cloud disk.</li>
     * <li>cloud_ssd: standard SSD cloud disk.</li>
     * <li>cloud_essd: ESSD cloud disk.</li>
     * </ul>
     * <blockquote>
     * <p>You cannot specify both this parameter and <code>SystemDisk.Category</code> at the same time.</p>
     * </blockquote>
     */
    @NameInMap("SystemDiskCategories")
    public java.util.List<String> systemDiskCategories;

    /**
     * <p>The tags of the ECS instance. Tags are passed in as key-value pairs. You can add up to 20 tags. The requirements for keys and values are as follows:</p>
     * <ul>
     * <li>A key can be up to 64 characters in length. It cannot start with aliyun or acs: and cannot contain <code>http://</code> or <code>https://</code>. A key cannot be an empty string.</li>
     * <li>A value can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain <code>http://</code> or <code>https://</code>. A value can be an empty string.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key1&quot;:&quot;value1&quot;,&quot;key2&quot;:&quot;value2&quot;, ... &quot;key5&quot;:&quot;value5&quot;}</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>Specifies whether to create the instance on a dedicated host. Valid values:</p>
     * <ul>
     * <li><p>default: creates the instance on a non-dedicated host.</p>
     * </li>
     * <li><p>host: creates the instance on a dedicated host. If you do not specify DedicatedHostId, Alibaba Cloud automatically selects a dedicated host for the instance.</p>
     * </li>
     * </ul>
     * <p>Default value: default.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Tenancy")
    public String tenancy;

    /**
     * <p>The user data of the ECS instance. It must be encoded in Base64. The maximum size of the raw data before encoding is 32 KB.</p>
     * 
     * <strong>example:</strong>
     * <p>ZWNobyBoZWxsbyBlY3Mh</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The zone ID of the ECS instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-g</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateScalingConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScalingConfigurationRequest self = new CreateScalingConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public CreateScalingConfigurationRequest setImageOptions(CreateScalingConfigurationRequestImageOptions imageOptions) {
        this.imageOptions = imageOptions;
        return this;
    }
    public CreateScalingConfigurationRequestImageOptions getImageOptions() {
        return this.imageOptions;
    }

    public CreateScalingConfigurationRequest setPrivatePoolOptions(CreateScalingConfigurationRequestPrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public CreateScalingConfigurationRequestPrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public CreateScalingConfigurationRequest setSystemDisk(CreateScalingConfigurationRequestSystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public CreateScalingConfigurationRequestSystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public CreateScalingConfigurationRequest setAffinity(String affinity) {
        this.affinity = affinity;
        return this;
    }
    public String getAffinity() {
        return this.affinity;
    }

    public CreateScalingConfigurationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateScalingConfigurationRequest setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public CreateScalingConfigurationRequest setCreditSpecification(String creditSpecification) {
        this.creditSpecification = creditSpecification;
        return this;
    }
    public String getCreditSpecification() {
        return this.creditSpecification;
    }

    public CreateScalingConfigurationRequest setCustomPriorities(java.util.List<CreateScalingConfigurationRequestCustomPriorities> customPriorities) {
        this.customPriorities = customPriorities;
        return this;
    }
    public java.util.List<CreateScalingConfigurationRequestCustomPriorities> getCustomPriorities() {
        return this.customPriorities;
    }

    public CreateScalingConfigurationRequest setDataDisks(java.util.List<CreateScalingConfigurationRequestDataDisks> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }
    public java.util.List<CreateScalingConfigurationRequestDataDisks> getDataDisks() {
        return this.dataDisks;
    }

    public CreateScalingConfigurationRequest setDedicatedHostClusterId(String dedicatedHostClusterId) {
        this.dedicatedHostClusterId = dedicatedHostClusterId;
        return this;
    }
    public String getDedicatedHostClusterId() {
        return this.dedicatedHostClusterId;
    }

    public CreateScalingConfigurationRequest setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public CreateScalingConfigurationRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public CreateScalingConfigurationRequest setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    public CreateScalingConfigurationRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public CreateScalingConfigurationRequest setHpcClusterId(String hpcClusterId) {
        this.hpcClusterId = hpcClusterId;
        return this;
    }
    public String getHpcClusterId() {
        return this.hpcClusterId;
    }

    public CreateScalingConfigurationRequest setHttpEndpoint(String httpEndpoint) {
        this.httpEndpoint = httpEndpoint;
        return this;
    }
    public String getHttpEndpoint() {
        return this.httpEndpoint;
    }

    public CreateScalingConfigurationRequest setHttpTokens(String httpTokens) {
        this.httpTokens = httpTokens;
        return this;
    }
    public String getHttpTokens() {
        return this.httpTokens;
    }

    public CreateScalingConfigurationRequest setImageFamily(String imageFamily) {
        this.imageFamily = imageFamily;
        return this;
    }
    public String getImageFamily() {
        return this.imageFamily;
    }

    public CreateScalingConfigurationRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateScalingConfigurationRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public CreateScalingConfigurationRequest setInstanceDescription(String instanceDescription) {
        this.instanceDescription = instanceDescription;
        return this;
    }
    public String getInstanceDescription() {
        return this.instanceDescription;
    }

    public CreateScalingConfigurationRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateScalingConfigurationRequest setInstancePatternInfos(java.util.List<CreateScalingConfigurationRequestInstancePatternInfos> instancePatternInfos) {
        this.instancePatternInfos = instancePatternInfos;
        return this;
    }
    public java.util.List<CreateScalingConfigurationRequestInstancePatternInfos> getInstancePatternInfos() {
        return this.instancePatternInfos;
    }

    public CreateScalingConfigurationRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateScalingConfigurationRequest setInstanceTypeCandidateOptions(CreateScalingConfigurationRequestInstanceTypeCandidateOptions instanceTypeCandidateOptions) {
        this.instanceTypeCandidateOptions = instanceTypeCandidateOptions;
        return this;
    }
    public CreateScalingConfigurationRequestInstanceTypeCandidateOptions getInstanceTypeCandidateOptions() {
        return this.instanceTypeCandidateOptions;
    }

    public CreateScalingConfigurationRequest setInstanceTypeOverrides(java.util.List<CreateScalingConfigurationRequestInstanceTypeOverrides> instanceTypeOverrides) {
        this.instanceTypeOverrides = instanceTypeOverrides;
        return this;
    }
    public java.util.List<CreateScalingConfigurationRequestInstanceTypeOverrides> getInstanceTypeOverrides() {
        return this.instanceTypeOverrides;
    }

    public CreateScalingConfigurationRequest setInstanceTypes(java.util.List<String> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public java.util.List<String> getInstanceTypes() {
        return this.instanceTypes;
    }

    public CreateScalingConfigurationRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public CreateScalingConfigurationRequest setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
        this.internetMaxBandwidthIn = internetMaxBandwidthIn;
        return this;
    }
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    public CreateScalingConfigurationRequest setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public CreateScalingConfigurationRequest setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public CreateScalingConfigurationRequest setIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
        return this;
    }
    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    public CreateScalingConfigurationRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public CreateScalingConfigurationRequest setLoadBalancerWeight(Integer loadBalancerWeight) {
        this.loadBalancerWeight = loadBalancerWeight;
        return this;
    }
    public Integer getLoadBalancerWeight() {
        return this.loadBalancerWeight;
    }

    public CreateScalingConfigurationRequest setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public CreateScalingConfigurationRequest setNetworkInterfaces(java.util.List<CreateScalingConfigurationRequestNetworkInterfaces> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
        return this;
    }
    public java.util.List<CreateScalingConfigurationRequestNetworkInterfaces> getNetworkInterfaces() {
        return this.networkInterfaces;
    }

    public CreateScalingConfigurationRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateScalingConfigurationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateScalingConfigurationRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateScalingConfigurationRequest setPasswordInherit(Boolean passwordInherit) {
        this.passwordInherit = passwordInherit;
        return this;
    }
    public Boolean getPasswordInherit() {
        return this.passwordInherit;
    }

    public CreateScalingConfigurationRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public CreateScalingConfigurationRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateScalingConfigurationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateScalingConfigurationRequest setResourcePoolOptions(CreateScalingConfigurationRequestResourcePoolOptions resourcePoolOptions) {
        this.resourcePoolOptions = resourcePoolOptions;
        return this;
    }
    public CreateScalingConfigurationRequestResourcePoolOptions getResourcePoolOptions() {
        return this.resourcePoolOptions;
    }

    public CreateScalingConfigurationRequest setScalingConfigurationName(String scalingConfigurationName) {
        this.scalingConfigurationName = scalingConfigurationName;
        return this;
    }
    public String getScalingConfigurationName() {
        return this.scalingConfigurationName;
    }

    public CreateScalingConfigurationRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public CreateScalingConfigurationRequest setSchedulerOptions(java.util.Map<String, ?> schedulerOptions) {
        this.schedulerOptions = schedulerOptions;
        return this;
    }
    public java.util.Map<String, ?> getSchedulerOptions() {
        return this.schedulerOptions;
    }

    public CreateScalingConfigurationRequest setSecondaryEniVSwitchConstraint(String secondaryEniVSwitchConstraint) {
        this.secondaryEniVSwitchConstraint = secondaryEniVSwitchConstraint;
        return this;
    }
    public String getSecondaryEniVSwitchConstraint() {
        return this.secondaryEniVSwitchConstraint;
    }

    public CreateScalingConfigurationRequest setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
        this.securityEnhancementStrategy = securityEnhancementStrategy;
        return this;
    }
    public String getSecurityEnhancementStrategy() {
        return this.securityEnhancementStrategy;
    }

    public CreateScalingConfigurationRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateScalingConfigurationRequest setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public CreateScalingConfigurationRequest setSecurityOptions(CreateScalingConfigurationRequestSecurityOptions securityOptions) {
        this.securityOptions = securityOptions;
        return this;
    }
    public CreateScalingConfigurationRequestSecurityOptions getSecurityOptions() {
        return this.securityOptions;
    }

    public CreateScalingConfigurationRequest setSpotDuration(Integer spotDuration) {
        this.spotDuration = spotDuration;
        return this;
    }
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    public CreateScalingConfigurationRequest setSpotInterruptionBehavior(String spotInterruptionBehavior) {
        this.spotInterruptionBehavior = spotInterruptionBehavior;
        return this;
    }
    public String getSpotInterruptionBehavior() {
        return this.spotInterruptionBehavior;
    }

    public CreateScalingConfigurationRequest setSpotPriceLimits(java.util.List<CreateScalingConfigurationRequestSpotPriceLimits> spotPriceLimits) {
        this.spotPriceLimits = spotPriceLimits;
        return this;
    }
    public java.util.List<CreateScalingConfigurationRequestSpotPriceLimits> getSpotPriceLimits() {
        return this.spotPriceLimits;
    }

    public CreateScalingConfigurationRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public CreateScalingConfigurationRequest setStorageSetId(String storageSetId) {
        this.storageSetId = storageSetId;
        return this;
    }
    public String getStorageSetId() {
        return this.storageSetId;
    }

    public CreateScalingConfigurationRequest setStorageSetPartitionNumber(Integer storageSetPartitionNumber) {
        this.storageSetPartitionNumber = storageSetPartitionNumber;
        return this;
    }
    public Integer getStorageSetPartitionNumber() {
        return this.storageSetPartitionNumber;
    }

    public CreateScalingConfigurationRequest setSystemDiskCategories(java.util.List<String> systemDiskCategories) {
        this.systemDiskCategories = systemDiskCategories;
        return this;
    }
    public java.util.List<String> getSystemDiskCategories() {
        return this.systemDiskCategories;
    }

    public CreateScalingConfigurationRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public CreateScalingConfigurationRequest setTenancy(String tenancy) {
        this.tenancy = tenancy;
        return this;
    }
    public String getTenancy() {
        return this.tenancy;
    }

    public CreateScalingConfigurationRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public CreateScalingConfigurationRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateScalingConfigurationRequestImageOptions extends TeaModel {
        /**
         * <p>Specifies whether to log on to the ECS instance as the ecs-user user. For more information, see <a href="https://help.aliyun.com/document_detail/388447.html">Manage the logon username of an ECS instance</a>. Valid values:</p>
         * <ul>
         * <li><p>true: yes.</p>
         * </li>
         * <li><p>false: no.</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("LoginAsNonRoot")
        public Boolean loginAsNonRoot;

        public static CreateScalingConfigurationRequestImageOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingConfigurationRequestImageOptions self = new CreateScalingConfigurationRequestImageOptions();
            return TeaModel.build(map, self);
        }

        public CreateScalingConfigurationRequestImageOptions setLoginAsNonRoot(Boolean loginAsNonRoot) {
            this.loginAsNonRoot = loginAsNonRoot;
            return this;
        }
        public Boolean getLoginAsNonRoot() {
            return this.loginAsNonRoot;
        }

    }

    public static class CreateScalingConfigurationRequestPrivatePoolOptions extends TeaModel {
        /**
         * <p>The ID of the private pool. It is the ID of the elasticity assurance or capacity reservation.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-bp67acfmxazb4****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The private pool options for instance startup. After an elasticity assurance or a capacity reservation takes effect, a private pool is generated for you to select when you start instances. Valid values:</p>
         * <ul>
         * <li><p>Open: open mode. The system automatically matches an open private pool. If no matching private pool is available, the system uses resources from the public pool. In this mode, you do not need to specify the PrivatePoolOptions.Id parameter.</p>
         * </li>
         * <li><p>Target: specified mode. The system uses the specified private pool to start the instance. If the specified private pool is unavailable, the instance fails to start. In this mode, you must specify the private pool ID by using the PrivatePoolOptions.Id parameter.</p>
         * </li>
         * <li><p>None: no private pool. The system does not use private pools to start the instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Open</p>
         */
        @NameInMap("MatchCriteria")
        public String matchCriteria;

        public static CreateScalingConfigurationRequestPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingConfigurationRequestPrivatePoolOptions self = new CreateScalingConfigurationRequestPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public CreateScalingConfigurationRequestPrivatePoolOptions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateScalingConfigurationRequestPrivatePoolOptions setMatchCriteria(String matchCriteria) {
            this.matchCriteria = matchCriteria;
            return this;
        }
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

    }

    public static class CreateScalingConfigurationRequestSystemDisk extends TeaModel {
        /**
         * <p>The ID of the automatic snapshot policy applied to the system cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp12m37ccmxvbmi5****</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>Specifies whether to enable the burst (performance burst) feature for the system cloud disk. Valid values:</p>
         * <ul>
         * <li>true: enables the feature.</li>
         * <li>false: disables the feature.<blockquote>
         * <p>This parameter is supported only when <code>SystemDisk.Category</code> is set to <code>cloud_auto</code>.</p>
         * </blockquote>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>The category of the system cloud disk. Valid values:</p>
         * <ul>
         * <li><p>cloud: basic cloud disk.</p>
         * </li>
         * <li><p>cloud_efficiency: ultra cloud disk.</p>
         * </li>
         * <li><p>cloud_ssd: standard SSD cloud disk.</p>
         * </li>
         * <li><p>ephemeral_ssd: local SSD.</p>
         * </li>
         * <li><p>cloud_essd: ESSD.</p>
         * </li>
         * <li><p>cloud_auto: ESSD AutoPL.</p>
         * </li>
         * </ul>
         * <p>You cannot specify this parameter together with <code>SystemDiskCategories</code>. If neither this parameter nor <code>SystemDiskCategories</code> is specified, the default value is used:</p>
         * <ul>
         * <li>For I/O optimized instances, the default value is cloud_efficiency.</li>
         * <li>For non-I/O optimized instances, the default value is cloud.</li>
         * </ul>
         * <p>This parameter specifies only one system cloud disk type. If you want the system to automatically try other types when the preferred disk type is unavailable, use <code>SystemDiskCategories</code> and configure multiple disk types in order of priority.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The description of the system cloud disk. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Test system disk.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the system cloud disk. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssdSystem</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>The encryption algorithm used for the system cloud disk. Valid values:</p>
         * <ul>
         * <li>AES-256.</li>
         * <li>SM4-128.</li>
         * </ul>
         * <p>Default value: AES-256.</p>
         * 
         * <strong>example:</strong>
         * <p>AES-256</p>
         */
        @NameInMap("EncryptAlgorithm")
        public String encryptAlgorithm;

        /**
         * <p>Specifies whether to encrypt the system cloud disk. Valid values:</p>
         * <ul>
         * <li>true: encrypts the system cloud disk.</li>
         * <li>false: does not encrypt the system cloud disk.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public Boolean encrypted;

        /**
         * <p>The ID of the KMS key used for the system cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The settings of the performance level for the system cloud disk when it is an ESSD. Valid values:</p>
         * <ul>
         * <li><p>PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</p>
         * </li>
         * <li><p>PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</p>
         * </li>
         * <li><p>PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</p>
         * </li>
         * <li><p>PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</p>
         * </li>
         * </ul>
         * <p>Default value: PL1.</p>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The provisioned IOPS (Input/Output Operations Per Second) performance metrics for the system cloud disk.</p>
         * <blockquote>
         * <p>IOPS refers to the number of I/O operations that can be processed per second. It indicates the read and write processing capability of block storage. Unit: operations per second.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        /**
         * <p>The size of the system cloud disk. Unit: GiB. Valid values:</p>
         * <ul>
         * <li>Basic cloud disk: 20 to 500.</li>
         * <li>ESSD:<ul>
         * <li>PL0: 1 to 2048.</li>
         * <li>PL1: 20 to 2048.</li>
         * <li>PL2: 461 to 2048.</li>
         * <li>PL3: 1261 to 2048.</li>
         * </ul>
         * </li>
         * <li>ESSD AutoPL: 1 to 2048.</li>
         * <li>Other cloud disk types: 20 to 2048.</li>
         * </ul>
         * <p>The value of this parameter must be greater than or equal to max{1, ImageSize}.</p>
         * <p>Default value: max{40, ImageSize}.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Size")
        public Integer size;

        public static CreateScalingConfigurationRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingConfigurationRequestSystemDisk self = new CreateScalingConfigurationRequestSystemDisk();
            return TeaModel.build(map, self);
        }

        public CreateScalingConfigurationRequestSystemDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public CreateScalingConfigurationRequestSystemDisk setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public CreateScalingConfigurationRequestSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateScalingConfigurationRequestSystemDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateScalingConfigurationRequestSystemDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public CreateScalingConfigurationRequestSystemDisk setEncryptAlgorithm(String encryptAlgorithm) {
            this.encryptAlgorithm = encryptAlgorithm;
            return this;
        }
        public String getEncryptAlgorithm() {
            return this.encryptAlgorithm;
        }

        public CreateScalingConfigurationRequestSystemDisk setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public CreateScalingConfigurationRequestSystemDisk setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public CreateScalingConfigurationRequestSystemDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public CreateScalingConfigurationRequestSystemDisk setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public CreateScalingConfigurationRequestSystemDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class CreateScalingConfigurationRequestCustomPriorities extends TeaModel {
        /**
         * <p>The instance type of the ECS instance.</p>
         * <blockquote>
         * <p>Notice: The instance type must be included in the instance type list of the scaling configuration.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The ID of the vSwitch.</p>
         * <blockquote>
         * <p>Notice: The vSwitch must be included in the vSwitch list of the scaling group.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp14zolna43z266bq****</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        public static CreateScalingConfigurationRequestCustomPriorities build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingConfigurationRequestCustomPriorities self = new CreateScalingConfigurationRequestCustomPriorities();
            return TeaModel.build(map, self);
        }

        public CreateScalingConfigurationRequestCustomPriorities setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CreateScalingConfigurationRequestCustomPriorities setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

    public static class CreateScalingConfigurationRequestDataDisks extends TeaModel {
        /**
         * <p>The ID of the automatic snapshot policy applied to the data cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp19nq9enxqkomib****</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>Specifies whether to enable the burstable performance feature for the data cloud disk. Valid values:</p>
         * <ul>
         * <li>true: enables the feature.</li>
         * <li>false: disables the feature. <blockquote>
         * <p>You can set this parameter only when <code>SystemDisk.Category</code> is set to <code>cloud_auto</code>.</p>
         * </blockquote>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>The multiple disk types of the data cloud disk. If the disk type with a higher priority is unavailable, Auto Scaling automatically tries the disk type with the next highest priority to create the data cloud disk. Valid values:</p>
         * <ul>
         * <li>cloud: basic cloud disk. The DeleteWithInstance property of a basic cloud disk created together with the instance is set to true.</li>
         * <li>cloud_efficiency: ultra cloud disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>cloud_essd: ESSD.</li>
         * <li>ephemeral_ssd: local SSD.</li>
         * <li>cloud_auto: ESSD AutoPL.</li>
         * <li>cloud_regional_disk_auto: regional ESSD.</li>
         * </ul>
         * <blockquote>
         * <p>If you specify this parameter, you cannot specify <code>DataDisks.Category</code> at the same time.</p>
         * </blockquote>
         */
        @NameInMap("Categories")
        public java.util.List<String> categories;

        /**
         * <p>The category of the data cloud disk. Valid values:</p>
         * <ul>
         * <li>cloud: basic cloud disk. The DeleteWithInstance attribute of a basic cloud disk created together with the instance is set to true.</li>
         * <li>cloud_efficiency: ultra cloud disk.</li>
         * <li>cloud_ssd: standard SSD cloud disk.</li>
         * <li>cloud_essd: ESSD.</li>
         * <li>ephemeral_ssd: local SSD.</li>
         * <li>cloud_auto: ESSD AutoPL.</li>
         * <li>cloud_regional_disk_auto: regional ESSD.</li>
         * </ul>
         * <p>You cannot specify this parameter together with DataDisk.Categories. If neither this parameter nor DataDisk.Categories is specified, the default value is used:</p>
         * <ul>
         * <li>For I/O optimized instances, the default value is cloud_efficiency.</li>
         * <li>For non-I/O optimized instances, the default value is cloud.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Specifies whether to release the data cloud disk when the instance is released. Valid values:</p>
         * <ul>
         * <li>true: releases the data cloud disk when the instance is released.</li>
         * <li>false: retains the data cloud disk when the instance is released.</li>
         * </ul>
         * <p>You can set this parameter only for independent cloud disks (when DataDisks.Category is set to cloud, cloud_efficiency, cloud_ssd, or cloud_essd). Otherwise, an error is returned.</p>
         * <p>Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        /**
         * <p>The description of the data cloud disk. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Test data disk.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The mount point of the data cloud disk. If you do not specify this parameter, the system automatically allocates a mount point by default during automatic creation of the ECS instance. The mount point starts from /dev/xvdb and ends at /dev/xvdz.</p>
         * 
         * <strong>example:</strong>
         * <p>/dev/xvdb</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The name of the data cloud disk. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssdData</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>Specifies whether to encrypt the data cloud disk. Valid values:</p>
         * <ul>
         * <li>true: encrypts the data cloud disk.</li>
         * <li>false: does not encrypt the data cloud disk.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public String encrypted;

        /**
         * <p>The ID of the Key Management Service (KMS) key used by the data cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The settings of the performance level for the data cloud disk when it is an ESSD. Valid values:</p>
         * <ul>
         * <li>PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</li>
         * <li>PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <blockquote>
         * <p>For more information about how to select the performance level of an ESSD, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The provisioned IOPS (Input/Output Operations Per Second) performance metrics of the data cloud disk.</p>
         * <blockquote>
         * <p>IOPS indicates the number of I/O operations that can be processed per second. It measures the read and write capabilities of block storage. Unit: operations per second.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        /**
         * <p>The size of the data cloud disk. Unit: GiB. Valid values:</p>
         * <ul>
         * <li>cloud: 5 to 2000.</li>
         * <li>cloud_efficiency: 20 to 32768.</li>
         * <li>cloud_essd: 20 to 32768.</li>
         * <li>ephemeral_ssd: 5 to 800.</li>
         * </ul>
         * <p>If you specify this parameter, the disk size must be greater than or equal to the snapshot size specified by SnapshotId.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The snapshot used to create the data cloud disk. If this parameter is specified, DataDisks.Size is ignored, and the actual size of the created disk is the size of the specified snapshot.</p>
         * <p>If the snapshot was created on or before July 15, 2013, the call is rejected and the InvalidSnapshot.TooOld error code is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>s-280s7****</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        public static CreateScalingConfigurationRequestDataDisks build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingConfigurationRequestDataDisks self = new CreateScalingConfigurationRequestDataDisks();
            return TeaModel.build(map, self);
        }

        public CreateScalingConfigurationRequestDataDisks setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public CreateScalingConfigurationRequestDataDisks setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public CreateScalingConfigurationRequestDataDisks setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public CreateScalingConfigurationRequestDataDisks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateScalingConfigurationRequestDataDisks setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public CreateScalingConfigurationRequestDataDisks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateScalingConfigurationRequestDataDisks setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public CreateScalingConfigurationRequestDataDisks setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public CreateScalingConfigurationRequestDataDisks setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public CreateScalingConfigurationRequestDataDisks setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public CreateScalingConfigurationRequestDataDisks setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public CreateScalingConfigurationRequestDataDisks setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public CreateScalingConfigurationRequestDataDisks setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public CreateScalingConfigurationRequestDataDisks setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

    }

    public static class CreateScalingConfigurationRequestInstancePatternInfos extends TeaModel {
        /**
         * <p>The architecture type of the instance type. Valid values:</p>
         * <ul>
         * <li>X86: x86 computing.</li>
         * <li>Heterogeneous: heterogeneous computing, such as GPU or FPGA.</li>
         * <li>BareMental: ECS bare metal server.</li>
         * <li>Arm: Arm computing.</li>
         * </ul>
         * <p>Default value: all architecture types.</p>
         */
        @NameInMap("Architectures")
        public java.util.List<String> architectures;

        /**
         * <p>Specifies whether the instance type is a burstable instance type. Valid values:</p>
         * <ul>
         * <li>Exclude: does not include burstable instance types.</li>
         * <li>Include: includes burstable instance types.</li>
         * <li>Required: includes only burstable instance types.</li>
         * </ul>
         * <p>Default value: Include.</p>
         * 
         * <strong>example:</strong>
         * <p>Include</p>
         */
        @NameInMap("BurstablePerformance")
        public String burstablePerformance;

        /**
         * <p>The number of vCPUs of the instance type in intelligent configuration mode. This parameter is used to filter instance types that meet your requirements. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li><p>The InstancePatternInfos parameter is applicable only when the network type of the scaling group is VPC.</p>
         * </li>
         * <li><p>You must configure both InstancePatternInfos.Cores and InstancePatternInfos.Memory when you use the InstancePatternInfos parameter.</p>
         * </li>
         * <li><p>If you have already specified instance types by using the InstanceType or InstanceTypes parameter, Auto Scaling preferentially uses the specified instance types for scale-out. If the specified instance types are out of stock, Auto Scaling preferentially uses the instance type that has the lowest price among the instance types that meet the requirements specified by the InstancePatternInfos parameter.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cores")
        public Integer cores;

        /**
         * <p>The CPU architecture of the instance. Valid values:</p>
         * <blockquote>
         * <p>N indicates that you can specify multiple CPU architectures. Valid values of N: 1 to 2.</p>
         * </blockquote>
         * <ul>
         * <li>X86.</li>
         * <li>ARM.</li>
         * </ul>
         */
        @NameInMap("CpuArchitectures")
        public java.util.List<String> cpuArchitectures;

        /**
         * <p>The instance types to be excluded. You can use a wildcard (*) to exclude a single instance type or an entire instance family. Examples:</p>
         * <ul>
         * <li>ecs.c6.large: excludes the ecs.c6.large instance type.</li>
         * <li>ecs.c6.*: excludes all instance types in the c6 instance family.</li>
         * </ul>
         */
        @NameInMap("ExcludedInstanceTypes")
        public java.util.List<String> excludedInstanceTypes;

        /**
         * <p>The GPU type.</p>
         */
        @NameInMap("GpuSpecs")
        public java.util.List<String> gpuSpecs;

        /**
         * <p>The instance categorization. Valid values:</p>
         * <blockquote>
         * <p>N indicates the Settings for multiple instance categories. Valid values of N: 1 to 10.</p>
         * </blockquote>
         * <ul>
         * <li>General-purpose: general-purpose.</li>
         * <li>Compute-optimized: compute-optimized.</li>
         * <li>Memory-optimized: memory-optimized.</li>
         * <li>Big data: big data.</li>
         * <li>Local SSDs: local SSD.</li>
         * <li>High Clock Speed: high frequency.</li>
         * <li>Enhanced: enhanced.</li>
         * <li>Shared: shared.</li>
         * <li>Compute-optimized with GPU: GPU computing.</li>
         * <li>Visual Compute-optimized: visual compute-optimized.</li>
         * <li>Heterogeneous Service: heterogeneous service.</li>
         * <li>Compute-optimized with FPGA: FPGA-accelerated compute-optimized.</li>
         * <li>Compute-optimized with NPU: NPU-accelerated compute-optimized.</li>
         * <li>ECS Bare Metal: ECS Bare Metal Instance.</li>
         * <li>High Performance Compute: high-performance computing (HPC).</li>
         * </ul>
         */
        @NameInMap("InstanceCategories")
        public java.util.List<String> instanceCategories;

        /**
         * <p>The level of the instance family. This parameter is used to filter instance types that meet your requirements and takes effect when <code>CostOptimization</code> is enabled. Valid values:</p>
         * <ul>
         * <li>EntryLevel: shared instance types. These instance types are more cost-effective but cannot ensure consistent computing performance. They are suitable for scenarios where the CPU utilization is typically low. For more information, see <a href="https://help.aliyun.com/document_detail/108489.html">Shared instance families</a>.</li>
         * <li>EnterpriseLevel: enterprise-level instance types. These instance types provide consistent performance and dedicated resources. They are suitable for scenarios that require high stability. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</li>
         * <li>CreditEntryLevel: credit-based entry-level instance types, which are burstable instances. These instance types use CPU credits to ensure computing performance and are suitable for scenarios where the CPU utilization is typically low but occasionally bursts. For more information, see <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EnterpriseLevel</p>
         */
        @NameInMap("InstanceFamilyLevel")
        public String instanceFamilyLevel;

        /**
         * <p>The instance families to be queried. N indicates that you can specify multiple instance families. Valid values of N: 1 to 10.</p>
         */
        @NameInMap("InstanceTypeFamilies")
        public java.util.List<String> instanceTypeFamilies;

        /**
         * <p>The maximum acceptable hourly price for pay-as-you-go or spot instances in intelligent configuration mode. This parameter is used to filter instance types that meet your requirements.</p>
         * <blockquote>
         * <p>This parameter is required when SpotStrategy is set to SpotWithPriceLimit. In other cases, this parameter is optional.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxPrice")
        public Float maxPrice;

        /**
         * <p>The maximum number of vCPUs of the instance type.</p>
         * <blockquote>
         * <p>The value of MaximumCpuCoreCount cannot exceed four times the value of MinimumCpuCoreCount.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("MaximumCpuCoreCount")
        public Integer maximumCpuCoreCount;

        /**
         * <p>The maximum number of GPUs for the instance. Valid values: positive integers.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaximumGpuAmount")
        public Integer maximumGpuAmount;

        /**
         * <p>The maximum memory size of the instance. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("MaximumMemorySize")
        public Float maximumMemorySize;

        /**
         * <p>The memory size of the instance type in intelligent configuration mode. Unit: GiB. This parameter is used to filter instance types that meet your requirements.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The minimum baseline vCPU computing performance (the sum of all vCPUs) for t5 and t6 burstable instances.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("MinimumBaselineCredit")
        public Integer minimumBaselineCredit;

        /**
         * <p>The minimum number of vCPUs of the instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MinimumCpuCoreCount")
        public Integer minimumCpuCoreCount;

        /**
         * <p>The minimum upper limit on the number of IPv6 addresses per elastic network interfaces (ENIs) or network interface controller (NIC) for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinimumEniIpv6AddressQuantity")
        public Integer minimumEniIpv6AddressQuantity;

        /**
         * <p>The minimum upper limit on the number of IPv4 addresses per elastic network interfaces (ENIs) or network interface controller (NIC) for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MinimumEniPrivateIpAddressQuantity")
        public Integer minimumEniPrivateIpAddressQuantity;

        /**
         * <p>The minimum upper limit on the number of network interface controller (NIC) devices that can be mounted to the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MinimumEniQuantity")
        public Integer minimumEniQuantity;

        /**
         * <p>The minimum number of GPUs for the instance. Valid values: positive integers.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MinimumGpuAmount")
        public Integer minimumGpuAmount;

        /**
         * <p>The minimum initial vCPU credit value for t5 and t6 burstable instances.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("MinimumInitialCredit")
        public Integer minimumInitialCredit;

        /**
         * <p>The minimum memory size of the instance. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("MinimumMemorySize")
        public Float minimumMemorySize;

        /**
         * <p>The physical processor model of the instance. N indicates that you can specify multiple processor models. Valid values of N: 1 to 10.</p>
         */
        @NameInMap("PhysicalProcessorModels")
        public java.util.List<String> physicalProcessorModels;

        public static CreateScalingConfigurationRequestInstancePatternInfos build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingConfigurationRequestInstancePatternInfos self = new CreateScalingConfigurationRequestInstancePatternInfos();
            return TeaModel.build(map, self);
        }

        public CreateScalingConfigurationRequestInstancePatternInfos setArchitectures(java.util.List<String> architectures) {
            this.architectures = architectures;
            return this;
        }
        public java.util.List<String> getArchitectures() {
            return this.architectures;
        }

        public CreateScalingConfigurationRequestInstancePatternInfos setBurstablePerformance(String burstablePerformance) {
            this.burstablePerformance = burstablePerformance;
            return this;
        }
        public String getBurstablePerformance() {
            return this.burstablePerformance;
        }

        public CreateScalingConfigurationRequestInstancePatternInfos setCores(Integer cores) {
            this.cores = cores;
            return this;
        }
        public Integer getCores() {
            return this.cores;
        }

        public CreateScalingConfigurationRequestInstancePatternInfos setCpuArchitectures(java.util.List<String> cpuArchitectures) {
            this.cpuArchitectures = cpuArchitectures;
            return this;
        }
        public java.util.List<String> getCpuArchitectures() {
            return this.cpuArchitectures;
        }

        public CreateScalingConfigurationRequestInstancePatternInfos setExcludedInstanceTypes(java.util.List<String> excludedInstanceTypes) {
            this.excludedInstanceTypes = excludedInstanceTypes;
            return this;
        }
        public java.util.List<String> getExcludedInstanceTypes() {
            return this.excludedInstanceTypes;
        }

        public CreateScalingConfigurationRequestInstancePatternInfos setGpuSpecs(java.util.List<String> gpuSpecs) {
            this.gpuSpecs = gpuSpecs;
            return this;
        }
        public java.util.List<String> getGpuSpecs() {
            return this.gpuSpecs;
        }

        public CreateScalingConfigurationRequestInstancePatternInfos setInstanceCategories(java.util.List<String> instanceCategories) {
            this.instanceCategories = instanceCategories;
            return this;
        }
        public java.util.List<String> getInstanceCategories() {
            return this.instanceCategories;
        }

        public CreateScalingConfigurationRequestInstancePatternInfos setInstanceFamilyLevel(String instanceFamilyLevel) {
            this.instanceFamilyLevel = instanceFamilyLevel;
            return this;
        }
        public String getInstanceFamilyLevel() {
            return this.instanceFamilyLevel;
        }

        public CreateScalingConfigurationRequestInstancePatternInfos setInstanceTypeFamilies(java.util.List<String> instanceTypeFamilies) {
            this.instanceTypeFamilies = instanceTypeFamilies;
            return this;
        }
        public java.util.List<String> getInstanceTypeFamilies() {
            return this.instanceTypeFamilies;
        }

        public CreateScalingConfigurationRequestInstancePatternInfos setMaxPrice(Float maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }
        public Float getMaxPrice() {
            return this.maxPrice;
        }

        public CreateScalingConfigurationRequestInstancePatternInfos setMaximumCpuCoreCount(Integer maximumCpuCoreCount) {
            this.maximumCpuCoreCount = maximumCpuCoreCount;
            return this;
        }
        public Integer getMaximumCpuCoreCount() {
            return this.maximumCpuCoreCount;
        }

        public CreateScalingConfigurationRequestInstancePatternInfos setMaximumGpuAmount(Integer maximumGpuAmount) {
            this.maximumGpuAmount = maximumGpuAmount;
            return this;
        }
        public Integer getMaximumGpuAmount() {
            return this.maximumGpuAmount;
        }

        public CreateScalingConfigurationRequestInstancePatternInfos setMaximumMemorySize(Float maximumMemorySize) {
            this.maximumMemorySize = maximumMemorySize;
            return this;
        }
        public Float getMaximumMemorySize() {
            return this.maximumMemorySize;
        }

        public CreateScalingConfigurationRequestInstancePatternInfos setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public CreateScalingConfigurationRequestInstancePatternInfos setMinimumBaselineCredit(Integer minimumBaselineCredit) {
            this.minimumBaselineCredit = minimumBaselineCredit;
            return this;
        }
        public Integer getMinimumBaselineCredit() {
            return this.minimumBaselineCredit;
        }

        public CreateScalingConfigurationRequestInstancePatternInfos setMinimumCpuCoreCount(Integer minimumCpuCoreCount) {
            this.minimumCpuCoreCount = minimumCpuCoreCount;
            return this;
        }
        public Integer getMinimumCpuCoreCount() {
            return this.minimumCpuCoreCount;
        }

        public CreateScalingConfigurationRequestInstancePatternInfos setMinimumEniIpv6AddressQuantity(Integer minimumEniIpv6AddressQuantity) {
            this.minimumEniIpv6AddressQuantity = minimumEniIpv6AddressQuantity;
            return this;
        }
        public Integer getMinimumEniIpv6AddressQuantity() {
            return this.minimumEniIpv6AddressQuantity;
        }

        public CreateScalingConfigurationRequestInstancePatternInfos setMinimumEniPrivateIpAddressQuantity(Integer minimumEniPrivateIpAddressQuantity) {
            this.minimumEniPrivateIpAddressQuantity = minimumEniPrivateIpAddressQuantity;
            return this;
        }
        public Integer getMinimumEniPrivateIpAddressQuantity() {
            return this.minimumEniPrivateIpAddressQuantity;
        }

        public CreateScalingConfigurationRequestInstancePatternInfos setMinimumEniQuantity(Integer minimumEniQuantity) {
            this.minimumEniQuantity = minimumEniQuantity;
            return this;
        }
        public Integer getMinimumEniQuantity() {
            return this.minimumEniQuantity;
        }

        public CreateScalingConfigurationRequestInstancePatternInfos setMinimumGpuAmount(Integer minimumGpuAmount) {
            this.minimumGpuAmount = minimumGpuAmount;
            return this;
        }
        public Integer getMinimumGpuAmount() {
            return this.minimumGpuAmount;
        }

        public CreateScalingConfigurationRequestInstancePatternInfos setMinimumInitialCredit(Integer minimumInitialCredit) {
            this.minimumInitialCredit = minimumInitialCredit;
            return this;
        }
        public Integer getMinimumInitialCredit() {
            return this.minimumInitialCredit;
        }

        public CreateScalingConfigurationRequestInstancePatternInfos setMinimumMemorySize(Float minimumMemorySize) {
            this.minimumMemorySize = minimumMemorySize;
            return this;
        }
        public Float getMinimumMemorySize() {
            return this.minimumMemorySize;
        }

        public CreateScalingConfigurationRequestInstancePatternInfos setPhysicalProcessorModels(java.util.List<String> physicalProcessorModels) {
            this.physicalProcessorModels = physicalProcessorModels;
            return this;
        }
        public java.util.List<String> getPhysicalProcessorModels() {
            return this.physicalProcessorModels;
        }

    }

    public static class CreateScalingConfigurationRequestInstanceTypeCandidateOptions extends TeaModel {
        /**
         * <p>Specifies the CIDR blocks of the optional vSwitches when you add vSwitches in other zones.</p>
         */
        @NameInMap("AllowCidrBlocks")
        public java.util.List<String> allowCidrBlocks;

        /**
         * <p>Specifies whether to allow supplementing vSwitches in other zones.</p>
         * <blockquote>
         * <p>The instance types remain unchanged, and only new zones are used as candidates. If the scaling group cannot scale out in all selected zones due to issues such as insufficient stock, the system automatically adds vSwitches in new zones to the scaling group based on this configuration.
         * For example, if the scaling group is configured with the cn-hangzhou-h and cn-hangzhou-g zones, and scale-out fails in both zones, Auto Scaling may create a vSwitch in the cn-hangzhou-k zone and add it to the scaling group based on real-time stock availability.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowCrossAz")
        public Boolean allowCrossAz;

        /**
         * <p>Specifies whether to allow supplementing instance types of other generations.</p>
         * <ul>
         * <li>For example, if the current instance type is ecs.c7.large, instance types such as ecs.c6.large and ecs.c8.large can be used as candidates after this feature is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowDifferentGeneration")
        public Boolean allowDifferentGeneration;

        /**
         * <p>Specifies whether to enable the candidate mode.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The maximum price for candidate instance types.</p>
         * 
         * <strong>example:</strong>
         * <p>2.10</p>
         */
        @NameInMap("MaxPrice")
        public Float maxPrice;

        public static CreateScalingConfigurationRequestInstanceTypeCandidateOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingConfigurationRequestInstanceTypeCandidateOptions self = new CreateScalingConfigurationRequestInstanceTypeCandidateOptions();
            return TeaModel.build(map, self);
        }

        public CreateScalingConfigurationRequestInstanceTypeCandidateOptions setAllowCidrBlocks(java.util.List<String> allowCidrBlocks) {
            this.allowCidrBlocks = allowCidrBlocks;
            return this;
        }
        public java.util.List<String> getAllowCidrBlocks() {
            return this.allowCidrBlocks;
        }

        public CreateScalingConfigurationRequestInstanceTypeCandidateOptions setAllowCrossAz(Boolean allowCrossAz) {
            this.allowCrossAz = allowCrossAz;
            return this;
        }
        public Boolean getAllowCrossAz() {
            return this.allowCrossAz;
        }

        public CreateScalingConfigurationRequestInstanceTypeCandidateOptions setAllowDifferentGeneration(Boolean allowDifferentGeneration) {
            this.allowDifferentGeneration = allowDifferentGeneration;
            return this;
        }
        public Boolean getAllowDifferentGeneration() {
            return this.allowDifferentGeneration;
        }

        public CreateScalingConfigurationRequestInstanceTypeCandidateOptions setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateScalingConfigurationRequestInstanceTypeCandidateOptions setMaxPrice(Float maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }
        public Float getMaxPrice() {
            return this.maxPrice;
        }

    }

    public static class CreateScalingConfigurationRequestInstanceTypeOverrides extends TeaModel {
        /**
         * <p>When you need the scaling group to scale based on the capacity of the instance type, specify both this parameter and WeightedCapacity.</p>
         * <p>This parameter specifies the instance type and overrides the instance type in the launch template. You can specify N instance types to extend the launch template to support N instance types. Valid values of N: 1 to 20.</p>
         * <blockquote>
         * <p>This parameter takes effect only when LaunchTemplateId is specified.</p>
         * </blockquote>
         * <p>Valid values of InstanceType: available ECS instance types.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c5.xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>When you need to specify the capacity of the instance type in the scaling configuration, specify this parameter after you specify InstanceTypeOverrides.InstanceType.</p>
         * <p>This parameter specifies the weight of the instance type, which indicates the capacity that a single instance of the instance type provides in the scaling group. A greater weight indicates that fewer instances of this instance type are required to meet the expected capacity.</p>
         * <p>Because instance types have different performance metrics such as the number of vCPUs and memory size, you can configure different weights for different instance types based on your business requirements.</p>
         * <p>Example:</p>
         * <ul>
         * <li>Current capacity: 0.</li>
         * <li>Expected capacity: 6.</li>
         * <li>Capacity of the ecs.c5.xlarge instance type: 4.</li>
         * </ul>
         * <p>To meet the expected capacity, the scaling group scales out by adding two ecs.c5.xlarge instances.</p>
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

        public static CreateScalingConfigurationRequestInstanceTypeOverrides build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingConfigurationRequestInstanceTypeOverrides self = new CreateScalingConfigurationRequestInstanceTypeOverrides();
            return TeaModel.build(map, self);
        }

        public CreateScalingConfigurationRequestInstanceTypeOverrides setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CreateScalingConfigurationRequestInstanceTypeOverrides setWeightedCapacity(Integer weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public Integer getWeightedCapacity() {
            return this.weightedCapacity;
        }

    }

    public static class CreateScalingConfigurationRequestNetworkInterfaces extends TeaModel {
        /**
         * <p>The elastic network interfaces (ENIs) type. When you use this parameter, you must use the NetworkInterfaces Settings for the primary network interface controller (NIC), and you cannot set the SecurityGroupId or SecurityGroupIds parameter. Valid values:</p>
         * <ul>
         * <li><p>Primary: primary elastic network interface (ENI).</p>
         * </li>
         * <li><p>Secondary: secondary elastic network interface (ENI).</p>
         * </li>
         * </ul>
         * <p>Default value: Secondary.</p>
         * 
         * <strong>example:</strong>
         * <p>Primary</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The number of randomly generated IPv6 addresses for the primary ENI.
         * Take note of the following items:</p>
         * <ul>
         * <li><p>This parameter takes effect only when NetworkInterface.InstanceType is set to Primary. If NetworkInterface.InstanceType is set to Secondary or left empty, you cannot configure this parameter.</p>
         * </li>
         * <li><p>After you configure this parameter, you cannot configure Ipv6AddressCount.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Ipv6AddressCount")
        public Integer ipv6AddressCount;

        /**
         * <p>The communication pattern of the network interface controller (NIC). Valid values of the parameter:</p>
         * <ul>
         * <li>Standard: uses the TCP communication pattern.</li>
         * <li>HighPerformance: enables the Elastic RDMA Interface (ERI) and uses the RDMA communication pattern.</li>
         * </ul>
         * <p>Default value: Standard.</p>
         * <blockquote>
         * <p>The number of elastic network interfaces (ENIs) in RDMA pattern cannot exceed the limit of the instance family. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HighPerformance</p>
         */
        @NameInMap("NetworkInterfaceTrafficMode")
        public String networkInterfaceTrafficMode;

        /**
         * <p>The number of secondary private IPv4 addresses to be assigned to the ENI. Valid values: 1 to 49.</p>
         * <ul>
         * <li><p>The value cannot exceed the limit on the number of IP addresses for the instance type. For more information, see <a href="https://www.alibabacloud.com/help/en/ecs/user-guide/overview-of-instance-families">Instance families</a>.</p>
         * </li>
         * <li><p>NetworkInterface.N.SecondaryPrivateIpAddressCount specifies the number of secondary private IPv4 addresses to be assigned to the ENI, excluding the primary private IP address of the ENI. The system randomly assigns these addresses from the available CIDR block of the vSwitch (NetworkInterface.N.VSwitchId) to which the ENI belongs.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("SecondaryPrivateIpAddressCount")
        public Integer secondaryPrivateIpAddressCount;

        /**
         * <p>The IDs of one or more security groups to which the elastic network interfaces (ENIs) belong.</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>The ID of the vSwitch to which the elastic network interfaces (ENIs) belong. N indicates the Settings for multiple vSwitches. Valid values of N: 1 to 10.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>If InstanceType is set to Primary, you cannot set this parameter. The default value is the vSwitch to which the instance belongs.</li>
         * <li>If InstanceType is set to Secondary or left empty, this parameter is optional.</li>
         * <li>The system selects a vSwitch that is in the same zone as the primary network interface controller (NIC) and has the most active IP addresses.</li>
         * </ul>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        public static CreateScalingConfigurationRequestNetworkInterfaces build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingConfigurationRequestNetworkInterfaces self = new CreateScalingConfigurationRequestNetworkInterfaces();
            return TeaModel.build(map, self);
        }

        public CreateScalingConfigurationRequestNetworkInterfaces setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CreateScalingConfigurationRequestNetworkInterfaces setIpv6AddressCount(Integer ipv6AddressCount) {
            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }
        public Integer getIpv6AddressCount() {
            return this.ipv6AddressCount;
        }

        public CreateScalingConfigurationRequestNetworkInterfaces setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
            this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
            return this;
        }
        public String getNetworkInterfaceTrafficMode() {
            return this.networkInterfaceTrafficMode;
        }

        public CreateScalingConfigurationRequestNetworkInterfaces setSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
            this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
            return this;
        }
        public Integer getSecondaryPrivateIpAddressCount() {
            return this.secondaryPrivateIpAddressCount;
        }

        public CreateScalingConfigurationRequestNetworkInterfaces setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public CreateScalingConfigurationRequestNetworkInterfaces setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

    }

    public static class CreateScalingConfigurationRequestResourcePoolOptionsPrivatePoolTags extends TeaModel {
        /**
         * <p>The tag key of the private pool.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the private pool.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateScalingConfigurationRequestResourcePoolOptionsPrivatePoolTags build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingConfigurationRequestResourcePoolOptionsPrivatePoolTags self = new CreateScalingConfigurationRequestResourcePoolOptionsPrivatePoolTags();
            return TeaModel.build(map, self);
        }

        public CreateScalingConfigurationRequestResourcePoolOptionsPrivatePoolTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateScalingConfigurationRequestResourcePoolOptionsPrivatePoolTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateScalingConfigurationRequestResourcePoolOptions extends TeaModel {
        /**
         * <p>The ID of the private pool, which is the ID of the elasticity assurance or capacity reservation service. You can only specify the ID of a private pool in Target mode, and you cannot specify this parameter together with PrivatePoolTags.</p>
         */
        @NameInMap("PrivatePoolIds")
        public java.util.List<String> privatePoolIds;

        /**
         * <p>Filters available Target private pools by tag. Valid values of N: 1 to 20.
         * Note:</p>
         * <ul>
         * <li>When you configure this parameter, the system filters private pools from the Target private pools associated with your account. The filtered private pools must match the tags and meet the scaling group constraints, such as zone and instance type.</li>
         * <li>Tag matching rule: The private pool must match all specified tags.</li>
         * <li>You cannot specify this parameter together with PrivatePoolIds.</li>
         * </ul>
         */
        @NameInMap("PrivatePoolTags")
        public java.util.List<CreateScalingConfigurationRequestResourcePoolOptionsPrivatePoolTags> privatePoolTags;

        /**
         * <p>Resource pools include private pools generated after the elasticity assurance or capacity reservation service takes effect, as well as public pools. They are available for selection when the instance starts. Valid values:</p>
         * <ul>
         * <li><p>PrivatePoolFirst: private pools take precedence. When you select this policy, if ResourcePoolOptions.PrivatePoolIds is specified or the PrivatePoolTags condition is met, the corresponding private pool is preferentially used. If no private pool is specified or the specified private pool has insufficient capacity, the system automatically matches an open private pool. If no eligible private pool is available, the public pool is used to create the instance.</p>
         * </li>
         * <li><p>PrivatePoolOnly: only private pools are used. When you select this policy, you must specify ResourcePoolOptions.PrivatePoolIds. If the specified private pool has insufficient capacity, the instance fails to start.</p>
         * </li>
         * <li><p>PublicPoolFirst: public pool resources take precedence. The public pool is preferentially used to create the instance. When public pool resources are insufficient, private pool resources are used as a supplement. The system preferentially and automatically matches an open private pool. If no eligible private pool is available, the specified ResourcePoolOptions.PrivatePoolIds or a Target private pool that meets the PrivatePoolTags condition is used. (This policy is in invitational preview and is not supported yet.)</p>
         * </li>
         * <li><p>None: no resource pool policy is used.</p>
         * </li>
         * </ul>
         * <p>Default value: None.</p>
         * 
         * <strong>example:</strong>
         * <p>PrivatePoolFirst</p>
         */
        @NameInMap("Strategy")
        public String strategy;

        public static CreateScalingConfigurationRequestResourcePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingConfigurationRequestResourcePoolOptions self = new CreateScalingConfigurationRequestResourcePoolOptions();
            return TeaModel.build(map, self);
        }

        public CreateScalingConfigurationRequestResourcePoolOptions setPrivatePoolIds(java.util.List<String> privatePoolIds) {
            this.privatePoolIds = privatePoolIds;
            return this;
        }
        public java.util.List<String> getPrivatePoolIds() {
            return this.privatePoolIds;
        }

        public CreateScalingConfigurationRequestResourcePoolOptions setPrivatePoolTags(java.util.List<CreateScalingConfigurationRequestResourcePoolOptionsPrivatePoolTags> privatePoolTags) {
            this.privatePoolTags = privatePoolTags;
            return this;
        }
        public java.util.List<CreateScalingConfigurationRequestResourcePoolOptionsPrivatePoolTags> getPrivatePoolTags() {
            return this.privatePoolTags;
        }

        public CreateScalingConfigurationRequestResourcePoolOptions setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

    }

    public static class CreateScalingConfigurationRequestSecurityOptions extends TeaModel {
        /**
         * <p>The confidential computing mode. Valid values:</p>
         * <ul>
         * <li>Enclave: The ECS instance uses Enclave to build a confidential computing environment. For more information, see <a href="https://help.aliyun.com/document_detail/203433.html">Build a confidential computing environment by using Enclave</a>.</li>
         * <li>TDX: builds a TDX confidential computing environment. For more information, see <a href="https://help.aliyun.com/document_detail/479090.html">Build a TDX confidential computing environment</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TDX</p>
         */
        @NameInMap("ConfidentialComputingMode")
        public String confidentialComputingMode;

        public static CreateScalingConfigurationRequestSecurityOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingConfigurationRequestSecurityOptions self = new CreateScalingConfigurationRequestSecurityOptions();
            return TeaModel.build(map, self);
        }

        public CreateScalingConfigurationRequestSecurityOptions setConfidentialComputingMode(String confidentialComputingMode) {
            this.confidentialComputingMode = confidentialComputingMode;
            return this;
        }
        public String getConfidentialComputingMode() {
            return this.confidentialComputingMode;
        }

    }

    public static class CreateScalingConfigurationRequestSpotPriceLimits extends TeaModel {
        /**
         * <p>The instance type of the spot instance. This parameter takes effect only when SpotStrategy is set to SpotWithPriceLimit.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The maximum hourly price for the spot instance. This parameter takes effect only when SpotStrategy is set to SpotWithPriceLimit.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("PriceLimit")
        public Float priceLimit;

        public static CreateScalingConfigurationRequestSpotPriceLimits build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingConfigurationRequestSpotPriceLimits self = new CreateScalingConfigurationRequestSpotPriceLimits();
            return TeaModel.build(map, self);
        }

        public CreateScalingConfigurationRequestSpotPriceLimits setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CreateScalingConfigurationRequestSpotPriceLimits setPriceLimit(Float priceLimit) {
            this.priceLimit = priceLimit;
            return this;
        }
        public Float getPriceLimit() {
            return this.priceLimit;
        }

    }

}
