// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreateScheduledScalingRuleShrinkRequest extends TeaModel {
    /**
     * <p>The duration (unit: minutes) of a single scheduled elastic scaling task.</p>
     * <blockquote>
     * <p>The value must be at least 15 minutes.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("DurationMinutes")
    public Integer durationMinutes;

    /**
     * <p>Specifies whether to enable or disable the scheduled policy. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enabled.</li>
     * <li><strong>false</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The time when the scheduled policy starts to take effect.</p>
     * <p>If the schedule type is single execution, the start time must be at least 30 minutes later than the current time.</p>
     * <blockquote>
     * <p>Notice: To prevent the server from continuously performing scale-up and scale-down tasks, the interval between different scheduled tasks must be at least 60 minutes.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1714467540000</p>
     */
    @NameInMap("FirstScheduledTime")
    public Long firstScheduledTime;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_serverless-cn-vxxxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The repeat type. This parameter is required when ScheduleType is set to repeat. Valid values:
     *       <li> Daily: timed scheduling every day.
     *       <li> Weekly: timed scheduling every week.</p>
     * 
     * <strong>example:</strong>
     * <p>Weekly</p>
     */
    @NameInMap("RepeatType")
    public String repeatType;

    /**
     * <p>The reserved production specification for scheduled elastic scaling (unit: MB/s).</p>
     * <blockquote>
     * <p>At least one of ReservedPubFlow and ReservedSubFlow must be higher than the current specification.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("ReservedPubFlow")
    public Integer reservedPubFlow;

    /**
     * <p>The reserved consumption specification for scheduled elastic scaling (unit: MB/s).</p>
     * <blockquote>
     * <p>At least one of ReservedSubFlow and ReservedPubFlow must be higher than the current specification.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("ReservedSubFlow")
    public Integer reservedSubFlow;

    /**
     * <p>The name of the scheduled policy rule.</p>
     * <blockquote>
     * <p>The name must be unique among all rules of the same instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The schedule type. Valid values:</p>
     * <ul>
     * <li><p>at: scheduled once only.</p>
     * </li>
     * <li><p>repeat: scheduled repeatedly.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>at</p>
     */
    @NameInMap("ScheduleType")
    public String scheduleType;

    /**
     * <p>The time zone (Coordinated Universal Time).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GMT+8</p>
     */
    @NameInMap("TimeZone")
    public String timeZone;

    /**
     * <p>The days of the week. Multiple days are supported for repeated execution.</p>
     */
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
