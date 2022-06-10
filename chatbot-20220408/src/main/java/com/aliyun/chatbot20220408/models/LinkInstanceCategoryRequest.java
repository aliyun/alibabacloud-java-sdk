// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class LinkInstanceCategoryRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    // 知识类目Id
    @NameInMap("CategoryIds")
    public String categoryIds;

    // 机器人唯一标识
    @NameInMap("InstanceId")
    public String instanceId;

    public static LinkInstanceCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        LinkInstanceCategoryRequest self = new LinkInstanceCategoryRequest();
        return TeaModel.build(map, self);
    }

    public LinkInstanceCategoryRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public LinkInstanceCategoryRequest setCategoryIds(String categoryIds) {
        this.categoryIds = categoryIds;
        return this;
    }
    public String getCategoryIds() {
        return this.categoryIds;
    }

    public LinkInstanceCategoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
