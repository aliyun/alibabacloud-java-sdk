// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmInstanceResponseBody extends TeaModel {
    /**
     * <p>The instance configuration.</p>
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
     * <p>The UNIX timestamp when the instance was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1602656937000</p>
     */
    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    /**
     * <p>The expiration date.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-10-14T06:58Z</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>The UNIX timestamp when the instance expires.</p>
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
     * <p>gtm-cn-wwo3a3hbz**</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The billing method.</p>
     * <ul>
     * <li>Subscription: subscription</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Subscription</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>84314904-D047-4176-A0EC-256D7F68C7F5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>resourc*****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The quota on the number of text message notifications.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("SmsQuota")
    public Integer smsQuota;

    /**
     * <p>The quota on the number of health check tasks.</p>
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
     * <p>standard</p>
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

        @NameInMap("EmailNotice")
        public Boolean emailNotice;

        @NameInMap("NoticeType")
        public String noticeType;

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
        @NameInMap("AlertConfig")
        public DescribeDnsGtmInstanceResponseBodyConfigAlertConfig alertConfig;

        /**
         * <p>The alert contact group. The value is a \<code>List\\&lt;string&gt;\\</code> in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;test1&quot;,&quot;test2&quot;]</p>
         */
        @NameInMap("AlertGroup")
        public String alertGroup;

        /**
         * <p>The type of the CNAME domain name used for access.</p>
         * <ul>
         * <li>PUBLIC: Internet-facing</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        @NameInMap("CnameType")
        public String cnameType;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public access domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>gtm-cn-wwo3a3hbz**.example.com</p>
         */
        @NameInMap("PubicZoneName")
        public String pubicZoneName;

        /**
         * <p>The access method for the public CNAME.</p>
         * <ul>
         * <li><p>CUSTOM: custom</p>
         * </li>
         * <li><p>SYSTEM_ASSIGN: system-assigned. This feature is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("PublicCnameMode")
        public String publicCnameMode;

        /**
         * <p>The hostname for public access.</p>
         * 
         * <strong>example:</strong>
         * <p>test.rr</p>
         */
        @NameInMap("PublicRr")
        public String publicRr;

        /**
         * <p>The user\&quot;s public service domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("PublicUserDomainName")
        public String publicUserDomainName;

        /**
         * <p>The access policy mode.</p>
         * <ul>
         * <li><p>LATENCY: latency-based</p>
         * </li>
         * <li><p>GEO: geography-based</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GEO</p>
         */
        @NameInMap("StrategyMode")
        public String strategyMode;

        /**
         * <p>The global TTL.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
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
        /**
         * <p>The number of DingTalk notifications that were sent.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("DingtalkUsedCount")
        public Integer dingtalkUsedCount;

        /**
         * <p>The number of email notifications that were sent.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("EmailUsedCount")
        public Integer emailUsedCount;

        /**
         * <p>The number of text messages that were sent.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("SmsUsedCount")
        public Integer smsUsedCount;

        /**
         * <p>The number of health check tasks that were created.</p>
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
