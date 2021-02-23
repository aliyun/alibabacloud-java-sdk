// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class CloneFlowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FlowId")
    public String flowId;

    public static CloneFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloneFlowResponseBody self = new CloneFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public CloneFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CloneFlowResponseBody setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

}
