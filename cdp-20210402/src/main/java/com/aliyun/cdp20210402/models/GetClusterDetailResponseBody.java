// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class GetClusterDetailResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetClusterDetailResponseBodyData data;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Integer total;

    public static GetClusterDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterDetailResponseBody self = new GetClusterDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterDetailResponseBody setData(GetClusterDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetClusterDetailResponseBodyData getData() {
        return this.data;
    }

    public GetClusterDetailResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetClusterDetailResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public GetClusterDetailResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetClusterDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClusterDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetClusterDetailResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class GetClusterDetailResponseBodyDataEcsGroupList extends TeaModel {
        @NameInMap("CpuCount")
        public Integer cpuCount;

        @NameInMap("DiskCapacity")
        public Integer diskCapacity;

        @NameInMap("DiskCount")
        public Integer diskCount;

        @NameInMap("DiskType")
        public String diskType;

        @NameInMap("HostGroupName")
        public String hostGroupName;

        @NameInMap("HostGroupType")
        public String hostGroupType;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("MemorySize")
        public Integer memorySize;

        @NameInMap("NodeCount")
        public Integer nodeCount;

        @NameInMap("SystemDiskCapacity")
        public String systemDiskCapacity;

        @NameInMap("SystemDiskCount")
        public Integer systemDiskCount;

        @NameInMap("SystemDiskType")
        public String systemDiskType;

        public static GetClusterDetailResponseBodyDataEcsGroupList build(java.util.Map<String, ?> map) throws Exception {
            GetClusterDetailResponseBodyDataEcsGroupList self = new GetClusterDetailResponseBodyDataEcsGroupList();
            return TeaModel.build(map, self);
        }

        public GetClusterDetailResponseBodyDataEcsGroupList setCpuCount(Integer cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }
        public Integer getCpuCount() {
            return this.cpuCount;
        }

        public GetClusterDetailResponseBodyDataEcsGroupList setDiskCapacity(Integer diskCapacity) {
            this.diskCapacity = diskCapacity;
            return this;
        }
        public Integer getDiskCapacity() {
            return this.diskCapacity;
        }

        public GetClusterDetailResponseBodyDataEcsGroupList setDiskCount(Integer diskCount) {
            this.diskCount = diskCount;
            return this;
        }
        public Integer getDiskCount() {
            return this.diskCount;
        }

        public GetClusterDetailResponseBodyDataEcsGroupList setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public GetClusterDetailResponseBodyDataEcsGroupList setHostGroupName(String hostGroupName) {
            this.hostGroupName = hostGroupName;
            return this;
        }
        public String getHostGroupName() {
            return this.hostGroupName;
        }

        public GetClusterDetailResponseBodyDataEcsGroupList setHostGroupType(String hostGroupType) {
            this.hostGroupType = hostGroupType;
            return this;
        }
        public String getHostGroupType() {
            return this.hostGroupType;
        }

        public GetClusterDetailResponseBodyDataEcsGroupList setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public GetClusterDetailResponseBodyDataEcsGroupList setMemorySize(Integer memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public Integer getMemorySize() {
            return this.memorySize;
        }

        public GetClusterDetailResponseBodyDataEcsGroupList setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public GetClusterDetailResponseBodyDataEcsGroupList setSystemDiskCapacity(String systemDiskCapacity) {
            this.systemDiskCapacity = systemDiskCapacity;
            return this;
        }
        public String getSystemDiskCapacity() {
            return this.systemDiskCapacity;
        }

        public GetClusterDetailResponseBodyDataEcsGroupList setSystemDiskCount(Integer systemDiskCount) {
            this.systemDiskCount = systemDiskCount;
            return this;
        }
        public Integer getSystemDiskCount() {
            return this.systemDiskCount;
        }

        public GetClusterDetailResponseBodyDataEcsGroupList setSystemDiskType(String systemDiskType) {
            this.systemDiskType = systemDiskType;
            return this;
        }
        public String getSystemDiskType() {
            return this.systemDiskType;
        }

    }

    public static class GetClusterDetailResponseBodyData extends TeaModel {
        @NameInMap("BeginTime")
        public Long beginTime;

        @NameInMap("ClusterBizId")
        public String clusterBizId;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("ClusterStatus")
        public String clusterStatus;

        @NameInMap("ClusterStatusValue")
        public Integer clusterStatusValue;

        @NameInMap("ControlCenterUrl")
        public String controlCenterUrl;

        @NameInMap("DeployMode")
        public String deployMode;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("EcsGroupList")
        public java.util.List<GetClusterDetailResponseBodyDataEcsGroupList> ecsGroupList;

        @NameInMap("ExpireTime")
        public Boolean expireTime;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("InstanceConf")
        public java.util.Map<String, ?> instanceConf;

        @NameInMap("OrderBizId")
        public String orderBizId;

        @NameInMap("PackageType")
        public String packageType;

        @NameInMap("PricingCycle")
        public String pricingCycle;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RunningTime")
        public Long runningTime;

        @NameInMap("ZoneId")
        public String zoneId;

        public static GetClusterDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetClusterDetailResponseBodyData self = new GetClusterDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetClusterDetailResponseBodyData setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public GetClusterDetailResponseBodyData setClusterBizId(String clusterBizId) {
            this.clusterBizId = clusterBizId;
            return this;
        }
        public String getClusterBizId() {
            return this.clusterBizId;
        }

        public GetClusterDetailResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetClusterDetailResponseBodyData setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public GetClusterDetailResponseBodyData setClusterStatus(String clusterStatus) {
            this.clusterStatus = clusterStatus;
            return this;
        }
        public String getClusterStatus() {
            return this.clusterStatus;
        }

        public GetClusterDetailResponseBodyData setClusterStatusValue(Integer clusterStatusValue) {
            this.clusterStatusValue = clusterStatusValue;
            return this;
        }
        public Integer getClusterStatusValue() {
            return this.clusterStatusValue;
        }

        public GetClusterDetailResponseBodyData setControlCenterUrl(String controlCenterUrl) {
            this.controlCenterUrl = controlCenterUrl;
            return this;
        }
        public String getControlCenterUrl() {
            return this.controlCenterUrl;
        }

        public GetClusterDetailResponseBodyData setDeployMode(String deployMode) {
            this.deployMode = deployMode;
            return this;
        }
        public String getDeployMode() {
            return this.deployMode;
        }

        public GetClusterDetailResponseBodyData setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public GetClusterDetailResponseBodyData setEcsGroupList(java.util.List<GetClusterDetailResponseBodyDataEcsGroupList> ecsGroupList) {
            this.ecsGroupList = ecsGroupList;
            return this;
        }
        public java.util.List<GetClusterDetailResponseBodyDataEcsGroupList> getEcsGroupList() {
            return this.ecsGroupList;
        }

        public GetClusterDetailResponseBodyData setExpireTime(Boolean expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Boolean getExpireTime() {
            return this.expireTime;
        }

        public GetClusterDetailResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetClusterDetailResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetClusterDetailResponseBodyData setInstanceConf(java.util.Map<String, ?> instanceConf) {
            this.instanceConf = instanceConf;
            return this;
        }
        public java.util.Map<String, ?> getInstanceConf() {
            return this.instanceConf;
        }

        public GetClusterDetailResponseBodyData setOrderBizId(String orderBizId) {
            this.orderBizId = orderBizId;
            return this;
        }
        public String getOrderBizId() {
            return this.orderBizId;
        }

        public GetClusterDetailResponseBodyData setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public GetClusterDetailResponseBodyData setPricingCycle(String pricingCycle) {
            this.pricingCycle = pricingCycle;
            return this;
        }
        public String getPricingCycle() {
            return this.pricingCycle;
        }

        public GetClusterDetailResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetClusterDetailResponseBodyData setRunningTime(Long runningTime) {
            this.runningTime = runningTime;
            return this;
        }
        public Long getRunningTime() {
            return this.runningTime;
        }

        public GetClusterDetailResponseBodyData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
