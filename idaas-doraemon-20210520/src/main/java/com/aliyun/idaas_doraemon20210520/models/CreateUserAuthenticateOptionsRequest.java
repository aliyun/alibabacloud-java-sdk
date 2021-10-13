// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class CreateUserAuthenticateOptionsRequest extends TeaModel {
    // 应用外部Id
    @NameInMap("ApplicationExternalId")
    public String applicationExternalId;

    // 认证器类型
    @NameInMap("AuthenticatorType")
    public String authenticatorType;

    // 操作hash，用来和认证绑定
    @NameInMap("BindHashBase64")
    public String bindHashBase64;

    // 客户端SDK生成认证上下文
    @NameInMap("ClientExtendParamsJson")
    public String clientExtendParamsJson;

    // 客户端SDK生成认证上下文签名信息
    @NameInMap("ClientExtendParamsJsonSign")
    public String clientExtendParamsJsonSign;

    // 服务端配置项，决定认证要求属性
    @NameInMap("ServerExtendParamsJson")
    public String serverExtendParamsJson;

    // 用户id
    @NameInMap("UserId")
    public String userId;

    public static CreateUserAuthenticateOptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserAuthenticateOptionsRequest self = new CreateUserAuthenticateOptionsRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserAuthenticateOptionsRequest setApplicationExternalId(String applicationExternalId) {
        this.applicationExternalId = applicationExternalId;
        return this;
    }
    public String getApplicationExternalId() {
        return this.applicationExternalId;
    }

    public CreateUserAuthenticateOptionsRequest setAuthenticatorType(String authenticatorType) {
        this.authenticatorType = authenticatorType;
        return this;
    }
    public String getAuthenticatorType() {
        return this.authenticatorType;
    }

    public CreateUserAuthenticateOptionsRequest setBindHashBase64(String bindHashBase64) {
        this.bindHashBase64 = bindHashBase64;
        return this;
    }
    public String getBindHashBase64() {
        return this.bindHashBase64;
    }

    public CreateUserAuthenticateOptionsRequest setClientExtendParamsJson(String clientExtendParamsJson) {
        this.clientExtendParamsJson = clientExtendParamsJson;
        return this;
    }
    public String getClientExtendParamsJson() {
        return this.clientExtendParamsJson;
    }

    public CreateUserAuthenticateOptionsRequest setClientExtendParamsJsonSign(String clientExtendParamsJsonSign) {
        this.clientExtendParamsJsonSign = clientExtendParamsJsonSign;
        return this;
    }
    public String getClientExtendParamsJsonSign() {
        return this.clientExtendParamsJsonSign;
    }

    public CreateUserAuthenticateOptionsRequest setServerExtendParamsJson(String serverExtendParamsJson) {
        this.serverExtendParamsJson = serverExtendParamsJson;
        return this;
    }
    public String getServerExtendParamsJson() {
        return this.serverExtendParamsJson;
    }

    public CreateUserAuthenticateOptionsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
