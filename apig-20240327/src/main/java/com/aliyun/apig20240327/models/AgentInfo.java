// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AgentInfo extends TeaModel {
    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("agentAccess")
    public AgentInfoAgentAccess agentAccess;

    @NameInMap("agentId")
    public String agentId;

    @NameInMap("agentType")
    public String agentType;

    @NameInMap("allowedCapabilities")
    public java.util.List<String> allowedCapabilities;

    @NameInMap("createTimestamp")
    public Long createTimestamp;

    @NameInMap("description")
    public String description;

    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("modelAccess")
    public AgentInfoModelAccess modelAccess;

    @NameInMap("name")
    public String name;

    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    @NameInMap("status")
    public String status;

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
        @NameInMap("consumerIds")
        public java.util.List<String> consumerIds;

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
