// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteSimQuestionRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    // 相似问ID
    @NameInMap("SimQuestionId")
    public Long simQuestionId;

    public static DeleteSimQuestionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSimQuestionRequest self = new DeleteSimQuestionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSimQuestionRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public DeleteSimQuestionRequest setSimQuestionId(Long simQuestionId) {
        this.simQuestionId = simQuestionId;
        return this;
    }
    public Long getSimQuestionId() {
        return this.simQuestionId;
    }

}
