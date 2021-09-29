// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class PushConfigInfoResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static PushConfigInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushConfigInfoResponseBody self = new PushConfigInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public PushConfigInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
