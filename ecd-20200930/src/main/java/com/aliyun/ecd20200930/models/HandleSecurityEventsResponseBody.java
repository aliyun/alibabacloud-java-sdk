// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class HandleSecurityEventsResponseBody extends TeaModel {
    @NameInMap("TaskId")
    public Long taskId;

    @NameInMap("RequestId")
    public String requestId;

    public static HandleSecurityEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HandleSecurityEventsResponseBody self = new HandleSecurityEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public HandleSecurityEventsResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public HandleSecurityEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
