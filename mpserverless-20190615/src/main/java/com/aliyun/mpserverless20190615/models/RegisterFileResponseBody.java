// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class RegisterFileResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RegisterFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterFileResponseBody self = new RegisterFileResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
