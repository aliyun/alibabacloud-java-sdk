// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateModelServiceInput extends TeaModel {
    @NameInMap("credentialName")
    public String credentialName;

    @NameInMap("description")
    public String description;

    @NameInMap("modelInfoConfigs")
    public java.util.List<ModelInfoConfig> modelInfoConfigs;

    @NameInMap("networkConfiguration")
    public NetworkConfiguration networkConfiguration;

    @NameInMap("providerSettings")
    public ProviderSettings providerSettings;

    @NameInMap("status")
    public String status;

    @NameInMap("statusReason")
    public String statusReason;

    public static UpdateModelServiceInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelServiceInput self = new UpdateModelServiceInput();
        return TeaModel.build(map, self);
    }

    public UpdateModelServiceInput setCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }
    public String getCredentialName() {
        return this.credentialName;
    }

    public UpdateModelServiceInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateModelServiceInput setModelInfoConfigs(java.util.List<ModelInfoConfig> modelInfoConfigs) {
        this.modelInfoConfigs = modelInfoConfigs;
        return this;
    }
    public java.util.List<ModelInfoConfig> getModelInfoConfigs() {
        return this.modelInfoConfigs;
    }

    public UpdateModelServiceInput setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    public UpdateModelServiceInput setProviderSettings(ProviderSettings providerSettings) {
        this.providerSettings = providerSettings;
        return this;
    }
    public ProviderSettings getProviderSettings() {
        return this.providerSettings;
    }

    public UpdateModelServiceInput setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateModelServiceInput setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

}
