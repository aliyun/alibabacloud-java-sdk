// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class CreateAlarmResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AlarmTaskId")
    public String alarmTaskId;

    public static CreateAlarmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAlarmResponseBody self = new CreateAlarmResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAlarmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAlarmResponseBody setAlarmTaskId(String alarmTaskId) {
        this.alarmTaskId = alarmTaskId;
        return this;
    }
    public String getAlarmTaskId() {
        return this.alarmTaskId;
    }

}
