// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateFlowInput extends TeaModel {
    /**
     * <p>工作流的定义内容，采用JSON或YAML格式</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("definition")
    public String definition;

    /**
     * <p>工作流的描述信息，用于说明该工作流的用途和功能</p>
     * 
     * <strong>example:</strong>
     * <p>Customer service automation flow</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>工作流的环境变量配置，包含一组命名变量列表</p>
     */
    @NameInMap("environmentConfiguration")
    public EnvironmentConfiguration environmentConfiguration;

    /**
     * <p>为工作流提供访问云服务权限的执行角色ARN</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1760720386195983:role/FlowExecutionRole</p>
     */
    @NameInMap("executionRoleArn")
    public String executionRoleArn;

    /**
     * <p>工作流的外部存储位置，如OSS路径</p>
     * 
     * <strong>example:</strong>
     * <p>oss://bucket/path</p>
     */
    @NameInMap("externalStorageLocation")
    public String externalStorageLocation;

    /**
     * <p>工作流的唯一标识名称，用于区分不同的工作流实例</p>
     * 
     * <strong>example:</strong>
     * <p>my-flow</p>
     */
    @NameInMap("flowName")
    public String flowName;

    /**
     * <p>工作流的日志配置</p>
     */
    @NameInMap("loggingConfiguration")
    public LoggingConfiguration loggingConfiguration;

    /**
     * <p>工作流所属的资源组标识符</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxsn4m4a4b4a</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>工作流的标签信息，用于资源分类和管理</p>
     * 
     * <strong>example:</strong>
     * <p>production,automation</p>
     */
    @NameInMap("tags")
    public java.util.List<String> tags;

    /**
     * <p>工作流的链路追踪配置</p>
     */
    @NameInMap("tracingConfiguration")
    public TracingConfiguration tracingConfiguration;

    /**
     * <p>工作流所属的工作空间标识符，用于资源隔离和权限管理</p>
     * 
     * <strong>example:</strong>
     * <p>ws-1234567890abcdef</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static UpdateFlowInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowInput self = new UpdateFlowInput();
        return TeaModel.build(map, self);
    }

    public UpdateFlowInput setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public UpdateFlowInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateFlowInput setEnvironmentConfiguration(EnvironmentConfiguration environmentConfiguration) {
        this.environmentConfiguration = environmentConfiguration;
        return this;
    }
    public EnvironmentConfiguration getEnvironmentConfiguration() {
        return this.environmentConfiguration;
    }

    public UpdateFlowInput setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }
    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    public UpdateFlowInput setExternalStorageLocation(String externalStorageLocation) {
        this.externalStorageLocation = externalStorageLocation;
        return this;
    }
    public String getExternalStorageLocation() {
        return this.externalStorageLocation;
    }

    public UpdateFlowInput setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public UpdateFlowInput setLoggingConfiguration(LoggingConfiguration loggingConfiguration) {
        this.loggingConfiguration = loggingConfiguration;
        return this;
    }
    public LoggingConfiguration getLoggingConfiguration() {
        return this.loggingConfiguration;
    }

    public UpdateFlowInput setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateFlowInput setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public UpdateFlowInput setTracingConfiguration(TracingConfiguration tracingConfiguration) {
        this.tracingConfiguration = tracingConfiguration;
        return this;
    }
    public TracingConfiguration getTracingConfiguration() {
        return this.tracingConfiguration;
    }

    public UpdateFlowInput setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
