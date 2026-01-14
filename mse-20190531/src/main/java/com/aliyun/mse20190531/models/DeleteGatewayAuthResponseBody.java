// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteGatewayAuthResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DeleteGatewayAuthResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>316F5F64-F73D-42DC-8632-01E308B6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>example-app</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <strong>example:</strong>
         * <p>xxxxx</p>
         */
        @NameInMap("ClientSecret")
        public String clientSecret;

        /**
         * <strong>example:</strong>
         * <p>test.com</p>
         */
        @NameInMap("CookieDomain")
        public String cookieDomain;

        /**
         * <strong>example:</strong>
         * <p>399</p>
         */
        @NameInMap("GatewayId")
        public Long gatewayId;

        /**
         * <strong>example:</strong>
         * <p>gw-e2d226bba4b2445c9e29fa7f8216****</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <strong>example:</strong>
         * <p>2022-01-07 18:07:57</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2022-01-07 18:07:57</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsWhite")
        public Boolean isWhite;

        /**
         * <strong>example:</strong>
         * <p><a href="https://example.com/auth">https://example.com/auth</a></p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
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
         * <strong>example:</strong>
         * <p><a href="https://daxxxxcn.aliyunidaas.com/">https://daxxxxcn.aliyunidaas.com/</a></p>
         */
        @NameInMap("LoginUrl")
        public String loginUrl;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p><a href="https://yourdomain/path">https://yourdomain/path</a></p>
         */
        @NameInMap("RedirectUrl")
        public String redirectUrl;

        @NameInMap("ScopesList")
        public java.util.List<String> scopesList;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Status")
        public Boolean status;

        /**
         * <strong>example:</strong>
         * <p>Authorization</p>
         */
        @NameInMap("TokenName")
        public String tokenName;

        /**
         * <strong>example:</strong>
         * <p>Bearer</p>
         */
        @NameInMap("TokenNamePrefix")
        public String tokenNamePrefix;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TokenPass")
        public Boolean tokenPass;

        /**
         * <strong>example:</strong>
         * <p>HEADER</p>
         */
        @NameInMap("TokenPosition")
        public String tokenPosition;

        /**
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
