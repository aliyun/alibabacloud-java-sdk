// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class EffectTimeRange extends TeaModel {
    /**
     * <p>The values 0 to 6 indicate Sunday to Saturday.</p>
     */
    @NameInMap("dayInWeek")
    public java.util.List<Integer> dayInWeek;

    /**
     * <p>The end time in minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>1080</p>
     */
    @NameInMap("endTimeInMinute")
    public Integer endTimeInMinute;

    /**
     * <p>The start time in minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>360</p>
     */
    @NameInMap("startTimeInMinute")
    public Integer startTimeInMinute;

    /**
     * <p>The time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;Asia/Shanghai&quot;</p>
     */
    @NameInMap("timeZone")
    public String timeZone;

    public static EffectTimeRange build(java.util.Map<String, ?> map) throws Exception {
        EffectTimeRange self = new EffectTimeRange();
        return TeaModel.build(map, self);
    }

    public EffectTimeRange setDayInWeek(java.util.List<Integer> dayInWeek) {
        this.dayInWeek = dayInWeek;
        return this;
    }
    public java.util.List<Integer> getDayInWeek() {
        return this.dayInWeek;
    }

    public EffectTimeRange setEndTimeInMinute(Integer endTimeInMinute) {
        this.endTimeInMinute = endTimeInMinute;
        return this;
    }
    public Integer getEndTimeInMinute() {
        return this.endTimeInMinute;
    }

    public EffectTimeRange setStartTimeInMinute(Integer startTimeInMinute) {
        this.startTimeInMinute = startTimeInMinute;
        return this;
    }
    public Integer getStartTimeInMinute() {
        return this.startTimeInMinute;
    }

    public EffectTimeRange setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

}
