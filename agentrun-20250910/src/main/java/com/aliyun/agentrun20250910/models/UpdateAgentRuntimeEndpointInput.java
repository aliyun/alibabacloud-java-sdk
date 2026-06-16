// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateAgentRuntimeEndpointInput extends TeaModel {
    /**
     * <p>Agent runtime endpoint Name</p>
     * 
     * <strong>example:</strong>
     * <p>production-endpoint</p>
     */
    @NameInMap("agentRuntimeEndpointName")
    public String agentRuntimeEndpointName;

    /**
     * <p>为 true 时删除该端点的弹性配置</p>
     */
    @NameInMap("deleteScalingConfig")
    public Boolean deleteScalingConfig;

    /**
     * <p>Description</p>
     * 
     * <strong>example:</strong>
     * <p>Updated endpoint configuration</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Whether to disable public network access for this endpoint</p>
     */
    @NameInMap("disablePublicNetworkAccess")
    public Boolean disablePublicNetworkAccess;

    /**
     * <p>The Ingress configuration of the agent runtime endpoint, which supports weight assignment across multiple versions</p>
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
     * <p>Target Version of the agent runtime</p>
     * 
     * <strong>example:</strong>
     * <p>LATEST</p>
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

    public UpdateAgentRuntimeEndpointInput setDeleteScalingConfig(Boolean deleteScalingConfig) {
        this.deleteScalingConfig = deleteScalingConfig;
        return this;
    }
    public Boolean getDeleteScalingConfig() {
        return this.deleteScalingConfig;
    }

    public UpdateAgentRuntimeEndpointInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAgentRuntimeEndpointInput setDisablePublicNetworkAccess(Boolean disablePublicNetworkAccess) {
        this.disablePublicNetworkAccess = disablePublicNetworkAccess;
        return this;
    }
    public Boolean getDisablePublicNetworkAccess() {
        return this.disablePublicNetworkAccess;
    }

    public UpdateAgentRuntimeEndpointInput setRoutingConfiguration(RoutingConfiguration routingConfiguration) {
        this.routingConfiguration = routingConfiguration;
        return this;
    }
    public RoutingConfiguration getRoutingConfiguration() {
        return this.routingConfiguration;
    }

    public UpdateAgentRuntimeEndpointInput setScalingConfig(ScalingConfig scalingConfig) {
        this.scalingConfig = scalingConfig;
        return this;
    }
    public ScalingConfig getScalingConfig() {
        return this.scalingConfig;
    }

    public UpdateAgentRuntimeEndpointInput setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }
    public String getTargetVersion() {
        return this.targetVersion;
    }

}
