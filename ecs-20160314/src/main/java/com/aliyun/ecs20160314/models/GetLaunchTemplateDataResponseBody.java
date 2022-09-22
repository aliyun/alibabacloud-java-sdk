// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class GetLaunchTemplateDataResponseBody extends TeaModel {
    @NameInMap("LaunchTemplateData")
    public LaunchTemplateData launchTemplateData;

    @NameInMap("RequestId")
    public String requestId;

    public static GetLaunchTemplateDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLaunchTemplateDataResponseBody self = new GetLaunchTemplateDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLaunchTemplateDataResponseBody setLaunchTemplateData(LaunchTemplateData launchTemplateData) {
        this.launchTemplateData = launchTemplateData;
        return this;
    }
    public LaunchTemplateData getLaunchTemplateData() {
        return this.launchTemplateData;
    }

    public GetLaunchTemplateDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SystemDisk extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Description")
        public String description;

        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("Iops")
        public Integer iops;

        @NameInMap("Size")
        public Integer size;

        public static SystemDisk build(java.util.Map<String, ?> map) throws Exception {
            SystemDisk self = new SystemDisk();
            return TeaModel.build(map, self);
        }

        public SystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public SystemDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SystemDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public SystemDisk setIops(Integer iops) {
            this.iops = iops;
            return this;
        }
        public Integer getIops() {
            return this.iops;
        }

        public SystemDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class DataDisk extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        @NameInMap("Description")
        public String description;

        @NameInMap("Device")
        public String device;

        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("Encrypted")
        public String encrypted;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("SnapshotId")
        public String snapshotId;

        public static DataDisk build(java.util.Map<String, ?> map) throws Exception {
            DataDisk self = new DataDisk();
            return TeaModel.build(map, self);
        }

        public DataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DataDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public DataDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DataDisk setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DataDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public DataDisk setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public DataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DataDisk setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

    }

    public static class DataDisks extends TeaModel {
        @NameInMap("DataDisk")
        public java.util.List<DataDisk> dataDisk;

        public static DataDisks build(java.util.Map<String, ?> map) throws Exception {
            DataDisks self = new DataDisks();
            return TeaModel.build(map, self);
        }

        public DataDisks setDataDisk(java.util.List<DataDisk> dataDisk) {
            this.dataDisk = dataDisk;
            return this;
        }
        public java.util.List<DataDisk> getDataDisk() {
            return this.dataDisk;
        }

    }

    public static class NetworkInterface extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("NetworkInterfaceName")
        public String networkInterfaceName;

        @NameInMap("PrimaryIpAddress")
        public String primaryIpAddress;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static NetworkInterface build(java.util.Map<String, ?> map) throws Exception {
            NetworkInterface self = new NetworkInterface();
            return TeaModel.build(map, self);
        }

        public NetworkInterface setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public NetworkInterface setNetworkInterfaceName(String networkInterfaceName) {
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }
        public String getNetworkInterfaceName() {
            return this.networkInterfaceName;
        }

        public NetworkInterface setPrimaryIpAddress(String primaryIpAddress) {
            this.primaryIpAddress = primaryIpAddress;
            return this;
        }
        public String getPrimaryIpAddress() {
            return this.primaryIpAddress;
        }

        public NetworkInterface setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public NetworkInterface setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class NetworkInterfaces extends TeaModel {
        @NameInMap("NetworkInterface")
        public java.util.List<NetworkInterface> networkInterface;

        public static NetworkInterfaces build(java.util.Map<String, ?> map) throws Exception {
            NetworkInterfaces self = new NetworkInterfaces();
            return TeaModel.build(map, self);
        }

        public NetworkInterfaces setNetworkInterface(java.util.List<NetworkInterface> networkInterface) {
            this.networkInterface = networkInterface;
            return this;
        }
        public java.util.List<NetworkInterface> getNetworkInterface() {
            return this.networkInterface;
        }

    }

    public static class InstanceTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static InstanceTag build(java.util.Map<String, ?> map) throws Exception {
            InstanceTag self = new InstanceTag();
            return TeaModel.build(map, self);
        }

        public InstanceTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public InstanceTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class Tags extends TeaModel {
        @NameInMap("InstanceTag")
        public java.util.List<InstanceTag> instanceTag;

        public static Tags build(java.util.Map<String, ?> map) throws Exception {
            Tags self = new Tags();
            return TeaModel.build(map, self);
        }

        public Tags setInstanceTag(java.util.List<InstanceTag> instanceTag) {
            this.instanceTag = instanceTag;
            return this;
        }
        public java.util.List<InstanceTag> getInstanceTag() {
            return this.instanceTag;
        }

    }

    public static class LaunchTemplateData extends TeaModel {
        @NameInMap("SystemDisk")
        @Validation(required = true)
        public SystemDisk systemDisk;

        @NameInMap("AutoReleaseTime")
        public String autoReleaseTime;

        @NameInMap("DataDisks")
        public DataDisks dataDisks;

        @NameInMap("Description")
        public String description;

        @NameInMap("EnableVmOsConfig")
        public Boolean enableVmOsConfig;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InternetChargeType")
        public String internetChargeType;

        @NameInMap("InternetMaxBandwidthIn")
        public Integer internetMaxBandwidthIn;

        @NameInMap("InternetMaxBandwidthOut")
        public Integer internetMaxBandwidthOut;

        @NameInMap("IoOptimized")
        public String ioOptimized;

        @NameInMap("KeyPairName")
        public String keyPairName;

        @NameInMap("NetworkInterfaces")
        public NetworkInterfaces networkInterfaces;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("PasswordInherit")
        public Boolean passwordInherit;

        @NameInMap("Period")
        public Integer period;

        @NameInMap("RamRoleName")
        public String ramRoleName;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SecurityEnhancementStrategy")
        public Boolean securityEnhancementStrategy;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("SpotDuration")
        public Integer spotDuration;

        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        @NameInMap("SpotStrategy")
        public String spotStrategy;

        @NameInMap("Tags")
        public Tags tags;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static LaunchTemplateData build(java.util.Map<String, ?> map) throws Exception {
            LaunchTemplateData self = new LaunchTemplateData();
            return TeaModel.build(map, self);
        }

        public LaunchTemplateData setSystemDisk(SystemDisk systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }
        public SystemDisk getSystemDisk() {
            return this.systemDisk;
        }

        public LaunchTemplateData setAutoReleaseTime(String autoReleaseTime) {
            this.autoReleaseTime = autoReleaseTime;
            return this;
        }
        public String getAutoReleaseTime() {
            return this.autoReleaseTime;
        }

        public LaunchTemplateData setDataDisks(DataDisks dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public DataDisks getDataDisks() {
            return this.dataDisks;
        }

        public LaunchTemplateData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public LaunchTemplateData setEnableVmOsConfig(Boolean enableVmOsConfig) {
            this.enableVmOsConfig = enableVmOsConfig;
            return this;
        }
        public Boolean getEnableVmOsConfig() {
            return this.enableVmOsConfig;
        }

        public LaunchTemplateData setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public LaunchTemplateData setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public LaunchTemplateData setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        public LaunchTemplateData setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public LaunchTemplateData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public LaunchTemplateData setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public LaunchTemplateData setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public LaunchTemplateData setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }
        public Integer getInternetMaxBandwidthIn() {
            return this.internetMaxBandwidthIn;
        }

        public LaunchTemplateData setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public LaunchTemplateData setIoOptimized(String ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public String getIoOptimized() {
            return this.ioOptimized;
        }

        public LaunchTemplateData setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public LaunchTemplateData setNetworkInterfaces(NetworkInterfaces networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            return this;
        }
        public NetworkInterfaces getNetworkInterfaces() {
            return this.networkInterfaces;
        }

        public LaunchTemplateData setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public LaunchTemplateData setPasswordInherit(Boolean passwordInherit) {
            this.passwordInherit = passwordInherit;
            return this;
        }
        public Boolean getPasswordInherit() {
            return this.passwordInherit;
        }

        public LaunchTemplateData setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public LaunchTemplateData setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        public LaunchTemplateData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public LaunchTemplateData setSecurityEnhancementStrategy(Boolean securityEnhancementStrategy) {
            this.securityEnhancementStrategy = securityEnhancementStrategy;
            return this;
        }
        public Boolean getSecurityEnhancementStrategy() {
            return this.securityEnhancementStrategy;
        }

        public LaunchTemplateData setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public LaunchTemplateData setSpotDuration(Integer spotDuration) {
            this.spotDuration = spotDuration;
            return this;
        }
        public Integer getSpotDuration() {
            return this.spotDuration;
        }

        public LaunchTemplateData setSpotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public LaunchTemplateData setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public LaunchTemplateData setTags(Tags tags) {
            this.tags = tags;
            return this;
        }
        public Tags getTags() {
            return this.tags;
        }

        public LaunchTemplateData setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public LaunchTemplateData setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public LaunchTemplateData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public LaunchTemplateData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
