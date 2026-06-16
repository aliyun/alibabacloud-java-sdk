// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateAgentRuntimeEndpointInput extends TeaModel {
    /**
     * <p>The name of the agent runtime endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>production-endpoint</p>
     */
    @NameInMap("agentRuntimeEndpointName")
    public String agentRuntimeEndpointName;

    /**
     * <p>The description of the agent runtime endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>Production endpoint for customer service agent</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether to disable public network access for the endpoint.</p>
     */
    @NameInMap("disablePublicNetworkAccess")
    public Boolean disablePublicNetworkAccess;

    /**
     * <p>The routing configuration for the agent runtime endpoint. This configuration distributes traffic to multiple versions based on weights.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("routingConfiguration")
    public RoutingConfiguration routingConfiguration;

    /**
     * <p>端点的弹性伸缩配置，包括最小实例数和定时扩容策略（复用 ScalingConfig）</p>
     */
    @NameInMap("scalingConfig")
    public ScalingConfig scalingConfig;

    /**
     * <p>The target version of the agent runtime.</p>
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

    public CreateAgentRuntimeEndpointInput setDisablePublicNetworkAccess(Boolean disablePublicNetworkAccess) {
        this.disablePublicNetworkAccess = disablePublicNetworkAccess;
        return this;
    }
    public Boolean getDisablePublicNetworkAccess() {
        return this.disablePublicNetworkAccess;
    }

    public CreateAgentRuntimeEndpointInput setRoutingConfiguration(RoutingConfiguration routingConfiguration) {
        this.routingConfiguration = routingConfiguration;
        return this;
    }
    public RoutingConfiguration getRoutingConfiguration() {
        return this.routingConfiguration;
    }

    public CreateAgentRuntimeEndpointInput setScalingConfig(ScalingConfig scalingConfig) {
        this.scalingConfig = scalingConfig;
        return this;
    }
    public ScalingConfig getScalingConfig() {
        return this.scalingConfig;
    }

    public CreateAgentRuntimeEndpointInput setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }
    public String getTargetVersion() {
        return this.targetVersion;
    }

}
