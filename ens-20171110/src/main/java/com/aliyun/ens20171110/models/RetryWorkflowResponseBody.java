// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RetryWorkflowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RetryWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetryWorkflowResponseBody self = new RetryWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public RetryWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
