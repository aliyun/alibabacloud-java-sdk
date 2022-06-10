// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class GetAsyncResultRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    // 从Chat接口返回参数中获取TASK_ID
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
