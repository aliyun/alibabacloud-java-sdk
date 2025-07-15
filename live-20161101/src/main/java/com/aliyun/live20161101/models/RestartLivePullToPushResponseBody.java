// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class RestartLivePullToPushResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>a05e6b15-15af-405b-a4a2-01522450****</p>
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

    public static RestartLivePullToPushResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartLivePullToPushResponseBody self = new RestartLivePullToPushResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartLivePullToPushResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RestartLivePullToPushResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
