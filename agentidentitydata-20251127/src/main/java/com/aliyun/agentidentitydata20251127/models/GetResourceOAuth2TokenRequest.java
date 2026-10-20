// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentitydata20251127.models;

import com.aliyun.tea.*;

public class GetResourceOAuth2TokenRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>app</p>
     */
    @NameInMap("Audience")
    public String audience;

    @NameInMap("CustomParameters")
    public java.util.Map<String, ?> customParameters;

    @NameInMap("CustomState")
    public String customState;

    @NameInMap("ForceAuthentication")
    public Boolean forceAuthentication;

    @NameInMap("OAuth2Flow")
    public String OAuth2Flow;

    @NameInMap("ResourceCredentialProviderName")
    public String resourceCredentialProviderName;

    @NameInMap("ResourceOAuth2ReturnURL")
    public String resourceOAuth2ReturnURL;

    @NameInMap("Scopes")
    public java.util.List<String> scopes;

    @NameInMap("SessionURI")
    public String sessionURI;

    @NameInMap("TokenVaultName")
    public String tokenVaultName;

    @NameInMap("WorkloadAccessToken")
    public String workloadAccessToken;

    public static GetResourceOAuth2TokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceOAuth2TokenRequest self = new GetResourceOAuth2TokenRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceOAuth2TokenRequest setAudience(String audience) {
        this.audience = audience;
        return this;
    }
    public String getAudience() {
        return this.audience;
    }

    public GetResourceOAuth2TokenRequest setCustomParameters(java.util.Map<String, ?> customParameters) {
        this.customParameters = customParameters;
        return this;
    }
    public java.util.Map<String, ?> getCustomParameters() {
        return this.customParameters;
    }

    public GetResourceOAuth2TokenRequest setCustomState(String customState) {
        this.customState = customState;
        return this;
    }
    public String getCustomState() {
        return this.customState;
    }

    public GetResourceOAuth2TokenRequest setForceAuthentication(Boolean forceAuthentication) {
        this.forceAuthentication = forceAuthentication;
        return this;
    }
    public Boolean getForceAuthentication() {
        return this.forceAuthentication;
    }

    public GetResourceOAuth2TokenRequest setOAuth2Flow(String OAuth2Flow) {
        this.OAuth2Flow = OAuth2Flow;
        return this;
    }
    public String getOAuth2Flow() {
        return this.OAuth2Flow;
    }

    public GetResourceOAuth2TokenRequest setResourceCredentialProviderName(String resourceCredentialProviderName) {
        this.resourceCredentialProviderName = resourceCredentialProviderName;
        return this;
    }
    public String getResourceCredentialProviderName() {
        return this.resourceCredentialProviderName;
    }

    public GetResourceOAuth2TokenRequest setResourceOAuth2ReturnURL(String resourceOAuth2ReturnURL) {
        this.resourceOAuth2ReturnURL = resourceOAuth2ReturnURL;
        return this;
    }
    public String getResourceOAuth2ReturnURL() {
        return this.resourceOAuth2ReturnURL;
    }

    public GetResourceOAuth2TokenRequest setScopes(java.util.List<String> scopes) {
        this.scopes = scopes;
        return this;
    }
    public java.util.List<String> getScopes() {
        return this.scopes;
    }

    public GetResourceOAuth2TokenRequest setSessionURI(String sessionURI) {
        this.sessionURI = sessionURI;
        return this;
    }
    public String getSessionURI() {
        return this.sessionURI;
    }

    public GetResourceOAuth2TokenRequest setTokenVaultName(String tokenVaultName) {
        this.tokenVaultName = tokenVaultName;
        return this;
    }
    public String getTokenVaultName() {
        return this.tokenVaultName;
    }

    public GetResourceOAuth2TokenRequest setWorkloadAccessToken(String workloadAccessToken) {
        this.workloadAccessToken = workloadAccessToken;
        return this;
    }
    public String getWorkloadAccessToken() {
        return this.workloadAccessToken;
    }

}
