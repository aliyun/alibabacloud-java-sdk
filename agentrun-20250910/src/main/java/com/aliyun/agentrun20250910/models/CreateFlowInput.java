// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateFlowInput extends TeaModel {
    /**
     * <p>The definition of the workflow in JSON or YAML format.</p>
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
     * <p>Specifies whether to disable public network access for the workflow. This value serves as the default policy at the workflow level. If FlowEndpoint is not specified, this value is inherited.</p>
     */
    @NameInMap("disablePublicNetworkAccess")
    public Boolean disablePublicNetworkAccess;

    /**
     * <p>The environment variable configuration of the workflow, which contains a list of named variables.</p>
     */
    @NameInMap("environmentConfiguration")
    public EnvironmentConfiguration environmentConfiguration;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the execution role that grants the workflow permissions to access cloud services.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789012:role/FlowExecutionRole</p>
     */
    @NameInMap("executionRoleArn")
    public String executionRoleArn;

    /**
     * <p>The external storage location of the workflow, such as an OSS path.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://bucket/path</p>
     */
    @NameInMap("externalStorageLocation")
    public String externalStorageLocation;

    /**
     * <p>The unique name of the workflow, which is used to distinguish different workflow instances.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-flow</p>
     */
    @NameInMap("flowName")
    public String flowName;

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
     * <p>The ID of the workspace to which the workflow belongs. This parameter is used for resource isolation and permission management.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-1234567890abcdef</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static CreateFlowInput build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowInput self = new CreateFlowInput();
        return TeaModel.build(map, self);
    }

    public CreateFlowInput setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public CreateFlowInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateFlowInput setDisablePublicNetworkAccess(Boolean disablePublicNetworkAccess) {
        this.disablePublicNetworkAccess = disablePublicNetworkAccess;
        return this;
    }
    public Boolean getDisablePublicNetworkAccess() {
        return this.disablePublicNetworkAccess;
    }

    public CreateFlowInput setEnvironmentConfiguration(EnvironmentConfiguration environmentConfiguration) {
        this.environmentConfiguration = environmentConfiguration;
        return this;
    }
    public EnvironmentConfiguration getEnvironmentConfiguration() {
        return this.environmentConfiguration;
    }

    public CreateFlowInput setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }
    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    public CreateFlowInput setExternalStorageLocation(String externalStorageLocation) {
        this.externalStorageLocation = externalStorageLocation;
        return this;
    }
    public String getExternalStorageLocation() {
        return this.externalStorageLocation;
    }

    public CreateFlowInput setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public CreateFlowInput setLoggingConfiguration(LoggingConfiguration loggingConfiguration) {
        this.loggingConfiguration = loggingConfiguration;
        return this;
    }
    public LoggingConfiguration getLoggingConfiguration() {
        return this.loggingConfiguration;
    }

    public CreateFlowInput setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateFlowInput setTracingConfiguration(TracingConfiguration tracingConfiguration) {
        this.tracingConfiguration = tracingConfiguration;
        return this;
    }
    public TracingConfiguration getTracingConfiguration() {
        return this.tracingConfiguration;
    }

    public CreateFlowInput setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
