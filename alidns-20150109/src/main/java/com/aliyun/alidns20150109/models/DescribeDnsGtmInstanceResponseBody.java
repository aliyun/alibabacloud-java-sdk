// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmInstanceResponseBody extends TeaModel {
    @NameInMap("Config")
    public DescribeDnsGtmInstanceResponseBodyConfig config;

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

    @NameInMap("PaymentType")
    public String paymentType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SmsQuota")
    public Integer smsQuota;

    @NameInMap("TaskQuota")
    public Integer taskQuota;

    @NameInMap("UsedQuota")
    public DescribeDnsGtmInstanceResponseBodyUsedQuota usedQuota;

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

        @NameInMap("AlertGroup")
        public String alertGroup;

        @NameInMap("CnameType")
        public String cnameType;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("PubicZoneName")
        public String pubicZoneName;

        @NameInMap("PublicCnameMode")
        public String publicCnameMode;

        @NameInMap("PublicRr")
        public String publicRr;

        @NameInMap("PublicUserDomainName")
        public String publicUserDomainName;

        @NameInMap("StrategyMode")
        public String strategyMode;

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

        @NameInMap("EmailUsedCount")
        public Integer emailUsedCount;

        @NameInMap("SmsUsedCount")
        public Integer smsUsedCount;

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
