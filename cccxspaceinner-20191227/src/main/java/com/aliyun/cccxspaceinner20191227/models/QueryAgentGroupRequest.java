// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class QueryAgentGroupRequest extends TeaModel {
    @NameInMap("AgentId")
    public Long agentId;

    public static QueryAgentGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAgentGroupRequest self = new QueryAgentGroupRequest();
        return TeaModel.build(map, self);
    }

    public QueryAgentGroupRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

}
