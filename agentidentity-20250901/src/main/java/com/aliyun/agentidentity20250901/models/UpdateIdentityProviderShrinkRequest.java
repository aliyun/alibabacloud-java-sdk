// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateIdentityProviderShrinkRequest extends TeaModel {
    @NameInMap("AllowedAudience")
    public String allowedAudienceShrink;

    /**
     * <strong>example:</strong>
     * <p>example identity provider</p>
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
