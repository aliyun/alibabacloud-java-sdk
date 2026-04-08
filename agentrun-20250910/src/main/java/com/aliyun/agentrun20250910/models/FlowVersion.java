// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class FlowVersion extends TeaModel {
    /**
     * <p>工作流版本的创建时间，采用ISO 8601格式</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-10T10:30:00Z</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>工作流版本的定义内容（完整快照，仅在 GetFlowVersion 时返回）</p>
     * 
     * <strong>example:</strong>
     * <p>Type: StateMachine\nName: my-flow\n...</p>
     */
    @NameInMap("definition")
    public String definition;

    /**
     * <p>工作流版本的描述信息</p>
     * 
     * <strong>example:</strong>
     * <p>Version 1.0 - Initial release</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>工作流版本的环境变量配置（完整快照，仅在 GetFlowVersion 时返回）</p>
     */
    @NameInMap("environmentConfiguration")
    public EnvironmentConfiguration environmentConfiguration;

    /**
     * <p>工作流版本的外部存储位置（完整快照，仅在 GetFlowVersion 时返回）</p>
     * 
     * <strong>example:</strong>
     * <p>oss://bucket/path</p>
     */
    @NameInMap("externalStorageLocation")
    public String externalStorageLocation;

    /**
     * <p>工作流的唯一标识符</p>
     * 
     * <strong>example:</strong>
     * <p>flow-1234567890abcdef</p>
     */
    @NameInMap("flowId")
    public String flowId;

    @NameInMap("flowName")
    public String flowName;

    /**
     * <p>工作流版本号</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("flowVersion")
    public String flowVersion;

    /**
     * <p>工作流版本的日志配置（完整快照，仅在 GetFlowVersion 时返回）</p>
     */
    @NameInMap("loggingConfiguration")
    public LoggingConfiguration loggingConfiguration;

    /**
     * <p>工作流版本的链路追踪配置（完整快照，仅在 GetFlowVersion 时返回）</p>
     */
    @NameInMap("tracingConfiguration")
    public TracingConfiguration tracingConfiguration;

    public static FlowVersion build(java.util.Map<String, ?> map) throws Exception {
        FlowVersion self = new FlowVersion();
        return TeaModel.build(map, self);
    }

    public FlowVersion setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public FlowVersion setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public FlowVersion setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public FlowVersion setEnvironmentConfiguration(EnvironmentConfiguration environmentConfiguration) {
        this.environmentConfiguration = environmentConfiguration;
        return this;
    }
    public EnvironmentConfiguration getEnvironmentConfiguration() {
        return this.environmentConfiguration;
    }

    public FlowVersion setExternalStorageLocation(String externalStorageLocation) {
        this.externalStorageLocation = externalStorageLocation;
        return this;
    }
    public String getExternalStorageLocation() {
        return this.externalStorageLocation;
    }

    public FlowVersion setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public FlowVersion setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public FlowVersion setFlowVersion(String flowVersion) {
        this.flowVersion = flowVersion;
        return this;
    }
    public String getFlowVersion() {
        return this.flowVersion;
    }

    public FlowVersion setLoggingConfiguration(LoggingConfiguration loggingConfiguration) {
        this.loggingConfiguration = loggingConfiguration;
        return this;
    }
    public LoggingConfiguration getLoggingConfiguration() {
        return this.loggingConfiguration;
    }

    public FlowVersion setTracingConfiguration(TracingConfiguration tracingConfiguration) {
        this.tracingConfiguration = tracingConfiguration;
        return this;
    }
    public TracingConfiguration getTracingConfiguration() {
        return this.tracingConfiguration;
    }

}
