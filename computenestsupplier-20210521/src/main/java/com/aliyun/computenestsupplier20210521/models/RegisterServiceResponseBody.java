// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class RegisterServiceResponseBody extends TeaModel {
    @NameInMap("RegistrationId")
    public String registrationId;

    @NameInMap("RequestId")
    public String requestId;

    public static RegisterServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterServiceResponseBody self = new RegisterServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterServiceResponseBody setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
        return this;
    }
    public String getRegistrationId() {
        return this.registrationId;
    }

    public RegisterServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
