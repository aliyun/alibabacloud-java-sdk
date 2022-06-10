// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class GetInstancePublishTaskStateRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    // 任务ID
    @NameInMap("Id")
    public Long id;

    // 机器人ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetInstancePublishTaskStateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstancePublishTaskStateRequest self = new GetInstancePublishTaskStateRequest();
        return TeaModel.build(map, self);
    }

    public GetInstancePublishTaskStateRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public GetInstancePublishTaskStateRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetInstancePublishTaskStateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
