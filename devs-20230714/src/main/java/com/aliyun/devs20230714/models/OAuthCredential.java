// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class OAuthCredential extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1716176924603</p>
     */
    @NameInMap("createdTime")
    public Long createdTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1716263324603</p>
     */
    @NameInMap("expiration")
    public Long expiration;

    /**
     * <strong>example:</strong>
     * <p>4d77bfae284770d94ebeed6b0199ebfd65e3943ba4f1e44dc36d792a93ba0d13</p>
     */
    @NameInMap("refreshToken")
    public String refreshToken;

    /**
     * <strong>example:</strong>
     * <p>user_info projects pull_requests hook gists emails</p>
     */
    @NameInMap("scope")
    public String scope;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4e84246b6b3962cd3d207aad1ea2f911</p>
     */
    @NameInMap("token")
    public String token;

    /**
     * <strong>example:</strong>
     * <p>bearer</p>
     */
    @NameInMap("type")
    public String type;

    public static OAuthCredential build(java.util.Map<String, ?> map) throws Exception {
        OAuthCredential self = new OAuthCredential();
        return TeaModel.build(map, self);
    }

    public OAuthCredential setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public Long getCreatedTime() {
        return this.createdTime;
    }

    public OAuthCredential setExpiration(Long expiration) {
        this.expiration = expiration;
        return this;
    }
    public Long getExpiration() {
        return this.expiration;
    }

    public OAuthCredential setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    public String getRefreshToken() {
        return this.refreshToken;
    }

    public OAuthCredential setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public OAuthCredential setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public OAuthCredential setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
