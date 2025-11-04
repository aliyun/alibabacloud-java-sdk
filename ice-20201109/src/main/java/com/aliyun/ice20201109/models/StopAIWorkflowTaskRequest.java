// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StopAIWorkflowTaskRequest extends TeaModel {
    /**
     * <p>The ID of the workflow task.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong><strong>-266c-4bb8-b20c-6faa</strong></strong></strong></strong></p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static StopAIWorkflowTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StopAIWorkflowTaskRequest self = new StopAIWorkflowTaskRequest();
        return TeaModel.build(map, self);
    }

    public StopAIWorkflowTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
