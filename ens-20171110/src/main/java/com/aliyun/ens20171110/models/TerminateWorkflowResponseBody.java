// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class TerminateWorkflowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static TerminateWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TerminateWorkflowResponseBody self = new TerminateWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public TerminateWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}