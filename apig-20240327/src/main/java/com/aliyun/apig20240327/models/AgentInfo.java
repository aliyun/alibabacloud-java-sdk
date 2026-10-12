// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AgentInfo extends TeaModel {
    /**
     * <p>The associated resource information for the agent access capability. If the agent access capability is not configured, null is always returned.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("agentAccess")
    public AgentInfoAgentAccess agentAccess;

    /**
     * <p>The agent ID.</p>
     * 
     * <strong>example:</strong>
     * <p>agent-1</p>
     */
    @NameInMap("agentId")
    public String agentId;

    /**
     * <p>The type of the agent. DashScope allows only agent access. Dify allows agent access and model access. ClaudeCode allows only model access. Custom allows agent access and model access.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom</p>
     */
    @NameInMap("agentType")
    public String agentType;

    /**
     * <p>The list of capabilities that the current agent type is allowed to configure. This field does not indicate that the capabilities are already configured. To check whether a capability is configured, determine whether agentAccess or modelAccess is null.</p>
     */
    @NameInMap("allowedCapabilities")
    public java.util.List<String> allowedCapabilities;

    /**
     * <p>The time when the agent was created. The value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1755129600000</p>
     */
    @NameInMap("createTimestamp")
    public Long createTimestamp;

    /**
     * <p>The description of the agent.</p>
     * 
     * <strong>example:</strong>
     * <p>custom agent</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The ID of the gateway to which the agent belongs. When reading the associated API deployment configuration, select the configuration whose gatewayId matches this value.</p>
     * 
     * <strong>example:</strong>
     * <p>gateway-1</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The associated resource information for the model access capability. If the model access capability is not configured, null is always returned.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("modelAccess")
    public AgentInfoModelAccess modelAccess;

    /**
     * <p>The name of the agent.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The ID of the resource group where the agent is saved.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-1</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The status of the agent. In the current phase, agents that are successfully created and can be queried always return Ready. Internal creation or compensation statuses are not returned externally.</p>
     * 
     * <strong>example:</strong>
     * <p>Ready</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The time when the agent was last updated. The value is a UNIX timestamp in milliseconds.</p>
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
         * <p>The ID of the HTTP API associated with the agent access capability. The frontend uses this ID to call existing HTTP API, route, consumer authorization, policy, and plugin query operations.</p>
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
         * <p>The list of consumer identity bindings maintained by the agent domain. The Model API ID and the consumer IDs in the list jointly identify the agent and take effect for all routes of the Model API. You can obtain consumer details and their Model API authorization details by calling existing Consumer API and consumer authorization query operations.</p>
         */
        @NameInMap("consumerIds")
        public java.util.List<String> consumerIds;

        /**
         * <p>The ID of the Model API associated with the model access capability. Model access does not distinguish between routes. The frontend uses this ID to query the basic information and all routes of the Model API.</p>
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
