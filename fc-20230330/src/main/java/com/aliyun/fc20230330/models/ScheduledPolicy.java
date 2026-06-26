// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ScheduledPolicy extends TeaModel {
    /**
     * <p>The end time.</p>
     * 
     * <strong>example:</strong>
     * <p>1633449590000</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>The policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>student_app_shop_analyzer</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The schedule configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>。</p>
     */
    @NameInMap("scheduleExpression")
    public String scheduleExpression;

    /**
     * <p>The start time.</p>
     * 
     * <strong>example:</strong>
     * <p>1764432000000</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <p>The current number of target resources. If a metric-based auto scaling policy or a scheduled policy is in effect, this parameter specifies the number of resources calculated by the policy. Otherwise, this parameter specifies the default number of provisioned instances.</p>
     * <blockquote>
     * <p>How is this different from defaultTarget?<br>
     * Assume that you set the number of provisioned instances to 1 and then add a scheduled auto scaling policy to set the number to 5 for a specific time period.<br></p>
     * <ul>
     * <li><p>When the scheduled policy is active, target is 5 and defaultTarget is 1.</p>
     * </li>
     * <li><p>When the scheduled policy is inactive, both target and defaultTarget are 1.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("target")
    public Long target;

    /**
     * <p>The time zone. If this parameter is left empty, the times for startTime, endTime, and scheduleExpression must be in UTC format.</p>
     * 
     * <strong>example:</strong>
     * <p>。</p>
     */
    @NameInMap("timeZone")
    public String timeZone;

    public static ScheduledPolicy build(java.util.Map<String, ?> map) throws Exception {
        ScheduledPolicy self = new ScheduledPolicy();
        return TeaModel.build(map, self);
    }

    public ScheduledPolicy setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ScheduledPolicy setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ScheduledPolicy setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
        return this;
    }
    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    public ScheduledPolicy setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ScheduledPolicy setTarget(Long target) {
        this.target = target;
        return this;
    }
    public Long getTarget() {
        return this.target;
    }

    public ScheduledPolicy setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

}
