// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateCategoryRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    // 类目名称
    @NameInMap("Name")
    public String name;

    // 父类目ID，默认-1，对应根目录
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
