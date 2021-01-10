// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class ListFlowTriggersRequest extends TeaModel {
    @NameInMap("FlowId")
    public String flowId;

    public static ListFlowTriggersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFlowTriggersRequest self = new ListFlowTriggersRequest();
        return TeaModel.build(map, self);
    }

    public ListFlowTriggersRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

}
