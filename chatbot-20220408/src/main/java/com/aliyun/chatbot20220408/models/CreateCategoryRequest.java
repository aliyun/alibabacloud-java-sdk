// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateCategoryRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("BizCode")
    public String bizCode;

    @NameInMap("KnowledgeType")
    public Integer knowledgeType;

    @NameInMap("Name")
    public String name;

    @NameInMap("ParentCategoryId")
    public Long parentCategoryId;

    public static CreateCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCategoryRequest self = new CreateCategoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateCategoryRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateCategoryRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public CreateCategoryRequest setKnowledgeType(Integer knowledgeType) {
        this.knowledgeType = knowledgeType;
        return this;
    }
    public Integer getKnowledgeType() {
        return this.knowledgeType;
    }

    public CreateCategoryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCategoryRequest setParentCategoryId(Long parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
        return this;
    }
    public Long getParentCategoryId() {
        return this.parentCategoryId;
    }

}
