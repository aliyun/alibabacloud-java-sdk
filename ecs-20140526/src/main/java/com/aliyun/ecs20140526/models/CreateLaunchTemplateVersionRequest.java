// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateLaunchTemplateVersionRequest extends TeaModel {
    @NameInMap("SystemDisk")
    public CreateLaunchTemplateVersionRequestSystemDisk systemDisk;

    // The automatic release time of the instance. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
    // 
    // *   If the value of seconds (`ss`) is not `00`, the time is automatically rounded to the nearest minute based on the value of minutes (`mm`).
    // *   The specified time must be at least 30 minutes later than the current time.
    // *   The specified time must be at most three years from the current time.
    @NameInMap("AutoReleaseTime")
    public String autoReleaseTime;

    // The list of data disks.
    @NameInMap("DataDisk")
    public java.util.List<CreateLaunchTemplateVersionRequestDataDisk> dataDisk;

    // The ID of the deployment set.
    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    // The description of the instance. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
    @NameInMap("Description")
    public String description;

    // Specifies whether to enable the operating system configuration of the instance.
    @NameInMap("EnableVmOsConfig")
    public Boolean enableVmOsConfig;

    // The hostname of the instance.
    // 
    // *   The hostname cannot start or end with a period (.) or hyphen (-). It cannot contain consecutive periods (.) or hyphens (-).
    // *   For Windows instances, the hostname must be 2 to 15 characters in length and cannot contain periods (.) or contain only digits. It can contain letters, digits, and hyphens (-).
    // *   For instances that run other operating systems such as Linux, the hostname must be 2 to 64 characters in length. You can use periods (.) to separate the hostname into multiple segments. Each segment can contain letters, digits, and hyphens (-).
    @NameInMap("HostName")
    public String hostName;

    // The ID of the image to use to create the Elastic Compute Service (ECS) instance. You can call the [DescribeImages](~~25534~~) operation to query available images.
    @NameInMap("ImageId")
    public String imageId;

    // The source of the image.
    // 
    // >  This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.
    @NameInMap("ImageOwnerAlias")
    public String imageOwnerAlias;

    // The billing method of the instance. Valid values:
    // 
    // *   PrePaid: subscription. If you set this parameter to PrePaid, make sure that your account supports payment by credit. Otherwise, an `InvalidPayMethod` error is returned.
    // *   PostPaid: pay-as-you-go.
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    // The name of the instance. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
    @NameInMap("InstanceName")
    public String instanceName;

    // The instance type. For more information, see [Instance families](~~25378~~) or call the [DescribeInstanceTypes](~~25620~~) operation to query the most recent instance type list.
    @NameInMap("InstanceType")
    public String instanceType;

    // The billing method for network usage. Valid values:
    // 
    // *   PayByBandwidth: pay-by-bandwidth
    // *   PayByTraffic: pay-by-traffic
    // 
    // >  When the **pay-by-traffic** billing method for network usage is used, the maximum inbound and outbound bandwidth values are used as upper limits of bandwidths instead of guaranteed performance specifications. In scenarios where demand outstrips resource supplies, these maximum bandwidths may be limited. If you want guaranteed bandwidths for your instance, use the **pay-by-bandwidth** billing method for network usage.
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    // The maximum inbound public bandwidth. Unit: Mbit/s. Valid values:
    // 
    // *   If the purchased outbound public bandwidth is less than or equal to 10 Mbit/s, the valid values of InternetMaxBandwidthIn are 1 to 10, and the default value is 10.
    // *   If the purchased outbound public bandwidth is greater than 10 Mbit/s, the valid values of this parameter are 1 to the `InternetMaxBandwidthOut` value, and the default value is the `InternetMaxBandwidthOut` value.
    @NameInMap("InternetMaxBandwidthIn")
    public Integer internetMaxBandwidthIn;

    // The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    // Specifies whether the instance is I/O optimized. Valid values:
    // 
    // *   none: The instance is not I/O optimized.
    // *   optimized: The instance is I/O optimized.
    @NameInMap("IoOptimized")
    public String ioOptimized;

    // The number of IPv6 addresses to be randomly generated for the primary elastic network interface (ENI). Valid values: 1 to 10.
    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    // The name of the key pair.
    // 
    // *   For Windows instances, this parameter is ignored. The `Password` parameter takes effect even if the KeyPairName parameter is specified.
    // *   For Linux instances, the password-based logon method is disabled by default.
    @NameInMap("KeyPairName")
    public String keyPairName;

    // The ID of the launch template. For more information, see [DescribeLaunchTemplates](~~73759~~). You must specify `LaunchTemplateId` or `LaunchTemplateName` to determine a launch template.
    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    // The name of the launch template. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
    @NameInMap("LaunchTemplateName")
    public String launchTemplateName;

    @NameInMap("NetworkInterface")
    public java.util.List<CreateLaunchTemplateVersionRequestNetworkInterface> networkInterface;

    // The network type of the instance. Valid values:
    // 
    // *   classic: classic network
    // *   vpc: VPC
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // Specifies whether to use the password preset in the image.
    // 
    // >  When you use this parameter, leave Password empty and make sure that the selected image has a password preset.
    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    // The subscription period of the instance. Unit: months. This parameter is valid and required only when `InstanceChargeType` is set to `PrePaid`. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.
    @NameInMap("Period")
    public Integer period;

    // The private IP address of the instance.
    // 
    // To assign a private IP address to an instance of the VPC type, make sure that the IP address is an idle IP address within the CIDR block of the vSwitch specified by the `VSwitchId` parameter.
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    // The name of the instance Resource Access Management (RAM) role. You can call the [ListRoles](~~28713~~) operation provided by RAM to query the instance RAM roles that you created.
    @NameInMap("RamRoleName")
    public String ramRoleName;

    // The region ID of the launch template. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the resource group.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // Specifies whether to enable security hardening for the operating system. Valid values:
    // 
    // *   Active: enables security hardening. This value is applicable only to public images.
    // *   Deactive: disables security hardening. This value is applicable to all image types.
    @NameInMap("SecurityEnhancementStrategy")
    public String securityEnhancementStrategy;

    // The ID of the security group to which to assign the instance. Instances within the same security group can access each other.
    // 
    // >  You cannot specify both `SecurityGroupId` and `SecurityGroupIds.N`.
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    // The IDs of the security groups to assign the instance.
    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    // The protection period of the preemptible instance. Unit: hours. Valid values: 0, 1, 2, 3, 4, 5, and 6.
    // 
    // *   Protection periods of 2, 3, 4, 5, and 6 hours are in invitational preview. If you want to set this parameter to one of these values, submit a ticket.
    // *   If this parameter is set to 0, no protection period is configured for the preemptible instance.
    // 
    // Default value: 1.
    @NameInMap("SpotDuration")
    public Integer spotDuration;

    // The maximum hourly price of the instance. A maximum of three decimal places are allowed.
    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    // The bidding policy for the pay-as-you-go instance. This parameter is valid only when the `InstanceChargeType` parameter is set to `PostPaid`. Valid values:
    // 
    // *   NoSpot: The instance is a regular pay-as-you-go instance.
    // *   SpotWithPriceLimit: The instance is a preemptible instance with a user-defined maximum hourly price.
    // *   SpotAsPriceGo: The instance is a preemptible instance for which the market price at the time of purchase is automatically used as the bid price.
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    // The tags.
    @NameInMap("Tag")
    public java.util.List<CreateLaunchTemplateVersionRequestTag> tag;

    // The user data of the instance. The user data must be encoded in Base64. The maximum size of raw data is 16 KB.
    @NameInMap("UserData")
    public String userData;

    // The ID of the vSwitch to which to connect the instance. This parameter is required if you specify the VpcId parameter.
    @NameInMap("VSwitchId")
    public String vSwitchId;

    // The description of the launch template version. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
    @NameInMap("VersionDescription")
    public String versionDescription;

    // The ID of the virtual private cloud (VPC).
    @NameInMap("VpcId")
    public String vpcId;

    // The ID of the zone in which to create the instance.
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateLaunchTemplateVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLaunchTemplateVersionRequest self = new CreateLaunchTemplateVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateLaunchTemplateVersionRequest setSystemDisk(CreateLaunchTemplateVersionRequestSystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public CreateLaunchTemplateVersionRequestSystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public CreateLaunchTemplateVersionRequest setAutoReleaseTime(String autoReleaseTime) {
        this.autoReleaseTime = autoReleaseTime;
        return this;
    }
    public String getAutoReleaseTime() {
        return this.autoReleaseTime;
    }

    public CreateLaunchTemplateVersionRequest setDataDisk(java.util.List<CreateLaunchTemplateVersionRequestDataDisk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<CreateLaunchTemplateVersionRequestDataDisk> getDataDisk() {
        return this.dataDisk;
    }

    public CreateLaunchTemplateVersionRequest setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    public CreateLaunchTemplateVersionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLaunchTemplateVersionRequest setEnableVmOsConfig(Boolean enableVmOsConfig) {
        this.enableVmOsConfig = enableVmOsConfig;
        return this;
    }
    public Boolean getEnableVmOsConfig() {
        return this.enableVmOsConfig;
    }

    public CreateLaunchTemplateVersionRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public CreateLaunchTemplateVersionRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateLaunchTemplateVersionRequest setImageOwnerAlias(String imageOwnerAlias) {
        this.imageOwnerAlias = imageOwnerAlias;
        return this;
    }
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    public CreateLaunchTemplateVersionRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateLaunchTemplateVersionRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateLaunchTemplateVersionRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateLaunchTemplateVersionRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public CreateLaunchTemplateVersionRequest setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
        this.internetMaxBandwidthIn = internetMaxBandwidthIn;
        return this;
    }
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    public CreateLaunchTemplateVersionRequest setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public CreateLaunchTemplateVersionRequest setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public CreateLaunchTemplateVersionRequest setIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
        return this;
    }
    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    public CreateLaunchTemplateVersionRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public CreateLaunchTemplateVersionRequest setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    public CreateLaunchTemplateVersionRequest setLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
        return this;
    }
    public String getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    public CreateLaunchTemplateVersionRequest setNetworkInterface(java.util.List<CreateLaunchTemplateVersionRequestNetworkInterface> networkInterface) {
        this.networkInterface = networkInterface;
        return this;
    }
    public java.util.List<CreateLaunchTemplateVersionRequestNetworkInterface> getNetworkInterface() {
        return this.networkInterface;
    }

    public CreateLaunchTemplateVersionRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateLaunchTemplateVersionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateLaunchTemplateVersionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateLaunchTemplateVersionRequest setPasswordInherit(Boolean passwordInherit) {
        this.passwordInherit = passwordInherit;
        return this;
    }
    public Boolean getPasswordInherit() {
        return this.passwordInherit;
    }

    public CreateLaunchTemplateVersionRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateLaunchTemplateVersionRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CreateLaunchTemplateVersionRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public CreateLaunchTemplateVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateLaunchTemplateVersionRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateLaunchTemplateVersionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateLaunchTemplateVersionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateLaunchTemplateVersionRequest setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
        this.securityEnhancementStrategy = securityEnhancementStrategy;
        return this;
    }
    public String getSecurityEnhancementStrategy() {
        return this.securityEnhancementStrategy;
    }

    public CreateLaunchTemplateVersionRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateLaunchTemplateVersionRequest setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public CreateLaunchTemplateVersionRequest setSpotDuration(Integer spotDuration) {
        this.spotDuration = spotDuration;
        return this;
    }
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    public CreateLaunchTemplateVersionRequest setSpotPriceLimit(Float spotPriceLimit) {
        this.spotPriceLimit = spotPriceLimit;
        return this;
    }
    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    public CreateLaunchTemplateVersionRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public CreateLaunchTemplateVersionRequest setTag(java.util.List<CreateLaunchTemplateVersionRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateLaunchTemplateVersionRequestTag> getTag() {
        return this.tag;
    }

    public CreateLaunchTemplateVersionRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public CreateLaunchTemplateVersionRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateLaunchTemplateVersionRequest setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }
    public String getVersionDescription() {
        return this.versionDescription;
    }

    public CreateLaunchTemplateVersionRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateLaunchTemplateVersionRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateLaunchTemplateVersionRequestSystemDisk extends TeaModel {
        // The ID of the automatic snapshot policy to apply to the system disk.
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        // This parameter is unavailable.
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        // The category of the system disk. Valid values:
        // 
        // *   cloud: basic disk.
        // *   cloud_efficiency: ultra disk.
        // *   cloud_ssd: standard SSD.
        // *   cloud_essd: enhanced SSD (ESSD). You can use the `SystemDisk.PerformanceLevel` parameter to set the performance level of the ESSD used as the system disk.
        // 
        // For non-I/O optimized instances of retired instance types, the default value is cloud. For other instances, the default value is cloud_efficiency.
        @NameInMap("Category")
        public String category;

        // Specifies whether to release the system disk when the instance is released. Valid values:
        // 
        // *   true: releases the system disk when the instance is released.
        // *   false: does not release the system disk when the instance is released.
        // 
        // Default value: true.
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        // The description of the system disk. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
        @NameInMap("Description")
        public String description;

        // The name of the system disk. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (.), underscores (\_), and hyphens (-).
        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("Encrypted")
        public String encrypted;

        @NameInMap("Iops")
        public Integer iops;

        // The performance level of the ESSD used as the system disk. Default value: PL0. Valid values:
        // 
        // *   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.
        // *   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.
        // *   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.
        // *   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.
        // 
        // For more information about ESSD performance levels, see [ESSDs](~~122389~~).
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        // This parameter is unavailable.
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        // The size of the system disk. Unit: GiB. Valid values: 20 to 500.
        // 
        // The value of this parameter must be at least 20 and greater than or equal to the image size.
        @NameInMap("Size")
        public Integer size;

        public static CreateLaunchTemplateVersionRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateLaunchTemplateVersionRequestSystemDisk self = new CreateLaunchTemplateVersionRequestSystemDisk();
            return TeaModel.build(map, self);
        }

        public CreateLaunchTemplateVersionRequestSystemDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public CreateLaunchTemplateVersionRequestSystemDisk setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public CreateLaunchTemplateVersionRequestSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateLaunchTemplateVersionRequestSystemDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public CreateLaunchTemplateVersionRequestSystemDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateLaunchTemplateVersionRequestSystemDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public CreateLaunchTemplateVersionRequestSystemDisk setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public CreateLaunchTemplateVersionRequestSystemDisk setIops(Integer iops) {
            this.iops = iops;
            return this;
        }
        public Integer getIops() {
            return this.iops;
        }

        public CreateLaunchTemplateVersionRequestSystemDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public CreateLaunchTemplateVersionRequestSystemDisk setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public CreateLaunchTemplateVersionRequestSystemDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class CreateLaunchTemplateVersionRequestDataDisk extends TeaModel {
        // The ID of the automatic snapshot policy to apply to data disk N.
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        // The category of data disk N. Valid values:
        // 
        // *   cloud: basic disk
        // *   cloud_efficiency: ultra disk
        // *   cloud_ssd: standard SSD
        // *   cloud_essd: ESSD
        // 
        // For I/O optimized instances, the default value is cloud_efficiency. For non-I/O optimized instances, the default value is cloud.
        @NameInMap("Category")
        public String category;

        // Specifies whether to release data disk N when the instance is released. Valid values:
        // 
        // *   true: releases data disk N when the instance is released.
        // *   false: does not release data disk N when the instance is released.
        // 
        // Default value: true.
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        // The description of data disk N. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
        @NameInMap("Description")
        public String description;

        // >  This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.
        @NameInMap("Device")
        public String device;

        // The name of data disk N. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
        @NameInMap("DiskName")
        public String diskName;

        // Specifies whether to encrypt data disk N.
        @NameInMap("Encrypted")
        public String encrypted;

        // The performance level of the ESSD used as data disk N. The value of N must be the same as that in `DataDisk.N.Category` when DataDisk.N.Category is set to cloud_essd. Default value: PL1. Valid values:
        // 
        // *   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.
        // *   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.
        // *   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.
        // *   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.
        // 
        // For more information about ESSD performance levels, see [ESSDs](~~122389~~).
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        // The size of data disk N. Valid values of N: 1 to 16. Unit: GiB. Valid values:
        // 
        // *   Valid values when DataDisk.N.Category is set to cloud: 5 to 2000.
        // 
        // *   Valid values when DataDisk.N.Category is set to cloud_efficiency: 20 to 32768.
        // 
        // *   Valid values when DataDisk.N.Category is set to cloud_ssd: 20 to 32768.
        // 
        // *   Valid values when DataDisk.N.Category is set to cloud_essd: depend on the `DataDisk.N.PerformanceLevel` value.
        // 
        //     *   Valid values when DataDisk.N.PerformanceLevel is set to PL0: 40 to 32768.
        //     *   Valid values when DataDisk.N.PerformanceLevel is set to PL1: 20 to 32768.
        //     *   Valid values when DataDisk.N.PerformanceLevel is set to PL2: 461 to 32768.
        //     *   Valid values when DataDisk.N.PerformanceLevel is set to PL3: 1261 to 32768.
        // 
        // The value of this parameter must be greater than or equal to the size of the snapshot specified by the `SnapshotId` parameter.
        @NameInMap("Size")
        public Integer size;

        // The ID of the snapshot used to create data disk N. Valid values of N: 1 to 16. When the `DataDisk.N.SnapshotId` parameter is specified, the `DataDisk.N.Size` parameter is ignored. The data disk is created based on the size of the specified snapshot.
        // 
        // Use snapshots created after July 15, 2013. Otherwise, an error is returned and your request is rejected.
        @NameInMap("SnapshotId")
        public String snapshotId;

        public static CreateLaunchTemplateVersionRequestDataDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateLaunchTemplateVersionRequestDataDisk self = new CreateLaunchTemplateVersionRequestDataDisk();
            return TeaModel.build(map, self);
        }

        public CreateLaunchTemplateVersionRequestDataDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public CreateLaunchTemplateVersionRequestDataDisk setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public CreateLaunchTemplateVersionRequestDataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateLaunchTemplateVersionRequestDataDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public CreateLaunchTemplateVersionRequestDataDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateLaunchTemplateVersionRequestDataDisk setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public CreateLaunchTemplateVersionRequestDataDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public CreateLaunchTemplateVersionRequestDataDisk setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public CreateLaunchTemplateVersionRequestDataDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public CreateLaunchTemplateVersionRequestDataDisk setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public CreateLaunchTemplateVersionRequestDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public CreateLaunchTemplateVersionRequestDataDisk setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

    }

    public static class CreateLaunchTemplateVersionRequestNetworkInterface extends TeaModel {
        // The description of secondary ENI N. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`. The value of N in `NetworkInterface.N` cannot be greater than 1.
        @NameInMap("Description")
        public String description;

        // The instance type of the instance.
        @NameInMap("InstanceType")
        public String instanceType;

        // The name of secondary ENI N. The value of N in `NetworkInterface.N` cannot be greater than 1.
        @NameInMap("NetworkInterfaceName")
        public String networkInterfaceName;

        // The communication mode of primary ENI N. Valid values:
        // 
        // *   Standard: uses the TCP communication mode.
        // *   HighPerformance: enables the Elastic RDMA Interface (ERI) and uses the remote direct memory access (RDMA) communication mode.
        // 
        // Take note of the following items:
        // 
        // *   This parameter is valid only when `NetworkInterface.N.InstanceType` is set to `Primary`. If `NetworkInterface.N.InstanceType` is set to `Secondary` or left empty, you cannot set this parameter.
        // *   If you set this parameter to HighPerformance, you can create instances only of the c7re RDMA-enhanced instance family. The maximum number of ENIs in RDMA mode that can be bound to a c7re instance is determined based on the instance type. The c7re instance family is in invitational preview in Beijing Zone K. For more information, see [Instance family](~~25378~~).
        @NameInMap("NetworkInterfaceTrafficMode")
        public String networkInterfaceTrafficMode;

        // The primary private IP address of secondary ENI N. The value of N in `NetworkInterface.N` cannot be greater than 1.
        @NameInMap("PrimaryIpAddress")
        public String primaryIpAddress;

        // The ID of the security group to which to assign secondary ENI N. The security groups of secondary ENI N and of the instance must belong to the same VPC. The value of N in `NetworkInterface.N` cannot be greater than 1.
        // 
        // >  You cannot specify both the `NetworkInterface.N.SecurityGroupId` and `NetworkInterface.N.SecurityGroupIds.N` parameters.
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        // The IDs of the security groups to which the ENI belongs.
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        // The ID of the vSwitch to which to connect secondary ENI N. The instance and the ENI must be located within the same zone of the same VPC, but they can be connected to different vSwitches. The value of N in `NetworkInterface.N` cannot be greater than 1.
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static CreateLaunchTemplateVersionRequestNetworkInterface build(java.util.Map<String, ?> map) throws Exception {
            CreateLaunchTemplateVersionRequestNetworkInterface self = new CreateLaunchTemplateVersionRequestNetworkInterface();
            return TeaModel.build(map, self);
        }

        public CreateLaunchTemplateVersionRequestNetworkInterface setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateLaunchTemplateVersionRequestNetworkInterface setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CreateLaunchTemplateVersionRequestNetworkInterface setNetworkInterfaceName(String networkInterfaceName) {
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }
        public String getNetworkInterfaceName() {
            return this.networkInterfaceName;
        }

        public CreateLaunchTemplateVersionRequestNetworkInterface setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
            this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
            return this;
        }
        public String getNetworkInterfaceTrafficMode() {
            return this.networkInterfaceTrafficMode;
        }

        public CreateLaunchTemplateVersionRequestNetworkInterface setPrimaryIpAddress(String primaryIpAddress) {
            this.primaryIpAddress = primaryIpAddress;
            return this;
        }
        public String getPrimaryIpAddress() {
            return this.primaryIpAddress;
        }

        public CreateLaunchTemplateVersionRequestNetworkInterface setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateLaunchTemplateVersionRequestNetworkInterface setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public CreateLaunchTemplateVersionRequestNetworkInterface setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class CreateLaunchTemplateVersionRequestTag extends TeaModel {
        // The key of tag N of the instance, Elastic Block Storage (EBS) devices, or primary ENI. Valid values of N: 1 to 5. The tag key cannot be an empty string. It can be up to 64 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.
        @NameInMap("Key")
        public String key;

        // The value of tag N of the instance, EBS devices, or primary ENI. Valid values of N: 1 to 5. The tag value can be an empty string. It can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.
        @NameInMap("Value")
        public String value;

        public static CreateLaunchTemplateVersionRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateLaunchTemplateVersionRequestTag self = new CreateLaunchTemplateVersionRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateLaunchTemplateVersionRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateLaunchTemplateVersionRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
