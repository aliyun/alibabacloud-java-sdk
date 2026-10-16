// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListUserPoolClientsResponseBody extends TeaModel {
    /**
     * <p>The list of clients.</p>
     */
    @NameInMap("Clients")
    public java.util.List<ListUserPoolClientsResponseBodyClients> clients;

    /**
     * <p>The maximum number of entries returned for the current request.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to retrieve the next page of results. An empty value indicates that no more data is available.</p>
     * 
     * <strong>example:</strong>
     * <p>TGlzdENsaWVudHM6OjIw</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AABD6E03-4B3A-5687-88FF-72232670ED0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of clients that match the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListUserPoolClientsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserPoolClientsResponseBody self = new ListUserPoolClientsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserPoolClientsResponseBody setClients(java.util.List<ListUserPoolClientsResponseBodyClients> clients) {
        this.clients = clients;
        return this;
    }
    public java.util.List<ListUserPoolClientsResponseBodyClients> getClients() {
        return this.clients;
    }

    public ListUserPoolClientsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUserPoolClientsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUserPoolClientsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserPoolClientsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListUserPoolClientsResponseBodyClientsClientScopes extends TeaModel {
        /**
         * <p>The description of the scope.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenID Connect identifier scope</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the scope.</p>
         * 
         * <strong>example:</strong>
         * <p>openid</p>
         */
        @NameInMap("ScopeName")
        public String scopeName;

        public static ListUserPoolClientsResponseBodyClientsClientScopes build(java.util.Map<String, ?> map) throws Exception {
            ListUserPoolClientsResponseBodyClientsClientScopes self = new ListUserPoolClientsResponseBodyClientsClientScopes();
            return TeaModel.build(map, self);
        }

        public ListUserPoolClientsResponseBodyClientsClientScopes setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUserPoolClientsResponseBodyClientsClientScopes setScopeName(String scopeName) {
            this.scopeName = scopeName;
            return this;
        }
        public String getScopeName() {
            return this.scopeName;
        }

    }

    public static class ListUserPoolClientsResponseBodyClients extends TeaModel {
        /**
         * <p>The validity period of the access token, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("AccessTokenValidity")
        public String accessTokenValidity;

        /**
         * <p>The client ID.</p>
         * 
         * <strong>example:</strong>
         * <p>client-xxxxxxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The client name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-web-app</p>
         */
        @NameInMap("ClientName")
        public String clientName;

        /**
         * <p>The list of default scopes for the client.</p>
         */
        @NameInMap("ClientScopes")
        public java.util.List<ListUserPoolClientsResponseBodyClientsClientScopes> clientScopes;

        @NameInMap("ClientType")
        public String clientType;

        /**
         * <p>The time when the client was created, in ISO 8601 format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-07T06:19:17Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Indicates whether PKCE is enforced.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnforcePKCE")
        public Boolean enforcePKCE;

        /**
         * <p>The list of OAuth redirect URIs.</p>
         */
        @NameInMap("RedirectURIs")
        public java.util.List<String> redirectURIs;

        /**
         * <p>The validity period of the refresh token, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("RefreshTokenValidity")
        public String refreshTokenValidity;

        /**
         * <p>Indicates whether a client secret is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SecretRequired")
        public Boolean secretRequired;

        /**
         * <p>The time when the client was updated, in ISO 8601 format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-07T06:19:17Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The name of the user pool.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-userpool</p>
         */
        @NameInMap("UserPoolName")
        public String userPoolName;

        public static ListUserPoolClientsResponseBodyClients build(java.util.Map<String, ?> map) throws Exception {
            ListUserPoolClientsResponseBodyClients self = new ListUserPoolClientsResponseBodyClients();
            return TeaModel.build(map, self);
        }

        public ListUserPoolClientsResponseBodyClients setAccessTokenValidity(String accessTokenValidity) {
            this.accessTokenValidity = accessTokenValidity;
            return this;
        }
        public String getAccessTokenValidity() {
            return this.accessTokenValidity;
        }

        public ListUserPoolClientsResponseBodyClients setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public ListUserPoolClientsResponseBodyClients setClientName(String clientName) {
            this.clientName = clientName;
            return this;
        }
        public String getClientName() {
            return this.clientName;
        }

        public ListUserPoolClientsResponseBodyClients setClientScopes(java.util.List<ListUserPoolClientsResponseBodyClientsClientScopes> clientScopes) {
            this.clientScopes = clientScopes;
            return this;
        }
        public java.util.List<ListUserPoolClientsResponseBodyClientsClientScopes> getClientScopes() {
            return this.clientScopes;
        }

        public ListUserPoolClientsResponseBodyClients setClientType(String clientType) {
            this.clientType = clientType;
            return this;
        }
        public String getClientType() {
            return this.clientType;
        }

        public ListUserPoolClientsResponseBodyClients setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListUserPoolClientsResponseBodyClients setEnforcePKCE(Boolean enforcePKCE) {
            this.enforcePKCE = enforcePKCE;
            return this;
        }
        public Boolean getEnforcePKCE() {
            return this.enforcePKCE;
        }

        public ListUserPoolClientsResponseBodyClients setRedirectURIs(java.util.List<String> redirectURIs) {
            this.redirectURIs = redirectURIs;
            return this;
        }
        public java.util.List<String> getRedirectURIs() {
            return this.redirectURIs;
        }

        public ListUserPoolClientsResponseBodyClients setRefreshTokenValidity(String refreshTokenValidity) {
            this.refreshTokenValidity = refreshTokenValidity;
            return this;
        }
        public String getRefreshTokenValidity() {
            return this.refreshTokenValidity;
        }

        public ListUserPoolClientsResponseBodyClients setSecretRequired(Boolean secretRequired) {
            this.secretRequired = secretRequired;
            return this;
        }
        public Boolean getSecretRequired() {
            return this.secretRequired;
        }

        public ListUserPoolClientsResponseBodyClients setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListUserPoolClientsResponseBodyClients setUserPoolName(String userPoolName) {
            this.userPoolName = userPoolName;
            return this;
        }
        public String getUserPoolName() {
            return this.userPoolName;
        }

    }

}
