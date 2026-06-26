// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateIdentityProviderRequest extends TeaModel {
    @NameInMap("AllowedAudience")
    public java.util.List<String> allowedAudience;

    @NameInMap("Description")
    public String description;

    @NameInMap("DiscoveryURL")
    public String discoveryURL;

    @NameInMap("IdentityProviderName")
    public String identityProviderName;

    public static CreateIdentityProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIdentityProviderRequest self = new CreateIdentityProviderRequest();
        return TeaModel.build(map, self);
    }

    public CreateIdentityProviderRequest setAllowedAudience(java.util.List<String> allowedAudience) {
        this.allowedAudience = allowedAudience;
        return this;
    }
    public java.util.List<String> getAllowedAudience() {
        return this.allowedAudience;
    }

    public CreateIdentityProviderRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateIdentityProviderRequest setDiscoveryURL(String discoveryURL) {
        this.discoveryURL = discoveryURL;
        return this;
    }
    public String getDiscoveryURL() {
        return this.discoveryURL;
    }

    public CreateIdentityProviderRequest setIdentityProviderName(String identityProviderName) {
        this.identityProviderName = identityProviderName;
        return this;
    }
    public String getIdentityProviderName() {
        return this.identityProviderName;
    }

}
