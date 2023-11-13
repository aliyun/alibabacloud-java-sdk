// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class RunApplicationActionResponseBody extends TeaModel {
    /**
     * <p>The operation ID.</p>
     */
    @NameInMap("OperationId")
    public String operationId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunApplicationActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunApplicationActionResponseBody self = new RunApplicationActionResponseBody();
        return TeaModel.build(map, self);
    }

    public RunApplicationActionResponseBody setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public RunApplicationActionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
