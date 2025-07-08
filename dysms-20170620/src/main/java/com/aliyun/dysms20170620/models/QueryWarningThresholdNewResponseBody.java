// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryWarningThresholdNewResponseBody extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("ContactPhone")
    public String contactPhone;

    @NameInMap("DailyHaltLimit")
    public Integer dailyHaltLimit;

    @NameInMap("DailyWarningLimit")
    public Integer dailyWarningLimit;

    @NameInMap("DomesticDailySuccess")
    public Long domesticDailySuccess;

    @NameInMap("DomesticDailyTotal")
    public Long domesticDailyTotal;

    @NameInMap("DomesticMonthlySuccess")
    public Long domesticMonthlySuccess;

    @NameInMap("DomesticMonthlyTotal")
    public Long domesticMonthlyTotal;

    @NameInMap("MonthlyHaltLimit")
    public Integer monthlyHaltLimit;

    @NameInMap("MonthlyWarningLimit")
    public Integer monthlyWarningLimit;

    @NameInMap("OutDailySuccess")
    public Long outDailySuccess;

    @NameInMap("OutDailyTotal")
    public Long outDailyTotal;

    @NameInMap("OutMonthlySuccess")
    public Long outMonthlySuccess;

    @NameInMap("OutMonthlyTotal")
    public Long outMonthlyTotal;

    @NameInMap("PrevWaringNotice")
    public Boolean prevWaringNotice;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryWarningThresholdNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryWarningThresholdNewResponseBody self = new QueryWarningThresholdNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryWarningThresholdNewResponseBody setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QueryWarningThresholdNewResponseBody setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }
    public String getContactPhone() {
        return this.contactPhone;
    }

    public QueryWarningThresholdNewResponseBody setDailyHaltLimit(Integer dailyHaltLimit) {
        this.dailyHaltLimit = dailyHaltLimit;
        return this;
    }
    public Integer getDailyHaltLimit() {
        return this.dailyHaltLimit;
    }

    public QueryWarningThresholdNewResponseBody setDailyWarningLimit(Integer dailyWarningLimit) {
        this.dailyWarningLimit = dailyWarningLimit;
        return this;
    }
    public Integer getDailyWarningLimit() {
        return this.dailyWarningLimit;
    }

    public QueryWarningThresholdNewResponseBody setDomesticDailySuccess(Long domesticDailySuccess) {
        this.domesticDailySuccess = domesticDailySuccess;
        return this;
    }
    public Long getDomesticDailySuccess() {
        return this.domesticDailySuccess;
    }

    public QueryWarningThresholdNewResponseBody setDomesticDailyTotal(Long domesticDailyTotal) {
        this.domesticDailyTotal = domesticDailyTotal;
        return this;
    }
    public Long getDomesticDailyTotal() {
        return this.domesticDailyTotal;
    }

    public QueryWarningThresholdNewResponseBody setDomesticMonthlySuccess(Long domesticMonthlySuccess) {
        this.domesticMonthlySuccess = domesticMonthlySuccess;
        return this;
    }
    public Long getDomesticMonthlySuccess() {
        return this.domesticMonthlySuccess;
    }

    public QueryWarningThresholdNewResponseBody setDomesticMonthlyTotal(Long domesticMonthlyTotal) {
        this.domesticMonthlyTotal = domesticMonthlyTotal;
        return this;
    }
    public Long getDomesticMonthlyTotal() {
        return this.domesticMonthlyTotal;
    }

    public QueryWarningThresholdNewResponseBody setMonthlyHaltLimit(Integer monthlyHaltLimit) {
        this.monthlyHaltLimit = monthlyHaltLimit;
        return this;
    }
    public Integer getMonthlyHaltLimit() {
        return this.monthlyHaltLimit;
    }

    public QueryWarningThresholdNewResponseBody setMonthlyWarningLimit(Integer monthlyWarningLimit) {
        this.monthlyWarningLimit = monthlyWarningLimit;
        return this;
    }
    public Integer getMonthlyWarningLimit() {
        return this.monthlyWarningLimit;
    }

    public QueryWarningThresholdNewResponseBody setOutDailySuccess(Long outDailySuccess) {
        this.outDailySuccess = outDailySuccess;
        return this;
    }
    public Long getOutDailySuccess() {
        return this.outDailySuccess;
    }

    public QueryWarningThresholdNewResponseBody setOutDailyTotal(Long outDailyTotal) {
        this.outDailyTotal = outDailyTotal;
        return this;
    }
    public Long getOutDailyTotal() {
        return this.outDailyTotal;
    }

    public QueryWarningThresholdNewResponseBody setOutMonthlySuccess(Long outMonthlySuccess) {
        this.outMonthlySuccess = outMonthlySuccess;
        return this;
    }
    public Long getOutMonthlySuccess() {
        return this.outMonthlySuccess;
    }

    public QueryWarningThresholdNewResponseBody setOutMonthlyTotal(Long outMonthlyTotal) {
        this.outMonthlyTotal = outMonthlyTotal;
        return this;
    }
    public Long getOutMonthlyTotal() {
        return this.outMonthlyTotal;
    }

    public QueryWarningThresholdNewResponseBody setPrevWaringNotice(Boolean prevWaringNotice) {
        this.prevWaringNotice = prevWaringNotice;
        return this;
    }
    public Boolean getPrevWaringNotice() {
        return this.prevWaringNotice;
    }

    public QueryWarningThresholdNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
