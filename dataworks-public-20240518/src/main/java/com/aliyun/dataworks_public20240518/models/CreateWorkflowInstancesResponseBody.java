// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateWorkflowInstancesResponseBody extends TeaModel {
    /**
     * <p>The ID of the operation. You can use this field to query the results of the creation operation through the GetCreateWorkflowInstancesResult interface.</p>
     * 
     * <strong>example:</strong>
     * <p>e15ad21c-b0e9-4792-8f55-b037xxxxxxxx</p>
     */
    @NameInMap("OperationId")
    public String operationId;

    /**
     * <p>The ID of the request. It is used to locate logs and troubleshoot problems.</p>
     * 
     * <strong>example:</strong>
     * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
     */
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
