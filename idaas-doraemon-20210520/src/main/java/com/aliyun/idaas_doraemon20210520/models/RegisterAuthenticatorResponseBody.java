// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class RegisterAuthenticatorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    // 认证器UUID
    @NameInMap("AuthenticatorUuid")
    public String authenticatorUuid;

    public static RegisterAuthenticatorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterAuthenticatorResponseBody self = new RegisterAuthenticatorResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterAuthenticatorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RegisterAuthenticatorResponseBody setAuthenticatorUuid(String authenticatorUuid) {
        this.authenticatorUuid = authenticatorUuid;
        return this;
    }
    public String getAuthenticatorUuid() {
        return this.authenticatorUuid;
    }

}
