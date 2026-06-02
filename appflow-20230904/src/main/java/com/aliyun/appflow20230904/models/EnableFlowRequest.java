// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class EnableFlowRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>flow-0bf98338eb1f4d10ad6a</p>
     */
    @NameInMap("FlowId")
    public String flowId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("FlowVersion")
    public Integer flowVersion;

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

    public EnableFlowRequest setFlowVersion(Integer flowVersion) {
        this.flowVersion = flowVersion;
        return this;
    }
    public Integer getFlowVersion() {
        return this.flowVersion;
    }

}
