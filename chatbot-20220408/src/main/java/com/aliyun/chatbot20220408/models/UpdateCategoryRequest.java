// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateCategoryRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    // 类目ID
    @NameInMap("CategoryId")
    public Long categoryId;

    // 类目名称
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
