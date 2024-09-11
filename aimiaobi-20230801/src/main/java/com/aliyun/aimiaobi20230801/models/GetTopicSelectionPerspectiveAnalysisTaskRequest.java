// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetTopicSelectionPerspectiveAnalysisTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
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
