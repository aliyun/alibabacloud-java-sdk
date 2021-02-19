// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DeleteAlarmResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AlarmTaskId")
    public String alarmTaskId;

    public static DeleteAlarmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlarmResponseBody self = new DeleteAlarmResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAlarmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteAlarmResponseBody setAlarmTaskId(String alarmTaskId) {
        this.alarmTaskId = alarmTaskId;
        return this;
    }
    public String getAlarmTaskId() {
        return this.alarmTaskId;
    }

}
