// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class CloneFlowResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("FlowId")
    @Validation(required = true)
    public String flowId;

    public static CloneFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        CloneFlowResponse self = new CloneFlowResponse();
        return TeaModel.build(map, self);
    }

    public CloneFlowResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CloneFlowResponse setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

}
