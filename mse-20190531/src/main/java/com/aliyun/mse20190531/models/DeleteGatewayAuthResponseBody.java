// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteGatewayAuthResponseBody extends TeaModel {
    /**
     * <p>The code returned in synchronization with the Success parameter. When Success is true, the value is 200.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DeleteGatewayAuthResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>316F5F64-F73D-42DC-8632-01E308B6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: The request is successful.</li>
     * <li>false: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteGatewayAuthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayAuthResponseBody self = new DeleteGatewayAuthResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayAuthResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteGatewayAuthResponseBody setData(DeleteGatewayAuthResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteGatewayAuthResponseBodyData getData() {
        return this.data;
    }

    public DeleteGatewayAuthResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteGatewayAuthResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteGatewayAuthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteGatewayAuthResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteGatewayAuthResponseBodyData extends TeaModel {
        /**
         * <p>The application ID registered for the service. This parameter is used for OIDC or IDaaS.</p>
         * 
         * <strong>example:</strong>
         * <p>example-app</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The application secret registered for the service. This parameter is used for OIDC or IDaaS.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx</p>
         */
        @NameInMap("ClientSecret")
        public String clientSecret;

        /**
         * <p>The domain name of the cookie. After authentication, the cookie is sent to the specified domain name to maintain the logon status. This parameter is used for OIDC or IDaaS.</p>
         * 
         * <strong>example:</strong>
         * <p>test.com</p>
         */
        @NameInMap("CookieDomain")
        public String cookieDomain;

        /**
         * <p>The gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>399</p>
         */
        @NameInMap("GatewayId")
        public Long gatewayId;

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-e2d226bba4b2445c9e29fa7f8216****</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-07 18:07:57</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-07 18:07:57</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The authentication ID.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The authorization blacklist and whitelist mode. Valid values:</p>
         * <ul>
         * <li>true: whitelist mode. Hosts and paths in the whitelist can be accessed without verification, while all other hosts and paths require verification.</li>
         * <li>false: blacklist mode. Hosts and paths in the blacklist require verification, while all other hosts and paths can be accessed directly.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsWhite")
        public Boolean isWhite;

        /**
         * <p>The issuer used when the authentication type is JWT or OIDC:</p>
         * <ul>
         * <li>JWT: the iss (issuer) claim of the JWT, which represents the issuer.</li>
         * <li>OIDC: the iss (issuer) claim of the OIDC, which represents the issuer.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/auth">https://example.com/auth</a></p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>The JWT public key in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;keys&quot;: [
         *             {
         *                   &quot;e&quot;: &quot;AQAB&quot;,
         *                   &quot;kid&quot;: &quot;DHFbpoIUqrY8t2zpA2qXfCmr5VO5ZEr4RzHU_-envvQ&quot;,
         *                   &quot;kty&quot;: &quot;RSA&quot;,
         *                   &quot;n&quot;: &quot;xAE7eB6qugXyCAG3yhh7pkDkT65pHymX-P7KfIupjf59vsdo91bSP9C8H07pSAGQO1MV_xFj9VswgsCg4R6otmg5PV2He95lZdHtOcU5DXIg_pbhLdKXbi66GlVeK6ABZOUW3WYtnNHD-91gVuoeJT_DwtGGcp4ignkgXfkiEm4sw-4sfb4qdt5oLbyVpmW6x9cfa7vs2WTfURiCrBoUqgBo_-4WTiULmmHSGZHOjzwa8WtrtOQGsAFjIbno85jp6MnGGGZPYZbDAa_b3y5u-YpW7ypZrvD8BgtKVjgtQgZhLAGezMt0ua3DRrWnKqTZ0BJ_EyxOGuHJrLsn00fnMQ&quot;
         *             }
         *       ]
         * }</p>
         */
        @NameInMap("Jwks")
        public String jwks;

        /**
         * <p>The URL of the user logon page for the IDaaS instance. This parameter is used for IDaaS.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://daxxxxcn.aliyunidaas.com/">https://daxxxxcn.aliyunidaas.com/</a></p>
         */
        @NameInMap("LoginUrl")
        public String loginUrl;

        /**
         * <p>The authentication name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The redirect URL after successful authorization. This parameter is used for OIDC or IDaaS and must be consistent with the redirect URL configured in OIDC or IDaaS.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://yourdomain/path">https://yourdomain/path</a></p>
         */
        @NameInMap("RedirectUrl")
        public String redirectUrl;

        /**
         * <p>The OIDC scopes. This parameter is used for OIDC.</p>
         */
        @NameInMap("ScopesList")
        public java.util.List<String> scopesList;

        /**
         * <p>The enabling status. Valid values:</p>
         * <ul>
         * <li>true: enabled.</li>
         * <li>false: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Status")
        public Boolean status;

        /**
         * <p>The name of the token parameter to be verified. By default, the token is prefixed with Bearer and placed in the Authorization header. Example: <code>Authorization: Bearer token</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Authorization</p>
         */
        @NameInMap("TokenName")
        public String tokenName;

        /**
         * <p>The prefix of the JWT token.</p>
         * 
         * <strong>example:</strong>
         * <p>Bearer</p>
         */
        @NameInMap("TokenNamePrefix")
        public String tokenNamePrefix;

        /**
         * <p>Specifies whether to pass through the token.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TokenPass")
        public Boolean tokenPass;

        /**
         * <p>The position of the JWT token. Valid values:</p>
         * <ul>
         * <li>HEADER: transmitted through the header.
         * The token parameter to be verified. By default, the token is prefixed with Bearer and placed in the Authorization header. Example: <code>Authorization: Bearer token</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HEADER</p>
         */
        @NameInMap("TokenPosition")
        public String tokenPosition;

        /**
         * <p>The authentication type. Valid values:</p>
         * <ul>
         * <li>JWT</li>
         * <li>OIDC</li>
         * <li>IDaaS</li>
         * <li>ExternalAuthZ: custom authentication service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>JWT</p>
         */
        @NameInMap("Type")
        public String type;

        public static DeleteGatewayAuthResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteGatewayAuthResponseBodyData self = new DeleteGatewayAuthResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteGatewayAuthResponseBodyData setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public DeleteGatewayAuthResponseBodyData setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public String getClientSecret() {
            return this.clientSecret;
        }

        public DeleteGatewayAuthResponseBodyData setCookieDomain(String cookieDomain) {
            this.cookieDomain = cookieDomain;
            return this;
        }
        public String getCookieDomain() {
            return this.cookieDomain;
        }

        public DeleteGatewayAuthResponseBodyData setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public DeleteGatewayAuthResponseBodyData setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public DeleteGatewayAuthResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DeleteGatewayAuthResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DeleteGatewayAuthResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DeleteGatewayAuthResponseBodyData setIsWhite(Boolean isWhite) {
            this.isWhite = isWhite;
            return this;
        }
        public Boolean getIsWhite() {
            return this.isWhite;
        }

        public DeleteGatewayAuthResponseBodyData setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public DeleteGatewayAuthResponseBodyData setJwks(String jwks) {
            this.jwks = jwks;
            return this;
        }
        public String getJwks() {
            return this.jwks;
        }

        public DeleteGatewayAuthResponseBodyData setLoginUrl(String loginUrl) {
            this.loginUrl = loginUrl;
            return this;
        }
        public String getLoginUrl() {
            return this.loginUrl;
        }

        public DeleteGatewayAuthResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeleteGatewayAuthResponseBodyData setRedirectUrl(String redirectUrl) {
            this.redirectUrl = redirectUrl;
            return this;
        }
        public String getRedirectUrl() {
            return this.redirectUrl;
        }

        public DeleteGatewayAuthResponseBodyData setScopesList(java.util.List<String> scopesList) {
            this.scopesList = scopesList;
            return this;
        }
        public java.util.List<String> getScopesList() {
            return this.scopesList;
        }

        public DeleteGatewayAuthResponseBodyData setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public DeleteGatewayAuthResponseBodyData setTokenName(String tokenName) {
            this.tokenName = tokenName;
            return this;
        }
        public String getTokenName() {
            return this.tokenName;
        }

        public DeleteGatewayAuthResponseBodyData setTokenNamePrefix(String tokenNamePrefix) {
            this.tokenNamePrefix = tokenNamePrefix;
            return this;
        }
        public String getTokenNamePrefix() {
            return this.tokenNamePrefix;
        }

        public DeleteGatewayAuthResponseBodyData setTokenPass(Boolean tokenPass) {
            this.tokenPass = tokenPass;
            return this;
        }
        public Boolean getTokenPass() {
            return this.tokenPass;
        }

        public DeleteGatewayAuthResponseBodyData setTokenPosition(String tokenPosition) {
            this.tokenPosition = tokenPosition;
            return this;
        }
        public String getTokenPosition() {
            return this.tokenPosition;
        }

        public DeleteGatewayAuthResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
