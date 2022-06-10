// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class BeginSessionRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    // 机器人ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static BeginSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        BeginSessionRequest self = new BeginSessionRequest();
        return TeaModel.build(map, self);
    }

    public BeginSessionRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public BeginSessionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
