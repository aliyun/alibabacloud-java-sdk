// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class ModifyAlarmResponseBody extends TeaModel {
    @NameInMap("AlarmTaskId")
    public String alarmTaskId;

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
