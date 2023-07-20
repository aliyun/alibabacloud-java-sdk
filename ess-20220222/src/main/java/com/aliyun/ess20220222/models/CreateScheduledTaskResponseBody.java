// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CreateScheduledTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScheduledTaskId")
    public String scheduledTaskId;

    public static CreateScheduledTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduledTaskResponseBody self = new CreateScheduledTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateScheduledTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateScheduledTaskResponseBody setScheduledTaskId(String scheduledTaskId) {
        this.scheduledTaskId = scheduledTaskId;
        return this;
    }
    public String getScheduledTaskId() {
        return this.scheduledTaskId;
    }

}
