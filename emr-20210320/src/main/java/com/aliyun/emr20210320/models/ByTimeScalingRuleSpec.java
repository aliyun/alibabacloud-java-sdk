// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ByTimeScalingRuleSpec extends TeaModel {
    /**
     * <p>重复执行定时任务的结束时间戳。单位为毫秒。</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>启动时间戳。单位为毫秒。</p>
     */
    @NameInMap("LaunchTime")
    public Long launchTime;

    /**
     * <p>指定时间规则的执行类型。</p>
     */
    @NameInMap("RecurrenceType")
    public String recurrenceType;

    /**
     * <p>重复执行定时任务的数值。具体取值取决于 recurrenceType 设置。</p>
     */
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
