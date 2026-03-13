// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ScheduledPolicy extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1633449590000</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>student_app_shop_analyzer</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>。</p>
     */
    @NameInMap("scheduleExpression")
    public String scheduleExpression;

    /**
     * <strong>example:</strong>
     * <p>1764432000000</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("target")
    public Long target;

    /**
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
