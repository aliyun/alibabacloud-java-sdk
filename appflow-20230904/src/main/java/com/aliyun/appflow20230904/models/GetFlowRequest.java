// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class GetFlowRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>flow-xxxxx</p>
     */
    @NameInMap("FlowId")
    public String flowId;

    /**
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("FlowVersion")
    public String flowVersion;

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

    public GetFlowRequest setFlowVersion(String flowVersion) {
        this.flowVersion = flowVersion;
        return this;
    }
    public String getFlowVersion() {
        return this.flowVersion;
    }

}
