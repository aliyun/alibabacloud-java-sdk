// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class CloneFlowRequest extends TeaModel {
    @NameInMap("FlowId")
    public String flowId;

    @NameInMap("FlowVersion")
    public Integer flowVersion;

    public static CloneFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneFlowRequest self = new CloneFlowRequest();
        return TeaModel.build(map, self);
    }

    public CloneFlowRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public CloneFlowRequest setFlowVersion(Integer flowVersion) {
        this.flowVersion = flowVersion;
        return this;
    }
    public Integer getFlowVersion() {
        return this.flowVersion;
    }

}
