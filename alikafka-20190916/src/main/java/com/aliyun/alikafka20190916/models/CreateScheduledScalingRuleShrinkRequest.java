// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreateScheduledScalingRuleShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DurationMinutes")
    public Integer durationMinutes;

    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FirstScheduledTime")
    public Long firstScheduledTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RepeatType")
    public String repeatType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ReservedPubFlow")
    public Integer reservedPubFlow;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ReservedSubFlow")
    public Integer reservedSubFlow;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ScheduleType")
    public String scheduleType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TimeZone")
    public String timeZone;

    @NameInMap("WeeklyTypes")
    public String weeklyTypesShrink;

    public static CreateScheduledScalingRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduledScalingRuleShrinkRequest self = new CreateScheduledScalingRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateScheduledScalingRuleShrinkRequest setDurationMinutes(Integer durationMinutes) {
        this.durationMinutes = durationMinutes;
        return this;
    }
    public Integer getDurationMinutes() {
        return this.durationMinutes;
    }

    public CreateScheduledScalingRuleShrinkRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public CreateScheduledScalingRuleShrinkRequest setFirstScheduledTime(Long firstScheduledTime) {
        this.firstScheduledTime = firstScheduledTime;
        return this;
    }
    public Long getFirstScheduledTime() {
        return this.firstScheduledTime;
    }

    public CreateScheduledScalingRuleShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateScheduledScalingRuleShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateScheduledScalingRuleShrinkRequest setRepeatType(String repeatType) {
        this.repeatType = repeatType;
        return this;
    }
    public String getRepeatType() {
        return this.repeatType;
    }

    public CreateScheduledScalingRuleShrinkRequest setReservedPubFlow(Integer reservedPubFlow) {
        this.reservedPubFlow = reservedPubFlow;
        return this;
    }
    public Integer getReservedPubFlow() {
        return this.reservedPubFlow;
    }

    public CreateScheduledScalingRuleShrinkRequest setReservedSubFlow(Integer reservedSubFlow) {
        this.reservedSubFlow = reservedSubFlow;
        return this;
    }
    public Integer getReservedSubFlow() {
        return this.reservedSubFlow;
    }

    public CreateScheduledScalingRuleShrinkRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateScheduledScalingRuleShrinkRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

    public CreateScheduledScalingRuleShrinkRequest setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

    public CreateScheduledScalingRuleShrinkRequest setWeeklyTypesShrink(String weeklyTypesShrink) {
        this.weeklyTypesShrink = weeklyTypesShrink;
        return this;
    }
    public String getWeeklyTypesShrink() {
        return this.weeklyTypesShrink;
    }

}
