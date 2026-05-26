// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListUserPoolClientsResponseBody extends TeaModel {
    @NameInMap("Clients")
    public java.util.List<ListUserPoolClientsResponseBodyClients> clients;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>TGlzdENsaWVudHM6OjIw</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>AABD6E03-4B3A-5687-88FF-72232670ED0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
        @NameInMap("Description")
        public String description;

        /**
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
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("AccessTokenValidity")
        public String accessTokenValidity;

        /**
         * <strong>example:</strong>
         * <p>client-xxxxxxxxxxxxxxxxxxxx</p>
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
        public java.util.List<ListUserPoolClientsResponseBodyClientsClientScopes> clientScopes;

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
