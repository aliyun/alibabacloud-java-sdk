// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteConnQuestionRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OutlineId")
    public Long outlineId;

    public static DeleteConnQuestionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteConnQuestionRequest self = new DeleteConnQuestionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteConnQuestionRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public DeleteConnQuestionRequest setOutlineId(Long outlineId) {
        this.outlineId = outlineId;
        return this;
    }
    public Long getOutlineId() {
        return this.outlineId;
    }

}
