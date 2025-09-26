// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class AgentRuntimeEndpoint extends TeaModel {
    @NameInMap("agentRuntimeEndpointArn")
    public String agentRuntimeEndpointArn;

    @NameInMap("agentRuntimeEndpointId")
    public String agentRuntimeEndpointId;

    @NameInMap("agentRuntimeEndpointName")
    public String agentRuntimeEndpointName;

    @NameInMap("agentRuntimeId")
    public String agentRuntimeId;

    @NameInMap("description")
    public String description;

    /**
     * <p>智能体运行时端点的公网访问地址</p>
     */
    @NameInMap("endpointPublicUrl")
    public String endpointPublicUrl;

    /**
     * <p>智能体运行时端点的路由配置，支持多版本权重分配</p>
     */
    @NameInMap("routingConfiguration")
    public RoutingConfiguration routingConfiguration;

    @NameInMap("status")
    public String status;

    @NameInMap("statusReason")
    public String statusReason;

    @NameInMap("targetVersion")
    public String targetVersion;

    public static AgentRuntimeEndpoint build(java.util.Map<String, ?> map) throws Exception {
        AgentRuntimeEndpoint self = new AgentRuntimeEndpoint();
        return TeaModel.build(map, self);
    }

    public AgentRuntimeEndpoint setAgentRuntimeEndpointArn(String agentRuntimeEndpointArn) {
        this.agentRuntimeEndpointArn = agentRuntimeEndpointArn;
        return this;
    }
    public String getAgentRuntimeEndpointArn() {
        return this.agentRuntimeEndpointArn;
    }

    public AgentRuntimeEndpoint setAgentRuntimeEndpointId(String agentRuntimeEndpointId) {
        this.agentRuntimeEndpointId = agentRuntimeEndpointId;
        return this;
    }
    public String getAgentRuntimeEndpointId() {
        return this.agentRuntimeEndpointId;
    }

    public AgentRuntimeEndpoint setAgentRuntimeEndpointName(String agentRuntimeEndpointName) {
        this.agentRuntimeEndpointName = agentRuntimeEndpointName;
        return this;
    }
    public String getAgentRuntimeEndpointName() {
        return this.agentRuntimeEndpointName;
    }

    public AgentRuntimeEndpoint setAgentRuntimeId(String agentRuntimeId) {
        this.agentRuntimeId = agentRuntimeId;
        return this;
    }
    public String getAgentRuntimeId() {
        return this.agentRuntimeId;
    }

    public AgentRuntimeEndpoint setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AgentRuntimeEndpoint setEndpointPublicUrl(String endpointPublicUrl) {
        this.endpointPublicUrl = endpointPublicUrl;
        return this;
    }
    public String getEndpointPublicUrl() {
        return this.endpointPublicUrl;
    }

    public AgentRuntimeEndpoint setRoutingConfiguration(RoutingConfiguration routingConfiguration) {
        this.routingConfiguration = routingConfiguration;
        return this;
    }
    public RoutingConfiguration getRoutingConfiguration() {
        return this.routingConfiguration;
    }

    public AgentRuntimeEndpoint setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AgentRuntimeEndpoint setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

    public AgentRuntimeEndpoint setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }
    public String getTargetVersion() {
        return this.targetVersion;
    }

}
