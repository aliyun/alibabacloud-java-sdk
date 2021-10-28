// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetDepGroupTreeDataRequest extends TeaModel {
    // 坐席ID
    @NameInMap("AgentId")
    public Long agentId;

    // 租户实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetDepGroupTreeDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDepGroupTreeDataRequest self = new GetDepGroupTreeDataRequest();
        return TeaModel.build(map, self);
    }

    public GetDepGroupTreeDataRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

    public GetDepGroupTreeDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
