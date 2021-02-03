// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("VersionCode")
    @Validation(required = true)
    public String versionCode;

    @NameInMap("SmsQuota")
    @Validation(required = true)
    public Integer smsQuota;

    @NameInMap("TaskQuota")
    @Validation(required = true)
    public Integer taskQuota;

    @NameInMap("CreateTime")
    @Validation(required = true)
    public String createTime;

    @NameInMap("CreateTimestamp")
    @Validation(required = true)
    public Long createTimestamp;

    @NameInMap("ExpireTime")
    @Validation(required = true)
    public String expireTime;

    @NameInMap("ExpireTimestamp")
    @Validation(required = true)
    public Long expireTimestamp;

    @NameInMap("ResourceGroupId")
    @Validation(required = true)
    public String resourceGroupId;

    @NameInMap("PaymentType")
    @Validation(required = true)
    public String paymentType;

    @NameInMap("Config")
    @Validation(required = true)
    public DescribeDnsGtmInstanceResponseConfig config;

    @NameInMap("UsedQuota")
    @Validation(required = true)
    public DescribeDnsGtmInstanceResponseUsedQuota usedQuota;

    public static DescribeDnsGtmInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmInstanceResponse self = new DescribeDnsGtmInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsGtmInstanceResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDnsGtmInstanceResponse setVersionCode(String versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public String getVersionCode() {
        return this.versionCode;
    }

    public DescribeDnsGtmInstanceResponse setSmsQuota(Integer smsQuota) {
        this.smsQuota = smsQuota;
        return this;
    }
    public Integer getSmsQuota() {
        return this.smsQuota;
    }

    public DescribeDnsGtmInstanceResponse setTaskQuota(Integer taskQuota) {
        this.taskQuota = taskQuota;
        return this;
    }
    public Integer getTaskQuota() {
        return this.taskQuota;
    }

    public DescribeDnsGtmInstanceResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeDnsGtmInstanceResponse setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DescribeDnsGtmInstanceResponse setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeDnsGtmInstanceResponse setExpireTimestamp(Long expireTimestamp) {
        this.expireTimestamp = expireTimestamp;
        return this;
    }
    public Long getExpireTimestamp() {
        return this.expireTimestamp;
    }

    public DescribeDnsGtmInstanceResponse setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDnsGtmInstanceResponse setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public DescribeDnsGtmInstanceResponse setConfig(DescribeDnsGtmInstanceResponseConfig config) {
        this.config = config;
        return this;
    }
    public DescribeDnsGtmInstanceResponseConfig getConfig() {
        return this.config;
    }

    public DescribeDnsGtmInstanceResponse setUsedQuota(DescribeDnsGtmInstanceResponseUsedQuota usedQuota) {
        this.usedQuota = usedQuota;
        return this;
    }
    public DescribeDnsGtmInstanceResponseUsedQuota getUsedQuota() {
        return this.usedQuota;
    }

    public static class DescribeDnsGtmInstanceResponseConfigAlertConfigAlertConfig extends TeaModel {
        @NameInMap("NoticeType")
        @Validation(required = true)
        public String noticeType;

        @NameInMap("SmsNotice")
        @Validation(required = true)
        public Boolean smsNotice;

        @NameInMap("EmailNotice")
        @Validation(required = true)
        public Boolean emailNotice;

        public static DescribeDnsGtmInstanceResponseConfigAlertConfigAlertConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmInstanceResponseConfigAlertConfigAlertConfig self = new DescribeDnsGtmInstanceResponseConfigAlertConfigAlertConfig();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmInstanceResponseConfigAlertConfigAlertConfig setNoticeType(String noticeType) {
            this.noticeType = noticeType;
            return this;
        }
        public String getNoticeType() {
            return this.noticeType;
        }

        public DescribeDnsGtmInstanceResponseConfigAlertConfigAlertConfig setSmsNotice(Boolean smsNotice) {
            this.smsNotice = smsNotice;
            return this;
        }
        public Boolean getSmsNotice() {
            return this.smsNotice;
        }

        public DescribeDnsGtmInstanceResponseConfigAlertConfigAlertConfig setEmailNotice(Boolean emailNotice) {
            this.emailNotice = emailNotice;
            return this;
        }
        public Boolean getEmailNotice() {
            return this.emailNotice;
        }

    }

    public static class DescribeDnsGtmInstanceResponseConfigAlertConfig extends TeaModel {
        @NameInMap("AlertConfig")
        @Validation(required = true)
        public java.util.List<DescribeDnsGtmInstanceResponseConfigAlertConfigAlertConfig> alertConfig;

        public static DescribeDnsGtmInstanceResponseConfigAlertConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmInstanceResponseConfigAlertConfig self = new DescribeDnsGtmInstanceResponseConfigAlertConfig();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmInstanceResponseConfigAlertConfig setAlertConfig(java.util.List<DescribeDnsGtmInstanceResponseConfigAlertConfigAlertConfig> alertConfig) {
            this.alertConfig = alertConfig;
            return this;
        }
        public java.util.List<DescribeDnsGtmInstanceResponseConfigAlertConfigAlertConfig> getAlertConfig() {
            return this.alertConfig;
        }

    }

    public static class DescribeDnsGtmInstanceResponseConfig extends TeaModel {
        @NameInMap("InstanceName")
        @Validation(required = true)
        public String instanceName;

        @NameInMap("CnameType")
        @Validation(required = true)
        public String cnameType;

        @NameInMap("PublicUserDomainName")
        @Validation(required = true)
        public String publicUserDomainName;

        @NameInMap("PublicCnameMode")
        @Validation(required = true)
        public String publicCnameMode;

        @NameInMap("PubicZoneName")
        @Validation(required = true)
        public String pubicZoneName;

        @NameInMap("Ttl")
        @Validation(required = true)
        public Integer ttl;

        @NameInMap("StrategyMode")
        @Validation(required = true)
        public String strategyMode;

        @NameInMap("AlertGroup")
        @Validation(required = true)
        public String alertGroup;

        @NameInMap("AlertConfig")
        @Validation(required = true)
        public DescribeDnsGtmInstanceResponseConfigAlertConfig alertConfig;

        public static DescribeDnsGtmInstanceResponseConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmInstanceResponseConfig self = new DescribeDnsGtmInstanceResponseConfig();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmInstanceResponseConfig setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeDnsGtmInstanceResponseConfig setCnameType(String cnameType) {
            this.cnameType = cnameType;
            return this;
        }
        public String getCnameType() {
            return this.cnameType;
        }

        public DescribeDnsGtmInstanceResponseConfig setPublicUserDomainName(String publicUserDomainName) {
            this.publicUserDomainName = publicUserDomainName;
            return this;
        }
        public String getPublicUserDomainName() {
            return this.publicUserDomainName;
        }

        public DescribeDnsGtmInstanceResponseConfig setPublicCnameMode(String publicCnameMode) {
            this.publicCnameMode = publicCnameMode;
            return this;
        }
        public String getPublicCnameMode() {
            return this.publicCnameMode;
        }

        public DescribeDnsGtmInstanceResponseConfig setPubicZoneName(String pubicZoneName) {
            this.pubicZoneName = pubicZoneName;
            return this;
        }
        public String getPubicZoneName() {
            return this.pubicZoneName;
        }

        public DescribeDnsGtmInstanceResponseConfig setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

        public DescribeDnsGtmInstanceResponseConfig setStrategyMode(String strategyMode) {
            this.strategyMode = strategyMode;
            return this;
        }
        public String getStrategyMode() {
            return this.strategyMode;
        }

        public DescribeDnsGtmInstanceResponseConfig setAlertGroup(String alertGroup) {
            this.alertGroup = alertGroup;
            return this;
        }
        public String getAlertGroup() {
            return this.alertGroup;
        }

        public DescribeDnsGtmInstanceResponseConfig setAlertConfig(DescribeDnsGtmInstanceResponseConfigAlertConfig alertConfig) {
            this.alertConfig = alertConfig;
            return this;
        }
        public DescribeDnsGtmInstanceResponseConfigAlertConfig getAlertConfig() {
            return this.alertConfig;
        }

    }

    public static class DescribeDnsGtmInstanceResponseUsedQuota extends TeaModel {
        @NameInMap("TaskUsedCount")
        @Validation(required = true)
        public Integer taskUsedCount;

        @NameInMap("SmsUsedCount")
        @Validation(required = true)
        public Integer smsUsedCount;

        @NameInMap("EmailUsedCount")
        @Validation(required = true)
        public Integer emailUsedCount;

        public static DescribeDnsGtmInstanceResponseUsedQuota build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmInstanceResponseUsedQuota self = new DescribeDnsGtmInstanceResponseUsedQuota();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmInstanceResponseUsedQuota setTaskUsedCount(Integer taskUsedCount) {
            this.taskUsedCount = taskUsedCount;
            return this;
        }
        public Integer getTaskUsedCount() {
            return this.taskUsedCount;
        }

        public DescribeDnsGtmInstanceResponseUsedQuota setSmsUsedCount(Integer smsUsedCount) {
            this.smsUsedCount = smsUsedCount;
            return this;
        }
        public Integer getSmsUsedCount() {
            return this.smsUsedCount;
        }

        public DescribeDnsGtmInstanceResponseUsedQuota setEmailUsedCount(Integer emailUsedCount) {
            this.emailUsedCount = emailUsedCount;
            return this;
        }
        public Integer getEmailUsedCount() {
            return this.emailUsedCount;
        }

    }

}
