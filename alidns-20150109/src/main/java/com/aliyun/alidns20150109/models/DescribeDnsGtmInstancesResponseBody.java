// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmInstancesResponseBody extends TeaModel {
    /**
     * <p>The Global Traffic Manager (GTM) instances.</p>
     */
    @NameInMap("GtmInstances")
    public java.util.List<DescribeDnsGtmInstancesResponseBodyGtmInstances> gtmInstances;

    /**
     * <p>The page number. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>84314904-D047-4176-A0EC-256D7F68C7F5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <p>The total number of pages returned.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
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
        /**
         * <p>Indicates whether DingTalk alert notifications are configured. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false | null</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DingtalkNotice")
        public String dingtalkNotice;

        /**
         * <p>Indicates whether email notifications are configured. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false | null</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EmailNotice")
        public String emailNotice;

        /**
         * <p>The type of the alert event. Valid values:</p>
         * <ul>
         * <li>ADDR_ALERT: The address is unavailable.</li>
         * <li>ADDR_RESUME: The address becomes available.</li>
         * <li>ADDR_POOL_GROUP_UNAVAILABLE: The address pool set is unavailable.</li>
         * <li>ADDR_POOL_GROUP_AVAILABLE: The address pool set becomes available.</li>
         * <li>ACCESS_STRATEGY_POOL_GROUP_SWITCH: Switchover is triggered between the primary and secondary address pools.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ADDR_ALERT</p>
         */
        @NameInMap("NoticeType")
        public String noticeType;

        /**
         * <p>Indicates whether SMS notifications are configured. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false | null</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>The alert notification method.</p>
         */
        @NameInMap("AlertConfig")
        public java.util.List<DescribeDnsGtmInstancesResponseBodyGtmInstancesConfigAlertConfig> alertConfig;

        /**
         * <p>The alert contact groups. The value is in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>testgroup</p>
         */
        @NameInMap("AlertGroup")
        public String alertGroup;

        /**
         * <p>The type of the CNAME. Valid value:</p>
         * <ul>
         * <li>PUBLIC</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("CnameType")
        public String cnameType;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>instanceTest</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>Specifies whether to use a custom CNAME or a system-assigned CNAME to access GTM over the Internet. Valid values:</p>
         * <ul>
         * <li>CUSTOM: a custom CNAME</li>
         * <li>SYSTEM_ASSIGN: a system-assigned CNAME. You cannot set PublicCnameMode to this value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("PublicCnameMode")
        public String publicCnameMode;

        /**
         * <p>The hostname of the domain name that is used to access GTM over the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p>test.rr</p>
         */
        @NameInMap("PublicRr")
        public String publicRr;

        /**
         * <p>The domain name that is used to access GTM over the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("PublicUserDomainName")
        public String publicUserDomainName;

        /**
         * <p>The canonical name (CNAME) that is used to access GTM over the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p>test.rr.gtm-003.com</p>
         */
        @NameInMap("PublicZoneName")
        public String publicZoneName;

        /**
         * <p>The type of the access policy. Valid values:</p>
         * <ul>
         * <li>LATENCY: latency-based access policy</li>
         * <li>GEO: geographical location-based access policy</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>geo</p>
         */
        @NameInMap("StrategyMode")
        public String strategyMode;

        /**
         * <p>The global time to live (TTL).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
        /**
         * <p>The total number of sent DingTalk notifications.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DingtalkUsedCount")
        public Integer dingtalkUsedCount;

        /**
         * <p>The total number of sent email notifications.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("EmailUsedCount")
        public Integer emailUsedCount;

        /**
         * <p>The total number of sent SMS notifications.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SmsUsedCount")
        public Integer smsUsedCount;

        /**
         * <p>The number of created detection tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
         * <p>The time when the instance was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-14T06:58Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the instance was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1602658709000</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The time when the instance expires. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-14T06:58Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The time when the instance expires. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1602658709000</p>
         */
        @NameInMap("ExpireTimestamp")
        public Long expireTimestamp;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>instance1</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The billing method of the GTM instance. Valid value:</p>
         * <ul>
         * <li>Subscription.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Subscription</p>
         */
        @NameInMap("PaymentType")
        public String paymentType;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>resourceGroupid123</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The total number of Short Message Service (SMS) notifications.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SmsQuota")
        public Integer smsQuota;

        /**
         * <p>The total number of detection tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>testVersion1</p>
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
