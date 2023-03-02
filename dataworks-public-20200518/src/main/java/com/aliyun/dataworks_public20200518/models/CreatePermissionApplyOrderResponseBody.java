// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreatePermissionApplyOrderResponseBody extends TeaModel {
    /**
     * <p>The ID of the request order. If you request permissions on multiple objects but each object has a different request approver, one request order is generated for each object and is sent to the related approver. In this case, an array is returned.</p>
     */
    @NameInMap("FlowId")
    public java.util.List<String> flowId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePermissionApplyOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePermissionApplyOrderResponseBody self = new CreatePermissionApplyOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePermissionApplyOrderResponseBody setFlowId(java.util.List<String> flowId) {
        this.flowId = flowId;
        return this;
    }
    public java.util.List<String> getFlowId() {
        return this.flowId;
    }

    public CreatePermissionApplyOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
