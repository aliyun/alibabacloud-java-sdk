// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLindormInstanceResponseBody extends TeaModel {
    @NameInMap("EngineList")
    public java.util.List<GetLindormInstanceResponseBodyEngineList> engineList;

    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("DiskUsage")
    public String diskUsage;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("ServiceType")
    public String serviceType;

    @NameInMap("InstanceAlias")
    public String instanceAlias;

    @NameInMap("InstanceStatus")
    public String instanceStatus;

    @NameInMap("EngineType")
    public Integer engineType;

    @NameInMap("InstanceStorage")
    public String instanceStorage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("ColdStorage")
    public Integer coldStorage;

    @NameInMap("DiskCategory")
    public String diskCategory;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("DeletionProtection")
    public String deletionProtection;

    @NameInMap("VswitchId")
    public String vswitchId;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("AliUid")
    public Long aliUid;

    public static GetLindormInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLindormInstanceResponseBody self = new GetLindormInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLindormInstanceResponseBody setEngineList(java.util.List<GetLindormInstanceResponseBodyEngineList> engineList) {
        this.engineList = engineList;
        return this;
    }
    public java.util.List<GetLindormInstanceResponseBodyEngineList> getEngineList() {
        return this.engineList;
    }

    public GetLindormInstanceResponseBody setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public GetLindormInstanceResponseBody setDiskUsage(String diskUsage) {
        this.diskUsage = diskUsage;
        return this;
    }
    public String getDiskUsage() {
        return this.diskUsage;
    }

    public GetLindormInstanceResponseBody setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public GetLindormInstanceResponseBody setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public GetLindormInstanceResponseBody setInstanceAlias(String instanceAlias) {
        this.instanceAlias = instanceAlias;
        return this;
    }
    public String getInstanceAlias() {
        return this.instanceAlias;
    }

    public GetLindormInstanceResponseBody setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public GetLindormInstanceResponseBody setEngineType(Integer engineType) {
        this.engineType = engineType;
        return this;
    }
    public Integer getEngineType() {
        return this.engineType;
    }

    public GetLindormInstanceResponseBody setInstanceStorage(String instanceStorage) {
        this.instanceStorage = instanceStorage;
        return this;
    }
    public String getInstanceStorage() {
        return this.instanceStorage;
    }

    public GetLindormInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLindormInstanceResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public GetLindormInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetLindormInstanceResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetLindormInstanceResponseBody setColdStorage(Integer coldStorage) {
        this.coldStorage = coldStorage;
        return this;
    }
    public Integer getColdStorage() {
        return this.coldStorage;
    }

    public GetLindormInstanceResponseBody setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
        return this;
    }
    public String getDiskCategory() {
        return this.diskCategory;
    }

    public GetLindormInstanceResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public GetLindormInstanceResponseBody setDeletionProtection(String deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public String getDeletionProtection() {
        return this.deletionProtection;
    }

    public GetLindormInstanceResponseBody setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

    public GetLindormInstanceResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public GetLindormInstanceResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetLindormInstanceResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public GetLindormInstanceResponseBody setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public static class GetLindormInstanceResponseBodyEngineList extends TeaModel {
        @NameInMap("Version")
        public String version;

        @NameInMap("CpuCount")
        public String cpuCount;

        @NameInMap("CoreCount")
        public String coreCount;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("MemorySize")
        public String memorySize;

        @NameInMap("IsLastVersion")
        public Boolean isLastVersion;

        public static GetLindormInstanceResponseBodyEngineList build(java.util.Map<String, ?> map) throws Exception {
            GetLindormInstanceResponseBodyEngineList self = new GetLindormInstanceResponseBodyEngineList();
            return TeaModel.build(map, self);
        }

        public GetLindormInstanceResponseBodyEngineList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetLindormInstanceResponseBodyEngineList setCpuCount(String cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }
        public String getCpuCount() {
            return this.cpuCount;
        }

        public GetLindormInstanceResponseBodyEngineList setCoreCount(String coreCount) {
            this.coreCount = coreCount;
            return this;
        }
        public String getCoreCount() {
            return this.coreCount;
        }

        public GetLindormInstanceResponseBodyEngineList setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public GetLindormInstanceResponseBodyEngineList setMemorySize(String memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public String getMemorySize() {
            return this.memorySize;
        }

        public GetLindormInstanceResponseBodyEngineList setIsLastVersion(Boolean isLastVersion) {
            this.isLastVersion = isLastVersion;
            return this;
        }
        public Boolean getIsLastVersion() {
            return this.isLastVersion;
        }

    }

}
