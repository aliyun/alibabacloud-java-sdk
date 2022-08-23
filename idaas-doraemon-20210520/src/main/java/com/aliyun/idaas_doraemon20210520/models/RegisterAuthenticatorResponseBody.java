// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class RegisterAuthenticatorResponseBody extends TeaModel {
    @NameInMap("AuthenticatorUuid")
    public String authenticatorUuid;

    @NameInMap("EtasResponseSting")
    public String etasResponseSting;

    @NameInMap("RequestId")
    public String requestId;

    public static RegisterAuthenticatorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterAuthenticatorResponseBody self = new RegisterAuthenticatorResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterAuthenticatorResponseBody setAuthenticatorUuid(String authenticatorUuid) {
        this.authenticatorUuid = authenticatorUuid;
        return this;
    }
    public String getAuthenticatorUuid() {
        return this.authenticatorUuid;
    }

    public RegisterAuthenticatorResponseBody setEtasResponseSting(String etasResponseSting) {
        this.etasResponseSting = etasResponseSting;
        return this;
    }
    public String getEtasResponseSting() {
        return this.etasResponseSting;
    }

    public RegisterAuthenticatorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
