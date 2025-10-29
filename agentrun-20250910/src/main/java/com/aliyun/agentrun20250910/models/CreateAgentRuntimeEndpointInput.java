// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateAgentRuntimeEndpointInput extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>production-endpoint</p>
     */
    @NameInMap("agentRuntimeEndpointName")
    public String agentRuntimeEndpointName;

    /**
     * <strong>example:</strong>
     * <p>Production endpoint for customer service agent</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>智能体运行时端点的路由配置，支持多版本权重分配</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("routingConfiguration")
    public RoutingConfiguration routingConfiguration;

    /**
     * <p>智能体运行时的目标版本</p>
     * 
     * <strong>example:</strong>
     * <p>LATEST</p>
     */
    @NameInMap("targetVersion")
    public String targetVersion;

    public static CreateAgentRuntimeEndpointInput build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentRuntimeEndpointInput self = new CreateAgentRuntimeEndpointInput();
        return TeaModel.build(map, self);
    }

    public CreateAgentRuntimeEndpointInput setAgentRuntimeEndpointName(String agentRuntimeEndpointName) {
        this.agentRuntimeEndpointName = agentRuntimeEndpointName;
        return this;
    }
    public String getAgentRuntimeEndpointName() {
        return this.agentRuntimeEndpointName;
    }

    public CreateAgentRuntimeEndpointInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAgentRuntimeEndpointInput setRoutingConfiguration(RoutingConfiguration routingConfiguration) {
        this.routingConfiguration = routingConfiguration;
        return this;
    }
    public RoutingConfiguration getRoutingConfiguration() {
        return this.routingConfiguration;
    }

    public CreateAgentRuntimeEndpointInput setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }
    public String getTargetVersion() {
        return this.targetVersion;
    }

}
