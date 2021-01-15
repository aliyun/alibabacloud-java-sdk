// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class RetryTasksResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static RetryTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetryTasksResponseBody self = new RetryTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public RetryTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
