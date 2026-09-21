// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListModelProviderEndpointsRequest extends TeaModel {
    /**
     * <p>The agent platform name. This parameter is not processed and is only passed through as a redundant field, such as ENTERPRISE.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE_AGENTIC_COMPUTER</p>
     */
    @NameInMap("AgentPlatform")
    public String agentPlatform;

    /**
     * <p>The agent provider name, such as HermesAgent or OpenClaw. If this parameter is specified, the providerName in the returned endpoints is the alias from the perspective of the specified agent provider.</p>
     * 
     * <strong>example:</strong>
     * <p>AgenticComputer</p>
     */
    @NameInMap("AgentProvider")
    public String agentProvider;

    /**
     * <p>The business type.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BizType")
    public Integer bizType;

    /**
     * <p>The name of the model provider, such as bailian, moonshot, or siliconflow. If this parameter is not specified, the endpoint configurations of all managed providers are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>bailian</p>
     */
    @NameInMap("ProviderName")
    public String providerName;

    public static ListModelProviderEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelProviderEndpointsRequest self = new ListModelProviderEndpointsRequest();
        return TeaModel.build(map, self);
    }

    public ListModelProviderEndpointsRequest setAgentPlatform(String agentPlatform) {
        this.agentPlatform = agentPlatform;
        return this;
    }
    public String getAgentPlatform() {
        return this.agentPlatform;
    }

    public ListModelProviderEndpointsRequest setAgentProvider(String agentProvider) {
        this.agentProvider = agentProvider;
        return this;
    }
    public String getAgentProvider() {
        return this.agentProvider;
    }

    public ListModelProviderEndpointsRequest setBizType(Integer bizType) {
        this.bizType = bizType;
        return this;
    }
    public Integer getBizType() {
        return this.bizType;
    }

    public ListModelProviderEndpointsRequest setProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }
    public String getProviderName() {
        return this.providerName;
    }

}
