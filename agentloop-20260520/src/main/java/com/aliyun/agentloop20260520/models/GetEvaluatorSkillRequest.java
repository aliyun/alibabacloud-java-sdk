// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class GetEvaluatorSkillRequest extends TeaModel {
    /**
     * <p>The name of the AgentSpace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>prod-agentspace</p>
     */
    @NameInMap("agentSpace")
    public String agentSpace;

    /**
     * <p>The version number of the custom evaluator to which the queried skill belongs. If omitted, the latestVersion of the evaluator is used. The revision number of the skill itself is specified by version.</p>
     * 
     * <strong>example:</strong>
     * <p>v2</p>
     */
    @NameInMap("evaluatorVersion")
    public String evaluatorVersion;

    /**
     * <p>The version of the skill.</p>
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

    public GetEvaluatorSkillRequest setEvaluatorVersion(String evaluatorVersion) {
        this.evaluatorVersion = evaluatorVersion;
        return this;
    }
    public String getEvaluatorVersion() {
        return this.evaluatorVersion;
    }

    public GetEvaluatorSkillRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
