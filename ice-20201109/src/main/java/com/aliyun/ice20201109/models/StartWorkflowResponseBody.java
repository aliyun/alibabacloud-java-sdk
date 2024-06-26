// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StartWorkflowResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>42-E8E1-4FBB-8E52-F4225C</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>22dad741d086a50325f9</strong></strong></strong></p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static StartWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartWorkflowResponseBody self = new StartWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public StartWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartWorkflowResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
