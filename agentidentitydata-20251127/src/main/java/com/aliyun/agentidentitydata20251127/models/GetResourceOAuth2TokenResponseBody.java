// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentitydata20251127.models;

import com.aliyun.tea.*;

public class GetResourceOAuth2TokenResponseBody extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("AuthorizationURL")
    public String authorizationURL;

    @NameInMap("ExpiresIn")
    public Long expiresIn;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SessionStatus")
    public String sessionStatus;

    @NameInMap("SessionURI")
    public String sessionURI;

    public static GetResourceOAuth2TokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceOAuth2TokenResponseBody self = new GetResourceOAuth2TokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceOAuth2TokenResponseBody setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public GetResourceOAuth2TokenResponseBody setAuthorizationURL(String authorizationURL) {
        this.authorizationURL = authorizationURL;
        return this;
    }
    public String getAuthorizationURL() {
        return this.authorizationURL;
    }

    public GetResourceOAuth2TokenResponseBody setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }
    public Long getExpiresIn() {
        return this.expiresIn;
    }

    public GetResourceOAuth2TokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceOAuth2TokenResponseBody setSessionStatus(String sessionStatus) {
        this.sessionStatus = sessionStatus;
        return this;
    }
    public String getSessionStatus() {
        return this.sessionStatus;
    }

    public GetResourceOAuth2TokenResponseBody setSessionURI(String sessionURI) {
        this.sessionURI = sessionURI;
        return this;
    }
    public String getSessionURI() {
        return this.sessionURI;
    }

}
