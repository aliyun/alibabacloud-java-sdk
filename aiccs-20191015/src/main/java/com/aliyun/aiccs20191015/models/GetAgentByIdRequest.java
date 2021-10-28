// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAgentByIdRequest extends TeaModel {
    @NameInMap("AgentId")
    public Long agentId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetAgentByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentByIdRequest self = new GetAgentByIdRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentByIdRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

    public GetAgentByIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
