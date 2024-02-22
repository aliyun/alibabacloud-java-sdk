// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListCategoryRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("KnowledgeType")
    public Integer knowledgeType;

    @NameInMap("ParentCategoryId")
    public Long parentCategoryId;

    public static ListCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCategoryRequest self = new ListCategoryRequest();
        return TeaModel.build(map, self);
    }

    public ListCategoryRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ListCategoryRequest setKnowledgeType(Integer knowledgeType) {
        this.knowledgeType = knowledgeType;
        return this;
    }
    public Integer getKnowledgeType() {
        return this.knowledgeType;
    }

    public ListCategoryRequest setParentCategoryId(Long parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
        return this;
    }
    public Long getParentCategoryId() {
        return this.parentCategoryId;
    }

}
