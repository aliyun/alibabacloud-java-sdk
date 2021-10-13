// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class DeregisterAuthenticatorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeregisterAuthenticatorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeregisterAuthenticatorResponseBody self = new DeregisterAuthenticatorResponseBody();
        return TeaModel.build(map, self);
    }

    public DeregisterAuthenticatorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
