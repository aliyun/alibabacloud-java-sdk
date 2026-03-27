// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleTimeSpan extends TeaModel {
    /**
     * <p>Day of the week.</p>
     */
    @NameInMap("dayOfWeek")
    public java.util.List<Integer> dayOfWeek;

    /**
     * <p>End time, in HH:mm format.</p>
     * 
     * <strong>example:</strong>
     * <p>23:00</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>Default time zone is Beijing Time: +0800.</p>
     * 
     * <strong>example:</strong>
     * <p>+0800</p>
     */
    @NameInMap("gmtOffset")
    public String gmtOffset;

    /**
     * <p>Start time, in HH:mm format.</p>
     * 
     * <strong>example:</strong>
     * <p>09:00</p>
     */
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
