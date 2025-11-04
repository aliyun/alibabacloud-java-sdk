// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StartAIWorkflowResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the workflow task.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong><strong>-266c-4bb8-b20c-6faa</strong></strong></strong></strong></p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static StartAIWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartAIWorkflowResponseBody self = new StartAIWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public StartAIWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartAIWorkflowResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
