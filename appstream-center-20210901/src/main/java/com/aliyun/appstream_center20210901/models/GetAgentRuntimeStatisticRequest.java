// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetAgentRuntimeStatisticRequest extends TeaModel {
    /**
     * <p>The agent platform used to filter the statistics scope, such as ENTERPRISE_AGENTIC_COMPUTER. If you do not specify this parameter, statistics for all agent platforms are returned. If you specify an unsupported value, a parameter error is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE_AGENTIC_COMPUTER</p>
     */
    @NameInMap("AgentPlatform")
    public String agentPlatform;

    /**
     * <p>The agent provider used to filter the statistics scope, such as AgenticComputer. If you do not specify this parameter, statistics for all agent providers are returned. If you specify an unsupported value, a parameter error is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>AgenticComputer</p>
     */
    @NameInMap("AgentProvider")
    public String agentProvider;

    /**
     * <p>The business type used to filter runtimes of a specific business type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BizType")
    public Integer bizType;

    /**
     * <p>The runtime environment type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudDesktop</p>
     */
    @NameInMap("RuntimeType")
    public String runtimeType;

    public static GetAgentRuntimeStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentRuntimeStatisticRequest self = new GetAgentRuntimeStatisticRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentRuntimeStatisticRequest setAgentPlatform(String agentPlatform) {
        this.agentPlatform = agentPlatform;
        return this;
    }
    public String getAgentPlatform() {
        return this.agentPlatform;
    }

    public GetAgentRuntimeStatisticRequest setAgentProvider(String agentProvider) {
        this.agentProvider = agentProvider;
        return this;
    }
    public String getAgentProvider() {
        return this.agentProvider;
    }

    public GetAgentRuntimeStatisticRequest setBizType(Integer bizType) {
        this.bizType = bizType;
        return this;
    }
    public Integer getBizType() {
        return this.bizType;
    }

    public GetAgentRuntimeStatisticRequest setRuntimeType(String runtimeType) {
        this.runtimeType = runtimeType;
        return this;
    }
    public String getRuntimeType() {
        return this.runtimeType;
    }

}
