// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class DecreaseNodesResponseBody extends TeaModel {
    /**
     * <p>Operation ID.</p>
     */
    @NameInMap("OperationId")
    public String operationId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DecreaseNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DecreaseNodesResponseBody self = new DecreaseNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DecreaseNodesResponseBody setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public DecreaseNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
