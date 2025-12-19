// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentitydata20251127.models;

import com.aliyun.tea.*;

public class GetResourceOAuth2TokenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>66a1a2****0b93v3</p>
     */
    @NameInMap("AccessToken")
    public String accessToken;

    /**
     * <strong>example:</strong>
     * <p><a href="https://agentidentity.cn-beijing.aliyuncs.com/">https://agentidentity.cn-beijing.aliyuncs.com/</a>*****</p>
     */
    @NameInMap("AuthorizationURL")
    public String authorizationURL;

    /**
     * <strong>example:</strong>
     * <p>173C69C9-9C07-5B25-9477-603A33E5DA32</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>IN_PROGRESS</p>
     */
    @NameInMap("SessionStatus")
    public String sessionStatus;

    /**
     * <strong>example:</strong>
     * <p>urn:ietf:params:oauth:request_uri:43b7df1a-<strong><strong>-</strong></strong>-****-709375a44d8a</p>
     */
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
