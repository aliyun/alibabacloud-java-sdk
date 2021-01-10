// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AllowPushStreamResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AllowPushStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllowPushStreamResponseBody self = new AllowPushStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public AllowPushStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
