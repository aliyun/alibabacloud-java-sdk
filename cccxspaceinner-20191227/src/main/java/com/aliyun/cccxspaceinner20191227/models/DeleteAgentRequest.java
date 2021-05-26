// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class DeleteAgentRequest extends TeaModel {
    @NameInMap("AgentId")
    public Long agentId;

    public static DeleteAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentRequest self = new DeleteAgentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAgentRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

}
