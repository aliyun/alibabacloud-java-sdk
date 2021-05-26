// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class ChangeAgentStatusRequest extends TeaModel {
    @NameInMap("AgentId")
    public Long agentId;

    @NameInMap("Method")
    public String method;

    public static ChangeAgentStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeAgentStatusRequest self = new ChangeAgentStatusRequest();
        return TeaModel.build(map, self);
    }

    public ChangeAgentStatusRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

    public ChangeAgentStatusRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

}
