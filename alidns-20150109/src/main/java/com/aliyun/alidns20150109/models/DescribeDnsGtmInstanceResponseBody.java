// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmInstanceResponseBody extends TeaModel {
    /**
     * <p>The configurations of the instance.</p>
     */
    @NameInMap("Config")
    public DescribeDnsGtmInstanceResponseBodyConfig config;

    /**
     * <p>The time when the instance was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-10-14T06:58Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The UNIX timestamp that indicates when the instance was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1602656937000</p>
     */
    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    /**
     * <p>The time when the instance expires.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-10-14T06:58Z</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>The UNIX timestamp that indicates when the instance expires.</p>
     * 
     * <strong>example:</strong>
     * <p>1602656937000</p>
     */
    @NameInMap("ExpireTimestamp")
    public Long expireTimestamp;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>instanceid1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The billing method. Valid value:</p>
     * <ul>
     * <li>Subscription: You can pay in advance for the use of resources.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Subscription</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>84314904-D047-4176-A0EC-256D7F68C7F5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>resourcegroupid1</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The total number of SMS notifications.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("SmsQuota")
    public Integer smsQuota;

    /**
     * <p>The total number of detection tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TaskQuota")
    public Integer taskQuota;

    /**
     * <p>The used quota.</p>
     */
    @NameInMap("UsedQuota")
    public DescribeDnsGtmInstanceResponseBodyUsedQuota usedQuota;

    /**
     * <p>The version of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>versioncode1</p>
     */
    @NameInMap("VersionCode")
    public String versionCode;

    public static DescribeDnsGtmInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmInstanceResponseBody self = new DescribeDnsGtmInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmInstanceResponseBody setConfig(DescribeDnsGtmInstanceResponseBodyConfig config) {
        this.config = config;
        return this;
    }
    public DescribeDnsGtmInstanceResponseBodyConfig getConfig() {
        return this.config;
    }

    public DescribeDnsGtmInstanceResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeDnsGtmInstanceResponseBody setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DescribeDnsGtmInstanceResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeDnsGtmInstanceResponseBody setExpireTimestamp(Long expireTimestamp) {
        this.expireTimestamp = expireTimestamp;
        return this;
    }
    public Long getExpireTimestamp() {
        return this.expireTimestamp;
    }

    public DescribeDnsGtmInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDnsGtmInstanceResponseBody setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public DescribeDnsGtmInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsGtmInstanceResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDnsGtmInstanceResponseBody setSmsQuota(Integer smsQuota) {
        this.smsQuota = smsQuota;
        return this;
    }
    public Integer getSmsQuota() {
        return this.smsQuota;
    }

    public DescribeDnsGtmInstanceResponseBody setTaskQuota(Integer taskQuota) {
        this.taskQuota = taskQuota;
        return this;
    }
    public Integer getTaskQuota() {
        return this.taskQuota;
    }

    public DescribeDnsGtmInstanceResponseBody setUsedQuota(DescribeDnsGtmInstanceResponseBodyUsedQuota usedQuota) {
        this.usedQuota = usedQuota;
        return this;
    }
    public DescribeDnsGtmInstanceResponseBodyUsedQuota getUsedQuota() {
        return this.usedQuota;
    }

    public DescribeDnsGtmInstanceResponseBody setVersionCode(String versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public String getVersionCode() {
        return this.versionCode;
    }

    public static class DescribeDnsGtmInstanceResponseBodyConfigAlertConfigAlertConfig extends TeaModel {
        @NameInMap("DingtalkNotice")
        public Boolean dingtalkNotice;

        /**
         * <p>Indicates whether email notification is configured. Valid values:</p>
         * <ul>
         * <li>true: Email notification is configured.</li>
         * <li>false: Email notification is not configured. null: Email notification is not configured.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EmailNotice")
        public Boolean emailNotice;

        /**
         * <p>The type of the alert event. Valid values:</p>
         * <ul>
         * <li>ADDR_ALERT: The address is unavailable.</li>
         * <li>ADDR_RESUME: The address is restored and becomes available.</li>
         * <li>ADDR_POOL_GROUP_UNAVAILABLE: The address pool group is unavailable.</li>
         * <li>ADDR_POOL_GROUP_AVAILABLE: The address pool group is restored and becomes available.</li>
         * <li>ACCESS_STRATEGY_POOL_GROUP_SWITCH: Switchover is triggered between the primary and secondary address pools.</li>
         * <li>MONITOR_NODE_IP_CHANGE: The IP address of the monitoring node has changed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ADDR_ALERT</p>
         */
        @NameInMap("NoticeType")
        public String noticeType;

        /**
         * <p>Indicates whether SMS notification is configured. Valid values:</p>
         * <ul>
         * <li>true: SMS notification is configured.</li>
         * <li>false: SMS notification is not configured. null: SMS notification is not configured.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SmsNotice")
        public Boolean smsNotice;

        public static DescribeDnsGtmInstanceResponseBodyConfigAlertConfigAlertConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmInstanceResponseBodyConfigAlertConfigAlertConfig self = new DescribeDnsGtmInstanceResponseBodyConfigAlertConfigAlertConfig();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmInstanceResponseBodyConfigAlertConfigAlertConfig setDingtalkNotice(Boolean dingtalkNotice) {
            this.dingtalkNotice = dingtalkNotice;
            return this;
        }
        public Boolean getDingtalkNotice() {
            return this.dingtalkNotice;
        }

        public DescribeDnsGtmInstanceResponseBodyConfigAlertConfigAlertConfig setEmailNotice(Boolean emailNotice) {
            this.emailNotice = emailNotice;
            return this;
        }
        public Boolean getEmailNotice() {
            return this.emailNotice;
        }

        public DescribeDnsGtmInstanceResponseBodyConfigAlertConfigAlertConfig setNoticeType(String noticeType) {
            this.noticeType = noticeType;
            return this;
        }
        public String getNoticeType() {
            return this.noticeType;
        }

        public DescribeDnsGtmInstanceResponseBodyConfigAlertConfigAlertConfig setSmsNotice(Boolean smsNotice) {
            this.smsNotice = smsNotice;
            return this;
        }
        public Boolean getSmsNotice() {
            return this.smsNotice;
        }

    }

    public static class DescribeDnsGtmInstanceResponseBodyConfigAlertConfig extends TeaModel {
        @NameInMap("AlertConfig")
        public java.util.List<DescribeDnsGtmInstanceResponseBodyConfigAlertConfigAlertConfig> alertConfig;

        public static DescribeDnsGtmInstanceResponseBodyConfigAlertConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmInstanceResponseBodyConfigAlertConfig self = new DescribeDnsGtmInstanceResponseBodyConfigAlertConfig();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmInstanceResponseBodyConfigAlertConfig setAlertConfig(java.util.List<DescribeDnsGtmInstanceResponseBodyConfigAlertConfigAlertConfig> alertConfig) {
            this.alertConfig = alertConfig;
            return this;
        }
        public java.util.List<DescribeDnsGtmInstanceResponseBodyConfigAlertConfigAlertConfig> getAlertConfig() {
            return this.alertConfig;
        }

    }

    public static class DescribeDnsGtmInstanceResponseBodyConfig extends TeaModel {
        /**
         * <p>The alert notification method.</p>
         */
        @NameInMap("AlertConfig")
        public DescribeDnsGtmInstanceResponseBodyConfigAlertConfig alertConfig;

        /**
         * <p>The name of the alert group.</p>
         * 
         * <strong>example:</strong>
         * <p>alertgroup1</p>
         */
        @NameInMap("AlertGroup")
        public String alertGroup;

        /**
         * <p>The type of the CNAME domain name that is used to access the instance. Valid value:</p>
         * <ul>
         * <li>PUBLIC: The CNAME domain name is used to access the instance over the Internet.</li>
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
         * <p>instancetest1</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The domain name that is used to access the instance over the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p>test.rr.gtm-003.com</p>
         */
        @NameInMap("PubicZoneName")
        public String pubicZoneName;

        /**
         * <p>Indicates whether a custom CNAME domain name or a CNAME domain name assigned by the system is used to access the instance over the Internet. Valid values:</p>
         * <ul>
         * <li>CUSTOM: A custom CNAME domain name is used.</li>
         * <li>SYSTEM_ASSIGN: A CNAME domain name assigned by the system is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("PublicCnameMode")
        public String publicCnameMode;

        /**
         * <p>The hostname corresponding to the CNAME domain name that is used to access the instance over the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p>test.rr</p>
         */
        @NameInMap("PublicRr")
        public String publicRr;

        /**
         * <p>The service domain name that is used over the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("PublicUserDomainName")
        public String publicUserDomainName;

        /**
         * <p>The type of the access policy. Valid values:</p>
         * <ul>
         * <li>LATENCY: Latency-based</li>
         * <li>GEO: Geographical location-based</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GEO</p>
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

        public static DescribeDnsGtmInstanceResponseBodyConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmInstanceResponseBodyConfig self = new DescribeDnsGtmInstanceResponseBodyConfig();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmInstanceResponseBodyConfig setAlertConfig(DescribeDnsGtmInstanceResponseBodyConfigAlertConfig alertConfig) {
            this.alertConfig = alertConfig;
            return this;
        }
        public DescribeDnsGtmInstanceResponseBodyConfigAlertConfig getAlertConfig() {
            return this.alertConfig;
        }

        public DescribeDnsGtmInstanceResponseBodyConfig setAlertGroup(String alertGroup) {
            this.alertGroup = alertGroup;
            return this;
        }
        public String getAlertGroup() {
            return this.alertGroup;
        }

        public DescribeDnsGtmInstanceResponseBodyConfig setCnameType(String cnameType) {
            this.cnameType = cnameType;
            return this;
        }
        public String getCnameType() {
            return this.cnameType;
        }

        public DescribeDnsGtmInstanceResponseBodyConfig setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeDnsGtmInstanceResponseBodyConfig setPubicZoneName(String pubicZoneName) {
            this.pubicZoneName = pubicZoneName;
            return this;
        }
        public String getPubicZoneName() {
            return this.pubicZoneName;
        }

        public DescribeDnsGtmInstanceResponseBodyConfig setPublicCnameMode(String publicCnameMode) {
            this.publicCnameMode = publicCnameMode;
            return this;
        }
        public String getPublicCnameMode() {
            return this.publicCnameMode;
        }

        public DescribeDnsGtmInstanceResponseBodyConfig setPublicRr(String publicRr) {
            this.publicRr = publicRr;
            return this;
        }
        public String getPublicRr() {
            return this.publicRr;
        }

        public DescribeDnsGtmInstanceResponseBodyConfig setPublicUserDomainName(String publicUserDomainName) {
            this.publicUserDomainName = publicUserDomainName;
            return this;
        }
        public String getPublicUserDomainName() {
            return this.publicUserDomainName;
        }

        public DescribeDnsGtmInstanceResponseBodyConfig setStrategyMode(String strategyMode) {
            this.strategyMode = strategyMode;
            return this;
        }
        public String getStrategyMode() {
            return this.strategyMode;
        }

        public DescribeDnsGtmInstanceResponseBodyConfig setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

    }

    public static class DescribeDnsGtmInstanceResponseBodyUsedQuota extends TeaModel {
        @NameInMap("DingtalkUsedCount")
        public Integer dingtalkUsedCount;

        /**
         * <p>The total number of emails that were sent.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("EmailUsedCount")
        public Integer emailUsedCount;

        /**
         * <p>The total number of short messages that were sent.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("SmsUsedCount")
        public Integer smsUsedCount;

        /**
         * <p>The number of detection tasks that were created.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("TaskUsedCount")
        public Integer taskUsedCount;

        public static DescribeDnsGtmInstanceResponseBodyUsedQuota build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmInstanceResponseBodyUsedQuota self = new DescribeDnsGtmInstanceResponseBodyUsedQuota();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmInstanceResponseBodyUsedQuota setDingtalkUsedCount(Integer dingtalkUsedCount) {
            this.dingtalkUsedCount = dingtalkUsedCount;
            return this;
        }
        public Integer getDingtalkUsedCount() {
            return this.dingtalkUsedCount;
        }

        public DescribeDnsGtmInstanceResponseBodyUsedQuota setEmailUsedCount(Integer emailUsedCount) {
            this.emailUsedCount = emailUsedCount;
            return this;
        }
        public Integer getEmailUsedCount() {
            return this.emailUsedCount;
        }

        public DescribeDnsGtmInstanceResponseBodyUsedQuota setSmsUsedCount(Integer smsUsedCount) {
            this.smsUsedCount = smsUsedCount;
            return this;
        }
        public Integer getSmsUsedCount() {
            return this.smsUsedCount;
        }

        public DescribeDnsGtmInstanceResponseBodyUsedQuota setTaskUsedCount(Integer taskUsedCount) {
            this.taskUsedCount = taskUsedCount;
            return this;
        }
        public Integer getTaskUsedCount() {
            return this.taskUsedCount;
        }

    }

}
