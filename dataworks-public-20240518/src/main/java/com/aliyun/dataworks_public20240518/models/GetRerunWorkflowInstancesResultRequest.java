// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetRerunWorkflowInstancesResultRequest extends TeaModel {
    /**
     * <p>The operation ID used to asynchronously query the result of the workflow instance rerun. This value is obtained from the RerunWorkflowInstances operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e15ad21c-b0e9-4792-8f55-b037xxxxxxxx</p>
     */
    @NameInMap("OperationId")
    public String operationId;

    public static GetRerunWorkflowInstancesResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRerunWorkflowInstancesResultRequest self = new GetRerunWorkflowInstancesResultRequest();
        return TeaModel.build(map, self);
    }

    public GetRerunWorkflowInstancesResultRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

}
