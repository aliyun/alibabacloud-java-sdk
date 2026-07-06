// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreateScheduledScalingRuleShrinkRequest extends TeaModel {
    /**
     * <p>The duration (unit: minutes) of a scheduled elastic task.</p>
     * <blockquote>
     * <p>The parameter value must be at least 15 minutes.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("DurationMinutes")
    public Integer durationMinutes;

    /**
     * <p>Enables or disables the scheduled task policy. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enables the policy.</li>
     * <li><strong>false</strong>: Disables the policy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The time when the scheduled policy starts to execute.</p>
     * <p>For a one-time scheduling policy type, the start execution time must be more than 30 minutes later than the current time.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>To avoid the service from continuously executing upgrade and downgrade tasks, the time interval between different scheduled tasks must be at least 60 minutes.</p>
     * </notice>
     * 
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
     * <p>When ScheduleType is set to repeat, you need to fill in this parameter. Enumeration values are:</p>
     * <ul>
     * <li><p>Daily: Daily scheduled task.</p>
     * </li>
     * <li><p>Weekly: Weekly scheduled task.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Weekly</p>
     */
    @NameInMap("RepeatType")
    public String repeatType;

    /**
     * <p>The scheduled elastic reserved production specification (unit: MB/s).</p>
     * <blockquote>
     * <p>At least one of the ReservedPubFlow and ReservedSubFlow parameters must be higher than the current specification.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("ReservedPubFlow")
    public Integer reservedPubFlow;

    /**
     * <p>The scheduled elastic reserved consumption specification (unit: MB/s).</p>
     * <blockquote>
     * <p>At least one of the ReservedSubFlow and ReservedPubFlow parameters must be higher than the current specification.</p>
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
     * <p>The name cannot be the same as other rule names for the same instance.</p>
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
     * <li>at: Scheduled only once.</li>
     * <li>repeat: Scheduled repeatedly.</li>
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
     * <p>The weekly types. Supports execution on multiple days.</p>
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
