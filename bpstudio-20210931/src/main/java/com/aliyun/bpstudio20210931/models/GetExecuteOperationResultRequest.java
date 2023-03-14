// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetExecuteOperationResultRequest extends TeaModel {
    @NameInMap("OperationId")
    public String operationId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static GetExecuteOperationResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetExecuteOperationResultRequest self = new GetExecuteOperationResultRequest();
        return TeaModel.build(map, self);
    }

    public GetExecuteOperationResultRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public GetExecuteOperationResultRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
