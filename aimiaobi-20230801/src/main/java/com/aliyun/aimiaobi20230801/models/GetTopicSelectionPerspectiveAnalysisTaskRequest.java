// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetTopicSelectionPerspectiveAnalysisTaskRequest extends TeaModel {
    /**
     * <p>The unique identifier of the workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2587494.html">AgentKey</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The unique ID of the task.</p>
     * <blockquote>
     * <p>This parameter is optional. The system automatically generates a task ID. If subsequent tasks have the same TaskId, they are considered part of the same conversation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>c9f226b02cca4f42a84c5e955c39dfd2</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetTopicSelectionPerspectiveAnalysisTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTopicSelectionPerspectiveAnalysisTaskRequest self = new GetTopicSelectionPerspectiveAnalysisTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetTopicSelectionPerspectiveAnalysisTaskRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public GetTopicSelectionPerspectiveAnalysisTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
