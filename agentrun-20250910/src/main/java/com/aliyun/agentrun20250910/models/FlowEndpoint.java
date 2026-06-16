// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class FlowEndpoint extends TeaModel {
    /**
     * <p>The creation timestamp for the flow endpoint, in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-10T10:30:00Z</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>The description of the flow endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>Production endpoint for flow</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Set to true to disable public network access for this endpoint.</p>
     */
    @NameInMap("disablePublicNetworkAccess")
    public Boolean disablePublicNetworkAccess;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the flow endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:agentrun:cn-hangzhou:1760720386195983:workspaces/ws-xxx/flows/flow-xxx/endpoints/fe-xxx</p>
     */
    @NameInMap("flowEndpointArn")
    public String flowEndpointArn;

    /**
     * <p>The unique identifier of the flow endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>fe-1234567890abcdef</p>
     */
    @NameInMap("flowEndpointId")
    public String flowEndpointId;

    /**
     * <p>The name of the flow endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>my-flow-endpoint</p>
     */
    @NameInMap("flowEndpointName")
    public String flowEndpointName;

    /**
     * <p>The unique identifier of the flow.</p>
     * 
     * <strong>example:</strong>
     * <p>flow-1234567890abcdef</p>
     */
    @NameInMap("flowId")
    public String flowId;

    /**
     * <p>The last update timestamp for the flow endpoint, in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-10T11:45:00Z</p>
     */
    @NameInMap("lastUpdatedAt")
    public String lastUpdatedAt;

    /**
     * <p>The routing configuration that distributes traffic to different versions of the flow.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("routingConfiguration")
    public java.util.List<FlowEndpointRoutingConfig> routingConfiguration;

    /**
     * <p>The flow version targeted by the endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("targetVersion")
    public String targetVersion;

    public static FlowEndpoint build(java.util.Map<String, ?> map) throws Exception {
        FlowEndpoint self = new FlowEndpoint();
        return TeaModel.build(map, self);
    }

    public FlowEndpoint setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public FlowEndpoint setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public FlowEndpoint setDisablePublicNetworkAccess(Boolean disablePublicNetworkAccess) {
        this.disablePublicNetworkAccess = disablePublicNetworkAccess;
        return this;
    }
    public Boolean getDisablePublicNetworkAccess() {
        return this.disablePublicNetworkAccess;
    }

    public FlowEndpoint setFlowEndpointArn(String flowEndpointArn) {
        this.flowEndpointArn = flowEndpointArn;
        return this;
    }
    public String getFlowEndpointArn() {
        return this.flowEndpointArn;
    }

    public FlowEndpoint setFlowEndpointId(String flowEndpointId) {
        this.flowEndpointId = flowEndpointId;
        return this;
    }
    public String getFlowEndpointId() {
        return this.flowEndpointId;
    }

    public FlowEndpoint setFlowEndpointName(String flowEndpointName) {
        this.flowEndpointName = flowEndpointName;
        return this;
    }
    public String getFlowEndpointName() {
        return this.flowEndpointName;
    }

    public FlowEndpoint setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public FlowEndpoint setLastUpdatedAt(String lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }
    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public FlowEndpoint setRoutingConfiguration(java.util.List<FlowEndpointRoutingConfig> routingConfiguration) {
        this.routingConfiguration = routingConfiguration;
        return this;
    }
    public java.util.List<FlowEndpointRoutingConfig> getRoutingConfiguration() {
        return this.routingConfiguration;
    }

    public FlowEndpoint setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }
    public String getTargetVersion() {
        return this.targetVersion;
    }

}
