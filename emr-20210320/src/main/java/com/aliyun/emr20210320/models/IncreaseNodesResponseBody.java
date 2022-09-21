// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class IncreaseNodesResponseBody extends TeaModel {
    @NameInMap("OperationId")
    public String operationId;

    @NameInMap("RequestId")
    public String requestId;

    public static IncreaseNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IncreaseNodesResponseBody self = new IncreaseNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public IncreaseNodesResponseBody setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public IncreaseNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
