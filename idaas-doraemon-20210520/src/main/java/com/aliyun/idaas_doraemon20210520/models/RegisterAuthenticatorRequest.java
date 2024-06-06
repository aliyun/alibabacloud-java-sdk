// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class RegisterAuthenticatorRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationExternalId")
    public String applicationExternalId;

    @NameInMap("AuthenticatorName")
    public String authenticatorName;

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

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegistrationContext")
    public String registrationContext;

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

    public static RegisterAuthenticatorRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterAuthenticatorRequest self = new RegisterAuthenticatorRequest();
        return TeaModel.build(map, self);
    }

    public RegisterAuthenticatorRequest setApplicationExternalId(String applicationExternalId) {
        this.applicationExternalId = applicationExternalId;
        return this;
    }
    public String getApplicationExternalId() {
        return this.applicationExternalId;
    }

    public RegisterAuthenticatorRequest setAuthenticatorName(String authenticatorName) {
        this.authenticatorName = authenticatorName;
        return this;
    }
    public String getAuthenticatorName() {
        return this.authenticatorName;
    }

    public RegisterAuthenticatorRequest setAuthenticatorType(String authenticatorType) {
        this.authenticatorType = authenticatorType;
        return this;
    }
    public String getAuthenticatorType() {
        return this.authenticatorType;
    }

    public RegisterAuthenticatorRequest setClientExtendParamsJson(String clientExtendParamsJson) {
        this.clientExtendParamsJson = clientExtendParamsJson;
        return this;
    }
    public String getClientExtendParamsJson() {
        return this.clientExtendParamsJson;
    }

    public RegisterAuthenticatorRequest setClientExtendParamsJsonSign(String clientExtendParamsJsonSign) {
        this.clientExtendParamsJsonSign = clientExtendParamsJsonSign;
        return this;
    }
    public String getClientExtendParamsJsonSign() {
        return this.clientExtendParamsJsonSign;
    }

    public RegisterAuthenticatorRequest setLogParams(String logParams) {
        this.logParams = logParams;
        return this;
    }
    public String getLogParams() {
        return this.logParams;
    }

    public RegisterAuthenticatorRequest setRegistrationContext(String registrationContext) {
        this.registrationContext = registrationContext;
        return this;
    }
    public String getRegistrationContext() {
        return this.registrationContext;
    }

    public RegisterAuthenticatorRequest setRequireChallengeBase64(String requireChallengeBase64) {
        this.requireChallengeBase64 = requireChallengeBase64;
        return this;
    }
    public String getRequireChallengeBase64() {
        return this.requireChallengeBase64;
    }

    public RegisterAuthenticatorRequest setServerExtendParamsJson(String serverExtendParamsJson) {
        this.serverExtendParamsJson = serverExtendParamsJson;
        return this;
    }
    public String getServerExtendParamsJson() {
        return this.serverExtendParamsJson;
    }

    public RegisterAuthenticatorRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public RegisterAuthenticatorRequest setUserSourceIp(String userSourceIp) {
        this.userSourceIp = userSourceIp;
        return this;
    }
    public String getUserSourceIp() {
        return this.userSourceIp;
    }

}
