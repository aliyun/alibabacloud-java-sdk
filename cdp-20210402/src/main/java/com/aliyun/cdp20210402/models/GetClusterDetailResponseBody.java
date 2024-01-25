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

    public static class GetClusterDetailResponseBodyData extends TeaModel {
        @NameInMap("AutoRenew")
        public Boolean autoRenew;

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

        @NameInMap("ClusterType")
        public String clusterType;

        @NameInMap("ControlCenterUrl")
        public String controlCenterUrl;

        @NameInMap("DeployMode")
        public String deployMode;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("ExpireTime")
        public Long expireTime;

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

        @NameInMap("Version")
        public String version;

        @NameInMap("ZoneId")
        public String zoneId;

        public static GetClusterDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetClusterDetailResponseBodyData self = new GetClusterDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetClusterDetailResponseBodyData setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
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

        public GetClusterDetailResponseBodyData setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
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

        public GetClusterDetailResponseBodyData setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
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

        public GetClusterDetailResponseBodyData setNoticeConfirmed(Boolean noticeConfirmed) {
            this.noticeConfirmed = noticeConfirmed;
            return this;
        }
        public Boolean getNoticeConfirmed() {
            return this.noticeConfirmed;
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

        public GetClusterDetailResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
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
