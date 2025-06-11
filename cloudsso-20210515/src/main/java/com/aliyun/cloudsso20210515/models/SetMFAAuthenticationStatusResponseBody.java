// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class SetMFAAuthenticationStatusResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>14E2B1A9-7713-5E6F-8409-8DE12DF51AF4</p>
     */
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
