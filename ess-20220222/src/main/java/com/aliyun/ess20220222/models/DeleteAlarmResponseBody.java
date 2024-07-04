// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DeleteAlarmResponseBody extends TeaModel {
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
     * <p>6EF9BFEE-FE07-4627-B8FB-14326FB9****</p>
     */
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
