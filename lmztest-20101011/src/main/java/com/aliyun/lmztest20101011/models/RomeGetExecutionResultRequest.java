// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class RomeGetExecutionResultRequest extends TeaModel {
    @NameInMap("FlowRequestId")
    public String flowRequestId;

    public static RomeGetExecutionResultRequest build(java.util.Map<String, ?> map) throws Exception {
        RomeGetExecutionResultRequest self = new RomeGetExecutionResultRequest();
        return TeaModel.build(map, self);
    }

    public RomeGetExecutionResultRequest setFlowRequestId(String flowRequestId) {
        this.flowRequestId = flowRequestId;
        return this;
    }
    public String getFlowRequestId() {
        return this.flowRequestId;
    }

}
