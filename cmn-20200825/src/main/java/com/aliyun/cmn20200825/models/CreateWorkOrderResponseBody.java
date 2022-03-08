// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateWorkOrderResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 工单ID
    @NameInMap("WorkOrderId")
    public String workOrderId;

    public static CreateWorkOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkOrderResponseBody self = new CreateWorkOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWorkOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWorkOrderResponseBody setWorkOrderId(String workOrderId) {
        this.workOrderId = workOrderId;
        return this;
    }
    public String getWorkOrderId() {
        return this.workOrderId;
    }

}
