// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class CreateWorkflowInstancesResponseBody extends TeaModel {
    @NameInMap("OperationId")
    public String operationId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateWorkflowInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkflowInstancesResponseBody self = new CreateWorkflowInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWorkflowInstancesResponseBody setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public CreateWorkflowInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
