// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateLaunchTemplateVersionRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    @NameInMap("LaunchTemplateName")
    public String launchTemplateName;

    @NameInMap("VersionDescription")
    public String versionDescription;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("ImageOwnerAlias")
    public String imageOwnerAlias;

    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("Description")
    public String description;

    @NameInMap("InternetMaxBandwidthIn")
    public Integer internetMaxBandwidthIn;

    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("SystemDisk")
    public CreateLaunchTemplateVersionRequestSystemDisk systemDisk;

    @NameInMap("DataDisk")
    public java.util.List<CreateLaunchTemplateVersionRequestDataDisk> dataDisk;

    @NameInMap("IoOptimized")
    public String ioOptimized;

    @NameInMap("NetworkInterface")
    public java.util.List<CreateLaunchTemplateVersionRequestNetworkInterface> networkInterface;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("EnableVmOsConfig")
    public Boolean enableVmOsConfig;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("AutoReleaseTime")
    public String autoReleaseTime;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    @NameInMap("SpotDuration")
    public Integer spotDuration;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SecurityEnhancementStrategy")
    public String securityEnhancementStrategy;

    @NameInMap("Tag")
    public java.util.List<CreateLaunchTemplateVersionRequestTag> tag;

    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    public static CreateLaunchTemplateVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLaunchTemplateVersionRequest self = new CreateLaunchTemplateVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateLaunchTemplateVersionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public CreateLaunchTemplateVersionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateLaunchTemplateVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

    public CreateLaunchTemplateVersionRequest setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }
    public String getVersionDescription() {
        return this.versionDescription;
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

    public CreateLaunchTemplateVersionRequest setPasswordInherit(Boolean passwordInherit) {
        this.passwordInherit = passwordInherit;
        return this;
    }
    public Boolean getPasswordInherit() {
        return this.passwordInherit;
    }

    public CreateLaunchTemplateVersionRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateLaunchTemplateVersionRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateLaunchTemplateVersionRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateLaunchTemplateVersionRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateLaunchTemplateVersionRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateLaunchTemplateVersionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
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

    public CreateLaunchTemplateVersionRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public CreateLaunchTemplateVersionRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateLaunchTemplateVersionRequest setSystemDisk(CreateLaunchTemplateVersionRequestSystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public CreateLaunchTemplateVersionRequestSystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public CreateLaunchTemplateVersionRequest setDataDisk(java.util.List<CreateLaunchTemplateVersionRequestDataDisk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<CreateLaunchTemplateVersionRequestDataDisk> getDataDisk() {
        return this.dataDisk;
    }

    public CreateLaunchTemplateVersionRequest setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public CreateLaunchTemplateVersionRequest setNetworkInterface(java.util.List<CreateLaunchTemplateVersionRequestNetworkInterface> networkInterface) {
        this.networkInterface = networkInterface;
        return this;
    }
    public java.util.List<CreateLaunchTemplateVersionRequestNetworkInterface> getNetworkInterface() {
        return this.networkInterface;
    }

    public CreateLaunchTemplateVersionRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateLaunchTemplateVersionRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateLaunchTemplateVersionRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public CreateLaunchTemplateVersionRequest setEnableVmOsConfig(Boolean enableVmOsConfig) {
        this.enableVmOsConfig = enableVmOsConfig;
        return this;
    }
    public Boolean getEnableVmOsConfig() {
        return this.enableVmOsConfig;
    }

    public CreateLaunchTemplateVersionRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateLaunchTemplateVersionRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public CreateLaunchTemplateVersionRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public CreateLaunchTemplateVersionRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public CreateLaunchTemplateVersionRequest setAutoReleaseTime(String autoReleaseTime) {
        this.autoReleaseTime = autoReleaseTime;
        return this;
    }
    public String getAutoReleaseTime() {
        return this.autoReleaseTime;
    }

    public CreateLaunchTemplateVersionRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public CreateLaunchTemplateVersionRequest setSpotPriceLimit(Float spotPriceLimit) {
        this.spotPriceLimit = spotPriceLimit;
        return this;
    }
    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    public CreateLaunchTemplateVersionRequest setSpotDuration(Integer spotDuration) {
        this.spotDuration = spotDuration;
        return this;
    }
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    public CreateLaunchTemplateVersionRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateLaunchTemplateVersionRequest setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
        this.securityEnhancementStrategy = securityEnhancementStrategy;
        return this;
    }
    public String getSecurityEnhancementStrategy() {
        return this.securityEnhancementStrategy;
    }

    public CreateLaunchTemplateVersionRequest setTag(java.util.List<CreateLaunchTemplateVersionRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateLaunchTemplateVersionRequestTag> getTag() {
        return this.tag;
    }

    public CreateLaunchTemplateVersionRequest setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public CreateLaunchTemplateVersionRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CreateLaunchTemplateVersionRequest setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    public static class CreateLaunchTemplateVersionRequestSystemDisk extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("Description")
        public String description;

        @NameInMap("Iops")
        public Integer iops;

        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        public static CreateLaunchTemplateVersionRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateLaunchTemplateVersionRequestSystemDisk self = new CreateLaunchTemplateVersionRequestSystemDisk();
            return TeaModel.build(map, self);
        }

        public CreateLaunchTemplateVersionRequestSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateLaunchTemplateVersionRequestSystemDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public CreateLaunchTemplateVersionRequestSystemDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public CreateLaunchTemplateVersionRequestSystemDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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

        public CreateLaunchTemplateVersionRequestSystemDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

    }

    public static class CreateLaunchTemplateVersionRequestDataDisk extends TeaModel {
        @NameInMap("Size")
        public Integer size;

        @NameInMap("SnapshotId")
        public String snapshotId;

        @NameInMap("Category")
        public String category;

        @NameInMap("Encrypted")
        public String encrypted;

        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("Description")
        public String description;

        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        @NameInMap("Device")
        public String device;

        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        public static CreateLaunchTemplateVersionRequestDataDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateLaunchTemplateVersionRequestDataDisk self = new CreateLaunchTemplateVersionRequestDataDisk();
            return TeaModel.build(map, self);
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

        public CreateLaunchTemplateVersionRequestDataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateLaunchTemplateVersionRequestDataDisk setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public CreateLaunchTemplateVersionRequestDataDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public CreateLaunchTemplateVersionRequestDataDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateLaunchTemplateVersionRequestDataDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public CreateLaunchTemplateVersionRequestDataDisk setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public CreateLaunchTemplateVersionRequestDataDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

    }

    public static class CreateLaunchTemplateVersionRequestNetworkInterface extends TeaModel {
        @NameInMap("PrimaryIpAddress")
        public String primaryIpAddress;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("NetworkInterfaceName")
        public String networkInterfaceName;

        @NameInMap("Description")
        public String description;

        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        public static CreateLaunchTemplateVersionRequestNetworkInterface build(java.util.Map<String, ?> map) throws Exception {
            CreateLaunchTemplateVersionRequestNetworkInterface self = new CreateLaunchTemplateVersionRequestNetworkInterface();
            return TeaModel.build(map, self);
        }

        public CreateLaunchTemplateVersionRequestNetworkInterface setPrimaryIpAddress(String primaryIpAddress) {
            this.primaryIpAddress = primaryIpAddress;
            return this;
        }
        public String getPrimaryIpAddress() {
            return this.primaryIpAddress;
        }

        public CreateLaunchTemplateVersionRequestNetworkInterface setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateLaunchTemplateVersionRequestNetworkInterface setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateLaunchTemplateVersionRequestNetworkInterface setNetworkInterfaceName(String networkInterfaceName) {
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }
        public String getNetworkInterfaceName() {
            return this.networkInterfaceName;
        }

        public CreateLaunchTemplateVersionRequestNetworkInterface setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateLaunchTemplateVersionRequestNetworkInterface setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

    }

    public static class CreateLaunchTemplateVersionRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

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
