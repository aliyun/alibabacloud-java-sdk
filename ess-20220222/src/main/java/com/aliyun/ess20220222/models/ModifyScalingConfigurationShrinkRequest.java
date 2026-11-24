// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ModifyScalingConfigurationShrinkRequest extends TeaModel {
    @NameInMap("ImageOptions")
    public ModifyScalingConfigurationShrinkRequestImageOptions imageOptions;

    @NameInMap("PrivatePoolOptions")
    public ModifyScalingConfigurationShrinkRequestPrivatePoolOptions privatePoolOptions;

    @NameInMap("SystemDisk")
    public ModifyScalingConfigurationShrinkRequestSystemDisk systemDisk;

    /**
     * <p>Specifies whether the instance on a dedicated host is associated with the dedicated host. Valid values:</p>
     * <ul>
     * <li><p>default: The instance is not associated with the dedicated host. When an instance that has the economical mode enabled is restarted, the instance may be placed on another dedicated host in the automatic deployment resource pool if the original dedicated host has insufficient resources.</p>
     * </li>
     * <li><p>host: The instance is associated with the dedicated host. When an instance that has the economical mode enabled is restarted, the instance remains on the original dedicated host. If the original dedicated host has insufficient resources, the instance fails to restart.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Affinity")
    public String affinity;

    /**
     * <p>The number of vCPUs. Unit: cores.</p>
     * <p>You can specify both CPU and Memory to define the range of instance types. For example, CPU=2 and Memory=16 defines all instance types with 2 vCPUs and 16 GiB of memory. Auto Scaling determines the set of active instance types based on factors such as I/O optimization and zones, and then creates instances of the lowest-priced instance type based on sorting by price.</p>
     * <blockquote>
     * <p>This configuration takes effect only when the cost optimization mode is enabled and no instance type is specified in the scaling configuration.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Cpu")
    public Integer cpu;

    /**
     * <p>Modifies the running mode of a burstable instance. Valid values:</p>
     * <ul>
     * <li><p>Standard: standard mode. For more information, see the performance constrained mode section in <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</p>
     * </li>
     * <li><p>Unlimited: unlimited mode. For more information, see the unlimited mode section in <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("CreditSpecification")
    public String creditSpecification;

    /**
     * <p>The custom priorities for ECS instance type + vSwitch combinations.</p>
     * <blockquote>
     * <p>Notice: This parameter takes effect only when the scaling policy of the scaling group is set to priority-based policy.</p>
     * </blockquote>
     * <p>When an instance cannot be created based on the instance type and vSwitch combination with a higher priority, Auto Scaling automatically selects the next-priority instance type and vSwitch combination to create the instance.</p>
     * <blockquote>
     * <p>If you specify custom priorities for only some instance type + vSwitch combinations, the unspecified combinations have lower priorities than the specified ones. The unspecified combinations are still prioritized based on the vSwitch order of the scaling group and the instance type order of the scaling configuration.</p>
     * <ul>
     * <li>For example, if the vSwitch order of the scaling group is vsw1 and vsw2, the instance type order of the scaling configuration is type1 and type2, and the custom priority order is [&quot;vsw2+type2&quot;, &quot;vsw1+type2&quot;], the final priority is: &quot;vsw2+type2&quot; &gt; &quot;vsw1+type2&quot; &gt; &quot;vsw1+type1&quot; &gt; &quot;vsw2+type1&quot;.</li>
     * </ul>
     * </blockquote>
     */
    @NameInMap("CustomPriorities")
    public java.util.List<ModifyScalingConfigurationShrinkRequestCustomPriorities> customPriorities;

    /**
     * <p>The collection of data cloud disk information.</p>
     */
    @NameInMap("DataDisks")
    public java.util.List<ModifyScalingConfigurationShrinkRequestDataDisks> dataDisks;

    /**
     * <p>The ID of the dedicated host cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>dc-zm04u8r3lohsq****</p>
     */
    @NameInMap("DedicatedHostClusterId")
    public String dedicatedHostClusterId;

    /**
     * <p>Specifies whether to create the ECS instance on a dedicated host. Because dedicated hosts do not support the creation of spot instances, if you specify the DedicatedHostId parameter, the SpotStrategy and SpotPriceLimit settings in the request are automatically ignored.</p>
     * <p>You can call the DescribeDedicatedHosts operation to query the list of dedicated host IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>dh-bp67acfmxazb4p****</p>
     */
    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    /**
     * <p>The release protection property of the instance. Specifies whether the instance can be directly released from the ECS console or by calling the DeleteInstance operation, to prevent accidental deletion. Valid values:</p>
     * <ul>
     * <li><p>true: Enables release protection. The instance cannot be directly released from the ECS console or by calling the DeleteInstance operation.</p>
     * </li>
     * <li><p>false: Disables release protection. The instance can be directly released from the ECS console or by calling the DeleteInstance operation.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This property applies only to pay-as-you-go instances. It prevents instances created by Auto Scaling scale-out activities from being accidentally deleted, but does not affect normal scale-in activities. Instances with release protection enabled can still be released by scale-in activities.</p>
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
     * <p>ds-bp13v7bjnj9gis****</p>
     */
    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    /**
     * <p>The hostname of the Elastic Compute Service (ECS) server. A period (.) or a hyphen (-) cannot be used as the first or last character, or used consecutively. In addition, the naming conventions for different types of instances are as follows: </p>
     * <ul>
     * <li>Windows instances: The hostname must be 2 to 15 characters in length and can contain letters, digits, and hyphens (-). It cannot contain periods (.) or consist entirely of digits. </li>
     * <li>Other instances (such as Linux): The hostname must be 2 to 64 characters in length and can contain multiple periods (.). Each segment between two periods (.) can contain letters, digits, and hyphens (-).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hos****</p>
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
     * <li>enabled: enabled.</li>
     * <li>disabled: disabled.</li>
     * </ul>
     * <p>Default value: enabled.</p>
     * <blockquote>
     * <p>For information about instance metadata, see <a href="https://help.aliyun.com/document_detail/108460.html">Overview of instance metadata</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("HttpEndpoint")
    public String httpEndpoint;

    /**
     * <p>Specifies whether to forcefully use the security-hardened mode (IMDSv2) to access instance metadata. Valid values:</p>
     * <ul>
     * <li>optional: does not forcefully use the security-hardened mode.</li>
     * <li>required: forcefully uses the security-hardened mode. After you set this value, instance metadata cannot be accessed in normal mode.</li>
     * </ul>
     * <p>Default value: optional.</p>
     * <blockquote>
     * <p>For more information about the modes for accessing instance metadata, see <a href="https://help.aliyun.com/document_detail/108460.html">Instance metadata access modes</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>optional</p>
     */
    @NameInMap("HttpTokens")
    public String httpTokens;

    /**
     * <p>The name of the image family. You can set this parameter to obtain the latest available image from the specified image family for instance creation. If you have specified the <code>ImageId</code> parameter, you cannot specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>hangzhou-daily-update</p>
     */
    @NameInMap("ImageFamily")
    public String imageFamily;

    /**
     * <p>The ID of the image file used for automatic creation of instances.</p>
     * <blockquote>
     * <p>If the image previously used in the scaling configuration includes a system cloud disk and data cloud disks, the data cloud disk information is purged after you change the image.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>centos6u5_64_20G_aliaegis_2014****.vhd</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The name of the image. Image names must be unique within a region. If you specify ImageId, ImageName is ignored.</p>
     * <p>You cannot use ImageName to specify images from Alibaba Cloud Marketplace.</p>
     * 
     * <strong>example:</strong>
     * <p>suse11sp3_64_20G_aliaegis_2015****.vhd</p>
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
     * <p>The name of the ECS instance that is automatically created by using the scaling configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>inst****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The collection of intelligent configuration information used to filter instance types that meet the requirements.</p>
     */
    @NameInMap("InstancePatternInfos")
    public java.util.List<ModifyScalingConfigurationShrinkRequestInstancePatternInfos> instancePatternInfos;

    /**
     * <p>After the fallback mode is enabled, when issues such as insufficient inventory are encountered, similar instance types of the same size are supplemented based on the currently selected instance types, or vSwitches in alternative zones are created and added to the scaling group.</p>
     */
    @NameInMap("InstanceTypeCandidateOptions")
    public ModifyScalingConfigurationShrinkRequestInstanceTypeCandidateOptions instanceTypeCandidateOptions;

    /**
     * <p>The information about specified instance types.</p>
     */
    @NameInMap("InstanceTypeOverrides")
    public java.util.List<ModifyScalingConfigurationShrinkRequestInstanceTypeOverrides> instanceTypeOverrides;

    /**
     * <p>The instance types for multiple instance type support. If InstanceTypes is specified, InstanceType is ignored.</p>
     * <p>When instances cannot be created by using the instance type with a higher priority, Auto Scaling automatically selects the instance type with the next priority to create instances.</p>
     */
    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    /**
     * <p>The billing method for network usage. Valid values:</p>
     * <ul>
     * <li>PayByBandwidth: pay-by-bandwidth. In this case, the value of InternetMaxBandwidthOut specifies the fixed bandwidth value. </li>
     * <li>PayByTraffic: pay-by-traffic. In this case, the value of InternetMaxBandwidthOut specifies only the maximum bandwidth, and billing is based on the actual network traffic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PayByBandwidth</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The maximum inbound public bandwidth. Unit: Mbit/s. Valid values:</p>
     * <ul>
     * <li>If the purchased maximum outbound public bandwidth is less than or equal to 10 Mbit/s: 1 to 10. Default value: 10.</li>
     * <li>If the purchased maximum outbound public bandwidth is greater than 10 Mbit/s: 1 to the value of <code>InternetMaxBandwidthOut</code>. Default value: the value of <code>InternetMaxBandwidthOut</code>.</li>
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
     * <p>Specifies whether the instance is an I/O optimized instance. Valid values:</p>
     * <ul>
     * <li>none: The instance is not an I/O optimized instance.</li>
     * <li>optimized: The instance is an I/O optimization instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("IoOptimized")
    public String ioOptimized;

    /**
     * <p>The number of randomly generated IPv6 addresses allocated to the elastic network interfaces (ENIs).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    /**
     * <p>The name of the key pair used to log on to the ECS instance. </p>
     * <ul>
     * <li>For Windows instances, this parameter is ignored and is empty by default. </li>
     * <li>For Linux instances, password-based logon is disabled during initialization.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>KeyPair_Name</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The weight of SLB backend server. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("LoadBalancerWeight")
    public Integer loadBalancerWeight;

    /**
     * <p>The memory size. Unit: GiB.</p>
     * <p>You can specify both CPU and Memory to define the range of instance types. For example, CPU=2 and Memory=16 defines all instance types with 2 vCPUs and 16 GiB of memory. Auto Scaling determines the set of active instance types based on factors such as I/O optimization and zones, and then creates instances of the lowest-priced instance type based on sorting by price.</p>
     * <blockquote>
     * <p>This configuration takes effect only when the cost optimization mode is enabled and no instance type is specified in the scaling configuration.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("Memory")
    public Integer memory;

    /**
     * <p>The list of elastic network interfaces (ENIs).</p>
     */
    @NameInMap("NetworkInterfaces")
    public java.util.List<ModifyScalingConfigurationShrinkRequestNetworkInterfaces> networkInterfaces;

    /**
     * <p>Specifies whether to override existing data. Valid values:</p>
     * <ul>
     * <li>true: overrides existing data.</li>
     * <li>false: does not override existing data.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Override")
    public Boolean override;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The password of the ECS instance. The password must be 8 to 30 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The following special characters are supported:</p>
     * <p>`()~!@#$%^&amp;*-_+=\|{}[]:;\&quot;&lt;&gt;,.?/</p>
     * <p>For Windows instances, the password cannot start with a forward slash (/).</p>
     * <blockquote>
     * <p>If you specify the Password parameter, we recommend that you send the request over HTTPS to prevent password leaks.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123abc****</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>Specifies whether to use the password preset in the image. To use this parameter, ensure that a password is configured for the image.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    /**
     * <p>The name of the RAM role associated with the ECS instance. This name is provided and maintained by RAM. You can call the ListRoles operation to query available RAM roles. For more information about how to create a RAM role, see the CreateRole operation.</p>
     * 
     * <strong>example:</strong>
     * <p>RamRoleTest</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The ID of the resource group to which the ECS instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>abcd1234abcd****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The resource pool policy used when creating instances. After you specify this parameter, note the following items:</p>
     * <ul>
     * <li><p>This parameter takes effect only when pay-as-you-go instances are created.</p>
     * </li>
     * <li><p>This parameter cannot be specified together with PrivatePoolOptions.MatchCriteria or PrivatePoolOptions.Id.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ResourcePoolOptions")
    public ModifyScalingConfigurationShrinkRequestResourcePoolOptions resourcePoolOptions;

    /**
     * <p>The ID of the scaling configuration that you want to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asc-bp16har3jpj6fjbx****</p>
     */
    @NameInMap("ScalingConfigurationId")
    public String scalingConfigurationId;

    /**
     * <p>The name of the scaling configuration. The name must be 2 to 64 characters in length and can contain letters, digits, underscores (_), hyphens (-), and periods (.). It must start with a letter, digit, or Chinese character.</p>
     * <p>The name of the scaling configuration must be unique within a scaling group in the same region. If you do not specify this parameter, the ID of the scaling configuration is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>test-modify</p>
     */
    @NameInMap("ScalingConfigurationName")
    public String scalingConfigurationName;

    /**
     * <p>The scheduler options.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;managedPrivateSpaceId&quot;:&quot;testManagedPrivateSpaceId****&quot;}</p>
     */
    @NameInMap("SchedulerOptions")
    public String schedulerOptionsShrink;

    /**
     * <p>Specifies whether a vSwitch must be selected from the VSwitchIds list for the secondary elastic network interfaces (ENIs) when the VSwitchIds parameter is set for the secondary network interface controller (NIC).</p>
     * <ul>
     * <li>Strict: strict mode. If no vSwitch in VSwitchIds meets the conditional requirements, instance creation fails.</li>
     * <li>Tolerant: tolerant mode. If no vSwitch in VSwitchIds meets the conditional requirements, no secondary network interface controller (NIC) is configured, but the instance is still created as active.</li>
     * </ul>
     * <p>Default value: Strict.</p>
     * 
     * <strong>example:</strong>
     * <p>Strict</p>
     */
    @NameInMap("SecondaryEniVSwitchConstraint")
    public String secondaryEniVSwitchConstraint;

    /**
     * <p>The ID of the security group to which the ECS instance belongs. ECS instances in the same security group can access each other.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-F876F****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The IDs of the security groups to which the instance belongs.</p>
     */
    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    /**
     * <p>The security options.</p>
     */
    @NameInMap("SecurityOptions")
    public ModifyScalingConfigurationShrinkRequestSecurityOptions securityOptions;

    /**
     * <p>The protection period of the spot instance. Unit: hours. Valid values:</p>
     * <ul>
     * <li>1: After a spot instance is created, Alibaba Cloud ensures that the instance is not automatically released within 1 hour. After 1 hour, the system compares the bid price with the market price and checks resource availability to determine whether to retain automatic release the instance.</li>
     * <li>0: After a spot instance is created, Alibaba Cloud does not ensure that the instance runs for 1 hour. The system compares the bid price with the market price and checks resource availability to determine whether to retain automatic release the instance.</li>
     * </ul>
     * <blockquote>
     * <p>Alibaba Cloud sends an ECS system event notification 5 minutes before the instance is released. Spot instances are billed by second. We recommend that you select an appropriate protection period based on the expected task execution duration.</p>
     * </blockquote>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SpotDuration")
    public Integer spotDuration;

    /**
     * <p>The interruption mode of the spot instance. Currently, only Terminate (default) is supported, which directly releases the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Terminate</p>
     */
    @NameInMap("SpotInterruptionBehavior")
    public String spotInterruptionBehavior;

    /**
     * <p>The information about spot instance types.</p>
     */
    @NameInMap("SpotPriceLimits")
    public java.util.List<ModifyScalingConfigurationShrinkRequestSpotPriceLimits> spotPriceLimits;

    /**
     * <p>The preemption policy for pay-as-you-go instances. Valid values:</p>
     * <ul>
     * <li>NoSpot: a regular pay-as-you-go instance.</li>
     * <li>SpotWithPriceLimit: a spot instance with a user-defined maximum hourly price.</li>
     * <li>SpotAsPriceGo: a spot instance for which the market price at the time of purchase is automatically used as the bid price.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NoSpot</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The storage set ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ss-bp67acfmxazb4p****</p>
     */
    @NameInMap("StorageSetId")
    public String storageSetId;

    /**
     * <p>The maximum number of partitions in the storage set. The value must be an integer that is greater than or equal to 2.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("StorageSetPartitionNumber")
    public Integer storageSetPartitionNumber;

    /**
     * <p>The multi-disk types for the system cloud disk. When a disk type with a higher priority is unavailable, Auto Scaling automatically attempts the next-priority disk type to create the system cloud disk. Valid values:</p>
     * <ul>
     * <li>cloud: basic cloud disk.</li>
     * <li>cloud_efficiency: ultra cloud disk.</li>
     * <li>cloud_ssd: standard SSD.</li>
     * <li>cloud_essd: Enterprise SSD (ESSD).</li>
     * </ul>
     * <blockquote>
     * <p>If you specify this parameter, you cannot specify <code>SystemDisk.Category</code> at the same time.</p>
     * </blockquote>
     */
    @NameInMap("SystemDiskCategories")
    public java.util.List<String> systemDiskCategories;

    /**
     * <p>The tags of the ECS instance. Tags are specified as key-value pairs. You can specify up to 20 tags. The following limits apply to Key and Value: </p>
     * <ul>
     * <li>Key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>. Key cannot be an empty string. </li>
     * <li>Value can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>. Value can be an empty string.</li>
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
     * <li><p>default: creates an instance that is not on a dedicated host.</p>
     * </li>
     * <li><p>host: creates an instance on a dedicated host. If you do not specify DedicatedHostId, Alibaba Cloud automatically selects a dedicated host for the instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Tenancy")
    public String tenancy;

    /**
     * <p>The user data of the ECS instance. The data must be encoded in Base64. The maximum size of the raw data before encoding is 32 KB.</p>
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

    public static ModifyScalingConfigurationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyScalingConfigurationShrinkRequest self = new ModifyScalingConfigurationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyScalingConfigurationShrinkRequest setImageOptions(ModifyScalingConfigurationShrinkRequestImageOptions imageOptions) {
        this.imageOptions = imageOptions;
        return this;
    }
    public ModifyScalingConfigurationShrinkRequestImageOptions getImageOptions() {
        return this.imageOptions;
    }

    public ModifyScalingConfigurationShrinkRequest setPrivatePoolOptions(ModifyScalingConfigurationShrinkRequestPrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public ModifyScalingConfigurationShrinkRequestPrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public ModifyScalingConfigurationShrinkRequest setSystemDisk(ModifyScalingConfigurationShrinkRequestSystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public ModifyScalingConfigurationShrinkRequestSystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public ModifyScalingConfigurationShrinkRequest setAffinity(String affinity) {
        this.affinity = affinity;
        return this;
    }
    public String getAffinity() {
        return this.affinity;
    }

    public ModifyScalingConfigurationShrinkRequest setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public ModifyScalingConfigurationShrinkRequest setCreditSpecification(String creditSpecification) {
        this.creditSpecification = creditSpecification;
        return this;
    }
    public String getCreditSpecification() {
        return this.creditSpecification;
    }

    public ModifyScalingConfigurationShrinkRequest setCustomPriorities(java.util.List<ModifyScalingConfigurationShrinkRequestCustomPriorities> customPriorities) {
        this.customPriorities = customPriorities;
        return this;
    }
    public java.util.List<ModifyScalingConfigurationShrinkRequestCustomPriorities> getCustomPriorities() {
        return this.customPriorities;
    }

    public ModifyScalingConfigurationShrinkRequest setDataDisks(java.util.List<ModifyScalingConfigurationShrinkRequestDataDisks> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }
    public java.util.List<ModifyScalingConfigurationShrinkRequestDataDisks> getDataDisks() {
        return this.dataDisks;
    }

    public ModifyScalingConfigurationShrinkRequest setDedicatedHostClusterId(String dedicatedHostClusterId) {
        this.dedicatedHostClusterId = dedicatedHostClusterId;
        return this;
    }
    public String getDedicatedHostClusterId() {
        return this.dedicatedHostClusterId;
    }

    public ModifyScalingConfigurationShrinkRequest setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public ModifyScalingConfigurationShrinkRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public ModifyScalingConfigurationShrinkRequest setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    public ModifyScalingConfigurationShrinkRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public ModifyScalingConfigurationShrinkRequest setHpcClusterId(String hpcClusterId) {
        this.hpcClusterId = hpcClusterId;
        return this;
    }
    public String getHpcClusterId() {
        return this.hpcClusterId;
    }

    public ModifyScalingConfigurationShrinkRequest setHttpEndpoint(String httpEndpoint) {
        this.httpEndpoint = httpEndpoint;
        return this;
    }
    public String getHttpEndpoint() {
        return this.httpEndpoint;
    }

    public ModifyScalingConfigurationShrinkRequest setHttpTokens(String httpTokens) {
        this.httpTokens = httpTokens;
        return this;
    }
    public String getHttpTokens() {
        return this.httpTokens;
    }

    public ModifyScalingConfigurationShrinkRequest setImageFamily(String imageFamily) {
        this.imageFamily = imageFamily;
        return this;
    }
    public String getImageFamily() {
        return this.imageFamily;
    }

    public ModifyScalingConfigurationShrinkRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ModifyScalingConfigurationShrinkRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public ModifyScalingConfigurationShrinkRequest setInstanceDescription(String instanceDescription) {
        this.instanceDescription = instanceDescription;
        return this;
    }
    public String getInstanceDescription() {
        return this.instanceDescription;
    }

    public ModifyScalingConfigurationShrinkRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ModifyScalingConfigurationShrinkRequest setInstancePatternInfos(java.util.List<ModifyScalingConfigurationShrinkRequestInstancePatternInfos> instancePatternInfos) {
        this.instancePatternInfos = instancePatternInfos;
        return this;
    }
    public java.util.List<ModifyScalingConfigurationShrinkRequestInstancePatternInfos> getInstancePatternInfos() {
        return this.instancePatternInfos;
    }

    public ModifyScalingConfigurationShrinkRequest setInstanceTypeCandidateOptions(ModifyScalingConfigurationShrinkRequestInstanceTypeCandidateOptions instanceTypeCandidateOptions) {
        this.instanceTypeCandidateOptions = instanceTypeCandidateOptions;
        return this;
    }
    public ModifyScalingConfigurationShrinkRequestInstanceTypeCandidateOptions getInstanceTypeCandidateOptions() {
        return this.instanceTypeCandidateOptions;
    }

    public ModifyScalingConfigurationShrinkRequest setInstanceTypeOverrides(java.util.List<ModifyScalingConfigurationShrinkRequestInstanceTypeOverrides> instanceTypeOverrides) {
        this.instanceTypeOverrides = instanceTypeOverrides;
        return this;
    }
    public java.util.List<ModifyScalingConfigurationShrinkRequestInstanceTypeOverrides> getInstanceTypeOverrides() {
        return this.instanceTypeOverrides;
    }

    public ModifyScalingConfigurationShrinkRequest setInstanceTypes(java.util.List<String> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public java.util.List<String> getInstanceTypes() {
        return this.instanceTypes;
    }

    public ModifyScalingConfigurationShrinkRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public ModifyScalingConfigurationShrinkRequest setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
        this.internetMaxBandwidthIn = internetMaxBandwidthIn;
        return this;
    }
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    public ModifyScalingConfigurationShrinkRequest setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public ModifyScalingConfigurationShrinkRequest setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public ModifyScalingConfigurationShrinkRequest setIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
        return this;
    }
    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    public ModifyScalingConfigurationShrinkRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public ModifyScalingConfigurationShrinkRequest setLoadBalancerWeight(Integer loadBalancerWeight) {
        this.loadBalancerWeight = loadBalancerWeight;
        return this;
    }
    public Integer getLoadBalancerWeight() {
        return this.loadBalancerWeight;
    }

    public ModifyScalingConfigurationShrinkRequest setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public ModifyScalingConfigurationShrinkRequest setNetworkInterfaces(java.util.List<ModifyScalingConfigurationShrinkRequestNetworkInterfaces> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
        return this;
    }
    public java.util.List<ModifyScalingConfigurationShrinkRequestNetworkInterfaces> getNetworkInterfaces() {
        return this.networkInterfaces;
    }

    public ModifyScalingConfigurationShrinkRequest setOverride(Boolean override) {
        this.override = override;
        return this;
    }
    public Boolean getOverride() {
        return this.override;
    }

    public ModifyScalingConfigurationShrinkRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyScalingConfigurationShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyScalingConfigurationShrinkRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ModifyScalingConfigurationShrinkRequest setPasswordInherit(Boolean passwordInherit) {
        this.passwordInherit = passwordInherit;
        return this;
    }
    public Boolean getPasswordInherit() {
        return this.passwordInherit;
    }

    public ModifyScalingConfigurationShrinkRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public ModifyScalingConfigurationShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyScalingConfigurationShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyScalingConfigurationShrinkRequest setResourcePoolOptions(ModifyScalingConfigurationShrinkRequestResourcePoolOptions resourcePoolOptions) {
        this.resourcePoolOptions = resourcePoolOptions;
        return this;
    }
    public ModifyScalingConfigurationShrinkRequestResourcePoolOptions getResourcePoolOptions() {
        return this.resourcePoolOptions;
    }

    public ModifyScalingConfigurationShrinkRequest setScalingConfigurationId(String scalingConfigurationId) {
        this.scalingConfigurationId = scalingConfigurationId;
        return this;
    }
    public String getScalingConfigurationId() {
        return this.scalingConfigurationId;
    }

    public ModifyScalingConfigurationShrinkRequest setScalingConfigurationName(String scalingConfigurationName) {
        this.scalingConfigurationName = scalingConfigurationName;
        return this;
    }
    public String getScalingConfigurationName() {
        return this.scalingConfigurationName;
    }

    public ModifyScalingConfigurationShrinkRequest setSchedulerOptionsShrink(String schedulerOptionsShrink) {
        this.schedulerOptionsShrink = schedulerOptionsShrink;
        return this;
    }
    public String getSchedulerOptionsShrink() {
        return this.schedulerOptionsShrink;
    }

    public ModifyScalingConfigurationShrinkRequest setSecondaryEniVSwitchConstraint(String secondaryEniVSwitchConstraint) {
        this.secondaryEniVSwitchConstraint = secondaryEniVSwitchConstraint;
        return this;
    }
    public String getSecondaryEniVSwitchConstraint() {
        return this.secondaryEniVSwitchConstraint;
    }

    public ModifyScalingConfigurationShrinkRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public ModifyScalingConfigurationShrinkRequest setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public ModifyScalingConfigurationShrinkRequest setSecurityOptions(ModifyScalingConfigurationShrinkRequestSecurityOptions securityOptions) {
        this.securityOptions = securityOptions;
        return this;
    }
    public ModifyScalingConfigurationShrinkRequestSecurityOptions getSecurityOptions() {
        return this.securityOptions;
    }

    public ModifyScalingConfigurationShrinkRequest setSpotDuration(Integer spotDuration) {
        this.spotDuration = spotDuration;
        return this;
    }
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    public ModifyScalingConfigurationShrinkRequest setSpotInterruptionBehavior(String spotInterruptionBehavior) {
        this.spotInterruptionBehavior = spotInterruptionBehavior;
        return this;
    }
    public String getSpotInterruptionBehavior() {
        return this.spotInterruptionBehavior;
    }

    public ModifyScalingConfigurationShrinkRequest setSpotPriceLimits(java.util.List<ModifyScalingConfigurationShrinkRequestSpotPriceLimits> spotPriceLimits) {
        this.spotPriceLimits = spotPriceLimits;
        return this;
    }
    public java.util.List<ModifyScalingConfigurationShrinkRequestSpotPriceLimits> getSpotPriceLimits() {
        return this.spotPriceLimits;
    }

    public ModifyScalingConfigurationShrinkRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public ModifyScalingConfigurationShrinkRequest setStorageSetId(String storageSetId) {
        this.storageSetId = storageSetId;
        return this;
    }
    public String getStorageSetId() {
        return this.storageSetId;
    }

    public ModifyScalingConfigurationShrinkRequest setStorageSetPartitionNumber(Integer storageSetPartitionNumber) {
        this.storageSetPartitionNumber = storageSetPartitionNumber;
        return this;
    }
    public Integer getStorageSetPartitionNumber() {
        return this.storageSetPartitionNumber;
    }

    public ModifyScalingConfigurationShrinkRequest setSystemDiskCategories(java.util.List<String> systemDiskCategories) {
        this.systemDiskCategories = systemDiskCategories;
        return this;
    }
    public java.util.List<String> getSystemDiskCategories() {
        return this.systemDiskCategories;
    }

    public ModifyScalingConfigurationShrinkRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public ModifyScalingConfigurationShrinkRequest setTenancy(String tenancy) {
        this.tenancy = tenancy;
        return this;
    }
    public String getTenancy() {
        return this.tenancy;
    }

    public ModifyScalingConfigurationShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public ModifyScalingConfigurationShrinkRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class ModifyScalingConfigurationShrinkRequestImageOptions extends TeaModel {
        /**
         * <p>Specifies whether the ECS instance uses the ecs-user account to log on. For more information, see <a href="https://help.aliyun.com/document_detail/388447.html">Manage the logon name of an ECS instance</a>. Valid values:</p>
         * <ul>
         * <li><p>true: The ecs-user account is used.</p>
         * </li>
         * <li><p>false: The ecs-user account is not used.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("LoginAsNonRoot")
        public Boolean loginAsNonRoot;

        public static ModifyScalingConfigurationShrinkRequestImageOptions build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationShrinkRequestImageOptions self = new ModifyScalingConfigurationShrinkRequestImageOptions();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationShrinkRequestImageOptions setLoginAsNonRoot(Boolean loginAsNonRoot) {
            this.loginAsNonRoot = loginAsNonRoot;
            return this;
        }
        public Boolean getLoginAsNonRoot() {
            return this.loginAsNonRoot;
        }

    }

    public static class ModifyScalingConfigurationShrinkRequestPrivatePoolOptions extends TeaModel {
        /**
         * <p>The private pool ID, which is the ID of the elasticity assurance or capacity reservation.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-bp67acfmxazb4****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The private pool option for instance startup. A private pool is generated after an elasticity assurance or capacity reservation takes effect. You can select a private pool when you start an instance. Valid values:</p>
         * <ul>
         * <li><p>Open: open mode. The system automatically matches an open private pool. If no matching private pool is available, the public pool is used to start the instance. You do not need to specify PrivatePoolOptions.Id in this mode.</p>
         * </li>
         * <li><p>Target: specified mode. A specified private pool is used to start the instance. If the specified private pool is unavailable, the instance fails to start. In this mode, you must specify the private pool ID, which means PrivatePoolOptions.Id is required.</p>
         * </li>
         * <li><p>None: no private pool is used. The instance does not use any private pool capacity for startup.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Open</p>
         */
        @NameInMap("MatchCriteria")
        public String matchCriteria;

        public static ModifyScalingConfigurationShrinkRequestPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationShrinkRequestPrivatePoolOptions self = new ModifyScalingConfigurationShrinkRequestPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationShrinkRequestPrivatePoolOptions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ModifyScalingConfigurationShrinkRequestPrivatePoolOptions setMatchCriteria(String matchCriteria) {
            this.matchCriteria = matchCriteria;
            return this;
        }
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

    }

    public static class ModifyScalingConfigurationShrinkRequestSystemDisk extends TeaModel {
        /**
         * <p>The ID of the automatic snapshot policy applied to the system cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp12m37ccmxvbmi5****</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>Specifies whether to enable the burst feature for the system cloud disk. Valid values:</p>
         * <ul>
         * <li>true: enables the burst feature.</li>
         * <li>false: does not enable the burst feature.<blockquote>
         * <p>This parameter is supported only when <code>SystemDisk.Category</code> is set to <code>cloud_auto</code>.</p>
         * </blockquote>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;For more information, see [ESSD AutoPL disks](
         * <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a></p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>The category of the system cloud disk. Valid values:</p>
         * <ul>
         * <li>cloud: basic cloud disk.</li>
         * <li>cloud_efficiency: ultra cloud disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>cloud_essd: Enterprise SSD (ESSD).</li>
         * <li>ephemeral_ssd: local SSD.</li>
         * </ul>
         * <p>This parameter cannot be specified together with <code>SystemDiskCategories</code>. If neither this parameter nor <code>SystemDiskCategories</code> is specified, a default value is used. If the instance type belongs to Generation I instance families and the instance is not an I/O optimization instance, the default value is cloud. Otherwise, the default value is cloud_efficiency.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
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
         * <p>The name of the system cloud disk. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). It must start with a letter or Chinese character and cannot start with http:// or https://. Default value: empty.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssdSystem</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>The encryption algorithm for the system cloud disk. Valid values:</p>
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
         * <p>The performance level (PL) of the system cloud disk when the disk is an ESSD. Valid values:</p>
         * <ul>
         * <li>PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</li>
         * <li>PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <blockquote>
         * <p>For more information about how to select an ESSD performance level, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The provisioned IOPS (Input/Output Operations Per Second) performance metrics for the system cloud disk.</p>
         * <blockquote>
         * <p>IOPS (Input/Output Operations Per Second) refers to the number of I/O operations that can be processed per second, representing the read/write (output/input) capability of block storage. Unit: operations per second.</p>
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
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Size")
        public Integer size;

        public static ModifyScalingConfigurationShrinkRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationShrinkRequestSystemDisk self = new ModifyScalingConfigurationShrinkRequestSystemDisk();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationShrinkRequestSystemDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public ModifyScalingConfigurationShrinkRequestSystemDisk setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public ModifyScalingConfigurationShrinkRequestSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ModifyScalingConfigurationShrinkRequestSystemDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyScalingConfigurationShrinkRequestSystemDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public ModifyScalingConfigurationShrinkRequestSystemDisk setEncryptAlgorithm(String encryptAlgorithm) {
            this.encryptAlgorithm = encryptAlgorithm;
            return this;
        }
        public String getEncryptAlgorithm() {
            return this.encryptAlgorithm;
        }

        public ModifyScalingConfigurationShrinkRequestSystemDisk setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public ModifyScalingConfigurationShrinkRequestSystemDisk setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public ModifyScalingConfigurationShrinkRequestSystemDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public ModifyScalingConfigurationShrinkRequestSystemDisk setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public ModifyScalingConfigurationShrinkRequestSystemDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class ModifyScalingConfigurationShrinkRequestCustomPriorities extends TeaModel {
        /**
         * <p>The instance type of the ECS instance.</p>
         * <blockquote>
         * <p>The instance type must be included in the instance type list of the scaling configuration.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ecs.c6a.4xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The ID of the vSwitch.</p>
         * <blockquote>
         * <p>The vSwitch must be included in the vSwitch list of the scaling group.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp14zolna43z266bq****</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        public static ModifyScalingConfigurationShrinkRequestCustomPriorities build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationShrinkRequestCustomPriorities self = new ModifyScalingConfigurationShrinkRequestCustomPriorities();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationShrinkRequestCustomPriorities setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ModifyScalingConfigurationShrinkRequestCustomPriorities setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

    public static class ModifyScalingConfigurationShrinkRequestDataDisks extends TeaModel {
        /**
         * <p>The ID of the automatic snapshot policy applied to the data cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp19nq9enxqkomib****</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>Specifies whether to enable the burst feature for the data cloud disk. Valid values:</p>
         * <ul>
         * <li>true: enables the burst feature.</li>
         * <li>false: does not enable the burst feature.<blockquote>
         * <p>This parameter is supported only when <code>SystemDisk.Category</code> is set to <code>cloud_auto</code>.</p>
         * </blockquote>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>The multiple disk types of the data cloud disk. Valid values:</p>
         * <ul>
         * <li>cloud: basic cloud disk. The DeleteWithInstance property of a basic cloud disk created along with the instance is set to true.</li>
         * <li>cloud_efficiency: ultra cloud disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>cloud_essd: ESSD.</li>
         * <li>ephemeral_ssd: local SSD.</li>
         * <li>cloud_auto: ESSD AutoPL.</li>
         * <li>cloud_regional_disk_auto: regional ESSD.</li>
         * </ul>
         * <blockquote>
         * <p>You cannot specify this parameter together with <code>DataDisk.Category</code>.</p>
         * </blockquote>
         */
        @NameInMap("Categories")
        public java.util.List<String> categories;

        /**
         * <p>The category of the data cloud disk. Valid values:</p>
         * <ul>
         * <li>cloud: basic cloud disk. The DeleteWithInstance attribute of a basic cloud disk created along with the instance is set to true.</li>
         * <li>cloud_efficiency: ultra cloud disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>cloud_essd: ESSD.</li>
         * <li>ephemeral_ssd: local SSD.</li>
         * <li>cloud_auto: ESSD AutoPL.</li>
         * <li>cloud_regional_disk_auto: regional ESSD.</li>
         * </ul>
         * <p>This parameter cannot be specified together with <code>DataDisk.Categories</code>. If neither this parameter nor <code>DataDisk.Categories</code> is specified, the default value is used:</p>
         * <ul>
         * <li><p>For I/O optimized instances, the default value is cloud_efficiency.</p>
         * </li>
         * <li><p>For non-I/O optimized instances, the default value is cloud.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Specifies whether the data cloud disk is released when the instance is released. Valid values:</p>
         * <ul>
         * <li>true: The data cloud disk is released when the instance is released.</li>
         * <li>false: The data cloud disk is retained when the instance is released.</li>
         * </ul>
         * <p>This parameter can be set only for independent cloud disks (DataDisk.Category is set to cloud, cloud_efficiency, cloud_ssd, cloud_essd, or cloud_auto). Otherwise, an error is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        /**
         * <p>The description of the system cloud disk. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Test data disk.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The mount point of the data cloud disk. If you do not specify this parameter, the system uses the default behavior to allocate a mount point during automatic creation of the ECS instance. The mount points range from /dev/xvdb to /dev/xvdz.</p>
         * 
         * <strong>example:</strong>
         * <p>/dev/xvdd</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The name of the data cloud disk. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). It must start with a letter or Chinese character and cannot start with <code>http://</code> or <code>https://</code>.</p>
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
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public String encrypted;

        /**
         * <p>The ID of the KMS key for the data cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The performance level of the data cloud disk when the disk is an ESSD. Valid values:</p>
         * <ul>
         * <li>PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</li>
         * <li>PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <blockquote>
         * <p>For more information about how to select an ESSD performance level, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The provisioned IOPS (Input/Output Operations Per Second) performance metrics of the data cloud disk.</p>
         * <blockquote>
         * <p>IOPS (Input/Output Operations Per Second) measures the number of read and write operations that a block storage device can process per second.</p>
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
         * <li>cloud_ssd: 20 to 32768.</li>
         * <li>cloud_essd: 20 to 32768.</li>
         * <li>ephemeral_ssd: 5 to 800.</li>
         * </ul>
         * <p>After you specify this parameter, the disk size must be greater than or equal to the size of the snapshot specified by SnapshotId.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The ID of the snapshot used to create the data cloud disk. After this parameter is specified, DataDisk.Size is ignored, and the size of the created disk is the size of the specified snapshot.</p>
         * <p>If the snapshot was created on or before July 15, 2013, the request is rejected and the error message InvalidSnapshot.TooOld is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>s-snapshot****</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        public static ModifyScalingConfigurationShrinkRequestDataDisks build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationShrinkRequestDataDisks self = new ModifyScalingConfigurationShrinkRequestDataDisks();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationShrinkRequestDataDisks setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public ModifyScalingConfigurationShrinkRequestDataDisks setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public ModifyScalingConfigurationShrinkRequestDataDisks setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public ModifyScalingConfigurationShrinkRequestDataDisks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ModifyScalingConfigurationShrinkRequestDataDisks setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public ModifyScalingConfigurationShrinkRequestDataDisks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyScalingConfigurationShrinkRequestDataDisks setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public ModifyScalingConfigurationShrinkRequestDataDisks setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public ModifyScalingConfigurationShrinkRequestDataDisks setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public ModifyScalingConfigurationShrinkRequestDataDisks setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public ModifyScalingConfigurationShrinkRequestDataDisks setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public ModifyScalingConfigurationShrinkRequestDataDisks setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public ModifyScalingConfigurationShrinkRequestDataDisks setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ModifyScalingConfigurationShrinkRequestDataDisks setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

    }

    public static class ModifyScalingConfigurationShrinkRequestInstancePatternInfos extends TeaModel {
        /**
         * <p>The architecture types of the instance type. Valid values:</p>
         * <ul>
         * <li>X86: x86 computing.</li>
         * <li>Heterogeneous: heterogeneous computing, such as GPU or FPGA.</li>
         * <li>BareMental: ECS Bare Metal Instance.</li>
         * <li>Arm: Arm computing.</li>
         * </ul>
         * <p>Default value: all architecture types are included.</p>
         */
        @NameInMap("Architectures")
        public java.util.List<String> architectures;

        /**
         * <p>Specifies whether to include burstable instance types. Valid values:</p>
         * <ul>
         * <li>Exclude: excludes burstable instance types.</li>
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
         * <p>The number of vCPU cores of the instance type in intelligent configuration mode, used to filter instance types that meet the requirements. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
         * <p>Note the following information:</p>
         * <ul>
         * <li><p>The InstancePatternInfo parameter applies only to scaling groups whose network type is VPC.</p>
         * </li>
         * <li><p>You must specify both InstancePatternInfo.Cores and InstancePatternInfo.Memory.</p>
         * </li>
         * <li><p>If you have specified instance types by using the InstanceType or InstanceTypes parameter, Auto Scaling preferentially uses the specified instance types for scale-out. When the specified instance types are out of stock, Auto Scaling selects the lowest-priced instance type from those that match the InstancePatternInfo parameter values.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cores")
        public Integer cores;

        /**
         * <p>The CPU architectures of the instance. Valid values:</p>
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
         * <p>The instance types to exclude. You can use wildcard characters (*) to exclude a single instance type or an entire instance family. Examples:</p>
         * <ul>
         * <li>ecs.c6.large: excludes the ecs.c6.large instance type.</li>
         * <li>ecs.c6.*: excludes the entire c6 instance family.</li>
         * </ul>
         */
        @NameInMap("ExcludedInstanceTypes")
        public java.util.List<String> excludedInstanceTypes;

        /**
         * <p>The GPU types.</p>
         */
        @NameInMap("GpuSpecs")
        public java.util.List<String> gpuSpecs;

        /**
         * <p>The categorization of the instance type. Valid values:</p>
         * <ul>
         * <li>General-purpose: general-purpose.</li>
         * <li>Compute-optimized: compute-optimized.</li>
         * <li>Memory-optimized: memory-optimized.</li>
         * <li>Big data: big data.</li>
         * <li>Local SSDs: local SSD.</li>
         * <li>High Clock Speed: high frequency.</li>
         * <li>Enhanced: enhanced.</li>
         * <li>Shared: shared.</li>
         * <li>Compute-optimized with GPU: GPU-accelerated compute-optimized.</li>
         * <li>Visual Compute-optimized: visual compute-optimized.</li>
         * <li>Heterogeneous Service: heterogeneous service.</li>
         * <li>Compute-optimized with FPGA: FPGA compute-optimized.</li>
         * <li>Compute-optimized with NPU: NPU compute-optimized.</li>
         * <li>ECS Bare Metal: ECS Bare Metal Instance.</li>
         * <li>High Performance Compute: high-performance computing (HPC).</li>
         * </ul>
         */
        @NameInMap("InstanceCategories")
        public java.util.List<String> instanceCategories;

        /**
         * <p>The level of the instance family, used to filter instance types that meet the requirements. This parameter takes effect when <code>CostOptimization</code> is enabled. Valid values:</p>
         * <ul>
         * <li>EntryLevel: entry level, which refers to shared instance types. These instance types are more cost-effective but cannot guarantee stable computing performance. They are suitable for scenarios with low CPU utilization. For more information, see <a href="https://help.aliyun.com/document_detail/108489.html">Shared instance families</a>.</li>
         * <li>EnterpriseLevel: enterprise level. These instance types provide stable performance and dedicated resources. They are suitable for scenarios that require high stability. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</li>
         * <li>CreditEntryLevel: credit entry level, which refers to burstable instances. These instance types use CPU credits to ensure computing performance. They are suitable for scenarios with low average CPU utilization and occasional bursts. For more information, see <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EnterpriseLevel</p>
         */
        @NameInMap("InstanceFamilyLevel")
        public String instanceFamilyLevel;

        /**
         * <p>The instance families to query. N indicates that you can specify multiple instance families. Valid values of N: 1 to 10.</p>
         */
        @NameInMap("InstanceTypeFamilies")
        public java.util.List<String> instanceTypeFamilies;

        /**
         * <p>The maximum hourly price for pay-as-you-go or spot instances in intelligent configuration mode, used to filter instance types that meet the requirements.</p>
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
         * <p>The maximum number of vCPU cores of the instance type.</p>
         * <blockquote>
         * <p>MaximumCpuCoreCount cannot exceed 4 times the value of MinimumCpuCoreCount.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("MaximumCpuCoreCount")
        public Integer maximumCpuCoreCount;

        /**
         * <p>The maximum number of GPUs of the instance. Valid values: positive integers.</p>
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
         * <p>The memory size of the instance type in intelligent configuration mode. Unit: GiB. This parameter is used to filter instance types that meet the requirements.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The minimum baseline vCPU computing performance (sum of all vCPUs) for burstable instances (t5 and t6).</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("MinimumBaselineCredit")
        public Integer minimumBaselineCredit;

        /**
         * <p>The minimum number of vCPU cores of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MinimumCpuCoreCount")
        public Integer minimumCpuCoreCount;

        /**
         * <p>The minimum upper limit of IPv6 addresses on a single elastic network interfaces (ENIs) of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinimumEniIpv6AddressQuantity")
        public Integer minimumEniIpv6AddressQuantity;

        /**
         * <p>The minimum number of IPv4 addresses per ENI supported by the instance.
         * [_single.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MinimumEniPrivateIpAddressQuantity")
        public Integer minimumEniPrivateIpAddressQuantity;

        /**
         * <p>The minimum number of elastic network interfaces (ENIs) supported by the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MinimumEniQuantity")
        public Integer minimumEniQuantity;

        /**
         * <p>The minimum number of GPUs of the instance. Valid values: positive integers.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MinimumGpuAmount")
        public Integer minimumGpuAmount;

        /**
         * <p>The minimum initial vCPU credits for burstable instances (t5 and t6).</p>
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
         * <p>The processor models of the instance. N indicates that you can specify multiple processor models. Valid values of N: 1 to 10.</p>
         */
        @NameInMap("PhysicalProcessorModels")
        public java.util.List<String> physicalProcessorModels;

        public static ModifyScalingConfigurationShrinkRequestInstancePatternInfos build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationShrinkRequestInstancePatternInfos self = new ModifyScalingConfigurationShrinkRequestInstancePatternInfos();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationShrinkRequestInstancePatternInfos setArchitectures(java.util.List<String> architectures) {
            this.architectures = architectures;
            return this;
        }
        public java.util.List<String> getArchitectures() {
            return this.architectures;
        }

        public ModifyScalingConfigurationShrinkRequestInstancePatternInfos setBurstablePerformance(String burstablePerformance) {
            this.burstablePerformance = burstablePerformance;
            return this;
        }
        public String getBurstablePerformance() {
            return this.burstablePerformance;
        }

        public ModifyScalingConfigurationShrinkRequestInstancePatternInfos setCores(Integer cores) {
            this.cores = cores;
            return this;
        }
        public Integer getCores() {
            return this.cores;
        }

        public ModifyScalingConfigurationShrinkRequestInstancePatternInfos setCpuArchitectures(java.util.List<String> cpuArchitectures) {
            this.cpuArchitectures = cpuArchitectures;
            return this;
        }
        public java.util.List<String> getCpuArchitectures() {
            return this.cpuArchitectures;
        }

        public ModifyScalingConfigurationShrinkRequestInstancePatternInfos setExcludedInstanceTypes(java.util.List<String> excludedInstanceTypes) {
            this.excludedInstanceTypes = excludedInstanceTypes;
            return this;
        }
        public java.util.List<String> getExcludedInstanceTypes() {
            return this.excludedInstanceTypes;
        }

        public ModifyScalingConfigurationShrinkRequestInstancePatternInfos setGpuSpecs(java.util.List<String> gpuSpecs) {
            this.gpuSpecs = gpuSpecs;
            return this;
        }
        public java.util.List<String> getGpuSpecs() {
            return this.gpuSpecs;
        }

        public ModifyScalingConfigurationShrinkRequestInstancePatternInfos setInstanceCategories(java.util.List<String> instanceCategories) {
            this.instanceCategories = instanceCategories;
            return this;
        }
        public java.util.List<String> getInstanceCategories() {
            return this.instanceCategories;
        }

        public ModifyScalingConfigurationShrinkRequestInstancePatternInfos setInstanceFamilyLevel(String instanceFamilyLevel) {
            this.instanceFamilyLevel = instanceFamilyLevel;
            return this;
        }
        public String getInstanceFamilyLevel() {
            return this.instanceFamilyLevel;
        }

        public ModifyScalingConfigurationShrinkRequestInstancePatternInfos setInstanceTypeFamilies(java.util.List<String> instanceTypeFamilies) {
            this.instanceTypeFamilies = instanceTypeFamilies;
            return this;
        }
        public java.util.List<String> getInstanceTypeFamilies() {
            return this.instanceTypeFamilies;
        }

        public ModifyScalingConfigurationShrinkRequestInstancePatternInfos setMaxPrice(Float maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }
        public Float getMaxPrice() {
            return this.maxPrice;
        }

        public ModifyScalingConfigurationShrinkRequestInstancePatternInfos setMaximumCpuCoreCount(Integer maximumCpuCoreCount) {
            this.maximumCpuCoreCount = maximumCpuCoreCount;
            return this;
        }
        public Integer getMaximumCpuCoreCount() {
            return this.maximumCpuCoreCount;
        }

        public ModifyScalingConfigurationShrinkRequestInstancePatternInfos setMaximumGpuAmount(Integer maximumGpuAmount) {
            this.maximumGpuAmount = maximumGpuAmount;
            return this;
        }
        public Integer getMaximumGpuAmount() {
            return this.maximumGpuAmount;
        }

        public ModifyScalingConfigurationShrinkRequestInstancePatternInfos setMaximumMemorySize(Float maximumMemorySize) {
            this.maximumMemorySize = maximumMemorySize;
            return this;
        }
        public Float getMaximumMemorySize() {
            return this.maximumMemorySize;
        }

        public ModifyScalingConfigurationShrinkRequestInstancePatternInfos setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public ModifyScalingConfigurationShrinkRequestInstancePatternInfos setMinimumBaselineCredit(Integer minimumBaselineCredit) {
            this.minimumBaselineCredit = minimumBaselineCredit;
            return this;
        }
        public Integer getMinimumBaselineCredit() {
            return this.minimumBaselineCredit;
        }

        public ModifyScalingConfigurationShrinkRequestInstancePatternInfos setMinimumCpuCoreCount(Integer minimumCpuCoreCount) {
            this.minimumCpuCoreCount = minimumCpuCoreCount;
            return this;
        }
        public Integer getMinimumCpuCoreCount() {
            return this.minimumCpuCoreCount;
        }

        public ModifyScalingConfigurationShrinkRequestInstancePatternInfos setMinimumEniIpv6AddressQuantity(Integer minimumEniIpv6AddressQuantity) {
            this.minimumEniIpv6AddressQuantity = minimumEniIpv6AddressQuantity;
            return this;
        }
        public Integer getMinimumEniIpv6AddressQuantity() {
            return this.minimumEniIpv6AddressQuantity;
        }

        public ModifyScalingConfigurationShrinkRequestInstancePatternInfos setMinimumEniPrivateIpAddressQuantity(Integer minimumEniPrivateIpAddressQuantity) {
            this.minimumEniPrivateIpAddressQuantity = minimumEniPrivateIpAddressQuantity;
            return this;
        }
        public Integer getMinimumEniPrivateIpAddressQuantity() {
            return this.minimumEniPrivateIpAddressQuantity;
        }

        public ModifyScalingConfigurationShrinkRequestInstancePatternInfos setMinimumEniQuantity(Integer minimumEniQuantity) {
            this.minimumEniQuantity = minimumEniQuantity;
            return this;
        }
        public Integer getMinimumEniQuantity() {
            return this.minimumEniQuantity;
        }

        public ModifyScalingConfigurationShrinkRequestInstancePatternInfos setMinimumGpuAmount(Integer minimumGpuAmount) {
            this.minimumGpuAmount = minimumGpuAmount;
            return this;
        }
        public Integer getMinimumGpuAmount() {
            return this.minimumGpuAmount;
        }

        public ModifyScalingConfigurationShrinkRequestInstancePatternInfos setMinimumInitialCredit(Integer minimumInitialCredit) {
            this.minimumInitialCredit = minimumInitialCredit;
            return this;
        }
        public Integer getMinimumInitialCredit() {
            return this.minimumInitialCredit;
        }

        public ModifyScalingConfigurationShrinkRequestInstancePatternInfos setMinimumMemorySize(Float minimumMemorySize) {
            this.minimumMemorySize = minimumMemorySize;
            return this;
        }
        public Float getMinimumMemorySize() {
            return this.minimumMemorySize;
        }

        public ModifyScalingConfigurationShrinkRequestInstancePatternInfos setPhysicalProcessorModels(java.util.List<String> physicalProcessorModels) {
            this.physicalProcessorModels = physicalProcessorModels;
            return this;
        }
        public java.util.List<String> getPhysicalProcessorModels() {
            return this.physicalProcessorModels;
        }

    }

    public static class ModifyScalingConfigurationShrinkRequestInstanceTypeCandidateOptions extends TeaModel {
        /**
         * <p>The CIDR blocks for optional vSwitches when supplementing vSwitches in other zones.</p>
         */
        @NameInMap("AllowCidrBlocks")
        public java.util.List<String> allowCidrBlocks;

        /**
         * <p>Specifies whether to allow supplementing vSwitches in other zones.</p>
         * <blockquote>
         * <p>The instance type remains unchanged. Only alternative zones are selected. When all selected zones of the scaling group cannot be used for scale-out due to issues such as insufficient inventory, new zone vSwitches are automatically added to the scaling group based on this configuration.
         * For example, if the scaling group is configured with the cn-hangzhou-h and cn-hangzhou-g zones, and neither zone can be used for scale-out, Auto Scaling may create a vSwitch in cn-hangzhou-k based on real-time inventory and add it to the scaling group.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowCrossAz")
        public Boolean allowCrossAz;

        /**
         * <p>Specifies whether to allow supplementing instance types from other generations.</p>
         * <ul>
         * <li>For example, if the current instance type is ecs.c7.large, enabling this option allows fallback to instance types such as ecs.c6.large and ecs.c8.large.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowDifferentGeneration")
        public Boolean allowDifferentGeneration;

        /**
         * <p>Specifies whether to enable the fallback mode.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The maximum price for fallback instance types.</p>
         * 
         * <strong>example:</strong>
         * <p>1.5</p>
         */
        @NameInMap("MaxPrice")
        public Float maxPrice;

        public static ModifyScalingConfigurationShrinkRequestInstanceTypeCandidateOptions build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationShrinkRequestInstanceTypeCandidateOptions self = new ModifyScalingConfigurationShrinkRequestInstanceTypeCandidateOptions();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationShrinkRequestInstanceTypeCandidateOptions setAllowCidrBlocks(java.util.List<String> allowCidrBlocks) {
            this.allowCidrBlocks = allowCidrBlocks;
            return this;
        }
        public java.util.List<String> getAllowCidrBlocks() {
            return this.allowCidrBlocks;
        }

        public ModifyScalingConfigurationShrinkRequestInstanceTypeCandidateOptions setAllowCrossAz(Boolean allowCrossAz) {
            this.allowCrossAz = allowCrossAz;
            return this;
        }
        public Boolean getAllowCrossAz() {
            return this.allowCrossAz;
        }

        public ModifyScalingConfigurationShrinkRequestInstanceTypeCandidateOptions setAllowDifferentGeneration(Boolean allowDifferentGeneration) {
            this.allowDifferentGeneration = allowDifferentGeneration;
            return this;
        }
        public Boolean getAllowDifferentGeneration() {
            return this.allowDifferentGeneration;
        }

        public ModifyScalingConfigurationShrinkRequestInstanceTypeCandidateOptions setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ModifyScalingConfigurationShrinkRequestInstanceTypeCandidateOptions setMaxPrice(Float maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }
        public Float getMaxPrice() {
            return this.maxPrice;
        }

    }

    public static class ModifyScalingConfigurationShrinkRequestInstanceTypeOverrides extends TeaModel {
        /**
         * <p>To specify the capacity of an instance type in the scaling configuration, specify both this parameter and InstanceTypeOverride.WeightedCapacity.</p>
         * <p>This parameter specifies the instance type. You can specify multiple instance types and use the InstanceTypeOverride.WeightedCapacity parameter to extend multi-instance-type support with custom weights.</p>
         * <blockquote>
         * <p>You cannot specify this parameter together with instanceTypes.</p>
         * </blockquote>
         * <p>Valid values of InstanceType: ECS instance types that are available for purchase.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c5.xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>To scale the scaling group based on instance type capacity, specify this parameter after specifying LaunchTemplateOverride.InstanceType.</p>
         * <p>This parameter specifies the weight of the instance type, which represents the capacity of a single instance of this type in the scaling group. A larger weight means fewer instances of this type are required to meet the expected capacity.</p>
         * <p>Because instance types differ in vCPUs, memory, and other performance metrics, you can assign different weights to different instance types based on your requirements.</p>
         * <p>Example:</p>
         * <ul>
         * <li>Current capacity: 0.</li>
         * <li>Expected number of instances: 6.</li>
         * <li>Capacity of ecs.c5.xlarge: 4.</li>
         * </ul>
         * <p>To meet the expected capacity, the scaling group scales out 2 ecs.c5.xlarge instances.</p>
         * <blockquote>
         * <p>During scale-out, the capacity of the scaling group cannot exceed the sum of the maximum capacity (MaxSize) and the maximum weight of the instance types.</p>
         * </blockquote>
         * <p>Valid values of WeightedCapacity: 1 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("WeightedCapacity")
        public Integer weightedCapacity;

        public static ModifyScalingConfigurationShrinkRequestInstanceTypeOverrides build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationShrinkRequestInstanceTypeOverrides self = new ModifyScalingConfigurationShrinkRequestInstanceTypeOverrides();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationShrinkRequestInstanceTypeOverrides setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ModifyScalingConfigurationShrinkRequestInstanceTypeOverrides setWeightedCapacity(Integer weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public Integer getWeightedCapacity() {
            return this.weightedCapacity;
        }

    }

    public static class ModifyScalingConfigurationShrinkRequestNetworkInterfaces extends TeaModel {
        /**
         * <p>The type of the elastic network interfaces (ENIs). When you use this parameter, you must use NetworkInterfaces to set the primary network interface controller (NIC). You cannot set SecurityGroupId or SecurityGroupIds at the same time. Valid values:</p>
         * <ul>
         * <li>Primary: primary network interface controller (NIC).</li>
         * <li>Secondary: secondary network interface controller (NIC).</li>
         * </ul>
         * <p>Default value: Secondary.</p>
         * 
         * <strong>example:</strong>
         * <p>Primary</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The number of randomly generated IPv6 addresses for the primary ENI. Note the following items:</p>
         * <p>This parameter takes effect only when NetworkInterface.InstanceType is set to Primary. If NetworkInterface.InstanceType is set to Secondary or left empty, you cannot specify this parameter.</p>
         * <p>After you specify this parameter, you cannot specify Ipv6AddressCount.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Ipv6AddressCount")
        public Integer ipv6AddressCount;

        /**
         * <p>The communication mode of the network interface controller (NIC). Valid values:</p>
         * <ul>
         * <li>Standard: uses the TCP communication mode.</li>
         * <li>HighPerformance: enables the Elastic RDMA Interface (ERI) and uses the RDMA communication mode.</li>
         * </ul>
         * <p>Default value: Standard.</p>
         * <blockquote>
         * <p>The number of elastic network interfaces (ENIs) in RDMA mode cannot exceed the limit of the instance family. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HighPerformance</p>
         */
        @NameInMap("NetworkInterfaceTrafficMode")
        public String networkInterfaceTrafficMode;

        /**
         * <p>The number of secondary private IPv4 addresses to assign to the ENI. Valid values: 1 to 49.</p>
         * <ul>
         * <li><p>The value cannot exceed the limit on the number of IP addresses for the instance type. For more information, see <a href="https://www.alibabacloud.com/help/en/ecs/user-guide/overview-of-instance-families">Instance families</a>.</p>
         * </li>
         * <li><p>NetworkInterface.N.SecondaryPrivateIpAddressCount specifies the number of secondary private IPv4 addresses to assign to the ENI (excluding the primary private IP address of the ENI). The system randomly assigns IP addresses from the available CIDR block of the vSwitch (NetworkInterface.N.VSwitchId) to which the ENI belongs.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("SecondaryPrivateIpAddressCount")
        public Integer secondaryPrivateIpAddressCount;

        /**
         * <p>The IDs of one or more security groups to which the elastic network interfaces (ENIs) belongs.</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>The IDs of the vSwitches to which the elastic network interfaces (ENIs) belongs. N specifies that you can set multiple vSwitches. Valid values of N: 1 to 10.</p>
         * <p>Note the following items:</p>
         * <ul>
         * <li>If InstanceType is set to Primary, you cannot set this parameter. The default value is the vSwitch of the instance.</li>
         * <li>If InstanceType is set to Secondary or left empty, this parameter is optional.</li>
         * <li>The system selects a vSwitch that is in the same zone as the primary network interface controller (NIC) and has the most available IP addresses.</li>
         * </ul>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        public static ModifyScalingConfigurationShrinkRequestNetworkInterfaces build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationShrinkRequestNetworkInterfaces self = new ModifyScalingConfigurationShrinkRequestNetworkInterfaces();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationShrinkRequestNetworkInterfaces setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ModifyScalingConfigurationShrinkRequestNetworkInterfaces setIpv6AddressCount(Integer ipv6AddressCount) {
            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }
        public Integer getIpv6AddressCount() {
            return this.ipv6AddressCount;
        }

        public ModifyScalingConfigurationShrinkRequestNetworkInterfaces setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
            this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
            return this;
        }
        public String getNetworkInterfaceTrafficMode() {
            return this.networkInterfaceTrafficMode;
        }

        public ModifyScalingConfigurationShrinkRequestNetworkInterfaces setSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
            this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
            return this;
        }
        public Integer getSecondaryPrivateIpAddressCount() {
            return this.secondaryPrivateIpAddressCount;
        }

        public ModifyScalingConfigurationShrinkRequestNetworkInterfaces setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public ModifyScalingConfigurationShrinkRequestNetworkInterfaces setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

    }

    public static class ModifyScalingConfigurationShrinkRequestResourcePoolOptionsPrivatePoolTags extends TeaModel {
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

        public static ModifyScalingConfigurationShrinkRequestResourcePoolOptionsPrivatePoolTags build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationShrinkRequestResourcePoolOptionsPrivatePoolTags self = new ModifyScalingConfigurationShrinkRequestResourcePoolOptionsPrivatePoolTags();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationShrinkRequestResourcePoolOptionsPrivatePoolTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModifyScalingConfigurationShrinkRequestResourcePoolOptionsPrivatePoolTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ModifyScalingConfigurationShrinkRequestResourcePoolOptions extends TeaModel {
        /**
         * <p>The private pool IDs, which are the elasticity assurance IDs or capacity reservation IDs. Only Target-type private pool IDs can be specified for this parameter. This parameter cannot be specified together with the PrivatePoolTags parameter.</p>
         */
        @NameInMap("PrivatePoolIds")
        public java.util.List<String> privatePoolIds;

        /**
         * <p>Filters available Target private pools by tags. Valid values of N: 1 to 20.
         * Note:</p>
         * <ul>
         * <li>When this parameter is specified, the system filters only the Target private pools associated with the account that match the tags and satisfy the scaling group constraints (such as zone and instance type).</li>
         * <li>Tag matching rule: A private pool must match all specified tags.</li>
         * <li>This parameter cannot be specified together with the PrivatePoolIds parameter.</li>
         * </ul>
         */
        @NameInMap("PrivatePoolTags")
        public java.util.List<ModifyScalingConfigurationShrinkRequestResourcePoolOptionsPrivatePoolTags> privatePoolTags;

        /**
         * <p>Resource pools include private pools generated after elasticity assurance or capacity reservation takes effect, and public pools, which are available for instance startup. Valid values:</p>
         * <ul>
         * <li><p>PrivatePoolFirst: private pool first. When this strategy is selected, if ResourcePoolOptions.PrivatePoolIds is specified or PrivatePoolTags conditions are met, the corresponding private pools are used first. If no private pool is specified or the specified private pool has insufficient capacity, open-type private pools are automatically matched. If no eligible private pool is available, the public pool is used to create instances.</p>
         * </li>
         * <li><p>PrivatePoolOnly: private pool only. When this strategy is selected, you must specify ResourcePoolOptions.PrivatePoolIds. If the specified private pool has insufficient capacity, the instance fails to start.</p>
         * </li>
         * <li><p>PublicPoolFirst: public pool first. The public pool is used first to create instances. When public pool resources are insufficient, private pool resources are used as a supplement. Open-type private pools are automatically matched first. If no eligible private pool is available, the Target-type private pools specified by ResourcePoolOptions.PrivatePoolIds or matching PrivatePoolTags conditions are used. (This strategy is in invitational preview and is not available for use.)</p>
         * </li>
         * <li><p>None: does not use a resource pool strategy.</p>
         * </li>
         * </ul>
         * <p>Default value: None.</p>
         * 
         * <strong>example:</strong>
         * <p>PrivatePoolFirst</p>
         */
        @NameInMap("Strategy")
        public String strategy;

        public static ModifyScalingConfigurationShrinkRequestResourcePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationShrinkRequestResourcePoolOptions self = new ModifyScalingConfigurationShrinkRequestResourcePoolOptions();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationShrinkRequestResourcePoolOptions setPrivatePoolIds(java.util.List<String> privatePoolIds) {
            this.privatePoolIds = privatePoolIds;
            return this;
        }
        public java.util.List<String> getPrivatePoolIds() {
            return this.privatePoolIds;
        }

        public ModifyScalingConfigurationShrinkRequestResourcePoolOptions setPrivatePoolTags(java.util.List<ModifyScalingConfigurationShrinkRequestResourcePoolOptionsPrivatePoolTags> privatePoolTags) {
            this.privatePoolTags = privatePoolTags;
            return this;
        }
        public java.util.List<ModifyScalingConfigurationShrinkRequestResourcePoolOptionsPrivatePoolTags> getPrivatePoolTags() {
            return this.privatePoolTags;
        }

        public ModifyScalingConfigurationShrinkRequestResourcePoolOptions setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

    }

    public static class ModifyScalingConfigurationShrinkRequestSecurityOptions extends TeaModel {
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

        public static ModifyScalingConfigurationShrinkRequestSecurityOptions build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationShrinkRequestSecurityOptions self = new ModifyScalingConfigurationShrinkRequestSecurityOptions();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationShrinkRequestSecurityOptions setConfidentialComputingMode(String confidentialComputingMode) {
            this.confidentialComputingMode = confidentialComputingMode;
            return this;
        }
        public String getConfidentialComputingMode() {
            return this.confidentialComputingMode;
        }

    }

    public static class ModifyScalingConfigurationShrinkRequestSpotPriceLimits extends TeaModel {
        /**
         * <p>The instance type of the spot instance. This parameter takes effect only when SpotStrategy is set to SpotWithPriceLimit.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The bid price for the spot instance. This parameter takes effect only when SpotStrategy is set to SpotWithPriceLimit.</p>
         * 
         * <strong>example:</strong>
         * <p>0.125</p>
         */
        @NameInMap("PriceLimit")
        public Float priceLimit;

        public static ModifyScalingConfigurationShrinkRequestSpotPriceLimits build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationShrinkRequestSpotPriceLimits self = new ModifyScalingConfigurationShrinkRequestSpotPriceLimits();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationShrinkRequestSpotPriceLimits setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ModifyScalingConfigurationShrinkRequestSpotPriceLimits setPriceLimit(Float priceLimit) {
            this.priceLimit = priceLimit;
            return this;
        }
        public Float getPriceLimit() {
            return this.priceLimit;
        }

    }

}
