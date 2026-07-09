// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class GetEvaluatorSkillRequest extends TeaModel {
    /**
     * <p>The AgentSpace name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>prod-agentspace</p>
     */
    @NameInMap("agentSpace")
    public String agentSpace;

    /**
     * <p>The skill version.</p>
     * 
     * <strong>example:</strong>
     * <p>1782816000000</p>
     */
    @NameInMap("version")
    public String version;

    public static GetEvaluatorSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEvaluatorSkillRequest self = new GetEvaluatorSkillRequest();
        return TeaModel.build(map, self);
    }

    public GetEvaluatorSkillRequest setAgentSpace(String agentSpace) {
        this.agentSpace = agentSpace;
        return this;
    }
    public String getAgentSpace() {
        return this.agentSpace;
    }

    public GetEvaluatorSkillRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
