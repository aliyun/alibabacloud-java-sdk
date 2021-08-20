// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreatePermissionApplyOrderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FlowId")
    public java.util.List<String> flowId;

    public static CreatePermissionApplyOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePermissionApplyOrderResponseBody self = new CreatePermissionApplyOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePermissionApplyOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePermissionApplyOrderResponseBody setFlowId(java.util.List<String> flowId) {
        this.flowId = flowId;
        return this;
    }
    public java.util.List<String> getFlowId() {
        return this.flowId;
    }

}
