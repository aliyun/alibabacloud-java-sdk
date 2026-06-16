// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class Flow extends TeaModel {
    /**
     * <p>The time when the workflow was created, in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-10T10:30:00Z</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>The definition of the workflow.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("definition")
    public String definition;

    /**
     * <p>The description of the workflow, which explains the purpose and functionality of the workflow.</p>
     * 
     * <strong>example:</strong>
     * <p>Customer service automation flow</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether to disable public network access for the workflow. This setting serves as the default policy at the workflow level.</p>
     */
    @NameInMap("disablePublicNetworkAccess")
    public Boolean disablePublicNetworkAccess;

    /**
     * <p>The environment variable configuration of the workflow, which contains a list of named variables.</p>
     */
    @NameInMap("environmentConfiguration")
    public EnvironmentConfiguration environmentConfiguration;

    /**
     * <p>The ARN of the execution role that grants the workflow permissions to access cloud services.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789012:role/FlowExecutionRole</p>
     */
    @NameInMap("executionRoleArn")
    public String executionRoleArn;

    /**
     * <p>The external storage location of the workflow.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://bucket/path</p>
     */
    @NameInMap("externalStorageLocation")
    public String externalStorageLocation;

    /**
     * <p>The globally unique Alibaba Cloud Resource Name (ARN) of the workflow.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:agentrun:cn-hangzhou:123456789012:workspaces/ws-xxx/flows/flow-xxx</p>
     */
    @NameInMap("flowArn")
    public String flowArn;

    /**
     * <p>The unique identifier of the workflow.</p>
     * 
     * <strong>example:</strong>
     * <p>flow-1234567890abcdef</p>
     */
    @NameInMap("flowId")
    public String flowId;

    /**
     * <p>The name of the workflow, which is used to identify and distinguish different workflow instances.</p>
     * 
     * <strong>example:</strong>
     * <p>my-flow</p>
     */
    @NameInMap("flowName")
    public String flowName;

    /**
     * <p>The time when the workflow was last updated, in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-10T11:45:00Z</p>
     */
    @NameInMap("lastUpdatedAt")
    public String lastUpdatedAt;

    /**
     * <p>The logging configuration of the workflow.</p>
     */
    @NameInMap("loggingConfiguration")
    public LoggingConfiguration loggingConfiguration;

    /**
     * <p>The ID of the resource group to which the workflow belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxsn4m4a4b4a</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The Tracing Analysis configuration of the workflow.</p>
     */
    @NameInMap("tracingConfiguration")
    public TracingConfiguration tracingConfiguration;

    /**
     * <p>The ID of the workspace to which the workflow belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-1234567890abcdef</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static Flow build(java.util.Map<String, ?> map) throws Exception {
        Flow self = new Flow();
        return TeaModel.build(map, self);
    }

    public Flow setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public Flow setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public Flow setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Flow setDisablePublicNetworkAccess(Boolean disablePublicNetworkAccess) {
        this.disablePublicNetworkAccess = disablePublicNetworkAccess;
        return this;
    }
    public Boolean getDisablePublicNetworkAccess() {
        return this.disablePublicNetworkAccess;
    }

    public Flow setEnvironmentConfiguration(EnvironmentConfiguration environmentConfiguration) {
        this.environmentConfiguration = environmentConfiguration;
        return this;
    }
    public EnvironmentConfiguration getEnvironmentConfiguration() {
        return this.environmentConfiguration;
    }

    public Flow setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }
    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    public Flow setExternalStorageLocation(String externalStorageLocation) {
        this.externalStorageLocation = externalStorageLocation;
        return this;
    }
    public String getExternalStorageLocation() {
        return this.externalStorageLocation;
    }

    public Flow setFlowArn(String flowArn) {
        this.flowArn = flowArn;
        return this;
    }
    public String getFlowArn() {
        return this.flowArn;
    }

    public Flow setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public Flow setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public Flow setLastUpdatedAt(String lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }
    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public Flow setLoggingConfiguration(LoggingConfiguration loggingConfiguration) {
        this.loggingConfiguration = loggingConfiguration;
        return this;
    }
    public LoggingConfiguration getLoggingConfiguration() {
        return this.loggingConfiguration;
    }

    public Flow setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public Flow setTracingConfiguration(TracingConfiguration tracingConfiguration) {
        this.tracingConfiguration = tracingConfiguration;
        return this;
    }
    public TracingConfiguration getTracingConfiguration() {
        return this.tracingConfiguration;
    }

    public Flow setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
