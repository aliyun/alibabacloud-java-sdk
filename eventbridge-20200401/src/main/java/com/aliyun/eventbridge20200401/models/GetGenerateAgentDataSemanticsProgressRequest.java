// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetGenerateAgentDataSemanticsProgressRequest extends TeaModel {
    /**
     * <p>The name of the agent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bakehouse_agent</p>
     */
    @NameInMap("AgentName")
    public String agentName;

    public static GetGenerateAgentDataSemanticsProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGenerateAgentDataSemanticsProgressRequest self = new GetGenerateAgentDataSemanticsProgressRequest();
        return TeaModel.build(map, self);
    }

    public GetGenerateAgentDataSemanticsProgressRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

}
