// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class UpdateOperationEventScheduleTimeRequest extends TeaModel {
    /**
     * <p>The ID of the event.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2034449120420339713</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <p>The scheduled execution time. The format is YYYY-MM-DD HH:mm:ss, and the time zone is UTC+8.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-08-23 14:55:00</p>
     */
    @NameInMap("scheduleTime")
    public String scheduleTime;

    public static UpdateOperationEventScheduleTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOperationEventScheduleTimeRequest self = new UpdateOperationEventScheduleTimeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOperationEventScheduleTimeRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateOperationEventScheduleTimeRequest setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
        return this;
    }
    public String getScheduleTime() {
        return this.scheduleTime;
    }

}
