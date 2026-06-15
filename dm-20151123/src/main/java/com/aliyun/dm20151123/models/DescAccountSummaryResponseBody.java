// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DescAccountSummaryResponseBody extends TeaModel {
    /**
     * <p>The daily quota.</p>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("DailyQuota")
    public Integer dailyQuota;

    /**
     * <p>The remaining daily free quota.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DailyRemainFreeQuota")
    public Integer dailyRemainFreeQuota;

    /**
     * <p>The status of Dayu. This parameter is deprecated and retained for compatibility.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DayuStatus")
    public Integer dayuStatus;

    /**
     * <p>The number of domain names.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Domains")
    public Integer domains;

    /**
     * <p>The effective period.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("EnableTimes")
    public Integer enableTimes;

    /**
     * <p>The type of the outbound IP channel.</p>
     * <ol>
     * <li><p>backup: A backup IP channel that is not actively maintained. Customers using this channel are advised to purchase a dedicated IP for better stability.</p>
     * </li>
     * <li><p>normal: A normal IP channel that is continuously maintained by the email delivery team to ensure stable and reliable service.</p>
     * </li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("IpChannelType")
    public String ipChannelType;

    /**
     * <p>The number of sender addresses.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MailAddresses")
    public Integer mailAddresses;

    /**
     * <p>The maximum reputation level.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxQuotaLevel")
    public Integer maxQuotaLevel;

    /**
     * <p>The monthly quota.</p>
     * 
     * <strong>example:</strong>
     * <p>60000</p>
     */
    @NameInMap("MonthQuota")
    public Integer monthQuota;

    /**
     * <p>The reputation level.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("QuotaLevel")
    public Integer quotaLevel;

    /**
     * <p>The number of recipients.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Receivers")
    public Integer receivers;

    /**
     * <p>The remaining free quota.</p>
     * 
     * <strong>example:</strong>
     * <p>1910</p>
     */
    @NameInMap("RemainFreeQuota")
    public Integer remainFreeQuota;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>82B295BB-7E69-491F-9896-ECEAFF09E1A4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>This parameter is deprecated. It is retained for compatibility.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SmsRecord")
    public Integer smsRecord;

    /**
     * <p>This parameter is deprecated. It is retained for compatibility.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SmsSign")
    public Integer smsSign;

    /**
     * <p>This parameter is deprecated. It is retained for compatibility.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SmsTemplates")
    public Integer smsTemplates;

    /**
     * <p>The number of tags.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Tags")
    public Integer tags;

    /**
     * <p>The number of templates.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Templates")
    public Integer templates;

    /**
     * <p>The status of the user. Valid values: 0: Normal. 1: Freeze. 2: Overdue payment. 4: Outbound messages are restricted. 8: The user is logically deleted.</p>
     * 
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

    public DescAccountSummaryResponseBody setDailyRemainFreeQuota(Integer dailyRemainFreeQuota) {
        this.dailyRemainFreeQuota = dailyRemainFreeQuota;
        return this;
    }
    public Integer getDailyRemainFreeQuota() {
        return this.dailyRemainFreeQuota;
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

    public DescAccountSummaryResponseBody setIpChannelType(String ipChannelType) {
        this.ipChannelType = ipChannelType;
        return this;
    }
    public String getIpChannelType() {
        return this.ipChannelType;
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
