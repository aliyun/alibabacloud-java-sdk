// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateCategoryRequest extends TeaModel {
    /**
     * <p>The business space key. If this parameter is not specified, the default business space is accessed. You can obtain the key value from the business management page of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The business code.</p>
     * 
     * <strong>example:</strong>
     * <p>bizcode123</p>
     */
    @NameInMap("BizCode")
    public String bizCode;

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
     * <p>The category name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The parent category ID. Default value: -1, which indicates the root directory.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
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
