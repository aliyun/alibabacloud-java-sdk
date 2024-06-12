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
     * <p>Specifies whether to associate an ECS instance on a dedicated host with the dedicated host. Valid values:</p>
     * <br>
     * <p>*   default: does not associate the ECS instance with the dedicated host. If you start an instance that is stopped in economical mode and the original dedicated host has insufficient resources, the instance is automatically deployed to another dedicated host in the automatic deployment resource pool.</p>
     * <p>*   host: associates the ECS instance with the dedicated host. If you start an ECS instance that is stopped in economical mode, the ECS instance remains on the original dedicated host. If the original dedicated host has insufficient resources, the ECS instance fails to start.</p>
     */
    @NameInMap("Affinity")
    public String affinity;

    /**
     * <p>The number of vCPUs.</p>
     * <br>
     * <p>You can specify the number of vCPUs and the memory size to determine the range of instance types. For example, you can set Cpu to 2 and Memory to 16 to specify instance types that have 2 vCPUs and 16 GiB of memory. If you specify Cpu and Memory, Auto Scaling determines the available instance types based on factors such as I/O optimization requirements and zones. Then, Auto Scaling preferentially creates instances by using the lowest-priced instance type.</p>
     * <br>
     * <p>> You can specify CPU and Memory to determine the range of instance types only if you set Scaling Policy to Cost Optimization Policy and you do not specify an instance type in the scaling configuration.</p>
     */
    @NameInMap("Cpu")
    public Integer cpu;

    /**
     * <p>The performance mode of the burstable instance. Valid values:</p>
     * <br>
     * <p>*   Standard: standard mode. For more information, see the "Standard mode" section in the [Burstable instances](https://help.aliyun.com/document_detail/59977.html) topic.</p>
     * <p>*   Unlimited: unlimited mode. For more information, see the "Unlimited mode" section in the [Burstable instances](https://help.aliyun.com/document_detail/59977.html) topic.</p>
     */
    @NameInMap("CreditSpecification")
    public String creditSpecification;

    @NameInMap("CustomPriorities")
    public java.util.List<ModifyScalingConfigurationRequestCustomPriorities> customPriorities;

    /**
     * <p>The data disks.</p>
     */
    @NameInMap("DataDisks")
    public java.util.List<ModifyScalingConfigurationRequestDataDisks> dataDisks;

    @NameInMap("DedicatedHostClusterId")
    public String dedicatedHostClusterId;

    /**
     * <p>The ID of the dedicated host on which you want to create ECS instances. You cannot create preemptible instances on dedicated hosts. If you specify DedicatedHostId, SpotStrategy and SpotPriceLimit are ignored.</p>
     * <br>
     * <p>You can call the DescribeDedicatedHosts operation to query the most recent list of dedicated host IDs.</p>
     */
    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>The ID of the deployment set of the ECS instances that are created by using the scaling configuration.</p>
     */
    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    /**
     * <p>The hostname of the ECS instance. The hostname cannot start or end with a period (.) or a hyphen (-). The hostname cannot contain consecutive periods (.) or hyphens (-). Naming conventions for different types of instances:</p>
     * <br>
     * <p>*   Windows instances: The hostname must be 2 to 15 characters in length, and can contain letters, digits, and hyphens (-). The hostname cannot contain periods (.) or contain only digits.</p>
     * <p>*   Other instances, such as Linux instances: The hostname must be 2 to 64 characters in length. Separate a hostname into multiple segments with periods (.). Each segment can contain letters, digits, and hyphens (-).</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The ID of the Elastic High Performance Computing (E-HPC) cluster to which the ECS instances belong.</p>
     */
    @NameInMap("HpcClusterId")
    public String hpcClusterId;

    /**
     * <p>The name of the image family. If you specify this parameter, the latest custom images that are available in the specified image family are returned. Then, you can use the images to create instances. If you specify ImageId, you cannot specify ImageFamily.</p>
     */
    @NameInMap("ImageFamily")
    public String imageFamily;

    /**
     * <p>The ID of the image that is used by Auto Scaling to automatically create ECS instances.</p>
     * <br>
     * <p>> If the image that is specified in the scaling configuration contains system disks and data disks, the data that is stored in the data disks is cleared after you modify the image.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The name of the image. Each image name must be unique in a region. If you specify ImageId, ImageName is ignored.</p>
     * <br>
     * <p>You cannot use ImageName to specify images from Alibaba Cloud Marketplace.</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The description of the ECS instance. The description must be 2 to 256 characters in length. The description can contain letters but cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("InstanceDescription")
    public String instanceDescription;

    /**
     * <p>The name of the Elastic Compute Service (ECS) instance that is automatically created by using the scaling configuration.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The intelligent configuration settings, which determines the range of instance types that meet the specified criteria.</p>
     */
    @NameInMap("InstancePatternInfos")
    public java.util.List<ModifyScalingConfigurationRequestInstancePatternInfos> instancePatternInfos;

    /**
     * <p>The instance types.</p>
     */
    @NameInMap("InstanceTypeOverrides")
    public java.util.List<ModifyScalingConfigurationRequestInstanceTypeOverrides> instanceTypeOverrides;

    /**
     * <p>The instance type. If you specify InstanceTypes, InstanceType is ignored.</p>
     * <br>
     * <p>Auto Scaling creates instances based on the priorities of instance types. If Auto Scaling cannot create instances by using the instance type that has the highest priority, Auto Scaling creates instances by using the instance type that has the next highest priority.</p>
     */
    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    /**
     * <p>The metering method for network usage. Valid values:</p>
     * <br>
     * <p>*   PayByBandwidth: You are charged for the maximum available bandwidth that is specified by InternetMaxBandwidthOut.</p>
     * <p>*   PayByTraffic: You are charged for the actual data transfer. InternetMaxBandwidthOut specifies only the maximum available bandwidth.</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The maximum outbound public bandwidth. Unit: Mbit/s. Valid values:</p>
     * <br>
     * <p>*   If you set InternetChargeType to PayByBandwidth: 0 to 100. If you leave this parameter empty, this parameter is automatically set to 0.</p>
     * <p>*   If you set InternetChargeType to PayByTraffic: 0 to 100. If you leave this parameter empty, an error is returned.</p>
     */
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    /**
     * <p>Specifies whether to create an I/O optimized instance. Valid values:</p>
     * <br>
     * <p>*   none: does not create an I/O optimized instance.</p>
     * <p>*   optimized: creates an I/O optimized instance.</p>
     */
    @NameInMap("IoOptimized")
    public String ioOptimized;

    /**
     * <p>The number of randomly generated IPv6 addresses that you want to allocate to the elastic network interface (ENI).</p>
     */
    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    /**
     * <p>The name of the key pair that you can use to log on to an ECS instance.</p>
     * <br>
     * <p>*   Windows instances do not support this parameter.</p>
     * <p>*   By default, the username and password authentication method is disabled for Linux instances.</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The weight of an ECS instance as a backend server. Valid values: 1 to 100.</p>
     */
    @NameInMap("LoadBalancerWeight")
    public Integer loadBalancerWeight;

    /**
     * <p>The memory size. Unit: GiB.</p>
     * <br>
     * <p>You can specify the number of vCPUs and the memory size to determine the range of instance types. For example, you can set Cpu to 2 and Memory to 16 to specify instance types that have 2 vCPUs and 16 GiB of memory. If you specify Cpu and Memory, Auto Scaling determines the available instance types based on factors such as I/O optimization requirements and zones. Then, Auto Scaling preferentially creates instances by using the lowest-priced instance type.</p>
     * <br>
     * <p>> You can specify CPU and Memory to determine the range of instance types only if you set Scaling Policy to Cost Optimization Policy and you do not specify an instance type in the scaling configuration.</p>
     */
    @NameInMap("Memory")
    public Integer memory;

    @NameInMap("NetworkInterfaces")
    public java.util.List<ModifyScalingConfigurationRequestNetworkInterfaces> networkInterfaces;

    /**
     * <p>Specifies whether to override existing data. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Override")
    public Boolean override;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to use the password that is preconfigured in the image. Before you use this parameter, make sure that a password is configured in the image.</p>
     */
    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    /**
     * <p>The name of the RAM role that you want to attach to the ECS instance. The name is provided and maintained by Resource Access Management (RAM). You can call the ListRoles operation to query the available RAM roles. You can call the CreateRole operation to create RAM roles.</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The ID of the resource group to which the ECS instances belong.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The ID of the scaling configuration that you want to modify.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ScalingConfigurationId")
    public String scalingConfigurationId;

    /**
     * <p>The name of the scaling configuration. The name must be 2 to 64 characters in length, and can contain letters, digits, underscores (_), hyphens (-), and periods (.). The name must start with a letter or a digit.</p>
     * <br>
     * <p>The name of the scaling configuration must be unique in a region. If you do not specify this parameter, the scaling configuration ID is used.</p>
     */
    @NameInMap("ScalingConfigurationName")
    public String scalingConfigurationName;

    /**
     * <p>The scheduler options.</p>
     */
    @NameInMap("SchedulerOptions")
    public java.util.Map<String, ?> schedulerOptions;

    /**
     * <p>The ID of the security group with which ECS instances are associated. The ECS instances that are associated with the same security group can access each other.</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The IDs of the security groups.</p>
     */
    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    /**
     * <p>The retention period of the preemptible instance. Unit: hours. Valid values: 0, 1, 2, 3, 4, 5, and 6.</p>
     * <br>
     * <p>*   The following retention periods are available in invitational preview: 2, 3, 4, 5, and 6 hours. If you want to set this parameter to one of these values, submit a ticket.</p>
     * <p>*   If you set this parameter to 0, no retention period is specified for the preemptible instance.</p>
     */
    @NameInMap("SpotDuration")
    public Integer spotDuration;

    /**
     * <p>The interruption mode of the preemptible instance. Default value: Terminate. Set the value to Terminate. This value specifies that the preemptible instance is to be released.</p>
     */
    @NameInMap("SpotInterruptionBehavior")
    public String spotInterruptionBehavior;

    /**
     * <p>The preemptible instance types.</p>
     */
    @NameInMap("SpotPriceLimits")
    public java.util.List<ModifyScalingConfigurationRequestSpotPriceLimits> spotPriceLimits;

    /**
     * <p>The preemption policy that you want to apply to pay-as-you-go instances and preemptible instances. Valid values:</p>
     * <br>
     * <p>*   NoSpot: The instance is created as a pay-as-you-go instance.</p>
     * <p>*   SpotWithPriceLimit: The instance is a preemptible instance that has a user-defined maximum hourly price.</p>
     * <p>*   SpotAsPriceGo: The instance is created as a preemptible instance for which the market price at the time of purchase is automatically used as the bidding price.</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("StorageSetId")
    public String storageSetId;

    @NameInMap("StorageSetPartitionNumber")
    public Integer storageSetPartitionNumber;

    /**
     * <p>The categories of the system disks. If Auto Scaling cannot create instances by using the disk category that has the highest priority, Auto Scaling creates instances by using the disk category that has the next highest priority. Valid values:</p>
     * <br>
     * <p>*   cloud: basic disk</p>
     * <p>*   cloud_efficiency: ultra disk</p>
     * <p>*   cloud_ssd: standard SSD</p>
     * <p>*   cloud_essd: ESSD</p>
     * <br>
     * <p>> If you specify SystemDiskCategories, you cannot specify `SystemDisk.Category`.</p>
     */
    @NameInMap("SystemDiskCategories")
    public java.util.List<String> systemDiskCategories;

    /**
     * <p>The tags of the ECS instance. Specify the tags as key-value pairs. You can specify up to 20 tags. When you specify tag keys and tag values, take note of the following items:</p>
     * <br>
     * <p>*   A tag key can be up to 64 characters in length. The key cannot start with `acs:` or `aliyun`, and cannot contain `http://` or `https://`. The tag key cannot be an empty string.</p>
     * <p>*   A tag value can be up to 128 characters in length. The value cannot start with `acs:` or `aliyun`, and cannot contain `http://` or `https://`. The tag value can be an empty string.</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>Specifies whether to create an ECS instance on a dedicated host. Valid values:</p>
     * <br>
     * <p>*   default: does not create the ECS instance on a dedicated host.</p>
     * <p>*   host: creates the ECS instance on a dedicated host. If you do not specify DedicatedHostId, Alibaba Cloud selects a dedicated host for the ECS instance.</p>
     */
    @NameInMap("Tenancy")
    public String tenancy;

    /**
     * <p>The user data of the ECS instance. The data must be encoded in Base64. The maximum size of the data before encoding is 16 KB.</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The zone ID of the ECS instances that are created by using the scaling configuration.</p>
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
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The type of the private pool that you want to use to start instances. A private pool is generated when an elasticity assurance or a capacity reservation takes effect. You can select a private pool for Auto Scaling to start instances. Valid values:</p>
         * <br>
         * <p>*   Open: open private pool. Auto Scaling selects a matching open private pool to start instances. If no matching open private pools exist, Auto Scaling uses the resources in the public pool to start instances. In this case, you do not need to specify PrivatePoolOptions.Id.</p>
         * <p>*   Target: specified private pool. Auto Scaling uses the resources in the specified private pool to start instances. If the private pool is unavailable, Auto Scaling cannot start the instances. If you set this parameter to Target, you must specify PrivatePoolOptions.Id.</p>
         * <p>*   None: no private pool: Auto Scaling does not use the resources in private pools to start instances.</p>
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
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>Specifies whether to enable the burst feature for the system disk. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>> This parameter is available only if you set `SystemDisk.Category` to `cloud_auto`.</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>The category of the system disk. Valid values:</p>
         * <br>
         * <p>*   cloud: basic disk</p>
         * <p>*   cloud_efficiency: ultra disk</p>
         * <p>*   cloud_ssd: standard SSD</p>
         * <p>*   cloud_essd: enhanced SSD (ESSD)</p>
         * <p>*   ephemeral_ssd: local SSD</p>
         * <br>
         * <p>If you specify SystemDisk.Category, you cannot specify `SystemDiskCategories`. If you do not specify SystemDisk.Category or `SystemDiskCategories`, the default value of SystemDisk.Category is used. For non-I/O optimized instances of Generation I instance types, the default value is cloud. For instances of other instance types, the default value is cloud_efficiency.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The description of the system disk. The description must be 2 to 256 characters in length. The description can contain letters but cannot start with `http://` or `https://`.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the system disk. The name must be 2 to 128 characters in length, and can contain letters, digits, colons (:), underscores (_), and hyphens (-). The name must start with a letter but cannot start with `http:// `or `https://`. </p>
         * <br>
         * <p>Default value: null.</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>The algorithm that you want to use to encrypt the system disk. Valid values:</p>
         * <br>
         * <p>*   AES-256</p>
         * <p>*   SM4-128</p>
         * <br>
         * <p>Default value: AES-256</p>
         */
        @NameInMap("EncryptAlgorithm")
        public String encryptAlgorithm;

        /**
         * <p>Specifies whether to encrypt the system disk. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>Default value: false</p>
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
         * <p>*   PL0: An ESSD can provide up to 10,000 random read/write IOPS.</p>
         * <p>*   PL1: An ESSD can provide up to 50,000 random read/write IOPS.</p>
         * <p>*   PL2: An ESSD can provide up to 100,000 random read/write IOPS.</p>
         * <p>*   PL3: An ESSD can provide up to 1,000,000 random read/write IOPS.</p>
         * <br>
         * <p>> For more information about how to select ESSD PLs, see [ESSD](https://help.aliyun.com/document_detail/122389.html).</p>
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
         * <p>The size of the system disk. Unit: GiB. Valid values:</p>
         * <br>
         * <p>*   If you set SystemDisk.Category to cloud: 20 to 500.</p>
         * <p>*   If you set SystemDisk.Category to cloud_efficiency: 20 to 500.</p>
         * <p>*   If you set SystemDisk.Category to cloud_ssd: 20 to 500.</p>
         * <p>*   If you set SystemDisk.Category to cloud_essd: 20 to 500.</p>
         * <p>*   If you set SystemDisk.Category to ephemeral_ssd: 20 to 500.</p>
         * <br>
         * <p>The value of SystemDisk.Size must be greater than or equal to max{20, ImageSize}.</p>
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
        @NameInMap("InstanceType")
        public String instanceType;

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
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>Specifies whether to enable the burst feature for the system disk. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>> This parameter is available only if you set `SystemDisk.Category` to `cloud_auto`.</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>The categories of the data disks. Valid values:</p>
         * <br>
         * <p>*   cloud: basic disk. The DeleteWithInstance attribute of a basic disk that is created together with the instance is set to true.</p>
         * <p>*   cloud_efficiency: ultra disk.</p>
         * <p>*   cloud_ssd: standard SSD.</p>
         * <p>*   cloud_essd: ESSD.</p>
         * <br>
         * <p>> If you specify Categories, you cannot specify `DataDisk.Category`.</p>
         */
        @NameInMap("Categories")
        public java.util.List<String> categories;

        /**
         * <p>The category of the data disk. Valid values:</p>
         * <br>
         * <p>*   cloud: basic disk. The DeleteWithInstance attribute of a basic disk that is created together with the instance is set to true.</p>
         * <p>*   cloud_efficiency: ultra disk.</p>
         * <p>*   cloud_ssd: standard SSD.</p>
         * <p>*   ephemeral_ssd: local SSD.</p>
         * <p>*   cloud_essd: ESSD.</p>
         * <br>
         * <p>If you specify Category, you cannot specify `Categories`. If you do not specify Category or `Categories`, the default value of Category is used:</p>
         * <br>
         * <p>*   For I/O optimized instances, the default value is cloud_efficiency.</p>
         * <p>*   For non-I/O optimized instances, the default value is cloud.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Specifies whether to release the data disk when the instance to which the data disk is attached is released. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>This parameter is available only for independent disks whose Category is set to cloud, cloud_efficiency, cloud_ssd, cloud_essd, or cloud_auto. If you specify this parameter for other disks, an error is reported.</p>
         */
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        /**
         * <p>The description of the system disk. The description must be 2 to 256 characters in length. The description can contain letters but cannot start with `http://` or `https://`.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The mount target of the data disk. If you do not specify Device, a mount target is automatically assigned when Auto Scaling creates ECS instances. The name of the mount target ranges from /dev/xvdb to /dev/xvdz.</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The name of the system disk. The name must be 2 to 128 characters in length, and can contain letters, digits, colons (:), underscores (_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>Specifies whether to encrypt the system disk. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
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
         * <p>*   PL0: An ESSD can provide up to 10,000 random read/write IOPS.</p>
         * <p>*   PL1: An ESSD can provide up to 50,000 random read/write IOPS.</p>
         * <p>*   PL2: An ESSD can provide up to 100,000 random read/write IOPS.</p>
         * <p>*   PL3: An ESSD can provide up to 1,000,000 random read/write IOPS.</p>
         * <br>
         * <p>> For more information about how to select ESSD PLs, see [ESSD](https://help.aliyun.com/document_detail/122389.html).</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The IOPS metric that is preconfigured for the data disk.</p>
         * <br>
         * <p>> IOPS measures the number of read and write operations that an Elastic Block Storage (EBS) device can process per second.</p>
         */
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        /**
         * <p>The size of the data disk. Unit: GiB. Valid values:</p>
         * <br>
         * <p>*   If you set Categories cloud: 5 to 2000.</p>
         * <p>*   If you set Categories to cloud_efficiency: 20 to 32768.</p>
         * <p>*   If you set Categories to cloud_ssd: 20 to 32768.</p>
         * <p>*   If you set Categories to cloud_essd: 20 to 32768.</p>
         * <p>*   If you set Categories to ephemeral_ssd: 5 to 800.</p>
         * <br>
         * <p>The size of the data disk must be greater than or equal to the size of the snapshot that is specified by SnapshotId.</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The ID of the snapshot that you want to use to create data disks. If you specify this parameter, DataDisk.N.Size is ignored. The size of the disk is the same as the size of the specified snapshot.</p>
         * <br>
         * <p>If you specify a snapshot that is created on or before July 15, 2013, the operation fails and the system returns InvalidSnapshot.TooOld.</p>
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
         * <p>The architectures of the instance types.</p>
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
         * <p>Default value: Include</p>
         */
        @NameInMap("BurstablePerformance")
        public String burstablePerformance;

        /**
         * <p>The number of vCPUs that you want to allocate to an instance type in intelligent configuration mode. You can use this parameter to filter the available instance types that meet the specified criteria. For more information, see [Overview of instance families](https://help.aliyun.com/document_detail/25378.html).</p>
         * <br>
         * <p>When you specify this parameter, take note of the following items:</p>
         * <br>
         * <p>*   InstancePatternInfo is available only for scaling groups that reside in VPCs.</p>
         * <p>*   If you specify InstancePatternInfo, you must also specify Cores and Memory.</p>
         * <p>*   If you specify an instance type by using InstanceType or InstanceTypes, Auto Scaling preferentially creates instances by using the instance type that is specified by InstanceType or InstanceTypes for scale-outs. If the specified instance type does not have sufficient inventory, Auto Scaling creates instances by using the lowest-priced instance type that is specified by InstancePatternInfo.</p>
         */
        @NameInMap("Cores")
        public Integer cores;

        @NameInMap("CpuArchitectures")
        public java.util.List<String> cpuArchitectures;

        /**
         * <p>The instance types that you want to exclude. You can use wildcard characters such as an asterisk (\\*) to exclude an instance type or an instance family. Examples:</p>
         * <br>
         * <p>*   ecs.c6.large: excludes the ecs.c6.large instance type.</p>
         * <p>*   ecs.c6.\\*: excludes the c6 instance family.</p>
         */
        @NameInMap("ExcludedInstanceTypes")
        public java.util.List<String> excludedInstanceTypes;

        @NameInMap("GpuSpecs")
        public java.util.List<String> gpuSpecs;

        @NameInMap("InstanceCategories")
        public java.util.List<String> instanceCategories;

        /**
         * <p>The level of the instance family. You can use this parameter to filter instance types that meet the specified criteria. This parameter takes effect only if you set `CostOptimization` to true. Valid values:</p>
         * <br>
         * <p>*   EntryLevel: entry level (shared instance type). Instance types of this level are the most cost-effective but may not provide stable computing performance in a consistent manner. Instance types of this level are suitable for business scenarios in which CPU utilization is low. For more information, see [Shared instance families](https://help.aliyun.com/document_detail/108489.html).</p>
         * <p>*   EnterpriseLevel: enterprise level. Instance types of this level provide stable performance and dedicated resources and are suitable for business scenarios that require high stability. For more information, see the [Overview of instance families](https://help.aliyun.com/document_detail/25378.html) topic.</p>
         * <p>*   CreditEntryLevel: credit entry level. This value is valid only for burstable instances. CPU credits are used to ensure computing performance. Instance types of this level are suitable for business scenarios in which CPU utilization is low but may fluctuate in specific scenarios. For more information, see [Overview](https://help.aliyun.com/document_detail/59977.html) of burstable instances.</p>
         */
        @NameInMap("InstanceFamilyLevel")
        public String instanceFamilyLevel;

        @NameInMap("InstanceTypeFamilies")
        public java.util.List<String> instanceTypeFamilies;

        /**
         * <p>The maximum hourly price for a pay-as-you-go instance or a preemptible instance in intelligent configuration mode. You can use this parameter to filter the available instance types that meet the specified criteria.</p>
         * <br>
         * <p>> If you set SpotStrategy to SpotWithPriceLimit, specify MaxPrice. In other scenarios, MaxPrice is optional.</p>
         */
        @NameInMap("MaxPrice")
        public Float maxPrice;

        @NameInMap("MaximumCpuCoreCount")
        public Integer maximumCpuCoreCount;

        @NameInMap("MaximumGpuAmount")
        public Integer maximumGpuAmount;

        @NameInMap("MaximumMemorySize")
        public Float maximumMemorySize;

        /**
         * <p>The memory size that you want to allocate to an instance type in intelligent configuration mode. Unit: GiB. You can use this parameter to filter the available instance types that meet the specified criteria.</p>
         */
        @NameInMap("Memory")
        public Float memory;

        @NameInMap("MinimumBaselineCredit")
        public Integer minimumBaselineCredit;

        @NameInMap("MinimumCpuCoreCount")
        public Integer minimumCpuCoreCount;

        @NameInMap("MinimumEniIpv6AddressQuantity")
        public Integer minimumEniIpv6AddressQuantity;

        @NameInMap("MinimumEniPrivateIpAddressQuantity")
        public Integer minimumEniPrivateIpAddressQuantity;

        @NameInMap("MinimumEniQuantity")
        public Integer minimumEniQuantity;

        @NameInMap("MinimumGpuAmount")
        public Integer minimumGpuAmount;

        @NameInMap("MinimumInitialCredit")
        public Integer minimumInitialCredit;

        @NameInMap("MinimumMemorySize")
        public Float minimumMemorySize;

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
         * <p>The instance type. If you want to specify the capacity of instance types in the scaling configuration, specify InstanceType and WeightedCapacity at the same time.</p>
         * <br>
         * <p>You can use InstanceType to specify multiple instance types and WeightedCapacity to specify the weights of the instance types.</p>
         * <br>
         * <p>> If you specify InstanceType, you cannot specify InstanceTypes.</p>
         * <br>
         * <p>You can use InstanceType to specify only instance types that are available for purchase.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The weight of the instance type. The weight specifies the capacity of an instance of the specified instance type in the scaling group. If you want Auto Scaling to scale instances in the scaling group based on the weighted capacity of the instances, specify WeightedCapacity after you specify InstanceType.</p>
         * <br>
         * <p>A higher weight specifies that a smaller number of instances of the specified instance type are required to meet the expected capacity requirement.</p>
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
         * <p>> The capacity of the scaling group cannot exceed the sum of the maximum number of instances that is specified by MaxSize and the maximum weight of the instance types.</p>
         * <br>
         * <p>Valid values of WeightedCapacity: 1 to 500.</p>
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
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Ipv6AddressCount")
        public Integer ipv6AddressCount;

        @NameInMap("NetworkInterfaceTrafficMode")
        public String networkInterfaceTrafficMode;

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

        public ModifyScalingConfigurationRequestNetworkInterfaces setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

    }

    public static class ModifyScalingConfigurationRequestSpotPriceLimits extends TeaModel {
        /**
         * <p>The instance type of the preemptible instance. This parameter takes effect only if you set SpotStrategy to SpotWithPriceLimit.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The price limit of the preemptible instance. This parameter takes effect only if you set SpotStrategy to SpotWithPriceLimit.</p>
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
