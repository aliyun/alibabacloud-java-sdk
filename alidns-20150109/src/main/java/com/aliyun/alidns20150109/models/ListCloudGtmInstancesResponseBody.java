// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListCloudGtmInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public ListCloudGtmInstancesResponseBodyInstances instances;

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

    public static ListCloudGtmInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCloudGtmInstancesResponseBody self = new ListCloudGtmInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCloudGtmInstancesResponseBody setInstances(ListCloudGtmInstancesResponseBodyInstances instances) {
        this.instances = instances;
        return this;
    }
    public ListCloudGtmInstancesResponseBodyInstances getInstances() {
        return this.instances;
    }

    public ListCloudGtmInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCloudGtmInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCloudGtmInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCloudGtmInstancesResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public ListCloudGtmInstancesResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class ListCloudGtmInstancesResponseBodyInstancesInstance extends TeaModel {
        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("ExpireTimestamp")
        public Long expireTimestamp;

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

        public static ListCloudGtmInstancesResponseBodyInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            ListCloudGtmInstancesResponseBodyInstancesInstance self = new ListCloudGtmInstancesResponseBodyInstancesInstance();
            return TeaModel.build(map, self);
        }

        public ListCloudGtmInstancesResponseBodyInstancesInstance setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ListCloudGtmInstancesResponseBodyInstancesInstance setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListCloudGtmInstancesResponseBodyInstancesInstance setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public ListCloudGtmInstancesResponseBodyInstancesInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListCloudGtmInstancesResponseBodyInstancesInstance setExpireTimestamp(Long expireTimestamp) {
            this.expireTimestamp = expireTimestamp;
            return this;
        }
        public Long getExpireTimestamp() {
            return this.expireTimestamp;
        }

        public ListCloudGtmInstancesResponseBodyInstancesInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCloudGtmInstancesResponseBodyInstancesInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListCloudGtmInstancesResponseBodyInstancesInstance setMonitorTaskQuota(Integer monitorTaskQuota) {
            this.monitorTaskQuota = monitorTaskQuota;
            return this;
        }
        public Integer getMonitorTaskQuota() {
            return this.monitorTaskQuota;
        }

        public ListCloudGtmInstancesResponseBodyInstancesInstance setMonthlyEmailUsed(Integer monthlyEmailUsed) {
            this.monthlyEmailUsed = monthlyEmailUsed;
            return this;
        }
        public Integer getMonthlyEmailUsed() {
            return this.monthlyEmailUsed;
        }

        public ListCloudGtmInstancesResponseBodyInstancesInstance setMonthlySmsQuota(Integer monthlySmsQuota) {
            this.monthlySmsQuota = monthlySmsQuota;
            return this;
        }
        public Integer getMonthlySmsQuota() {
            return this.monthlySmsQuota;
        }

        public ListCloudGtmInstancesResponseBodyInstancesInstance setMonthlySmsUsed(Integer monthlySmsUsed) {
            this.monthlySmsUsed = monthlySmsUsed;
            return this;
        }
        public Integer getMonthlySmsUsed() {
            return this.monthlySmsUsed;
        }

        public ListCloudGtmInstancesResponseBodyInstancesInstance setMonthlyWebhookUsed(Integer monthlyWebhookUsed) {
            this.monthlyWebhookUsed = monthlyWebhookUsed;
            return this;
        }
        public Integer getMonthlyWebhookUsed() {
            return this.monthlyWebhookUsed;
        }

        public ListCloudGtmInstancesResponseBodyInstancesInstance setScheduleDomainName(String scheduleDomainName) {
            this.scheduleDomainName = scheduleDomainName;
            return this;
        }
        public String getScheduleDomainName() {
            return this.scheduleDomainName;
        }

        public ListCloudGtmInstancesResponseBodyInstancesInstance setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListCloudGtmInstancesResponseBodyInstancesInstance setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public ListCloudGtmInstancesResponseBodyInstancesInstance setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

    }

    public static class ListCloudGtmInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("Instance")
        public java.util.List<ListCloudGtmInstancesResponseBodyInstancesInstance> instance;

        public static ListCloudGtmInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            ListCloudGtmInstancesResponseBodyInstances self = new ListCloudGtmInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public ListCloudGtmInstancesResponseBodyInstances setInstance(java.util.List<ListCloudGtmInstancesResponseBodyInstancesInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<ListCloudGtmInstancesResponseBodyInstancesInstance> getInstance() {
            return this.instance;
        }

    }

}
