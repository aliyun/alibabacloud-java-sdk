// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AgentInfo extends TeaModel {
    /**
     * <p>The associated resource information for the Agent access capability. Returns null if the Agent access capability is not configured.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("agentAccess")
    public AgentInfoAgentAccess agentAccess;

    /**
     * <p>Agent ID。</p>
     * 
     * <strong>example:</strong>
     * <p>agent-1</p>
     */
    @NameInMap("agentId")
    public String agentId;

    /**
     * <p>The Agent type. DashScope (Bailian) allows only Agent access. Dify allows both Agent access and model access. ClaudeCode allows only model access. Custom allows both Agent access and model access.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom</p>
     */
    @NameInMap("agentType")
    public String agentType;

    /**
     * <p>The list of capabilities that the current Agent type allows to be configured. This field does not indicate that the capabilities are already configured. To determine whether a capability is configured, check whether agentAccess or modelAccess is null.</p>
     */
    @NameInMap("allowedCapabilities")
    public java.util.List<String> allowedCapabilities;

    /**
     * <p>The Agent creation time, in Unix millisecond timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1755129600000</p>
     */
    @NameInMap("createTimestamp")
    public Long createTimestamp;

    /**
     * <p>The Agent description.</p>
     * 
     * <strong>example:</strong>
     * <p>custom agent</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The gateway ID to which the Agent belongs. When reading the associated API deployment configuration, select the configuration whose gatewayId matches this value.</p>
     * 
     * <strong>example:</strong>
     * <p>gateway-1</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The associated resource information for the model access capability. Returns null if the model access capability is not configured.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("modelAccess")
    public AgentInfoModelAccess modelAccess;

    /**
     * <p>The Agent name.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The resource group ID in which the Agent is saved.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-1</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The Agent status. An Agent that is successfully created and queryable always returns Ready. Internal creation or compensation states are not returned externally.</p>
     * 
     * <strong>example:</strong>
     * <p>Ready</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The Agent last update time, in Unix millisecond timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1755129600000</p>
     */
    @NameInMap("updateTimestamp")
    public Long updateTimestamp;

    public static AgentInfo build(java.util.Map<String, ?> map) throws Exception {
        AgentInfo self = new AgentInfo();
        return TeaModel.build(map, self);
    }

    public AgentInfo setAgentAccess(AgentInfoAgentAccess agentAccess) {
        this.agentAccess = agentAccess;
        return this;
    }
    public AgentInfoAgentAccess getAgentAccess() {
        return this.agentAccess;
    }

    public AgentInfo setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public AgentInfo setAgentType(String agentType) {
        this.agentType = agentType;
        return this;
    }
    public String getAgentType() {
        return this.agentType;
    }

    public AgentInfo setAllowedCapabilities(java.util.List<String> allowedCapabilities) {
        this.allowedCapabilities = allowedCapabilities;
        return this;
    }
    public java.util.List<String> getAllowedCapabilities() {
        return this.allowedCapabilities;
    }

    public AgentInfo setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public AgentInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AgentInfo setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public AgentInfo setModelAccess(AgentInfoModelAccess modelAccess) {
        this.modelAccess = modelAccess;
        return this;
    }
    public AgentInfoModelAccess getModelAccess() {
        return this.modelAccess;
    }

    public AgentInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AgentInfo setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public AgentInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AgentInfo setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static class AgentInfoAgentAccess extends TeaModel {
        /**
         * <p>The HTTP API ID associated with the Agent access capability. The frontend uses this ID to call existing HTTP API, route, consumer authorization, policy, and plugin query interfaces.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;httpApiId&quot;: &quot;api-abc123&quot; }</p>
         */
        @NameInMap("httpApiId")
        public String httpApiId;

        public static AgentInfoAgentAccess build(java.util.Map<String, ?> map) throws Exception {
            AgentInfoAgentAccess self = new AgentInfoAgentAccess();
            return TeaModel.build(map, self);
        }

        public AgentInfoAgentAccess setHttpApiId(String httpApiId) {
            this.httpApiId = httpApiId;
            return this;
        }
        public String getHttpApiId() {
            return this.httpApiId;
        }

    }

    public static class AgentInfoModelAccess extends TeaModel {
        /**
         * <p>The list of consumer identity bindings maintained by the Agent domain. The Model API ID and the consumer IDs in this list together identify the Agent identity and take effect on all routes of the Model API. Consumer details and their Model API authorization details can be obtained through existing Consumer API and consumer authorization query interfaces.</p>
         */
        @NameInMap("consumerIds")
        public java.util.List<String> consumerIds;

        /**
         * <p>The Model API ID associated with the model access capability. Model Access does not distinguish routes. The frontend uses this ID to query the Model API basic information and all routes.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;modelApiId&quot;: &quot;model-api-1&quot; }</p>
         */
        @NameInMap("modelApiId")
        public String modelApiId;

        public static AgentInfoModelAccess build(java.util.Map<String, ?> map) throws Exception {
            AgentInfoModelAccess self = new AgentInfoModelAccess();
            return TeaModel.build(map, self);
        }

        public AgentInfoModelAccess setConsumerIds(java.util.List<String> consumerIds) {
            this.consumerIds = consumerIds;
            return this;
        }
        public java.util.List<String> getConsumerIds() {
            return this.consumerIds;
        }

        public AgentInfoModelAccess setModelApiId(String modelApiId) {
            this.modelApiId = modelApiId;
            return this;
        }
        public String getModelApiId() {
            return this.modelApiId;
        }

    }

}
