// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class FetchExportWordTaskRequest extends TeaModel {
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
     * <p>2e27abb32cb64f80a0c6e829b6c87a09</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static FetchExportWordTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        FetchExportWordTaskRequest self = new FetchExportWordTaskRequest();
        return TeaModel.build(map, self);
    }

    public FetchExportWordTaskRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public FetchExportWordTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
