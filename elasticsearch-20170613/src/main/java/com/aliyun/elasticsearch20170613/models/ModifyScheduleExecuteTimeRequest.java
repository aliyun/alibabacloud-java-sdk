// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ModifyScheduleExecuteTimeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>eb7efbc90864a0***</p>
     */
    @NameInMap("eventId")
    public String eventId;

    /**
     * <strong>example:</strong>
     * <p>2026-01-30T08:45:00Z</p>
     */
    @NameInMap("scheduleExecuteTime")
    public String scheduleExecuteTime;

    public static ModifyScheduleExecuteTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyScheduleExecuteTimeRequest self = new ModifyScheduleExecuteTimeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyScheduleExecuteTimeRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public ModifyScheduleExecuteTimeRequest setScheduleExecuteTime(String scheduleExecuteTime) {
        this.scheduleExecuteTime = scheduleExecuteTime;
        return this;
    }
    public String getScheduleExecuteTime() {
        return this.scheduleExecuteTime;
    }

}
