// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class CreateFlowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FlowId")
    public String flowId;

    public static CreateFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowResponseBody self = new CreateFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFlowResponseBody setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

}
