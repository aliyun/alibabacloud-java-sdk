// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class KickOutAgentRequest extends TeaModel {
    @NameInMap("AgentId")
    public Long agentId;

    public static KickOutAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        KickOutAgentRequest self = new KickOutAgentRequest();
        return TeaModel.build(map, self);
    }

    public KickOutAgentRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

}
