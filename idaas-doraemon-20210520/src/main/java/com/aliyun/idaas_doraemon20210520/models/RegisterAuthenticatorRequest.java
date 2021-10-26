// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class RegisterAuthenticatorRequest extends TeaModel {
    // 应用外部Id
    @NameInMap("ApplicationExternalId")
    public String applicationExternalId;

    // 认证器类型
    @NameInMap("AuthenticatorType")
    public String authenticatorType;

    // 用户id
    @NameInMap("UserId")
    public String userId;

    // 认证器名字
    @NameInMap("AuthenticatorName")
    public String authenticatorName;

    // 注册上下文
    @NameInMap("RegistrationContext")
    public String registrationContext;

    // 会话绑定的challenge base64标识
    @NameInMap("RequireChallengeBase64")
    public String requireChallengeBase64;

    // 客户端SDK生成认证上下文
    @NameInMap("ClientExtendParamsJson")
    public String clientExtendParamsJson;

    // 客户端SDK生成认证上下文签名信息
    @NameInMap("ClientExtendParamsJsonSign")
    public String clientExtendParamsJsonSign;

    // 服务端配置项，决定认证要求属性
    @NameInMap("ServerExtendParamsJson")
    public String serverExtendParamsJson;

    // 用户端来源IP地址，用于审计
    @NameInMap("UserSourceIp")
    public String userSourceIp;

    // 用户自定义记录审计日志信息
    @NameInMap("LogParams")
    public String logParams;

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

    public RegisterAuthenticatorRequest setAuthenticatorType(String authenticatorType) {
        this.authenticatorType = authenticatorType;
        return this;
    }
    public String getAuthenticatorType() {
        return this.authenticatorType;
    }

    public RegisterAuthenticatorRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public RegisterAuthenticatorRequest setAuthenticatorName(String authenticatorName) {
        this.authenticatorName = authenticatorName;
        return this;
    }
    public String getAuthenticatorName() {
        return this.authenticatorName;
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

    public RegisterAuthenticatorRequest setServerExtendParamsJson(String serverExtendParamsJson) {
        this.serverExtendParamsJson = serverExtendParamsJson;
        return this;
    }
    public String getServerExtendParamsJson() {
        return this.serverExtendParamsJson;
    }

    public RegisterAuthenticatorRequest setUserSourceIp(String userSourceIp) {
        this.userSourceIp = userSourceIp;
        return this;
    }
    public String getUserSourceIp() {
        return this.userSourceIp;
    }

    public RegisterAuthenticatorRequest setLogParams(String logParams) {
        this.logParams = logParams;
        return this;
    }
    public String getLogParams() {
        return this.logParams;
    }

}
