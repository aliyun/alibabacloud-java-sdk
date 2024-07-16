// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DescAccountSummaryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("DailyQuota")
    public Integer dailyQuota;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DayuStatus")
    public Integer dayuStatus;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Domains")
    public Integer domains;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("EnableTimes")
    public Integer enableTimes;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MailAddresses")
    public Integer mailAddresses;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxQuotaLevel")
    public Integer maxQuotaLevel;

    /**
     * <strong>example:</strong>
     * <p>60000</p>
     */
    @NameInMap("MonthQuota")
    public Integer monthQuota;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("QuotaLevel")
    public Integer quotaLevel;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Receivers")
    public Integer receivers;

    @NameInMap("RemainFreeQuota")
    public Integer remainFreeQuota;

    /**
     * <strong>example:</strong>
     * <p>82B295BB-7E69-491F-9896-ECEAFF09E1A4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SmsRecord")
    public Integer smsRecord;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SmsSign")
    public Integer smsSign;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SmsTemplates")
    public Integer smsTemplates;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Tags")
    public Integer tags;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Templates")
    public Integer templates;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("UserStatus")
    public Integer userStatus;

    public static DescAccountSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescAccountSummaryResponseBody self = new DescAccountSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescAccountSummaryResponseBody setDailyQuota(Integer dailyQuota) {
        this.dailyQuota = dailyQuota;
        return this;
    }
    public Integer getDailyQuota() {
        return this.dailyQuota;
    }

    public DescAccountSummaryResponseBody setDayuStatus(Integer dayuStatus) {
        this.dayuStatus = dayuStatus;
        return this;
    }
    public Integer getDayuStatus() {
        return this.dayuStatus;
    }

    public DescAccountSummaryResponseBody setDomains(Integer domains) {
        this.domains = domains;
        return this;
    }
    public Integer getDomains() {
        return this.domains;
    }

    public DescAccountSummaryResponseBody setEnableTimes(Integer enableTimes) {
        this.enableTimes = enableTimes;
        return this;
    }
    public Integer getEnableTimes() {
        return this.enableTimes;
    }

    public DescAccountSummaryResponseBody setMailAddresses(Integer mailAddresses) {
        this.mailAddresses = mailAddresses;
        return this;
    }
    public Integer getMailAddresses() {
        return this.mailAddresses;
    }

    public DescAccountSummaryResponseBody setMaxQuotaLevel(Integer maxQuotaLevel) {
        this.maxQuotaLevel = maxQuotaLevel;
        return this;
    }
    public Integer getMaxQuotaLevel() {
        return this.maxQuotaLevel;
    }

    public DescAccountSummaryResponseBody setMonthQuota(Integer monthQuota) {
        this.monthQuota = monthQuota;
        return this;
    }
    public Integer getMonthQuota() {
        return this.monthQuota;
    }

    public DescAccountSummaryResponseBody setQuotaLevel(Integer quotaLevel) {
        this.quotaLevel = quotaLevel;
        return this;
    }
    public Integer getQuotaLevel() {
        return this.quotaLevel;
    }

    public DescAccountSummaryResponseBody setReceivers(Integer receivers) {
        this.receivers = receivers;
        return this;
    }
    public Integer getReceivers() {
        return this.receivers;
    }

    public DescAccountSummaryResponseBody setRemainFreeQuota(Integer remainFreeQuota) {
        this.remainFreeQuota = remainFreeQuota;
        return this;
    }
    public Integer getRemainFreeQuota() {
        return this.remainFreeQuota;
    }

    public DescAccountSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescAccountSummaryResponseBody setSmsRecord(Integer smsRecord) {
        this.smsRecord = smsRecord;
        return this;
    }
    public Integer getSmsRecord() {
        return this.smsRecord;
    }

    public DescAccountSummaryResponseBody setSmsSign(Integer smsSign) {
        this.smsSign = smsSign;
        return this;
    }
    public Integer getSmsSign() {
        return this.smsSign;
    }

    public DescAccountSummaryResponseBody setSmsTemplates(Integer smsTemplates) {
        this.smsTemplates = smsTemplates;
        return this;
    }
    public Integer getSmsTemplates() {
        return this.smsTemplates;
    }

    public DescAccountSummaryResponseBody setTags(Integer tags) {
        this.tags = tags;
        return this;
    }
    public Integer getTags() {
        return this.tags;
    }

    public DescAccountSummaryResponseBody setTemplates(Integer templates) {
        this.templates = templates;
        return this;
    }
    public Integer getTemplates() {
        return this.templates;
    }

    public DescAccountSummaryResponseBody setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
        return this;
    }
    public Integer getUserStatus() {
        return this.userStatus;
    }

}
