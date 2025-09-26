// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class TargetConfiguration extends TeaModel {
    @NameInMap("llmAPIConfig")
    public LLMAPIConfiguration llmAPIConfig;

    @NameInMap("mcpAPIConfig")
    public MCPAPIConfiguration mcpAPIConfig;

    @NameInMap("targetType")
    public String targetType;

    public static TargetConfiguration build(java.util.Map<String, ?> map) throws Exception {
        TargetConfiguration self = new TargetConfiguration();
        return TeaModel.build(map, self);
    }

    public TargetConfiguration setLlmAPIConfig(LLMAPIConfiguration llmAPIConfig) {
        this.llmAPIConfig = llmAPIConfig;
        return this;
    }
    public LLMAPIConfiguration getLlmAPIConfig() {
        return this.llmAPIConfig;
    }

    public TargetConfiguration setMcpAPIConfig(MCPAPIConfiguration mcpAPIConfig) {
        this.mcpAPIConfig = mcpAPIConfig;
        return this;
    }
    public MCPAPIConfiguration getMcpAPIConfig() {
        return this.mcpAPIConfig;
    }

    public TargetConfiguration setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
