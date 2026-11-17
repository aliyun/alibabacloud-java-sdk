// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ClearAgentInstanceMemoryRequest extends TeaModel {
    /**
     * <p>The ID of the agent instance whose memory you want to clear. This parameter is required and can be obtained from the response of ListAgentInstanceMemory.</p>
     * 
     * <strong>example:</strong>
     * <p>agi-08vm****</p>
     */
    @NameInMap("AgentInstanceId")
    public String agentInstanceId;

    public static ClearAgentInstanceMemoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ClearAgentInstanceMemoryRequest self = new ClearAgentInstanceMemoryRequest();
        return TeaModel.build(map, self);
    }

    public ClearAgentInstanceMemoryRequest setAgentInstanceId(String agentInstanceId) {
        this.agentInstanceId = agentInstanceId;
        return this;
    }
    public String getAgentInstanceId() {
        return this.agentInstanceId;
    }

}
