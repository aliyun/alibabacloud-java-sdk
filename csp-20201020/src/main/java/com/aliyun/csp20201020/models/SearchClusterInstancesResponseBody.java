// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class SearchClusterInstancesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<SearchClusterInstancesResponseBodyData> data;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

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

    public SearchClusterInstancesResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public SearchClusterInstancesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
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

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("OpenColddataArchiving")
        public Boolean openColddataArchiving;

        @NameInMap("OssBucketPath")
        public String ossBucketPath;

        @NameInMap("OssEndpoint")
        public String ossEndpoint;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("PricingCycle")
        public String pricingCycle;

        @NameInMap("SpecVersion")
        public String specVersion;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VswIds")
        public String vswIds;

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

        public SearchClusterInstancesResponseBodyDataClusterInstanceInfo setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public SearchClusterInstancesResponseBodyDataClusterInstanceInfo setOpenColddataArchiving(Boolean openColddataArchiving) {
            this.openColddataArchiving = openColddataArchiving;
            return this;
        }
        public Boolean getOpenColddataArchiving() {
            return this.openColddataArchiving;
        }

        public SearchClusterInstancesResponseBodyDataClusterInstanceInfo setOssBucketPath(String ossBucketPath) {
            this.ossBucketPath = ossBucketPath;
            return this;
        }
        public String getOssBucketPath() {
            return this.ossBucketPath;
        }

        public SearchClusterInstancesResponseBodyDataClusterInstanceInfo setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public SearchClusterInstancesResponseBodyDataClusterInstanceInfo setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public SearchClusterInstancesResponseBodyDataClusterInstanceInfo setPricingCycle(String pricingCycle) {
            this.pricingCycle = pricingCycle;
            return this;
        }
        public String getPricingCycle() {
            return this.pricingCycle;
        }

        public SearchClusterInstancesResponseBodyDataClusterInstanceInfo setSpecVersion(String specVersion) {
            this.specVersion = specVersion;
            return this;
        }
        public String getSpecVersion() {
            return this.specVersion;
        }

        public SearchClusterInstancesResponseBodyDataClusterInstanceInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public SearchClusterInstancesResponseBodyDataClusterInstanceInfo setVswIds(String vswIds) {
            this.vswIds = vswIds;
            return this;
        }
        public String getVswIds() {
            return this.vswIds;
        }

    }

    public static class SearchClusterInstancesResponseBodyData extends TeaModel {
        @NameInMap("CkuConf")
        public String ckuConf;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterInstanceInfo")
        public SearchClusterInstancesResponseBodyDataClusterInstanceInfo clusterInstanceInfo;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("ClusterSize")
        public Integer clusterSize;

        @NameInMap("ClusterStatus")
        public String clusterStatus;

        @NameInMap("ClusterStatusValue")
        public Integer clusterStatusValue;

        @NameInMap("ControlCenterUrl")
        public String controlCenterUrl;

        @NameInMap("CuNum")
        public Integer cuNum;

        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("OpenKsql")
        public Boolean openKsql;

        @NameInMap("OrderBizId")
        public String orderBizId;

        @NameInMap("PackageType")
        public String packageType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("StorageSize")
        public Integer storageSize;

        @NameInMap("UnpaidOrderIds")
        public java.util.List<Long> unpaidOrderIds;

        @NameInMap("ValidBrokerNumber")
        public Boolean validBrokerNumber;

        @NameInMap("Version")
        public String version;

        @NameInMap("ZoneId")
        public String zoneId;

        public static SearchClusterInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchClusterInstancesResponseBodyData self = new SearchClusterInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchClusterInstancesResponseBodyData setCkuConf(String ckuConf) {
            this.ckuConf = ckuConf;
            return this;
        }
        public String getCkuConf() {
            return this.ckuConf;
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

        public SearchClusterInstancesResponseBodyData setClusterSize(Integer clusterSize) {
            this.clusterSize = clusterSize;
            return this;
        }
        public Integer getClusterSize() {
            return this.clusterSize;
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

        public SearchClusterInstancesResponseBodyData setControlCenterUrl(String controlCenterUrl) {
            this.controlCenterUrl = controlCenterUrl;
            return this;
        }
        public String getControlCenterUrl() {
            return this.controlCenterUrl;
        }

        public SearchClusterInstancesResponseBodyData setCuNum(Integer cuNum) {
            this.cuNum = cuNum;
            return this;
        }
        public Integer getCuNum() {
            return this.cuNum;
        }

        public SearchClusterInstancesResponseBodyData setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public SearchClusterInstancesResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public SearchClusterInstancesResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public SearchClusterInstancesResponseBodyData setOpenKsql(Boolean openKsql) {
            this.openKsql = openKsql;
            return this;
        }
        public Boolean getOpenKsql() {
            return this.openKsql;
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

        public SearchClusterInstancesResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public SearchClusterInstancesResponseBodyData setStorageSize(Integer storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Integer getStorageSize() {
            return this.storageSize;
        }

        public SearchClusterInstancesResponseBodyData setUnpaidOrderIds(java.util.List<Long> unpaidOrderIds) {
            this.unpaidOrderIds = unpaidOrderIds;
            return this;
        }
        public java.util.List<Long> getUnpaidOrderIds() {
            return this.unpaidOrderIds;
        }

        public SearchClusterInstancesResponseBodyData setValidBrokerNumber(Boolean validBrokerNumber) {
            this.validBrokerNumber = validBrokerNumber;
            return this;
        }
        public Boolean getValidBrokerNumber() {
            return this.validBrokerNumber;
        }

        public SearchClusterInstancesResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
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
