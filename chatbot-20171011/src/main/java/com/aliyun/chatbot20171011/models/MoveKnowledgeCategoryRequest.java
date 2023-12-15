// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class MoveKnowledgeCategoryRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("CategoryId")
    public Long categoryId;

    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    public static MoveKnowledgeCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveKnowledgeCategoryRequest self = new MoveKnowledgeCategoryRequest();
        return TeaModel.build(map, self);
    }

    public MoveKnowledgeCategoryRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public MoveKnowledgeCategoryRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public MoveKnowledgeCategoryRequest setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

}
