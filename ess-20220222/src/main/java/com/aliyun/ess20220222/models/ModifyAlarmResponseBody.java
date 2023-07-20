// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ModifyAlarmResponseBody extends TeaModel {
    /**
     * <p>The ID of the event-triggered task.</p>
     */
    @NameInMap("AlarmTaskId")
    public String alarmTaskId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAlarmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAlarmResponseBody self = new ModifyAlarmResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAlarmResponseBody setAlarmTaskId(String alarmTaskId) {
        this.alarmTaskId = alarmTaskId;
        return this;
    }
    public String getAlarmTaskId() {
        return this.alarmTaskId;
    }

    public ModifyAlarmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
