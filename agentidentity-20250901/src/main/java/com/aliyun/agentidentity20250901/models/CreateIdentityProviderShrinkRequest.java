// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateIdentityProviderShrinkRequest extends TeaModel {
    @NameInMap("AllowedAudience")
    public String allowedAudienceShrink;

    /**
     * <strong>example:</strong>
     * <p>example agent</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p><a href="https://oauth.aliyun.com/.well-known/openid-configuration">https://oauth.aliyun.com/.well-known/openid-configuration</a></p>
     */
    @NameInMap("DiscoveryURL")
    public String discoveryURL;

    /**
     * <strong>example:</strong>
     * <p>identity-provider-okta</p>
     */
    @NameInMap("IdentityProviderName")
    public String identityProviderName;

    public static CreateIdentityProviderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIdentityProviderShrinkRequest self = new CreateIdentityProviderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateIdentityProviderShrinkRequest setAllowedAudienceShrink(String allowedAudienceShrink) {
        this.allowedAudienceShrink = allowedAudienceShrink;
        return this;
    }
    public String getAllowedAudienceShrink() {
        return this.allowedAudienceShrink;
    }

    public CreateIdentityProviderShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateIdentityProviderShrinkRequest setDiscoveryURL(String discoveryURL) {
        this.discoveryURL = discoveryURL;
        return this;
    }
    public String getDiscoveryURL() {
        return this.discoveryURL;
    }

    public CreateIdentityProviderShrinkRequest setIdentityProviderName(String identityProviderName) {
        this.identityProviderName = identityProviderName;
        return this;
    }
    public String getIdentityProviderName() {
        return this.identityProviderName;
    }

}
