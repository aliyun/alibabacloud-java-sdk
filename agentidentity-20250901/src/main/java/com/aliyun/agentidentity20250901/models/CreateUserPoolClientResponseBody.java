// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateUserPoolClientResponseBody extends TeaModel {
    @NameInMap("Client")
    public CreateUserPoolClientResponseBodyClient client;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateUserPoolClientResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUserPoolClientResponseBody self = new CreateUserPoolClientResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUserPoolClientResponseBody setClient(CreateUserPoolClientResponseBodyClient client) {
        this.client = client;
        return this;
    }
    public CreateUserPoolClientResponseBodyClient getClient() {
        return this.client;
    }

    public CreateUserPoolClientResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateUserPoolClientResponseBodyClientClientScopes extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("ScopeName")
        public String scopeName;

        public static CreateUserPoolClientResponseBodyClientClientScopes build(java.util.Map<String, ?> map) throws Exception {
            CreateUserPoolClientResponseBodyClientClientScopes self = new CreateUserPoolClientResponseBodyClientClientScopes();
            return TeaModel.build(map, self);
        }

        public CreateUserPoolClientResponseBodyClientClientScopes setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateUserPoolClientResponseBodyClientClientScopes setScopeName(String scopeName) {
            this.scopeName = scopeName;
            return this;
        }
        public String getScopeName() {
            return this.scopeName;
        }

    }

    public static class CreateUserPoolClientResponseBodyClient extends TeaModel {
        @NameInMap("AccessTokenValidity")
        public String accessTokenValidity;

        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("ClientName")
        public String clientName;

        @NameInMap("ClientScopes")
        public java.util.List<CreateUserPoolClientResponseBodyClientClientScopes> clientScopes;

        @NameInMap("ClientType")
        public String clientType;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EnforcePKCE")
        public Boolean enforcePKCE;

        @NameInMap("RedirectURIs")
        public java.util.List<String> redirectURIs;

        @NameInMap("RefreshTokenValidity")
        public String refreshTokenValidity;

        @NameInMap("SecretRequired")
        public Boolean secretRequired;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("UserPoolName")
        public String userPoolName;

        public static CreateUserPoolClientResponseBodyClient build(java.util.Map<String, ?> map) throws Exception {
            CreateUserPoolClientResponseBodyClient self = new CreateUserPoolClientResponseBodyClient();
            return TeaModel.build(map, self);
        }

        public CreateUserPoolClientResponseBodyClient setAccessTokenValidity(String accessTokenValidity) {
            this.accessTokenValidity = accessTokenValidity;
            return this;
        }
        public String getAccessTokenValidity() {
            return this.accessTokenValidity;
        }

        public CreateUserPoolClientResponseBodyClient setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public CreateUserPoolClientResponseBodyClient setClientName(String clientName) {
            this.clientName = clientName;
            return this;
        }
        public String getClientName() {
            return this.clientName;
        }

        public CreateUserPoolClientResponseBodyClient setClientScopes(java.util.List<CreateUserPoolClientResponseBodyClientClientScopes> clientScopes) {
            this.clientScopes = clientScopes;
            return this;
        }
        public java.util.List<CreateUserPoolClientResponseBodyClientClientScopes> getClientScopes() {
            return this.clientScopes;
        }

        public CreateUserPoolClientResponseBodyClient setClientType(String clientType) {
            this.clientType = clientType;
            return this;
        }
        public String getClientType() {
            return this.clientType;
        }

        public CreateUserPoolClientResponseBodyClient setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateUserPoolClientResponseBodyClient setEnforcePKCE(Boolean enforcePKCE) {
            this.enforcePKCE = enforcePKCE;
            return this;
        }
        public Boolean getEnforcePKCE() {
            return this.enforcePKCE;
        }

        public CreateUserPoolClientResponseBodyClient setRedirectURIs(java.util.List<String> redirectURIs) {
            this.redirectURIs = redirectURIs;
            return this;
        }
        public java.util.List<String> getRedirectURIs() {
            return this.redirectURIs;
        }

        public CreateUserPoolClientResponseBodyClient setRefreshTokenValidity(String refreshTokenValidity) {
            this.refreshTokenValidity = refreshTokenValidity;
            return this;
        }
        public String getRefreshTokenValidity() {
            return this.refreshTokenValidity;
        }

        public CreateUserPoolClientResponseBodyClient setSecretRequired(Boolean secretRequired) {
            this.secretRequired = secretRequired;
            return this;
        }
        public Boolean getSecretRequired() {
            return this.secretRequired;
        }

        public CreateUserPoolClientResponseBodyClient setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public CreateUserPoolClientResponseBodyClient setUserPoolName(String userPoolName) {
            this.userPoolName = userPoolName;
            return this;
        }
        public String getUserPoolName() {
            return this.userPoolName;
        }

    }

}
