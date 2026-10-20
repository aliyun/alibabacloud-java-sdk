// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentitydata20251127.models;

import com.aliyun.tea.*;

public class GetResourceOAuth2TokenShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>app</p>
     */
    @NameInMap("Audience")
    public String audience;

    @NameInMap("CustomParameters")
    public String customParametersShrink;

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
    public String scopesShrink;

    @NameInMap("SessionURI")
    public String sessionURI;

    @NameInMap("TokenVaultName")
    public String tokenVaultName;

    @NameInMap("WorkloadAccessToken")
    public String workloadAccessToken;

    public static GetResourceOAuth2TokenShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceOAuth2TokenShrinkRequest self = new GetResourceOAuth2TokenShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceOAuth2TokenShrinkRequest setAudience(String audience) {
        this.audience = audience;
        return this;
    }
    public String getAudience() {
        return this.audience;
    }

    public GetResourceOAuth2TokenShrinkRequest setCustomParametersShrink(String customParametersShrink) {
        this.customParametersShrink = customParametersShrink;
        return this;
    }
    public String getCustomParametersShrink() {
        return this.customParametersShrink;
    }

    public GetResourceOAuth2TokenShrinkRequest setCustomState(String customState) {
        this.customState = customState;
        return this;
    }
    public String getCustomState() {
        return this.customState;
    }

    public GetResourceOAuth2TokenShrinkRequest setForceAuthentication(Boolean forceAuthentication) {
        this.forceAuthentication = forceAuthentication;
        return this;
    }
    public Boolean getForceAuthentication() {
        return this.forceAuthentication;
    }

    public GetResourceOAuth2TokenShrinkRequest setOAuth2Flow(String OAuth2Flow) {
        this.OAuth2Flow = OAuth2Flow;
        return this;
    }
    public String getOAuth2Flow() {
        return this.OAuth2Flow;
    }

    public GetResourceOAuth2TokenShrinkRequest setResourceCredentialProviderName(String resourceCredentialProviderName) {
        this.resourceCredentialProviderName = resourceCredentialProviderName;
        return this;
    }
    public String getResourceCredentialProviderName() {
        return this.resourceCredentialProviderName;
    }

    public GetResourceOAuth2TokenShrinkRequest setResourceOAuth2ReturnURL(String resourceOAuth2ReturnURL) {
        this.resourceOAuth2ReturnURL = resourceOAuth2ReturnURL;
        return this;
    }
    public String getResourceOAuth2ReturnURL() {
        return this.resourceOAuth2ReturnURL;
    }

    public GetResourceOAuth2TokenShrinkRequest setScopesShrink(String scopesShrink) {
        this.scopesShrink = scopesShrink;
        return this;
    }
    public String getScopesShrink() {
        return this.scopesShrink;
    }

    public GetResourceOAuth2TokenShrinkRequest setSessionURI(String sessionURI) {
        this.sessionURI = sessionURI;
        return this;
    }
    public String getSessionURI() {
        return this.sessionURI;
    }

    public GetResourceOAuth2TokenShrinkRequest setTokenVaultName(String tokenVaultName) {
        this.tokenVaultName = tokenVaultName;
        return this;
    }
    public String getTokenVaultName() {
        return this.tokenVaultName;
    }

    public GetResourceOAuth2TokenShrinkRequest setWorkloadAccessToken(String workloadAccessToken) {
        this.workloadAccessToken = workloadAccessToken;
        return this;
    }
    public String getWorkloadAccessToken() {
        return this.workloadAccessToken;
    }

}
