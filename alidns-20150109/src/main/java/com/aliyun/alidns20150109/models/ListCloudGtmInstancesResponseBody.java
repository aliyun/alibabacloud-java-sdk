// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListCloudGtmInstancesResponseBody extends TeaModel {
    /**
     * <p>The instances.</p>
     */
    @NameInMap("Instances")
    public ListCloudGtmInstancesResponseBodyInstances instances;

    /**
     * <p>Current page number, starting with <strong>1</strong>, default is <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of rows per page when paginating queries, with a maximum value of 100 and a default of 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Unique request identification code.</p>
     * 
     * <strong>example:</strong>
     * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total number of instance entries.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <p>Total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>postpay / prepay</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The commodity code. Valid values:</p>
         * <ul>
         * <li>dns_gtm_public_cn: commodity code on the China site (aliyun.com)</li>
         * <li>dns_gtm_public_intl: commodity code on the international site (alibabacloud.com)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dns_gtm_public_cn</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>Instance creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-15T01:46Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Instance creation time (timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1231298343343</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>Instance expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-15T01:46Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>Instance expiration time (timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1231298343343</p>
         */
        @NameInMap("ExpireTimestamp")
        public Long expireTimestamp;

        /**
         * <p>The ID of the GTM instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gtm-cn-jmp3qnw**03</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>Monitor probe task quota.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MonitorTaskQuota")
        public Integer monitorTaskQuota;

        /**
         * <p>Monthly email sending volume.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("MonthlyEmailUsed")
        public Integer monthlyEmailUsed;

        /**
         * <p>SMS quota, only supported on the China site as international sites do not support SMS.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MonthlySmsQuota")
        public Integer monthlySmsQuota;

        /**
         * <p>Monthly SMS sending volume, only supported by the China site as international sites do not support SMS.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MonthlySmsUsed")
        public Integer monthlySmsUsed;

        /**
         * <p>Monthly webhook send volume.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("MonthlyWebhookUsed")
        public Integer monthlyWebhookUsed;

        /**
         * <p>The access domain name, which consists of a hostname and a zone or a subzone.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("ScheduleDomainName")
        public String scheduleDomainName;

        /**
         * <p>The last time the instance was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-15T01:46Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The last modification time of the instance (timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1231298343343</p>
         */
        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        /**
         * <p>GTM instance version:</p>
         * <ul>
         * <li>standard: Standard Edition</li>
         * <li>ultimate: Ultimate Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ultimate</p>
         */
        @NameInMap("VersionCode")
        public String versionCode;

        public static ListCloudGtmInstancesResponseBodyInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            ListCloudGtmInstancesResponseBodyInstancesInstance self = new ListCloudGtmInstancesResponseBodyInstancesInstance();
            return TeaModel.build(map, self);
        }

        public ListCloudGtmInstancesResponseBodyInstancesInstance setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
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
