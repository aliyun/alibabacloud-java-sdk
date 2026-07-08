// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetCustomTopicSelectionPerspectiveAnalysisTaskRequest extends TeaModel {
    /**
     * <p>Unique identifier of the workspace: <a href="https://help.aliyun.com/document_detail/2587494.html">AgentKey</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>Unique ID of the task.</p>
     * <blockquote>
     * <p>The system generates a TaskId by default. If you specify the same TaskId for multiple tasks, those tasks belong to the same conversation group.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0dbf1055f8a2475d99904c3b76a0ffba</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetCustomTopicSelectionPerspectiveAnalysisTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCustomTopicSelectionPerspectiveAnalysisTaskRequest self = new GetCustomTopicSelectionPerspectiveAnalysisTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetCustomTopicSelectionPerspectiveAnalysisTaskRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public GetCustomTopicSelectionPerspectiveAnalysisTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
