// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateMmsTimerRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Daily</p>
     */
    @NameInMap("scheduleType")
    public String scheduleType;

    @NameInMap("stopped")
    public Boolean stopped;

    /**
     * <strong>example:</strong>
     * <p>2025-09-20</p>
     */
    @NameInMap("value")
    public String value;

    public static UpdateMmsTimerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMmsTimerRequest self = new UpdateMmsTimerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMmsTimerRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

    public UpdateMmsTimerRequest setStopped(Boolean stopped) {
        this.stopped = stopped;
        return this;
    }
    public Boolean getStopped() {
        return this.stopped;
    }

    public UpdateMmsTimerRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
