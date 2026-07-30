// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetOAuthAuthorizationSessionResponseBody extends TeaModel {
    /**
     * <p>The authentication token ID.</p>
     * 
     * <strong>example:</strong>
     * <p>atntkn_01l6lot7o4e4r77oelp6qtuxxxxx</p>
     */
    @NameInMap("authenticationTokenId")
    public String authenticationTokenId;

    /**
     * <p>The user authorization URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://login.dingtalk.com/oauth2/auth?client_id=">https://login.dingtalk.com/oauth2/auth?client_id=</a>...</p>
     */
    @NameInMap("authorizationUrl")
    public String authorizationUrl;

    /**
     * <p>The authentication token consumer ID.</p>
     * 
     * <strong>example:</strong>
     * <p>app_ngtkgrrxxxxktg5eao6z4xxxxx</p>
     */
    @NameInMap("consumerId")
    public String consumerId;

    /**
     * <p>The authentication token consumer type.</p>
     * 
     * <strong>example:</strong>
     * <p>application</p>
     */
    @NameInMap("consumerType")
    public String consumerType;

    /**
     * <p>The authentication token creator ID.</p>
     * 
     * <strong>example:</strong>
     * <p>app_ngtkgrrxxxxktg5eao6z4xxxxx</p>
     */
    @NameInMap("creatorId")
    public String creatorId;

    /**
     * <p>The authentication token creator type.</p>
     * 
     * <strong>example:</strong>
     * <p>application</p>
     */
    @NameInMap("creatorType")
    public String creatorType;

    /**
     * <p>The credential provider business identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>test_example_identifier</p>
     */
    @NameInMap("credentialProviderIdentifier")
    public String credentialProviderIdentifier;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>access_denied</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error description.</p>
     * 
     * <strong>example:</strong>
     * <p>The user denied the authorization request</p>
     */
    @NameInMap("errorDescription")
    public String errorDescription;

    /**
     * <p>The authentication token expiration time. UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1704153600000</p>
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
     * <p>The authorization session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>atpoas_01l6losojlojbbv01adsq56xxxxx</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>The authorization session status.</p>
     * 
     * <strong>example:</strong>
     * <p>pending</p>
     */
    @NameInMap("sessionStatus")
    public String sessionStatus;

    /**
     * <p>The authorization session URI.</p>
     * 
     * <strong>example:</strong>
     * <p>urn:ietf:params:oauth:request_uri:atpoas_01l6ljnvrpc5niakl3gj3amxxxxxx</p>
     */
    @NameInMap("sessionUri")
    public String sessionUri;

    public static GetOAuthAuthorizationSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOAuthAuthorizationSessionResponseBody self = new GetOAuthAuthorizationSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOAuthAuthorizationSessionResponseBody setAuthenticationTokenId(String authenticationTokenId) {
        this.authenticationTokenId = authenticationTokenId;
        return this;
    }
    public String getAuthenticationTokenId() {
        return this.authenticationTokenId;
    }

    public GetOAuthAuthorizationSessionResponseBody setAuthorizationUrl(String authorizationUrl) {
        this.authorizationUrl = authorizationUrl;
        return this;
    }
    public String getAuthorizationUrl() {
        return this.authorizationUrl;
    }

    public GetOAuthAuthorizationSessionResponseBody setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

    public GetOAuthAuthorizationSessionResponseBody setConsumerType(String consumerType) {
        this.consumerType = consumerType;
        return this;
    }
    public String getConsumerType() {
        return this.consumerType;
    }

    public GetOAuthAuthorizationSessionResponseBody setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public GetOAuthAuthorizationSessionResponseBody setCreatorType(String creatorType) {
        this.creatorType = creatorType;
        return this;
    }
    public String getCreatorType() {
        return this.creatorType;
    }

    public GetOAuthAuthorizationSessionResponseBody setCredentialProviderIdentifier(String credentialProviderIdentifier) {
        this.credentialProviderIdentifier = credentialProviderIdentifier;
        return this;
    }
    public String getCredentialProviderIdentifier() {
        return this.credentialProviderIdentifier;
    }

    public GetOAuthAuthorizationSessionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetOAuthAuthorizationSessionResponseBody setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
        return this;
    }
    public String getErrorDescription() {
        return this.errorDescription;
    }

    public GetOAuthAuthorizationSessionResponseBody setExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }
    public Long getExpirationTime() {
        return this.expirationTime;
    }

    public GetOAuthAuthorizationSessionResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetOAuthAuthorizationSessionResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public GetOAuthAuthorizationSessionResponseBody setSessionStatus(String sessionStatus) {
        this.sessionStatus = sessionStatus;
        return this;
    }
    public String getSessionStatus() {
        return this.sessionStatus;
    }

    public GetOAuthAuthorizationSessionResponseBody setSessionUri(String sessionUri) {
        this.sessionUri = sessionUri;
        return this;
    }
    public String getSessionUri() {
        return this.sessionUri;
    }

}
