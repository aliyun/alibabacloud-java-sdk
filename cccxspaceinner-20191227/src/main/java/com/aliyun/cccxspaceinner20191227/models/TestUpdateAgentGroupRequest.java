// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class TestUpdateAgentGroupRequest extends TeaModel {
    @NameInMap("AgentId")
    public Long agentId;

    @NameInMap("CreateAgentId")
    public Long createAgentId;

    public static TestUpdateAgentGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        TestUpdateAgentGroupRequest self = new TestUpdateAgentGroupRequest();
        return TeaModel.build(map, self);
    }

    public TestUpdateAgentGroupRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

    public TestUpdateAgentGroupRequest setCreateAgentId(Long createAgentId) {
        this.createAgentId = createAgentId;
        return this;
    }
    public Long getCreateAgentId() {
        return this.createAgentId;
    }

}
