// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeLaunchTemplateVersionsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("LaunchTemplateVersionSets")
    public java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets> launchTemplateVersionSets;

    public static DescribeLaunchTemplateVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLaunchTemplateVersionsResponseBody self = new DescribeLaunchTemplateVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLaunchTemplateVersionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeLaunchTemplateVersionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLaunchTemplateVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLaunchTemplateVersionsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLaunchTemplateVersionsResponseBody setLaunchTemplateVersionSets(java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets> launchTemplateVersionSets) {
        this.launchTemplateVersionSets = launchTemplateVersionSets;
        return this;
    }
    public java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets> getLaunchTemplateVersionSets() {
        return this.launchTemplateVersionSets;
    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataSystemDisk extends TeaModel {
        @NameInMap("Size")
        public Integer size;

        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("Category")
        public String category;

        @NameInMap("Description")
        public String description;

        @NameInMap("Iops")
        public Integer iops;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataSystemDisk self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataSystemDisk();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataSystemDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataSystemDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataSystemDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataSystemDisk setIops(Integer iops) {
            this.iops = iops;
            return this;
        }
        public Integer getIops() {
            return this.iops;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataTags self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataTags();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataDataDisks extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("SnapshotId")
        public String snapshotId;

        @NameInMap("Device")
        public String device;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("Category")
        public String category;

        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        @NameInMap("Encrypted")
        public String encrypted;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataDataDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataDataDisks self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataDataDisks();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataDataDisks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataDataDisks setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataDataDisks setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataDataDisks setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataDataDisks setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataDataDisks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataDataDisks setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataDataDisks setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataNetworkInterfaces extends TeaModel {
        @NameInMap("NetworkInterfaceName")
        public String networkInterfaceName;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("Description")
        public String description;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("PrimaryIpAddress")
        public String primaryIpAddress;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataNetworkInterfaces build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataNetworkInterfaces self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataNetworkInterfaces();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataNetworkInterfaces setNetworkInterfaceName(String networkInterfaceName) {
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }
        public String getNetworkInterfaceName() {
            return this.networkInterfaceName;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataNetworkInterfaces setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataNetworkInterfaces setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataNetworkInterfaces setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataNetworkInterfaces setPrimaryIpAddress(String primaryIpAddress) {
            this.primaryIpAddress = primaryIpAddress;
            return this;
        }
        public String getPrimaryIpAddress() {
            return this.primaryIpAddress;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData extends TeaModel {
        @NameInMap("SystemDisk")
        @Validation(required = true)
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataSystemDisk systemDisk;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("KeyPairName")
        public String keyPairName;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("Tags")
        public java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataTags> tags;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("DataDisks")
        public java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataDataDisks> dataDisks;

        @NameInMap("SpotStrategy")
        public String spotStrategy;

        @NameInMap("EnableVmOsConfig")
        public Boolean enableVmOsConfig;

        @NameInMap("Description")
        public String description;

        @NameInMap("SpotDuration")
        public Integer spotDuration;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("SecurityEnhancementStrategy")
        public String securityEnhancementStrategy;

        @NameInMap("PasswordInherit")
        public Boolean passwordInherit;

        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("AutoReleaseTime")
        public String autoReleaseTime;

        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("InternetMaxBandwidthOut")
        public Integer internetMaxBandwidthOut;

        @NameInMap("InternetMaxBandwidthIn")
        public Integer internetMaxBandwidthIn;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Period")
        public Integer period;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("IoOptimized")
        public String ioOptimized;

        @NameInMap("RamRoleName")
        public String ramRoleName;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("InternetChargeType")
        public String internetChargeType;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("NetworkInterfaces")
        public java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataNetworkInterfaces> networkInterfaces;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData setSystemDisk(DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataSystemDisk systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataSystemDisk getSystemDisk() {
            return this.systemDisk;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData setTags(java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataTags> getTags() {
            return this.tags;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData setDataDisks(java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataDataDisks> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataDataDisks> getDataDisks() {
            return this.dataDisks;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData setEnableVmOsConfig(Boolean enableVmOsConfig) {
            this.enableVmOsConfig = enableVmOsConfig;
            return this;
        }
        public Boolean getEnableVmOsConfig() {
            return this.enableVmOsConfig;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData setSpotDuration(Integer spotDuration) {
            this.spotDuration = spotDuration;
            return this;
        }
        public Integer getSpotDuration() {
            return this.spotDuration;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
            this.securityEnhancementStrategy = securityEnhancementStrategy;
            return this;
        }
        public String getSecurityEnhancementStrategy() {
            return this.securityEnhancementStrategy;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData setPasswordInherit(Boolean passwordInherit) {
            this.passwordInherit = passwordInherit;
            return this;
        }
        public Boolean getPasswordInherit() {
            return this.passwordInherit;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData setSpotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData setAutoReleaseTime(String autoReleaseTime) {
            this.autoReleaseTime = autoReleaseTime;
            return this;
        }
        public String getAutoReleaseTime() {
            return this.autoReleaseTime;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }
        public Integer getInternetMaxBandwidthIn() {
            return this.internetMaxBandwidthIn;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData setIoOptimized(String ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public String getIoOptimized() {
            return this.ioOptimized;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData setNetworkInterfaces(java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataNetworkInterfaces> networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            return this;
        }
        public java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateDataNetworkInterfaces> getNetworkInterfaces() {
            return this.networkInterfaces;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets extends TeaModel {
        @NameInMap("LaunchTemplateName")
        public String launchTemplateName;

        @NameInMap("DefaultVersion")
        public Boolean defaultVersion;

        @NameInMap("VersionNumber")
        public Long versionNumber;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("LaunchTemplateData")
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData launchTemplateData;

        @NameInMap("LaunchTemplateId")
        public String launchTemplateId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreatedBy")
        public String createdBy;

        @NameInMap("VersionDescription")
        public String versionDescription;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets setLaunchTemplateName(String launchTemplateName) {
            this.launchTemplateName = launchTemplateName;
            return this;
        }
        public String getLaunchTemplateName() {
            return this.launchTemplateName;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets setDefaultVersion(Boolean defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public Boolean getDefaultVersion() {
            return this.defaultVersion;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets setVersionNumber(Long versionNumber) {
            this.versionNumber = versionNumber;
            return this;
        }
        public Long getVersionNumber() {
            return this.versionNumber;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets setLaunchTemplateData(DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData launchTemplateData) {
            this.launchTemplateData = launchTemplateData;
            return this;
        }
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateData getLaunchTemplateData() {
            return this.launchTemplateData;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets setLaunchTemplateId(String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }
        public String getLaunchTemplateId() {
            return this.launchTemplateId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets setVersionDescription(String versionDescription) {
            this.versionDescription = versionDescription;
            return this;
        }
        public String getVersionDescription() {
            return this.versionDescription;
        }

    }

}
