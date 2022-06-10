// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CancelPublishTaskRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    // 任务ID
    @NameInMap("Id")
    public Long id;

    public static CancelPublishTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelPublishTaskRequest self = new CancelPublishTaskRequest();
        return TeaModel.build(map, self);
    }

    public CancelPublishTaskRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CancelPublishTaskRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
