// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class AgentEndpointConfig extends TeaModel {
    @NameInMap("agentName")
    public String agentName;

    @NameInMap("customDomainUrl")
    public String customDomainUrl;

    @NameInMap("endpointUrl")
    public String endpointUrl;

    public static AgentEndpointConfig build(java.util.Map<String, ?> map) throws Exception {
        AgentEndpointConfig self = new AgentEndpointConfig();
        return TeaModel.build(map, self);
    }

    public AgentEndpointConfig setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public AgentEndpointConfig setCustomDomainUrl(String customDomainUrl) {
        this.customDomainUrl = customDomainUrl;
        return this;
    }
    public String getCustomDomainUrl() {
        return this.customDomainUrl;
    }

    public AgentEndpointConfig setEndpointUrl(String endpointUrl) {
        this.endpointUrl = endpointUrl;
        return this;
    }
    public String getEndpointUrl() {
        return this.endpointUrl;
    }

}
