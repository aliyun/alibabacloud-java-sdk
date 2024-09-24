// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CancelOperationPlanResponseBody extends TeaModel {
    @NameInMap("request_id")
    public String requestId;

    public static CancelOperationPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelOperationPlanResponseBody self = new CancelOperationPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelOperationPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
