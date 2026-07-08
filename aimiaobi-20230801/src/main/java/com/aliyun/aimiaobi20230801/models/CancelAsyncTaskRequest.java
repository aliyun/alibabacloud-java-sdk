// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class CancelAsyncTaskRequest extends TeaModel {
    /**
     * <p>The unique identifier of the workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2587494.html">AgentKey</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c160c841c8e54295bf2f441432785944_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The unique ID of the task.</p>
     * <blockquote>
     * <p>The system automatically generates the TaskId. This parameter does not need to be specified. If subsequent tasks use the same TaskId, they are grouped into the same conversation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CancelAsyncTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelAsyncTaskRequest self = new CancelAsyncTaskRequest();
        return TeaModel.build(map, self);
    }

    public CancelAsyncTaskRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CancelAsyncTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
