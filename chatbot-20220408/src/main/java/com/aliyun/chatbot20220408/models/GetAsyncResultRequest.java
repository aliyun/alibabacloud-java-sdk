// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class GetAsyncResultRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetAsyncResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncResultRequest self = new GetAsyncResultRequest();
        return TeaModel.build(map, self);
    }

    public GetAsyncResultRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public GetAsyncResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
