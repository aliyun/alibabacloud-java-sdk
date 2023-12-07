// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class GetPromptRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("PromptId")
    public String promptId;

    @NameInMap("Vars")
    public String vars;

    public static GetPromptRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPromptRequest self = new GetPromptRequest();
        return TeaModel.build(map, self);
    }

    public GetPromptRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public GetPromptRequest setPromptId(String promptId) {
        this.promptId = promptId;
        return this;
    }
    public String getPromptId() {
        return this.promptId;
    }

    public GetPromptRequest setVars(String vars) {
        this.vars = vars;
        return this;
    }
    public String getVars() {
        return this.vars;
    }

}
