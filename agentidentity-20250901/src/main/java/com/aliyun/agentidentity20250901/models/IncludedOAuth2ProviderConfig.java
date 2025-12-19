// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class IncludedOAuth2ProviderConfig extends TeaModel {
    @NameInMap("AuthorizationEndpoint")
    public String authorizationEndpoint;

    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("ClientSecret")
    public String clientSecret;

    @NameInMap("TokenEndpoint")
    public String tokenEndpoint;

    public static IncludedOAuth2ProviderConfig build(java.util.Map<String, ?> map) throws Exception {
        IncludedOAuth2ProviderConfig self = new IncludedOAuth2ProviderConfig();
        return TeaModel.build(map, self);
    }

    public IncludedOAuth2ProviderConfig setAuthorizationEndpoint(String authorizationEndpoint) {
        this.authorizationEndpoint = authorizationEndpoint;
        return this;
    }
    public String getAuthorizationEndpoint() {
        return this.authorizationEndpoint;
    }

    public IncludedOAuth2ProviderConfig setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public IncludedOAuth2ProviderConfig setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    public String getClientSecret() {
        return this.clientSecret;
    }

    public IncludedOAuth2ProviderConfig setTokenEndpoint(String tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
        return this;
    }
    public String getTokenEndpoint() {
        return this.tokenEndpoint;
    }

}
