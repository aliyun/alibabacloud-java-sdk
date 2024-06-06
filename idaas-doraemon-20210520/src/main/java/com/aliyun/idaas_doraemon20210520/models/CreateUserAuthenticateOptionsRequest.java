// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class CreateUserAuthenticateOptionsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationExternalId")
    public String applicationExternalId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AuthenticatorType")
    public String authenticatorType;

    @NameInMap("BindHashBase64")
    public String bindHashBase64;

    @NameInMap("ClientExtendParamsJson")
    public String clientExtendParamsJson;

    @NameInMap("ClientExtendParamsJsonSign")
    public String clientExtendParamsJsonSign;

    @NameInMap("ServerExtendParamsJson")
    public String serverExtendParamsJson;

    /**
     * <p>This parameter is required.</p>
     */
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
