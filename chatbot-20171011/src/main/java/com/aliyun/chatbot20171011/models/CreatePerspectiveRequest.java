// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class CreatePerspectiveRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("Name")
    public String name;

    public static CreatePerspectiveRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePerspectiveRequest self = new CreatePerspectiveRequest();
        return TeaModel.build(map, self);
    }

    public CreatePerspectiveRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreatePerspectiveRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
