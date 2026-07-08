// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class QueryAsyncTaskRequest extends TeaModel {
    /**
     * <p>Unique ID of the workspace: <a href="https://help.aliyun.com/document_detail/2587494.html">AgentKey</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>33a2658aaabf4c24b45d50e575125311_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>Unique task ID</p>
     * <blockquote>
     * <p>The system automatically generates the TaskId by default. If subsequent tasks use the same TaskId, they belong to the same conversation group.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static QueryAsyncTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAsyncTaskRequest self = new QueryAsyncTaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryAsyncTaskRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public QueryAsyncTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
