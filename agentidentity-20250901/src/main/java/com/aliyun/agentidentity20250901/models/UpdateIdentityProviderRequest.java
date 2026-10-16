// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateIdentityProviderRequest extends TeaModel {
    /**
     * <p>The allowed audiences. A token is allowed if its aud claim contains any of the specified audiences.</p>
     */
    @NameInMap("AllowedAudience")
    public java.util.List<String> allowedAudience;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>example identity provider</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The metadata URL used to retrieve the OpenID configuration or authorization server metadata.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oauth.aliyun.com/.well-known/openid-configuration">https://oauth.aliyun.com/.well-known/openid-configuration</a></p>
     */
    @NameInMap("DiscoveryURL")
    public String discoveryURL;

    /**
     * <p>The name of the identity provider.</p>
     * 
     * <strong>example:</strong>
     * <p>identity-provider-okta</p>
     */
    @NameInMap("IdentityProviderName")
    public String identityProviderName;

    public static UpdateIdentityProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIdentityProviderRequest self = new UpdateIdentityProviderRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIdentityProviderRequest setAllowedAudience(java.util.List<String> allowedAudience) {
        this.allowedAudience = allowedAudience;
        return this;
    }
    public java.util.List<String> getAllowedAudience() {
        return this.allowedAudience;
    }

    public UpdateIdentityProviderRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateIdentityProviderRequest setDiscoveryURL(String discoveryURL) {
        this.discoveryURL = discoveryURL;
        return this;
    }
    public String getDiscoveryURL() {
        return this.discoveryURL;
    }

    public UpdateIdentityProviderRequest setIdentityProviderName(String identityProviderName) {
        this.identityProviderName = identityProviderName;
        return this;
    }
    public String getIdentityProviderName() {
        return this.identityProviderName;
    }

}
