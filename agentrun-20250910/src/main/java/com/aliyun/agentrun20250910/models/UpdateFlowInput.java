// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateFlowInput extends TeaModel {
    /**
     * <p>The definition content of the workflow, in JSON or YAML format</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("definition")
    public String definition;

    /**
     * <p>The description of the workflow, used to explain its purpose and functionality</p>
     * 
     * <strong>example:</strong>
     * <p>Customer service automation flow</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Whether to disable public network access for the workflow, serving as the default policy at the workflow level. When FlowEndpoint is not specified, this value will be inherited</p>
     */
    @NameInMap("disablePublicNetworkAccess")
    public Boolean disablePublicNetworkAccess;

    /**
     * <p>The environment variable configuration of the workflow, containing a list of named variables</p>
     */
    @NameInMap("environmentConfiguration")
    public EnvironmentConfiguration environmentConfiguration;

    /**
     * <p>The execution role ARN that grants the workflow access permissions to cloud services</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789012:role/FlowExecutionRole</p>
     */
    @NameInMap("executionRoleArn")
    public String executionRoleArn;

    /**
     * <p>The external storage location of the workflow, such as an OSS path</p>
     * 
     * <strong>example:</strong>
     * <p>oss://bucket/path</p>
     */
    @NameInMap("externalStorageLocation")
    public String externalStorageLocation;

    /**
     * <p>The unique identifier name of the workflow, used to distinguish different workflow instances</p>
     * 
     * <strong>example:</strong>
     * <p>my-flow</p>
     */
    @NameInMap("flowName")
    public String flowName;

    /**
     * <p>The logging configuration of the workflow</p>
     */
    @NameInMap("loggingConfiguration")
    public LoggingConfiguration loggingConfiguration;

    /**
     * <p>The resource group identifier to which the workflow belongs</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxsn4m4a4b4a</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The distributed tracing configuration of the workflow</p>
     */
    @NameInMap("tracingConfiguration")
    public TracingConfiguration tracingConfiguration;

    /**
     * <p>The workspace identifier to which the workflow belongs, used for resource isolation and permission management</p>
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

    public UpdateFlowInput setDisablePublicNetworkAccess(Boolean disablePublicNetworkAccess) {
        this.disablePublicNetworkAccess = disablePublicNetworkAccess;
        return this;
    }
    public Boolean getDisablePublicNetworkAccess() {
        return this.disablePublicNetworkAccess;
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
