// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class CreateScheduledTaskResponseBody extends TeaModel {
    @NameInMap("ScheduledTaskId")
    public String scheduledTaskId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateScheduledTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduledTaskResponseBody self = new CreateScheduledTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateScheduledTaskResponseBody setScheduledTaskId(String scheduledTaskId) {
        this.scheduledTaskId = scheduledTaskId;
        return this;
    }
    public String getScheduledTaskId() {
        return this.scheduledTaskId;
    }

    public CreateScheduledTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
