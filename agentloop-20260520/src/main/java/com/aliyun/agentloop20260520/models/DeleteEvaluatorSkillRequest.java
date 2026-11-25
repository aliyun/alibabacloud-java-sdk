// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class DeleteEvaluatorSkillRequest extends TeaModel {
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
     * <strong>example:</strong>
     * <p>v2</p>
     */
    @NameInMap("evaluatorVersion")
    public String evaluatorVersion;

    public static DeleteEvaluatorSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEvaluatorSkillRequest self = new DeleteEvaluatorSkillRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEvaluatorSkillRequest setAgentSpace(String agentSpace) {
        this.agentSpace = agentSpace;
        return this;
    }
    public String getAgentSpace() {
        return this.agentSpace;
    }

    public DeleteEvaluatorSkillRequest setEvaluatorVersion(String evaluatorVersion) {
        this.evaluatorVersion = evaluatorVersion;
        return this;
    }
    public String getEvaluatorVersion() {
        return this.evaluatorVersion;
    }

}
