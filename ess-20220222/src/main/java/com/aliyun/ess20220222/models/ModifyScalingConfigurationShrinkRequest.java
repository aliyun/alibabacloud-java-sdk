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
     * <p>Specifies whether to associate the instance on a dedicated host with the dedicated host. Valid values:</p>
     * <ul>
     * <li><p>default: The instance is not associated with the dedicated host. If you restart an instance that was stopped in economical mode, the instance may be placed on a different dedicated host in the automatic deployment resource pool if the resources of the original dedicated host are insufficient.</p>
     * </li>
     * <li><p>host: The instance is associated with the dedicated host. If you restart an instance that was stopped in economical mode, the instance is still placed on the original dedicated host. If the resources of the original dedicated host are insufficient, the instance fails to restart.</p>
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
     * <p>You can specify both \<code>Cpu\\</code> and \<code>Memory\\</code> to define a range of instance types. For example, if you set \<code>Cpu\\</code> to 2 and \<code>Memory\\</code> to 16, all instance types with 2 vCPUs and 16 GiB of memory are matched. Auto Scaling determines the available instance types based on factors such as I/O optimization and zone, and then creates the instance of the lowest-priced instance type.</p>
     * <blockquote>
     * <p>This configuration is effective only when the cost optimization mode is enabled and no instance types are specified in the scaling configuration.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Cpu")
    public Integer cpu;

    /**
     * <p>The performance mode of the burstable instance. Valid values:</p>
     * <ul>
     * <li><p>Standard: the standard mode. For more information about the instance performance, see the &quot;Performance modes&quot; section in <a href="https://help.aliyun.com/document_detail/59977.html">What is a burstable instance?</a>.</p>
     * </li>
     * <li><p>Unlimited: the unlimited mode. For more information about the instance performance, see the &quot;Performance modes&quot; section in <a href="https://help.aliyun.com/document_detail/59977.html">What is a burstable instance?</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("CreditSpecification")
    public String creditSpecification;

    /**
     * <p>The custom priority of the ECS instance type and vSwitch.</p>
     * <blockquote>
     * <p>Notice: This parameter is in effect only when the scaling policy of the scaling group is set to the priority-based policy.</p>
     * </blockquote>
     * <p>If an instance cannot be created using the instance type and vSwitch with a higher priority, Auto Scaling automatically uses the instance type and vSwitch combination with the next priority to create the instance.</p>
     * <blockquote>
     * <p>If you specify custom priorities for only some instance type and vSwitch combinations, the combinations for which you do not specify custom priorities have a lower priority than the combinations for which you specify custom priorities. The priority of the combinations for which you do not specify custom priorities is determined by the order of vSwitches in the scaling group and the order of instance types in the scaling configuration.</p>
     * <ul>
     * <li>For example, if the vSwitches in the scaling group are ordered as vsw1 and vsw2, the instance types in the scaling configuration are ordered as type1 and type2, and the custom priority is set to [&quot;vsw2+type2&quot;, &quot;vsw1+type2&quot;], the final priority is: &quot;vsw2+type2&quot; &gt; &quot;vsw1+type2&quot; &gt; &quot;vsw1+type1&quot; &gt; &quot;vsw2+type1&quot;.</li>
     * </ul>
     * </blockquote>
     */
    @NameInMap("CustomPriorities")
    public java.util.List<ModifyScalingConfigurationShrinkRequestCustomPriorities> customPriorities;

    /**
     * <p>The collection of data disk information.</p>
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
     * <p>Specifies whether to create the ECS instance on a dedicated host. If you specify \<code>DedicatedHostId\\</code>, the \<code>SpotStrategy\\</code> and \<code>SpotPriceLimit\\</code> settings in the request are ignored. This is because dedicated hosts do not support spot instances.</p>
     * <p>You can call the DescribeDedicatedHosts operation to query the list of dedicated host IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>dh-bp67acfmxazb4p****</p>
     */
    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    /**
     * <p>The release protection attribute of the instance. This parameter specifies whether you can release the instance using the ECS console or by calling the DeleteInstance operation. This prevents the instance from being accidentally released. Valid values:</p>
     * <ul>
     * <li><p>true: enables release protection. You cannot release the instance using the ECS console or by calling the DeleteInstance operation.</p>
     * </li>
     * <li><p>false: disables release protection. You can release the instance using the ECS console or by calling the DeleteInstance operation.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This attribute applies only to pay-as-you-go instances. It prevents the instances that are scaled out by Auto Scaling from being accidentally released. This attribute does not affect normal scale-in activities. Instances for which release protection is enabled can be released during scale-in activities.</p>
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
     * <p>The hostname of the ECS instance. A period (.) or a hyphen (-) cannot be used as the first or last character of the hostname. Consecutive periods (.) or hyphens (-) are not allowed. The naming conventions for hostnames vary based on the instance operating system:</p>
     * <ul>
     * <li><p>For Windows instances, the hostname must be 2 to 15 characters in length and can contain letters, digits, and hyphens (-). It cannot contain periods (.) or consist of only digits.</p>
     * </li>
     * <li><p>For other instance types, such as Linux, the hostname must be 2 to 64 characters in length. You can use periods (.) to separate the hostname into multiple segments. Each segment can contain letters, digits, and hyphens (-).</p>
     * </li>
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
     * <li><p>enabled: enable.</p>
     * </li>
     * <li><p>disabled: disable.</p>
     * </li>
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
     * <p>Specifies whether to enforce the security-hardened mode (IMDSv2) when you access instance metadata. Valid values:</p>
     * <ul>
     * <li><p>optional: does not enforce the use of IMDSv2.</p>
     * </li>
     * <li><p>required: enforces the use of IMDSv2. If you set the value to \<code>required\\</code>, you cannot access instance metadata in normal mode.</p>
     * </li>
     * </ul>
     * <p>Default value: optional.</p>
     * <blockquote>
     * <p>For more information about how to access instance metadata, see <a href="https://help.aliyun.com/document_detail/108460.html">Access modes of instance metadata</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>optional</p>
     */
    @NameInMap("HttpTokens")
    public String httpTokens;

    /**
     * <p>The name of the image family. You can set this parameter to obtain the latest available image from the specified image family to create instances. If you have set the <code>ImageId</code> parameter, you cannot set this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>hangzhou-daily-update</p>
     */
    @NameInMap("ImageFamily")
    public String imageFamily;

    /**
     * <p>The ID of the image file that is used to create the instances.</p>
     * <blockquote>
     * <p>If the image that was previously used in the scaling configuration includes a system disk and data disks, the original data disk information is cleared after you change the image.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>centos6u5_64_20G_aliaegis_2014****.vhd</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The name of the image file. The image name must be unique in a region. If you specify \<code>ImageId\\</code>, \<code>ImageName\\</code> is ignored.</p>
     * <p>You cannot use \<code>ImageName\\</code> to specify a Marketplace image.</p>
     * 
     * <strong>example:</strong>
     * <p>suse11sp3_64_20G_aliaegis_2015****.vhd</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The description of the ECS instance. The description must be 2 to 256 English or Chinese characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Test instance.</p>
     */
    @NameInMap("InstanceDescription")
    public String instanceDescription;

    /**
     * <p>The name of the ECS instances that are automatically created using this scaling configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>inst****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The collection of intelligent configuration information that is used to filter instance types that meet the specified requirements.</p>
     */
    @NameInMap("InstancePatternInfos")
    public java.util.List<ModifyScalingConfigurationShrinkRequestInstancePatternInfos> instancePatternInfos;

    /**
     * <p>After you enable the alternative mode, if issues such as insufficient inventory occur, the system supplements the selected instance types with similar instance types of the same size, or creates vSwitches in alternative zones and adds them to the scaling group.</p>
     */
    @NameInMap("InstanceTypeCandidateOptions")
    public ModifyScalingConfigurationShrinkRequestInstanceTypeCandidateOptions instanceTypeCandidateOptions;

    /**
     * <p>The information about the specified instance types.</p>
     */
    @NameInMap("InstanceTypeOverrides")
    public java.util.List<ModifyScalingConfigurationShrinkRequestInstanceTypeOverrides> instanceTypeOverrides;

    /**
     * <p>The instance types. If you use \<code>InstanceTypes\\</code>, \<code>InstanceType\\</code> is ignored.</p>
     * <p>If an instance cannot be created using the instance type with a higher priority, Auto Scaling automatically uses the instance type with the next priority to create the instance.</p>
     */
    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    /**
     * <p>The billing method for network usage. Valid values:</p>
     * <ul>
     * <li><p>PayByBandwidth: pay-by-bandwidth. If you set the value to PayByBandwidth, the value of \<code>InternetMaxBandwidthOut\\</code> is the selected fixed bandwidth.</p>
     * </li>
     * <li><p>PayByTraffic: pay-by-data-transfer. If you set the value to PayByTraffic, the value of \<code>InternetMaxBandwidthOut\\</code> is the maximum bandwidth, and the billing is based on the actual network traffic.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PayByBandwidth</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The maximum inbound public bandwidth. Unit: Mbit/s. Value range:</p>
     * <ul>
     * <li><p>If the purchased outbound public bandwidth is less than or equal to 10 Mbit/s: 1 to 10. The default value is 10.</p>
     * </li>
     * <li><p>If the purchased outbound public bandwidth is greater than 10 Mbit/s: 1 to the value of <code>InternetMaxBandwidthOut</code>. The default value is the value of <code>InternetMaxBandwidthOut</code>.</p>
     * </li>
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
     * <p>Specifies whether the instance is I/O optimized. Valid values:</p>
     * <ul>
     * <li><p>none: The instance is not I/O optimized.</p>
     * </li>
     * <li><p>optimized: The instance is I/O optimized.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("IoOptimized")
    public String ioOptimized;

    /**
     * <p>The number of randomly generated IPv6 addresses to be assigned to the ENI.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    /**
     * <p>The name of the key pair that is used to log on to the ECS instance.</p>
     * <ul>
     * <li><p>For Windows instances, this parameter is ignored. The default value is empty.</p>
     * </li>
     * <li><p>For Linux instances, password-based logon is disabled by default.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>KeyPair_Name</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The weight of the backend server. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("LoadBalancerWeight")
    public Integer loadBalancerWeight;

    /**
     * <p>The memory size. Unit: GiB.</p>
     * <p>You can specify both \<code>Cpu\\</code> and \<code>Memory\\</code> to define a range of instance types. For example, if you set \<code>Cpu\\</code> to 2 and \<code>Memory\\</code> to 16, all instance types with 2 vCPUs and 16 GiB of memory are matched. Auto Scaling determines the available instance types based on factors such as I/O optimization and zone, and then creates the instance of the lowest-priced instance type.</p>
     * <blockquote>
     * <p>This configuration is effective only when the cost optimization mode is enabled and no instance types are specified in the scaling configuration.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("Memory")
    public Integer memory;

    /**
     * <p>The list of ENIs.</p>
     */
    @NameInMap("NetworkInterfaces")
    public java.util.List<ModifyScalingConfigurationShrinkRequestNetworkInterfaces> networkInterfaces;

    /**
     * <p>Specifies whether to overwrite the parameter. Valid values:</p>
     * <ul>
     * <li><p>true: Overwrite the parameter.</p>
     * </li>
     * <li><p>false: Do not overwrite the parameter.</p>
     * </li>
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
     * <p>The password of the ECS instance. The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters can be:</p>
     * <p>\`()\~!@#$%^&amp;\*-_+=|{}[]:;\&quot;&lt;&gt;,.?/</p>
     * <p>For Windows instances, the password cannot start with a forward slash (/).</p>
     * <blockquote>
     * <p>If you specify the \<code>Password\\</code> parameter, we recommend that you send requests over HTTPS to prevent password leaks.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123abc****</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>Specifies whether to use the password that is preset in the image. If you use this parameter, make sure that a password is set for the image.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    /**
     * <p>The name of the RAM role of the ECS instance. The RAM role is provided and maintained by RAM. You can call the ListRoles operation to query the available RAM roles. For information about how to create a RAM role, see API CreateRole.</p>
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
     * <p>The resource pool policy to use when creating an instance. Note the following when you set this parameter:</p>
     * <ul>
     * <li><p>This parameter is in effect only when you create a pay-as-you-go instance.</p>
     * </li>
     * <li><p>You cannot set this parameter and \<code>PrivatePoolOptions.MatchCriteria\\</code> or \<code>PrivatePoolOptions.Id\\</code> at the same time.</p>
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
     * <p>The name of the scaling configuration. The name must be 2 to 64 English or Chinese characters in length. It must start with a digit, a letter, or a Chinese character. The name can contain digits, underscores (_), hyphens (-), and periods (.).</p>
     * <p>The name of a scaling configuration must be unique within a scaling group in the same region. If you do not specify this parameter, the ID of the scaling configuration is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>test-modify</p>
     */
    @NameInMap("ScalingConfigurationName")
    public String scalingConfigurationName;

    /**
     * <p>The scheduling options.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;testManagedPrivateSpaceId****&quot;]</p>
     */
    @NameInMap("SchedulerOptions")
    public String schedulerOptionsShrink;

    /**
     * <p>The ID of the security group to which the ECS instance belongs. ECS instances in the same security group can access each other.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-F876F****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The ID of the security group.</p>
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
     * <li><p>1: Alibaba Cloud ensures that the instance runs for 1 hour and is not automatically released. After 1 hour, the system automatically compares the bid price with the market price and checks the resource inventory to determine whether to retain or release the instance.</p>
     * </li>
     * <li><p>0: Alibaba Cloud does not ensure that the instance runs for 1 hour after it is created. The system automatically compares the bid price with the market price and checks the resource inventory to determine whether to retain or release the instance.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Alibaba Cloud sends a notification to you through ECS system events 5 minutes before the instance is released. Spot instances are billed by the second. Select a protection period based on the time required to complete your task.</p>
     * </blockquote>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SpotDuration")
    public Integer spotDuration;

    /**
     * <p>The interruption mode of the spot instance. Currently, only Terminate is supported, which is the default value. This value indicates that the instance is directly released.</p>
     * 
     * <strong>example:</strong>
     * <p>Terminate</p>
     */
    @NameInMap("SpotInterruptionBehavior")
    public String spotInterruptionBehavior;

    /**
     * <p>The information about the spot instance types.</p>
     */
    @NameInMap("SpotPriceLimits")
    public java.util.List<ModifyScalingConfigurationShrinkRequestSpotPriceLimits> spotPriceLimits;

    /**
     * <p>The preemption policy for the pay-as-you-go instance. Valid values:</p>
     * <ul>
     * <li><p>NoSpot: a regular pay-as-you-go instance.</p>
     * </li>
     * <li><p>SpotWithPriceLimit: a spot instance for which you specify the maximum hourly price.</p>
     * </li>
     * <li><p>SpotAsPriceGo: a spot instance for which the system automatically bids based on the current market price.</p>
     * </li>
     * </ul>
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
     * <p>The maximum number of partitions in the storage set. The value must be an integer that is greater than or equal to 2.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("StorageSetPartitionNumber")
    public Integer storageSetPartitionNumber;

    /**
     * <p>The categories of the system disk. If a disk of a category with a higher priority cannot be created, Auto Scaling automatically tries to create a disk of a category with the next priority. Valid values:</p>
     * <ul>
     * <li><p>cloud: basic disk.</p>
     * </li>
     * <li><p>cloud_efficiency: ultra disk.</p>
     * </li>
     * <li><p>cloud_ssd: standard SSD.</p>
     * </li>
     * <li><p>cloud_essd: ESSD.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You cannot specify this parameter and <code>SystemDisk.Category</code> at the same time.</p>
     * </blockquote>
     */
    @NameInMap("SystemDiskCategories")
    public java.util.List<String> systemDiskCategories;

    /**
     * <p>The tags of the ECS instance. You can specify up to 20 tags in key-value pairs. The following limits apply to keys and values:</p>
     * <ul>
     * <li><p>A key can be up to 64 characters in length, cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>. If you specify tags, the key cannot be an empty string.</p>
     * </li>
     * <li><p>A value can be up to 128 characters in length, cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>. The value can be an empty string.</p>
     * </li>
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
     * <li><p>default: Create the instance not on a dedicated host.</p>
     * </li>
     * <li><p>host: Create the instance on a dedicated host. If you do not specify \<code>DedicatedHostId\\</code>, Alibaba Cloud automatically selects a dedicated host for the instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Tenancy")
    public String tenancy;

    /**
     * <p>The custom data of the ECS instance. The data must be Base64-encoded. The raw data can be up to 32 KB in size.</p>
     * 
     * <strong>example:</strong>
     * <p>ZWNobyBoZWxsbyBlY3Mh</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The ID of the zone to which the ECS instance belongs.</p>
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
         * <p>Specifies whether to log on to the ECS instance as the ecs-user user. For more information, see <a href="https://help.aliyun.com/document_detail/388447.html">Manage logon usernames of ECS instances</a>. Valid values:</p>
         * <p>true: yes.</p>
         * <p>false: no.</p>
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
         * <p>The ID of the private pool. The private pool can be an Elastic Assurance service or a Capacity Reservation service.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-bp67acfmxazb4****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The capacity option of the private pool for starting the instance. The private pool is generated after an Elastic Assurance service or a Capacity Reservation service takes effect. You can select a private pool to start an instance. Valid values:</p>
         * <ul>
         * <li><p>Open: open mode. The system automatically matches the instance with an open private pool. If no open private pools are available, the instance is started using public pool resources. You do not need to set the \<code>PrivatePoolOptions.Id\\</code> parameter in this mode.</p>
         * </li>
         * <li><p>Target: specified mode. The instance is started using the capacity of a specified private pool. If the specified private pool is unavailable, the instance fails to start. You must specify the private pool ID by setting the \<code>PrivatePoolOptions.Id\\</code> parameter in this mode.</p>
         * </li>
         * <li><p>None: no mode. The instance is not started using the capacity of a private pool.</p>
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
         * <p>The ID of the automatic snapshot policy used for the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp12m37ccmxvbmi5****</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>Specifies whether to enable the performance burst feature for the system disk. Valid values:</p>
         * <ul>
         * <li><p>true: enable.</p>
         * </li>
         * <li><p>false: disable.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is supported only when <code>SystemDisk.Category</code> is set to <code>cloud_auto</code>.</p>
         * </blockquote>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>The category of the system disk. Valid values:</p>
         * <ul>
         * <li><p>cloud: basic disk.</p>
         * </li>
         * <li><p>cloud_efficiency: ultra disk.</p>
         * </li>
         * <li><p>cloud_ssd: standard SSD.</p>
         * </li>
         * <li><p>cloud_essd: ESSD.</p>
         * </li>
         * <li><p>ephemeral_ssd: local SSD.</p>
         * </li>
         * </ul>
         * <p>You cannot specify this parameter and <code>SystemDiskCategories</code> at the same time. If neither this parameter nor <code>SystemDiskCategories</code> is specified, this parameter has a default value. If the instance type is from instance family I and the instance is not I/O optimized, the default value is \<code>cloud\\</code>. Otherwise, the default value is \<code>cloud_efficiency\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The description of the system disk. The description must be 2 to 256 English or Chinese characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Test system disk.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the system disk. The name must be 2 to 128 English or Chinese characters in length. It must start with a letter or a Chinese character and cannot start with http\:// or https\://. It can contain digits, colons (:), underscores (_), and hyphens (-). Default value: empty</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssdSystem</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>The encryption algorithm used for the system disk. Valid values:</p>
         * <ul>
         * <li><p>AES-256.</p>
         * </li>
         * <li><p>SM4-128.</p>
         * </li>
         * </ul>
         * <p>Default value: AES-256.</p>
         * 
         * <strong>example:</strong>
         * <p>AES-256</p>
         */
        @NameInMap("EncryptAlgorithm")
        public String encryptAlgorithm;

        /**
         * <p>Specifies whether to encrypt the system disk. Valid values:</p>
         * <ul>
         * <li><p>true: encrypt the system disk.</p>
         * </li>
         * <li><p>false: do not encrypt the system disk.</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public Boolean encrypted;

        /**
         * <p>The ID of the KMS key used for the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The performance level of the ESSD that is used as the system disk. Valid values:</p>
         * <ul>
         * <li><p>PL0: A single disk can deliver up to 10,000 random read/write IOPS.</p>
         * </li>
         * <li><p>PL1: A single disk can deliver up to 50,000 random read/write IOPS.</p>
         * </li>
         * <li><p>PL2: A single disk can deliver up to 100,000 random read/write IOPS.</p>
         * </li>
         * <li><p>PL3: A single disk can deliver up to 1,000,000 random read/write IOPS.</p>
         * </li>
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
         * <p>The pre-configured IOPS of the system disk.</p>
         * <blockquote>
         * <p>IOPS, or input/output operations per second, is the number of I/O operations that a block storage device can process per second. It indicates the read and write performance of the block storage device.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        /**
         * <p>The size of the system disk. Unit: GiB. Value range:</p>
         * <ul>
         * <li><p>Basic disks: 20 to 500.</p>
         * </li>
         * <li><p>ESSDs:</p>
         * <ul>
         * <li><p>PL0: 1 to 2048.</p>
         * </li>
         * <li><p>PL1: 20 to 2048.</p>
         * </li>
         * <li><p>PL2: 461 to 2048.</p>
         * </li>
         * <li><p>PL3: 1261 to 2048.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>ESSD AutoPL cloud disks: 1 to 2048.</p>
         * </li>
         * <li><p>Other disk categories: 20 to 2048.</p>
         * </li>
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
         * <p>The instance type must be included in the list of instance types in the scaling configuration.</p>
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
         * <p>The vSwitch must be included in the list of vSwitches in the scaling group.</p>
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
         * <p>The ID of the automatic snapshot policy used for the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp19nq9enxqkomib****</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>Specifies whether to enable performance burst for the system disk. Valid values:</p>
         * <ul>
         * <li><p>true: Enabled.</p>
         * </li>
         * <li><p>false: Disabled.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only when <code>SystemDisk.Category</code> is set to <code>cloud_auto</code>.</p>
         * </blockquote>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>The categories of the data disk. Valid values:</p>
         * <ul>
         * <li><p>cloud: basic disk. The \<code>DeleteWithInstance\\</code> attribute of a basic disk that is created with an instance is \<code>true\\</code>.</p>
         * </li>
         * <li><p>cloud_efficiency: ultra disk.</p>
         * </li>
         * <li><p>cloud_ssd: standard SSD.</p>
         * </li>
         * <li><p>cloud_essd: ESSD.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>You cannot specify this parameter and <code>DataDisk.Category</code> at the same time.</p>
         * </blockquote>
         */
        @NameInMap("Categories")
        public java.util.List<String> categories;

        /**
         * <p>The category of the data disk. Valid values:</p>
         * <ul>
         * <li><p>cloud: basic disk. The \<code>DeleteWithInstance\\</code> attribute of a basic disk that is created with an instance is \<code>true\\</code>.</p>
         * </li>
         * <li><p>cloud_efficiency: ultra disk.</p>
         * </li>
         * <li><p>cloud_ssd: standard SSD.</p>
         * </li>
         * <li><p>ephemeral_ssd: local SSD.</p>
         * </li>
         * <li><p>cloud_essd: ESSD.</p>
         * </li>
         * </ul>
         * <p>You cannot specify this parameter and <code>DataDisk.Categories</code> at the same time. If neither this parameter nor <code>DataDisk.Categories</code> is specified, this parameter has a default value:</p>
         * <ul>
         * <li><p>For I/O optimized instances, the default value is \<code>cloud_efficiency\\</code>.</p>
         * </li>
         * <li><p>For non-I/O optimized instances, the default value is \<code>cloud\\</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Specifies whether to release the data disk when the instance is released. Valid values:</p>
         * <ul>
         * <li><p>true: The disk is released with the instance.</p>
         * </li>
         * <li><p>false: The disk is not released with the instance.</p>
         * </li>
         * </ul>
         * <p>You can set this parameter only for independent cloud disks (\<code>DataDisk.Category\\</code> is \<code>cloud\\</code>, \<code>cloud_efficiency\\</code>, \<code>cloud_ssd\\</code>, \<code>cloud_essd\\</code>, or \<code>cloud_auto\\</code>). Otherwise, an error occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        /**
         * <p>The description of the data disk. The description must be 2 to 256 English or Chinese characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Test data disk.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The mount point of the data disk. If you do not specify this parameter, the system allocates a mount point when the ECS instance is automatically created. The mount point starts from /dev/xvdb and goes to /dev/xvdz.</p>
         * 
         * <strong>example:</strong>
         * <p>/dev/xvdd</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The name of the data disk. The name must be 2 to 128 English or Chinese characters in length. It must start with a letter or a Chinese character and cannot start with <code>http://</code> or <code>https://</code>. It can contain digits, colons (:), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssdData</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>Specifies whether the system disk is encrypted. Valid values:</p>
         * <ul>
         * <li><p>true: The system disk is encrypted.</p>
         * </li>
         * <li><p>false: The system disk is not encrypted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public String encrypted;

        /**
         * <p>The ID of the KMS key for the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The performance level of the ESSD that is used as the data disk. Valid values:</p>
         * <ul>
         * <li><p>PL0: A single disk can deliver up to 10,000 random read/write IOPS.</p>
         * </li>
         * <li><p>PL1: A single disk can deliver up to 50,000 random read/write IOPS.</p>
         * </li>
         * <li><p>PL2: A single disk can deliver up to 100,000 random read/write IOPS.</p>
         * </li>
         * <li><p>PL3: A single disk can deliver up to 1,000,000 random read/write IOPS.</p>
         * </li>
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
         * <p>The pre-configured IOPS of the data disk.</p>
         * <blockquote>
         * <p>IOPS, or input/output operations per second, is the number of I/O operations that a block storage device can process per second. It indicates the read and write performance of the block storage device.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        /**
         * <p>The size of the data disk. Unit: GiB. Value range:</p>
         * <ul>
         * <li><p>cloud: 5 to 2000.</p>
         * </li>
         * <li><p>cloud_efficiency: 20 to 32768.</p>
         * </li>
         * <li><p>cloud_ssd: 20 to 32768.</p>
         * </li>
         * <li><p>cloud_essd: 20 to 32768.</p>
         * </li>
         * <li><p>ephemeral_ssd: 5 to 800.</p>
         * </li>
         * </ul>
         * <p>If you specify this parameter, the disk size must be greater than or equal to the size of the snapshot specified by \<code>SnapshotId\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The snapshot that is used to create the data disk. If you specify this parameter, \<code>DataDisk.Size\\</code> is ignored, and the size of the created disk is the size of the specified snapshot.</p>
         * <p>If the snapshot was created on or before July 15, 2013, the call is rejected, and the \<code>InvalidSnapshot.TooOld\\</code> error is returned.</p>
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
         * <p>The architecture type of the instance type. Valid values:</p>
         * <ul>
         * <li><p>X86: x86.</p>
         * </li>
         * <li><p>Heterogeneous: heterogeneous computing, such as GPU and FPGA.</p>
         * </li>
         * <li><p>BareMental: ECS Bare Metal Instance.</p>
         * </li>
         * <li><p>Arm: Arm.</p>
         * </li>
         * </ul>
         * <p>Default value: all architecture types.</p>
         */
        @NameInMap("Architectures")
        public java.util.List<String> architectures;

        /**
         * <p>Specifies whether to include burstable instance types. Valid values:</p>
         * <ul>
         * <li><p>Exclude: do not include burstable instance types.</p>
         * </li>
         * <li><p>Include: include burstable instance types.</p>
         * </li>
         * <li><p>Required: include only burstable instance types.</p>
         * </li>
         * </ul>
         * <p>Default value: Include.</p>
         * 
         * <strong>example:</strong>
         * <p>Include</p>
         */
        @NameInMap("BurstablePerformance")
        public String burstablePerformance;

        /**
         * <p>The number of vCPU cores of the instance type in intelligent configuration mode. This parameter is used to filter instance types. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
         * <p>Note the following information:</p>
         * <ul>
         * <li><p>The \<code>InstancePatternInfo\\</code> parameter is applicable only to scaling groups whose NetworkType is set to VPC.</p>
         * </li>
         * <li><p>You must specify \<code>InstancePatternInfo.Cores\\</code> and \<code>InstancePatternInfo.Memory\\</code> at the same time.</p>
         * </li>
         * <li><p>If you specify instance types using the \<code>InstanceType\\</code> or \<code>InstanceTypes\\</code> parameter, Auto Scaling preferentially uses the specified instance types for scale-out activities. If the specified instance types are out of stock, Auto Scaling uses the lowest-priced instance type among those that meet the requirements specified by the \<code>InstancePatternInfo\\</code> parameter for scale-out activities.</p>
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
         * <p>You can specify up to two CPU architectures.</p>
         * </blockquote>
         * <ul>
         * <li><p>X86.</p>
         * </li>
         * <li><p>ARM.</p>
         * </li>
         * </ul>
         */
        @NameInMap("CpuArchitectures")
        public java.util.List<String> cpuArchitectures;

        /**
         * <p>The instance types to exclude. You can use a wildcard character (\*) to exclude an instance type or an entire instance family. Examples:</p>
         * <ul>
         * <li><p>ecs.c6.large: excludes the ecs.c6.large instance type.</p>
         * </li>
         * <li><p>ecs.c6.\*: excludes all instance types of the c6 family.</p>
         * </li>
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
         * <p>The category of the instance type. Valid values:</p>
         * <ul>
         * <li><p>General-purpose: General-purpose.</p>
         * </li>
         * <li><p>Compute-optimized: compute-optimized.</p>
         * </li>
         * <li><p>Memory-optimized: memory-optimized.</p>
         * </li>
         * <li><p>Big data: big data.</p>
         * </li>
         * <li><p>Local SSDs: local SSD.</p>
         * </li>
         * <li><p>High Clock Speed: high frequency.</p>
         * </li>
         * <li><p>Enhanced: enhanced instance families.</p>
         * </li>
         * <li><p>Shared: shared-resource instances.</p>
         * </li>
         * <li><p>Compute-optimized with GPU: GPU.</p>
         * </li>
         * <li><p>Visual Compute-optimized: visual compute-optimized.</p>
         * </li>
         * <li><p>Heterogeneous Service: heterogeneous computing.</p>
         * </li>
         * <li><p>Compute-optimized with FPGA: FPGA.</p>
         * </li>
         * <li><p>Compute-optimized with NPU: NPU-accelerated.</p>
         * </li>
         * <li><p>ECS Bare Metal: ECS Bare Metal Instance.</p>
         * </li>
         * <li><p>High Performance Compute: high-performance computing (HPC).</p>
         * </li>
         * </ul>
         */
        @NameInMap("InstanceCategories")
        public java.util.List<String> instanceCategories;

        /**
         * <p>The level of the instance family. This parameter is used to filter instance types. This parameter takes effect only when \<code>CostOptimization\\</code> is enabled. Valid values:</p>
         * <ul>
         * <li><p>EntryLevel: entry-level instances (shared). This instance type is cost-effective but does not provide stable computing performance. It is suitable for business scenarios that have low CPU utilization. For more information, see <a href="https://help.aliyun.com/document_detail/108489.html">Shared instance families</a>.</p>
         * </li>
         * <li><p>EnterpriseLevel: enterprise-level instances. This instance type provides stable performance and dedicated resources, and is suitable for business scenarios that have high stability requirements. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
         * </li>
         * <li><p>CreditEntryLevel: credit entry-level instances (burstable). This instance type provides CPU credits to ensure computing performance. It is suitable for business scenarios that have low and sporadic CPU utilization. For more information, see <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EnterpriseLevel</p>
         */
        @NameInMap("InstanceFamilyLevel")
        public String instanceFamilyLevel;

        /**
         * <p>The instance families to query. You can specify up to 10 instance families.</p>
         */
        @NameInMap("InstanceTypeFamilies")
        public java.util.List<String> instanceTypeFamilies;

        /**
         * <p>The maximum hourly price that you can accept for a pay-as-you-go or spot instance in intelligent configuration mode. This parameter is used to filter instance types.</p>
         * <blockquote>
         * <p>This parameter is required when \<code>SpotStrategy\\</code> is set to \<code>SpotWithPriceLimit\\</code>. In other cases, this parameter is optional.</p>
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
         * <p>The value of \<code>MaximumCpuCoreCount\\</code> cannot be more than four times the value of \<code>MinimumCpuCoreCount\\</code>.</p>
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
         * <p>The memory size of the instance type in intelligent configuration mode. Unit: GiB. This parameter is used to filter instance types.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The minimum baseline vCPU computing performance (for all vCPUs) of a t5 or t6 burstable instance.</p>
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
         * <p>The minimum number of IPv6 addresses that can be assigned to a single ENI of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinimumEniIpv6AddressQuantity")
        public Integer minimumEniIpv6AddressQuantity;

        /**
         * <p>The minimum number of IPv4 addresses that can be assigned to a single ENI of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MinimumEniPrivateIpAddressQuantity")
        public Integer minimumEniPrivateIpAddressQuantity;

        /**
         * <p>The minimum number of ENIs that can be attached to the instance.</p>
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
         * <p>The minimum initial vCPU credit for a t5 or t6 burstable instance.</p>
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
         * <p>The processor model of the instance. You can specify up to 10 processor models.</p>
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
         * <p>When supplementing with vSwitches from other zones is allowed, you must specify the optional CIDR blocks for the vSwitches.</p>
         */
        @NameInMap("AllowCidrBlocks")
        public java.util.List<String> allowCidrBlocks;

        /**
         * <p>Specifies whether to allow supplementing with vSwitches from other zones.</p>
         * <blockquote>
         * <p>The instance type remains unchanged, and only new zones are selected as alternatives. When the scaling group cannot be scaled out in any of the selected zones due to issues such as insufficient inventory, the system automatically adds a new vSwitch in another zone to the scaling group based on this configuration.
         * For example, if the scaling group is configured with zones cn-hangzhou-h and cn-hangzhou-g, and scale-out fails in both zones, ESS may create a vSwitch in cn-hangzhou-k and add it to the scaling group based on real-time inventory.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowCrossAz")
        public Boolean allowCrossAz;

        /**
         * <p>Specifies whether to allow supplementing with instance types from other generations.</p>
         * <ul>
         * <li>For example, if the current instance type is ecs.c7.large, you can enable this feature to use alternative instance types such as ecs.c6.large and ecs.c8.large.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowDifferentGeneration")
        public Boolean allowDifferentGeneration;

        /**
         * <p>Specifies whether to enable the alternative mode.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The maximum price for alternative instance types.</p>
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
         * <p>If you want to specify the capacity of an instance type in a scaling configuration, specify this parameter and \<code>InstanceTypeOverride.WeightedCapacity\\</code>.</p>
         * <p>This parameter is used to specify an instance type. You can specify this parameter multiple times. You can use this parameter with the \<code>InstanceTypeOverride.WeightedCapacity\\</code> parameter to enable custom weights for multiple instance types.</p>
         * <blockquote>
         * <p>If you specify this parameter, you cannot specify \<code>instanceTypes\\</code>.</p>
         * </blockquote>
         * <p>Valid values of InstanceType: available ECS instance types.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c5.xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>If you want the scaling group to scale based on the capacity of instance types, specify this parameter after you specify \<code>LaunchTemplateOverride.InstanceType\\</code>.</p>
         * <p>This parameter specifies the weight of an instance type, which indicates the capacity of a single instance of the specified instance type in the scaling group. A higher weight indicates that a smaller number of instances of the specified instance type are required to meet the expected capacity.</p>
         * <p>You can set different weights for different instance types as needed because the performance metrics, such as the number of vCPUs and memory size, vary based on the instance type.</p>
         * <p>For example:</p>
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
         * <p>The capacity of the scaling group after a scale-out activity cannot exceed the sum of the maximum capacity (MaxSize) and the maximum weight of an instance type.</p>
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
         * <p>The type of the ENI. When you use this parameter, you must use \<code>NetworkInterfaces\\</code> to configure the primary ENI. You cannot set the \<code>SecurityGroupId\\</code> or \<code>SecurityGroupIds\\</code> parameter. Valid values:</p>
         * <ul>
         * <li><p>Primary: primary ENI.</p>
         * </li>
         * <li><p>Secondary: secondary ENI.</p>
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
         * <p>The number of randomly generated IPv6 addresses to be assigned to the primary ENI. Note:</p>
         * <p>This parameter takes effect only when \<code>NetworkInterface.InstanceType\\</code> is set to \<code>Primary\\</code>. You cannot set this parameter if \<code>NetworkInterface.InstanceType\\</code> is set to \<code>Secondary\\</code> or is empty.</p>
         * <p>After you set this parameter, you cannot set \<code>Ipv6AddressCount\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Ipv6AddressCount")
        public Integer ipv6AddressCount;

        /**
         * <p>The communication mode of the NIC. Valid values:</p>
         * <ul>
         * <li><p>Standard: uses the TCP communication mode.</p>
         * </li>
         * <li><p>HighPerformance: enables the Elastic RDMA Interface (ERI) and uses the RDMA communication mode.</p>
         * </li>
         * </ul>
         * <p>Default value: Standard.</p>
         * <blockquote>
         * <p>The number of ENIs in RDMA mode cannot exceed the limit for the instance family. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HighPerformance</p>
         */
        @NameInMap("NetworkInterfaceTrafficMode")
        public String networkInterfaceTrafficMode;

        /**
         * <p>The number of secondary private IPv4 addresses to assign to the NIC. Valid values: 1 to 49.</p>
         * <ul>
         * <li><p>The value cannot exceed the limit on the number of IP addresses for the instance type. For more information, see <a href="https://help.aliyun.com/zh/ecs/user-guide/overview-of-instance-families">Instance families</a>.</p>
         * </li>
         * <li><p>\<code>NetworkInterface.N.SecondaryPrivateIpAddressCount\\</code> is used to assign a number of secondary private IPv4 addresses to the NIC, excluding the primary private IP address of the NIC. The system randomly assigns the addresses from the available CIDR block of the vSwitch where the NIC is located (\<code>NetworkInterface.N.VSwitchId\\</code>).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("SecondaryPrivateIpAddressCount")
        public Integer secondaryPrivateIpAddressCount;

        /**
         * <p>The IDs of one or more security groups to which the ENI belongs.</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

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
         * <p>The ID of the private pool. The private pool can be an Elastic Assurance service or a Capacity Reservation service. You can only specify the ID of a Target private pool. You cannot specify this parameter and the \<code>PrivatePoolTags\\</code> parameter at the same time.</p>
         */
        @NameInMap("PrivatePoolIds")
        public java.util.List<String> privatePoolIds;

        /**
         * <p>Filter available Target private pools by tag. You can specify up to 20 tags.
         * Description:</p>
         * <ul>
         * <li><p>When you configure this parameter, the system filters only the associated Target private pools under your account to find private pools that match the tags and meet the constraints of the scaling group, such as zone and instance type.</p>
         * </li>
         * <li><p>Tag matching rule: The private pool must match all specified tags.</p>
         * </li>
         * <li><p>You cannot specify this parameter and the \<code>PrivatePoolIds\\</code> parameter at the same time.</p>
         * </li>
         * </ul>
         */
        @NameInMap("PrivatePoolTags")
        public java.util.List<ModifyScalingConfigurationShrinkRequestResourcePoolOptionsPrivatePoolTags> privatePoolTags;

        /**
         * <p>The resource pool includes the private pool generated after an Elastic Assurance service or a Capacity Reservation service takes effect, and the public pool. You can select a resource pool to start an instance. Valid values:</p>
         * <ul>
         * <li><p>PrivatePoolFirst: The private pool is used first. If you select this policy and specify \<code>ResourcePoolOptions.PrivatePoolIds\\</code> or meet the \<code>PrivatePoolTags\\</code> conditions, the corresponding private pool is used first. If you do not specify a private pool or the specified private pool has insufficient capacity, the system automatically matches an open private pool. If no eligible private pools are available, a public pool is used to create the instance.</p>
         * </li>
         * <li><p>PrivatePoolOnly: Only the private pool is used. If you select this policy, you must specify \<code>ResourcePoolOptions.PrivatePoolIds\\</code>. If the specified private pool has insufficient capacity, the instance fails to start.</p>
         * </li>
         * <li><p>PublicPoolFirst: The public pool is used first. A public pool is used first to create the instance. If the public pool has insufficient resources, a private pool is used. The system preferentially matches an open private pool. If no eligible private pools are available, the system uses the Target private pool that is specified by \<code>ResourcePoolOptions.PrivatePoolIds\\</code> or meets the \<code>PrivatePoolTags\\</code> conditions. (This policy is in invitational preview and is not yet available for use.)</p>
         * </li>
         * <li><p>None: No resource pool policy is used.</p>
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
         * <li><p>Enclave: The ECS instance uses an enclave to build a confidential computing environment. For more information, see <a href="https://help.aliyun.com/document_detail/203433.html">Build a confidential computing environment using an enclave</a>.</p>
         * </li>
         * <li><p>TDX: builds a TDX confidential computing environment. For more information, see <a href="https://help.aliyun.com/document_detail/479090.html">Build a TDX confidential computing environment</a>.</p>
         * </li>
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
         * <p>The instance type of the spot instance. This parameter is in effect when \<code>SpotStrategy\\</code> is set to \<code>SpotWithPriceLimit\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The bid for the spot instance. This parameter is in effect when \<code>SpotStrategy\\</code> is set to \<code>SpotWithPriceLimit\\</code>.</p>
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
