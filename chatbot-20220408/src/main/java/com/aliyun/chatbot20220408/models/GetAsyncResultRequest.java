// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class GetAsyncResultRequest extends TeaModel {
    /**
     * <p>The workspace key. If not specified, the default workspace is accessed. Obtain the key value from the business management page of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The task ID of the asynchronous service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Obtain TASK_ID from the Chat operation</p>
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
