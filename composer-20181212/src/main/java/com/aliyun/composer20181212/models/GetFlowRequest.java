// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class GetFlowRequest extends TeaModel {
    @NameInMap("FlowId")
    @Validation(required = true)
    public String flowId;

    public static GetFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFlowRequest self = new GetFlowRequest();
        return TeaModel.build(map, self);
    }

    public GetFlowRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

}
