// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class Target extends TeaModel {
    @NameInMap("llmConfig")
    public LLMAPIConfiguration llmConfig;

    @NameInMap("mcpAPI")
    public MCPAPI mcpAPI;

    @NameInMap("targetType")
    public String targetType;

    public static Target build(java.util.Map<String, ?> map) throws Exception {
        Target self = new Target();
        return TeaModel.build(map, self);
    }

    public Target setLlmConfig(LLMAPIConfiguration llmConfig) {
        this.llmConfig = llmConfig;
        return this;
    }
    public LLMAPIConfiguration getLlmConfig() {
        return this.llmConfig;
    }

    public Target setMcpAPI(MCPAPI mcpAPI) {
        this.mcpAPI = mcpAPI;
        return this;
    }
    public MCPAPI getMcpAPI() {
        return this.mcpAPI;
    }

    public Target setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
