// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeIspFlushCacheInstancesResponseBody extends TeaModel {
    @NameInMap("IspFlushCacheInstances")
    public java.util.List<DescribeIspFlushCacheInstancesResponseBodyIspFlushCacheInstances> ispFlushCacheInstances;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalItems")
    public Integer totalItems;

    @NameInMap("TotalPages")
    public Integer totalPages;

    public static DescribeIspFlushCacheInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIspFlushCacheInstancesResponseBody self = new DescribeIspFlushCacheInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIspFlushCacheInstancesResponseBody setIspFlushCacheInstances(java.util.List<DescribeIspFlushCacheInstancesResponseBodyIspFlushCacheInstances> ispFlushCacheInstances) {
        this.ispFlushCacheInstances = ispFlushCacheInstances;
        return this;
    }
    public java.util.List<DescribeIspFlushCacheInstancesResponseBodyIspFlushCacheInstances> getIspFlushCacheInstances() {
        return this.ispFlushCacheInstances;
    }

    public DescribeIspFlushCacheInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeIspFlushCacheInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeIspFlushCacheInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIspFlushCacheInstancesResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeIspFlushCacheInstancesResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class DescribeIspFlushCacheInstancesResponseBodyIspFlushCacheInstancesQuotaInfo extends TeaModel {
        @NameInMap("InstanceQuota")
        public Integer instanceQuota;

        @NameInMap("InstanceQuotaUsed")
        public Integer instanceQuotaUsed;

        public static DescribeIspFlushCacheInstancesResponseBodyIspFlushCacheInstancesQuotaInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeIspFlushCacheInstancesResponseBodyIspFlushCacheInstancesQuotaInfo self = new DescribeIspFlushCacheInstancesResponseBodyIspFlushCacheInstancesQuotaInfo();
            return TeaModel.build(map, self);
        }

        public DescribeIspFlushCacheInstancesResponseBodyIspFlushCacheInstancesQuotaInfo setInstanceQuota(Integer instanceQuota) {
            this.instanceQuota = instanceQuota;
            return this;
        }
        public Integer getInstanceQuota() {
            return this.instanceQuota;
        }

        public DescribeIspFlushCacheInstancesResponseBodyIspFlushCacheInstancesQuotaInfo setInstanceQuotaUsed(Integer instanceQuotaUsed) {
            this.instanceQuotaUsed = instanceQuotaUsed;
            return this;
        }
        public Integer getInstanceQuotaUsed() {
            return this.instanceQuotaUsed;
        }

    }

    public static class DescribeIspFlushCacheInstancesResponseBodyIspFlushCacheInstances extends TeaModel {
        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("ExpireTimestamp")
        public Long expireTimestamp;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("Isp")
        public String isp;

        @NameInMap("QuotaInfo")
        public DescribeIspFlushCacheInstancesResponseBodyIspFlushCacheInstancesQuotaInfo quotaInfo;

        @NameInMap("Status")
        public String status;

        @NameInMap("VersionCode")
        public String versionCode;

        public static DescribeIspFlushCacheInstancesResponseBodyIspFlushCacheInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeIspFlushCacheInstancesResponseBodyIspFlushCacheInstances self = new DescribeIspFlushCacheInstancesResponseBodyIspFlushCacheInstances();
            return TeaModel.build(map, self);
        }

        public DescribeIspFlushCacheInstancesResponseBodyIspFlushCacheInstances setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeIspFlushCacheInstancesResponseBodyIspFlushCacheInstances setExpireTimestamp(Long expireTimestamp) {
            this.expireTimestamp = expireTimestamp;
            return this;
        }
        public Long getExpireTimestamp() {
            return this.expireTimestamp;
        }

        public DescribeIspFlushCacheInstancesResponseBodyIspFlushCacheInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeIspFlushCacheInstancesResponseBodyIspFlushCacheInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeIspFlushCacheInstancesResponseBodyIspFlushCacheInstances setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public DescribeIspFlushCacheInstancesResponseBodyIspFlushCacheInstances setQuotaInfo(DescribeIspFlushCacheInstancesResponseBodyIspFlushCacheInstancesQuotaInfo quotaInfo) {
            this.quotaInfo = quotaInfo;
            return this;
        }
        public DescribeIspFlushCacheInstancesResponseBodyIspFlushCacheInstancesQuotaInfo getQuotaInfo() {
            return this.quotaInfo;
        }

        public DescribeIspFlushCacheInstancesResponseBodyIspFlushCacheInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeIspFlushCacheInstancesResponseBodyIspFlushCacheInstances setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

    }

}
