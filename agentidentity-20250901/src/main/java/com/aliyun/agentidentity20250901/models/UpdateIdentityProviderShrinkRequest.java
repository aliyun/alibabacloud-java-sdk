// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateIdentityProviderShrinkRequest extends TeaModel {
    /**
     * <p>The allowed audiences. A token is allowed if its aud claim contains any of the specified audiences.</p>
     */
    @NameInMap("AllowedAudience")
    public String allowedAudienceShrink;

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

    public static UpdateIdentityProviderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIdentityProviderShrinkRequest self = new UpdateIdentityProviderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIdentityProviderShrinkRequest setAllowedAudienceShrink(String allowedAudienceShrink) {
        this.allowedAudienceShrink = allowedAudienceShrink;
        return this;
    }
    public String getAllowedAudienceShrink() {
        return this.allowedAudienceShrink;
    }

    public UpdateIdentityProviderShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateIdentityProviderShrinkRequest setDiscoveryURL(String discoveryURL) {
        this.discoveryURL = discoveryURL;
        return this;
    }
    public String getDiscoveryURL() {
        return this.discoveryURL;
    }

    public UpdateIdentityProviderShrinkRequest setIdentityProviderName(String identityProviderName) {
        this.identityProviderName = identityProviderName;
        return this;
    }
    public String getIdentityProviderName() {
        return this.identityProviderName;
    }

}
