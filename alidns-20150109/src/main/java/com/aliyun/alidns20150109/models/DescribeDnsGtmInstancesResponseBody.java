// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmInstancesResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("GtmInstances")
    public java.util.List<DescribeDnsGtmInstancesResponseBodyGtmInstances> gtmInstances;

    @NameInMap("TotalPages")
    public Integer totalPages;

    @NameInMap("TotalItems")
    public Integer totalItems;

    public static DescribeDnsGtmInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmInstancesResponseBody self = new DescribeDnsGtmInstancesResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeDnsGtmInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDnsGtmInstancesResponseBody setGtmInstances(java.util.List<DescribeDnsGtmInstancesResponseBodyGtmInstances> gtmInstances) {
        this.gtmInstances = gtmInstances;
        return this;
    }
    public java.util.List<DescribeDnsGtmInstancesResponseBodyGtmInstances> getGtmInstances() {
        return this.gtmInstances;
    }

    public DescribeDnsGtmInstancesResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public DescribeDnsGtmInstancesResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public static class DescribeDnsGtmInstancesResponseBodyGtmInstancesConfigAlertConfig extends TeaModel {
        @NameInMap("SmsNotice")
        public String smsNotice;

        @NameInMap("NoticeType")
        public String noticeType;

        @NameInMap("EmailNotice")
        public String emailNotice;

        public static DescribeDnsGtmInstancesResponseBodyGtmInstancesConfigAlertConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmInstancesResponseBodyGtmInstancesConfigAlertConfig self = new DescribeDnsGtmInstancesResponseBodyGtmInstancesConfigAlertConfig();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstancesConfigAlertConfig setSmsNotice(String smsNotice) {
            this.smsNotice = smsNotice;
            return this;
        }
        public String getSmsNotice() {
            return this.smsNotice;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstancesConfigAlertConfig setNoticeType(String noticeType) {
            this.noticeType = noticeType;
            return this;
        }
        public String getNoticeType() {
            return this.noticeType;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstancesConfigAlertConfig setEmailNotice(String emailNotice) {
            this.emailNotice = emailNotice;
            return this;
        }
        public String getEmailNotice() {
            return this.emailNotice;
        }

    }

    public static class DescribeDnsGtmInstancesResponseBodyGtmInstancesConfig extends TeaModel {
        @NameInMap("Ttl")
        public Integer ttl;

        @NameInMap("AlertGroup")
        public String alertGroup;

        @NameInMap("PublicZoneName")
        public String publicZoneName;

        @NameInMap("CnameType")
        public String cnameType;

        @NameInMap("StrategyMode")
        public String strategyMode;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("PublicCnameMode")
        public String publicCnameMode;

        @NameInMap("AlertConfig")
        public java.util.List<DescribeDnsGtmInstancesResponseBodyGtmInstancesConfigAlertConfig> alertConfig;

        @NameInMap("PublicUserDomainName")
        public String publicUserDomainName;

        public static DescribeDnsGtmInstancesResponseBodyGtmInstancesConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmInstancesResponseBodyGtmInstancesConfig self = new DescribeDnsGtmInstancesResponseBodyGtmInstancesConfig();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstancesConfig setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstancesConfig setAlertGroup(String alertGroup) {
            this.alertGroup = alertGroup;
            return this;
        }
        public String getAlertGroup() {
            return this.alertGroup;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstancesConfig setPublicZoneName(String publicZoneName) {
            this.publicZoneName = publicZoneName;
            return this;
        }
        public String getPublicZoneName() {
            return this.publicZoneName;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstancesConfig setCnameType(String cnameType) {
            this.cnameType = cnameType;
            return this;
        }
        public String getCnameType() {
            return this.cnameType;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstancesConfig setStrategyMode(String strategyMode) {
            this.strategyMode = strategyMode;
            return this;
        }
        public String getStrategyMode() {
            return this.strategyMode;
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

        public DescribeDnsGtmInstancesResponseBodyGtmInstancesConfig setAlertConfig(java.util.List<DescribeDnsGtmInstancesResponseBodyGtmInstancesConfigAlertConfig> alertConfig) {
            this.alertConfig = alertConfig;
            return this;
        }
        public java.util.List<DescribeDnsGtmInstancesResponseBodyGtmInstancesConfigAlertConfig> getAlertConfig() {
            return this.alertConfig;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstancesConfig setPublicUserDomainName(String publicUserDomainName) {
            this.publicUserDomainName = publicUserDomainName;
            return this;
        }
        public String getPublicUserDomainName() {
            return this.publicUserDomainName;
        }

    }

    public static class DescribeDnsGtmInstancesResponseBodyGtmInstancesUsedQuota extends TeaModel {
        @NameInMap("EmailUsedCount")
        public Integer emailUsedCount;

        @NameInMap("TaskUsedCount")
        public Integer taskUsedCount;

        @NameInMap("SmsUsedCount")
        public Integer smsUsedCount;

        public static DescribeDnsGtmInstancesResponseBodyGtmInstancesUsedQuota build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmInstancesResponseBodyGtmInstancesUsedQuota self = new DescribeDnsGtmInstancesResponseBodyGtmInstancesUsedQuota();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstancesUsedQuota setEmailUsedCount(Integer emailUsedCount) {
            this.emailUsedCount = emailUsedCount;
            return this;
        }
        public Integer getEmailUsedCount() {
            return this.emailUsedCount;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstancesUsedQuota setTaskUsedCount(Integer taskUsedCount) {
            this.taskUsedCount = taskUsedCount;
            return this;
        }
        public Integer getTaskUsedCount() {
            return this.taskUsedCount;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstancesUsedQuota setSmsUsedCount(Integer smsUsedCount) {
            this.smsUsedCount = smsUsedCount;
            return this;
        }
        public Integer getSmsUsedCount() {
            return this.smsUsedCount;
        }

    }

    public static class DescribeDnsGtmInstancesResponseBodyGtmInstances extends TeaModel {
        @NameInMap("PaymentType")
        public String paymentType;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("SmsQuota")
        public Integer smsQuota;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Config")
        public DescribeDnsGtmInstancesResponseBodyGtmInstancesConfig config;

        @NameInMap("ExpireTimestamp")
        public Long expireTimestamp;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("VersionCode")
        public String versionCode;

        @NameInMap("UsedQuota")
        public DescribeDnsGtmInstancesResponseBodyGtmInstancesUsedQuota usedQuota;

        @NameInMap("TaskQuota")
        public Integer taskQuota;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        public static DescribeDnsGtmInstancesResponseBodyGtmInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmInstancesResponseBodyGtmInstances self = new DescribeDnsGtmInstancesResponseBodyGtmInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstances setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstances setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstances setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstances setSmsQuota(Integer smsQuota) {
            this.smsQuota = smsQuota;
            return this;
        }
        public Integer getSmsQuota() {
            return this.smsQuota;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstances setConfig(DescribeDnsGtmInstancesResponseBodyGtmInstancesConfig config) {
            this.config = config;
            return this;
        }
        public DescribeDnsGtmInstancesResponseBodyGtmInstancesConfig getConfig() {
            return this.config;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstances setExpireTimestamp(Long expireTimestamp) {
            this.expireTimestamp = expireTimestamp;
            return this;
        }
        public Long getExpireTimestamp() {
            return this.expireTimestamp;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstances setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstances setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstances setUsedQuota(DescribeDnsGtmInstancesResponseBodyGtmInstancesUsedQuota usedQuota) {
            this.usedQuota = usedQuota;
            return this;
        }
        public DescribeDnsGtmInstancesResponseBodyGtmInstancesUsedQuota getUsedQuota() {
            return this.usedQuota;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstances setTaskQuota(Integer taskQuota) {
            this.taskQuota = taskQuota;
            return this;
        }
        public Integer getTaskQuota() {
            return this.taskQuota;
        }

        public DescribeDnsGtmInstancesResponseBodyGtmInstances setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

    }

}
