// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CustomOAuth2ProviderConfig extends TeaModel {
    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("ClientSecret")
    public String clientSecret;

    @NameInMap("OAuth2Discovery")
    public OAuth2Discovery OAuth2Discovery;

    public static CustomOAuth2ProviderConfig build(java.util.Map<String, ?> map) throws Exception {
        CustomOAuth2ProviderConfig self = new CustomOAuth2ProviderConfig();
        return TeaModel.build(map, self);
    }

    public CustomOAuth2ProviderConfig setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public CustomOAuth2ProviderConfig setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    public String getClientSecret() {
        return this.clientSecret;
    }

    public CustomOAuth2ProviderConfig setOAuth2Discovery(OAuth2Discovery OAuth2Discovery) {
        this.OAuth2Discovery = OAuth2Discovery;
        return this;
    }
    public OAuth2Discovery getOAuth2Discovery() {
        return this.OAuth2Discovery;
    }

}
