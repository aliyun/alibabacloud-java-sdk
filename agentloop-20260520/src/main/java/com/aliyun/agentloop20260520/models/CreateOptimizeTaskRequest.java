// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class CreateOptimizeTaskRequest extends TeaModel {
    /**
     * <p>The type-specific configurations. Optional prompts for ExperienceMining and SkillOptimize only support inline Markdown. The main text is saved to inputs.prompt.content (non-empty UTF-8, up to 16 KiB).</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ioVersion&quot;:2,&quot;inputs&quot;:{&quot;experienceLibrary&quot;:{&quot;type&quot;:&quot;dataset&quot;,&quot;dataset&quot;:&quot;experiences&quot;},&quot;trajectory&quot;:{&quot;type&quot;:&quot;sls&quot;,&quot;project&quot;:&quot;my-project&quot;,&quot;logstore&quot;:&quot;agent-trajectory&quot;,&quot;format&quot;:&quot;atif&quot;},&quot;prompt&quot;:{&quot;type&quot;:&quot;inline&quot;,&quot;format&quot;:&quot;markdown&quot;,&quot;content&quot;:&quot;# Guidance\\nExtract evidence-backed tool contracts.&quot;}},&quot;outputs&quot;:{&quot;changePlan&quot;:{&quot;type&quot;:&quot;dataset&quot;,&quot;dataset&quot;:&quot;experience-plans&quot;}},&quot;operators&quot;:[&quot;tool_contract&quot;],&quot;application&quot;:{&quot;mode&quot;:&quot;manual&quot;}}</p>
     */
    @NameInMap("config")
    public java.util.Map<String, ?> config;

    /**
     * <p>The name of the optimization task. The name of a new service task is specified by the caller and must be unique within the same AgentSpace.</p>
     * 
     * <strong>example:</strong>
     * <p>efficiency-analysis</p>
     */
    @NameInMap("optimizeTaskName")
    public String optimizeTaskName;

    /**
     * <p>The status of the task. Valid values: Enabled, Disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The type of the optimization task. Valid values: ExperienceMining, SkillOptimize, EfficiencyAnalysis, SOPGeneration, EvalMining, PolicyMining, and AssetMining. The memory base uses the current ContextStore and the original Worker, and is not integrated with Mining.</p>
     * 
     * <strong>example:</strong>
     * <p>EfficiencyAnalysis</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The idempotency token.</p>
     * 
     * <strong>example:</strong>
     * <p>a1b2c3d4-1234-5678-90ab-cdef12345678</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateOptimizeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOptimizeTaskRequest self = new CreateOptimizeTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateOptimizeTaskRequest setConfig(java.util.Map<String, ?> config) {
        this.config = config;
        return this;
    }
    public java.util.Map<String, ?> getConfig() {
        return this.config;
    }

    public CreateOptimizeTaskRequest setOptimizeTaskName(String optimizeTaskName) {
        this.optimizeTaskName = optimizeTaskName;
        return this;
    }
    public String getOptimizeTaskName() {
        return this.optimizeTaskName;
    }

    public CreateOptimizeTaskRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateOptimizeTaskRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateOptimizeTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
