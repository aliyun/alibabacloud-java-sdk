// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateCmsOrderRequest extends TeaModel {
    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("SuggestType")
    public String suggestType;

    @NameInMap("ApiCount")
    public String apiCount;

    @NameInMap("SiteOperatorNum")
    public String siteOperatorNum;

    @NameInMap("EventStoreTime")
    public String eventStoreTime;

    @NameInMap("LogMonitorStream")
    public String logMonitorStream;

    @NameInMap("SiteTaskNum")
    public String siteTaskNum;

    @NameInMap("EventStoreNum")
    public String eventStoreNum;

    @NameInMap("SiteEcsNum")
    public String siteEcsNum;

    @NameInMap("CustomTimeSeries")
    public String customTimeSeries;

    @NameInMap("SmsCount")
    public String smsCount;

    @NameInMap("PhoneCount")
    public String phoneCount;

    public static CreateCmsOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCmsOrderRequest self = new CreateCmsOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateCmsOrderRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateCmsOrderRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateCmsOrderRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public CreateCmsOrderRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateCmsOrderRequest setAutoUseCoupon(Boolean autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public CreateCmsOrderRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateCmsOrderRequest setSuggestType(String suggestType) {
        this.suggestType = suggestType;
        return this;
    }
    public String getSuggestType() {
        return this.suggestType;
    }

    public CreateCmsOrderRequest setApiCount(String apiCount) {
        this.apiCount = apiCount;
        return this;
    }
    public String getApiCount() {
        return this.apiCount;
    }

    public CreateCmsOrderRequest setSiteOperatorNum(String siteOperatorNum) {
        this.siteOperatorNum = siteOperatorNum;
        return this;
    }
    public String getSiteOperatorNum() {
        return this.siteOperatorNum;
    }

    public CreateCmsOrderRequest setEventStoreTime(String eventStoreTime) {
        this.eventStoreTime = eventStoreTime;
        return this;
    }
    public String getEventStoreTime() {
        return this.eventStoreTime;
    }

    public CreateCmsOrderRequest setLogMonitorStream(String logMonitorStream) {
        this.logMonitorStream = logMonitorStream;
        return this;
    }
    public String getLogMonitorStream() {
        return this.logMonitorStream;
    }

    public CreateCmsOrderRequest setSiteTaskNum(String siteTaskNum) {
        this.siteTaskNum = siteTaskNum;
        return this;
    }
    public String getSiteTaskNum() {
        return this.siteTaskNum;
    }

    public CreateCmsOrderRequest setEventStoreNum(String eventStoreNum) {
        this.eventStoreNum = eventStoreNum;
        return this;
    }
    public String getEventStoreNum() {
        return this.eventStoreNum;
    }

    public CreateCmsOrderRequest setSiteEcsNum(String siteEcsNum) {
        this.siteEcsNum = siteEcsNum;
        return this;
    }
    public String getSiteEcsNum() {
        return this.siteEcsNum;
    }

    public CreateCmsOrderRequest setCustomTimeSeries(String customTimeSeries) {
        this.customTimeSeries = customTimeSeries;
        return this;
    }
    public String getCustomTimeSeries() {
        return this.customTimeSeries;
    }

    public CreateCmsOrderRequest setSmsCount(String smsCount) {
        this.smsCount = smsCount;
        return this;
    }
    public String getSmsCount() {
        return this.smsCount;
    }

    public CreateCmsOrderRequest setPhoneCount(String phoneCount) {
        this.phoneCount = phoneCount;
        return this;
    }
    public String getPhoneCount() {
        return this.phoneCount;
    }

}
