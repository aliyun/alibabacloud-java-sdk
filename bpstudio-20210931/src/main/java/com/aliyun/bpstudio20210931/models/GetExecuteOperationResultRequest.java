// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetExecuteOperationResultRequest extends TeaModel {
    /**
     * <p>The ID of the operation.</p>
     */
    @NameInMap("OperationId")
    public String operationId;

    /**
     * <p>The ID of the resource group. This parameter is specified to verify the permissions on the resource group.</p>
     */
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
