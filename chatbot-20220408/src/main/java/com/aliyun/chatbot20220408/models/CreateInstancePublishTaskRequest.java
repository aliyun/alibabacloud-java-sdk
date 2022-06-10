// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateInstancePublishTaskRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    // 机器人唯一标识
    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateInstancePublishTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstancePublishTaskRequest self = new CreateInstancePublishTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstancePublishTaskRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateInstancePublishTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
