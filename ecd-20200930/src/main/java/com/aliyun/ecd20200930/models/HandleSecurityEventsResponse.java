// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class HandleSecurityEventsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public Long taskId;

    public static HandleSecurityEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        HandleSecurityEventsResponse self = new HandleSecurityEventsResponse();
        return TeaModel.build(map, self);
    }

    public HandleSecurityEventsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HandleSecurityEventsResponse setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
