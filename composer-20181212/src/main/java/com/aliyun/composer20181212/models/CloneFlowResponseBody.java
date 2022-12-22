// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class CloneFlowResponseBody extends TeaModel {
    // The ID of the cloned workflow.
    @NameInMap("FlowId")
    public String flowId;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static CloneFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloneFlowResponseBody self = new CloneFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public CloneFlowResponseBody setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public CloneFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
