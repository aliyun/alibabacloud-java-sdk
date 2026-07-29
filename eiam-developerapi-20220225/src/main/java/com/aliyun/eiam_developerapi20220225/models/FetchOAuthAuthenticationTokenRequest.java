// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class FetchOAuthAuthenticationTokenRequest extends TeaModel {
    /**
     * <p>The credential provider identifier.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_example_identifier</p>
     */
    @NameInMap("credentialProviderIdentifier")
    public String credentialProviderIdentifier;

    @NameInMap("customParameters")
    public java.util.Map<String, String> customParameters;

    @NameInMap("forceAuthentication")
    public Boolean forceAuthentication;

    /**
     * <p>The scope in the OAuth protocol.</p>
     * <blockquote>
     * <p>If not specified, the scope of the issued OAuth Access Token defaults to the Scope configuration of the corresponding credential provider.</p>
     * </blockquote>
     * <blockquote>
     * <p>Notice: Multiple Scope values are separated by spaces.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>example:test_01 example:test_02</p>
     */
    @NameInMap("scope")
    public String scope;

    public static FetchOAuthAuthenticationTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        FetchOAuthAuthenticationTokenRequest self = new FetchOAuthAuthenticationTokenRequest();
        return TeaModel.build(map, self);
    }

    public FetchOAuthAuthenticationTokenRequest setCredentialProviderIdentifier(String credentialProviderIdentifier) {
        this.credentialProviderIdentifier = credentialProviderIdentifier;
        return this;
    }
    public String getCredentialProviderIdentifier() {
        return this.credentialProviderIdentifier;
    }

    public FetchOAuthAuthenticationTokenRequest setCustomParameters(java.util.Map<String, String> customParameters) {
        this.customParameters = customParameters;
        return this;
    }
    public java.util.Map<String, String> getCustomParameters() {
        return this.customParameters;
    }

    public FetchOAuthAuthenticationTokenRequest setForceAuthentication(Boolean forceAuthentication) {
        this.forceAuthentication = forceAuthentication;
        return this;
    }
    public Boolean getForceAuthentication() {
        return this.forceAuthentication;
    }

    public FetchOAuthAuthenticationTokenRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

}
