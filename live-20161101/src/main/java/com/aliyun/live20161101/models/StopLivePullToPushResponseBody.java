// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StopLivePullToPushResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>a05e6b15-15af-405b-a4a2-0152245d****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The new task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>fb0d4ac7-c7e3-4978-9743-0bf2f6e8****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static StopLivePullToPushResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopLivePullToPushResponseBody self = new StopLivePullToPushResponseBody();
        return TeaModel.build(map, self);
    }

    public StopLivePullToPushResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopLivePullToPushResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
