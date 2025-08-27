// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ScheduledPolicy extends TeaModel {
    @NameInMap("endTime")
    public String endTime;

    @NameInMap("name")
    public String name;

    @NameInMap("scheduleExpression")
    public String scheduleExpression;

    @NameInMap("startTime")
    public String startTime;

    @NameInMap("target")
    public Long target;

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
