// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetDocClusterTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>93771c8e1142467fb1aedf1763feba1e</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetDocClusterTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDocClusterTaskRequest self = new GetDocClusterTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetDocClusterTaskRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public GetDocClusterTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
