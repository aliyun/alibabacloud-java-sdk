// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmInstancesResponseBody extends TeaModel {
    /**
     * <p>The returned instances.</p>
     */
    @NameInMap("GtmInstances")
    public java.util.List<DescribeDnsGtmInstancesResponseBodyGtmInstances> gtmInstances;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned on all pages.</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <p>The total number of returned pages.</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    public static DescribeDnsGtmInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmInstancesResponseBody self = new DescribeDnsGtmInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmInstancesResponseBody setGtmInstances(java.util.List<DescribeDnsGtmInstancesResponseBodyGtmInstances> gtmInstances) {
        this.gtmInstances = gtmInstances;
        return this;
    }
    public java.util.List<DescribeDnsGtmInstancesResponseBodyGtmInstances> getGtmInstances() {
        return this.gtmInstances;
    }

    public DescribeDnsGtmInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDnsGtmInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDnsGtmInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsGtmInstancesResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeDnsGtmInstancesResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class DescribeDnsGtmInstancesResponseBodyGtmInstancesConfigAlertConfig extends TeaModel {
        @NameInMap("DingtalkNotice")
        public String dingtalkNotice;

        /**
         * <p>Indicates whether email notifications were configured. Valid values:</p>
         * <br>
         * <p>*   true: configured</p>
         * <p>*   false | null: not configured</p>
         */
        @NameInMap("EmailNotice")
        public String emailNotice;

        /**
         * <p>The type of the alert event. Valid values:</p>
         * <br>
         * <p>*   ADDR_ALERT: The address is unavailable.</p>
         * <p>*   ADDR_RESUME: The address is restored and becomes available.</p>
         * <p>*   ADDR_POOL_GROUP_UNAVAILABLE: The address pool group is unavailable.</p>
         * <p>*   ADDR_POOL_GROUP_AVAILABLE: The address pool group is restored and becomes available.</p>
         * <p>*   ACCESS_STRATEGY_POOL_GROUP_SWITCH: Switchover is triggered between the primary and secondary address pools.</p>
         */
        @NameInMap("NoticeType")
        public String noticeType;

        /**
         * <p>Indicates whether SMS notifications were configured. Valid values:</p>
         * <br>
         * <p>*   true: configured</p>
         * <p>*   false | null: not configured</p>
         */
        @NameInMap("SmsNotice")
        public String smsNotice;

        public static DescribeDnsGtmInstancesResponseBodyGtmInstancesConfigAlertConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmInstancesResponseBodyGtmInstancesConfigAlertConfig self = new DescribeDnsGtmInstancesResponseBodyGtmInstancesConfigAlertConfig();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstancesConfigAlertConfig setDingtalkNotice(String dingtalkNotice) {
            this.dingtalkNotice = dingtalkNotice;
            return this;
        }
        public String getDingtalkNotice() {
            return this.dingtalkNotice;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstancesConfigAlertConfig setEmailNotice(String emailNotice) {
            this.emailNotice = emailNotice;
            return this;
        }
        public String getEmailNotice() {
            return this.emailNotice;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstancesConfigAlertConfig setNoticeType(String noticeType) {
            this.noticeType = noticeType;
            return this;
        }
        public String getNoticeType() {
            return this.noticeType;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstancesConfigAlertConfig setSmsNotice(String smsNotice) {
            this.smsNotice = smsNotice;
            return this;
        }
        public String getSmsNotice() {
            return this.smsNotice;
        }

    }

    public static class DescribeDnsGtmInstancesResponseBodyGtmInstancesConfig extends TeaModel {
        /**
         * <p>The alert notification methods.</p>
         */
        @NameInMap("AlertConfig")
        public java.util.List<DescribeDnsGtmInstancesResponseBodyGtmInstancesConfigAlertConfig> alertConfig;

        /**
         * <p>The alert group.</p>
         */
        @NameInMap("AlertGroup")
        public String alertGroup;

        /**
         * <p>The access type of the CNAME domain name.</p>
         * <br>
         * <p>*   The value was set to PUBLIC, which indicates Internet access.</p>
         */
        @NameInMap("CnameType")
        public String cnameType;

        /**
         * <p>The name of the instance.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>Indicates whether a custom CNAME domain name or a CNAME domain name assigned by the system is used to access GTM over the Internet. Valid values:</p>
         * <br>
         * <p>*   CUSTOM: a custom CNAME domain name</p>
         * <p>*   SYSTEM_ASSIGN: a CNAME domain name assigned by the system</p>
         */
        @NameInMap("PublicCnameMode")
        public String publicCnameMode;

        @NameInMap("PublicRr")
        public String publicRr;

        /**
         * <p>The website domain name that the user uses on the Internet.</p>
         */
        @NameInMap("PublicUserDomainName")
        public String publicUserDomainName;

        /**
         * <p>The domain name that is used to access GTM over the Internet.</p>
         */
        @NameInMap("PublicZoneName")
        public String publicZoneName;

        /**
         * <p>The type of the access policy. Valid values:</p>
         * <br>
         * <p>*   LATENCY: latency-based</p>
         * <p>*   GEO: geographical location-based</p>
         */
        @NameInMap("StrategyMode")
        public String strategyMode;

        /**
         * <p>The global time to live (TTL).</p>
         */
        @NameInMap("Ttl")
        public Integer ttl;

        public static DescribeDnsGtmInstancesResponseBodyGtmInstancesConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmInstancesResponseBodyGtmInstancesConfig self = new DescribeDnsGtmInstancesResponseBodyGtmInstancesConfig();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstancesConfig setAlertConfig(java.util.List<DescribeDnsGtmInstancesResponseBodyGtmInstancesConfigAlertConfig> alertConfig) {
            this.alertConfig = alertConfig;
            return this;
        }
        public java.util.List<DescribeDnsGtmInstancesResponseBodyGtmInstancesConfigAlertConfig> getAlertConfig() {
            return this.alertConfig;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstancesConfig setAlertGroup(String alertGroup) {
            this.alertGroup = alertGroup;
            return this;
        }
        public String getAlertGroup() {
            return this.alertGroup;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstancesConfig setCnameType(String cnameType) {
            this.cnameType = cnameType;
            return this;
        }
        public String getCnameType() {
            return this.cnameType;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstancesConfig setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstancesConfig setPublicCnameMode(String publicCnameMode) {
            this.publicCnameMode = publicCnameMode;
            return this;
        }
        public String getPublicCnameMode() {
            return this.publicCnameMode;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstancesConfig setPublicRr(String publicRr) {
            this.publicRr = publicRr;
            return this;
        }
        public String getPublicRr() {
            return this.publicRr;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstancesConfig setPublicUserDomainName(String publicUserDomainName) {
            this.publicUserDomainName = publicUserDomainName;
            return this;
        }
        public String getPublicUserDomainName() {
            return this.publicUserDomainName;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstancesConfig setPublicZoneName(String publicZoneName) {
            this.publicZoneName = publicZoneName;
            return this;
        }
        public String getPublicZoneName() {
            return this.publicZoneName;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstancesConfig setStrategyMode(String strategyMode) {
            this.strategyMode = strategyMode;
            return this;
        }
        public String getStrategyMode() {
            return this.strategyMode;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstancesConfig setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

    }

    public static class DescribeDnsGtmInstancesResponseBodyGtmInstancesUsedQuota extends TeaModel {
        @NameInMap("DingtalkUsedCount")
        public Integer dingtalkUsedCount;

        /**
         * <p>The total number of email notifications that were sent.</p>
         */
        @NameInMap("EmailUsedCount")
        public Integer emailUsedCount;

        /**
         * <p>The total number of SMS notifications that were sent.</p>
         */
        @NameInMap("SmsUsedCount")
        public Integer smsUsedCount;

        /**
         * <p>The number of detection tasks that were created.</p>
         */
        @NameInMap("TaskUsedCount")
        public Integer taskUsedCount;

        public static DescribeDnsGtmInstancesResponseBodyGtmInstancesUsedQuota build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmInstancesResponseBodyGtmInstancesUsedQuota self = new DescribeDnsGtmInstancesResponseBodyGtmInstancesUsedQuota();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstancesUsedQuota setDingtalkUsedCount(Integer dingtalkUsedCount) {
            this.dingtalkUsedCount = dingtalkUsedCount;
            return this;
        }
        public Integer getDingtalkUsedCount() {
            return this.dingtalkUsedCount;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstancesUsedQuota setEmailUsedCount(Integer emailUsedCount) {
            this.emailUsedCount = emailUsedCount;
            return this;
        }
        public Integer getEmailUsedCount() {
            return this.emailUsedCount;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstancesUsedQuota setSmsUsedCount(Integer smsUsedCount) {
            this.smsUsedCount = smsUsedCount;
            return this;
        }
        public Integer getSmsUsedCount() {
            return this.smsUsedCount;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstancesUsedQuota setTaskUsedCount(Integer taskUsedCount) {
            this.taskUsedCount = taskUsedCount;
            return this;
        }
        public Integer getTaskUsedCount() {
            return this.taskUsedCount;
        }

    }

    public static class DescribeDnsGtmInstancesResponseBodyGtmInstances extends TeaModel {
        /**
         * <p>The configurations of the instance.</p>
         */
        @NameInMap("Config")
        public DescribeDnsGtmInstancesResponseBodyGtmInstancesConfig config;

        /**
         * <p>The time when the instance was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The timestamp that indicates when the instance was created.</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The time when the instance expires.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The timestamp that indicates when the instance expires.</p>
         */
        @NameInMap("ExpireTimestamp")
        public Long expireTimestamp;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The billing method of the instance.</p>
         * <br>
         * <p>*   The value is set to Subscription.</p>
         */
        @NameInMap("PaymentType")
        public String paymentType;

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The total number of SMS notifications.</p>
         */
        @NameInMap("SmsQuota")
        public Integer smsQuota;

        /**
         * <p>The total number of detection tasks.</p>
         */
        @NameInMap("TaskQuota")
        public Integer taskQuota;

        /**
         * <p>The used quota.</p>
         */
        @NameInMap("UsedQuota")
        public DescribeDnsGtmInstancesResponseBodyGtmInstancesUsedQuota usedQuota;

        /**
         * <p>The version of the instance.</p>
         */
        @NameInMap("VersionCode")
        public String versionCode;

        public static DescribeDnsGtmInstancesResponseBodyGtmInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmInstancesResponseBodyGtmInstances self = new DescribeDnsGtmInstancesResponseBodyGtmInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstances setConfig(DescribeDnsGtmInstancesResponseBodyGtmInstancesConfig config) {
            this.config = config;
            return this;
        }
        public DescribeDnsGtmInstancesResponseBodyGtmInstancesConfig getConfig() {
            return this.config;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstances setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstances setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstances setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstances setExpireTimestamp(Long expireTimestamp) {
            this.expireTimestamp = expireTimestamp;
            return this;
        }
        public Long getExpireTimestamp() {
            return this.expireTimestamp;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstances setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstances setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstances setSmsQuota(Integer smsQuota) {
            this.smsQuota = smsQuota;
            return this;
        }
        public Integer getSmsQuota() {
            return this.smsQuota;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstances setTaskQuota(Integer taskQuota) {
            this.taskQuota = taskQuota;
            return this;
        }
        public Integer getTaskQuota() {
            return this.taskQuota;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstances setUsedQuota(DescribeDnsGtmInstancesResponseBodyGtmInstancesUsedQuota usedQuota) {
            this.usedQuota = usedQuota;
            return this;
        }
        public DescribeDnsGtmInstancesResponseBodyGtmInstancesUsedQuota getUsedQuota() {
            return this.usedQuota;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstances setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

    }

}
