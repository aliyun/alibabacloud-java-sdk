// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class DeployFlowRequest extends TeaModel {
    @NameInMap("FlowId")
    public String flowId;

    public static DeployFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployFlowRequest self = new DeployFlowRequest();
        return TeaModel.build(map, self);
    }

    public DeployFlowRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

}
