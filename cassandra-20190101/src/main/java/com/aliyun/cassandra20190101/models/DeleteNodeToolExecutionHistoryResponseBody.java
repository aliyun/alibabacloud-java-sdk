// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DeleteNodeToolExecutionHistoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNodeToolExecutionHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNodeToolExecutionHistoryResponseBody self = new DeleteNodeToolExecutionHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNodeToolExecutionHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
