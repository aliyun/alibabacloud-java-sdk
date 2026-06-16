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
     * <p>Specifies whether to associate the instance with the dedicated host. Valid values:</p>
     * <ul>
     * <li><p>default: The instance is not associated with the dedicated host. When you restart an instance that was stopped in economical mode, the instance may be placed on a different dedicated host in the automatic deployment resource pool if the original dedicated host has insufficient resources.</p>
     * </li>
     * <li><p>host: The instance is associated with the dedicated host. When you restart an instance that was stopped in economical mode, the instance is still placed on the original dedicated host. If the original dedicated host has insufficient resources, the instance fails to restart.</p>
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
     * <p>Ensures the idempotence of the request. You can use the client to generate a unique parameter value to make sure that the same request is not repeated. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The number of vCPUs. Unit: cores.</p>
     * <p>You can specify both Cpu and Memory to define a range of instance types. For example, if you set Cpu to 2 and Memory to 16, all instance types with 2 vCPUs and 16 GiB of memory are selected. Auto Scaling determines the available instance types based on factors such as I/O optimization and zone, and then creates an instance of the instance type that has the lowest price.</p>
     * <blockquote>
     * <p>This configuration is effective only when the cost optimization policy is enabled for the scaling group and no instance types are specified in the scaling configuration.</p>
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
     * <li><p>Standard: standard mode.</p>
     * </li>
     * <li><p>Unlimited: unlimited mode.</p>
     * </li>
     * </ul>
     * <p>For more information, see the Performance modes section in <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("CreditSpecification")
    public String creditSpecification;

    /**
     * <p>The custom priority for the combination of an ECS instance type and a vSwitch.</p>
     * <blockquote>
     * <p>Notice: This is effective only when the scaling policy of the scaling group is set to the priority policy.</p>
     * </blockquote>
     * <p>If an instance cannot be created from a combination of an instance type and a vSwitch with a higher priority, Auto Scaling automatically tries the next combination in the list.</p>
     * <blockquote>
     * <p>If you specify custom priorities for only some combinations of instance types and vSwitches, the unspecified combinations have a lower priority than the specified ones. The unspecified combinations are still prioritized based on the order of vSwitches in the scaling group and the order of instance types in the scaling configuration.</p>
     * <ul>
     * <li>For example, if the vSwitch order in the scaling group is vsw1, vsw2, the instance type order in the scaling configuration is type1, type2, and the custom priority order is [&quot;vsw2+type2&quot;, &quot;vsw1+type2&quot;], the final priority will be: &quot;vsw2+type2&quot; &gt; &quot;vsw1+type2&quot; &gt; &quot;vsw1+type1&quot; &gt; &quot;vsw2+type1&quot;.</li>
     * </ul>
     * </blockquote>
     */
    @NameInMap("CustomPriorities")
    public java.util.List<CreateScalingConfigurationRequestCustomPriorities> customPriorities;

    /**
     * <p>A collection of data disk information.</p>
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
     * <p>Specifies whether to create the ECS instance on a dedicated host. If you specify the DedicatedHostId parameter, the SpotStrategy and SpotPriceLimit settings in the request are automatically ignored. This is because dedicated hosts do not support creating preemptible instances.</p>
     * <p>You can call the DescribeDedicatedHosts operation to query the list of dedicated host IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>dh-bp67acfmxazb4p****</p>
     */
    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    /**
     * <p>The release protection attribute of the instance. This specifies whether you can release the instance through the ECS console or by calling the DeleteInstance API. This prevents accidental release of the instance. Valid values:</p>
     * <ul>
     * <li><p>true: enables release protection. You cannot release the instance through the ECS console or by calling the DeleteInstance API.</p>
     * </li>
     * <li><p>false: disables release protection. You can release the instance through the ECS console or by calling the DeleteInstance API.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>This attribute applies only to pay-as-you-go instances to prevent accidental release of instances scaled out by Auto Scaling. It does not affect normal scale-in activities. Instances with release protection enabled can be released during scale-in activities.</p>
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
     * <p>The hostname of the ECS instance. A period (.) or a hyphen (-) cannot be used as the first or last character of a hostname. Consecutive periods (.) or hyphens (-) are not allowed. The naming conventions for different instance types are as follows:</p>
     * <ul>
     * <li><p>For Windows instances, the hostname must be 2 to 15 characters in length and can contain letters, digits, and hyphens (-). It cannot contain periods (.) or be all digits.</p>
     * </li>
     * <li><p>For other instance types, such as Linux, the hostname must be 2 to 64 characters in length. You can use periods (.) to separate the hostname into multiple segments. Each segment can contain letters, digits, and hyphens (-).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>host****</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The ID of the High Performance Computing (HPC) cluster to which the ECS instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>hpc-clusterid</p>
     */
    @NameInMap("HpcClusterId")
    public String hpcClusterId;

    /**
     * <p>Specifies whether to enable the access channel for instance metadata. Valid values:</p>
     * <ul>
     * <li><p>enabled: enables the channel.</p>
     * </li>
     * <li><p>disabled: disables the channel.</p>
     * </li>
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
     * <p>Specifies whether to enforce the security-hardened mode (IMDSv2) when accessing instance metadata. Valid values:</p>
     * <ul>
     * <li><p>optional: does not enforce the mode.</p>
     * </li>
     * <li><p>required: enforces the mode. If you set this value, you cannot access instance metadata in normal mode.</p>
     * </li>
     * </ul>
     * <p>Default value: optional.</p>
     * <blockquote>
     * <p>For information about instance metadata access modes, see <a href="https://help.aliyun.com/document_detail/108460.html">Instance metadata access modes</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>optional</p>
     */
    @NameInMap("HttpTokens")
    public String httpTokens;

    /**
     * <p>The name of the image family. You can set this parameter to obtain the latest available image from the specified image family to create the instance. If you have specified the <code>ImageId</code> parameter, you cannot set this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>hangzhou-daily-update</p>
     */
    @NameInMap("ImageFamily")
    public String imageFamily;

    /**
     * <p>The ID of the image file to use for creating instances.</p>
     * 
     * <strong>example:</strong>
     * <p>centos6u5_64_20G_aliaegis****.vhd</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The name of the image file. Image names must be unique within a region. If you specify ImageId, ImageName is ignored.</p>
     * <p>You cannot use ImageName to specify a Marketplace image.</p>
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
     * <p>The name of the ECS instances that are created using the scaling configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>instance****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>A collection of intelligent configuration information used to filter instance types that meet the requirements.</p>
     */
    @NameInMap("InstancePatternInfos")
    public java.util.List<CreateScalingConfigurationRequestInstancePatternInfos> instancePatternInfos;

    /**
     * <p>The instance type of the ECS instance. For more information, see Instance families.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g6.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>After you enable the candidate mode, if issues such as insufficient inventory occur, the system supplements the currently selected instance types with similar-sized alternatives or creates vSwitches in candidate zones and adds them to the scaling group.</p>
     */
    @NameInMap("InstanceTypeCandidateOptions")
    public CreateScalingConfigurationRequestInstanceTypeCandidateOptions instanceTypeCandidateOptions;

    /**
     * <p>Information about the specified instance types.</p>
     */
    @NameInMap("InstanceTypeOverrides")
    public java.util.List<CreateScalingConfigurationRequestInstanceTypeOverrides> instanceTypeOverrides;

    /**
     * <p>Multiple instance types. If you use InstanceTypes, InstanceType is ignored.</p>
     * <p>If an instance cannot be created from an instance type with a higher priority, Auto Scaling automatically tries the next instance type in the list.</p>
     */
    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    /**
     * <p>The billing method for network usage. Valid values:</p>
     * <ul>
     * <li><p>PayByBandwidth: pay-by-bandwidth. InternetMaxBandwidthOut specifies the fixed bandwidth.</p>
     * </li>
     * <li><p>PayByTraffic: pay-by-data-transfer. InternetMaxBandwidthOut specifies the maximum bandwidth. You are charged for the actual data transfer.</p>
     * </li>
     * </ul>
     * <p>If you do not specify this parameter, the default value is PayByBandwidth for classic network and PayByTraffic for VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>PayByTraffic</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The maximum inbound public bandwidth. Unit: Mbit/s. Valid values:</p>
     * <ul>
     * <li><p>If the purchased outbound public bandwidth is less than or equal to 10 Mbit/s: 1 to 10. Default value: 10.</p>
     * </li>
     * <li><p>If the purchased outbound public bandwidth is greater than 10 Mbit/s: 1 to the value of <code>InternetMaxBandwidthOut</code>. Default value: the value of <code>InternetMaxBandwidthOut</code>.</p>
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
     * <p>none: The instance is not I/O optimized.
     * optimized: The instance is I/O optimized.</p>
     * <p>For retired instance types, the default value is none. For other instance types, the default value is optimized.</p>
     * 
     * <strong>example:</strong>
     * <p>optimized</p>
     */
    @NameInMap("IoOptimized")
    public String ioOptimized;

    /**
     * <p>The number of randomly generated IPv6 addresses to assign to the ENI.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    /**
     * <p>The name of the key pair to use to log on to the ECS instance.</p>
     * <ul>
     * <li><p>For Windows instances, this parameter is ignored. The default value is empty.</p>
     * </li>
     * <li><p>For Linux instances, password-based logon is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>KeyPairTest</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The weight of the ECS instance as a backend server of the load balancer. Valid values: 1 to 100.</p>
     * <p>Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("LoadBalancerWeight")
    public Integer loadBalancerWeight;

    /**
     * <p>The memory size. Unit: GiB.</p>
     * <p>You can specify both Cpu and Memory to define a range of instance types. For example, if you set Cpu to 2 and Memory to 16, all instance types with 2 vCPUs and 16 GiB of memory are selected. Auto Scaling determines the available instance types based on factors such as I/O optimization and zone, and then creates an instance of the instance type that has the lowest price.</p>
     * <blockquote>
     * <p>This configuration is effective only when the cost optimization policy is enabled for the scaling group and no instance types are specified in the scaling configuration.</p>
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
    public java.util.List<CreateScalingConfigurationRequestNetworkInterfaces> networkInterfaces;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The password of the ECS instance. The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters can be:</p>
     * <p>\<code>()</code> ~!@#$%^&amp;*-_+=\|{}[]:;\&quot;&lt;&gt;,.?/`</p>
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
     * <p>Specifies whether to use the password preset in the image. If you use this parameter, make sure that a password is preset in the image. Valid values:</p>
     * <ul>
     * <li><p>true: uses the preset password.</p>
     * </li>
     * <li><p>false: does not use the preset password.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    /**
     * <p>The name of the RAM role for the ECS instance. The name is provided and maintained by RAM. You can call the ListRoles operation to query the available RAM roles.</p>
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
     * <p>The resource pool policy to use when creating an instance. Note the following when you set this parameter:</p>
     * <ul>
     * <li><p>This parameter takes effect only when creating pay-as-you-go instances.</p>
     * </li>
     * <li><p>You cannot set this parameter at the same time as PrivatePoolOptions.MatchCriteria and PrivatePoolOptions.Id.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ResourcePoolOptions")
    public CreateScalingConfigurationRequestResourcePoolOptions resourcePoolOptions;

    /**
     * <p>The name of the scaling configuration. The name must be 2 to 64 characters in length, and can contain digits, underscores (_), hyphens (-), and periods (.). It must start with a digit, a letter, or a Chinese character.</p>
     * <p>The name of a scaling configuration must be unique within a scaling group in a region. If you do not specify this parameter, the ID of the scaling configuration is used.</p>
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
     * <p>Specifies whether to enable security hardening. Valid values:</p>
     * <ul>
     * <li><p>Active: enables security hardening. This setting is valid only for public images.</p>
     * </li>
     * <li><p>Deactive: disables security hardening. This setting is valid for all image types.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("SecurityEnhancementStrategy")
    public String securityEnhancementStrategy;

    /**
     * <p>The ID of the security group to which the ECS instance belongs. ECS instances in the same security group can communicate with each other.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-280ih****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>Adds the ECS instance to multiple security groups. For more information, see the Security groups section in <a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>.</p>
     * <blockquote>
     * <p>You cannot specify both SecurityGroupId and SecurityGroupIds.</p>
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
     * <p>The protection period of the preemptible instance. Unit: hours. Valid values:</p>
     * <ul>
     * <li><p>1: The instance is retained for 1 hour after it is created. After 1 hour, the system compares the bid price with the market price and checks the resource inventory to determine whether to retain or release the instance.</p>
     * </li>
     * <li><p>0: The instance is not guaranteed to be retained for 1 hour after it is created. The system compares the bid price with the market price and checks the resource inventory to determine whether to retain or release the instance.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Alibaba Cloud sends a notification to you through an ECS system event 5 minutes before the instance is released. Preemptible instances are billed by the second. We recommend that you select a protection period based on the time required for your task to complete.</p>
     * </blockquote>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SpotDuration")
    public Integer spotDuration;

    /**
     * <p>The interruption mode of the preemptible instance. Currently, only terminate is supported, which releases the instance by default.</p>
     * 
     * <strong>example:</strong>
     * <p>Terminate</p>
     */
    @NameInMap("SpotInterruptionBehavior")
    public String spotInterruptionBehavior;

    /**
     * <p>A collection of billing information for preemptible instances.</p>
     */
    @NameInMap("SpotPriceLimits")
    public java.util.List<CreateScalingConfigurationRequestSpotPriceLimits> spotPriceLimits;

    /**
     * <p>The preemption policy for pay-as-you-go instances. Valid values:</p>
     * <ul>
     * <li><p>NoSpot: The instance is a regular pay-as-you-go instance.</p>
     * </li>
     * <li><p>SpotWithPriceLimit: The instance is a preemptible instance with a user-defined maximum hourly price.</p>
     * </li>
     * <li><p>SpotAsPriceGo: The instance is a preemptible instance for which the price is automatically bid based on the current market price.</p>
     * </li>
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
     * <p>The maximum number of partitions in the storage set. The value must be greater than or equal to 2.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("StorageSetPartitionNumber")
    public Integer storageSetPartitionNumber;

    /**
     * <p>Multiple disk categories for the system disk. When a disk of a higher-priority category is unavailable, Auto Scaling automatically tries the next lower-priority category to create the system disk. Valid values:</p>
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
     * <p>If you specify this parameter, you cannot specify <code>SystemDisk.Category</code>.</p>
     * </blockquote>
     */
    @NameInMap("SystemDiskCategories")
    public java.util.List<String> systemDiskCategories;

    /**
     * <p>The tags of the ECS instance. You can specify up to 20 tags in key-value pairs. The following limits apply to keys and values:</p>
     * <ul>
     * <li><p>A key can be up to 64 characters in length and cannot start with aliyun or acs:. It cannot contain <code>http://</code> or <code>https://</code>. If you use tags, the key cannot be an empty string.</p>
     * </li>
     * <li><p>A value can be up to 128 characters in length and cannot start with aliyun or acs:. It cannot contain <code>http://</code> or <code>https://</code>. The value can be an empty string.</p>
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
     * <p>The custom data of the ECS instance. The data must be Base64 encoded. The raw data can be up to 32 KB in size.</p>
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
         * <p>Specifies whether to use the ecs-user user to log on to the ECS instance. For more information, see <a href="https://help.aliyun.com/document_detail/388447.html">Manage logon usernames of ECS instances</a>. Valid values:</p>
         * <ul>
         * <li><p>true: Yes.</p>
         * </li>
         * <li><p>false: No.</p>
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
         * <p>The ID of the private pool. This is the ID of the Elastic Assurance or Capacity Reservation service.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-bp67acfmxazb4****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The private pool capacity option for instance startup. After an Elastic Assurance or a Capacity Reservation service takes effect, a private pool is generated. You can select a private pool to start an instance. Valid values:</p>
         * <ul>
         * <li><p>Open: open mode. The system automatically matches the instance with an open private pool. If no eligible private pool is found, the instance is started using public pool resources. You do not need to set the PrivatePoolOptions.Id parameter in this mode.</p>
         * </li>
         * <li><p>Target: specified mode. The instance is started using the capacity of a specified private pool. If the specified private pool is unavailable, the instance fails to start. You must set the PrivatePoolOptions.Id parameter in this mode.</p>
         * </li>
         * <li><p>None: no private pool is used. The instance is started without using a private pool.</p>
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
         * <p>The ID of the automatic snapshot policy to apply to the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp12m37ccmxvbmi5****</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>Specifies whether to enable the performance burst feature for the system disk. Valid values:</p>
         * <ul>
         * <li><p>true: enables the feature.</p>
         * </li>
         * <li><p>false: disables the feature.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>You can set this parameter only when <code>SystemDisk.Category</code> is set to <code>cloud_auto</code>.</p>
         * </blockquote>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
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
         * <li><p>ephemeral_ssd: local SSD.</p>
         * </li>
         * <li><p>cloud_essd: ESSD.</p>
         * </li>
         * <li><p>cloud_auto: ESSD AutoPL disk.</p>
         * </li>
         * </ul>
         * <p>You cannot specify this parameter and <code>SystemDiskCategories</code> at the same time. If you do not specify this parameter or <code>SystemDiskCategories</code>, the default value of this parameter is used:</p>
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
         * <p>The description of the system disk. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Test system disk.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the system disk. The name must be 2 to 128 characters in length. It must start with a letter or a Chinese character and cannot start with <code>http://</code> or <code>https://</code>. It can contain digits, colons (:), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssdSystem</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>The encryption algorithm for the system disk. Valid values:</p>
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
         * <li><p>true: encrypts the disk.</p>
         * </li>
         * <li><p>false: does not encrypt the disk.</p>
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
         * <p>The ID of the KMS key to use for the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The performance level of the ESSD that is used as the system disk. Valid values:</p>
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
         * <p>The provisioned IOPS of the system disk.</p>
         * <blockquote>
         * <p>IOPS (input/output operations per second) indicates the number of I/O operations that a block storage device can process per second. It represents the read and write capabilities of the device.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        /**
         * <p>The size of the system disk. Unit: GiB. Valid values:</p>
         * <ul>
         * <li><p>Basic disk: 20 to 500.</p>
         * </li>
         * <li><p>ESSD:</p>
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
         * <li><p>ESSD AutoPL disk: 1 to 2048.</p>
         * </li>
         * <li><p>Other disk categories: 20 to 2048.</p>
         * </li>
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
         * <p>Notice: </p>
         * </blockquote>
         * <p>Must be included in the list of instance types in the scaling configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The ID of the vSwitch.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>Must be included in the list of vSwitches in the scaling group.</p>
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
         * <p>The ID of the automatic snapshot policy to apply to the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp19nq9enxqkomib****</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>Specifies whether to enable performance burst for the system disk. Valid values:</p>
         * <ul>
         * <li><p>true: Enables performance burst.</p>
         * </li>
         * <li><p>false: Disables performance burst.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available only when <code>SystemDisk.Category</code> is set to <code>cloud_auto</code>.</p>
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
         * <p>Multiple disk categories for the data disk. When a disk of a higher-priority category is unavailable, Auto Scaling automatically tries the next lower-priority category. Valid values:</p>
         * <ul>
         * <li><p>cloud: basic disk. The DeleteWithInstance attribute of a basic disk created with an instance is true.</p>
         * </li>
         * <li><p>cloud_efficiency: ultra disk.</p>
         * </li>
         * <li><p>cloud_ssd: standard SSD.</p>
         * </li>
         * <li><p>cloud_essd: ESSD.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If you specify this parameter, you cannot specify <code>DataDisks.Category</code>.</p>
         * </blockquote>
         */
        @NameInMap("Categories")
        public java.util.List<String> categories;

        /**
         * <p>The category of the data disk. Valid values:</p>
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
         * <li><p>cloud_auto: ESSD AutoPL disk.</p>
         * </li>
         * </ul>
         * <p>You cannot specify this parameter and DataDisk.Categories at the same time. If you do not specify this parameter or DataDisk.Categories, the default value of this parameter is used:</p>
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
         * <p>Specifies whether to release the data disk when the instance is released. Valid values:</p>
         * <ul>
         * <li><p>true: releases the disk when the instance is released.</p>
         * </li>
         * <li><p>false: retains the disk when the instance is released.</p>
         * </li>
         * </ul>
         * <p>This parameter can be set only for separately purchased cloud disks (DataDisks.Category is cloud, cloud_efficiency, cloud_ssd, or cloud_essd). Otherwise, an error occurs.</p>
         * <p>Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        /**
         * <p>The description of the data disk. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Test data disk.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The mount point of the data disk. If you do not specify this parameter, the system automatically assigns a mount point when creating the ECS instance, starting from /dev/xvdb and ending at /dev/xvdz.</p>
         * 
         * <strong>example:</strong>
         * <p>/dev/xvdb</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The name of the data disk. The name must be 2 to 128 characters in length. It must start with a letter or a Chinese character and cannot start with <code>http://</code> or <code>https://</code>. It can contain digits, colons (:), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssdData</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>Specifies whether to encrypt the data disk. Valid values:</p>
         * <ul>
         * <li><p>true: encrypts the disk.</p>
         * </li>
         * <li><p>false: does not encrypt the disk.</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
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
         * <li><p>PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</p>
         * </li>
         * <li><p>PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</p>
         * </li>
         * <li><p>PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</p>
         * </li>
         * <li><p>PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>For information about how to select an ESSD performance level, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The provisioned IOPS of the data disk.</p>
         * <blockquote>
         * <p>IOPS (input/output operations per second) indicates the number of I/O operations that a block storage device can process per second. It represents the read and write capabilities of the device.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        /**
         * <p>The size of the data disk. Unit: GiB. Valid values:</p>
         * <ul>
         * <li><p>cloud: 5 to 2000.</p>
         * </li>
         * <li><p>cloud_efficiency: 20 to 32768.</p>
         * </li>
         * <li><p>cloud_essd: 20 to 32768.</p>
         * </li>
         * <li><p>ephemeral_ssd: 5 to 800.</p>
         * </li>
         * </ul>
         * <p>If you specify this parameter, the disk size must be greater than or equal to the snapshot size specified by SnapshotId.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The snapshot to use to create the data disk. If you specify this parameter, DataDisks.Size is ignored. The size of the created disk is the size of the specified snapshot.</p>
         * <p>If the snapshot was created on or before July 15, 2013, the call is rejected and an InvalidSnapshot.TooOld error is returned.</p>
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
         * <li><p>X86: X86 compute.</p>
         * </li>
         * <li><p>Heterogeneous: heterogeneous computing, such as GPU or FPGA.</p>
         * </li>
         * <li><p>BareMental: ECS Bare Metal Instance.</p>
         * </li>
         * <li><p>Arm: Arm compute.</p>
         * </li>
         * </ul>
         * <p>Default value: all architecture types are included.</p>
         */
        @NameInMap("Architectures")
        public java.util.List<String> architectures;

        /**
         * <p>Specifies whether to include burstable instance types. Valid values:</p>
         * <ul>
         * <li><p>Exclude: does not include burstable instance types.</p>
         * </li>
         * <li><p>Include: includes burstable instance types.</p>
         * </li>
         * <li><p>Required: includes only burstable instance types.</p>
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
         * <p>In intelligent configuration mode, the number of vCPU cores of the instance type. This is used to filter instance types that meet the requirements. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
         * <p>Note the following:</p>
         * <ul>
         * <li><p>The InstancePatternInfos parameter applies only when the network type of the scaling group is VPC.</p>
         * </li>
         * <li><p>When using InstancePatternInfos, you must specify both InstancePatternInfos.Cores and InstancePatternInfos.Memory.</p>
         * </li>
         * <li><p>If you have already specified instance types using the InstanceType or InstanceTypes parameter, Auto Scaling prioritizes the specified instance types for scale-outs. If the specified instance types are out of stock, Auto Scaling uses the instance type with the lowest price from the instance types that match the InstancePatternInfos parameter.</p>
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
         * <p>You can specify multiple CPU architectures. N is an integer from 1 to 2.</p>
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
         * <p>The instance types to exclude. You can use a wildcard character (\*) to exclude a single instance type or an entire instance family. For example:</p>
         * <ul>
         * <li><p>ecs.c6.large: excludes the ecs.c6.large instance type.</p>
         * </li>
         * <li><p>ecs.c6.\*: excludes all instance types in the c6 family.</p>
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
         * <p>The category of the instance. Valid values:</p>
         * <blockquote>
         * <p>You can specify multiple instance categories. N is an integer from 1 to 10.</p>
         * </blockquote>
         * <ul>
         * <li><p>General-purpose: General-purpose.</p>
         * </li>
         * <li><p>Compute-optimized: compute-optimized.</p>
         * </li>
         * <li><p>Memory-optimized: memory-optimized.</p>
         * </li>
         * <li><p>Big data: big data.</p>
         * </li>
         * <li><p>Local SSDs : local SSDs.</p>
         * </li>
         * <li><p>High Clock Speed : high frequency.</p>
         * </li>
         * <li><p>Enhanced : enhanced instance families.</p>
         * </li>
         * <li><p>Shared: shared-resource instances.</p>
         * </li>
         * <li><p>Compute-optimized with GPU : GPU compute-optimized.</p>
         * </li>
         * <li><p>Visual Compute-optimized : visual compute-optimized.</p>
         * </li>
         * <li><p>Heterogeneous Service : heterogeneous service.</p>
         * </li>
         * <li><p>Compute-optimized with FPGA : FPGA compute-optimized.</p>
         * </li>
         * <li><p>Compute-optimized with NPU : NPU compute-optimized.</p>
         * </li>
         * <li><p>ECS Bare Metal : ECS Bare Metal Instance.</p>
         * </li>
         * <li><p>High Performance Compute: high-performance computing.</p>
         * </li>
         * </ul>
         */
        @NameInMap("InstanceCategories")
        public java.util.List<String> instanceCategories;

        /**
         * <p>The level of the instance family, used to filter instance types that meet the requirements. This parameter takes effect when <code>CostOptimization</code> is enabled. Valid values:</p>
         * <ul>
         * <li><p>EntryLevel: entry-level, which refers to shared-resource instances. This level offers lower costs but cannot guarantee stable computing performance. It is suitable for business scenarios with low CPU utilization. For more information, see <a href="https://help.aliyun.com/document_detail/108489.html">Shared-resource instances</a>.</p>
         * </li>
         * <li><p>EnterpriseLevel: enterprise-level. This level provides stable performance and dedicated resources, suitable for business scenarios that require high stability. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
         * </li>
         * <li><p>CreditEntryLevel: credit entry-level, which refers to burstable instances. This level uses CPU credits to ensure computing performance and is suitable for business scenarios with low CPU utilization and occasional CPU bursts. For more information, see <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EnterpriseLevel</p>
         */
        @NameInMap("InstanceFamilyLevel")
        public String instanceFamilyLevel;

        /**
         * <p>The instance families to query. You can specify multiple instance families. N is an integer from 1 to 10.</p>
         */
        @NameInMap("InstanceTypeFamilies")
        public java.util.List<String> instanceTypeFamilies;

        /**
         * <p>In intelligent configuration mode, the maximum hourly price you are willing to pay for a pay-as-you-go or preemptible instance. This is used to filter instance types that meet the requirements.</p>
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
         * <p>The maximum number of vCPU cores for the instance type.</p>
         * <blockquote>
         * <p>MaximumCpuCoreCount cannot be more than four times the value of MinimumCpuCoreCount.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("MaximumCpuCoreCount")
        public Integer maximumCpuCoreCount;

        /**
         * <p>The maximum number of GPUs for the instance. The value must be a positive integer.</p>
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
         * <p>In intelligent configuration mode, the memory size of the instance type. Unit: GiB. This is used to filter instance types that meet the requirements.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The minimum baseline vCPU performance (the sum of all vCPUs) for burstable instances of the t5 or t6 family.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("MinimumBaselineCredit")
        public Integer minimumBaselineCredit;

        /**
         * <p>The minimum number of vCPU cores for the instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MinimumCpuCoreCount")
        public Integer minimumCpuCoreCount;

        /**
         * <p>The minimum number of IPv6 addresses that can be assigned to a single ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinimumEniIpv6AddressQuantity")
        public Integer minimumEniIpv6AddressQuantity;

        /**
         * <p>The minimum number of private IPv4 addresses to assign to a single elastic network interface (ENI) of an instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MinimumEniPrivateIpAddressQuantity")
        public Integer minimumEniPrivateIpAddressQuantity;

        /**
         * <p>The minimum number of elastic network interfaces (ENIs) that can be attached to an instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MinimumEniQuantity")
        public Integer minimumEniQuantity;

        /**
         * <p>The minimum number of GPUs for the instance. The value must be a positive integer.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MinimumGpuAmount")
        public Integer minimumGpuAmount;

        /**
         * <p>The minimum initial vCPU credit for burstable instances of the t5 or t6 family.</p>
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
         * <p>The processor model of the instance. You can specify multiple processor models. N is an integer from 1 to 10.</p>
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
         * <p>When supplementing with vSwitches from other zones is allowed, you must specify the CIDR blocks for the candidate vSwitches.</p>
         */
        @NameInMap("AllowCidrBlocks")
        public java.util.List<String> allowCidrBlocks;

        /**
         * <p>Specifies whether to allow supplementing with vSwitches from other zones.</p>
         * <blockquote>
         * <p>The instance type remains unchanged; only new zones are considered as candidates. When a scaling group cannot scale out in any of the selected zones due to issues like insufficient inventory, this configuration allows ESS to automatically add a vSwitch from a new zone to the scaling group.
         * For example, if a scaling group is configured for zones cn-hangzhou-h and cn-hangzhou-g, and neither can be scaled out, ESS might create and add a vSwitch in cn-hangzhou-k based on real-time inventory.</p>
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
         * <li>For example, if the current instance type is ecs.c7.large, enabling this allows ecs.c6.large and ecs.c8.large as candidate types.</li>
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
         * <p>If you want the scaling group to scale based on the capacity of instance types, specify both this parameter and WeightedCapacity.</p>
         * <p>This parameter specifies the instance type and overwrites the instance type in the launch template. You can specify this parameter up to 20 times. N is an integer from 1 to 20.</p>
         * <blockquote>
         * <p>This parameter takes effect only when a launch template is specified by the LaunchTemplateId parameter.</p>
         * </blockquote>
         * <p>Valid values for InstanceType: available ECS instance types.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c5.xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>To specify the capacity of an instance type in the scaling configuration, specify this parameter after you specify InstanceTypeOverrides.InstanceType.</p>
         * <p>This parameter specifies the weight of the instance type. The weight indicates the capacity of a single instance of the specified instance type in the scaling group. A higher weight means that fewer instances of that type are needed to meet the desired capacity.</p>
         * <p>You can configure different weights for different instance types based on their performance metrics, such as the number of vCPUs and memory size.</p>
         * <p>For example:</p>
         * <ul>
         * <li><p>Current capacity: 0.</p>
         * </li>
         * <li><p>Expected capacity: 6.</p>
         * </li>
         * <li><p>Capacity of ecs.c5.xlarge: 4.</p>
         * </li>
         * </ul>
         * <p>To meet the expected capacity, the scaling group will scale out two ecs.c5.xlarge instances.</p>
         * <blockquote>
         * <p>During a scale-out, the capacity of the scaling group cannot exceed the sum of MaxSize and the maximum weight of the instance type.</p>
         * </blockquote>
         * <p>Valid values for WeightedCapacity: 1 to 500.</p>
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
         * <p>The type of ENI. When using this parameter, you must use NetworkInterfaces to set the primary NIC and cannot set the SecurityGroupId or SecurityGroupIds parameters. Valid values:</p>
         * <ul>
         * <li><p>Primary: primary NIC.</p>
         * </li>
         * <li><p>Secondary: secondary NIC.</p>
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
         * <p>The number of randomly generated IPv6 addresses to assign to the primary NIC.
         * Note:</p>
         * <ul>
         * <li><p>This parameter takes effect only when NetworkInterface.InstanceType is set to Primary. If NetworkInterface.InstanceType is set to Secondary or is empty, you cannot set this parameter.</p>
         * </li>
         * <li><p>If you set this parameter, you cannot set Ipv6AddressCount.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Ipv6AddressCount")
        public Integer ipv6AddressCount;

        /**
         * <p>The communication mode of the NIC. Valid values:</p>
         * <ul>
         * <li><p>Standard: uses TCP communication mode.</p>
         * </li>
         * <li><p>HighPerformance: enables the Elastic RDMA Interface (ERI) and uses RDMA communication mode.</p>
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
         * <li><p>The value cannot exceed the IP address limit for the instance type. For more information, see <a href="https://help.aliyun.com/en/ecs/user-guide/overview-of-instance-families">Instance families</a>.</p>
         * </li>
         * <li><p>NetworkInterface.N.SecondaryPrivateIpAddressCount is used to assign a number of secondary private IPv4 addresses to the NIC (excluding the primary private IP address). The system randomly assigns these addresses from the available CIDR block of the vSwitch (NetworkInterface.N.VSwitchId) where the NIC is located.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("SecondaryPrivateIpAddressCount")
        public Integer secondaryPrivateIpAddressCount;

        /**
         * <p>One or more security group IDs to which the ENI belongs.</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

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
         * <p>The ID of the private pool. This is the ID of the Elastic Assurance or Capacity Reservation service. This parameter can only accept Target mode private pool IDs and cannot be specified at the same time as the PrivatePoolTags parameter.</p>
         */
        @NameInMap("PrivatePoolIds")
        public java.util.List<String> privatePoolIds;

        /**
         * <p>Filter available Target private pools by tags. N is an integer from 1 to 20.
         * Note:</p>
         * <ul>
         * <li><p>When this parameter is configured, the system only selects from the associated Target private pools under the account that have matching tags and also meet the scaling group constraints (such as zone, instance type, etc.).</p>
         * </li>
         * <li><p>Tag matching rule: The private pool must match all specified tags.</p>
         * </li>
         * <li><p>This parameter cannot be specified at the same time as the PrivatePoolIds parameter.</p>
         * </li>
         * </ul>
         */
        @NameInMap("PrivatePoolTags")
        public java.util.List<CreateScalingConfigurationRequestResourcePoolOptionsPrivatePoolTags> privatePoolTags;

        /**
         * <p>The resource pool, which includes private pools generated after an Elastic Assurance or Capacity Reservation service takes effect, and the public pool, can be selected for instance startup. Valid values:</p>
         * <ul>
         * <li><p>PrivatePoolFirst: Private pool first. When this policy is selected, if you specify ResourcePoolOptions.PrivatePoolIds or meet the PrivatePoolTags conditions, the corresponding private pool is used first. If no private pool is specified or the specified private pool has insufficient capacity, the system automatically matches an open-type private pool. If no eligible private pool is found, the instance is created using the public pool.</p>
         * </li>
         * <li><p>PrivatePoolOnly: Private pool only. When this policy is selected, you must specify ResourcePoolOptions.PrivatePoolIds. If the specified private pool has insufficient capacity, the instance fails to start.</p>
         * </li>
         * <li><p>PublicPoolFirst: Public pool resources first. The system prioritizes creating the instance using the public pool. When public pool resources are insufficient, private pool resources are used as a supplement. The system first automatically matches an open-type private pool. If no eligible private pool is found, it uses a Target-type private pool that is specified by ResourcePoolOptions.PrivatePoolIds or meets the PrivatePoolTags conditions. (This policy is in invitational preview and is not yet available for use.)</p>
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
         * <p>The confidential computing mode. Possible values:</p>
         * <ul>
         * <li><p>Enclave: The ECS instance uses an Enclave to build a confidential computing environment. For more information, see <a href="https://help.aliyun.com/document_detail/203433.html">Build a confidential computing environment using an Enclave</a>.</p>
         * </li>
         * <li><p>TDX: Builds a TDX confidential computing environment. For more information, see <a href="https://help.aliyun.com/document_detail/479090.html">Build a TDX confidential computing environment</a>.</p>
         * </li>
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
         * <p>The instance type of the preemptible instance. This parameter takes effect when SpotStrategy is set to SpotWithPriceLimit.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The bid price for the preemptible instance. This parameter takes effect when SpotStrategy is set to SpotWithPriceLimit.</p>
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
