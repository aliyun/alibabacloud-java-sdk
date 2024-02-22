// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class RetryDocRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    public static RetryDocRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryDocRequest self = new RetryDocRequest();
        return TeaModel.build(map, self);
    }

    public RetryDocRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public RetryDocRequest setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

}
