// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLindormV2InstanceForTerraformResponseBody extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("ArbiterVSwitchId")
    public String arbiterVSwitchId;

    @NameInMap("ArbiterZoneId")
    public String arbiterZoneId;

    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("CloudStorageSize")
    public Long cloudStorageSize;

    @NameInMap("ColdStorage")
    public Integer coldStorage;

    @NameInMap("CreateMilliseconds")
    public Long createMilliseconds;

    @NameInMap("DeletionProtection")
    public String deletionProtection;

    @NameInMap("DiskCategory")
    public String diskCategory;

    @NameInMap("DiskThreshold")
    public String diskThreshold;

    @NameInMap("DiskUsage")
    public String diskUsage;

    @NameInMap("EnableCompute")
    public Boolean enableCompute;

    @NameInMap("EngineList")
    public java.util.List<GetLindormV2InstanceForTerraformResponseBodyEngineList> engineList;

    @NameInMap("ExpiredMilliseconds")
    public Long expiredMilliseconds;

    @NameInMap("InitialRootPassword")
    public String initialRootPassword;

    @NameInMap("InstanceAlias")
    public String instanceAlias;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceStatus")
    public String instanceStatus;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("MaintainEndTime")
    public String maintainEndTime;

    @NameInMap("MaintainStartTime")
    public String maintainStartTime;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("PrimaryVSwitchId")
    public String primaryVSwitchId;

    @NameInMap("PrimaryZoneId")
    public String primaryZoneId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ServiceType")
    public String serviceType;

    @NameInMap("StandbyVSwitchId")
    public String standbyVSwitchId;

    @NameInMap("StandbyZoneId")
    public String standbyZoneId;

    @NameInMap("StorageUsage")
    public GetLindormV2InstanceForTerraformResponseBodyStorageUsage storageUsage;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VswitchId")
    public String vswitchId;

    @NameInMap("WhiteIpList")
    public java.util.List<GetLindormV2InstanceForTerraformResponseBodyWhiteIpList> whiteIpList;

    @NameInMap("ZoneEngineInfoMap")
    public java.util.Map<String, ?> zoneEngineInfoMap;

    @NameInMap("ZoneId")
    public String zoneId;

    public static GetLindormV2InstanceForTerraformResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLindormV2InstanceForTerraformResponseBody self = new GetLindormV2InstanceForTerraformResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLindormV2InstanceForTerraformResponseBody setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public GetLindormV2InstanceForTerraformResponseBody setArbiterVSwitchId(String arbiterVSwitchId) {
        this.arbiterVSwitchId = arbiterVSwitchId;
        return this;
    }
    public String getArbiterVSwitchId() {
        return this.arbiterVSwitchId;
    }

    public GetLindormV2InstanceForTerraformResponseBody setArbiterZoneId(String arbiterZoneId) {
        this.arbiterZoneId = arbiterZoneId;
        return this;
    }
    public String getArbiterZoneId() {
        return this.arbiterZoneId;
    }

    public GetLindormV2InstanceForTerraformResponseBody setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public GetLindormV2InstanceForTerraformResponseBody setCloudStorageSize(Long cloudStorageSize) {
        this.cloudStorageSize = cloudStorageSize;
        return this;
    }
    public Long getCloudStorageSize() {
        return this.cloudStorageSize;
    }

    public GetLindormV2InstanceForTerraformResponseBody setColdStorage(Integer coldStorage) {
        this.coldStorage = coldStorage;
        return this;
    }
    public Integer getColdStorage() {
        return this.coldStorage;
    }

    public GetLindormV2InstanceForTerraformResponseBody setCreateMilliseconds(Long createMilliseconds) {
        this.createMilliseconds = createMilliseconds;
        return this;
    }
    public Long getCreateMilliseconds() {
        return this.createMilliseconds;
    }

    public GetLindormV2InstanceForTerraformResponseBody setDeletionProtection(String deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public String getDeletionProtection() {
        return this.deletionProtection;
    }

    public GetLindormV2InstanceForTerraformResponseBody setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
        return this;
    }
    public String getDiskCategory() {
        return this.diskCategory;
    }

    public GetLindormV2InstanceForTerraformResponseBody setDiskThreshold(String diskThreshold) {
        this.diskThreshold = diskThreshold;
        return this;
    }
    public String getDiskThreshold() {
        return this.diskThreshold;
    }

    public GetLindormV2InstanceForTerraformResponseBody setDiskUsage(String diskUsage) {
        this.diskUsage = diskUsage;
        return this;
    }
    public String getDiskUsage() {
        return this.diskUsage;
    }

    public GetLindormV2InstanceForTerraformResponseBody setEnableCompute(Boolean enableCompute) {
        this.enableCompute = enableCompute;
        return this;
    }
    public Boolean getEnableCompute() {
        return this.enableCompute;
    }

    public GetLindormV2InstanceForTerraformResponseBody setEngineList(java.util.List<GetLindormV2InstanceForTerraformResponseBodyEngineList> engineList) {
        this.engineList = engineList;
        return this;
    }
    public java.util.List<GetLindormV2InstanceForTerraformResponseBodyEngineList> getEngineList() {
        return this.engineList;
    }

    public GetLindormV2InstanceForTerraformResponseBody setExpiredMilliseconds(Long expiredMilliseconds) {
        this.expiredMilliseconds = expiredMilliseconds;
        return this;
    }
    public Long getExpiredMilliseconds() {
        return this.expiredMilliseconds;
    }

    public GetLindormV2InstanceForTerraformResponseBody setInitialRootPassword(String initialRootPassword) {
        this.initialRootPassword = initialRootPassword;
        return this;
    }
    public String getInitialRootPassword() {
        return this.initialRootPassword;
    }

    public GetLindormV2InstanceForTerraformResponseBody setInstanceAlias(String instanceAlias) {
        this.instanceAlias = instanceAlias;
        return this;
    }
    public String getInstanceAlias() {
        return this.instanceAlias;
    }

    public GetLindormV2InstanceForTerraformResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetLindormV2InstanceForTerraformResponseBody setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public GetLindormV2InstanceForTerraformResponseBody setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public GetLindormV2InstanceForTerraformResponseBody setMaintainEndTime(String maintainEndTime) {
        this.maintainEndTime = maintainEndTime;
        return this;
    }
    public String getMaintainEndTime() {
        return this.maintainEndTime;
    }

    public GetLindormV2InstanceForTerraformResponseBody setMaintainStartTime(String maintainStartTime) {
        this.maintainStartTime = maintainStartTime;
        return this;
    }
    public String getMaintainStartTime() {
        return this.maintainStartTime;
    }

    public GetLindormV2InstanceForTerraformResponseBody setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public GetLindormV2InstanceForTerraformResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public GetLindormV2InstanceForTerraformResponseBody setPrimaryVSwitchId(String primaryVSwitchId) {
        this.primaryVSwitchId = primaryVSwitchId;
        return this;
    }
    public String getPrimaryVSwitchId() {
        return this.primaryVSwitchId;
    }

    public GetLindormV2InstanceForTerraformResponseBody setPrimaryZoneId(String primaryZoneId) {
        this.primaryZoneId = primaryZoneId;
        return this;
    }
    public String getPrimaryZoneId() {
        return this.primaryZoneId;
    }

    public GetLindormV2InstanceForTerraformResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetLindormV2InstanceForTerraformResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLindormV2InstanceForTerraformResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetLindormV2InstanceForTerraformResponseBody setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public GetLindormV2InstanceForTerraformResponseBody setStandbyVSwitchId(String standbyVSwitchId) {
        this.standbyVSwitchId = standbyVSwitchId;
        return this;
    }
    public String getStandbyVSwitchId() {
        return this.standbyVSwitchId;
    }

    public GetLindormV2InstanceForTerraformResponseBody setStandbyZoneId(String standbyZoneId) {
        this.standbyZoneId = standbyZoneId;
        return this;
    }
    public String getStandbyZoneId() {
        return this.standbyZoneId;
    }

    public GetLindormV2InstanceForTerraformResponseBody setStorageUsage(GetLindormV2InstanceForTerraformResponseBodyStorageUsage storageUsage) {
        this.storageUsage = storageUsage;
        return this;
    }
    public GetLindormV2InstanceForTerraformResponseBodyStorageUsage getStorageUsage() {
        return this.storageUsage;
    }

    public GetLindormV2InstanceForTerraformResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public GetLindormV2InstanceForTerraformResponseBody setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

    public GetLindormV2InstanceForTerraformResponseBody setWhiteIpList(java.util.List<GetLindormV2InstanceForTerraformResponseBodyWhiteIpList> whiteIpList) {
        this.whiteIpList = whiteIpList;
        return this;
    }
    public java.util.List<GetLindormV2InstanceForTerraformResponseBodyWhiteIpList> getWhiteIpList() {
        return this.whiteIpList;
    }

    public GetLindormV2InstanceForTerraformResponseBody setZoneEngineInfoMap(java.util.Map<String, ?> zoneEngineInfoMap) {
        this.zoneEngineInfoMap = zoneEngineInfoMap;
        return this;
    }
    public java.util.Map<String, ?> getZoneEngineInfoMap() {
        return this.zoneEngineInfoMap;
    }

    public GetLindormV2InstanceForTerraformResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class GetLindormV2InstanceForTerraformResponseBodyEngineListConnectAddressList extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("Port")
        public String port;

        @NameInMap("Type")
        public String type;

        public static GetLindormV2InstanceForTerraformResponseBodyEngineListConnectAddressList build(java.util.Map<String, ?> map) throws Exception {
            GetLindormV2InstanceForTerraformResponseBodyEngineListConnectAddressList self = new GetLindormV2InstanceForTerraformResponseBodyEngineListConnectAddressList();
            return TeaModel.build(map, self);
        }

        public GetLindormV2InstanceForTerraformResponseBodyEngineListConnectAddressList setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public GetLindormV2InstanceForTerraformResponseBodyEngineListConnectAddressList setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public GetLindormV2InstanceForTerraformResponseBodyEngineListConnectAddressList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetLindormV2InstanceForTerraformResponseBodyEngineListNodeGroup extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("CpuCoreCount")
        public Integer cpuCoreCount;

        @NameInMap("EnableAttachLocalDisk")
        public Boolean enableAttachLocalDisk;

        @NameInMap("LocalDiskCapacity")
        public Long localDiskCapacity;

        @NameInMap("LocalDiskCategory")
        public String localDiskCategory;

        @NameInMap("MemorySizeGiB")
        public Integer memorySizeGiB;

        @NameInMap("NodeSpec")
        public String nodeSpec;

        @NameInMap("Quantity")
        public Integer quantity;

        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        @NameInMap("SpecId")
        public String specId;

        @NameInMap("Status")
        public String status;

        public static GetLindormV2InstanceForTerraformResponseBodyEngineListNodeGroup build(java.util.Map<String, ?> map) throws Exception {
            GetLindormV2InstanceForTerraformResponseBodyEngineListNodeGroup self = new GetLindormV2InstanceForTerraformResponseBodyEngineListNodeGroup();
            return TeaModel.build(map, self);
        }

        public GetLindormV2InstanceForTerraformResponseBodyEngineListNodeGroup setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetLindormV2InstanceForTerraformResponseBodyEngineListNodeGroup setCpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            return this;
        }
        public Integer getCpuCoreCount() {
            return this.cpuCoreCount;
        }

        public GetLindormV2InstanceForTerraformResponseBodyEngineListNodeGroup setEnableAttachLocalDisk(Boolean enableAttachLocalDisk) {
            this.enableAttachLocalDisk = enableAttachLocalDisk;
            return this;
        }
        public Boolean getEnableAttachLocalDisk() {
            return this.enableAttachLocalDisk;
        }

        public GetLindormV2InstanceForTerraformResponseBodyEngineListNodeGroup setLocalDiskCapacity(Long localDiskCapacity) {
            this.localDiskCapacity = localDiskCapacity;
            return this;
        }
        public Long getLocalDiskCapacity() {
            return this.localDiskCapacity;
        }

        public GetLindormV2InstanceForTerraformResponseBodyEngineListNodeGroup setLocalDiskCategory(String localDiskCategory) {
            this.localDiskCategory = localDiskCategory;
            return this;
        }
        public String getLocalDiskCategory() {
            return this.localDiskCategory;
        }

        public GetLindormV2InstanceForTerraformResponseBodyEngineListNodeGroup setMemorySizeGiB(Integer memorySizeGiB) {
            this.memorySizeGiB = memorySizeGiB;
            return this;
        }
        public Integer getMemorySizeGiB() {
            return this.memorySizeGiB;
        }

        public GetLindormV2InstanceForTerraformResponseBodyEngineListNodeGroup setNodeSpec(String nodeSpec) {
            this.nodeSpec = nodeSpec;
            return this;
        }
        public String getNodeSpec() {
            return this.nodeSpec;
        }

        public GetLindormV2InstanceForTerraformResponseBodyEngineListNodeGroup setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public GetLindormV2InstanceForTerraformResponseBodyEngineListNodeGroup setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        public GetLindormV2InstanceForTerraformResponseBodyEngineListNodeGroup setSpecId(String specId) {
            this.specId = specId;
            return this;
        }
        public String getSpecId() {
            return this.specId;
        }

        public GetLindormV2InstanceForTerraformResponseBodyEngineListNodeGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetLindormV2InstanceForTerraformResponseBodyEngineList extends TeaModel {
        @NameInMap("ConnectAddressList")
        public java.util.List<GetLindormV2InstanceForTerraformResponseBodyEngineListConnectAddressList> connectAddressList;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("IsLastVersion")
        public Boolean isLastVersion;

        @NameInMap("LatestVersion")
        public String latestVersion;

        @NameInMap("NodeGroup")
        public java.util.List<GetLindormV2InstanceForTerraformResponseBodyEngineListNodeGroup> nodeGroup;

        @NameInMap("Version")
        public String version;

        public static GetLindormV2InstanceForTerraformResponseBodyEngineList build(java.util.Map<String, ?> map) throws Exception {
            GetLindormV2InstanceForTerraformResponseBodyEngineList self = new GetLindormV2InstanceForTerraformResponseBodyEngineList();
            return TeaModel.build(map, self);
        }

        public GetLindormV2InstanceForTerraformResponseBodyEngineList setConnectAddressList(java.util.List<GetLindormV2InstanceForTerraformResponseBodyEngineListConnectAddressList> connectAddressList) {
            this.connectAddressList = connectAddressList;
            return this;
        }
        public java.util.List<GetLindormV2InstanceForTerraformResponseBodyEngineListConnectAddressList> getConnectAddressList() {
            return this.connectAddressList;
        }

        public GetLindormV2InstanceForTerraformResponseBodyEngineList setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public GetLindormV2InstanceForTerraformResponseBodyEngineList setIsLastVersion(Boolean isLastVersion) {
            this.isLastVersion = isLastVersion;
            return this;
        }
        public Boolean getIsLastVersion() {
            return this.isLastVersion;
        }

        public GetLindormV2InstanceForTerraformResponseBodyEngineList setLatestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }
        public String getLatestVersion() {
            return this.latestVersion;
        }

        public GetLindormV2InstanceForTerraformResponseBodyEngineList setNodeGroup(java.util.List<GetLindormV2InstanceForTerraformResponseBodyEngineListNodeGroup> nodeGroup) {
            this.nodeGroup = nodeGroup;
            return this;
        }
        public java.util.List<GetLindormV2InstanceForTerraformResponseBodyEngineListNodeGroup> getNodeGroup() {
            return this.nodeGroup;
        }

        public GetLindormV2InstanceForTerraformResponseBodyEngineList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetLindormV2InstanceForTerraformResponseBodyStorageUsage extends TeaModel {
        @NameInMap("CapacityByDiskCategory")
        public java.util.List<java.util.Map<String, ?>> capacityByDiskCategory;

        @NameInMap("EngineUsage")
        public java.util.Map<String, ?> engineUsage;

        public static GetLindormV2InstanceForTerraformResponseBodyStorageUsage build(java.util.Map<String, ?> map) throws Exception {
            GetLindormV2InstanceForTerraformResponseBodyStorageUsage self = new GetLindormV2InstanceForTerraformResponseBodyStorageUsage();
            return TeaModel.build(map, self);
        }

        public GetLindormV2InstanceForTerraformResponseBodyStorageUsage setCapacityByDiskCategory(java.util.List<java.util.Map<String, ?>> capacityByDiskCategory) {
            this.capacityByDiskCategory = capacityByDiskCategory;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getCapacityByDiskCategory() {
            return this.capacityByDiskCategory;
        }

        public GetLindormV2InstanceForTerraformResponseBodyStorageUsage setEngineUsage(java.util.Map<String, ?> engineUsage) {
            this.engineUsage = engineUsage;
            return this;
        }
        public java.util.Map<String, ?> getEngineUsage() {
            return this.engineUsage;
        }

    }

    public static class GetLindormV2InstanceForTerraformResponseBodyWhiteIpList extends TeaModel {
        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("IpList")
        public String ipList;

        public static GetLindormV2InstanceForTerraformResponseBodyWhiteIpList build(java.util.Map<String, ?> map) throws Exception {
            GetLindormV2InstanceForTerraformResponseBodyWhiteIpList self = new GetLindormV2InstanceForTerraformResponseBodyWhiteIpList();
            return TeaModel.build(map, self);
        }

        public GetLindormV2InstanceForTerraformResponseBodyWhiteIpList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetLindormV2InstanceForTerraformResponseBodyWhiteIpList setIpList(String ipList) {
            this.ipList = ipList;
            return this;
        }
        public String getIpList() {
            return this.ipList;
        }

    }

}
