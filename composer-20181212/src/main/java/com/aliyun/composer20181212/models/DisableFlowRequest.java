// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class DisableFlowRequest extends TeaModel {
    @NameInMap("FlowId")
    @Validation(required = true)
    public String flowId;

    public static DisableFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableFlowRequest self = new DisableFlowRequest();
        return TeaModel.build(map, self);
    }

    public DisableFlowRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

}
