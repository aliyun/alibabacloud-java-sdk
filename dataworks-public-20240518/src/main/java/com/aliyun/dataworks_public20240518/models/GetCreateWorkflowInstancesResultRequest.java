// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetCreateWorkflowInstancesResultRequest extends TeaModel {
    /**
     * <p>The operation ID. This parameter is used to query the result of asynchronously creating a workflow instance. You can call the CreateWorkflowInstances operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e15ad21c-b0e9-4792-8f55-b037xxxxxxxx</p>
     */
    @NameInMap("OperationId")
    public String operationId;

    public static GetCreateWorkflowInstancesResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCreateWorkflowInstancesResultRequest self = new GetCreateWorkflowInstancesResultRequest();
        return TeaModel.build(map, self);
    }

    public GetCreateWorkflowInstancesResultRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

}
