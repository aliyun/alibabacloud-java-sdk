// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class FlowEndpoint extends TeaModel {
    /**
     * <p>工作流端点的创建时间，采用ISO 8601格式</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-10T10:30:00Z</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>工作流端点的描述信息</p>
     * 
     * <strong>example:</strong>
     * <p>Production endpoint for flow</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>工作流端点的全局唯一资源名称</p>
     * 
     * <strong>example:</strong>
     * <p>acs:agentrun:cn-hangzhou:1760720386195983:workspaces/ws-xxx/flows/flow-xxx/endpoints/fe-xxx</p>
     */
    @NameInMap("flowEndpointArn")
    public String flowEndpointArn;

    /**
     * <p>工作流端点的唯一标识符</p>
     * 
     * <strong>example:</strong>
     * <p>fe-1234567890abcdef</p>
     */
    @NameInMap("flowEndpointId")
    public String flowEndpointId;

    /**
     * <p>工作流端点的名称</p>
     * 
     * <strong>example:</strong>
     * <p>my-flow-endpoint</p>
     */
    @NameInMap("flowEndpointName")
    public String flowEndpointName;

    /**
     * <p>工作流的唯一标识符</p>
     * 
     * <strong>example:</strong>
     * <p>flow-1234567890abcdef</p>
     */
    @NameInMap("flowId")
    public String flowId;

    /**
     * <p>工作流端点最后一次更新的时间，采用ISO 8601格式</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-10T11:45:00Z</p>
     */
    @NameInMap("lastUpdatedAt")
    public String lastUpdatedAt;

    /**
     * <p>工作流端点的版本路由配置</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("routingConfiguration")
    public java.util.List<FlowEndpointRoutingConfig> routingConfiguration;

    /**
     * <p>工作流端点的标签信息</p>
     * 
     * <strong>example:</strong>
     * <p>production</p>
     */
    @NameInMap("tags")
    public java.util.List<String> tags;

    /**
     * <p>工作流端点指向的目标版本号</p>
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

    public FlowEndpoint setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public FlowEndpoint setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }
    public String getTargetVersion() {
        return this.targetVersion;
    }

}
