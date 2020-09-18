// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class CreateFlowResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("FlowId")
    @Validation(required = true)
    public String flowId;

    public static CreateFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowResponse self = new CreateFlowResponse();
        return TeaModel.build(map, self);
    }

    public CreateFlowResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFlowResponse setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

}
