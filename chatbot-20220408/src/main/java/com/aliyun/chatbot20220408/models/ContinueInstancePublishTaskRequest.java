// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ContinueInstancePublishTaskRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ContinueInstancePublishTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ContinueInstancePublishTaskRequest self = new ContinueInstancePublishTaskRequest();
        return TeaModel.build(map, self);
    }

    public ContinueInstancePublishTaskRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ContinueInstancePublishTaskRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ContinueInstancePublishTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
