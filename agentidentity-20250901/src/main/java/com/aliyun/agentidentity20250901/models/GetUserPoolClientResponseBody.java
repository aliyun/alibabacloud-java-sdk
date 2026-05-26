// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetUserPoolClientResponseBody extends TeaModel {
    @NameInMap("Client")
    public GetUserPoolClientResponseBodyClient client;

    /**
     * <strong>example:</strong>
     * <p>AABD6E03-4B3A-5687-88FF-72232670ED0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetUserPoolClientResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserPoolClientResponseBody self = new GetUserPoolClientResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserPoolClientResponseBody setClient(GetUserPoolClientResponseBodyClient client) {
        this.client = client;
        return this;
    }
    public GetUserPoolClientResponseBodyClient getClient() {
        return this.client;
    }

    public GetUserPoolClientResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetUserPoolClientResponseBodyClientClientScopes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>OpenID Connect authentication</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>openid</p>
         */
        @NameInMap("ScopeName")
        public String scopeName;

        public static GetUserPoolClientResponseBodyClientClientScopes build(java.util.Map<String, ?> map) throws Exception {
            GetUserPoolClientResponseBodyClientClientScopes self = new GetUserPoolClientResponseBodyClientClientScopes();
            return TeaModel.build(map, self);
        }

        public GetUserPoolClientResponseBodyClientClientScopes setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetUserPoolClientResponseBodyClientClientScopes setScopeName(String scopeName) {
            this.scopeName = scopeName;
            return this;
        }
        public String getScopeName() {
            return this.scopeName;
        }

    }

    public static class GetUserPoolClientResponseBodyClient extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("AccessTokenValidity")
        public String accessTokenValidity;

        /**
         * <strong>example:</strong>
         * <p>client_xxxxxxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <strong>example:</strong>
         * <p>my-web-app</p>
         */
        @NameInMap("ClientName")
        public String clientName;

        @NameInMap("ClientScopes")
        public java.util.List<GetUserPoolClientResponseBodyClientClientScopes> clientScopes;

        /**
         * <strong>example:</strong>
         * <p>2026-05-07T06:19:17Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnforcePKCE")
        public Boolean enforcePKCE;

        @NameInMap("RedirectURIs")
        public java.util.List<String> redirectURIs;

        /**
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("RefreshTokenValidity")
        public String refreshTokenValidity;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SecretRequired")
        public Boolean secretRequired;

        /**
         * <strong>example:</strong>
         * <p>2026-05-07T06:19:17Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>my-agent-userpool</p>
         */
        @NameInMap("UserPoolName")
        public String userPoolName;

        public static GetUserPoolClientResponseBodyClient build(java.util.Map<String, ?> map) throws Exception {
            GetUserPoolClientResponseBodyClient self = new GetUserPoolClientResponseBodyClient();
            return TeaModel.build(map, self);
        }

        public GetUserPoolClientResponseBodyClient setAccessTokenValidity(String accessTokenValidity) {
            this.accessTokenValidity = accessTokenValidity;
            return this;
        }
        public String getAccessTokenValidity() {
            return this.accessTokenValidity;
        }

        public GetUserPoolClientResponseBodyClient setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public GetUserPoolClientResponseBodyClient setClientName(String clientName) {
            this.clientName = clientName;
            return this;
        }
        public String getClientName() {
            return this.clientName;
        }

        public GetUserPoolClientResponseBodyClient setClientScopes(java.util.List<GetUserPoolClientResponseBodyClientClientScopes> clientScopes) {
            this.clientScopes = clientScopes;
            return this;
        }
        public java.util.List<GetUserPoolClientResponseBodyClientClientScopes> getClientScopes() {
            return this.clientScopes;
        }

        public GetUserPoolClientResponseBodyClient setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetUserPoolClientResponseBodyClient setEnforcePKCE(Boolean enforcePKCE) {
            this.enforcePKCE = enforcePKCE;
            return this;
        }
        public Boolean getEnforcePKCE() {
            return this.enforcePKCE;
        }

        public GetUserPoolClientResponseBodyClient setRedirectURIs(java.util.List<String> redirectURIs) {
            this.redirectURIs = redirectURIs;
            return this;
        }
        public java.util.List<String> getRedirectURIs() {
            return this.redirectURIs;
        }

        public GetUserPoolClientResponseBodyClient setRefreshTokenValidity(String refreshTokenValidity) {
            this.refreshTokenValidity = refreshTokenValidity;
            return this;
        }
        public String getRefreshTokenValidity() {
            return this.refreshTokenValidity;
        }

        public GetUserPoolClientResponseBodyClient setSecretRequired(Boolean secretRequired) {
            this.secretRequired = secretRequired;
            return this;
        }
        public Boolean getSecretRequired() {
            return this.secretRequired;
        }

        public GetUserPoolClientResponseBodyClient setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetUserPoolClientResponseBodyClient setUserPoolName(String userPoolName) {
            this.userPoolName = userPoolName;
            return this;
        }
        public String getUserPoolName() {
            return this.userPoolName;
        }

    }

}
