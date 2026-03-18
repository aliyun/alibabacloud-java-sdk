// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class FetchOAuthAuthenticationTokenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>atntkn_01kqflm0sxxx8nmdc1cb5dskxxxxx</p>
     */
    @NameInMap("authenticationTokenId")
    public String authenticationTokenId;

    /**
     * <strong>example:</strong>
     * <p>oauth_access_token</p>
     */
    @NameInMap("authenticationTokenType")
    public String authenticationTokenType;

    /**
     * <strong>example:</strong>
     * <p>app_ngtkgrrxxxxktg5eao6z4xxxxx</p>
     */
    @NameInMap("consumerId")
    public String consumerId;

    /**
     * <strong>example:</strong>
     * <p>application</p>
     */
    @NameInMap("consumerType")
    public String consumerType;

    /**
     * <strong>example:</strong>
     * <p>1649830225000</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <strong>example:</strong>
     * <p>app_ngtkgrrxxxxktg5eao6z4xxxxx</p>
     */
    @NameInMap("creatorId")
    public String creatorId;

    /**
     * <strong>example:</strong>
     * <p>application</p>
     */
    @NameInMap("creatorType")
    public String creatorType;

    /**
     * <strong>example:</strong>
     * <p>atp_01kr2cmj5gxxx4fvmls2e93dxxxxx</p>
     */
    @NameInMap("credentialProviderId")
    public String credentialProviderId;

    /**
     * <strong>example:</strong>
     * <p>1772693568000</p>
     */
    @NameInMap("expirationTime")
    public Long expirationTime;

    /**
     * <p>EIAM实例ID。</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("oauthAccessTokenContent")
    public FetchOAuthAuthenticationTokenResponseBodyOauthAccessTokenContent oauthAccessTokenContent;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("revoked")
    public Boolean revoked;

    /**
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
         * <strong>example:</strong>
         * <p>DgEBAGP2xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("accessTokenValue")
        public String accessTokenValue;

        /**
         * <strong>example:</strong>
         * <p>example:test_01 example:test_02</p>
         */
        @NameInMap("scope")
        public String scope;

        /**
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

}
