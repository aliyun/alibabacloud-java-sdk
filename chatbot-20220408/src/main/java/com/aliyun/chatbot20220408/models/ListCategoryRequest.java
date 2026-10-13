// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListCategoryRequest extends TeaModel {
    /**
     * <p>The key of the business space. If not specified, the default business space is accessed. Obtain the key value from the business management page of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The knowledge type. Valid values:</p>
     * <ul>
     * <li>1: FAQ category.</li>
     * <li>3: Document category.</li>
     * </ul>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("KnowledgeType")
    public Integer knowledgeType;

    /**
     * <p>The ID of the parent category.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
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
