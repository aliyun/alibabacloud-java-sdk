// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class QueryCategoriesRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("KnowledgeType")
    public Long knowledgeType;

    @NameInMap("ParentCategoryId")
    public Long parentCategoryId;

    @NameInMap("ShowChildrens")
    public Boolean showChildrens;

    public static QueryCategoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCategoriesRequest self = new QueryCategoriesRequest();
        return TeaModel.build(map, self);
    }

    public QueryCategoriesRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public QueryCategoriesRequest setKnowledgeType(Long knowledgeType) {
        this.knowledgeType = knowledgeType;
        return this;
    }
    public Long getKnowledgeType() {
        return this.knowledgeType;
    }

    public QueryCategoriesRequest setParentCategoryId(Long parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
        return this;
    }
    public Long getParentCategoryId() {
        return this.parentCategoryId;
    }

    public QueryCategoriesRequest setShowChildrens(Boolean showChildrens) {
        this.showChildrens = showChildrens;
        return this;
    }
    public Boolean getShowChildrens() {
        return this.showChildrens;
    }

}
