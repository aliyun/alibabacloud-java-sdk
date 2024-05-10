// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateSimQuestionRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Title")
    public String title;

    public static CreateSimQuestionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSimQuestionRequest self = new CreateSimQuestionRequest();
        return TeaModel.build(map, self);
    }

    public CreateSimQuestionRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateSimQuestionRequest setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    public CreateSimQuestionRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
