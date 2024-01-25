// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateReportSubscriptionRequest extends TeaModel {
    @NameInMap("DayOfWeek")
    public Integer dayOfWeek;

    @NameInMap("HourOfDay")
    public Integer hourOfDay;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("ReportName")
    public String reportName;

    @NameInMap("Subscribe")
    public Integer subscribe;

    public static UpdateReportSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateReportSubscriptionRequest self = new UpdateReportSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateReportSubscriptionRequest setDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }
    public Integer getDayOfWeek() {
        return this.dayOfWeek;
    }

    public UpdateReportSubscriptionRequest setHourOfDay(Integer hourOfDay) {
        this.hourOfDay = hourOfDay;
        return this;
    }
    public Integer getHourOfDay() {
        return this.hourOfDay;
    }

    public UpdateReportSubscriptionRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public UpdateReportSubscriptionRequest setReportName(String reportName) {
        this.reportName = reportName;
        return this;
    }
    public String getReportName() {
        return this.reportName;
    }

    public UpdateReportSubscriptionRequest setSubscribe(Integer subscribe) {
        this.subscribe = subscribe;
        return this;
    }
    public Integer getSubscribe() {
        return this.subscribe;
    }

}
