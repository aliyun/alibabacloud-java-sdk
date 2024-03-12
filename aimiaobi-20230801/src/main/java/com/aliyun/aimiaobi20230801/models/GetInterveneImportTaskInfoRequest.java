// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetInterveneImportTaskInfoRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

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
