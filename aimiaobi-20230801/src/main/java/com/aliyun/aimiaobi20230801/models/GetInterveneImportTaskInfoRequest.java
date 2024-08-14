// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetInterveneImportTaskInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>67c520d1fa43455ea44fb69fa402d54d_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <strong>example:</strong>
     * <p>19162157</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetInterveneImportTaskInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInterveneImportTaskInfoRequest self = new GetInterveneImportTaskInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetInterveneImportTaskInfoRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public GetInterveneImportTaskInfoRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
