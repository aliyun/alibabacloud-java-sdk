// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class FetchOAuthAuthenticationTokenRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_example_identifier</p>
     */
    @NameInMap("credentialProviderIdentifier")
    public String credentialProviderIdentifier;

    /**
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

    public FetchOAuthAuthenticationTokenRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

}
