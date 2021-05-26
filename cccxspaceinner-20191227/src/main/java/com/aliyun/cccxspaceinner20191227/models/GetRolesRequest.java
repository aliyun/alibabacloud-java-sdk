// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class GetRolesRequest extends TeaModel {
    @NameInMap("AgentId")
    public String agentId;

    public static GetRolesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRolesRequest self = new GetRolesRequest();
        return TeaModel.build(map, self);
    }

    public GetRolesRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

}
