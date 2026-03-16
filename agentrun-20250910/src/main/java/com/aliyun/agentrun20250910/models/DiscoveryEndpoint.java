// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class DiscoveryEndpoint extends TeaModel {
    @NameInMap("agentEndpointConfigs")
    public java.util.List<AgentEndpointConfig> agentEndpointConfigs;

    /**
     * <p>该发现端点使用的凭证名称</p>
     */
    @NameInMap("credentialName")
    public String credentialName;

    @NameInMap("name")
    public String name;

    /**
     * <p>是否在发现结果中返回 agent 的凭证内容</p>
     */
    @NameInMap("returnAgentCredentialContent")
    public Boolean returnAgentCredentialContent;

    public static DiscoveryEndpoint build(java.util.Map<String, ?> map) throws Exception {
        DiscoveryEndpoint self = new DiscoveryEndpoint();
        return TeaModel.build(map, self);
    }

    public DiscoveryEndpoint setAgentEndpointConfigs(java.util.List<AgentEndpointConfig> agentEndpointConfigs) {
        this.agentEndpointConfigs = agentEndpointConfigs;
        return this;
    }
    public java.util.List<AgentEndpointConfig> getAgentEndpointConfigs() {
        return this.agentEndpointConfigs;
    }

    public DiscoveryEndpoint setCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }
    public String getCredentialName() {
        return this.credentialName;
    }

    public DiscoveryEndpoint setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DiscoveryEndpoint setReturnAgentCredentialContent(Boolean returnAgentCredentialContent) {
        this.returnAgentCredentialContent = returnAgentCredentialContent;
        return this;
    }
    public Boolean getReturnAgentCredentialContent() {
        return this.returnAgentCredentialContent;
    }

}
