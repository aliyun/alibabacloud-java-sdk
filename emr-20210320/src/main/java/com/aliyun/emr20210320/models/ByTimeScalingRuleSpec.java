// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ByTimeScalingRuleSpec extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("LaunchTime")
    public Long launchTime;

    @NameInMap("RecurrenceType")
    public String recurrenceType;

    @NameInMap("RecurrenceValue")
    public String recurrenceValue;

    public static ByTimeScalingRuleSpec build(java.util.Map<String, ?> map) throws Exception {
        ByTimeScalingRuleSpec self = new ByTimeScalingRuleSpec();
        return TeaModel.build(map, self);
    }

    public ByTimeScalingRuleSpec setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ByTimeScalingRuleSpec setLaunchTime(Long launchTime) {
        this.launchTime = launchTime;
        return this;
    }
    public Long getLaunchTime() {
        return this.launchTime;
    }

    public ByTimeScalingRuleSpec setRecurrenceType(String recurrenceType) {
        this.recurrenceType = recurrenceType;
        return this;
    }
    public String getRecurrenceType() {
        return this.recurrenceType;
    }

    public ByTimeScalingRuleSpec setRecurrenceValue(String recurrenceValue) {
        this.recurrenceValue = recurrenceValue;
        return this;
    }
    public String getRecurrenceValue() {
        return this.recurrenceValue;
    }

}
