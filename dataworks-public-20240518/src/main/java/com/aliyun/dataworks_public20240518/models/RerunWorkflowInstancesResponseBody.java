// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RerunWorkflowInstancesResponseBody extends TeaModel {
    /**
     * <p>The operation ID. You can use this value to query the creation result via the GetRerunWorkflowInstancesResult operation.</p>
     * 
     * <strong>example:</strong>
     * <p>e15ad21c-b0e9-4792-8f55-b037xxxxxxxx</p>
     */
    @NameInMap("OperationId")
    public String operationId;

    /**
     * <p>The request ID. Used for troubleshooting and log tracking.</p>
     * 
     * <strong>example:</strong>
     * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RerunWorkflowInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RerunWorkflowInstancesResponseBody self = new RerunWorkflowInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public RerunWorkflowInstancesResponseBody setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public RerunWorkflowInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
