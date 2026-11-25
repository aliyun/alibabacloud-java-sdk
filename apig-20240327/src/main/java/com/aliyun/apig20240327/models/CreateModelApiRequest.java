// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateModelApiRequest extends TeaModel {
    /**
     * <p>The API access prefix. The default value for creation is /. If omitted during an update, the original value is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>/beta</p>
     */
    @NameInMap("basePath")
    public String basePath;

    /**
     * <p>The description of the model API. If omitted during an update, the original value is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>Model API for business integration</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether to enable direct supply fallback. If omitted in a create request, the default value is false, which does not implicitly incur pay-as-you-go tail charges. You can only enable this feature by explicitly setting this parameter to true.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("directSupplyFallbackEnabled")
    public Boolean directSupplyFallbackEnabled;

    /**
     * <p>The IDs of the selected custom or default instance domain names. This parameter must be explicitly specified and cannot be empty during creation. If omitted during an update, the original value is retained. If submitted, the entire list is replaced and cannot be empty.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("domainIds")
    public java.util.List<String> domainIds;

    /**
     * <p>Specifies whether to enable consumer API key authentication. If omitted during an update, the original value is retained. The type is fixed to Apikey or Custom.</p>
     */
    @NameInMap("enableAuth")
    public Boolean enableAuth;

    /**
     * <p>The timeout period for the first byte.</p>
     * 
     * <strong>example:</strong>
     * <p>30000</p>
     */
    @NameInMap("firstByteTimeout")
    public Integer firstByteTimeout;

    /**
     * <p>The target dedicated gateway instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-d00000000000000000000</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>Specifies whether to explicitly perform the initial configuration. If omitted or set to false, standard multi-API creation is retained. If set to true, you must explicitly set name to default, basePath to /, and provide a non-empty clientToken. Additionally, when saving, multi-API management must be disabled and the number of complete new-version APIs must be zero.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("initialConfiguration")
    public Boolean initialConfiguration;

    /**
     * <p>The model selection. This parameter is required for creation. If omitted during an update, the original value is retained. If submitted, the entire value is replaced.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("modelSelection")
    public ModelSelection modelSelection;

    /**
     * <p>The name of the model API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>beta-model-api</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The configurations for AI request logging and AI security protection only. If omitted during an update, the original values are retained. If submitted, the inline policies of both types are entirely replaced. An empty array clears both types. Independent token quotas are not affected.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("policyConfigs")
    public java.util.List<ModelApiPolicyConfig> policyConfigs;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acf0000000000000000</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The idempotency identity. The caller generates a globally unique value (we recommend a UUID) to invoke the API. The maximum length is 64 characters. Within approximately 24 hours after the initial request succeeds, if you invoke a duplicate request with the same clientToken and identical request parameter values, the system directly returns the initial creation result. If a request parameter is inconsistent or the initial request is still being processed, the system returns the corresponding idempotency fault. If omitted, the original creation behavior is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>create-model-api-client-token-001</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateModelApiRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelApiRequest self = new CreateModelApiRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelApiRequest setBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }
    public String getBasePath() {
        return this.basePath;
    }

    public CreateModelApiRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateModelApiRequest setDirectSupplyFallbackEnabled(Boolean directSupplyFallbackEnabled) {
        this.directSupplyFallbackEnabled = directSupplyFallbackEnabled;
        return this;
    }
    public Boolean getDirectSupplyFallbackEnabled() {
        return this.directSupplyFallbackEnabled;
    }

    public CreateModelApiRequest setDomainIds(java.util.List<String> domainIds) {
        this.domainIds = domainIds;
        return this;
    }
    public java.util.List<String> getDomainIds() {
        return this.domainIds;
    }

    public CreateModelApiRequest setEnableAuth(Boolean enableAuth) {
        this.enableAuth = enableAuth;
        return this;
    }
    public Boolean getEnableAuth() {
        return this.enableAuth;
    }

    public CreateModelApiRequest setFirstByteTimeout(Integer firstByteTimeout) {
        this.firstByteTimeout = firstByteTimeout;
        return this;
    }
    public Integer getFirstByteTimeout() {
        return this.firstByteTimeout;
    }

    public CreateModelApiRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public CreateModelApiRequest setInitialConfiguration(Boolean initialConfiguration) {
        this.initialConfiguration = initialConfiguration;
        return this;
    }
    public Boolean getInitialConfiguration() {
        return this.initialConfiguration;
    }

    public CreateModelApiRequest setModelSelection(ModelSelection modelSelection) {
        this.modelSelection = modelSelection;
        return this;
    }
    public ModelSelection getModelSelection() {
        return this.modelSelection;
    }

    public CreateModelApiRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateModelApiRequest setPolicyConfigs(java.util.List<ModelApiPolicyConfig> policyConfigs) {
        this.policyConfigs = policyConfigs;
        return this;
    }
    public java.util.List<ModelApiPolicyConfig> getPolicyConfigs() {
        return this.policyConfigs;
    }

    public CreateModelApiRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateModelApiRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
