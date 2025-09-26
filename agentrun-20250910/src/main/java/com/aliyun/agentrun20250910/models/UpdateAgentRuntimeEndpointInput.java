// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateAgentRuntimeEndpointInput extends TeaModel {
    @NameInMap("agentRuntimeEndpointName")
    public String agentRuntimeEndpointName;

    @NameInMap("description")
    public String description;

    /**
     * <p>智能体运行时端点的路由配置，支持多版本权重分配</p>
     */
    @NameInMap("routingConfiguration")
    public RoutingConfiguration routingConfiguration;

    /**
     * <p>智能体运行时的目标版本</p>
     */
    @NameInMap("targetVersion")
    public String targetVersion;

    public static UpdateAgentRuntimeEndpointInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentRuntimeEndpointInput self = new UpdateAgentRuntimeEndpointInput();
        return TeaModel.build(map, self);
    }

    public UpdateAgentRuntimeEndpointInput setAgentRuntimeEndpointName(String agentRuntimeEndpointName) {
        this.agentRuntimeEndpointName = agentRuntimeEndpointName;
        return this;
    }
    public String getAgentRuntimeEndpointName() {
        return this.agentRuntimeEndpointName;
    }

    public UpdateAgentRuntimeEndpointInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAgentRuntimeEndpointInput setRoutingConfiguration(RoutingConfiguration routingConfiguration) {
        this.routingConfiguration = routingConfiguration;
        return this;
    }
    public RoutingConfiguration getRoutingConfiguration() {
        return this.routingConfiguration;
    }

    public UpdateAgentRuntimeEndpointInput setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }
    public String getTargetVersion() {
        return this.targetVersion;
    }

}
