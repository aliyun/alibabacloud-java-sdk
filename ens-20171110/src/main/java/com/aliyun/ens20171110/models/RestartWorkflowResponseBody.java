// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RestartWorkflowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RestartWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartWorkflowResponseBody self = new RestartWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
