// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SearchCloudGtmInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public SearchCloudGtmInstancesResponseBodyInstances instances;

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

    public static SearchCloudGtmInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchCloudGtmInstancesResponseBody self = new SearchCloudGtmInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchCloudGtmInstancesResponseBody setInstances(SearchCloudGtmInstancesResponseBodyInstances instances) {
        this.instances = instances;
        return this;
    }
    public SearchCloudGtmInstancesResponseBodyInstances getInstances() {
        return this.instances;
    }

    public SearchCloudGtmInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchCloudGtmInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchCloudGtmInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchCloudGtmInstancesResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public SearchCloudGtmInstancesResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class SearchCloudGtmInstancesResponseBodyInstancesInstance extends TeaModel {
        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("ExpireTimestamp")
        public String expireTimestamp;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("MonitorTaskQuota")
        public Integer monitorTaskQuota;

        @NameInMap("MonthlyEmailUsed")
        public Integer monthlyEmailUsed;

        @NameInMap("MonthlySmsQuota")
        public Integer monthlySmsQuota;

        @NameInMap("MonthlySmsUsed")
        public Integer monthlySmsUsed;

        @NameInMap("MonthlyWebhookUsed")
        public Integer monthlyWebhookUsed;

        @NameInMap("ScheduleDomainName")
        public String scheduleDomainName;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        @NameInMap("VersionCode")
        public String versionCode;

        public static SearchCloudGtmInstancesResponseBodyInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            SearchCloudGtmInstancesResponseBodyInstancesInstance self = new SearchCloudGtmInstancesResponseBodyInstancesInstance();
            return TeaModel.build(map, self);
        }

        public SearchCloudGtmInstancesResponseBodyInstancesInstance setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public SearchCloudGtmInstancesResponseBodyInstancesInstance setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SearchCloudGtmInstancesResponseBodyInstancesInstance setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public SearchCloudGtmInstancesResponseBodyInstancesInstance setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public SearchCloudGtmInstancesResponseBodyInstancesInstance setExpireTimestamp(String expireTimestamp) {
            this.expireTimestamp = expireTimestamp;
            return this;
        }
        public String getExpireTimestamp() {
            return this.expireTimestamp;
        }

        public SearchCloudGtmInstancesResponseBodyInstancesInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public SearchCloudGtmInstancesResponseBodyInstancesInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public SearchCloudGtmInstancesResponseBodyInstancesInstance setMonitorTaskQuota(Integer monitorTaskQuota) {
            this.monitorTaskQuota = monitorTaskQuota;
            return this;
        }
        public Integer getMonitorTaskQuota() {
            return this.monitorTaskQuota;
        }

        public SearchCloudGtmInstancesResponseBodyInstancesInstance setMonthlyEmailUsed(Integer monthlyEmailUsed) {
            this.monthlyEmailUsed = monthlyEmailUsed;
            return this;
        }
        public Integer getMonthlyEmailUsed() {
            return this.monthlyEmailUsed;
        }

        public SearchCloudGtmInstancesResponseBodyInstancesInstance setMonthlySmsQuota(Integer monthlySmsQuota) {
            this.monthlySmsQuota = monthlySmsQuota;
            return this;
        }
        public Integer getMonthlySmsQuota() {
            return this.monthlySmsQuota;
        }

        public SearchCloudGtmInstancesResponseBodyInstancesInstance setMonthlySmsUsed(Integer monthlySmsUsed) {
            this.monthlySmsUsed = monthlySmsUsed;
            return this;
        }
        public Integer getMonthlySmsUsed() {
            return this.monthlySmsUsed;
        }

        public SearchCloudGtmInstancesResponseBodyInstancesInstance setMonthlyWebhookUsed(Integer monthlyWebhookUsed) {
            this.monthlyWebhookUsed = monthlyWebhookUsed;
            return this;
        }
        public Integer getMonthlyWebhookUsed() {
            return this.monthlyWebhookUsed;
        }

        public SearchCloudGtmInstancesResponseBodyInstancesInstance setScheduleDomainName(String scheduleDomainName) {
            this.scheduleDomainName = scheduleDomainName;
            return this;
        }
        public String getScheduleDomainName() {
            return this.scheduleDomainName;
        }

        public SearchCloudGtmInstancesResponseBodyInstancesInstance setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public SearchCloudGtmInstancesResponseBodyInstancesInstance setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public SearchCloudGtmInstancesResponseBodyInstancesInstance setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

    }

    public static class SearchCloudGtmInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("Instance")
        public java.util.List<SearchCloudGtmInstancesResponseBodyInstancesInstance> instance;

        public static SearchCloudGtmInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            SearchCloudGtmInstancesResponseBodyInstances self = new SearchCloudGtmInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public SearchCloudGtmInstancesResponseBodyInstances setInstance(java.util.List<SearchCloudGtmInstancesResponseBodyInstancesInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<SearchCloudGtmInstancesResponseBodyInstancesInstance> getInstance() {
            return this.instance;
        }

    }

}
