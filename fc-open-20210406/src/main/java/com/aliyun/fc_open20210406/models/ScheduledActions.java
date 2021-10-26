// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ScheduledActions extends TeaModel {
    // endTime
    @NameInMap("endTime")
    public String endTime;

    // name
    @NameInMap("name")
    public String name;

    // scheduleExpression
    @NameInMap("scheduleExpression")
    public String scheduleExpression;

    // startTime
    @NameInMap("startTime")
    public String startTime;

    // target
    @NameInMap("target")
    public Long target;

    public static ScheduledActions build(java.util.Map<String, ?> map) throws Exception {
        ScheduledActions self = new ScheduledActions();
        return TeaModel.build(map, self);
    }

    public ScheduledActions setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ScheduledActions setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ScheduledActions setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
        return this;
    }
    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    public ScheduledActions setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ScheduledActions setTarget(Long target) {
        this.target = target;
        return this;
    }
    public Long getTarget() {
        return this.target;
    }

}
