// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListSimQuestionRequest extends TeaModel {
    /**
     * <p>The key for the business space. If you do not specify this parameter, the default business space is used. You can get the key from the Business Management Page of your Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The knowledge entry ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30002299537</p>
     */
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    public static ListSimQuestionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSimQuestionRequest self = new ListSimQuestionRequest();
        return TeaModel.build(map, self);
    }

    public ListSimQuestionRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ListSimQuestionRequest setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

}
