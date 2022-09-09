// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DeleteAlarmResponseBody extends TeaModel {
    @NameInMap("AlarmTaskId")
    public String alarmTaskId;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAlarmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlarmResponseBody self = new DeleteAlarmResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAlarmResponseBody setAlarmTaskId(String alarmTaskId) {
        this.alarmTaskId = alarmTaskId;
        return this;
    }
    public String getAlarmTaskId() {
        return this.alarmTaskId;
    }

    public DeleteAlarmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
