// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class ListFlowConnectionsRequest extends TeaModel {
    @NameInMap("FlowId")
    public String flowId;

    public static ListFlowConnectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFlowConnectionsRequest self = new ListFlowConnectionsRequest();
        return TeaModel.build(map, self);
    }

    public ListFlowConnectionsRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

}
