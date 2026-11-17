// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateAiModelProviderRequest extends TeaModel {
    /**
     * <p>The optional default AI service ID. If not empty, it must be a service in the current association set. Omitting this parameter indicates that no default is set. An explicit empty string clears the default. A non-empty value sets the default. The length cannot exceed 64 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>svc-d00000000000000000000</p>
     */
    @NameInMap("defaultServiceId")
    public String defaultServiceId;

    /**
     * <p>The display name of the model provider.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OpenAI</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The gateway instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-ucbx3s2m****</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The identifier of the model provider.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>openai</p>
     */
    @NameInMap("provider")
    public String provider;

    /**
     * <p>The list of service IDs to associate with the provider.</p>
     */
    @NameInMap("serviceIds")
    public java.util.List<String> serviceIds;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateAiModelProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAiModelProviderRequest self = new CreateAiModelProviderRequest();
        return TeaModel.build(map, self);
    }

    public CreateAiModelProviderRequest setDefaultServiceId(String defaultServiceId) {
        this.defaultServiceId = defaultServiceId;
        return this;
    }
    public String getDefaultServiceId() {
        return this.defaultServiceId;
    }

    public CreateAiModelProviderRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateAiModelProviderRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public CreateAiModelProviderRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public CreateAiModelProviderRequest setServiceIds(java.util.List<String> serviceIds) {
        this.serviceIds = serviceIds;
        return this;
    }
    public java.util.List<String> getServiceIds() {
        return this.serviceIds;
    }

    public CreateAiModelProviderRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
