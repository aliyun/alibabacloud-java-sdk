// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ScheduledAction extends TeaModel {
    /**
     * <p>The time when the policy expires.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-03-10T10:10:10Z</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>The policy name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_1</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The schedule expression.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cron(0 0 22 * * *)</p>
     */
    @NameInMap("scheduleExpression")
    public String scheduleExpression;

    /**
     * <p>The time when the policy takes effect.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-03-10T10:10:10Z</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <p>The number of target provisioned instances.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("target")
    public Long target;

    /**
     * <p>The time zone. If the time zone parameter is empty, the value of startTime, endTime, and scheduleExpression must be in UTC format.</p>
     * 
     * <strong>example:</strong>
     * <p>Asia/Shanghai</p>
     */
    @NameInMap("timeZone")
    public String timeZone;

    public static ScheduledAction build(java.util.Map<String, ?> map) throws Exception {
        ScheduledAction self = new ScheduledAction();
        return TeaModel.build(map, self);
    }

    public ScheduledAction setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ScheduledAction setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ScheduledAction setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
        return this;
    }
    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    public ScheduledAction setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ScheduledAction setTarget(Long target) {
        this.target = target;
        return this;
    }
    public Long getTarget() {
        return this.target;
    }

    public ScheduledAction setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

}
