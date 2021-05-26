// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class ClearAgentGroupsRequest extends TeaModel {
    @NameInMap("BuId")
    public Long buId;

    @NameInMap("AgentId")
    public Long agentId;

    public static ClearAgentGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ClearAgentGroupsRequest self = new ClearAgentGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ClearAgentGroupsRequest setBuId(Long buId) {
        this.buId = buId;
        return this;
    }
    public Long getBuId() {
        return this.buId;
    }

    public ClearAgentGroupsRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

}
