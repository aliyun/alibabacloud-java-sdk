// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DescAccountSummaryResponseBody extends TeaModel {
    @NameInMap("DayuStatus")
    public Integer dayuStatus;

    @NameInMap("SmsRecord")
    public Integer smsRecord;

    @NameInMap("MonthQuota")
    public Integer monthQuota;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Receivers")
    public Integer receivers;

    @NameInMap("SmsTemplates")
    public Integer smsTemplates;

    @NameInMap("Templates")
    public Integer templates;

    @NameInMap("DailyQuota")
    public Integer dailyQuota;

    @NameInMap("UserStatus")
    public Integer userStatus;

    @NameInMap("Domains")
    public Integer domains;

    @NameInMap("QuotaLevel")
    public Integer quotaLevel;

    @NameInMap("SmsSign")
    public Integer smsSign;

    @NameInMap("MaxQuotaLevel")
    public Integer maxQuotaLevel;

    @NameInMap("EnableTimes")
    public Integer enableTimes;

    @NameInMap("Tags")
    public Integer tags;

    @NameInMap("MailAddresses")
    public Integer mailAddresses;

    public static DescAccountSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescAccountSummaryResponseBody self = new DescAccountSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescAccountSummaryResponseBody setDayuStatus(Integer dayuStatus) {
        this.dayuStatus = dayuStatus;
        return this;
    }
    public Integer getDayuStatus() {
        return this.dayuStatus;
    }

    public DescAccountSummaryResponseBody setSmsRecord(Integer smsRecord) {
        this.smsRecord = smsRecord;
        return this;
    }
    public Integer getSmsRecord() {
        return this.smsRecord;
    }

    public DescAccountSummaryResponseBody setMonthQuota(Integer monthQuota) {
        this.monthQuota = monthQuota;
        return this;
    }
    public Integer getMonthQuota() {
        return this.monthQuota;
    }

    public DescAccountSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescAccountSummaryResponseBody setReceivers(Integer receivers) {
        this.receivers = receivers;
        return this;
    }
    public Integer getReceivers() {
        return this.receivers;
    }

    public DescAccountSummaryResponseBody setSmsTemplates(Integer smsTemplates) {
        this.smsTemplates = smsTemplates;
        return this;
    }
    public Integer getSmsTemplates() {
        return this.smsTemplates;
    }

    public DescAccountSummaryResponseBody setTemplates(Integer templates) {
        this.templates = templates;
        return this;
    }
    public Integer getTemplates() {
        return this.templates;
    }

    public DescAccountSummaryResponseBody setDailyQuota(Integer dailyQuota) {
        this.dailyQuota = dailyQuota;
        return this;
    }
    public Integer getDailyQuota() {
        return this.dailyQuota;
    }

    public DescAccountSummaryResponseBody setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
        return this;
    }
    public Integer getUserStatus() {
        return this.userStatus;
    }

    public DescAccountSummaryResponseBody setDomains(Integer domains) {
        this.domains = domains;
        return this;
    }
    public Integer getDomains() {
        return this.domains;
    }

    public DescAccountSummaryResponseBody setQuotaLevel(Integer quotaLevel) {
        this.quotaLevel = quotaLevel;
        return this;
    }
    public Integer getQuotaLevel() {
        return this.quotaLevel;
    }

    public DescAccountSummaryResponseBody setSmsSign(Integer smsSign) {
        this.smsSign = smsSign;
        return this;
    }
    public Integer getSmsSign() {
        return this.smsSign;
    }

    public DescAccountSummaryResponseBody setMaxQuotaLevel(Integer maxQuotaLevel) {
        this.maxQuotaLevel = maxQuotaLevel;
        return this;
    }
    public Integer getMaxQuotaLevel() {
        return this.maxQuotaLevel;
    }

    public DescAccountSummaryResponseBody setEnableTimes(Integer enableTimes) {
        this.enableTimes = enableTimes;
        return this;
    }
    public Integer getEnableTimes() {
        return this.enableTimes;
    }

    public DescAccountSummaryResponseBody setTags(Integer tags) {
        this.tags = tags;
        return this;
    }
    public Integer getTags() {
        return this.tags;
    }

    public DescAccountSummaryResponseBody setMailAddresses(Integer mailAddresses) {
        this.mailAddresses = mailAddresses;
        return this;
    }
    public Integer getMailAddresses() {
        return this.mailAddresses;
    }

}
