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
     * <p>Specifies whether to associate an instance on a dedicated host with the dedicated host. Valid values:</p>
     * <br>
     * <p>*   default: does not associate the instance with the dedicated host. If you start an instance that was stopped in Economical Mode and the original dedicated host has insufficient resources, the instance is automatically deployed to another dedicated host in the automatic deployment resource pool.</p>
     * <p>*   host: associates the instance with the dedicated host. If you start an instance that was stopped in Economical Mode, the instance remains on the original dedicated host. If the original dedicated host of the instance has insufficient resources, the instance cannot be started.</p>
     * <br>
     * <p>Default value: default.</p>
     */
    @NameInMap("Affinity")
    public String affinity;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure the idempotence of a request](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The number of vCPUs. Unit: cores.</p>
     * <br>
     * <p>You can specify the number of vCPUs and the memory size to determine the range of instance types. For example, you can set CPU to 2 and Memory to 16 to specify instance types that have 2 vCPUs and 16 GiB of memory. If you specify the Cpu and Memory parameters, Auto Scaling determines the available instance types based on factors such as I/O optimization requirements and zones. Then, Auto Scaling preferentially creates instances of the instance type that is provided at the lowest price.</p>
     * <br>
     * <p>> You can specify the Cpu and Memory parameters to determine the range of instance types only if the Scaling Policy parameter is set to Cost Optimization Policy and no instance type is specified in the scaling configuration.</p>
     */
    @NameInMap("Cpu")
    public Integer cpu;

    /**
     * <p>The performance mode of the burstable instance. Valid values:</p>
     * <br>
     * <p>*   Standard: standard mode.</p>
     * <p>*   Unlimited: unlimited mode.</p>
     * <br>
     * <p>For more information, see the "Performance modes" section in the [Overview](~~59977~~) topic.</p>
     */
    @NameInMap("CreditSpecification")
    public String creditSpecification;

    /**
     * <p>Details of the data disks.</p>
     */
    @NameInMap("DataDisks")
    public java.util.List<CreateScalingConfigurationRequestDataDisks> dataDisks;

    /**
     * <p>The dedicated host ID of the ECS instance. You cannot create preemptible instances on dedicated hosts. Therefore, if you configure the DedicatedHostId parameter, the SpotStrategy and SpotPriceLimit parameters are ignored.</p>
     * <br>
     * <p>You can call the DescribeDedicatedHosts operation to query dedicated host IDs.</p>
     */
    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    /**
     * <p>The ID of the deployment set to which the ECS instances belong.</p>
     */
    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    /**
     * <p>The hostname of the instance. The hostname cannot start or end with a period (.) or a hyphen (-). The hostname also cannot contain consecutive periods (.) or hyphens (-). Naming conventions:</p>
     * <br>
     * <p>*   Windows instances: The name must be 2 to 15 characters in length and can contain letters, digits, and hyphens (-). The name cannot contain periods (.) or contain only digits.</p>
     * <p>*   Other instances such as Linux instances: The hostname must be 2 to 64 characters in length. You can use periods (.) to separate a hostname into multiple segments. Each segment can contain letters, digits, and hyphens (-).</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The ID of the Elastic High Performance Computing (E-HPC) cluster to which the ECS instance belongs.</p>
     */
    @NameInMap("HpcClusterId")
    public String hpcClusterId;

    /**
     * <p>The name of the image family. You can specify this parameter to obtain the latest custom images that are available in the specified image family. The images are used to create ECS instances. If the ImageId parameter is specified, you cannot specify the ImageFamily parameter.</p>
     */
    @NameInMap("ImageFamily")
    public String imageFamily;

    /**
     * <p>The ID of the image that Auto Scaling uses to automatically create ECS instances.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The name of the image. Each image name must be unique in a region. If you specify the ImageId parameter, the ImageName parameter is ignored.</p>
     * <br>
     * <p>You cannot use the ImageName parameter to specify images that are purchased from Alibaba Cloud Marketplace.</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The description of the ECS instance. The description must be 2 to 256 characters in length. It cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("InstanceDescription")
    public String instanceDescription;

    /**
     * <p>The name of an ECS instance that is automatically created based on the scaling configuration.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>Details of the intelligent configuration settings, which determines the range of instance types that meet the specified criteria.</p>
     */
    @NameInMap("InstancePatternInfos")
    public java.util.List<CreateScalingConfigurationRequestInstancePatternInfos> instancePatternInfos;

    /**
     * <p>The instance type of the ECS instance. For more information, see the "Instance family" topic.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The information about the instance types.</p>
     */
    @NameInMap("InstanceTypeOverrides")
    public java.util.List<CreateScalingConfigurationRequestInstanceTypeOverrides> instanceTypeOverrides;

    /**
     * <p>The instance types. If you specify the InstanceTypes parameter, the InstanceType parameter is ignored.</p>
     * <br>
     * <p>Auto Scaling creates instances based on the priorities of instance types. If Auto Scaling cannot create instances of the instance type that has the highest priority, Auto Scaling creates instances of the instance type that has the next highest priority.</p>
     */
    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    /**
     * <p>The billing method for network usage. Valid values:</p>
     * <br>
     * <p>*   PayByBandwidth: You are charged for the maximum available bandwidth that is specified by the InternetMaxBandwidthOut parameter.</p>
     * <p>*   PayByTraffic: You are charged for the actual traffic that is used. InternetMaxBandwidthOut specifies only the maximum available bandwidth.</p>
     * <br>
     * <p>For the classic network, the default value is PayByBandwidth. For VPCs, the default value is PayByTraffic.</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The maximum inbound public bandwidth. Unit: Mbit/s. Valid values: 1 to 200.</p>
     * <br>
     * <p>Default value: 200. This parameter is not used for billing because inbound traffic to instances is free of charge.</p>
     */
    @NameInMap("InternetMaxBandwidthIn")
    public Integer internetMaxBandwidthIn;

    /**
     * <p>The maximum outbound public bandwidth. Unit: Mbit/s. Valid values:</p>
     * <br>
     * <p>*   0 to 100 if you set the InternetChargeType parameter to PayByBandwidth. If you leave this parameter empty, this parameter is automatically set to 0.</p>
     * <p>*   0 to 100 if you set the InternetChargeType parameter to PayByTraffic. If you leave this parameter empty, an error is returned.</p>
     */
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    /**
     * <p>Specifies whether to create an I/O optimized instance. Valid values:</p>
     * <br>
     * <p>none: does not create an I/O optimized instance. optimized: creates an I/O optimized instance.</p>
     * <br>
     * <p>For instances of retired instance types, the default value is none. For instances of other instance types, the default value is optimized.</p>
     */
    @NameInMap("IoOptimized")
    public String ioOptimized;

    /**
     * <p>The number of randomly generated IPv6 addresses that you want to allocate to the elastic network interface (ENI).</p>
     */
    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    /**
     * <p>The name of the key pair that you use to log on to an ECS instance.</p>
     * <br>
     * <p>*   Windows instances do not use this parameter.</p>
     * <p>*   By default, the username and password authentication method is disabled for Linux instances.</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The weight of an ECS instance as a backend server. Valid values: 1 to 100.</p>
     * <br>
     * <p>Default value: 50.</p>
     */
    @NameInMap("LoadBalancerWeight")
    public Integer loadBalancerWeight;

    /**
     * <p>The memory size. Unit: GiB.</p>
     * <br>
     * <p>You can specify the number of vCPUs and the memory size to determine the range of instance types. For example, you can set Cpu to 2 and Memory to 16 to specify instance types that have 2 vCPUs and 16 GiB of memory. If you specify the Cpu and Memory parameters, Auto Scaling determines the available instance types based on factors such as I/O optimization requirements and zones. Then, Auto Scaling preferentially creates instances of the instance type that is provided at the lowest price.</p>
     * <br>
     * <p>> You can specify the Cpu and Memory parameters to determine the range of instance types only if the Scaling Policy parameter is set to Cost Optimization Policy and no instance type is specified in the scaling configuration.</p>
     */
    @NameInMap("Memory")
    public Integer memory;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The password that you use to log on to an ECS instance. The password must be 8 to 30 characters in length. The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The following special characters are supported:</p>
     * <br>
     * <p>\`()`  ~!@#$%^&*-_+=\|{}[]:;\"<>,.?/ `</p>
     * <br>
     * <p>The password of a Windows instance cannot start with a forward slash (/).</p>
     * <br>
     * <p>> For security reasons, we recommend that you use HTTPS to send requests if the Password parameter is specified.</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>Specifies whether to use the password that is preconfigured in the image. Before you use this parameter, make sure that a password is configured in the image. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    /**
     * <p>The name of the RAM role that you attach to the ECS instance. The name is provided and maintained by Resource Access Management (RAM). You can call the ListRoles operation to query the available RAM roles.</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The ID of the resource group to which the ECS instance belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The name of the scaling configuration. The name must be 2 to 64 characters in length and can contain letters, digits, underscores (\_), hyphens (-), and periods (.). The name must start with a letter or a digit.</p>
     * <br>
     * <p>The name of the scaling configuration must be unique within a scaling group in a region. If you do not specify this parameter, the scaling configuration ID is used.</p>
     */
    @NameInMap("ScalingConfigurationName")
    public String scalingConfigurationName;

    /**
     * <p>The ID of the scaling group in which you want to create the scaling configuration.</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    /**
     * <p>The scheduler options.</p>
     */
    @NameInMap("SchedulerOptions")
    public java.util.Map<String, ?> schedulerOptions;

    /**
     * <p>Specifies whether to enable security hardening. Valid values:</p>
     * <br>
     * <p>*   Active: enables security hardening. This value is applicable only to public images.</p>
     * <p>*   Deactive: disables security hardening. This value is applicable to all image types.</p>
     */
    @NameInMap("SecurityEnhancementStrategy")
    public String securityEnhancementStrategy;

    /**
     * <p>The ID of the security group with which the ECS instance is associated. The ECS instances that are associated with the same security group can access each other.</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The IDs of the security groups with which you want to associate the ECS instance. For more information, see the "Security group limits" section of the [Limits](~~25412~~) topic.</p>
     * <br>
     * <p>> If you specify the SecurityGroupId parameter, you cannot specify the SecurityGroupIds parameter.</p>
     */
    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    /**
     * <p>The protection period of the preemptible instance. Unit: hours. Valid values: 0, 1, 2, 3, 4, 5, and 6.</p>
     * <br>
     * <p>*   The following retention periods are available in invitational preview: 2, 3, 4, 5, and 6 hours. If you want to set this parameter to one of these values, submit a ticket.</p>
     * <p>*   If you set this parameter to 0, no protection period is specified for the preemptible instance.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("SpotDuration")
    public Integer spotDuration;

    /**
     * <p>The interruption mode of the preemptible instance. Default value: Terminate. Set the value to Terminate, which specifies that the preemptible instance is to be released.</p>
     */
    @NameInMap("SpotInterruptionBehavior")
    public String spotInterruptionBehavior;

    /**
     * <p>The billing information of the preemptible instances.</p>
     */
    @NameInMap("SpotPriceLimits")
    public java.util.List<CreateScalingConfigurationRequestSpotPriceLimits> spotPriceLimits;

    /**
     * <p>The preemption policy that you want to apply to pay-as-you-go instances and preemptible instances. Valid values:</p>
     * <br>
     * <p>*   NoSpot: The instance is created as a pay-as-you-go instance.</p>
     * <p>*   SpotWithPriceLimit: The instance is a preemptible instance that has a user-defined maximum hourly price.</p>
     * <p>*   SpotAsPriceGo: The instance is created as a preemptible instance for which the market price at the time of purchase is automatically used as the bid price.</p>
     * <br>
     * <p>Default value: NoSpot.</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The categories of the system disks. If Auto Scaling cannot create instances by using the disk that has the highest priority, Auto Scaling creates instances by using the disk that has the next highest priority. Valid values:</p>
     * <br>
     * <p>*   cloud: basic disk.</p>
     * <p>*   cloud_efficiency: ultra disk.</p>
     * <p>*   cloud_ssd: standard SSD.</p>
     * <p>*   cloud_essd: ESSD.</p>
     * <br>
     * <p>> If you specify the SystemDiskCategories parameter, you cannot specify the `SystemDisk.Category` parameter.</p>
     */
    @NameInMap("SystemDiskCategories")
    public java.util.List<String> systemDiskCategories;

    /**
     * <p>The tags of the ECS instance. Tags must be specified as key-value pairs. You can specify up to 20 tags. When you specify tag keys and tag values, take note of the following items:</p>
     * <br>
     * <p>*   A tag key can be up to 64 characters in length. The key cannot start with acs: or aliyun and cannot contain `http://` or `https://`. You cannot specify an empty string as a tag key.</p>
     * <p>*   A tag value can be up to 128 characters in length. The value cannot start with acs: or aliyun and cannot contain `http://` or `https://`. You can specify an empty string as a tag value.</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>Specifies whether to create an instance on a dedicated host. Valid values:</p>
     * <br>
     * <p>*   default: does not create the instance on a dedicated host.</p>
     * <p>*   host: creates the instance on a dedicated host. If you do not specify the DedicatedHostId parameter, Alibaba Cloud selects a dedicated host for the instance.</p>
     * <br>
     * <p>Default value: default.</p>
     */
    @NameInMap("Tenancy")
    public String tenancy;

    /**
     * <p>The user data of the ECS instance. The data must be encoded in Base64. The maximum size of the data before encoding is 16 KB.</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The zone ID of the ECS instance.</p>
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

    public CreateScalingConfigurationRequest setDataDisks(java.util.List<CreateScalingConfigurationRequestDataDisks> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }
    public java.util.List<CreateScalingConfigurationRequestDataDisks> getDataDisks() {
        return this.dataDisks;
    }

    public CreateScalingConfigurationRequest setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
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
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The type of the private pool that you want to use to create instances. A private pool is generated when an elasticity assurance or a capacity reservation takes effect. You can select a private pool to create instances. Valid values:</p>
         * <br>
         * <p>*   Open: open private pool. The system selects a matching open private pool to create instances. If no matching open private pools are found, the system uses the resources in the public pool to create instances. In this case, you do not need to specify the PrivatePoolOptions.Id parameter.</p>
         * <p>*   Target: specified private pool. The system uses the resources of a specified private pool to create instances. If the specified private pool is unavailable, no instances can be created. If you set this parameter to Target, you must specify the PrivatePoolOptions.Id parameter.</p>
         * <p>*   None: no private pool. The system does not use the resources of private pools to create instances.</p>
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
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>Specifies whether to enable the burst feature for the system disk. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>> This parameter is available only if you set the `SystemDisk.Category` parameter to `cloud_auto`.</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>The category of the system disk. Valid values:</p>
         * <br>
         * <p>*   cloud: basic disk.</p>
         * <p>*   cloud_efficiency: ultra disk.</p>
         * <p>*   cloud_ssd: standard SSD.</p>
         * <p>*   ephemeral_ssd: local SSD.</p>
         * <p>*   cloud_essd: enhanced SSD (ESSD).</p>
         * <p>*   cloud_auto: ESSD AutoPL disk.</p>
         * <br>
         * <p>If you specify the SystemDisk.Category parameter, you cannot specify the `SystemDiskCategories` parameter. If you do not specify the SystemDisk.Category parameter or the `SystemDiskCategories` parameter, the default value of the SystemDisk.Category parameter is used. For non-I/O optimized instances of Generation I instance types, the default value is cloud. For instances of other instance types, the default value is cloud_efficiency.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The description of the system disk. The description must be 2 to 256 characters in length. The description can contain letters but cannot start with `http://` or `https://`.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the system disk. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (\_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>The encryption algorithm that you want to use to encrypt the system disk. Valid values:</p>
         * <br>
         * <p>*   AES-256.</p>
         * <p>*   SM4-128.</p>
         * <br>
         * <p>Default value: AES-256.</p>
         */
        @NameInMap("EncryptAlgorithm")
        public String encryptAlgorithm;

        /**
         * <p>Specifies whether to encrypt the system disk. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>Default value: false.</p>
         */
        @NameInMap("Encrypted")
        public Boolean encrypted;

        /**
         * <p>The ID of the KMS key that you want to use to encrypt the system disk.</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The performance level (PL) of the system disk that is an ESSD. Valid values:</p>
         * <br>
         * <p>*   PL0: An ESSD can deliver up to 10,000 random read/write IOPS.</p>
         * <p>*   PL1: An ESSD can deliver up to 50,000 random read/write IOPS.</p>
         * <p>*   PL2: An ESSD can deliver up to 100,000 random read/write IOPS.</p>
         * <p>*   PL3: An ESSD can deliver up to 1,000,000 random read/write IOPS.</p>
         * <br>
         * <p>Default value: PL0.</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The IOPS metric that is preconfigured for the system disk.</p>
         * <br>
         * <p>> IOPS measures the number of read and write operations that an EBS device can process per second.</p>
         */
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        /**
         * <p>The size of the system disk. Unit: GiB.</p>
         * <br>
         * <p>*   Valid values if you set the SystemDisk.Category parameter to cloud: 20 to 500.</p>
         * <p>*   Valid values if you set the SystemDisk.Category parameter to cloud_efficiency: 20 to 500</p>
         * <p>*   Valid values if you set the SystemDisk.Category parameter to cloud_ssd: 20 to 500</p>
         * <p>*   Valid values if you set the SystemDisk.Category parameter to cloud_essd: 20 to 500</p>
         * <p>*   Valid values if you set the SystemDisk.Category parameter to cloud_essd: 20 to 500</p>
         * <br>
         * <p>The value of the SystemDisk.Size parameter must be greater than or equal to the value of the max{20, ImageSize} parameter.</p>
         * <br>
         * <p>Default value: max{40, ImageSize}.</p>
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

    public static class CreateScalingConfigurationRequestDataDisks extends TeaModel {
        /**
         * <p>The ID of the automatic snapshot policy that you want to apply to the data disk.</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>Specifies whether to enable the burst feature for the system disk. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>> This parameter is available only if you set the `SystemDisk.Category` parameter to `cloud_auto`.</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>The categories of the data disks. If Auto Scaling cannot create instances by using the disk that has the highest priority, Auto Scaling creates instances by using the disk that has the next highest priority. Valid values:</p>
         * <br>
         * <p>*   cloud: basic disk. The DeleteWithInstance parameter of a basic disk that is created together with the instance is set to true.</p>
         * <p>*   cloud_efficiency: ultra disk.</p>
         * <p>*   cloud_ssd: standard SSD.</p>
         * <p>*   cloud_essd: ESSD.</p>
         * <br>
         * <p>> If you specify the Categories parameter, you cannot specify the `DataDisks.Category` parameter.</p>
         */
        @NameInMap("Categories")
        public java.util.List<String> categories;

        /**
         * <p>The category of the data disk. Valid values:</p>
         * <br>
         * <p>*   cloud: basic disk.</p>
         * <p>*   cloud_efficiency: ultra disk.</p>
         * <p>*   cloud_ssd: standard SSD.</p>
         * <p>*   cloud_essd: ESSD.</p>
         * <p>*   ephemeral_ssd: local SSD.</p>
         * <p>*   cloud_auto: ESSD AutoPL disk.</p>
         * <br>
         * <p>If you specify the SystemDisk.Category parameter, you cannot specify the `SystemDiskCategories` parameter. If you do not specify the SystemDisk.Category parameter or the `SystemDiskCategories` parameter, the default value of the SystemDisk.Category parameter is used. For non-I/O optimized instances of Generation I instance types, the default value is cloud. For instances of other instance types, the default value is cloud_efficiency.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Specifies whether to release the data disk when the instance to which the data disk is attached is released. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>This parameter is available only for independent disks whose DataDisks.Category parameter is set to cloud, cloud_efficiency, cloud_ssd, or cloud_essd. If you specify this parameter for other disks, an error is reported.</p>
         * <br>
         * <p>Default value: true.</p>
         */
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        /**
         * <p>The description of the data disk. The description must be 2 to 256 characters in length. It cannot start with `http://` or `https://`.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The mount target of the data disk. If you do not specify the Device parameter, a mount target is automatically created when Auto Scaling creates ECS instances. The name of the mount target ranges from /dev/xvdb to /dev/xvdz.</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The name of the system disk. The name must be 2 to 128 characters in length, and can contain letters, digits, colons (:), underscores (\_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>Specifies whether to encrypt the data disk. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>Default value: false.</p>
         */
        @NameInMap("Encrypted")
        public String encrypted;

        /**
         * <p>The ID of the Key Management Service (KMS) key that you want to use to encrypt the data disk.</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The PL of the data disk that is an ESSD. Valid values:</p>
         * <br>
         * <p>*   PL0: An ESSD can deliver up to 10,000 random read/write IOPS.</p>
         * <p>*   PL1: An ESSD can deliver up to 50,000 random read/write IOPS.</p>
         * <p>*   PL2: An ESSD can deliver up to 100,000 random read/write IOPS.</p>
         * <p>*   PL3: An ESSD can deliver up to 1,000,000 random read/write IOPS.</p>
         * <br>
         * <p>> For more information about how to choose ESSD PLs, see [ESSD](~~122389~~).</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The input/output operations per second (IOPS) metric that is preconfigured for the data disk.</p>
         * <br>
         * <p>> IOPS measures the number of read and write operations that an Elastic Block Storage (EBS) device can process per second.</p>
         */
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        /**
         * <p>The size of the data disk. Unit: GiB.</p>
         * <br>
         * <p>*   Valid values if you set the Categories parameter to cloud: 5 to 2000.</p>
         * <p>*   Valid values if you set the Categories parameter to cloud_efficiency: 20 to 32768.</p>
         * <p>*   Valid values if you set the Categories parameter to cloud_essd: 20 to 32768.</p>
         * <p>*   Valid values if you set the Categories parameter to ephemeral_ssd: 5 to 800.</p>
         * <br>
         * <p>The value of the Size parameter must be greater than or equal to the size of the snapshot that is specified by the SnapshotId parameter.</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The ID of the snapshot that you want to use to create data disks. If you specify this parameter, the DataDisks.Size parameter is ignored. The size of the disk is the same as the size of the specified snapshot.</p>
         * <br>
         * <p>If you specify a snapshot created on or before July 15, 2013, the operation fails and the system returns InvalidSnapshot.TooOld.</p>
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
         * <p>The architectures of the instance types. Valid values:</p>
         * <br>
         * <p>*   X86: x86 architecture.</p>
         * <p>*   Heterogeneous: heterogeneous architecture, such as GPUs and FPGAs.</p>
         * <p>*   BareMetal: ECS Bare Metal Instance architecture.</p>
         * <p>*   Arm: ARM architecture.</p>
         * <p>*   SuperComputeCluster: Super Computing Cluster architecture.</p>
         * <br>
         * <p>By default, all values are included.</p>
         */
        @NameInMap("Architectures")
        public java.util.List<String> architectures;

        /**
         * <p>Specifies whether to include burstable instance types. Valid values:</p>
         * <br>
         * <p>*   Exclude: does not include burstable instance types.</p>
         * <p>*   Include: includes burstable instance types.</p>
         * <p>*   Required: includes only burstable instance types.</p>
         * <br>
         * <p>Default value: Include.</p>
         */
        @NameInMap("BurstablePerformance")
        public String burstablePerformance;

        /**
         * <p>The number of vCPUs that is specified for an instance type in intelligent configuration mode. This parameter is used to filter the available instance types that meet the specified criteria. For more information, see the [Overview of instance families](~~25378~~) topic.</p>
         * <br>
         * <p>When you specify the Cores parameter, take note of the following items:</p>
         * <br>
         * <p>*   The InstancePatternInfos parameter is available only for scaling groups that reside in virtual private clouds (VPCs).</p>
         * <p>*   If you specify the InstancePatternInfos parameter, you must also specify the Cores and Memory parameters.</p>
         * <p>*   If you specify an instance type by using the InstanceType or InstanceTypes parameter, Auto Scaling preferentially uses the instance type that is specified by the InstanceType or InstanceTypes parameter for scale-outs. If the specified instance type does not have sufficient inventory, Auto Scaling creates instances of the lowest-priced instance type that is specified by the InstancePatternInfos parameter.</p>
         */
        @NameInMap("Cores")
        public Integer cores;

        /**
         * <p>The instance type that you want to exclude. You can use wildcard characters such as an asterisk (\*) to exclude an instance type or an instance family. Examples:</p>
         * <br>
         * <p>*   ecs.c6.large: excludes the ecs.c6.large instance type.</p>
         * <p>*   ecs.c6.\*: excludes the c6 instance family.</p>
         */
        @NameInMap("ExcludedInstanceTypes")
        public java.util.List<String> excludedInstanceTypes;

        /**
         * <p>The level of the instance family, which is used to filter instance types that meet the specified criteria. This parameter is available only if you set the `CostOptimization` parameter to true. Valid values:</p>
         * <br>
         * <p>*   EntryLevel: shared instance type. Instances of this level are the most cost-effective but may not provide stable computing performance in a consistent manner. Instances of this level are suitable for business scenarios in which the CPU utilization is low. For more information, see the [Shared instance families](~~108489~~) topic.</p>
         * <p>*   EnterpriseLevel: Instances of this level provide stable performance and dedicated resources and are suitable for business scenarios that require high stability. For more information, see the [Overview of instance families](~~25378~~) topic.</p>
         * <p>*   CreditEntryLevel: This value is valid only for burstable instances. CPU credits are used to ensure computing performance. Instances of this level are suitable for business scenarios in which the CPU utilization is low but may fluctuate in specific cases. For more information, see the [Overview](~~59977~~) topic of burstable instances.</p>
         */
        @NameInMap("InstanceFamilyLevel")
        public String instanceFamilyLevel;

        /**
         * <p>The maximum hourly price for a pay-as-you-go instance or a preemptible instance in intelligent configuration mode. This parameter is used to filter the available instance types that meet the specified criteria.</p>
         * <br>
         * <p>> If you set the SpotStrategy parameter to SpotWithPriceLimit, you must specify the MaxPrice parameter. In other cases, the MaxPrice parameter is optional.</p>
         */
        @NameInMap("MaxPrice")
        public Float maxPrice;

        /**
         * <p>The memory size that is specified for an instance type in intelligent configuration mode. Unit: GiB. This parameter is used to filter the available instance types that meet the specified criteria.</p>
         */
        @NameInMap("Memory")
        public Float memory;

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

        public CreateScalingConfigurationRequestInstancePatternInfos setExcludedInstanceTypes(java.util.List<String> excludedInstanceTypes) {
            this.excludedInstanceTypes = excludedInstanceTypes;
            return this;
        }
        public java.util.List<String> getExcludedInstanceTypes() {
            return this.excludedInstanceTypes;
        }

        public CreateScalingConfigurationRequestInstancePatternInfos setInstanceFamilyLevel(String instanceFamilyLevel) {
            this.instanceFamilyLevel = instanceFamilyLevel;
            return this;
        }
        public String getInstanceFamilyLevel() {
            return this.instanceFamilyLevel;
        }

        public CreateScalingConfigurationRequestInstancePatternInfos setMaxPrice(Float maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }
        public Float getMaxPrice() {
            return this.maxPrice;
        }

        public CreateScalingConfigurationRequestInstancePatternInfos setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

    }

    public static class CreateScalingConfigurationRequestInstanceTypeOverrides extends TeaModel {
        /**
         * <p>The instance type that you want to use to override the instance type that is specified in the launch template.</p>
         * <br>
         * <p>If you want to scale instances based on the weighted capacities of the instances, you must specify the InstanceType parameter and the WeightedCapacity parameter. You can specify 1 to 10 instance types by using the Extended Configurations feature of the launch template.</p>
         * <br>
         * <p>> This parameter is available only if you specify the LaunchTemplateId parameter.</p>
         * <br>
         * <p>You can specify an instance type that is available for purchase as the value of the InstanceType parameter.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>If you want to specify the weight of the specified instance type in the scaling configuration, you must specify the WeightedCapacity parameter after you specify the InstanceType parameter.</p>
         * <br>
         * <p>The weight of an instance type specifies the capacity of an instance of the instance type in the scaling group. A higher weight specifies that a smaller number of instances of the specified instance type are required to meet the expected capacity requirement.</p>
         * <br>
         * <p>Performance metrics, such as the number of vCPUs and the memory size of each instance type, may vary. You can specify different weights for different instance types based on your business requirements.</p>
         * <br>
         * <p>Example:</p>
         * <br>
         * <p>*   Current capacity: 0</p>
         * <p>*   Expected capacity: 6</p>
         * <p>*   Capacity of ecs.c5.xlarge: 4</p>
         * <br>
         * <p>To meet the expected capacity requirement, Auto Scaling must create and add two ecs.c5.xlarge instances.</p>
         * <br>
         * <p>> The capacity of the scaling group cannot exceed the sum of the maximum number of instances that is specified by the MaxSize parameter and the maximum weight of the instance types.</p>
         * <br>
         * <p>Valid values of the WeightedCapacity parameter: 1 to 500.</p>
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

    public static class CreateScalingConfigurationRequestSpotPriceLimits extends TeaModel {
        /**
         * <p>The instance type of the preemptible instance. This parameter is available only if you set the SpotStrategy parameter to SpotWithPriceLimit.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The price limit of the preemptible instance. This parameter is available only if you set the SpotStrategy parameter to SpotWithPriceLimit.</p>
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
