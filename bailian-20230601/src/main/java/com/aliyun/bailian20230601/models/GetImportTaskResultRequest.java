// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class GetImportTaskResultRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("TaskId")
    public String taskId;

    public static GetImportTaskResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImportTaskResultRequest self = new GetImportTaskResultRequest();
        return TeaModel.build(map, self);
    }

    public GetImportTaskResultRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public GetImportTaskResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
