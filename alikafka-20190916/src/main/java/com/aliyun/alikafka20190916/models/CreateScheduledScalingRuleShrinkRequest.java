// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreateScheduledScalingRuleShrinkRequest extends TeaModel {
    /**
     * <p>The duration of each scheduled scaling task. Unit: minutes.</p>
     * <blockquote>
     * <p> The value of this parameter must be greater than or equal to 15.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("DurationMinutes")
    public Integer durationMinutes;

    /**
     * <p>Specifies whether to enable the scheduled scaling rule. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The time when the scheduled scaling task is executed.</p>
     * <p>If you set ScheduleType to at, make sure that the value of this parameter is at least 30 minutes later than the current point in time.</p>
     * <blockquote>
     * <p>Notice: To prevent the broker from repeatedly executing instance upgrade and downgrade tasks, make sure that the interval between two consecutive scheduled scaling tasks is at least 60 minutes.</p>
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
     * <p>The ID of the region where the instance resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The frequency to execute the scheduled scaling task. This parameter is required only if you set ScheduleType to repeat. Valid values:</p>
     * <ul>
     * <li><p>Daily: The scheduled scaling task is executed every day.</p>
     * </li>
     * <li><p>Weekly: The scheduled scaling task is executed every week.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Weekly</p>
     */
    @NameInMap("RepeatType")
    public String repeatType;

    /**
     * <p>The reserved production capacity for scheduled scaling. Unit: MB/s.</p>
     * <blockquote>
     * <p> You must specify a higher value than the instance specification for at least one of ReservedPubFlow and ReservedSubFlow.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("ReservedPubFlow")
    public Integer reservedPubFlow;

    /**
     * <p>The reserved consumption capacity for scheduled scaling. Unit: MB/s.</p>
     * <blockquote>
     * <p> You must specify a higher value than the instance specification for at least one of ReservedPubFlow and ReservedSubFlow.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("ReservedSubFlow")
    public Integer reservedSubFlow;

    /**
     * <p>The name of the scheduled scaling rule.</p>
     * <blockquote>
     * <p> The name of the scheduled scaling rule cannot be the same as the names of other rules for the instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The type of the scheduled scaling task. Valid values:</p>
     * <ul>
     * <li>at: The scheduled scaling task is executed only once.</li>
     * <li>repeat: The scheduled scaling task is repeatedly executed.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>at</p>
     */
    @NameInMap("ScheduleType")
    public String scheduleType;

    /**
     * <p>The time zone in Coordinated Universal Time (UTC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GMT+8</p>
     */
    @NameInMap("TimeZone")
    public String timeZone;

    /**
     * <p>The day on which the scheduled scaling task is executed every week. You can specify multiple days.</p>
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
