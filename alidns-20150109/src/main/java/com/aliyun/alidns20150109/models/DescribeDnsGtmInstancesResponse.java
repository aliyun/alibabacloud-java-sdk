// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("TotalItems")
    @Validation(required = true)
    public Integer totalItems;

    @NameInMap("TotalPages")
    @Validation(required = true)
    public Integer totalPages;

    @NameInMap("GtmInstances")
    @Validation(required = true)
    public java.util.List<DescribeDnsGtmInstancesResponseGtmInstances> gtmInstances;

    public static DescribeDnsGtmInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmInstancesResponse self = new DescribeDnsGtmInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsGtmInstancesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDnsGtmInstancesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDnsGtmInstancesResponse setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeDnsGtmInstancesResponse setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public DescribeDnsGtmInstancesResponse setGtmInstances(java.util.List<DescribeDnsGtmInstancesResponseGtmInstances> gtmInstances) {
        this.gtmInstances = gtmInstances;
        return this;
    }
    public java.util.List<DescribeDnsGtmInstancesResponseGtmInstances> getGtmInstances() {
        return this.gtmInstances;
    }

    public static class DescribeDnsGtmInstancesResponseGtmInstancesConfigAlertConfig extends TeaModel {
        @NameInMap("NoticeType")
        @Validation(required = true)
        public String noticeType;

        @NameInMap("SmsNotice")
        @Validation(required = true)
        public String smsNotice;

        @NameInMap("EmailNotice")
        @Validation(required = true)
        public String emailNotice;

        public static DescribeDnsGtmInstancesResponseGtmInstancesConfigAlertConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmInstancesResponseGtmInstancesConfigAlertConfig self = new DescribeDnsGtmInstancesResponseGtmInstancesConfigAlertConfig();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmInstancesResponseGtmInstancesConfigAlertConfig setNoticeType(String noticeType) {
            this.noticeType = noticeType;
            return this;
        }
        public String getNoticeType() {
            return this.noticeType;
        }

        public DescribeDnsGtmInstancesResponseGtmInstancesConfigAlertConfig setSmsNotice(String smsNotice) {
            this.smsNotice = smsNotice;
            return this;
        }
        public String getSmsNotice() {
            return this.smsNotice;
        }

        public DescribeDnsGtmInstancesResponseGtmInstancesConfigAlertConfig setEmailNotice(String emailNotice) {
            this.emailNotice = emailNotice;
            return this;
        }
        public String getEmailNotice() {
            return this.emailNotice;
        }

    }

    public static class DescribeDnsGtmInstancesResponseGtmInstancesConfig extends TeaModel {
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

        @NameInMap("PublicZoneName")
        @Validation(required = true)
        public String publicZoneName;

        @NameInMap("Ttl")
        @Validation(required = true)
        public Integer ttl;

        @NameInMap("AlertGroup")
        @Validation(required = true)
        public String alertGroup;

        @NameInMap("StrategyMode")
        @Validation(required = true)
        public String strategyMode;

        @NameInMap("AlertConfig")
        @Validation(required = true)
        public java.util.List<DescribeDnsGtmInstancesResponseGtmInstancesConfigAlertConfig> alertConfig;

        public static DescribeDnsGtmInstancesResponseGtmInstancesConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmInstancesResponseGtmInstancesConfig self = new DescribeDnsGtmInstancesResponseGtmInstancesConfig();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmInstancesResponseGtmInstancesConfig setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeDnsGtmInstancesResponseGtmInstancesConfig setCnameType(String cnameType) {
            this.cnameType = cnameType;
            return this;
        }
        public String getCnameType() {
            return this.cnameType;
        }

        public DescribeDnsGtmInstancesResponseGtmInstancesConfig setPublicUserDomainName(String publicUserDomainName) {
            this.publicUserDomainName = publicUserDomainName;
            return this;
        }
        public String getPublicUserDomainName() {
            return this.publicUserDomainName;
        }

        public DescribeDnsGtmInstancesResponseGtmInstancesConfig setPublicCnameMode(String publicCnameMode) {
            this.publicCnameMode = publicCnameMode;
            return this;
        }
        public String getPublicCnameMode() {
            return this.publicCnameMode;
        }

        public DescribeDnsGtmInstancesResponseGtmInstancesConfig setPublicZoneName(String publicZoneName) {
            this.publicZoneName = publicZoneName;
            return this;
        }
        public String getPublicZoneName() {
            return this.publicZoneName;
        }

        public DescribeDnsGtmInstancesResponseGtmInstancesConfig setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

        public DescribeDnsGtmInstancesResponseGtmInstancesConfig setAlertGroup(String alertGroup) {
            this.alertGroup = alertGroup;
            return this;
        }
        public String getAlertGroup() {
            return this.alertGroup;
        }

        public DescribeDnsGtmInstancesResponseGtmInstancesConfig setStrategyMode(String strategyMode) {
            this.strategyMode = strategyMode;
            return this;
        }
        public String getStrategyMode() {
            return this.strategyMode;
        }

        public DescribeDnsGtmInstancesResponseGtmInstancesConfig setAlertConfig(java.util.List<DescribeDnsGtmInstancesResponseGtmInstancesConfigAlertConfig> alertConfig) {
            this.alertConfig = alertConfig;
            return this;
        }
        public java.util.List<DescribeDnsGtmInstancesResponseGtmInstancesConfigAlertConfig> getAlertConfig() {
            return this.alertConfig;
        }

    }

    public static class DescribeDnsGtmInstancesResponseGtmInstancesUsedQuota extends TeaModel {
        @NameInMap("TaskUsedCount")
        @Validation(required = true)
        public Integer taskUsedCount;

        @NameInMap("SmsUsedCount")
        @Validation(required = true)
        public Integer smsUsedCount;

        @NameInMap("EmailUsedCount")
        @Validation(required = true)
        public Integer emailUsedCount;

        public static DescribeDnsGtmInstancesResponseGtmInstancesUsedQuota build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmInstancesResponseGtmInstancesUsedQuota self = new DescribeDnsGtmInstancesResponseGtmInstancesUsedQuota();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmInstancesResponseGtmInstancesUsedQuota setTaskUsedCount(Integer taskUsedCount) {
            this.taskUsedCount = taskUsedCount;
            return this;
        }
        public Integer getTaskUsedCount() {
            return this.taskUsedCount;
        }

        public DescribeDnsGtmInstancesResponseGtmInstancesUsedQuota setSmsUsedCount(Integer smsUsedCount) {
            this.smsUsedCount = smsUsedCount;
            return this;
        }
        public Integer getSmsUsedCount() {
            return this.smsUsedCount;
        }

        public DescribeDnsGtmInstancesResponseGtmInstancesUsedQuota setEmailUsedCount(Integer emailUsedCount) {
            this.emailUsedCount = emailUsedCount;
            return this;
        }
        public Integer getEmailUsedCount() {
            return this.emailUsedCount;
        }

    }

    public static class DescribeDnsGtmInstancesResponseGtmInstances extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("VersionCode")
        @Validation(required = true)
        public String versionCode;

        @NameInMap("SmsQuota")
        @Validation(required = true)
        public Integer smsQuota;

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

        @NameInMap("TaskQuota")
        @Validation(required = true)
        public Integer taskQuota;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("PaymentType")
        @Validation(required = true)
        public String paymentType;

        @NameInMap("Config")
        @Validation(required = true)
        public DescribeDnsGtmInstancesResponseGtmInstancesConfig config;

        @NameInMap("UsedQuota")
        @Validation(required = true)
        public DescribeDnsGtmInstancesResponseGtmInstancesUsedQuota usedQuota;

        public static DescribeDnsGtmInstancesResponseGtmInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmInstancesResponseGtmInstances self = new DescribeDnsGtmInstancesResponseGtmInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmInstancesResponseGtmInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDnsGtmInstancesResponseGtmInstances setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

        public DescribeDnsGtmInstancesResponseGtmInstances setSmsQuota(Integer smsQuota) {
            this.smsQuota = smsQuota;
            return this;
        }
        public Integer getSmsQuota() {
            return this.smsQuota;
        }

        public DescribeDnsGtmInstancesResponseGtmInstances setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDnsGtmInstancesResponseGtmInstances setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeDnsGtmInstancesResponseGtmInstances setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDnsGtmInstancesResponseGtmInstances setExpireTimestamp(Long expireTimestamp) {
            this.expireTimestamp = expireTimestamp;
            return this;
        }
        public Long getExpireTimestamp() {
            return this.expireTimestamp;
        }

        public DescribeDnsGtmInstancesResponseGtmInstances setTaskQuota(Integer taskQuota) {
            this.taskQuota = taskQuota;
            return this;
        }
        public Integer getTaskQuota() {
            return this.taskQuota;
        }

        public DescribeDnsGtmInstancesResponseGtmInstances setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDnsGtmInstancesResponseGtmInstances setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public DescribeDnsGtmInstancesResponseGtmInstances setConfig(DescribeDnsGtmInstancesResponseGtmInstancesConfig config) {
            this.config = config;
            return this;
        }
        public DescribeDnsGtmInstancesResponseGtmInstancesConfig getConfig() {
            return this.config;
        }

        public DescribeDnsGtmInstancesResponseGtmInstances setUsedQuota(DescribeDnsGtmInstancesResponseGtmInstancesUsedQuota usedQuota) {
            this.usedQuota = usedQuota;
            return this;
        }
        public DescribeDnsGtmInstancesResponseGtmInstancesUsedQuota getUsedQuota() {
            return this.usedQuota;
        }

    }

}
