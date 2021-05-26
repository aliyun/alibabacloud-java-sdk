// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class UpdateAgentGroupRequest extends TeaModel {
    @NameInMap("AgentId")
    public Long agentId;

    @NameInMap("GroupIds")
    public String groupIds;

    @NameInMap("CreateAgentId")
    public Long createAgentId;

    public static UpdateAgentGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentGroupRequest self = new UpdateAgentGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAgentGroupRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

    public UpdateAgentGroupRequest setGroupIds(String groupIds) {
        this.groupIds = groupIds;
        return this;
    }
    public String getGroupIds() {
        return this.groupIds;
    }

    public UpdateAgentGroupRequest setCreateAgentId(Long createAgentId) {
        this.createAgentId = createAgentId;
        return this;
    }
    public Long getCreateAgentId() {
        return this.createAgentId;
    }

}
