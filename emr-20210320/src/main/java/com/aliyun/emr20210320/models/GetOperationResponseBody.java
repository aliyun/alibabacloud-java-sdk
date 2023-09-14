// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetOperationResponseBody extends TeaModel {
    /**
     * <p>The operation that is performed.</p>
     */
    @NameInMap("Operation")
    public Operation operation;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetOperationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOperationResponseBody self = new GetOperationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOperationResponseBody setOperation(Operation operation) {
        this.operation = operation;
        return this;
    }
    public Operation getOperation() {
        return this.operation;
    }

    public GetOperationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
