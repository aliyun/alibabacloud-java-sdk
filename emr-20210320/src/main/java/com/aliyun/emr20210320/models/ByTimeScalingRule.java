// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ByTimeScalingRule extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("LaunchTime")
    public Long launchTime;

    @NameInMap("RecurrenceType")
    public String recurrenceType;

    @NameInMap("RecurrenceValue")
    public String recurrenceValue;

    public static ByTimeScalingRule build(java.util.Map<String, ?> map) throws Exception {
        ByTimeScalingRule self = new ByTimeScalingRule();
        return TeaModel.build(map, self);
    }

    public ByTimeScalingRule setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ByTimeScalingRule setLaunchTime(Long launchTime) {
        this.launchTime = launchTime;
        return this;
    }
    public Long getLaunchTime() {
        return this.launchTime;
    }

    public ByTimeScalingRule setRecurrenceType(String recurrenceType) {
        this.recurrenceType = recurrenceType;
        return this;
    }
    public String getRecurrenceType() {
        return this.recurrenceType;
    }

    public ByTimeScalingRule setRecurrenceValue(String recurrenceValue) {
        this.recurrenceValue = recurrenceValue;
        return this;
    }
    public String getRecurrenceValue() {
        return this.recurrenceValue;
    }

}
