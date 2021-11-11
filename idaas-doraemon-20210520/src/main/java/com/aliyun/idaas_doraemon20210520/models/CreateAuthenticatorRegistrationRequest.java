// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class CreateAuthenticatorRegistrationRequest extends TeaModel {
    // 应用外部Id
    @NameInMap("ApplicationExternalId")
    public String applicationExternalId;

    // 认证器类型
    @NameInMap("AuthenticatorType")
    public String authenticatorType;

    // 客户端SDK生成认证上下文
    @NameInMap("ClientExtendParamsJson")
    public String clientExtendParamsJson;

    // 客户端SDK生成认证上下文签名信息
    @NameInMap("ClientExtendParamsJsonSign")
    public String clientExtendParamsJsonSign;

    // 注册上下文
    @NameInMap("RegistrationContext")
    public String registrationContext;

    // 服务端配置项，决定认证要求属性
    @NameInMap("ServerExtendParamsJson")
    public String serverExtendParamsJson;

    // 用户展示名
    @NameInMap("UserDisplayName")
    public String userDisplayName;

    // 用户id
    @NameInMap("UserId")
    public String userId;

    // 用户姓名
    @NameInMap("UserName")
    public String userName;

    public static CreateAuthenticatorRegistrationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthenticatorRegistrationRequest self = new CreateAuthenticatorRegistrationRequest();
        return TeaModel.build(map, self);
    }

    public CreateAuthenticatorRegistrationRequest setApplicationExternalId(String applicationExternalId) {
        this.applicationExternalId = applicationExternalId;
        return this;
    }
    public String getApplicationExternalId() {
        return this.applicationExternalId;
    }

    public CreateAuthenticatorRegistrationRequest setAuthenticatorType(String authenticatorType) {
        this.authenticatorType = authenticatorType;
        return this;
    }
    public String getAuthenticatorType() {
        return this.authenticatorType;
    }

    public CreateAuthenticatorRegistrationRequest setClientExtendParamsJson(String clientExtendParamsJson) {
        this.clientExtendParamsJson = clientExtendParamsJson;
        return this;
    }
    public String getClientExtendParamsJson() {
        return this.clientExtendParamsJson;
    }

    public CreateAuthenticatorRegistrationRequest setClientExtendParamsJsonSign(String clientExtendParamsJsonSign) {
        this.clientExtendParamsJsonSign = clientExtendParamsJsonSign;
        return this;
    }
    public String getClientExtendParamsJsonSign() {
        return this.clientExtendParamsJsonSign;
    }

    public CreateAuthenticatorRegistrationRequest setRegistrationContext(String registrationContext) {
        this.registrationContext = registrationContext;
        return this;
    }
    public String getRegistrationContext() {
        return this.registrationContext;
    }

    public CreateAuthenticatorRegistrationRequest setServerExtendParamsJson(String serverExtendParamsJson) {
        this.serverExtendParamsJson = serverExtendParamsJson;
        return this;
    }
    public String getServerExtendParamsJson() {
        return this.serverExtendParamsJson;
    }

    public CreateAuthenticatorRegistrationRequest setUserDisplayName(String userDisplayName) {
        this.userDisplayName = userDisplayName;
        return this;
    }
    public String getUserDisplayName() {
        return this.userDisplayName;
    }

    public CreateAuthenticatorRegistrationRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateAuthenticatorRegistrationRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
