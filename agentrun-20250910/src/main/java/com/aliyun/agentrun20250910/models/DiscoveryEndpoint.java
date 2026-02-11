// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class DiscoveryEndpoint extends TeaModel {
    @NameInMap("agentEndpointConfigs")
    public java.util.List<AgentEndpointConfig> agentEndpointConfigs;

    @NameInMap("name")
    public String name;

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

    public DiscoveryEndpoint setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
