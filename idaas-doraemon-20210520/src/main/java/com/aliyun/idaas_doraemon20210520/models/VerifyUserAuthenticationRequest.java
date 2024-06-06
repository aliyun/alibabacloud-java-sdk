// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class VerifyUserAuthenticationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationExternalId")
    public String applicationExternalId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AuthenticationContext")
    public String authenticationContext;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AuthenticatorType")
    public String authenticatorType;

    @NameInMap("ClientExtendParamsJson")
    public String clientExtendParamsJson;

    @NameInMap("ClientExtendParamsJsonSign")
    public String clientExtendParamsJsonSign;

    @NameInMap("LogParams")
    public String logParams;

    @NameInMap("LogTag")
    public String logTag;

    @NameInMap("RequireBindHashBase64")
    public String requireBindHashBase64;

    @NameInMap("RequireChallengeBase64")
    public String requireChallengeBase64;

    @NameInMap("ServerExtendParamsJson")
    public String serverExtendParamsJson;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserSourceIp")
    public String userSourceIp;

    public static VerifyUserAuthenticationRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyUserAuthenticationRequest self = new VerifyUserAuthenticationRequest();
        return TeaModel.build(map, self);
    }

    public VerifyUserAuthenticationRequest setApplicationExternalId(String applicationExternalId) {
        this.applicationExternalId = applicationExternalId;
        return this;
    }
    public String getApplicationExternalId() {
        return this.applicationExternalId;
    }

    public VerifyUserAuthenticationRequest setAuthenticationContext(String authenticationContext) {
        this.authenticationContext = authenticationContext;
        return this;
    }
    public String getAuthenticationContext() {
        return this.authenticationContext;
    }

    public VerifyUserAuthenticationRequest setAuthenticatorType(String authenticatorType) {
        this.authenticatorType = authenticatorType;
        return this;
    }
    public String getAuthenticatorType() {
        return this.authenticatorType;
    }

    public VerifyUserAuthenticationRequest setClientExtendParamsJson(String clientExtendParamsJson) {
        this.clientExtendParamsJson = clientExtendParamsJson;
        return this;
    }
    public String getClientExtendParamsJson() {
        return this.clientExtendParamsJson;
    }

    public VerifyUserAuthenticationRequest setClientExtendParamsJsonSign(String clientExtendParamsJsonSign) {
        this.clientExtendParamsJsonSign = clientExtendParamsJsonSign;
        return this;
    }
    public String getClientExtendParamsJsonSign() {
        return this.clientExtendParamsJsonSign;
    }

    public VerifyUserAuthenticationRequest setLogParams(String logParams) {
        this.logParams = logParams;
        return this;
    }
    public String getLogParams() {
        return this.logParams;
    }

    public VerifyUserAuthenticationRequest setLogTag(String logTag) {
        this.logTag = logTag;
        return this;
    }
    public String getLogTag() {
        return this.logTag;
    }

    public VerifyUserAuthenticationRequest setRequireBindHashBase64(String requireBindHashBase64) {
        this.requireBindHashBase64 = requireBindHashBase64;
        return this;
    }
    public String getRequireBindHashBase64() {
        return this.requireBindHashBase64;
    }

    public VerifyUserAuthenticationRequest setRequireChallengeBase64(String requireChallengeBase64) {
        this.requireChallengeBase64 = requireChallengeBase64;
        return this;
    }
    public String getRequireChallengeBase64() {
        return this.requireChallengeBase64;
    }

    public VerifyUserAuthenticationRequest setServerExtendParamsJson(String serverExtendParamsJson) {
        this.serverExtendParamsJson = serverExtendParamsJson;
        return this;
    }
    public String getServerExtendParamsJson() {
        return this.serverExtendParamsJson;
    }

    public VerifyUserAuthenticationRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public VerifyUserAuthenticationRequest setUserSourceIp(String userSourceIp) {
        this.userSourceIp = userSourceIp;
        return this;
    }
    public String getUserSourceIp() {
        return this.userSourceIp;
    }

}
