// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateModelApiRequest extends TeaModel {
    /**
     * <p>The access prefix of the API. The default value is / when created. If omitted in an update request, the original value is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>/beta</p>
     */
    @NameInMap("basePath")
    public String basePath;

    /**
     * <p>The description of the model API. If omitted in an update request, the original value is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>Model API for business integration</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether to enable the direct supply fallback. If omitted in an update request, the original value is retained. Set to false to explicitly disable it.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("directSupplyFallbackEnabled")
    public Boolean directSupplyFallbackEnabled;

    /**
     * <p>The IDs of the selected custom or instance default domain names. This parameter must be explicitly set to a non-empty value when creating an API. If omitted in an update request, the original value is retained. When submitted, the entire list is replaced and cannot be empty.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("domainIds")
    public java.util.List<String> domainIds;

    /**
     * <p>Specifies whether to enable consumer API key authentication. If omitted in an update request, the original value is retained. The type is fixed to Apikey or Custom.</p>
     */
    @NameInMap("enableAuth")
    public Boolean enableAuth;

    /**
     * <p>The first byte timeout.</p>
     * 
     * <strong>example:</strong>
     * <p>30000</p>
     */
    @NameInMap("firstByteTimeout")
    public Integer firstByteTimeout;

    /**
     * <p>The model selection. This parameter is required when creating an API. If omitted in an update request, the original value is retained. When submitted, the entire selection is replaced.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("modelSelection")
    public ModelSelection modelSelection;

    /**
     * <p>Supported only by the new version of Model API in minimalist mode. Merges the actual source model IDs added or removed in this request into the latest locked selection. This parameter is mutually exclusive with modelSelection and cannot be null or an empty delta. The standard update and publish process applies.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("modelSelectionDelta")
    public ModelSelectionDelta modelSelectionDelta;

    /**
     * <p>The name of the model API. If omitted or set to null, the original value is retained. When submitted, the name is trimmed of leading and trailing whitespace, must not be empty, can be up to 128 UTF-8 bytes in length, and cannot contain the at sign (@) or forward slash (/). Renaming the API does not change the API ID or the access prefix.</p>
     * 
     * <strong>example:</strong>
     * <p>beta-model-api</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The policy configurations for AI request logging and AI security protection only. If omitted in an update request, the original values are retained. When submitted, the inline policies of both types are entirely replaced. An empty array clears both types of policies. Independent token quotas are not affected.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("policyConfigs")
    public java.util.List<ModelApiPolicyConfig> policyConfigs;

    public static UpdateModelApiRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelApiRequest self = new UpdateModelApiRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModelApiRequest setBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }
    public String getBasePath() {
        return this.basePath;
    }

    public UpdateModelApiRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateModelApiRequest setDirectSupplyFallbackEnabled(Boolean directSupplyFallbackEnabled) {
        this.directSupplyFallbackEnabled = directSupplyFallbackEnabled;
        return this;
    }
    public Boolean getDirectSupplyFallbackEnabled() {
        return this.directSupplyFallbackEnabled;
    }

    public UpdateModelApiRequest setDomainIds(java.util.List<String> domainIds) {
        this.domainIds = domainIds;
        return this;
    }
    public java.util.List<String> getDomainIds() {
        return this.domainIds;
    }

    public UpdateModelApiRequest setEnableAuth(Boolean enableAuth) {
        this.enableAuth = enableAuth;
        return this;
    }
    public Boolean getEnableAuth() {
        return this.enableAuth;
    }

    public UpdateModelApiRequest setFirstByteTimeout(Integer firstByteTimeout) {
        this.firstByteTimeout = firstByteTimeout;
        return this;
    }
    public Integer getFirstByteTimeout() {
        return this.firstByteTimeout;
    }

    public UpdateModelApiRequest setModelSelection(ModelSelection modelSelection) {
        this.modelSelection = modelSelection;
        return this;
    }
    public ModelSelection getModelSelection() {
        return this.modelSelection;
    }

    public UpdateModelApiRequest setModelSelectionDelta(ModelSelectionDelta modelSelectionDelta) {
        this.modelSelectionDelta = modelSelectionDelta;
        return this;
    }
    public ModelSelectionDelta getModelSelectionDelta() {
        return this.modelSelectionDelta;
    }

    public UpdateModelApiRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateModelApiRequest setPolicyConfigs(java.util.List<ModelApiPolicyConfig> policyConfigs) {
        this.policyConfigs = policyConfigs;
        return this;
    }
    public java.util.List<ModelApiPolicyConfig> getPolicyConfigs() {
        return this.policyConfigs;
    }

}
