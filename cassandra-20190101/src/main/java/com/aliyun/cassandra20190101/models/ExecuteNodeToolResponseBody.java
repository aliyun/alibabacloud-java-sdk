// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class ExecuteNodeToolResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ExecuteNodeToolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteNodeToolResponseBody self = new ExecuteNodeToolResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteNodeToolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
