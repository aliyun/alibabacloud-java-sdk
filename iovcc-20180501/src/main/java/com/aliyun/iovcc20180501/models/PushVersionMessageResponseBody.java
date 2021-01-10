// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class PushVersionMessageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static PushVersionMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushVersionMessageResponseBody self = new PushVersionMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public PushVersionMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
