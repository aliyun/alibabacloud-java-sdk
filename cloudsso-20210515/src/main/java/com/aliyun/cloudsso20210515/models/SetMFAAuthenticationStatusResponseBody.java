// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class SetMFAAuthenticationStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetMFAAuthenticationStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetMFAAuthenticationStatusResponseBody self = new SetMFAAuthenticationStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public SetMFAAuthenticationStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
