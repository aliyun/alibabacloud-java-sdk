// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CreateAlarmResponseBody extends TeaModel {
    /**
     * <p>The ID of the event-triggered task.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp1hvbnmkl10vll5****_f95ce797-dc2e-4bad-9618-14fee7d1****</p>
     */
    @NameInMap("AlarmTaskId")
    public String alarmTaskId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAlarmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAlarmResponseBody self = new CreateAlarmResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAlarmResponseBody setAlarmTaskId(String alarmTaskId) {
        this.alarmTaskId = alarmTaskId;
        return this;
    }
    public String getAlarmTaskId() {
        return this.alarmTaskId;
    }

    public CreateAlarmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
