// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetCreateWorkflowInstancesResultRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
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
