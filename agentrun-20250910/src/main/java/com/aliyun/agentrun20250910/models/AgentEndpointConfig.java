// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class AgentEndpointConfig extends TeaModel {
    @NameInMap("agentName")
    public String agentName;

    @NameInMap("customDomainUrl")
    public String customDomainUrl;

    /**
     * <p>端点名称</p>
     */
    @NameInMap("endpointName")
    public String endpointName;

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

    public AgentEndpointConfig setEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }
    public String getEndpointName() {
        return this.endpointName;
    }

    public AgentEndpointConfig setEndpointUrl(String endpointUrl) {
        this.endpointUrl = endpointUrl;
        return this;
    }
    public String getEndpointUrl() {
        return this.endpointUrl;
    }

}
