// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CancelInstancePublishTaskRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    // 任务ID
    @NameInMap("Id")
    public Long id;

    // 机器人ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static CancelInstancePublishTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelInstancePublishTaskRequest self = new CancelInstancePublishTaskRequest();
        return TeaModel.build(map, self);
    }

    public CancelInstancePublishTaskRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CancelInstancePublishTaskRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CancelInstancePublishTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
