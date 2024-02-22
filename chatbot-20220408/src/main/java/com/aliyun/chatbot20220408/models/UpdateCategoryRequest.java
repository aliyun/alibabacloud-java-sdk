// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateCategoryRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("BizCode")
    public String bizCode;

    @NameInMap("CategoryId")
    public Long categoryId;

    @NameInMap("Name")
    public String name;

    public static UpdateCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCategoryRequest self = new UpdateCategoryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCategoryRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateCategoryRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public UpdateCategoryRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public UpdateCategoryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
