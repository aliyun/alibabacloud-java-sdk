// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class RollBackFlowRequest extends TeaModel {
    @NameInMap("FlowId")
    public String flowId;

    public static RollBackFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        RollBackFlowRequest self = new RollBackFlowRequest();
        return TeaModel.build(map, self);
    }

    public RollBackFlowRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

}
