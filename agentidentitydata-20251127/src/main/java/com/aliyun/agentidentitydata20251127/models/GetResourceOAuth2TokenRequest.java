// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentitydata20251127.models;

import com.aliyun.tea.*;

public class GetResourceOAuth2TokenRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;param1&quot;: &quot;test-param&quot;, &quot;param2&quot;: &quot;test-param2&quot;}</p>
     */
    @NameInMap("CustomParameters")
    public java.util.Map<String, ?> customParameters;

    /**
     * <strong>example:</strong>
     * <p>user-defined-value</p>
     */
    @NameInMap("CustomState")
    public String customState;

    /**
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("ForceAuthentication")
    public Boolean forceAuthentication;

    /**
     * <strong>example:</strong>
     * <p>USER_FEDERATION</p>
     */
    @NameInMap("OAuth2Flow")
    public String OAuth2Flow;

    /**
     * <strong>example:</strong>
     * <p>oauth_credential_provider</p>
     */
    @NameInMap("ResourceCredentialProviderName")
    public String resourceCredentialProviderName;

    /**
     * <strong>example:</strong>
     * <p><a href="https://example.com">https://example.com</a></p>
     */
    @NameInMap("ResourceOAuth2ReturnURL")
    public String resourceOAuth2ReturnURL;

    @NameInMap("Scopes")
    public java.util.List<String> scopes;

    /**
     * <strong>example:</strong>
     * <p>urn:ietf:params:oauth:request_uri:43b7df1a-<strong><strong>-</strong></strong>-****-709375a44d8a</p>
     */
    @NameInMap("SessionURI")
    public String sessionURI;

    /**
     * <strong>example:</strong>
     * <p>eyAgImFsZyI6ICJSUzI1N****</p>
     */
    @NameInMap("WorkloadAccessToken")
    public String workloadAccessToken;

    public static GetResourceOAuth2TokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceOAuth2TokenRequest self = new GetResourceOAuth2TokenRequest();
        return TeaModel.build(map, self);
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

    public GetResourceOAuth2TokenRequest setWorkloadAccessToken(String workloadAccessToken) {
        this.workloadAccessToken = workloadAccessToken;
        return this;
    }
    public String getWorkloadAccessToken() {
        return this.workloadAccessToken;
    }

}
