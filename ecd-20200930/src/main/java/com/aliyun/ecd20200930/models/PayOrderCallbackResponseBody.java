// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class PayOrderCallbackResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static PayOrderCallbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PayOrderCallbackResponseBody self = new PayOrderCallbackResponseBody();
        return TeaModel.build(map, self);
    }

    public PayOrderCallbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
