// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SearchCloudGtmInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public SearchCloudGtmInstancesResponseBodyInstances instances;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>6856BCF6-11D6-4D7E-AC53-FD579933522B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>dns_gtm_public_cn</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <strong>example:</strong>
         * <p>2024-03-15T01:46Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1710467214858</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <strong>example:</strong>
         * <p>2024-09-05T16:00Z</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <strong>example:</strong>
         * <p>1725552000000</p>
         */
        @NameInMap("ExpireTimestamp")
        public String expireTimestamp;

        /**
         * <strong>example:</strong>
         * <p>gtm-cn-wwo3a3hbz**</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MonitorTaskQuota")
        public Integer monitorTaskQuota;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("MonthlyEmailUsed")
        public Integer monthlyEmailUsed;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("MonthlySmsQuota")
        public Integer monthlySmsQuota;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("MonthlySmsUsed")
        public Integer monthlySmsUsed;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MonthlyWebhookUsed")
        public Integer monthlyWebhookUsed;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("ScheduleDomainName")
        public String scheduleDomainName;

        /**
         * <strong>example:</strong>
         * <p>2024-03-15T01:46Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>1710467214858</p>
         */
        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        /**
         * <strong>example:</strong>
         * <p>ultimate</p>
         */
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
