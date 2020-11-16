// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AllowPushStreamResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AllowPushStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        AllowPushStreamResponse self = new AllowPushStreamResponse();
        return TeaModel.build(map, self);
    }

    public AllowPushStreamResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
