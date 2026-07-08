// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class DisableFlowRequest extends TeaModel {
    /**
     * <p>The flow ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>flow-xxxxxx</p>
     */
    @NameInMap("FlowId")
    public String flowId;

    /**
     * <p>The flow version.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FlowVersion")
    public Integer flowVersion;

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

    public DisableFlowRequest setFlowVersion(Integer flowVersion) {
        this.flowVersion = flowVersion;
        return this;
    }
    public Integer getFlowVersion() {
        return this.flowVersion;
    }

}
