// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ModifyScalingConfigurationRequest extends TeaModel {
    @NameInMap("ImageOptions")
    public ModifyScalingConfigurationRequestImageOptions imageOptions;

    @NameInMap("PrivatePoolOptions")
    public ModifyScalingConfigurationRequestPrivatePoolOptions privatePoolOptions;

    @NameInMap("SystemDisk")
    public ModifyScalingConfigurationRequestSystemDisk systemDisk;

    /**
     * <p>Specifies whether to associate the instance on a dedicated host with the dedicated host. Valid values:</p>
     * <ul>
     * <li>default: does not associate the instance on the dedicated host with the dedicated host. If you restart an instance that was stopped in Economical Mode and the original dedicated host of the instance has insufficient resources, the instance is automatically deployed to another dedicated host in the automatic deployment resource pool.</li>
     * <li>host: associates the instance on a dedicated host with the dedicated host. If you restart an instance that was stopped in Economical Mode, the instance remains on the original dedicated host. If the original dedicated host has insufficient resources, the instance cannot be started.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Affinity")
    public String affinity;

    /**
     * <p>The number of vCPUs.</p>
     * <p>You can specify the number of vCPUs and the memory size to determine the range of instance types. For example, you can set Cpu to 2 and Memory to 16 to specify instance types that have 2 vCPUs and 16 GiB of memory. If you specify Cpu and Memory, Auto Scaling determines the available instance types based on factors such as I/O optimization requirements and zones. Then, Auto Scaling preferentially creates instances by using the lowest-priced instance type.</p>
     * <blockquote>
     * <p>You can specify CPU and Memory to determine the range of instance types only if you set Scaling Policy to Cost Optimization Policy and you do not specify an instance type in the scaling configuration.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Cpu")
    public Integer cpu;

    /**
     * <p>The performance mode of burstable instances. Valid values:</p>
     * <ul>
     * <li>Standard: the standard mode. For more information, see the &quot;Standard mode&quot; section in the <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a> topic.</li>
     * <li>Unlimited: the unlimited mode. For more information, see the &quot;Unlimited mode&quot; section in the <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a> topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("CreditSpecification")
    public String creditSpecification;

    /**
     * <p>The priority of the custom &quot;ECS instance type + vSwitch&quot; combination.</p>
     * <blockquote>
     * <p> This setting is valid only if the scaling policy of the scaling group is a priority policy.</p>
     * </blockquote>
     * <p>If Auto Scaling cannot create ECS instances by using the custom &quot;ECS instance type + vSwitch&quot; combination of the highest priority, Auto Scaling creates ECS instances by using the custom &quot;ECS instance type + vSwitch&quot; combination of the next highest priority.</p>
     * <blockquote>
     * <p> If you specify the priorities of only a part of custom &quot;ECS instance type + vSwitch&quot; combinations, Auto Scaling preferentially creates ECS instances by using the custom combinations that have the specified priorities. If the custom combinations that have the specified priorities do not provide sufficient resources, Auto Scaling creates ECS instances by using the custom combinations that do not have the specified priorities based on the specified orders of vSwitches and instance types.</p>
     * </blockquote>
     * <ul>
     * <li>Example: The specified order of vSwitches for your scaling group is vsw1 and vsw2, and the specified order of instance types in your scaling configuration is type1 and type 2. In addition, you use CustomPriorities to specify [&quot;vsw2+type2&quot;, &quot;vsw1+type2&quot;]. In this example, the vsw2+type2 combination has the highest priority and the vsw2+type1 combination has the lowest priority. The vsw1+type2 combination has a higher priority than the vsw1+type1 combination.</li>
     * </ul>
     */
    @NameInMap("CustomPriorities")
    public java.util.List<ModifyScalingConfigurationRequestCustomPriorities> customPriorities;

    /**
     * <p>The data disks.</p>
     */
    @NameInMap("DataDisks")
    public java.util.List<ModifyScalingConfigurationRequestDataDisks> dataDisks;

    /**
     * <p>The ID of the dedicated host cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>dc-zm04u8r3lohsq****</p>
     */
    @NameInMap("DedicatedHostClusterId")
    public String dedicatedHostClusterId;

    /**
     * <p>The ID of the dedicated host on which you want to create ECS instances. You cannot create preemptible instances on dedicated hosts. If you specify DedicatedHostId, SpotStrategy and SpotPriceLimit are ignored.</p>
     * <p>You can call the DescribeDedicatedHosts operation to query the most recent list of dedicated host IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>dh-bp67acfmxazb4p****</p>
     */
    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    /**
     * <p>Specifies whether to enable the Release Protection feature for ECS instances. If you enable this feature, you cannot directly release the ECS instances in the ECS console or by calling the DeleteInstance operation. Valid values:</p>
     * <ul>
     * <li>true: enables the Release Protection feature. In this case, you cannot directly release the ECS instances in the ECS console or by calling the DeleteInstance operation.</li>
     * <li>false: disables the Release Protection feature. In this case, you can directly release the ECS instances in the ECS console or by calling the DeleteInstance operation.</li>
     * </ul>
     * <blockquote>
     * <p> You can enable the Release Protection feature only for pay-as-you-go instances to prevent accidental instance deletion. The Release Protection feature does not affect normal scaling activities. An instance that meets the criteria of scale-in policies can be removed from a scaling group during a scale-in event, regardless of whether you enabled the Release Protection feature for the instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>The ID of the deployment set of the ECS instances that are created by using the scaling configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-bp13v7bjnj9gis****</p>
     */
    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    /**
     * <p>The hostname of the ECS instance. The hostname cannot start or end with a period (.) or a hyphen (-). The hostname cannot contain consecutive periods (.) or hyphens (-). Naming conventions for different types of instances:</p>
     * <ul>
     * <li>Windows instances: The hostname must be 2 to 15 characters in length, and can contain letters, digits, and hyphens (-). The hostname cannot contain periods (.) or contain only digits.</li>
     * <li>Other instances, such as Linux instances: The hostname must be 2 to 64 characters in length. Separate a hostname into multiple segments with periods (.). Each segment can contain letters, digits, and hyphens (-).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hos****</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The ID of the Elastic High Performance Computing (E-HPC) cluster to which the ECS instances belong.</p>
     * 
     * <strong>example:</strong>
     * <p>hpc-clusterid</p>
     */
    @NameInMap("HpcClusterId")
    public String hpcClusterId;

    /**
     * <p>Specifies whether to enable the access channel for instance metadata. Valid values:</p>
     * <ul>
     * <li>enabled</li>
     * <li>disabled</li>
     * </ul>
     * <p>Default value: enabled.</p>
     * <blockquote>
     * <p> For information about instance metadata, see <a href="https://help.aliyun.com/document_detail/108460.html">Obtain instance metadata</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("HttpEndpoint")
    public String httpEndpoint;

    /**
     * <p>Specifies whether to forcibly use the security hardening mode (IMDSv2) to access instance metadata. Valid values:</p>
     * <ul>
     * <li>optional: does not forcibly use the security hardening mode (IMDSv2).</li>
     * <li>required: forcibly uses the security hardening mode (IMDSv2). If you set this parameter to required, you cannot access instance metadata in normal mode.</li>
     * </ul>
     * <p>Default value: optional.</p>
     * <blockquote>
     * <p> For more information about instance metadata access modes, see <a href="https://help.aliyun.com/document_detail/108460.html">Access modes of instance metadata</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>optional</p>
     */
    @NameInMap("HttpTokens")
    public String httpTokens;

    /**
     * <p>The name of the image family. If you specify this parameter, the latest custom images that are available in the specified image family are returned. Then, you can use the images to create instances. If you specify ImageId, you cannot specify ImageFamily.</p>
     * 
     * <strong>example:</strong>
     * <p>hangzhou-daily-update</p>
     */
    @NameInMap("ImageFamily")
    public String imageFamily;

    /**
     * <p>The ID of the image that is used by Auto Scaling to automatically create ECS instances.</p>
     * <blockquote>
     * <p>If the image that is specified in the scaling configuration contains system disks and data disks, the data that is stored in the data disks is cleared after you modify the image.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>centos6u5_64_20G_aliaegis_2014****.vhd</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The name of the image. Each image name must be unique in a region. If you specify ImageId, ImageName is ignored.</p>
     * <p>You cannot use ImageName to specify images from Alibaba Cloud Marketplace.</p>
     * 
     * <strong>example:</strong>
     * <p>suse11sp3_64_20G_aliaegis_2015****.vhd</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The description of the ECS instance. The description must be 2 to 256 characters in length. The description can contain letters but cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Test instance.</p>
     */
    @NameInMap("InstanceDescription")
    public String instanceDescription;

    /**
     * <p>The name of the Elastic Compute Service (ECS) instance that is automatically created by using the scaling configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>inst****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The intelligent configuration settings, which determine the available instance types.</p>
     */
    @NameInMap("InstancePatternInfos")
    public java.util.List<ModifyScalingConfigurationRequestInstancePatternInfos> instancePatternInfos;

    /**
     * <p>Details of the instance types.</p>
     */
    @NameInMap("InstanceTypeOverrides")
    public java.util.List<ModifyScalingConfigurationRequestInstanceTypeOverrides> instanceTypeOverrides;

    /**
     * <p>The instance types. If you specify InstanceTypes, InstanceType is ignored.</p>
     * <p>Auto Scaling creates instances based on a priority list of instance types. If it fails to create instances using the highest-priority type, it automatically moves to the next type in the priority order.</p>
     */
    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    /**
     * <p>The billing method for network usage. Valid values:</p>
     * <ul>
     * <li>PayByBandwidth: pay-by-bandwidth. You are charged for the bandwidth specified by InternetMaxBandwidthOut.</li>
     * <li>PayByTraffic: pay-by-traffic. You are charged for the actual traffic generated. InternetMaxBandwidthOut specifies only the maximum available bandwidth.</li>
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
     * <li>If the purchased outbound public bandwidth is less than or equal to 10 Mbit/s, the valid values of this parameter are 1 to 10. The default value is 10.</li>
     * <li>If the purchased outbound public bandwidth is greater than 10 Mbit/s, the valid values of this parameter are 1 to the value of <code>InternetMaxBandwidthOut</code>. The default value is the value of <code>InternetMaxBandwidthOut</code>.</li>
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
     * <p>50</p>
     */
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    /**
     * <p>Specifies whether to create I/O optimized instances from the scaling configuration. Valid values:</p>
     * <ul>
     * <li>none: creates non-I/O optimized instances from the scaling configuration.</li>
     * <li>optimized: creates I/O optimized instances from the scaling configuration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("IoOptimized")
    public String ioOptimized;

    /**
     * <p>The number of randomly generated IPv6 addresses that you want to allocate to the elastic network interface (ENI).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    /**
     * <p>The name of the key pair that you can use to log on to an ECS instance.</p>
     * <ul>
     * <li>Windows instances do not support this parameter.</li>
     * <li>By default, the username and password authentication method is disabled for Linux instances.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>KeyPair_Name</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The weight of an ECS instance as a backend server. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("LoadBalancerWeight")
    public Integer loadBalancerWeight;

    /**
     * <p>The memory size. Unit: GiB.</p>
     * <p>You can specify the number of vCPUs and the memory size to determine the range of instance types. For example, you can set Cpu to 2 and Memory to 16 to specify instance types that have 2 vCPUs and 16 GiB of memory. If you specify Cpu and Memory, Auto Scaling determines the available instance types based on factors such as I/O optimization requirements and zones. Then, Auto Scaling preferentially creates instances by using the lowest-priced instance type.</p>
     * <blockquote>
     * <p>You can specify CPU and Memory to determine the range of instance types only if you set Scaling Policy to Cost Optimization Policy and you do not specify an instance type in the scaling configuration.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("Memory")
    public Integer memory;

    /**
     * <p>The ENIs.</p>
     */
    @NameInMap("NetworkInterfaces")
    public java.util.List<ModifyScalingConfigurationRequestNetworkInterfaces> networkInterfaces;

    /**
     * <p>Specifies whether to overwrite existing data. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
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
     * <p>The password of the ECS instance. The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The following special characters are supported:</p>
     * <p>\`()~!@#$%^&amp;\*-_+=|{}[]:;\&quot;&lt;&gt;,.?/</p>
     * <p>The password of a Windows instance cannot start with a forward slash (/).</p>
     * <blockquote>
     * <p> We recommend that you use HTTPS to send requests if you specify Password to avoid password leakage.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123abc****</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>Specifies whether to use the password that is preconfigured in the image. Before you use this parameter, make sure that a password is configured in the image.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    /**
     * <p>The name of the RAM role that you want to attach to the ECS instance. The name is provided and maintained by Resource Access Management (RAM). You can call the ListRoles operation to query the available RAM roles. You can call the CreateRole operation to create RAM roles.</p>
     * 
     * <strong>example:</strong>
     * <p>RamRoleTest</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The ID of the resource group to which the ECS instances belong.</p>
     * 
     * <strong>example:</strong>
     * <p>abcd1234abcd****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The resource pools used for instance creation, which can be the public pool or a private pool associated with any active elasticity assurance or capacity reservation. When you specify this parameter, take note of the following items:</p>
     * <ul>
     * <li>This parameter takes effect only when you create pay-as-you-go instances.</li>
     * <li>If you specify this parameter, you cannot specify PrivatePoolOptions.MatchCriteria or PrivatePoolOptions.Id.</li>
     * </ul>
     */
    @NameInMap("ResourcePoolOptions")
    public ModifyScalingConfigurationRequestResourcePoolOptions resourcePoolOptions;

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
     * <p>The name of the scaling configuration. The name must be 2 to 64 characters in length, and can contain letters, digits, underscores (_), hyphens (-), and periods (.). The name must start with a letter or a digit.</p>
     * <p>The name of the scaling configuration must be unique in a region. If you do not specify this parameter, the scaling configuration ID is used.</p>
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
     * <p>[&quot;testManagedPrivateSpaceId****&quot;]</p>
     */
    @NameInMap("SchedulerOptions")
    public java.util.Map<String, ?> schedulerOptions;

    /**
     * <p>The ID of the security group with which ECS instances are associated. The ECS instances that are associated with the same security group can access each other.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-F876F****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The IDs of the security groups.</p>
     */
    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    @NameInMap("SecurityOptions")
    public ModifyScalingConfigurationRequestSecurityOptions securityOptions;

    /**
     * <p>The protection period of preemptible instances. Unit: hours. Valid values:</p>
     * <ul>
     * <li>1: After a preemptible instance is created, Alibaba Cloud ensures that the instance is not automatically released within 1 hour. After the 1-hour protection period ends, Alibaba Cloud compares the bidding price with the market price and checks the resource inventory to determine whether to release the instance.</li>
     * <li>0: After a preemptible instance is created, Alibaba Cloud does not ensure that the instance is not automatically released within 1 hour. Alibaba Cloud compares the biding price with the market price and checks the resource inventory to determine whether to release the instance.</li>
     * </ul>
     * <blockquote>
     * <p> Alibaba Cloud notifies you of ECS system events 5 minutes before an instance is released. Preemptible instances are billed by second. We recommend that you specify a protection period based on your business requirements.</p>
     * </blockquote>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SpotDuration")
    public Integer spotDuration;

    /**
     * <p>The interruption mode of the preemptible instance. Default value: Terminate. Set the value to Terminate. This value specifies that the preemptible instance is to be released.</p>
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
    public java.util.List<ModifyScalingConfigurationRequestSpotPriceLimits> spotPriceLimits;

    /**
     * <p>The preemption policy of pay-as-you-go instances. Valid values:</p>
     * <ul>
     * <li>NoSpot: The instances are created as regular pay-as-you-go instances.</li>
     * <li>SpotWithPriceLimit: The instances are preemptible instances that have a user-defined maximum hourly price.</li>
     * <li>SpotAsPriceGo: The instances are preemptible instances for which the market price at the time of purchase is automatically used as the bid price.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NoSpot</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <strong>example:</strong>
     * <p>ss-bp67acfmxazb4p****</p>
     */
    @NameInMap("StorageSetId")
    public String storageSetId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("StorageSetPartitionNumber")
    public Integer storageSetPartitionNumber;

    /**
     * <p>The categories of the system disks. If Auto Scaling cannot create disks by using the disk category of the highest priority, Auto Scaling creates disks by using the disk category of the next highest priority. Valid values:</p>
     * <ul>
     * <li>cloud: basic disk.</li>
     * <li>cloud_efficiency: ultra disk.</li>
     * <li>cloud_ssd: standard SSD.</li>
     * <li>cloud_essd: ESSD.</li>
     * </ul>
     * <blockquote>
     * <p> If you specify this parameter, you cannot specify <code>SystemDisk.Category</code>.</p>
     * </blockquote>
     */
    @NameInMap("SystemDiskCategories")
    public java.util.List<String> systemDiskCategories;

    /**
     * <p>The tags of the ECS instance. Specify the tags as key-value pairs. You can specify up to 20 tags. When you specify tag keys and tag values, take note of the following items:</p>
     * <ul>
     * <li>A tag key can be up to 64 characters in length. The key cannot start with <code>acs:</code> or <code>aliyun</code>, and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot be an empty string.</li>
     * <li>A tag value can be up to 128 characters in length. The value cannot start with <code>acs:</code> or <code>aliyun</code>, and cannot contain <code>http://</code> or <code>https://</code>. The tag value can be an empty string.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key1&quot;:&quot;value1&quot;,&quot;key2&quot;:&quot;value2&quot;, ... &quot;key5&quot;:&quot;value5&quot;}</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>Specifies whether to create ECS instances on dedicated hosts. Valid values:</p>
     * <ul>
     * <li>default: creates ECS instances on non-dedicated hosts.</li>
     * <li>host: creates ECS instances on dedicated hosts. If you do not specify DedicatedHostId, the system randomly selects a dedicated host for an ECS instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Tenancy")
    public String tenancy;

    /**
     * <p>The user data of the Elastic Compute Service (ECS) instance. The user data must be encoded in Base64 format. The size of raw data before Base64 encoding cannot exceed 32 KB.</p>
     * 
     * <strong>example:</strong>
     * <p>echo hello ecs!</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The zone ID of the ECS instances that are created by using the scaling configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-g</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static ModifyScalingConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyScalingConfigurationRequest self = new ModifyScalingConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public ModifyScalingConfigurationRequest setImageOptions(ModifyScalingConfigurationRequestImageOptions imageOptions) {
        this.imageOptions = imageOptions;
        return this;
    }
    public ModifyScalingConfigurationRequestImageOptions getImageOptions() {
        return this.imageOptions;
    }

    public ModifyScalingConfigurationRequest setPrivatePoolOptions(ModifyScalingConfigurationRequestPrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public ModifyScalingConfigurationRequestPrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public ModifyScalingConfigurationRequest setSystemDisk(ModifyScalingConfigurationRequestSystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public ModifyScalingConfigurationRequestSystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public ModifyScalingConfigurationRequest setAffinity(String affinity) {
        this.affinity = affinity;
        return this;
    }
    public String getAffinity() {
        return this.affinity;
    }

    public ModifyScalingConfigurationRequest setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public ModifyScalingConfigurationRequest setCreditSpecification(String creditSpecification) {
        this.creditSpecification = creditSpecification;
        return this;
    }
    public String getCreditSpecification() {
        return this.creditSpecification;
    }

    public ModifyScalingConfigurationRequest setCustomPriorities(java.util.List<ModifyScalingConfigurationRequestCustomPriorities> customPriorities) {
        this.customPriorities = customPriorities;
        return this;
    }
    public java.util.List<ModifyScalingConfigurationRequestCustomPriorities> getCustomPriorities() {
        return this.customPriorities;
    }

    public ModifyScalingConfigurationRequest setDataDisks(java.util.List<ModifyScalingConfigurationRequestDataDisks> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }
    public java.util.List<ModifyScalingConfigurationRequestDataDisks> getDataDisks() {
        return this.dataDisks;
    }

    public ModifyScalingConfigurationRequest setDedicatedHostClusterId(String dedicatedHostClusterId) {
        this.dedicatedHostClusterId = dedicatedHostClusterId;
        return this;
    }
    public String getDedicatedHostClusterId() {
        return this.dedicatedHostClusterId;
    }

    public ModifyScalingConfigurationRequest setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public ModifyScalingConfigurationRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public ModifyScalingConfigurationRequest setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    public ModifyScalingConfigurationRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public ModifyScalingConfigurationRequest setHpcClusterId(String hpcClusterId) {
        this.hpcClusterId = hpcClusterId;
        return this;
    }
    public String getHpcClusterId() {
        return this.hpcClusterId;
    }

    public ModifyScalingConfigurationRequest setHttpEndpoint(String httpEndpoint) {
        this.httpEndpoint = httpEndpoint;
        return this;
    }
    public String getHttpEndpoint() {
        return this.httpEndpoint;
    }

    public ModifyScalingConfigurationRequest setHttpTokens(String httpTokens) {
        this.httpTokens = httpTokens;
        return this;
    }
    public String getHttpTokens() {
        return this.httpTokens;
    }

    public ModifyScalingConfigurationRequest setImageFamily(String imageFamily) {
        this.imageFamily = imageFamily;
        return this;
    }
    public String getImageFamily() {
        return this.imageFamily;
    }

    public ModifyScalingConfigurationRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ModifyScalingConfigurationRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public ModifyScalingConfigurationRequest setInstanceDescription(String instanceDescription) {
        this.instanceDescription = instanceDescription;
        return this;
    }
    public String getInstanceDescription() {
        return this.instanceDescription;
    }

    public ModifyScalingConfigurationRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ModifyScalingConfigurationRequest setInstancePatternInfos(java.util.List<ModifyScalingConfigurationRequestInstancePatternInfos> instancePatternInfos) {
        this.instancePatternInfos = instancePatternInfos;
        return this;
    }
    public java.util.List<ModifyScalingConfigurationRequestInstancePatternInfos> getInstancePatternInfos() {
        return this.instancePatternInfos;
    }

    public ModifyScalingConfigurationRequest setInstanceTypeOverrides(java.util.List<ModifyScalingConfigurationRequestInstanceTypeOverrides> instanceTypeOverrides) {
        this.instanceTypeOverrides = instanceTypeOverrides;
        return this;
    }
    public java.util.List<ModifyScalingConfigurationRequestInstanceTypeOverrides> getInstanceTypeOverrides() {
        return this.instanceTypeOverrides;
    }

    public ModifyScalingConfigurationRequest setInstanceTypes(java.util.List<String> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public java.util.List<String> getInstanceTypes() {
        return this.instanceTypes;
    }

    public ModifyScalingConfigurationRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public ModifyScalingConfigurationRequest setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
        this.internetMaxBandwidthIn = internetMaxBandwidthIn;
        return this;
    }
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    public ModifyScalingConfigurationRequest setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public ModifyScalingConfigurationRequest setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public ModifyScalingConfigurationRequest setIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
        return this;
    }
    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    public ModifyScalingConfigurationRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public ModifyScalingConfigurationRequest setLoadBalancerWeight(Integer loadBalancerWeight) {
        this.loadBalancerWeight = loadBalancerWeight;
        return this;
    }
    public Integer getLoadBalancerWeight() {
        return this.loadBalancerWeight;
    }

    public ModifyScalingConfigurationRequest setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public ModifyScalingConfigurationRequest setNetworkInterfaces(java.util.List<ModifyScalingConfigurationRequestNetworkInterfaces> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
        return this;
    }
    public java.util.List<ModifyScalingConfigurationRequestNetworkInterfaces> getNetworkInterfaces() {
        return this.networkInterfaces;
    }

    public ModifyScalingConfigurationRequest setOverride(Boolean override) {
        this.override = override;
        return this;
    }
    public Boolean getOverride() {
        return this.override;
    }

    public ModifyScalingConfigurationRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyScalingConfigurationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyScalingConfigurationRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ModifyScalingConfigurationRequest setPasswordInherit(Boolean passwordInherit) {
        this.passwordInherit = passwordInherit;
        return this;
    }
    public Boolean getPasswordInherit() {
        return this.passwordInherit;
    }

    public ModifyScalingConfigurationRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public ModifyScalingConfigurationRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyScalingConfigurationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyScalingConfigurationRequest setResourcePoolOptions(ModifyScalingConfigurationRequestResourcePoolOptions resourcePoolOptions) {
        this.resourcePoolOptions = resourcePoolOptions;
        return this;
    }
    public ModifyScalingConfigurationRequestResourcePoolOptions getResourcePoolOptions() {
        return this.resourcePoolOptions;
    }

    public ModifyScalingConfigurationRequest setScalingConfigurationId(String scalingConfigurationId) {
        this.scalingConfigurationId = scalingConfigurationId;
        return this;
    }
    public String getScalingConfigurationId() {
        return this.scalingConfigurationId;
    }

    public ModifyScalingConfigurationRequest setScalingConfigurationName(String scalingConfigurationName) {
        this.scalingConfigurationName = scalingConfigurationName;
        return this;
    }
    public String getScalingConfigurationName() {
        return this.scalingConfigurationName;
    }

    public ModifyScalingConfigurationRequest setSchedulerOptions(java.util.Map<String, ?> schedulerOptions) {
        this.schedulerOptions = schedulerOptions;
        return this;
    }
    public java.util.Map<String, ?> getSchedulerOptions() {
        return this.schedulerOptions;
    }

    public ModifyScalingConfigurationRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public ModifyScalingConfigurationRequest setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public ModifyScalingConfigurationRequest setSecurityOptions(ModifyScalingConfigurationRequestSecurityOptions securityOptions) {
        this.securityOptions = securityOptions;
        return this;
    }
    public ModifyScalingConfigurationRequestSecurityOptions getSecurityOptions() {
        return this.securityOptions;
    }

    public ModifyScalingConfigurationRequest setSpotDuration(Integer spotDuration) {
        this.spotDuration = spotDuration;
        return this;
    }
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    public ModifyScalingConfigurationRequest setSpotInterruptionBehavior(String spotInterruptionBehavior) {
        this.spotInterruptionBehavior = spotInterruptionBehavior;
        return this;
    }
    public String getSpotInterruptionBehavior() {
        return this.spotInterruptionBehavior;
    }

    public ModifyScalingConfigurationRequest setSpotPriceLimits(java.util.List<ModifyScalingConfigurationRequestSpotPriceLimits> spotPriceLimits) {
        this.spotPriceLimits = spotPriceLimits;
        return this;
    }
    public java.util.List<ModifyScalingConfigurationRequestSpotPriceLimits> getSpotPriceLimits() {
        return this.spotPriceLimits;
    }

    public ModifyScalingConfigurationRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public ModifyScalingConfigurationRequest setStorageSetId(String storageSetId) {
        this.storageSetId = storageSetId;
        return this;
    }
    public String getStorageSetId() {
        return this.storageSetId;
    }

    public ModifyScalingConfigurationRequest setStorageSetPartitionNumber(Integer storageSetPartitionNumber) {
        this.storageSetPartitionNumber = storageSetPartitionNumber;
        return this;
    }
    public Integer getStorageSetPartitionNumber() {
        return this.storageSetPartitionNumber;
    }

    public ModifyScalingConfigurationRequest setSystemDiskCategories(java.util.List<String> systemDiskCategories) {
        this.systemDiskCategories = systemDiskCategories;
        return this;
    }
    public java.util.List<String> getSystemDiskCategories() {
        return this.systemDiskCategories;
    }

    public ModifyScalingConfigurationRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public ModifyScalingConfigurationRequest setTenancy(String tenancy) {
        this.tenancy = tenancy;
        return this;
    }
    public String getTenancy() {
        return this.tenancy;
    }

    public ModifyScalingConfigurationRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public ModifyScalingConfigurationRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class ModifyScalingConfigurationRequestImageOptions extends TeaModel {
        /**
         * <p>Specifies whether to use ecs-user to log on to an ECS instance created from the scaling configuration. For information about logon usernames, see <a href="https://help.aliyun.com/document_detail/388447.html">Manage the logon username of an instance</a>. Valid values:</p>
         * <p>true</p>
         * <p>false</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("LoginAsNonRoot")
        public Boolean loginAsNonRoot;

        public static ModifyScalingConfigurationRequestImageOptions build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationRequestImageOptions self = new ModifyScalingConfigurationRequestImageOptions();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationRequestImageOptions setLoginAsNonRoot(Boolean loginAsNonRoot) {
            this.loginAsNonRoot = loginAsNonRoot;
            return this;
        }
        public Boolean getLoginAsNonRoot() {
            return this.loginAsNonRoot;
        }

    }

    public static class ModifyScalingConfigurationRequestPrivatePoolOptions extends TeaModel {
        /**
         * <p>The ID of the private pool. The ID of a private pool is the same as the ID of the elasticity assurance or capacity reservation for which the private pool is generated.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-bp67acfmxazb4****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The type of the private pool that you want to use to start ECS instances. A private pool is generated when an elasticity assurance or a capacity reservation takes effect. You can specify a private pool for Auto Scaling to start ECS instances. Valid values:</p>
         * <ul>
         * <li>Open: open private pool. Auto Scaling selects a matching open private pool to start ECS instances. If no matching open private pools exist, the resources in the public pool are used. In this case, you do not need to specify PrivatePoolOptions.Id.</li>
         * <li>Target: specified private pool. Auto Scaling uses the resources in the specified private pool to start ECS instances. If the specified private pool does not exist, Auto Scaling cannot start ECS instances. If you set this parameter to Target, you must specify PrivatePoolOptions.Id.</li>
         * <li>None: no private pool. Auto Scaling does not use the resources of private pools to start ECS instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Open</p>
         */
        @NameInMap("MatchCriteria")
        public String matchCriteria;

        public static ModifyScalingConfigurationRequestPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationRequestPrivatePoolOptions self = new ModifyScalingConfigurationRequestPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationRequestPrivatePoolOptions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ModifyScalingConfigurationRequestPrivatePoolOptions setMatchCriteria(String matchCriteria) {
            this.matchCriteria = matchCriteria;
            return this;
        }
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

    }

    public static class ModifyScalingConfigurationRequestSystemDisk extends TeaModel {
        /**
         * <p>The ID of the automatic snapshot policy that you want to apply to the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp12m37ccmxvbmi5****</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>Specifies whether to enable the Burst feature for the system disk. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <blockquote>
         * <p> If you set <code>SystemDisk.Category</code> to <code>cloud_auto</code>, you can specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>The category of the system disk. Valid values:</p>
         * <ul>
         * <li>cloud: basic disk.</li>
         * <li>cloud_efficiency: ultra disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>cloud_essd: Enterprise SSD (ESSD).</li>
         * <li>ephemeral_ssd: local SSD.</li>
         * </ul>
         * <p>If you specify SystemDisk.Category, you cannot specify <code>SystemDiskCategories</code>. If you do not specify SystemDisk.Category or <code>SystemDiskCategories</code>, the default value of SystemDisk.Category is used. The default value for non-I/O optimized instances of Generation I instance families is cloud. The default value for other instances is cloud_efficiency.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The description of the system disk. The description must be 2 to 256 characters in length. The description can contain letters but cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Test system disk.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the system disk. The name must be 2 to 128 characters in length, and can contain letters, digits, colons (:), underscores (_), and hyphens (-). The name must start with a letter but cannot start with <code>http:// </code>or <code>https://</code>. </p>
         * <p>Default value: null.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssdSystem</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>The encryption algorithm of the system disk. Valid values:</p>
         * <ul>
         * <li>AES-256</li>
         * <li>SM4-128</li>
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
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public Boolean encrypted;

        /**
         * <p>The ID of the KMS key that you want to use to encrypt the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The performance level (PL) of the system disk that is an ESSD. Valid values:</p>
         * <ul>
         * <li>PL0: An ESSD can provide up to 10,000 random read/write IOPS.</li>
         * <li>PL1: An ESSD can provide up to 50,000 random read/write IOPS.</li>
         * <li>PL2: An ESSD can provide up to 100,000 random read/write IOPS.</li>
         * <li>PL3: An ESSD can provide up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <blockquote>
         * <p> For more information about how to select ESSD PLs, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The IOPS metric that is preconfigured for the system disk.</p>
         * <blockquote>
         * <p>IOPS measures the number of read and write operations that an EBS device can process per second.</p>
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
         * <li><p>ESSD: Valid values vary based on the performance level of the ESSD.</p>
         * <ul>
         * <li>PL0 ESSD: 1 to 2048.</li>
         * <li>PL1 ESSD: 20 to 2048.</li>
         * <li>PL2 ESSD: 461 to 2048.</li>
         * <li>PL3 ESSD: 1261 to 2048.</li>
         * </ul>
         * </li>
         * <li><p>ESSD AutoPL disk: 1 to 2048.</p>
         * </li>
         * <li><p>Other disk categories: 20 to 2048.</p>
         * </li>
         * </ul>
         * <p>The value of this parameter must be at least 1 and greater than or equal to the image size.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Size")
        public Integer size;

        public static ModifyScalingConfigurationRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationRequestSystemDisk self = new ModifyScalingConfigurationRequestSystemDisk();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationRequestSystemDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public ModifyScalingConfigurationRequestSystemDisk setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public ModifyScalingConfigurationRequestSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ModifyScalingConfigurationRequestSystemDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyScalingConfigurationRequestSystemDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public ModifyScalingConfigurationRequestSystemDisk setEncryptAlgorithm(String encryptAlgorithm) {
            this.encryptAlgorithm = encryptAlgorithm;
            return this;
        }
        public String getEncryptAlgorithm() {
            return this.encryptAlgorithm;
        }

        public ModifyScalingConfigurationRequestSystemDisk setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public ModifyScalingConfigurationRequestSystemDisk setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public ModifyScalingConfigurationRequestSystemDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public ModifyScalingConfigurationRequestSystemDisk setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public ModifyScalingConfigurationRequestSystemDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class ModifyScalingConfigurationRequestCustomPriorities extends TeaModel {
        /**
         * <p>The ECS instance type.</p>
         * <blockquote>
         * <p> The ECS instance type must be included in the instance types specified in the scaling configuration.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ecs.c6a.4xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The vSwitch ID.</p>
         * <blockquote>
         * <p> The vSwitch must be included in the vSwitch list of the scaling group.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp14zolna43z266bq****</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        public static ModifyScalingConfigurationRequestCustomPriorities build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationRequestCustomPriorities self = new ModifyScalingConfigurationRequestCustomPriorities();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationRequestCustomPriorities setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ModifyScalingConfigurationRequestCustomPriorities setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

    public static class ModifyScalingConfigurationRequestDataDisks extends TeaModel {
        /**
         * <p>The ID of the automatic snapshot policy that you want to apply to the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp19nq9enxqkomib****</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>Specifies whether to enable the Burst feature for the system disk. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <blockquote>
         * <p> If you set <code>SystemDisk.Category</code> to <code>cloud_auto</code>, you can specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>The categories of data disks. Valid values:</p>
         * <ul>
         * <li>cloud: basic disk. The DeleteWithInstance attribute of a basic disk created along with each ECS instance is set to true.</li>
         * <li>cloud_efficiency: ultra disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>cloud_essd: ESSD.</li>
         * </ul>
         * <blockquote>
         * <p> If you specify this parameter, you cannot specify <code>DataDisk.Category</code>.</p>
         * </blockquote>
         */
        @NameInMap("Categories")
        public java.util.List<String> categories;

        /**
         * <p>The category of the data disk. Valid values:</p>
         * <ul>
         * <li>cloud: basic disk. The DeleteWithInstance attribute of a basic disk created along with each ECS instance is set to true.</li>
         * <li>cloud_efficiency: ultra disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>ephemeral_ssd: local SSD.</li>
         * <li>cloud_essd: ESSD.</li>
         * </ul>
         * <p>If you specify this parameter, you cannot specify <code>DataDisk.Categories</code>. If you leave this parameter and <code>DataDisk.Categories</code> empty at the same time, the default value of this parameter is used.</p>
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
         * <p>Specifies whether to release the data disk if the instance to which the data disk is attached is released. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>If you set DataDisk.Category to cloud, cloud_efficiency, cloud_ssd, cloud_essd, or cloud_auto, you can specify this parameter. If you specify this parameter for data disks of other categories, an error is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        /**
         * <p>The description of the system disk. The description must be 2 to 256 characters in length, and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Test data disk.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The mount target of the data disk. If you do not specify this parameter, the system automatically assigns a mount target when Auto Scaling creates an ECS instance. Valid values: /dev/xvdb to /dev/xvdz.</p>
         * 
         * <strong>example:</strong>
         * <p>/dev/xvdd</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The name of the system disk. The name must be 2 to 128 characters in length, and can contain letters, digits, colons (:), underscores (_), and hyphens (-). The name must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssdData</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>Specifies whether to encrypt the system disk. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public String encrypted;

        /**
         * <p>The ID of the Key Management Service (KMS) key that you want to apply to the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The PL of the data disk that is an ESSD. Valid values:</p>
         * <ul>
         * <li>PL0: An ESSD can provide up to 10,000 random read/write IOPS.</li>
         * <li>PL1: An ESSD can provide up to 50,000 random read/write IOPS.</li>
         * <li>PL2: An ESSD can provide up to 100,000 random read/write IOPS.</li>
         * <li>PL3: An ESSD can provide up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <blockquote>
         * <p> For more information about how to select ESSD PLs, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The provisioned IOPS of the data disk.</p>
         * <blockquote>
         * <p> IOPS measures the number of read and write operations that an Elastic Block Storage (EBS) device can process per second.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        /**
         * <p>The size of the data disk. Unit: GB. Valid values:</p>
         * <ul>
         * <li>5 to 2000 if you set DataDisk.Category to cloud.</li>
         * <li>20 to 32768 if you set DataDisk.Category to cloud_efficiency.</li>
         * <li>20 to 32768 if you set DataDisk.Category to cloud_ssd.</li>
         * <li>20 to 32768 if you set DataDisk.Category to cloud_essd.</li>
         * <li>5 to 800 if you set DataDisk.Category to ephemeral_ssd.</li>
         * </ul>
         * <p>Set Size to a value that is greater than or equal to the size of the snapshot specified by SnapshotId.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The ID of the snapshot that you want to use to create data disks. If you specify this parameter, DataDisk.Size is ignored. The size of the data disk created by using the snapshot is the same as the size of the snapshot.</p>
         * <p>If the snapshot was created on or before July 15, 2013, the API request is rejected and the InvalidSnapshot.TooOld message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>s-snapshot****</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        public static ModifyScalingConfigurationRequestDataDisks build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationRequestDataDisks self = new ModifyScalingConfigurationRequestDataDisks();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationRequestDataDisks setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public ModifyScalingConfigurationRequestDataDisks setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public ModifyScalingConfigurationRequestDataDisks setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public ModifyScalingConfigurationRequestDataDisks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ModifyScalingConfigurationRequestDataDisks setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public ModifyScalingConfigurationRequestDataDisks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyScalingConfigurationRequestDataDisks setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public ModifyScalingConfigurationRequestDataDisks setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public ModifyScalingConfigurationRequestDataDisks setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public ModifyScalingConfigurationRequestDataDisks setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public ModifyScalingConfigurationRequestDataDisks setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public ModifyScalingConfigurationRequestDataDisks setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public ModifyScalingConfigurationRequestDataDisks setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ModifyScalingConfigurationRequestDataDisks setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

    }

    public static class ModifyScalingConfigurationRequestInstancePatternInfos extends TeaModel {
        /**
         * <p>The architecture types of the instance types. Valid values:</p>
         * <ul>
         * <li>X86: x86.</li>
         * <li>Heterogeneous: heterogeneous computing, such as GPU-accelerated or FPGA-accelerated.</li>
         * <li>BareMetal: ECS Bare Metal Instance.</li>
         * <li>Arm: Arm.</li>
         * </ul>
         * <p>By default, all values are selected.</p>
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
         * <p>The number of vCPUs per instance type in intelligent configuration mode. You can specify this parameter to filter the available instance types. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a>.</p>
         * <p>Before you specify this parameter, take note of the following items:</p>
         * <ul>
         * <li>You can specify InstancePatternInfo only if your scaling group resides in a virtual private cloud (VPC).</li>
         * <li>If you specify InstancePatternInfo, you must also specify InstancePatternInfo.Cores and InstancePatternInfo.Memory.</li>
         * <li>Auto Scaling preferentially uses the instance type specified by InstanceType or InstanceTypes to create instances. If the specified instance type does not have sufficient inventory, Auto Scaling selects the lowest-priced instance type specified by InstancePatternInfo to create instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cores")
        public Integer cores;

        /**
         * <p>The CPU architectures of the instance types. Valid values:</p>
         * <blockquote>
         * <p> You can specify up to two CPU architectures.</p>
         * </blockquote>
         * <ul>
         * <li>x86</li>
         * <li>Arm</li>
         * </ul>
         */
        @NameInMap("CpuArchitectures")
        public java.util.List<String> cpuArchitectures;

        /**
         * <p>The instance types that you want to exclude. You can use an asterisk (\*) as a wildcard character to exclude an instance type or an instance family. Examples:</p>
         * <ul>
         * <li>ecs.c6.large: excludes the ecs.c6.large instance type.</li>
         * <li>ecs.c6.\*: excludes the c6 instance family.</li>
         * </ul>
         */
        @NameInMap("ExcludedInstanceTypes")
        public java.util.List<String> excludedInstanceTypes;

        /**
         * <p>The GPU models.</p>
         */
        @NameInMap("GpuSpecs")
        public java.util.List<String> gpuSpecs;

        /**
         * <p>The categories of the instance types. Valid values:</p>
         * <ul>
         * <li>General-purpose: general-purpose instance type.</li>
         * <li>Compute-optimized: compute-optimized instance type.</li>
         * <li>Memory-optimized: memory-optimized instance type.</li>
         * <li>Big data: big data instance type.</li>
         * <li>Local SSDs: instance type that uses local SSDs.</li>
         * <li>High Clock Speed: instance type that has a high clock speed.</li>
         * <li>Enhanced: enhanced instance type.</li>
         * <li>Shared: shared instance type.</li>
         * <li>Compute-optimized with GPU: GPU-accelerated compute-optimized instance type.</li>
         * <li>Visual Compute-optimized: visual compute-optimized instance type.</li>
         * <li>Heterogeneous Service: heterogeneous service instance type.</li>
         * <li>Compute-optimized with FPGA: FPGA-accelerated compute-optimized instance type.</li>
         * <li>Compute-optimized with NPU: NPU-accelerated compute-optimized instance type.</li>
         * <li>ECS Bare Metal: ECS Bare Metal Instance type.</li>
         * <li>High Performance Compute: HPC-optimized instance type.</li>
         * </ul>
         */
        @NameInMap("InstanceCategories")
        public java.util.List<String> instanceCategories;

        /**
         * <p>The level of the instance family. You can specify this parameter to obtain the available instance types. This parameter takes effect only if you set <code>CostOptimization</code> to true. Valid values:</p>
         * <ul>
         * <li>EntryLevel: entry-level (shared instance types). Instance types of this level are the most cost-effective but may not ensure stable computing performance. Instance types of this level are suitable for scenarios in which the CPU utilization is low. For more information, see <a href="https://help.aliyun.com/document_detail/108489.html">Shared instance families</a>.</li>
         * <li>EnterpriseLevel: enterprise-level. Instance types of this level provide stable performance and dedicated resources and are suitable for business scenarios that require high stability. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a>.</li>
         * <li>CreditEntryLevel: credit entry-level (burstable instance types). CPU credits are used to ensure computing performance. Instance types of this level are suitable for scenarios in which the CPU utilization is low but may fluctuate in specific cases. For more information, see <a href="https://help.aliyun.com/document_detail/59977.html">Overview</a> of burstable instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EnterpriseLevel</p>
         */
        @NameInMap("InstanceFamilyLevel")
        public String instanceFamilyLevel;

        /**
         * <p>The instance families that you want to specify. You can specify up to 10 instance families in each call.</p>
         */
        @NameInMap("InstanceTypeFamilies")
        public java.util.List<String> instanceTypeFamilies;

        /**
         * <p>The maximum hourly price of pay-as-you-go or preemptible instances in intelligent configuration mode. You can specify this parameter to obtain the available instance types.</p>
         * <blockquote>
         * <p> If you set SpotStrategy to SpotWithPriceLimit, you must specify this parameter. In other cases, this parameter is optional.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxPrice")
        public Float maxPrice;

        /**
         * <p>The maximum number of vCPUs per instance type.</p>
         * <blockquote>
         * <p> The value of MaximumCpuCoreCount cannot exceed four times the value of MinimumCpuCoreCount.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("MaximumCpuCoreCount")
        public Integer maximumCpuCoreCount;

        /**
         * <p>The maximum number of GPUs per instance. The value must be a positive integer.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaximumGpuAmount")
        public Integer maximumGpuAmount;

        /**
         * <p>The maximum memory size per instance. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("MaximumMemorySize")
        public Float maximumMemorySize;

        /**
         * <p>The memory size per instance type in intelligent configuration mode. Unit: GiB. You can specify this parameter to filter the available instance types.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The baseline vCPU computing performance (overall baseline performance of all vCPUs) of each t5 or t6 burstable instance.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("MinimumBaselineCredit")
        public Integer minimumBaselineCredit;

        /**
         * <p>The minimum number of vCPUs per instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MinimumCpuCoreCount")
        public Integer minimumCpuCoreCount;

        /**
         * <p>The minimum number of IPv6 addresses per ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinimumEniIpv6AddressQuantity")
        public Integer minimumEniIpv6AddressQuantity;

        /**
         * <p>The minimum number of IPv4 addresses per ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MinimumEniPrivateIpAddressQuantity")
        public Integer minimumEniPrivateIpAddressQuantity;

        /**
         * <p>The minimum number of elastic network interfaces (ENIs) per instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MinimumEniQuantity")
        public Integer minimumEniQuantity;

        /**
         * <p>The minimum number of GPUs per instance. The value must be a positive integer.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MinimumGpuAmount")
        public Integer minimumGpuAmount;

        /**
         * <p>The initial vCPU credits of each t5 or t6 burstable instance.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("MinimumInitialCredit")
        public Integer minimumInitialCredit;

        /**
         * <p>The minimum memory size per instance. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("MinimumMemorySize")
        public Float minimumMemorySize;

        /**
         * <p>The processor models of the instance types. You can specify up to 10 processor models.</p>
         */
        @NameInMap("PhysicalProcessorModels")
        public java.util.List<String> physicalProcessorModels;

        public static ModifyScalingConfigurationRequestInstancePatternInfos build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationRequestInstancePatternInfos self = new ModifyScalingConfigurationRequestInstancePatternInfos();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationRequestInstancePatternInfos setArchitectures(java.util.List<String> architectures) {
            this.architectures = architectures;
            return this;
        }
        public java.util.List<String> getArchitectures() {
            return this.architectures;
        }

        public ModifyScalingConfigurationRequestInstancePatternInfos setBurstablePerformance(String burstablePerformance) {
            this.burstablePerformance = burstablePerformance;
            return this;
        }
        public String getBurstablePerformance() {
            return this.burstablePerformance;
        }

        public ModifyScalingConfigurationRequestInstancePatternInfos setCores(Integer cores) {
            this.cores = cores;
            return this;
        }
        public Integer getCores() {
            return this.cores;
        }

        public ModifyScalingConfigurationRequestInstancePatternInfos setCpuArchitectures(java.util.List<String> cpuArchitectures) {
            this.cpuArchitectures = cpuArchitectures;
            return this;
        }
        public java.util.List<String> getCpuArchitectures() {
            return this.cpuArchitectures;
        }

        public ModifyScalingConfigurationRequestInstancePatternInfos setExcludedInstanceTypes(java.util.List<String> excludedInstanceTypes) {
            this.excludedInstanceTypes = excludedInstanceTypes;
            return this;
        }
        public java.util.List<String> getExcludedInstanceTypes() {
            return this.excludedInstanceTypes;
        }

        public ModifyScalingConfigurationRequestInstancePatternInfos setGpuSpecs(java.util.List<String> gpuSpecs) {
            this.gpuSpecs = gpuSpecs;
            return this;
        }
        public java.util.List<String> getGpuSpecs() {
            return this.gpuSpecs;
        }

        public ModifyScalingConfigurationRequestInstancePatternInfos setInstanceCategories(java.util.List<String> instanceCategories) {
            this.instanceCategories = instanceCategories;
            return this;
        }
        public java.util.List<String> getInstanceCategories() {
            return this.instanceCategories;
        }

        public ModifyScalingConfigurationRequestInstancePatternInfos setInstanceFamilyLevel(String instanceFamilyLevel) {
            this.instanceFamilyLevel = instanceFamilyLevel;
            return this;
        }
        public String getInstanceFamilyLevel() {
            return this.instanceFamilyLevel;
        }

        public ModifyScalingConfigurationRequestInstancePatternInfos setInstanceTypeFamilies(java.util.List<String> instanceTypeFamilies) {
            this.instanceTypeFamilies = instanceTypeFamilies;
            return this;
        }
        public java.util.List<String> getInstanceTypeFamilies() {
            return this.instanceTypeFamilies;
        }

        public ModifyScalingConfigurationRequestInstancePatternInfos setMaxPrice(Float maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }
        public Float getMaxPrice() {
            return this.maxPrice;
        }

        public ModifyScalingConfigurationRequestInstancePatternInfos setMaximumCpuCoreCount(Integer maximumCpuCoreCount) {
            this.maximumCpuCoreCount = maximumCpuCoreCount;
            return this;
        }
        public Integer getMaximumCpuCoreCount() {
            return this.maximumCpuCoreCount;
        }

        public ModifyScalingConfigurationRequestInstancePatternInfos setMaximumGpuAmount(Integer maximumGpuAmount) {
            this.maximumGpuAmount = maximumGpuAmount;
            return this;
        }
        public Integer getMaximumGpuAmount() {
            return this.maximumGpuAmount;
        }

        public ModifyScalingConfigurationRequestInstancePatternInfos setMaximumMemorySize(Float maximumMemorySize) {
            this.maximumMemorySize = maximumMemorySize;
            return this;
        }
        public Float getMaximumMemorySize() {
            return this.maximumMemorySize;
        }

        public ModifyScalingConfigurationRequestInstancePatternInfos setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public ModifyScalingConfigurationRequestInstancePatternInfos setMinimumBaselineCredit(Integer minimumBaselineCredit) {
            this.minimumBaselineCredit = minimumBaselineCredit;
            return this;
        }
        public Integer getMinimumBaselineCredit() {
            return this.minimumBaselineCredit;
        }

        public ModifyScalingConfigurationRequestInstancePatternInfos setMinimumCpuCoreCount(Integer minimumCpuCoreCount) {
            this.minimumCpuCoreCount = minimumCpuCoreCount;
            return this;
        }
        public Integer getMinimumCpuCoreCount() {
            return this.minimumCpuCoreCount;
        }

        public ModifyScalingConfigurationRequestInstancePatternInfos setMinimumEniIpv6AddressQuantity(Integer minimumEniIpv6AddressQuantity) {
            this.minimumEniIpv6AddressQuantity = minimumEniIpv6AddressQuantity;
            return this;
        }
        public Integer getMinimumEniIpv6AddressQuantity() {
            return this.minimumEniIpv6AddressQuantity;
        }

        public ModifyScalingConfigurationRequestInstancePatternInfos setMinimumEniPrivateIpAddressQuantity(Integer minimumEniPrivateIpAddressQuantity) {
            this.minimumEniPrivateIpAddressQuantity = minimumEniPrivateIpAddressQuantity;
            return this;
        }
        public Integer getMinimumEniPrivateIpAddressQuantity() {
            return this.minimumEniPrivateIpAddressQuantity;
        }

        public ModifyScalingConfigurationRequestInstancePatternInfos setMinimumEniQuantity(Integer minimumEniQuantity) {
            this.minimumEniQuantity = minimumEniQuantity;
            return this;
        }
        public Integer getMinimumEniQuantity() {
            return this.minimumEniQuantity;
        }

        public ModifyScalingConfigurationRequestInstancePatternInfos setMinimumGpuAmount(Integer minimumGpuAmount) {
            this.minimumGpuAmount = minimumGpuAmount;
            return this;
        }
        public Integer getMinimumGpuAmount() {
            return this.minimumGpuAmount;
        }

        public ModifyScalingConfigurationRequestInstancePatternInfos setMinimumInitialCredit(Integer minimumInitialCredit) {
            this.minimumInitialCredit = minimumInitialCredit;
            return this;
        }
        public Integer getMinimumInitialCredit() {
            return this.minimumInitialCredit;
        }

        public ModifyScalingConfigurationRequestInstancePatternInfos setMinimumMemorySize(Float minimumMemorySize) {
            this.minimumMemorySize = minimumMemorySize;
            return this;
        }
        public Float getMinimumMemorySize() {
            return this.minimumMemorySize;
        }

        public ModifyScalingConfigurationRequestInstancePatternInfos setPhysicalProcessorModels(java.util.List<String> physicalProcessorModels) {
            this.physicalProcessorModels = physicalProcessorModels;
            return this;
        }
        public java.util.List<String> getPhysicalProcessorModels() {
            return this.physicalProcessorModels;
        }

    }

    public static class ModifyScalingConfigurationRequestInstanceTypeOverrides extends TeaModel {
        /**
         * <p>The instance type. If you want to specify the weight of the instance type in the scaling configuration, you must specify InstanceTypeOverride.WeightedCapacity after you specify this parameter.</p>
         * <p>This parameter specifies instance types. You can use this parameter to specify multiple instance types and use InstanceTypeOverride.WeightedCapacity to specify weights for the instance types.</p>
         * <blockquote>
         * <p> If you specify this parameter, you cannot specify instanceTypes.</p>
         * </blockquote>
         * <p>You can use this parameter to specify any instance types that are available for purchase.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c5.xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The weight of the instance type. If you want to trigger scale-outs based on instance capacities, you can specify this parameter after you specify LaunchTemplateOverride.InstanceType.</p>
         * <p>The weight specifies the capacity of an instance of the specified instance type in the scaling group. A higher weight specifies that a smaller number of instances of the specified instance type are required to meet the expected capacity requirement.</p>
         * <p>Performance metrics such as the number of vCPUs and the memory size of each instance type may vary. You can specify different weights for different instance types based on your business requirements.</p>
         * <p>Sample capacity configurations:</p>
         * <ul>
         * <li>Current capacity: 0.</li>
         * <li>Expected capacity: 6.</li>
         * <li>Capacity of ecs.c5.xlarge: 4.</li>
         * </ul>
         * <p>To reach the expected capacity, Auto Scaling must scale out two instances of ecs.c5.xlarge.</p>
         * <blockquote>
         * <p> The total capacity of the scaling group is constrained and cannot surpass the combined total of the maximum group size defined by MaxSize and the highest weight assigned to any instance type.</p>
         * </blockquote>
         * <p>Valid values of WeightedCapacity: 1 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("WeightedCapacity")
        public Integer weightedCapacity;

        public static ModifyScalingConfigurationRequestInstanceTypeOverrides build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationRequestInstanceTypeOverrides self = new ModifyScalingConfigurationRequestInstanceTypeOverrides();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationRequestInstanceTypeOverrides setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ModifyScalingConfigurationRequestInstanceTypeOverrides setWeightedCapacity(Integer weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public Integer getWeightedCapacity() {
            return this.weightedCapacity;
        }

    }

    public static class ModifyScalingConfigurationRequestNetworkInterfaces extends TeaModel {
        /**
         * <p>The ENI type. If you specify this parameter, you must use NetworkInterfaces to specify a primary ENI. In addition, you cannot specify SecurityGroupId or SecurityGroupIds. Valid values:</p>
         * <ul>
         * <li>Primary: the primary ENI.</li>
         * <li>Secondary: the secondary ENI.</li>
         * </ul>
         * <p>Default value: Secondary.</p>
         * 
         * <strong>example:</strong>
         * <p>Primary</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The number of randomly generated IPv6 addresses that you want to allocate to the primary ENI. Before you specify this parameter, take note of the following items:</p>
         * <p>This parameter takes effect only if you set NetworkInterface.InstanceType to Primary. If you set NetworkInterface.InstanceType to Secondary or leave it empty, you cannot specify this parameter.</p>
         * <p>After you specify this parameter, you can no longer specify Ipv6AddressCount.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Ipv6AddressCount")
        public Integer ipv6AddressCount;

        /**
         * <p>The communication mode of the ENI. Valid values:</p>
         * <ul>
         * <li>Standard: uses the TCP communication mode.</li>
         * <li>HighPerformance: uses the remote direct memory access (RDMA) communication mode with Elastic RDMA Interface (ERI) enabled.</li>
         * </ul>
         * <p>Default value: Standard.</p>
         * <blockquote>
         * <p> The number of ERIs on an instance cannot exceed the maximum number of ERIs supported by the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HighPerformance</p>
         */
        @NameInMap("NetworkInterfaceTrafficMode")
        public String networkInterfaceTrafficMode;

        @NameInMap("SecondaryPrivateIpAddressCount")
        public Integer secondaryPrivateIpAddressCount;

        /**
         * <p>The IDs of the security groups to which you want to assign the ENI.</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        public static ModifyScalingConfigurationRequestNetworkInterfaces build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationRequestNetworkInterfaces self = new ModifyScalingConfigurationRequestNetworkInterfaces();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationRequestNetworkInterfaces setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ModifyScalingConfigurationRequestNetworkInterfaces setIpv6AddressCount(Integer ipv6AddressCount) {
            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }
        public Integer getIpv6AddressCount() {
            return this.ipv6AddressCount;
        }

        public ModifyScalingConfigurationRequestNetworkInterfaces setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
            this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
            return this;
        }
        public String getNetworkInterfaceTrafficMode() {
            return this.networkInterfaceTrafficMode;
        }

        public ModifyScalingConfigurationRequestNetworkInterfaces setSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
            this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
            return this;
        }
        public Integer getSecondaryPrivateIpAddressCount() {
            return this.secondaryPrivateIpAddressCount;
        }

        public ModifyScalingConfigurationRequestNetworkInterfaces setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

    }

    public static class ModifyScalingConfigurationRequestResourcePoolOptions extends TeaModel {
        /**
         * <p>The IDs of private pools. The ID of a private pool is the same as that of the elasticity assurance or capacity reservation for which the private pool is generated. You can specify the IDs of only targeted private pools for this parameter.</p>
         */
        @NameInMap("PrivatePoolIds")
        public java.util.List<String> privatePoolIds;

        /**
         * <p>The resource pool used for instance creation, which can be the public pool or a private pool associated with any active elasticity assurance or capacity reservation. Valid values:</p>
         * <ul>
         * <li>PrivatePoolFirst: prioritizes private pools. When this option is set along with ResourcePoolOptions.PrivatePoolIds, the specified private pools are used first. If you leave ResourcePoolOptions.PrivatePoolIds empty or if the specified private pools lack sufficient capacity, the system will automatically use available open private pools instead. If no matching private pools are available, the system defaults to the public pool.</li>
         * <li>PrivatePoolOnly: uses only private pools. If you use this value, you must specify ResourcePoolOptions.PrivatePoolIds. If the specified private pools lack sufficient capacity, instance creation will fail.</li>
         * <li>None: uses no resource pools.</li>
         * </ul>
         * <p>Default value: None.</p>
         * 
         * <strong>example:</strong>
         * <p>PrivatePoolFirst</p>
         */
        @NameInMap("Strategy")
        public String strategy;

        public static ModifyScalingConfigurationRequestResourcePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationRequestResourcePoolOptions self = new ModifyScalingConfigurationRequestResourcePoolOptions();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationRequestResourcePoolOptions setPrivatePoolIds(java.util.List<String> privatePoolIds) {
            this.privatePoolIds = privatePoolIds;
            return this;
        }
        public java.util.List<String> getPrivatePoolIds() {
            return this.privatePoolIds;
        }

        public ModifyScalingConfigurationRequestResourcePoolOptions setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

    }

    public static class ModifyScalingConfigurationRequestSecurityOptions extends TeaModel {
        /**
         * <p>The confidential computing mode. Valid values:</p>
         * <ul>
         * <li>Enclave: An enclave-based confidential computing environment is built on the instance. For more information, see <a href="https://help.aliyun.com/document_detail/203433.html">Build a confidential computing environment by using Enclave</a>.</li>
         * <li>TDX: A Trust Domain Extensions (TDX) confidential computing environment is built on the instance. For more information, see <a href="https://help.aliyun.com/document_detail/479090.html">Build a TDX confidential computing environment</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TDX</p>
         */
        @NameInMap("ConfidentialComputingMode")
        public String confidentialComputingMode;

        public static ModifyScalingConfigurationRequestSecurityOptions build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationRequestSecurityOptions self = new ModifyScalingConfigurationRequestSecurityOptions();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationRequestSecurityOptions setConfidentialComputingMode(String confidentialComputingMode) {
            this.confidentialComputingMode = confidentialComputingMode;
            return this;
        }
        public String getConfidentialComputingMode() {
            return this.confidentialComputingMode;
        }

    }

    public static class ModifyScalingConfigurationRequestSpotPriceLimits extends TeaModel {
        /**
         * <p>The instance type of the spot instances. This parameter takes effect only if you set SpotStrategy to SpotWithPriceLimit.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The price limit of the spot instances. This parameter takes effect only if you set SpotStrategy to SpotWithPriceLimit.</p>
         * 
         * <strong>example:</strong>
         * <p>0.125</p>
         */
        @NameInMap("PriceLimit")
        public Float priceLimit;

        public static ModifyScalingConfigurationRequestSpotPriceLimits build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationRequestSpotPriceLimits self = new ModifyScalingConfigurationRequestSpotPriceLimits();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationRequestSpotPriceLimits setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ModifyScalingConfigurationRequestSpotPriceLimits setPriceLimit(Float priceLimit) {
            this.priceLimit = priceLimit;
            return this;
        }
        public Float getPriceLimit() {
            return this.priceLimit;
        }

    }

}
