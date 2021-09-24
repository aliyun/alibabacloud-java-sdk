// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreatePermissionApplyOrderResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("FlowId")
    @Validation(required = true)
    public java.util.List<String> flowId;

    public static CreatePermissionApplyOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePermissionApplyOrderResponse self = new CreatePermissionApplyOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreatePermissionApplyOrderResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePermissionApplyOrderResponse setFlowId(java.util.List<String> flowId) {
        this.flowId = flowId;
        return this;
    }
    public java.util.List<String> getFlowId() {
        return this.flowId;
    }

}
