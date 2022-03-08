// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class RemarkWorkOrderResponseBody extends TeaModel {
    // 操作id
    @NameInMap("OperationId")
    public String operationId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static RemarkWorkOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemarkWorkOrderResponseBody self = new RemarkWorkOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public RemarkWorkOrderResponseBody setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public RemarkWorkOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
