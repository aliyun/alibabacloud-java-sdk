// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateFlowEndpointInput extends TeaModel {
    /**
     * <p>The description of the flow endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>Production endpoint for flow</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether to disable public network access for the flow endpoint.</p>
     */
    @NameInMap("disablePublicNetworkAccess")
    public Boolean disablePublicNetworkAccess;

    /**
     * <p>The unique name of the flow endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>my-flow-endpoint</p>
     */
    @NameInMap("flowEndpointName")
    public String flowEndpointName;

    /**
     * <p>The routing configuration that defines traffic distribution for the flow endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("routingConfiguration")
    public java.util.List<FlowEndpointRoutingConfig> routingConfiguration;

    /**
     * <p>The target version for the flow endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("targetVersion")
    public String targetVersion;

    public static UpdateFlowEndpointInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowEndpointInput self = new UpdateFlowEndpointInput();
        return TeaModel.build(map, self);
    }

    public UpdateFlowEndpointInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateFlowEndpointInput setDisablePublicNetworkAccess(Boolean disablePublicNetworkAccess) {
        this.disablePublicNetworkAccess = disablePublicNetworkAccess;
        return this;
    }
    public Boolean getDisablePublicNetworkAccess() {
        return this.disablePublicNetworkAccess;
    }

    public UpdateFlowEndpointInput setFlowEndpointName(String flowEndpointName) {
        this.flowEndpointName = flowEndpointName;
        return this;
    }
    public String getFlowEndpointName() {
        return this.flowEndpointName;
    }

    public UpdateFlowEndpointInput setRoutingConfiguration(java.util.List<FlowEndpointRoutingConfig> routingConfiguration) {
        this.routingConfiguration = routingConfiguration;
        return this;
    }
    public java.util.List<FlowEndpointRoutingConfig> getRoutingConfiguration() {
        return this.routingConfiguration;
    }

    public UpdateFlowEndpointInput setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }
    public String getTargetVersion() {
        return this.targetVersion;
    }

}
