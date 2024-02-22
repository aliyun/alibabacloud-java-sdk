// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteDocRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    public static DeleteDocRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDocRequest self = new DeleteDocRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDocRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public DeleteDocRequest setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

}
