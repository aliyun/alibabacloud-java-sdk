// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetAIWorkflowTaskRequest extends TeaModel {
    /**
     * <p>The ID of the workflow task.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong><strong>-266c-4bb8-b20c-6faa</strong></strong></strong></strong></p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetAIWorkflowTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAIWorkflowTaskRequest self = new GetAIWorkflowTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetAIWorkflowTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
