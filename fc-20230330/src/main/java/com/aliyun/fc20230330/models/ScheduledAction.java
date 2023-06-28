// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ScheduledAction extends TeaModel {
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

}
