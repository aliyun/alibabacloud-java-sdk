// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateConnQuestionRequest extends TeaModel {
    /**
     * <p>The key of the business space. If this parameter is not specified, the default business space is accessed. You can obtain the key on the business management page of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The ID of the associated knowledge.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30002654628</p>
     */
    @NameInMap("ConnQuestionId")
    public Long connQuestionId;

    /**
     * <p>The knowledge ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30002174773</p>
     */
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    public static CreateConnQuestionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConnQuestionRequest self = new CreateConnQuestionRequest();
        return TeaModel.build(map, self);
    }

    public CreateConnQuestionRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateConnQuestionRequest setConnQuestionId(Long connQuestionId) {
        this.connQuestionId = connQuestionId;
        return this;
    }
    public Long getConnQuestionId() {
        return this.connQuestionId;
    }

    public CreateConnQuestionRequest setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

}
