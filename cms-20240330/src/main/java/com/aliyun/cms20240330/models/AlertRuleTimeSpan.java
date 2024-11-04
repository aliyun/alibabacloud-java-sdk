// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleTimeSpan extends TeaModel {
    @NameInMap("dayOfWeek")
    public java.util.List<Integer> dayOfWeek;

    @NameInMap("endTime")
    public String endTime;

    @NameInMap("gmtOffset")
    public String gmtOffset;

    @NameInMap("startTime")
    public String startTime;

    public static AlertRuleTimeSpan build(java.util.Map<String, ?> map) throws Exception {
        AlertRuleTimeSpan self = new AlertRuleTimeSpan();
        return TeaModel.build(map, self);
    }

    public AlertRuleTimeSpan setDayOfWeek(java.util.List<Integer> dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }
    public java.util.List<Integer> getDayOfWeek() {
        return this.dayOfWeek;
    }

    public AlertRuleTimeSpan setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public AlertRuleTimeSpan setGmtOffset(String gmtOffset) {
        this.gmtOffset = gmtOffset;
        return this;
    }
    public String getGmtOffset() {
        return this.gmtOffset;
    }

    public AlertRuleTimeSpan setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
