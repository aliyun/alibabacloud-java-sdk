// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ForbidPushStreamResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ForbidPushStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        ForbidPushStreamResponse self = new ForbidPushStreamResponse();
        return TeaModel.build(map, self);
    }

    public ForbidPushStreamResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
