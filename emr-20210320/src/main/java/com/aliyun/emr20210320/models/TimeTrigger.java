// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class TimeTrigger extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("LaunchExpirationTime")
    public Integer launchExpirationTime;

    @NameInMap("LaunchTime")
    public Long launchTime;

    @NameInMap("RecurrenceType")
    public String recurrenceType;

    @NameInMap("RecurrenceValue")
    public String recurrenceValue;

    public static TimeTrigger build(java.util.Map<String, ?> map) throws Exception {
        TimeTrigger self = new TimeTrigger();
        return TeaModel.build(map, self);
    }

    public TimeTrigger setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public TimeTrigger setLaunchExpirationTime(Integer launchExpirationTime) {
        this.launchExpirationTime = launchExpirationTime;
        return this;
    }
    public Integer getLaunchExpirationTime() {
        return this.launchExpirationTime;
    }

    public TimeTrigger setLaunchTime(Long launchTime) {
        this.launchTime = launchTime;
        return this;
    }
    public Long getLaunchTime() {
        return this.launchTime;
    }

    public TimeTrigger setRecurrenceType(String recurrenceType) {
        this.recurrenceType = recurrenceType;
        return this;
    }
    public String getRecurrenceType() {
        return this.recurrenceType;
    }

    public TimeTrigger setRecurrenceValue(String recurrenceValue) {
        this.recurrenceValue = recurrenceValue;
        return this;
    }
    public String getRecurrenceValue() {
        return this.recurrenceValue;
    }

}
