// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateModelServiceInput extends TeaModel {
    /**
     * <p>The credential name for authenticating with the cloud provider.</p>
     * 
     * <strong>example:</strong>
     * <p>credentialName</p>
     */
    @NameInMap("credentialName")
    public String credentialName;

    /**
     * <p>An optional description of the model service.</p>
     * 
     * <strong>example:</strong>
     * <p>Auto generate task: Pipeline[pipeline-run-1742178254775] pipelineTemplate[data-export-service-online-iVnQB5] taskTemplate[serverless-runner-task], time[2025-03-17T02:24:36Z]</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>A list of configurations for models in the service.</p>
     */
    @NameInMap("modelInfoConfigs")
    public java.util.List<ModelInfoConfig> modelInfoConfigs;

    /**
     * <p>The name of the model service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>modelServiceName</p>
     */
    @NameInMap("modelServiceName")
    public String modelServiceName;

    /**
     * <p>The model type. Valid values include:</p>
     * <ul>
     * <li><p><code>system</code>: A built-in model that the service provides.</p>
     * </li>
     * <li><p><code>deployment</code>: A custom model that a user deploys.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>system</p>
     */
    @NameInMap("modelType")
    public String modelType;

    /**
     * <p>The network configuration for the model service. See <code>NetworkConfiguration</code> for details.</p>
     */
    @NameInMap("networkConfiguration")
    public NetworkConfiguration networkConfiguration;

    /**
     * <p>The cloud provider for the model service. Currently, only Alibaba Cloud is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Aliyun</p>
     */
    @NameInMap("provider")
    public String provider;

    /**
     * <p>Provider-specific configuration settings. See <code>ProviderSettings</code> for details.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("providerSettings")
    public ProviderSettings providerSettings;

    /**
     * <p>The ID of the workspace in which to create the model service.</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static CreateModelServiceInput build(java.util.Map<String, ?> map) throws Exception {
        CreateModelServiceInput self = new CreateModelServiceInput();
        return TeaModel.build(map, self);
    }

    public CreateModelServiceInput setCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }
    public String getCredentialName() {
        return this.credentialName;
    }

    public CreateModelServiceInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateModelServiceInput setModelInfoConfigs(java.util.List<ModelInfoConfig> modelInfoConfigs) {
        this.modelInfoConfigs = modelInfoConfigs;
        return this;
    }
    public java.util.List<ModelInfoConfig> getModelInfoConfigs() {
        return this.modelInfoConfigs;
    }

    public CreateModelServiceInput setModelServiceName(String modelServiceName) {
        this.modelServiceName = modelServiceName;
        return this;
    }
    public String getModelServiceName() {
        return this.modelServiceName;
    }

    public CreateModelServiceInput setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public CreateModelServiceInput setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    public CreateModelServiceInput setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public CreateModelServiceInput setProviderSettings(ProviderSettings providerSettings) {
        this.providerSettings = providerSettings;
        return this;
    }
    public ProviderSettings getProviderSettings() {
        return this.providerSettings;
    }

    public CreateModelServiceInput setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
