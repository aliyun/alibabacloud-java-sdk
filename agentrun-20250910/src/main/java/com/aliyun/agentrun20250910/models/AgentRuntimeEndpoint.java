// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class AgentRuntimeEndpoint extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>acs:agentrun:cn-hangzhou:1760720386195983:runtime-endpoints/e56d483c-db80-4116-9ec4-25f16f5facfd</p>
     */
    @NameInMap("agentRuntimeEndpointArn")
    public String agentRuntimeEndpointArn;

    /**
     * <strong>example:</strong>
     * <p>are-1234567890abcdef</p>
     */
    @NameInMap("agentRuntimeEndpointId")
    public String agentRuntimeEndpointId;

    /**
     * <strong>example:</strong>
     * <p>production-endpoint</p>
     */
    @NameInMap("agentRuntimeEndpointName")
    public String agentRuntimeEndpointName;

    /**
     * <strong>example:</strong>
     * <p>ar-1234567890abcdef</p>
     */
    @NameInMap("agentRuntimeId")
    public String agentRuntimeId;

    /**
     * <strong>example:</strong>
     * <p>Production endpoint for customer service agent</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>智能体运行时端点的公网访问地址</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://ar-1234567890abcdef.cn-hangzhou.agentrun.aliyuncs.com">https://ar-1234567890abcdef.cn-hangzhou.agentrun.aliyuncs.com</a></p>
     */
    @NameInMap("endpointPublicUrl")
    public String endpointPublicUrl;

    /**
     * <p>智能体运行时端点的路由配置，支持多版本权重分配</p>
     */
    @NameInMap("routingConfiguration")
    public RoutingConfiguration routingConfiguration;

    /**
     * <strong>example:</strong>
     * <p>ACTIVE</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>Endpoint is active and ready</p>
     */
    @NameInMap("statusReason")
    public String statusReason;

    /**
     * <strong>example:</strong>
     * <p>LATEST</p>
     */
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
