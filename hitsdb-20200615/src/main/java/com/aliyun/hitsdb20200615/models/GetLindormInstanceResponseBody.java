// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLindormInstanceResponseBody extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("ArbiterVSwitchId")
    public String arbiterVSwitchId;

    @NameInMap("ArbiterZoneId")
    public String arbiterZoneId;

    @NameInMap("ArchVersion")
    public String archVersion;

    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("ColdStorage")
    public Integer coldStorage;

    @NameInMap("CoreDiskCategory")
    public String coreDiskCategory;

    @NameInMap("CoreNum")
    public Integer coreNum;

    @NameInMap("CoreSingleStorage")
    public Integer coreSingleStorage;

    @NameInMap("CoreSpec")
    public String coreSpec;

    @NameInMap("CreateMilliseconds")
    public Long createMilliseconds;

    /**
     * <p>The storage capacity of the disk of a single log node. This parameter is returned only for multi-zone instances.</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("DeletionProtection")
    public String deletionProtection;

    @NameInMap("DiskCategory")
    public String diskCategory;

    @NameInMap("DiskThreshold")
    public String diskThreshold;

    @NameInMap("DiskUsage")
    public String diskUsage;

    @NameInMap("EnableBlob")
    public Boolean enableBlob;

    @NameInMap("EnableCdc")
    public Boolean enableCdc;

    @NameInMap("EnableCompute")
    public Boolean enableCompute;

    @NameInMap("EnableKms")
    public Boolean enableKms;

    @NameInMap("EnableLTS")
    public Boolean enableLTS;

    @NameInMap("EnableLsqlVersionV3")
    public Boolean enableLsqlVersionV3;

    @NameInMap("EnableMLCtrl")
    public Boolean enableMLCtrl;

    @NameInMap("EnableSSL")
    public Boolean enableSSL;

    @NameInMap("EnableShs")
    public Boolean enableShs;

    @NameInMap("EnableStream")
    public Boolean enableStream;

    @NameInMap("EngineList")
    public java.util.List<GetLindormInstanceResponseBodyEngineList> engineList;

    @NameInMap("EngineType")
    public Integer engineType;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("ExpiredMilliseconds")
    public Long expiredMilliseconds;

    @NameInMap("InstanceAlias")
    public String instanceAlias;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceStatus")
    public String instanceStatus;

    @NameInMap("InstanceStorage")
    public String instanceStorage;

    @NameInMap("LogDiskCategory")
    public String logDiskCategory;

    @NameInMap("LogNum")
    public Integer logNum;

    @NameInMap("LogSingleStorage")
    public Integer logSingleStorage;

    @NameInMap("LogSpec")
    public String logSpec;

    @NameInMap("MaintainEndTime")
    public String maintainEndTime;

    @NameInMap("MaintainStartTime")
    public String maintainStartTime;

    @NameInMap("MultiZoneCombination")
    public String multiZoneCombination;

    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>400</p>
     */
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

    /**
     * <p>The type of the log nodes. This parameter is returned only for multi-zone instances.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The number of the log nodes. This parameter is returned only for multi-zone instances.</p>
     */
    @NameInMap("VswitchId")
    public String vswitchId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static GetLindormInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLindormInstanceResponseBody self = new GetLindormInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLindormInstanceResponseBody setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public GetLindormInstanceResponseBody setArbiterVSwitchId(String arbiterVSwitchId) {
        this.arbiterVSwitchId = arbiterVSwitchId;
        return this;
    }
    public String getArbiterVSwitchId() {
        return this.arbiterVSwitchId;
    }

    public GetLindormInstanceResponseBody setArbiterZoneId(String arbiterZoneId) {
        this.arbiterZoneId = arbiterZoneId;
        return this;
    }
    public String getArbiterZoneId() {
        return this.arbiterZoneId;
    }

    public GetLindormInstanceResponseBody setArchVersion(String archVersion) {
        this.archVersion = archVersion;
        return this;
    }
    public String getArchVersion() {
        return this.archVersion;
    }

    public GetLindormInstanceResponseBody setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public GetLindormInstanceResponseBody setColdStorage(Integer coldStorage) {
        this.coldStorage = coldStorage;
        return this;
    }
    public Integer getColdStorage() {
        return this.coldStorage;
    }

    public GetLindormInstanceResponseBody setCoreDiskCategory(String coreDiskCategory) {
        this.coreDiskCategory = coreDiskCategory;
        return this;
    }
    public String getCoreDiskCategory() {
        return this.coreDiskCategory;
    }

    public GetLindormInstanceResponseBody setCoreNum(Integer coreNum) {
        this.coreNum = coreNum;
        return this;
    }
    public Integer getCoreNum() {
        return this.coreNum;
    }

    public GetLindormInstanceResponseBody setCoreSingleStorage(Integer coreSingleStorage) {
        this.coreSingleStorage = coreSingleStorage;
        return this;
    }
    public Integer getCoreSingleStorage() {
        return this.coreSingleStorage;
    }

    public GetLindormInstanceResponseBody setCoreSpec(String coreSpec) {
        this.coreSpec = coreSpec;
        return this;
    }
    public String getCoreSpec() {
        return this.coreSpec;
    }

    public GetLindormInstanceResponseBody setCreateMilliseconds(Long createMilliseconds) {
        this.createMilliseconds = createMilliseconds;
        return this;
    }
    public Long getCreateMilliseconds() {
        return this.createMilliseconds;
    }

    public GetLindormInstanceResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetLindormInstanceResponseBody setDeletionProtection(String deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public String getDeletionProtection() {
        return this.deletionProtection;
    }

    public GetLindormInstanceResponseBody setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
        return this;
    }
    public String getDiskCategory() {
        return this.diskCategory;
    }

    public GetLindormInstanceResponseBody setDiskThreshold(String diskThreshold) {
        this.diskThreshold = diskThreshold;
        return this;
    }
    public String getDiskThreshold() {
        return this.diskThreshold;
    }

    public GetLindormInstanceResponseBody setDiskUsage(String diskUsage) {
        this.diskUsage = diskUsage;
        return this;
    }
    public String getDiskUsage() {
        return this.diskUsage;
    }

    public GetLindormInstanceResponseBody setEnableBlob(Boolean enableBlob) {
        this.enableBlob = enableBlob;
        return this;
    }
    public Boolean getEnableBlob() {
        return this.enableBlob;
    }

    public GetLindormInstanceResponseBody setEnableCdc(Boolean enableCdc) {
        this.enableCdc = enableCdc;
        return this;
    }
    public Boolean getEnableCdc() {
        return this.enableCdc;
    }

    public GetLindormInstanceResponseBody setEnableCompute(Boolean enableCompute) {
        this.enableCompute = enableCompute;
        return this;
    }
    public Boolean getEnableCompute() {
        return this.enableCompute;
    }

    public GetLindormInstanceResponseBody setEnableKms(Boolean enableKms) {
        this.enableKms = enableKms;
        return this;
    }
    public Boolean getEnableKms() {
        return this.enableKms;
    }

    public GetLindormInstanceResponseBody setEnableLTS(Boolean enableLTS) {
        this.enableLTS = enableLTS;
        return this;
    }
    public Boolean getEnableLTS() {
        return this.enableLTS;
    }

    public GetLindormInstanceResponseBody setEnableLsqlVersionV3(Boolean enableLsqlVersionV3) {
        this.enableLsqlVersionV3 = enableLsqlVersionV3;
        return this;
    }
    public Boolean getEnableLsqlVersionV3() {
        return this.enableLsqlVersionV3;
    }

    public GetLindormInstanceResponseBody setEnableMLCtrl(Boolean enableMLCtrl) {
        this.enableMLCtrl = enableMLCtrl;
        return this;
    }
    public Boolean getEnableMLCtrl() {
        return this.enableMLCtrl;
    }

    public GetLindormInstanceResponseBody setEnableSSL(Boolean enableSSL) {
        this.enableSSL = enableSSL;
        return this;
    }
    public Boolean getEnableSSL() {
        return this.enableSSL;
    }

    public GetLindormInstanceResponseBody setEnableShs(Boolean enableShs) {
        this.enableShs = enableShs;
        return this;
    }
    public Boolean getEnableShs() {
        return this.enableShs;
    }

    public GetLindormInstanceResponseBody setEnableStream(Boolean enableStream) {
        this.enableStream = enableStream;
        return this;
    }
    public Boolean getEnableStream() {
        return this.enableStream;
    }

    public GetLindormInstanceResponseBody setEngineList(java.util.List<GetLindormInstanceResponseBodyEngineList> engineList) {
        this.engineList = engineList;
        return this;
    }
    public java.util.List<GetLindormInstanceResponseBodyEngineList> getEngineList() {
        return this.engineList;
    }

    public GetLindormInstanceResponseBody setEngineType(Integer engineType) {
        this.engineType = engineType;
        return this;
    }
    public Integer getEngineType() {
        return this.engineType;
    }

    public GetLindormInstanceResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public GetLindormInstanceResponseBody setExpiredMilliseconds(Long expiredMilliseconds) {
        this.expiredMilliseconds = expiredMilliseconds;
        return this;
    }
    public Long getExpiredMilliseconds() {
        return this.expiredMilliseconds;
    }

    public GetLindormInstanceResponseBody setInstanceAlias(String instanceAlias) {
        this.instanceAlias = instanceAlias;
        return this;
    }
    public String getInstanceAlias() {
        return this.instanceAlias;
    }

    public GetLindormInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetLindormInstanceResponseBody setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public GetLindormInstanceResponseBody setInstanceStorage(String instanceStorage) {
        this.instanceStorage = instanceStorage;
        return this;
    }
    public String getInstanceStorage() {
        return this.instanceStorage;
    }

    public GetLindormInstanceResponseBody setLogDiskCategory(String logDiskCategory) {
        this.logDiskCategory = logDiskCategory;
        return this;
    }
    public String getLogDiskCategory() {
        return this.logDiskCategory;
    }

    public GetLindormInstanceResponseBody setLogNum(Integer logNum) {
        this.logNum = logNum;
        return this;
    }
    public Integer getLogNum() {
        return this.logNum;
    }

    public GetLindormInstanceResponseBody setLogSingleStorage(Integer logSingleStorage) {
        this.logSingleStorage = logSingleStorage;
        return this;
    }
    public Integer getLogSingleStorage() {
        return this.logSingleStorage;
    }

    public GetLindormInstanceResponseBody setLogSpec(String logSpec) {
        this.logSpec = logSpec;
        return this;
    }
    public String getLogSpec() {
        return this.logSpec;
    }

    public GetLindormInstanceResponseBody setMaintainEndTime(String maintainEndTime) {
        this.maintainEndTime = maintainEndTime;
        return this;
    }
    public String getMaintainEndTime() {
        return this.maintainEndTime;
    }

    public GetLindormInstanceResponseBody setMaintainStartTime(String maintainStartTime) {
        this.maintainStartTime = maintainStartTime;
        return this;
    }
    public String getMaintainStartTime() {
        return this.maintainStartTime;
    }

    public GetLindormInstanceResponseBody setMultiZoneCombination(String multiZoneCombination) {
        this.multiZoneCombination = multiZoneCombination;
        return this;
    }
    public String getMultiZoneCombination() {
        return this.multiZoneCombination;
    }

    public GetLindormInstanceResponseBody setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public GetLindormInstanceResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public GetLindormInstanceResponseBody setPrimaryVSwitchId(String primaryVSwitchId) {
        this.primaryVSwitchId = primaryVSwitchId;
        return this;
    }
    public String getPrimaryVSwitchId() {
        return this.primaryVSwitchId;
    }

    public GetLindormInstanceResponseBody setPrimaryZoneId(String primaryZoneId) {
        this.primaryZoneId = primaryZoneId;
        return this;
    }
    public String getPrimaryZoneId() {
        return this.primaryZoneId;
    }

    public GetLindormInstanceResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetLindormInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLindormInstanceResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetLindormInstanceResponseBody setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public GetLindormInstanceResponseBody setStandbyVSwitchId(String standbyVSwitchId) {
        this.standbyVSwitchId = standbyVSwitchId;
        return this;
    }
    public String getStandbyVSwitchId() {
        return this.standbyVSwitchId;
    }

    public GetLindormInstanceResponseBody setStandbyZoneId(String standbyZoneId) {
        this.standbyZoneId = standbyZoneId;
        return this;
    }
    public String getStandbyZoneId() {
        return this.standbyZoneId;
    }

    public GetLindormInstanceResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public GetLindormInstanceResponseBody setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

    public GetLindormInstanceResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class GetLindormInstanceResponseBodyEngineList extends TeaModel {
        @NameInMap("CoreCount")
        public String coreCount;

        @NameInMap("CpuCount")
        public String cpuCount;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("IsLastVersion")
        public Boolean isLastVersion;

        @NameInMap("LatestVersion")
        public String latestVersion;

        @NameInMap("MemorySize")
        public String memorySize;

        @NameInMap("Version")
        public String version;

        public static GetLindormInstanceResponseBodyEngineList build(java.util.Map<String, ?> map) throws Exception {
            GetLindormInstanceResponseBodyEngineList self = new GetLindormInstanceResponseBodyEngineList();
            return TeaModel.build(map, self);
        }

        public GetLindormInstanceResponseBodyEngineList setCoreCount(String coreCount) {
            this.coreCount = coreCount;
            return this;
        }
        public String getCoreCount() {
            return this.coreCount;
        }

        public GetLindormInstanceResponseBodyEngineList setCpuCount(String cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }
        public String getCpuCount() {
            return this.cpuCount;
        }

        public GetLindormInstanceResponseBodyEngineList setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public GetLindormInstanceResponseBodyEngineList setIsLastVersion(Boolean isLastVersion) {
            this.isLastVersion = isLastVersion;
            return this;
        }
        public Boolean getIsLastVersion() {
            return this.isLastVersion;
        }

        public GetLindormInstanceResponseBodyEngineList setLatestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }
        public String getLatestVersion() {
            return this.latestVersion;
        }

        public GetLindormInstanceResponseBodyEngineList setMemorySize(String memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public String getMemorySize() {
            return this.memorySize;
        }

        public GetLindormInstanceResponseBodyEngineList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
