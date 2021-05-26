// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class GetAgentByAgentIdRequest extends TeaModel {
    @NameInMap("AgentId")
    public Long agentId;

    public static GetAgentByAgentIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentByAgentIdRequest self = new GetAgentByAgentIdRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentByAgentIdRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

}
