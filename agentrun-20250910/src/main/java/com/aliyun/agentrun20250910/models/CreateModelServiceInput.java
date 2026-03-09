// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateModelServiceInput extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>credentialName</p>
     */
    @NameInMap("credentialName")
    public String credentialName;

    /**
     * <strong>example:</strong>
     * <p>Auto generate task: Pipeline[pipeline-run-1742178254775] pipelineTemplate[data-export-service-online-iVnQB5] taskTemplate[serverless-runner-task], time[2025-03-17T02:24:36Z]</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>modelInfoConfigs</p>
     */
    @NameInMap("modelInfoConfigs")
    public java.util.List<ModelInfoConfig> modelInfoConfigs;

    /**
     * <p>modelServiceName</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>modelServiceName</p>
     */
    @NameInMap("modelServiceName")
    public String modelServiceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>system</p>
     */
    @NameInMap("modelType")
    public String modelType;

    @NameInMap("networkConfiguration")
    public NetworkConfiguration networkConfiguration;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Aliyun</p>
     */
    @NameInMap("provider")
    public String provider;

    /**
     * <p>providerSettings</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("providerSettings")
    public ProviderSettings providerSettings;

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
