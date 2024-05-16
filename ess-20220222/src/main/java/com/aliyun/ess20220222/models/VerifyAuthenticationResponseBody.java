// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class VerifyAuthenticationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static VerifyAuthenticationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyAuthenticationResponseBody self = new VerifyAuthenticationResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyAuthenticationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
