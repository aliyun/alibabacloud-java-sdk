// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateFlowEndpointInput extends TeaModel {
    /**
     * <p>The description of the flow endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>Production endpoint for flow</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Whether to disable public network access for the endpoint. If unspecified, the endpoint inherits this setting from its parent workflow.</p>
     */
    @NameInMap("disablePublicNetworkAccess")
    public Boolean disablePublicNetworkAccess;

    /**
     * <p>The unique name of the flow endpoint.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-flow-endpoint</p>
     */
    @NameInMap("flowEndpointName")
    public String flowEndpointName;

    /**
     * <p>The routing configuration that defines traffic distribution across different flow versions.</p>
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

    public static CreateFlowEndpointInput build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowEndpointInput self = new CreateFlowEndpointInput();
        return TeaModel.build(map, self);
    }

    public CreateFlowEndpointInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateFlowEndpointInput setDisablePublicNetworkAccess(Boolean disablePublicNetworkAccess) {
        this.disablePublicNetworkAccess = disablePublicNetworkAccess;
        return this;
    }
    public Boolean getDisablePublicNetworkAccess() {
        return this.disablePublicNetworkAccess;
    }

    public CreateFlowEndpointInput setFlowEndpointName(String flowEndpointName) {
        this.flowEndpointName = flowEndpointName;
        return this;
    }
    public String getFlowEndpointName() {
        return this.flowEndpointName;
    }

    public CreateFlowEndpointInput setRoutingConfiguration(java.util.List<FlowEndpointRoutingConfig> routingConfiguration) {
        this.routingConfiguration = routingConfiguration;
        return this;
    }
    public java.util.List<FlowEndpointRoutingConfig> getRoutingConfiguration() {
        return this.routingConfiguration;
    }

    public CreateFlowEndpointInput setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }
    public String getTargetVersion() {
        return this.targetVersion;
    }

}
