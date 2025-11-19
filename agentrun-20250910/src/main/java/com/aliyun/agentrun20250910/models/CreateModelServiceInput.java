// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateModelServiceInput extends TeaModel {
    @NameInMap("credentialName")
    public String credentialName;

    @NameInMap("description")
    public String description;

    @NameInMap("modelInfoConfigs")
    public java.util.List<ModelInfoConfig> modelInfoConfigs;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("modelServiceName")
    public String modelServiceName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("modelType")
    public String modelType;

    @NameInMap("networkConfiguration")
    public NetworkConfiguration networkConfiguration;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("provider")
    public String provider;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("providerSettings")
    public ProviderSettings providerSettings;

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

}
