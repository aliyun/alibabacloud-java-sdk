// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetCustomSourceTopicAnalysisTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c9f226b02cca4f42a84c5e955c39dfd2</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetCustomSourceTopicAnalysisTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCustomSourceTopicAnalysisTaskRequest self = new GetCustomSourceTopicAnalysisTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetCustomSourceTopicAnalysisTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetCustomSourceTopicAnalysisTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
