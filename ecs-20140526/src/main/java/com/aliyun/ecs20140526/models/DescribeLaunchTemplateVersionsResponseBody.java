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
    public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets launchTemplateVersionSets;

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

    public DescribeLaunchTemplateVersionsResponseBody setLaunchTemplateVersionSets(DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets launchTemplateVersionSets) {
        this.launchTemplateVersionSets = launchTemplateVersionSets;
        return this;
    }
    public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets getLaunchTemplateVersionSets() {
        return this.launchTemplateVersionSets;
    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk extends TeaModel {
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

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk setIops(Integer iops) {
            this.iops = iops;
            return this;
        }
        public Integer getIops() {
            return this.iops;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTagsInstanceTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTagsInstanceTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTagsInstanceTag self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTagsInstanceTag();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTagsInstanceTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTagsInstanceTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTags extends TeaModel {
        @NameInMap("InstanceTag")
        public java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTagsInstanceTag> instanceTag;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTags self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTags();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTags setInstanceTag(java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTagsInstanceTag> instanceTag) {
            this.instanceTag = instanceTag;
            return this;
        }
        public java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTagsInstanceTag> getInstanceTag() {
            return this.instanceTag;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk extends TeaModel {
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

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisks extends TeaModel {
        @NameInMap("DataDisk")
        public java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk> dataDisk;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisks self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisks();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisks setDataDisk(java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk> dataDisk) {
            this.dataDisk = dataDisk;
            return this;
        }
        public java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisksDataDisk> getDataDisk() {
            return this.dataDisk;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface extends TeaModel {
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

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface setNetworkInterfaceName(String networkInterfaceName) {
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }
        public String getNetworkInterfaceName() {
            return this.networkInterfaceName;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface setPrimaryIpAddress(String primaryIpAddress) {
            this.primaryIpAddress = primaryIpAddress;
            return this;
        }
        public String getPrimaryIpAddress() {
            return this.primaryIpAddress;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfaces extends TeaModel {
        @NameInMap("NetworkInterface")
        public java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface> networkInterface;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfaces build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfaces self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfaces();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfaces setNetworkInterface(java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface> networkInterface) {
            this.networkInterface = networkInterface;
            return this;
        }
        public java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfacesNetworkInterface> getNetworkInterface() {
            return this.networkInterface;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData extends TeaModel {
        @NameInMap("SystemDisk")
        @Validation(required = true)
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk systemDisk;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("KeyPairName")
        public String keyPairName;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("Tags")
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTags tags;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("DataDisks")
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisks dataDisks;

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
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfaces networkInterfaces;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setSystemDisk(DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataSystemDisk getSystemDisk() {
            return this.systemDisk;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setTags(DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataTags getTags() {
            return this.tags;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setDataDisks(DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisks dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataDataDisks getDataDisks() {
            return this.dataDisks;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setEnableVmOsConfig(Boolean enableVmOsConfig) {
            this.enableVmOsConfig = enableVmOsConfig;
            return this;
        }
        public Boolean getEnableVmOsConfig() {
            return this.enableVmOsConfig;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setSpotDuration(Integer spotDuration) {
            this.spotDuration = spotDuration;
            return this;
        }
        public Integer getSpotDuration() {
            return this.spotDuration;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
            this.securityEnhancementStrategy = securityEnhancementStrategy;
            return this;
        }
        public String getSecurityEnhancementStrategy() {
            return this.securityEnhancementStrategy;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setPasswordInherit(Boolean passwordInherit) {
            this.passwordInherit = passwordInherit;
            return this;
        }
        public Boolean getPasswordInherit() {
            return this.passwordInherit;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setSpotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setAutoReleaseTime(String autoReleaseTime) {
            this.autoReleaseTime = autoReleaseTime;
            return this;
        }
        public String getAutoReleaseTime() {
            return this.autoReleaseTime;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }
        public Integer getInternetMaxBandwidthIn() {
            return this.internetMaxBandwidthIn;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setIoOptimized(String ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public String getIoOptimized() {
            return this.ioOptimized;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData setNetworkInterfaces(DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfaces networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            return this;
        }
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateDataNetworkInterfaces getNetworkInterfaces() {
            return this.networkInterfaces;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet extends TeaModel {
        @NameInMap("LaunchTemplateName")
        public String launchTemplateName;

        @NameInMap("DefaultVersion")
        public Boolean defaultVersion;

        @NameInMap("VersionNumber")
        public Long versionNumber;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("LaunchTemplateData")
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData launchTemplateData;

        @NameInMap("LaunchTemplateId")
        public String launchTemplateId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreatedBy")
        public String createdBy;

        @NameInMap("VersionDescription")
        public String versionDescription;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet setLaunchTemplateName(String launchTemplateName) {
            this.launchTemplateName = launchTemplateName;
            return this;
        }
        public String getLaunchTemplateName() {
            return this.launchTemplateName;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet setDefaultVersion(Boolean defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public Boolean getDefaultVersion() {
            return this.defaultVersion;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet setVersionNumber(Long versionNumber) {
            this.versionNumber = versionNumber;
            return this;
        }
        public Long getVersionNumber() {
            return this.versionNumber;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet setLaunchTemplateData(DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData launchTemplateData) {
            this.launchTemplateData = launchTemplateData;
            return this;
        }
        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSetLaunchTemplateData getLaunchTemplateData() {
            return this.launchTemplateData;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet setLaunchTemplateId(String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }
        public String getLaunchTemplateId() {
            return this.launchTemplateId;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet setVersionDescription(String versionDescription) {
            this.versionDescription = versionDescription;
            return this;
        }
        public String getVersionDescription() {
            return this.versionDescription;
        }

    }

    public static class DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets extends TeaModel {
        @NameInMap("LaunchTemplateVersionSet")
        public java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet> launchTemplateVersionSet;

        public static DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets self = new DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSets setLaunchTemplateVersionSet(java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet> launchTemplateVersionSet) {
            this.launchTemplateVersionSet = launchTemplateVersionSet;
            return this;
        }
        public java.util.List<DescribeLaunchTemplateVersionsResponseBodyLaunchTemplateVersionSetsLaunchTemplateVersionSet> getLaunchTemplateVersionSet() {
            return this.launchTemplateVersionSet;
        }

    }

}
