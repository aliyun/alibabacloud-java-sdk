// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieoauth2_1_0.models;

import com.aliyun.tea.*;

public class OAuth2TokenEndpointRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>rf3mi4JOU-xRIX2zEuRLHi-U9mPnvISeSphbwiBHJ5mEKZtG-xJsbBWrq8RmhQEPRYh0JOd3DaS_VZ90soD_YrsT4OBtgD06DmdIKL2_5KFfI6p_SjXX2-UMJuGfXDkB</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>authorization_code</p>
     */
    @NameInMap("GrantType")
    public String grantType;

    /**
     * <strong>example:</strong>
     * <p><a href="https://xxx.xxx.com/xxx">https://xxx.xxx.com/xxx</a></p>
     */
    @NameInMap("RedirectUri")
    public String redirectUri;

    /**
     * <strong>example:</strong>
     * <p>zsEcmaUeb8-NZW4IIUDD7qdgBNflrj6fH8BXJYbW9iXihZTgvbcr1_utC9p5HJLn_lXVwhfivBTgUQZBCGvGl5lxqaxFhmFtt-OrBduFQKL9x8p2lpEMKlxuKHZZZJ3A</p>
     */
    @NameInMap("RefreshToken")
    public String refreshToken;

    public static OAuth2TokenEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        OAuth2TokenEndpointRequest self = new OAuth2TokenEndpointRequest();
        return TeaModel.build(map, self);
    }

    public OAuth2TokenEndpointRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public OAuth2TokenEndpointRequest setGrantType(String grantType) {
        this.grantType = grantType;
        return this;
    }
    public String getGrantType() {
        return this.grantType;
    }

    public OAuth2TokenEndpointRequest setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
        return this;
    }
    public String getRedirectUri() {
        return this.redirectUri;
    }

    public OAuth2TokenEndpointRequest setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    public String getRefreshToken() {
        return this.refreshToken;
    }

}
