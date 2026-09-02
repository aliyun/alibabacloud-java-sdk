// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GenerateAgentDataSemanticsRequest extends TeaModel {
    /**
     * <p>The agent name. If no current official version exists or all four knowledge categories are empty, a first-time generation is performed. If at least one knowledge category is non-empty, only Text is regenerated while existing Metrics, Joins, and Examples are retained. The caller cannot specify the generation mode.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bakehouse_agent</p>
     */
    @NameInMap("AgentName")
    public String agentName;

    public static GenerateAgentDataSemanticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateAgentDataSemanticsRequest self = new GenerateAgentDataSemanticsRequest();
        return TeaModel.build(map, self);
    }

    public GenerateAgentDataSemanticsRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

}
