// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class SearchClusterInstancesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<SearchClusterInstancesResponseBodyData> data;

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

    public static SearchClusterInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchClusterInstancesResponseBody self = new SearchClusterInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchClusterInstancesResponseBody setData(java.util.List<SearchClusterInstancesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SearchClusterInstancesResponseBodyData> getData() {
        return this.data;
    }

    public SearchClusterInstancesResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public SearchClusterInstancesResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public SearchClusterInstancesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SearchClusterInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchClusterInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SearchClusterInstancesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class SearchClusterInstancesResponseBodyDataClusterInstanceInfo extends TeaModel {
        @NameInMap("ControlCenterLoginName")
        public String controlCenterLoginName;

        @NameInMap("ControlCenterUrl")
        public String controlCenterUrl;

        @NameInMap("SgId")
        public String sgId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VswId")
        public String vswId;

        public static SearchClusterInstancesResponseBodyDataClusterInstanceInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchClusterInstancesResponseBodyDataClusterInstanceInfo self = new SearchClusterInstancesResponseBodyDataClusterInstanceInfo();
            return TeaModel.build(map, self);
        }

        public SearchClusterInstancesResponseBodyDataClusterInstanceInfo setControlCenterLoginName(String controlCenterLoginName) {
            this.controlCenterLoginName = controlCenterLoginName;
            return this;
        }
        public String getControlCenterLoginName() {
            return this.controlCenterLoginName;
        }

        public SearchClusterInstancesResponseBodyDataClusterInstanceInfo setControlCenterUrl(String controlCenterUrl) {
            this.controlCenterUrl = controlCenterUrl;
            return this;
        }
        public String getControlCenterUrl() {
            return this.controlCenterUrl;
        }

        public SearchClusterInstancesResponseBodyDataClusterInstanceInfo setSgId(String sgId) {
            this.sgId = sgId;
            return this;
        }
        public String getSgId() {
            return this.sgId;
        }

        public SearchClusterInstancesResponseBodyDataClusterInstanceInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public SearchClusterInstancesResponseBodyDataClusterInstanceInfo setVswId(String vswId) {
            this.vswId = vswId;
            return this;
        }
        public String getVswId() {
            return this.vswId;
        }

    }

    public static class SearchClusterInstancesResponseBodyDataEcsGroupList extends TeaModel {
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

        public static SearchClusterInstancesResponseBodyDataEcsGroupList build(java.util.Map<String, ?> map) throws Exception {
            SearchClusterInstancesResponseBodyDataEcsGroupList self = new SearchClusterInstancesResponseBodyDataEcsGroupList();
            return TeaModel.build(map, self);
        }

        public SearchClusterInstancesResponseBodyDataEcsGroupList setCpuCount(Integer cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }
        public Integer getCpuCount() {
            return this.cpuCount;
        }

        public SearchClusterInstancesResponseBodyDataEcsGroupList setDiskCapacity(Integer diskCapacity) {
            this.diskCapacity = diskCapacity;
            return this;
        }
        public Integer getDiskCapacity() {
            return this.diskCapacity;
        }

        public SearchClusterInstancesResponseBodyDataEcsGroupList setDiskCount(Integer diskCount) {
            this.diskCount = diskCount;
            return this;
        }
        public Integer getDiskCount() {
            return this.diskCount;
        }

        public SearchClusterInstancesResponseBodyDataEcsGroupList setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public SearchClusterInstancesResponseBodyDataEcsGroupList setHostGroupName(String hostGroupName) {
            this.hostGroupName = hostGroupName;
            return this;
        }
        public String getHostGroupName() {
            return this.hostGroupName;
        }

        public SearchClusterInstancesResponseBodyDataEcsGroupList setHostGroupType(String hostGroupType) {
            this.hostGroupType = hostGroupType;
            return this;
        }
        public String getHostGroupType() {
            return this.hostGroupType;
        }

        public SearchClusterInstancesResponseBodyDataEcsGroupList setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public SearchClusterInstancesResponseBodyDataEcsGroupList setMemorySize(Integer memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public Integer getMemorySize() {
            return this.memorySize;
        }

        public SearchClusterInstancesResponseBodyDataEcsGroupList setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public SearchClusterInstancesResponseBodyDataEcsGroupList setSystemDiskCapacity(String systemDiskCapacity) {
            this.systemDiskCapacity = systemDiskCapacity;
            return this;
        }
        public String getSystemDiskCapacity() {
            return this.systemDiskCapacity;
        }

        public SearchClusterInstancesResponseBodyDataEcsGroupList setSystemDiskCount(Integer systemDiskCount) {
            this.systemDiskCount = systemDiskCount;
            return this;
        }
        public Integer getSystemDiskCount() {
            return this.systemDiskCount;
        }

        public SearchClusterInstancesResponseBodyDataEcsGroupList setSystemDiskType(String systemDiskType) {
            this.systemDiskType = systemDiskType;
            return this;
        }
        public String getSystemDiskType() {
            return this.systemDiskType;
        }

    }

    public static class SearchClusterInstancesResponseBodyData extends TeaModel {
        @NameInMap("BeginTime")
        public Long beginTime;

        @NameInMap("ClusterBizId")
        public String clusterBizId;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterInstanceInfo")
        public SearchClusterInstancesResponseBodyDataClusterInstanceInfo clusterInstanceInfo;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("ClusterStatus")
        public String clusterStatus;

        @NameInMap("ClusterStatusValue")
        public Integer clusterStatusValue;

        @NameInMap("ClusterType")
        public String clusterType;

        @NameInMap("ControlCenterUrl")
        public String controlCenterUrl;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("EcsGroupList")
        public java.util.List<SearchClusterInstancesResponseBodyDataEcsGroupList> ecsGroupList;

        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("FailReason")
        public String failReason;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("InstanceConf")
        public java.util.Map<String, ?> instanceConf;

        @NameInMap("NoticeConfirmed")
        public Boolean noticeConfirmed;

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

        public static SearchClusterInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchClusterInstancesResponseBodyData self = new SearchClusterInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchClusterInstancesResponseBodyData setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public SearchClusterInstancesResponseBodyData setClusterBizId(String clusterBizId) {
            this.clusterBizId = clusterBizId;
            return this;
        }
        public String getClusterBizId() {
            return this.clusterBizId;
        }

        public SearchClusterInstancesResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public SearchClusterInstancesResponseBodyData setClusterInstanceInfo(SearchClusterInstancesResponseBodyDataClusterInstanceInfo clusterInstanceInfo) {
            this.clusterInstanceInfo = clusterInstanceInfo;
            return this;
        }
        public SearchClusterInstancesResponseBodyDataClusterInstanceInfo getClusterInstanceInfo() {
            return this.clusterInstanceInfo;
        }

        public SearchClusterInstancesResponseBodyData setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public SearchClusterInstancesResponseBodyData setClusterStatus(String clusterStatus) {
            this.clusterStatus = clusterStatus;
            return this;
        }
        public String getClusterStatus() {
            return this.clusterStatus;
        }

        public SearchClusterInstancesResponseBodyData setClusterStatusValue(Integer clusterStatusValue) {
            this.clusterStatusValue = clusterStatusValue;
            return this;
        }
        public Integer getClusterStatusValue() {
            return this.clusterStatusValue;
        }

        public SearchClusterInstancesResponseBodyData setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public SearchClusterInstancesResponseBodyData setControlCenterUrl(String controlCenterUrl) {
            this.controlCenterUrl = controlCenterUrl;
            return this;
        }
        public String getControlCenterUrl() {
            return this.controlCenterUrl;
        }

        public SearchClusterInstancesResponseBodyData setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public SearchClusterInstancesResponseBodyData setEcsGroupList(java.util.List<SearchClusterInstancesResponseBodyDataEcsGroupList> ecsGroupList) {
            this.ecsGroupList = ecsGroupList;
            return this;
        }
        public java.util.List<SearchClusterInstancesResponseBodyDataEcsGroupList> getEcsGroupList() {
            return this.ecsGroupList;
        }

        public SearchClusterInstancesResponseBodyData setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public SearchClusterInstancesResponseBodyData setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

        public SearchClusterInstancesResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public SearchClusterInstancesResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public SearchClusterInstancesResponseBodyData setInstanceConf(java.util.Map<String, ?> instanceConf) {
            this.instanceConf = instanceConf;
            return this;
        }
        public java.util.Map<String, ?> getInstanceConf() {
            return this.instanceConf;
        }

        public SearchClusterInstancesResponseBodyData setNoticeConfirmed(Boolean noticeConfirmed) {
            this.noticeConfirmed = noticeConfirmed;
            return this;
        }
        public Boolean getNoticeConfirmed() {
            return this.noticeConfirmed;
        }

        public SearchClusterInstancesResponseBodyData setOrderBizId(String orderBizId) {
            this.orderBizId = orderBizId;
            return this;
        }
        public String getOrderBizId() {
            return this.orderBizId;
        }

        public SearchClusterInstancesResponseBodyData setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public SearchClusterInstancesResponseBodyData setPricingCycle(String pricingCycle) {
            this.pricingCycle = pricingCycle;
            return this;
        }
        public String getPricingCycle() {
            return this.pricingCycle;
        }

        public SearchClusterInstancesResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public SearchClusterInstancesResponseBodyData setRunningTime(Long runningTime) {
            this.runningTime = runningTime;
            return this;
        }
        public Long getRunningTime() {
            return this.runningTime;
        }

        public SearchClusterInstancesResponseBodyData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
