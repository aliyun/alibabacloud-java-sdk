// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RollbackWorkflowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RollbackWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RollbackWorkflowResponseBody self = new RollbackWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public RollbackWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
