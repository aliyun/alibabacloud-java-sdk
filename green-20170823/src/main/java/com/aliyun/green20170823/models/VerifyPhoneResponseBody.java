// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class VerifyPhoneResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static VerifyPhoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyPhoneResponseBody self = new VerifyPhoneResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyPhoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
