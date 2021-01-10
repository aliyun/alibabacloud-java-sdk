// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class DeleteFlowRequest extends TeaModel {
    @NameInMap("FlowId")
    public String flowId;

    @NameInMap("FlowIds")
    public String flowIds;

    public static DeleteFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowRequest self = new DeleteFlowRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFlowRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public DeleteFlowRequest setFlowIds(String flowIds) {
        this.flowIds = flowIds;
        return this;
    }
    public String getFlowIds() {
        return this.flowIds;
    }

}
