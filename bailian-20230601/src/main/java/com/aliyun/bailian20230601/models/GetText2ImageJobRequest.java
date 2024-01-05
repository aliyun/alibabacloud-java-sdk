// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class GetText2ImageJobRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("TaskId")
    public String taskId;

    public static GetText2ImageJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetText2ImageJobRequest self = new GetText2ImageJobRequest();
        return TeaModel.build(map, self);
    }

    public GetText2ImageJobRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public GetText2ImageJobRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
