// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class EnableFlowRequest extends TeaModel {
    @NameInMap("FlowId")
    public String flowId;

    public static EnableFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableFlowRequest self = new EnableFlowRequest();
        return TeaModel.build(map, self);
    }

    public EnableFlowRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

}
