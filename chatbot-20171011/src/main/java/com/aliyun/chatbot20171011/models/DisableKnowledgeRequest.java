// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DisableKnowledgeRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>FAQ ID</p>
     */
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    public static DisableKnowledgeRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableKnowledgeRequest self = new DisableKnowledgeRequest();
        return TeaModel.build(map, self);
    }

    public DisableKnowledgeRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public DisableKnowledgeRequest setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

}
