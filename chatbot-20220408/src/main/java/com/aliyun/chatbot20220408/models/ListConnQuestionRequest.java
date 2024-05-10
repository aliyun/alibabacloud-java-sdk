// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListConnQuestionRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    public static ListConnQuestionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConnQuestionRequest self = new ListConnQuestionRequest();
        return TeaModel.build(map, self);
    }

    public ListConnQuestionRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ListConnQuestionRequest setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

}
