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
     * <p>Specifies whether to associate an ECS instance on a dedicated host with the dedicated host. Valid values:</p>
     * <ul>
     * <li>default: does not associate the ECS instance with the dedicated host. If you start an ECS instance that was stopped in economical mode and the original dedicated host has insufficient resources, the ECS instance is automatically deployed to another dedicated host in the automatic deployment resource pool.</li>
     * <li>host: associates the ECS instance with the dedicated host. If you start an ECS instance that was stopped in economical mode, the instance remains on the original dedicated host. If the original dedicated host has insufficient resources, the ECS instance fails to start.</li>
     * </ul>
     * <p>Default value: default</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Affinity")
    public String affinity;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see the &quot;<a href="https://help.aliyun.com/document_detail/25693.html">How to ensure the idempotence of a request</a>&quot; topic.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The number of vCPUs.</p>
     * <p>You can specify the number of vCPUs and the memory size to determine the range of instance types. For example, you can set CPU to 2 and Memory to 16 to specify instance types that have 2 vCPUs and 16 GiB of memory. If you specify Cpu and Memory, Auto Scaling determines the available instance types based on factors such as I/O optimization requirements and zones. Then, Auto Scaling preferentially creates instances by using the lowest-priced instance type.</p>
     * <blockquote>
     * <p>You can specify Cpu and Memory to determine the range of instance types only if you set Scaling Policy to Cost Optimization Policy and you do not specify instance types in the scaling configuration.</p>
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
     * <li>Standard: standard mode</li>
     * <li>Unlimited: unlimited mode</li>
     * </ul>
     * <p>For more information, see the &quot;Performance modes&quot; section in the &quot;<a href="https://help.aliyun.com/document_detail/59977.html">Overview</a>&quot; topic.</p>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("CreditSpecification")
    public String creditSpecification;

    /**
     * <p>The priority of the custom ECS instance type + vSwitch combination.</p>
     * <blockquote>
     * <p> This parameter takes effect only when Scaling Policy of the scaling group is set to Priority Policy.</p>
     * </blockquote>
     * <p>If Auto Scaling cannot create ECS instances by using the custom ECS instance type + vSwitch combination of the highest priority, Auto Scaling creates ECS instances by using the custom ECS instance type + vSwitch combination of the next highest priority.</p>
     * <blockquote>
     * <p> If you specify the priorities of only partial custom ECS instance type + vSwitch combinations, Auto Scaling preferentially creates ECS instances by using the custom combinations that have specified priorities. If the custom combinations that have specified priorities do not provide sufficient resources, Auto Scaling creates ECS instances by using the custom combinations that do not have specified priorities based on the specified orders of vSwitches and instance types.</p>
     * </blockquote>
     * <ul>
     * <li>Example: the specified order of vSwitches for your scaling group is vsw1 and vsw2 and the specified order of instance types in your scaling configuration is type1 and type 2. In addition, you use CustomPriorities to specify [&quot;vsw2+type2&quot;, &quot;vsw1+type2&quot;]. In this example, the vsw2+type2 combination has the highest priority and the vsw2+type1 combination has the lowest priority. The vsw1+type2 combination has a higher priority than the vsw1+type1 combination.</li>
     * </ul>
     */
    @NameInMap("CustomPriorities")
    public java.util.List<CreateScalingConfigurationRequestCustomPriorities> customPriorities;

    /**
     * <p>The data disks.</p>
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
     * <p>The ID of the dedicated host on which you want to create an ECS instance. You cannot create preemptible instances on dedicated hosts. If you specify DedicatedHostId, SpotStrategy and SpotPriceLimit are ignored.</p>
     * <p>You can call the DescribeDedicatedHosts operation to query dedicated host IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>dh-bp67acfmxazb4p****</p>
     */
    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>The ID of the deployment set of the ECS instances that are created by using the scaling configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-bp1frxuzdg87zh4pz****</p>
     */
    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    /**
     * <p>The hostname of the ECS instance. The hostname cannot start or end with a period (.) or a hyphen (-). The hostname cannot contain consecutive periods (.) or hyphens (-). Naming conventions for different types of instances:</p>
     * <ul>
     * <li>Windows instances: The hostname must be 2 to 15 characters in length and can contain letters, digits, and hyphens (-). The hostname cannot contain periods (.) or contain only digits.</li>
     * <li>Other instances, such as Linux instances: The hostname must be 2 to 64 characters in length. You can use periods (.) to separate a hostname into multiple segments. Each segment can contain letters, digits, and hyphens (-).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>host****</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The ID of the Elastic High Performance Computing (E-HPC) cluster to which the ECS instances that are created by using the scaling configuration belong.</p>
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
     * <p>The name of the image family. If you specify this parameter, the most recent custom images that are available in the specified image family are returned. You can use the images to create instances. If you specify ImageId, you cannot specify ImageFamily.</p>
     * 
     * <strong>example:</strong>
     * <p>hangzhou-daily-update</p>
     */
    @NameInMap("ImageFamily")
    public String imageFamily;

    /**
     * <p>The ID of the image that Auto Scaling uses to automatically create ECS instances.</p>
     * 
     * <strong>example:</strong>
     * <p>centos6u5_64_20G_aliaegis****.vhd</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The name of the image. Each image name must be unique in a region. If you specify ImageId, ImageName is ignored.</p>
     * <p>You cannot use ImageName to specify images that are purchased from Alibaba Cloud Marketplace.</p>
     * 
     * <strong>example:</strong>
     * <p>image****</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The description of the ECS instance. The description must be 2 to 256 characters in length. The description can contain letters and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Test instance.</p>
     */
    @NameInMap("InstanceDescription")
    public String instanceDescription;

    /**
     * <p>The name of the ECS instance that Auto Scaling creates based on the scaling configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>instance****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The intelligent configuration settings, which determine the available instance types.</p>
     */
    @NameInMap("InstancePatternInfos")
    public java.util.List<CreateScalingConfigurationRequestInstancePatternInfos> instancePatternInfos;

    /**
     * <p>The instance type of the ECS instance. For more information, see the <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> topic.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g6.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The instance types.</p>
     */
    @NameInMap("InstanceTypeOverrides")
    public java.util.List<CreateScalingConfigurationRequestInstanceTypeOverrides> instanceTypeOverrides;

    /**
     * <p>The instance types. If you specify InstanceTypes, InstanceType is ignored.</p>
     * <p>Auto Scaling creates instances based on the priorities of the instance types. If Auto Scaling cannot create instances by using the instance type that has the highest priority, Auto Scaling creates instances by using the instance type that has the next highest priority.</p>
     */
    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    /**
     * <p>The metering method for network usage. Valid values:</p>
     * <ul>
     * <li>PayByBandwidth: You are charged for the maximum available bandwidth that is specified by InternetMaxBandwidthOut.</li>
     * <li>PayByTraffic: You are charged based on the amount of transferred data. InternetMaxBandwidthOut specifies only the maximum available bandwidth.</li>
     * </ul>
     * <p>For the classic network, the default value is PayByBandwidth. For VPCs, the default value is PayByTraffic.</p>
     * 
     * <strong>example:</strong>
     * <p>PayByTraffic</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The maximum inbound public bandwidth. Unit: Mbit/s. Valid values:</p>
     * <ul>
     * <li>If the purchased outbound public bandwidth is less than or equal to 10 Mbit/s, the valid values of this parameter are 1 to 10, and the default value is 10.</li>
     * <li>If the purchased outbound public bandwidth is greater than 10 Mbit/s, the valid values of this parameter are 1 to the value of <code>InternetMaxBandwidthOut</code>, and the default value is the value of <code>InternetMaxBandwidthOut</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>100</p>
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
     * <p>Specifies whether to create an I/O optimized instance. Valid values:</p>
     * <p>none: does not create an I/O optimized instance. optimized: creates an I/O optimized instance.</p>
     * <p>For instances of retired instance types, the default value is none. For instances of other instance types, the default value is optimized.</p>
     * 
     * <strong>example:</strong>
     * <p>optimized</p>
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
     * <p>The name of the key pair that you want to use to log on to an ECS instance.</p>
     * <ul>
     * <li>Windows instances do not support this parameter.</li>
     * <li>By default, the username and password authentication method is disabled for Linux instances.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>KeyPairTest</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The weight of an ECS instance as a backend server. Valid values: 1 to 100.</p>
     * <p>Default value: 50</p>
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
     * <p>You can specify Cpu and Memory to determine the range of instance types only if you set Scaling Policy to Cost Optimization Policy and you do not specify instance types in the scaling configuration.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("Memory")
    public Integer memory;

    @NameInMap("NetworkInterfaces")
    public java.util.List<CreateScalingConfigurationRequestNetworkInterfaces> networkInterfaces;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The password that you want to use to log on to an ECS instance. The password must be 8 to 30 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The following special characters are supported:</p>
     * <p><code>`() ~!@#$%^&amp;*-_+=\\|{}[]:;\\&quot;&lt;&gt;,.?/</code></p>
     * <p>The password of a Windows instance cannot start with a forward slash (/).</p>
     * <blockquote>
     * <p>For security reasons, we recommend that you use HTTPS to send requests if you specify Password.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123abc****</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>Specifies whether to use the password that is preconfigured in the image. Before you use this parameter, make sure that a password is configured in the image. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    /**
     * <p>The name of the RAM role that you attach to the ECS instance. The name is provided and maintained by Resource Access Management (RAM). You can call the ListRoles operation to query the available RAM roles.</p>
     * 
     * <strong>example:</strong>
     * <p>ramrole****</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The ID of the resource group to which the ECS instances that are created by using the scaling configuration belong.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-resource****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourcePoolOptions")
    public CreateScalingConfigurationRequestResourcePoolOptions resourcePoolOptions;

    /**
     * <p>The name of the scaling configuration. The name must be 2 to 64 characters in length and can contain letters, digits, underscores (_), hyphens (-), and periods (.). The name must start with a letter or a digit.</p>
     * <p>The name of the scaling configuration must be unique in a region. If you do not specify this parameter, the scaling configuration ID is used.</p>
     * 
     * <strong>example:</strong>
     * <p>scalingconfig****</p>
     */
    @NameInMap("ScalingConfigurationName")
    public String scalingConfigurationName;

    /**
     * <p>The ID of the scaling group in which you want to create a scaling configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp14wlu85wrpchm0****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    /**
     * <p>The scheduler options.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;testManagedPrivateSpaceId****&quot;]</p>
     */
    @NameInMap("SchedulerOptions")
    public java.util.Map<String, ?> schedulerOptions;

    /**
     * <p>Specifies whether to enable security hardening. Valid values:</p>
     * <ul>
     * <li>Active: enables security hardening. This value is applicable only to public images.</li>
     * <li>Deactive: disables security hardening. This value is applicable to all image types.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("SecurityEnhancementStrategy")
    public String securityEnhancementStrategy;

    /**
     * <p>The ID of the security group with which ECS instances are associated. ECS instances that are associated with the same security group can access each other.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-280ih****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The IDs of the security groups with which you want to associate the ECS instances that are created by using the scaling configuration. For more information, see the &quot;Security group limits&quot; section of the &quot;<a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>&quot; topic.</p>
     * <blockquote>
     * <p>If you specify SecurityGroupId, you cannot specify SecurityGroupIds.</p>
     * </blockquote>
     */
    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    @NameInMap("SecurityOptions")
    public CreateScalingConfigurationRequestSecurityOptions securityOptions;

    /**
     * <p>The retention period of the preemptible instance. Unit: hours. Valid values: 0, 1, 2, 3, 4, 5, and 6.</p>
     * <ul>
     * <li>The following retention periods are available in invitational preview: 2, 3, 4, 5, and 6 hours. If you want to set this parameter to one of these values, submit a ticket.</li>
     * <li>If you set this parameter to 0, no protection period is specified for the preemptible instance.</li>
     * </ul>
     * <p>Default value: 1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SpotDuration")
    public Integer spotDuration;

    /**
     * <p>The interruption mode of the preemptible instance. Set the value to Terminate. The value specifies that the preemptible instance is to be released.</p>
     * 
     * <strong>example:</strong>
     * <p>Terminate</p>
     */
    @NameInMap("SpotInterruptionBehavior")
    public String spotInterruptionBehavior;

    /**
     * <p>The billing information of the preemptible instances.</p>
     */
    @NameInMap("SpotPriceLimits")
    public java.util.List<CreateScalingConfigurationRequestSpotPriceLimits> spotPriceLimits;

    /**
     * <p>The preemption policy that you want to apply to pay-as-you-go and preemptible instances. Valid values:</p>
     * <ul>
     * <li>NoSpot: The instance is created as a pay-as-you-go instance.</li>
     * <li>SpotWithPriceLimit: The instance is a preemptible instance that has a user-defined maximum hourly price.</li>
     * <li>SpotAsPriceGo: The instance is created as a preemptible instance for which the market price at the time of purchase is automatically used as the bid price.</li>
     * </ul>
     * <p>Default value: NoSpot</p>
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
     * <p>The categories of the system disks. If Auto Scaling cannot create instances by using the disk category that has the highest priority, Auto Scaling creates instances by using the disk category that has the next highest priority. Valid values:</p>
     * <ul>
     * <li>cloud: basic disk</li>
     * <li>cloud_efficiency: ultra disk</li>
     * <li>cloud_ssd: standard SSD</li>
     * <li>cloud_essd: ESSD</li>
     * </ul>
     * <blockquote>
     * <p>If you specify SystemDiskCategories, you cannot specify <code>SystemDisk.Category</code>.</p>
     * </blockquote>
     */
    @NameInMap("SystemDiskCategories")
    public java.util.List<String> systemDiskCategories;

    /**
     * <p>The tags of the ECS instance. Tags must be specified as key-value pairs. You can specify up to 20 tags. When you specify tag keys and tag values, take note of the following items:</p>
     * <ul>
     * <li>A tag key can be up to 64 characters in length. The key cannot start with acs: or aliyun and cannot contain <code>http://</code> or <code>https://</code>. You cannot specify an empty string as a tag key.</li>
     * <li>A tag value can be up to 128 characters in length. The value cannot start with acs: or aliyun and cannot contain <code>http://</code> or <code>https://</code>. You can specify an empty string as a tag value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key1&quot;:&quot;value1&quot;,&quot;key2&quot;:&quot;value2&quot;, ... &quot;key5&quot;:&quot;value5&quot;}</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>Specifies whether to create an ECS instance on a dedicated host. Valid values:</p>
     * <ul>
     * <li>default: does not create an ECS instance on a dedicated host.</li>
     * <li>host: creates an ECS instance on a dedicated host. If you do not specify DedicatedHostId, Alibaba Cloud selects a dedicated host for the ECS instance.</li>
     * </ul>
     * <p>Default value: default</p>
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
         * <p>For more information about whether an ECS instance uses the ecs-user user user to log on to an ECS instance, see <a href="https://help.aliyun.com/document_detail/388447.html">Manage the login name of an ECS instance</a>. Value range:</p>
         * <ul>
         * <li>true: Yes.</li>
         * <li>false: No.</li>
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
         * <p>The ID of the private pool. The ID of a private pool is the same as the ID of the elasticity assurance or capacity reservation for which the private pool is generated.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-bp67acfmxazb4****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The type of the private pool that you want to use to start ECS instances. A private pool is generated when an elasticity assurance or a capacity reservation takes effect. You can select a private pool to create ECS instances. Valid values:</p>
         * <ul>
         * <li>Open: open private pool. Auto Scaling selects a matching open private pool to start instances. If no matching open private pools are found, Auto Scaling uses the resources in the public pool to start instances. In this case, you do not need to specify PrivatePoolOptions.Id.</li>
         * <li>Target: specified private pool. Auto Scaling uses the resources in the specified private pool to start ECS instances. If the specified private pool is unavailable, Auto Scaling cannot start ECS instances. If you set this parameter to Target, you must specify PrivatePoolOptions.Id.</li>
         * <li>None: no private pool. Auto Scaling does not use the resources in private pools to start ECS instances.</li>
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
         * <p>The ID of the automatic snapshot policy that you want to apply to the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp12m37ccmxvbmi5****</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>Specifies whether to enable the burst feature for the system disk. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available only if you set <code>SystemDisk.Category</code> to <code>cloud_auto</code>.</p>
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
         * <li>cloud: basic disk</li>
         * <li>cloud_efficiency: ultra disk</li>
         * <li>cloud_ssd: standard SSD</li>
         * <li>ephemeral_ssd: local SSD</li>
         * <li>cloud_essd: enhanced SSD (ESSD)</li>
         * <li>cloud_auto: ESSD AutoPL disk</li>
         * </ul>
         * <p>If you specify SystemDisk.Category, you cannot specify <code>SystemDiskCategories</code>. If you do not specify SystemDisk.Category or <code>SystemDiskCategories</code>, the default value of SystemDisk.Category is used.</p>
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
         * <p>The description of the system disk. The description must be 2 to 256 characters in length. The description can contain letters and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Test system disk.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the system disk. The name must be 2 to 128 characters in length. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-). The name must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssdSystem</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>The encryption algorithm that you want to use to encrypt the system disk. Valid values:</p>
         * <ul>
         * <li>AES-256</li>
         * <li>SM4-128</li>
         * </ul>
         * <p>Default value: AES-256</p>
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
         * <p>Default value: false</p>
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
         * <p>The performance level (PL) of the system disk that is an enhanced SSD (ESSD). Valid values:</p>
         * <ul>
         * <li>PL0: An ESSD can provide up to 10,000 random read/write IOPS.</li>
         * <li>PL1: An ESSD can provide up to 50,000 random read/write IOPS.</li>
         * <li>PL2: An ESSD can provide up to 100,000 random read/write IOPS.</li>
         * <li>PL3: An ESSD can provide up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <p>Default value: PL1.</p>
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
         * <p>The size of the system disk. Unit: GiB.</p>
         * <ul>
         * <li><p>Basic disk: 20 to 500.</p>
         * </li>
         * <li><p>ESSD (cloud_essd): The valid values vary based on the performance level of the ESSD.</p>
         * <ul>
         * <li>PL0 ESSD: 1 to 2048.</li>
         * <li>PL1 ESSD: 20 to 2048.</li>
         * <li>PL2 ESSD: 461 to 2048.</li>
         * <li>PL3 ESSD: 1261 to 2048.</li>
         * </ul>
         * </li>
         * <li><p>ESSD AutoPL disk (cloud_auto): 1 to 2048.</p>
         * </li>
         * <li><p>Other disk categories: 20 to 2048.</p>
         * </li>
         * </ul>
         * <p>The value of this parameter must be at least 1 and greater than or equal to the image size.</p>
         * <p>Default value: 40 or the size of the image, whichever is larger.</p>
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
         * <p>The ECS instance type.</p>
         * <blockquote>
         * <p> The ECS instance type must be included in the instance types specified in the scaling configuration.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6.large</p>
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
         * <p>The ID of the automatic snapshot policy that you want to apply to the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp19nq9enxqkomib****</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>Specifies whether to enable the burst feature for the system disk. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available only if you set <code>SystemDisk.Category</code> to <code>cloud_auto</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>The categories of the data disks. If Auto Scaling cannot create instances by using the disk category that has the highest priority, Auto Scaling creates instances by using the disk category that has the next highest priority. Valid values:</p>
         * <ul>
         * <li>cloud: basic disk. For a basic disk that is created together with the instance, DeleteWithInstance is set to true.</li>
         * <li>cloud_efficiency: ultra disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>cloud_essd: ESSD.</li>
         * </ul>
         * <blockquote>
         * <p>If you specify Categories, you cannot specify <code>DataDisks.Category</code>.</p>
         * </blockquote>
         */
        @NameInMap("Categories")
        public java.util.List<String> categories;

        /**
         * <p>The category of the data disk. Valid values:</p>
         * <ul>
         * <li>cloud: basic disk</li>
         * <li>cloud_efficiency: ultra disk</li>
         * <li>cloud_ssd: standard SSD</li>
         * <li>cloud_essd: ESSD</li>
         * <li>ephemeral_ssd: local SSD</li>
         * <li>cloud_auto: ESSD AutoPL disk</li>
         * </ul>
         * <p>If you specify this parameter, you cannot specify Categories. If you do not specify Category or Categories, the default value of Category is used.</p>
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
         * <p>Specifies whether to release the data disk when the instance to which the data disk is attached is released. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>This parameter is available only for independent disks whose value of Category is set to cloud, cloud_efficiency, cloud_ssd, or cloud_essd. If you specify this parameter for other disks, an error is reported.</p>
         * <p>Default value: true</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        /**
         * <p>The description of the data disk. The description must be 2 to 256 characters in length. The description can contain letters and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Test data disk.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The mount target of the data disk. If you do not specify Device, a mount target is automatically assigned when Auto Scaling creates ECS instances. The names of mount targets range from /dev/xvdb to /dev/xvdz.</p>
         * 
         * <strong>example:</strong>
         * <p>/dev/xvdb</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The name of the system disk. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). The name must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssdData</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>Specifies whether to encrypt the data disk. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public String encrypted;

        /**
         * <p>The ID of the KMS key that you want to use to encrypt the data disk.</p>
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
         * <p>For more information about how to select ESSD PLs, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The IOPS metric that is preconfigured for the data disk.</p>
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
         * <p>The size of the data disk. Unit: GiB. Valid values:</p>
         * <ul>
         * <li>If you set Categories to cloud: 5 to 2000.</li>
         * <li>If you set Categories to cloud_efficiency: 20 to 32768.</li>
         * <li>If you set Categories to cloud_essd: 20 to 32768.</li>
         * <li>If you set Categories to ephemeral_ssd: 5 to 800.</li>
         * </ul>
         * <p>The size of the data disk must be greater than or equal to the size of the snapshot that is specified by SnapshotId.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The ID of the snapshot that you want to use to create data disks. If you specify this parameter, DataDisks.Size is ignored. The size of the data disk is the same as the size of the specified snapshot.</p>
         * <p>If you specify a snapshot that is created on or before July 15, 2013, the operation fails and the system returns InvalidSnapshot.TooOld.</p>
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
         * <p>The architecture types of the instance types. Valid values:</p>
         * <ul>
         * <li>X86: x86 architecture.</li>
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
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>InstancePatternInfos applies only to scaling groups that reside in virtual private clouds (VPCs).</li>
         * <li>If you specify InstancePatternInfos, you must also specify InstancePatternInfos.Cores and InstancePatternInfos.Memory.</li>
         * <li>If you specify InstanceType or InstanceTypes, Auto Scaling preferentially uses the instance type specified by InstanceType or InstanceTypes to create instances during scale-out events. If the specified instance type has insufficient inventory, Auto Scaling uses the lowest-priced instance type specified by InstancePatternInfos to create instances during scale-out events.</li>
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
         * <blockquote>
         * <p> You can specify up to 10 categories.</p>
         * </blockquote>
         * <ul>
         * <li>General-purpose: general-purpose instance type.</li>
         * <li>Compute-optimized: compute-optimized instance type.</li>
         * <li>Memory-optimized: memory-optimized instance type.</li>
         * <li>Big data: big data instance type.</li>
         * <li>Local SSDs: instance type that uses local SSDs.</li>
         * <li>High Clock Speed: instance type that has high clock speeds.</li>
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
         * <p>The level of the instance family. You can specify this parameter to match the available instance types. This parameter takes effect only if you set <code>CostOptimization</code> to true. Valid values:</p>
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
         * <p>The maximum hourly price of pay-as-you-go or preemptible instances in intelligent configuration mode. You can specify this parameter to filter the available instance types.</p>
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
         * <p>The baseline vCPU computing performance (overall baseline performance of all vCPUs) per t5 or t6 burstable instance.</p>
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
         * <p>The initial vCPU credits per t5 or t6 burstable instance.</p>
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

    public static class CreateScalingConfigurationRequestInstanceTypeOverrides extends TeaModel {
        /**
         * <p>Instance type N that you want to use to override the instance type that is specified in the launch template.</p>
         * <p>If you want to trigger scale-outs based on the weighted capacities of instances, specify InstanceType and WeightedCapacity at the same time. You can specify N instance types by using the Extended Configurations feature. Valid values of N: 1 to 10.</p>
         * <blockquote>
         * <p>This parameter takes effect only if you specify LaunchTemplateId.</p>
         * </blockquote>
         * <p>You can specify an instance type that is available for purchase as the value of InstanceType.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c5.xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The weight of instance type N. If you want to trigger scale-outs based on the weighted capacities of instances, you must specify WeightedCapacity after you specify InstanceType.</p>
         * <p>The weight of an instance type specifies the capacity of an instance of the instance type in the scaling group. A higher weight specifies that a smaller number of instances of the specified instance type is required to meet the expected capacity requirement.</p>
         * <p>Performance metrics, such as the number of vCPUs and the memory size of each instance type, may vary. You can specify different weights for different instance types based on your business requirements.</p>
         * <p>Example:</p>
         * <ul>
         * <li>Current capacity: 0</li>
         * <li>Expected capacity: 6</li>
         * <li>Capacity of ecs.c5.xlarge: 4</li>
         * </ul>
         * <p>To meet the expected capacity requirement, Auto Scaling must create and add two ecs.c5.xlarge instances.</p>
         * <blockquote>
         * <p>The capacity of the scaling group cannot exceed the sum of the maximum number of instances that is specified by MaxSize and the maximum weight of the instance types.</p>
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
         * <strong>example:</strong>
         * <p>Primary</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Ipv6AddressCount")
        public Integer ipv6AddressCount;

        /**
         * <strong>example:</strong>
         * <p>HighPerformance</p>
         */
        @NameInMap("NetworkInterfaceTrafficMode")
        public String networkInterfaceTrafficMode;

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

        public CreateScalingConfigurationRequestNetworkInterfaces setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

    }

    public static class CreateScalingConfigurationRequestResourcePoolOptions extends TeaModel {
        @NameInMap("PrivatePoolIds")
        public java.util.List<String> privatePoolIds;

        /**
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
         * <li>Enclave: An enclave-based confidential computing environment is built on the instance. For more information, see <a href="https://help.aliyun.com/document_detail/203433.html">Build a confidential computing environment by using Enclave</a>.</li>
         * <li>TDX: A Trust Domain Extensions (TDX) confidential computing environment is built on the instance. For more information, see <a href="https://help.aliyun.com/document_detail/479090.html">Build a TDX confidential computing environment</a>.</li>
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
         * <p>The instance type of the preemptible instance. This parameter takes effect only if you set SpotStrategy to SpotWithPriceLimit.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The price limit of the preemptible instance. This parameter takes effect only if you set SpotStrategy to SpotWithPriceLimit.</p>
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
