// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class VerifyUserAuthenticationRequest extends TeaModel {
    // 应用外部Id
    @NameInMap("ApplicationExternalId")
    public String applicationExternalId;

    // 认证器类型
    @NameInMap("AuthenticatorType")
    public String authenticatorType;

    // 用户id
    @NameInMap("UserId")
    public String userId;

    // 认证上下文，由AuthenticatorType决定格式
    @NameInMap("AuthenticationContext")
    public String authenticationContext;

    // 会话绑定的challenge base64标识
    @NameInMap("RequireChallengeBase64")
    public String requireChallengeBase64;

    // 认证绑定的操作hash base64标识
    @NameInMap("RequireBindHashBase64")
    public String requireBindHashBase64;

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

    // 用户自定义记录审计日志标签
    @NameInMap("LogTag")
    public String logTag;

    // 用户自定义记录审计日志信息
    @NameInMap("LogParams")
    public String logParams;

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

    public VerifyUserAuthenticationRequest setAuthenticatorType(String authenticatorType) {
        this.authenticatorType = authenticatorType;
        return this;
    }
    public String getAuthenticatorType() {
        return this.authenticatorType;
    }

    public VerifyUserAuthenticationRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public VerifyUserAuthenticationRequest setAuthenticationContext(String authenticationContext) {
        this.authenticationContext = authenticationContext;
        return this;
    }
    public String getAuthenticationContext() {
        return this.authenticationContext;
    }

    public VerifyUserAuthenticationRequest setRequireChallengeBase64(String requireChallengeBase64) {
        this.requireChallengeBase64 = requireChallengeBase64;
        return this;
    }
    public String getRequireChallengeBase64() {
        return this.requireChallengeBase64;
    }

    public VerifyUserAuthenticationRequest setRequireBindHashBase64(String requireBindHashBase64) {
        this.requireBindHashBase64 = requireBindHashBase64;
        return this;
    }
    public String getRequireBindHashBase64() {
        return this.requireBindHashBase64;
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

    public VerifyUserAuthenticationRequest setServerExtendParamsJson(String serverExtendParamsJson) {
        this.serverExtendParamsJson = serverExtendParamsJson;
        return this;
    }
    public String getServerExtendParamsJson() {
        return this.serverExtendParamsJson;
    }

    public VerifyUserAuthenticationRequest setUserSourceIp(String userSourceIp) {
        this.userSourceIp = userSourceIp;
        return this;
    }
    public String getUserSourceIp() {
        return this.userSourceIp;
    }

    public VerifyUserAuthenticationRequest setLogTag(String logTag) {
        this.logTag = logTag;
        return this;
    }
    public String getLogTag() {
        return this.logTag;
    }

    public VerifyUserAuthenticationRequest setLogParams(String logParams) {
        this.logParams = logParams;
        return this;
    }
    public String getLogParams() {
        return this.logParams;
    }

}
