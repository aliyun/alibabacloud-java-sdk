// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class StopInvocationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static StopInvocationResponse build(java.util.Map<String, ?> map) throws Exception {
        StopInvocationResponse self = new StopInvocationResponse();
        return TeaModel.build(map, self);
    }

    public StopInvocationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
