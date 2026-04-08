// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateFlowEndpointInput extends TeaModel {
    /**
     * <p>工作流端点的描述信息</p>
     * 
     * <strong>example:</strong>
     * <p>Production endpoint for flow</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>工作流端点的唯一标识名称</p>
     * 
     * <strong>example:</strong>
     * <p>my-flow-endpoint</p>
     */
    @NameInMap("flowEndpointName")
    public String flowEndpointName;

    /**
     * <p>工作流端点的版本路由配置，用于流量分配</p>
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

    public UpdateFlowEndpointInput setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public UpdateFlowEndpointInput setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }
    public String getTargetVersion() {
        return this.targetVersion;
    }

}
