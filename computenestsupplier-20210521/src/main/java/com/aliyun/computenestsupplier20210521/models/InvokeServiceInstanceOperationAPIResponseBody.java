// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class InvokeServiceInstanceOperationAPIResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OperationResults")
    public String operationResults;

    public static InvokeServiceInstanceOperationAPIResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InvokeServiceInstanceOperationAPIResponseBody self = new InvokeServiceInstanceOperationAPIResponseBody();
        return TeaModel.build(map, self);
    }

    public InvokeServiceInstanceOperationAPIResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InvokeServiceInstanceOperationAPIResponseBody setOperationResults(String operationResults) {
        this.operationResults = operationResults;
        return this;
    }
    public String getOperationResults() {
        return this.operationResults;
    }

}
