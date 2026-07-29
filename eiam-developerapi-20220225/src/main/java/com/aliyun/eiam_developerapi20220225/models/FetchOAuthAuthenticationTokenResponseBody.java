// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class FetchOAuthAuthenticationTokenResponseBody extends TeaModel {
    /**
     * <p>The authentication token ID.</p>
     * 
     * <strong>example:</strong>
     * <p>atntkn_01kqflm0sxxx8nmdc1cb5dskxxxxx</p>
     */
    @NameInMap("authenticationTokenId")
    public String authenticationTokenId;

    /**
     * <p>The authentication token type.</p>
     * <blockquote>
     * <p>The value is fixed as <code>oauth_access_token</code>, indicating an OAuth Access Token type authentication token.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>oauth_access_token</p>
     */
    @NameInMap("authenticationTokenType")
    public String authenticationTokenType;

    /**
     * <p>The consumer ID of the authentication token.</p>
     * 
     * <strong>example:</strong>
     * <p>app_ngtkgrrxxxxktg5eao6z4xxxxx</p>
     */
    @NameInMap("consumerId")
    public String consumerId;

    /**
     * <p>The consumer type of the authentication token. Valid values:</p>
     * <ul>
     * <li>application: application</li>
     * <li>custom: custom type</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>application</p>
     */
    @NameInMap("consumerType")
    public String consumerType;

    /**
     * <p>The creation time of the authentication token. This value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1649830225000</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <p>The creator ID of the authentication token.</p>
     * 
     * <strong>example:</strong>
     * <p>app_ngtkgrrxxxxktg5eao6z4xxxxx</p>
     */
    @NameInMap("creatorId")
    public String creatorId;

    /**
     * <p>The creator type of the authentication token. Valid values:</p>
     * <ul>
     * <li>application: application</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>application</p>
     */
    @NameInMap("creatorType")
    public String creatorType;

    /**
     * <p>The credential provider ID.</p>
     * 
     * <strong>example:</strong>
     * <p>atp_01kr2cmj5gxxx4fvmls2e93dxxxxx</p>
     */
    @NameInMap("credentialProviderId")
    public String credentialProviderId;

    /**
     * <p>The expiration time of the authentication token. This value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1772693568000</p>
     */
    @NameInMap("expirationTime")
    public Long expirationTime;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The authentication token content of the OAuth Access Token type.</p>
     */
    @NameInMap("oauthAccessTokenContent")
    public FetchOAuthAuthenticationTokenResponseBodyOauthAccessTokenContent oauthAccessTokenContent;

    @NameInMap("oauthAuthorizationSession")
    public FetchOAuthAuthenticationTokenResponseBodyOauthAuthorizationSession oauthAuthorizationSession;

    /**
     * <p>Indicates whether the authentication token is revoked.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("revoked")
    public Boolean revoked;

    /**
     * <p>The update time of the authentication token. This value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1649830225000</p>
     */
    @NameInMap("updateTime")
    public Long updateTime;

    public static FetchOAuthAuthenticationTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FetchOAuthAuthenticationTokenResponseBody self = new FetchOAuthAuthenticationTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public FetchOAuthAuthenticationTokenResponseBody setAuthenticationTokenId(String authenticationTokenId) {
        this.authenticationTokenId = authenticationTokenId;
        return this;
    }
    public String getAuthenticationTokenId() {
        return this.authenticationTokenId;
    }

    public FetchOAuthAuthenticationTokenResponseBody setAuthenticationTokenType(String authenticationTokenType) {
        this.authenticationTokenType = authenticationTokenType;
        return this;
    }
    public String getAuthenticationTokenType() {
        return this.authenticationTokenType;
    }

    public FetchOAuthAuthenticationTokenResponseBody setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

    public FetchOAuthAuthenticationTokenResponseBody setConsumerType(String consumerType) {
        this.consumerType = consumerType;
        return this;
    }
    public String getConsumerType() {
        return this.consumerType;
    }

    public FetchOAuthAuthenticationTokenResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public FetchOAuthAuthenticationTokenResponseBody setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public FetchOAuthAuthenticationTokenResponseBody setCreatorType(String creatorType) {
        this.creatorType = creatorType;
        return this;
    }
    public String getCreatorType() {
        return this.creatorType;
    }

    public FetchOAuthAuthenticationTokenResponseBody setCredentialProviderId(String credentialProviderId) {
        this.credentialProviderId = credentialProviderId;
        return this;
    }
    public String getCredentialProviderId() {
        return this.credentialProviderId;
    }

    public FetchOAuthAuthenticationTokenResponseBody setExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }
    public Long getExpirationTime() {
        return this.expirationTime;
    }

    public FetchOAuthAuthenticationTokenResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public FetchOAuthAuthenticationTokenResponseBody setOauthAccessTokenContent(FetchOAuthAuthenticationTokenResponseBodyOauthAccessTokenContent oauthAccessTokenContent) {
        this.oauthAccessTokenContent = oauthAccessTokenContent;
        return this;
    }
    public FetchOAuthAuthenticationTokenResponseBodyOauthAccessTokenContent getOauthAccessTokenContent() {
        return this.oauthAccessTokenContent;
    }

    public FetchOAuthAuthenticationTokenResponseBody setOauthAuthorizationSession(FetchOAuthAuthenticationTokenResponseBodyOauthAuthorizationSession oauthAuthorizationSession) {
        this.oauthAuthorizationSession = oauthAuthorizationSession;
        return this;
    }
    public FetchOAuthAuthenticationTokenResponseBodyOauthAuthorizationSession getOauthAuthorizationSession() {
        return this.oauthAuthorizationSession;
    }

    public FetchOAuthAuthenticationTokenResponseBody setRevoked(Boolean revoked) {
        this.revoked = revoked;
        return this;
    }
    public Boolean getRevoked() {
        return this.revoked;
    }

    public FetchOAuthAuthenticationTokenResponseBody setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public static class FetchOAuthAuthenticationTokenResponseBodyOauthAccessTokenContent extends TeaModel {
        /**
         * <p>The access_token field in the OAuth protocol Token endpoint response.</p>
         * 
         * <strong>example:</strong>
         * <p>DgEBAGP2xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("accessTokenValue")
        public String accessTokenValue;

        /**
         * <p>The scope field in the OAuth protocol Token endpoint response.</p>
         * 
         * <strong>example:</strong>
         * <p>example:test_01 example:test_02</p>
         */
        @NameInMap("scope")
        public String scope;

        /**
         * <p>The token_type field in the OAuth protocol Token endpoint response.</p>
         * 
         * <strong>example:</strong>
         * <p>Bearer</p>
         */
        @NameInMap("tokenType")
        public String tokenType;

        public static FetchOAuthAuthenticationTokenResponseBodyOauthAccessTokenContent build(java.util.Map<String, ?> map) throws Exception {
            FetchOAuthAuthenticationTokenResponseBodyOauthAccessTokenContent self = new FetchOAuthAuthenticationTokenResponseBodyOauthAccessTokenContent();
            return TeaModel.build(map, self);
        }

        public FetchOAuthAuthenticationTokenResponseBodyOauthAccessTokenContent setAccessTokenValue(String accessTokenValue) {
            this.accessTokenValue = accessTokenValue;
            return this;
        }
        public String getAccessTokenValue() {
            return this.accessTokenValue;
        }

        public FetchOAuthAuthenticationTokenResponseBodyOauthAccessTokenContent setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public FetchOAuthAuthenticationTokenResponseBodyOauthAccessTokenContent setTokenType(String tokenType) {
            this.tokenType = tokenType;
            return this;
        }
        public String getTokenType() {
            return this.tokenType;
        }

    }

    public static class FetchOAuthAuthenticationTokenResponseBodyOauthAuthorizationSession extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://auth.example.com">https://auth.example.com</a></p>
         */
        @NameInMap("authorizationUrl")
        public String authorizationUrl;

        /**
         * <strong>example:</strong>
         * <p>atpoas_yyy</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>pending</p>
         */
        @NameInMap("sessionStatus")
        public String sessionStatus;

        /**
         * <strong>example:</strong>
         * <p>urn:ietf:params:oauth:request_uri:atpoas_yyy</p>
         */
        @NameInMap("sessionUri")
        public String sessionUri;

        public static FetchOAuthAuthenticationTokenResponseBodyOauthAuthorizationSession build(java.util.Map<String, ?> map) throws Exception {
            FetchOAuthAuthenticationTokenResponseBodyOauthAuthorizationSession self = new FetchOAuthAuthenticationTokenResponseBodyOauthAuthorizationSession();
            return TeaModel.build(map, self);
        }

        public FetchOAuthAuthenticationTokenResponseBodyOauthAuthorizationSession setAuthorizationUrl(String authorizationUrl) {
            this.authorizationUrl = authorizationUrl;
            return this;
        }
        public String getAuthorizationUrl() {
            return this.authorizationUrl;
        }

        public FetchOAuthAuthenticationTokenResponseBodyOauthAuthorizationSession setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public FetchOAuthAuthenticationTokenResponseBodyOauthAuthorizationSession setSessionStatus(String sessionStatus) {
            this.sessionStatus = sessionStatus;
            return this;
        }
        public String getSessionStatus() {
            return this.sessionStatus;
        }

        public FetchOAuthAuthenticationTokenResponseBodyOauthAuthorizationSession setSessionUri(String sessionUri) {
            this.sessionUri = sessionUri;
            return this;
        }
        public String getSessionUri() {
            return this.sessionUri;
        }

    }

}
