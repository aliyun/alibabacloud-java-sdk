// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateModelProxyInput extends TeaModel {
    /**
     * <p>Specifies the configuration for Application Real-Time Monitoring Service (ARMS).</p>
     */
    @NameInMap("armsConfiguration")
    public ArmsConfiguration armsConfiguration;

    /**
     * <p>The number of CPU cores for the proxy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("cpu")
    public Float cpu;

    /**
     * <p>The name of the credential for accessing the model service.</p>
     * 
     * <strong>example:</strong>
     * <p>credentialName</p>
     */
    @NameInMap("credentialName")
    public String credentialName;

    /**
     * <p>Optional. A custom description for the model proxy.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The ARN of the execution role the service assumes to act on your behalf.</p>
     * 
     * <strong>example:</strong>
     * <p>executionRoleArn</p>
     */
    @NameInMap("executionRoleArn")
    public String executionRoleArn;

    /**
     * <p>The version of LiteLLM for the proxy.</p>
     * 
     * <strong>example:</strong>
     * <p>litellmVersion</p>
     */
    @NameInMap("litellmVersion")
    public String litellmVersion;

    /**
     * <p>The Log Service (SLS) configuration for the Agent runtime.</p>
     */
    @NameInMap("logConfiguration")
    public LogConfiguration logConfiguration;

    /**
     * <p>The memory size for the proxy, in GiB.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>31</p>
     */
    @NameInMap("memory")
    public Integer memory;

    /**
     * <p>The unique name for the model proxy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>modelProxyName</p>
     */
    @NameInMap("modelProxyName")
    public String modelProxyName;

    /**
     * <p>The model type. Valid values:</p>
     * <ul>
     * <li><p><code>system</code>: Specifies a system model.</p>
     * </li>
     * <li><p><code>deployment</code>: Specifies a custom deployment model.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>system</p>
     */
    @NameInMap("modelType")
    public String modelType;

    /**
     * <p>Specifies the network configuration for the proxy.</p>
     */
    @NameInMap("networkConfiguration")
    public NetworkConfiguration networkConfiguration;

    /**
     * <p>The configuration settings for the proxy.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("proxyConfig")
    public ProxyConfig proxyConfig;

    /**
     * <p>Specifies the operational mode of the proxy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>proxyMode</p>
     */
    @NameInMap("proxyMode")
    public String proxyMode;

    /**
     * <p>The ID of the region for the model service.</p>
     * 
     * <strong>example:</strong>
     * <p>serviceRegionId</p>
     */
    @NameInMap("serviceRegionId")
    public String serviceRegionId;

    /**
     * <p>The ID of the workspace that contains the model proxy.</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static CreateModelProxyInput build(java.util.Map<String, ?> map) throws Exception {
        CreateModelProxyInput self = new CreateModelProxyInput();
        return TeaModel.build(map, self);
    }

    public CreateModelProxyInput setArmsConfiguration(ArmsConfiguration armsConfiguration) {
        this.armsConfiguration = armsConfiguration;
        return this;
    }
    public ArmsConfiguration getArmsConfiguration() {
        return this.armsConfiguration;
    }

    public CreateModelProxyInput setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public CreateModelProxyInput setCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }
    public String getCredentialName() {
        return this.credentialName;
    }

    public CreateModelProxyInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateModelProxyInput setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }
    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    public CreateModelProxyInput setLitellmVersion(String litellmVersion) {
        this.litellmVersion = litellmVersion;
        return this;
    }
    public String getLitellmVersion() {
        return this.litellmVersion;
    }

    public CreateModelProxyInput setLogConfiguration(LogConfiguration logConfiguration) {
        this.logConfiguration = logConfiguration;
        return this;
    }
    public LogConfiguration getLogConfiguration() {
        return this.logConfiguration;
    }

    public CreateModelProxyInput setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public CreateModelProxyInput setModelProxyName(String modelProxyName) {
        this.modelProxyName = modelProxyName;
        return this;
    }
    public String getModelProxyName() {
        return this.modelProxyName;
    }

    public CreateModelProxyInput setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public CreateModelProxyInput setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    public CreateModelProxyInput setProxyConfig(ProxyConfig proxyConfig) {
        this.proxyConfig = proxyConfig;
        return this;
    }
    public ProxyConfig getProxyConfig() {
        return this.proxyConfig;
    }

    public CreateModelProxyInput setProxyMode(String proxyMode) {
        this.proxyMode = proxyMode;
        return this;
    }
    public String getProxyMode() {
        return this.proxyMode;
    }

    public CreateModelProxyInput setServiceRegionId(String serviceRegionId) {
        this.serviceRegionId = serviceRegionId;
        return this;
    }
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    public CreateModelProxyInput setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
