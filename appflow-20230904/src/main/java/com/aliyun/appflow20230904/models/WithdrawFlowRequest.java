// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class WithdrawFlowRequest extends TeaModel {
    /**
     * <p>The connection flow ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>flow-6b03788c25244c93b254</p>
     */
    @NameInMap("FlowId")
    public String flowId;

    /**
     * <p>The connection flow version.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FlowVersion")
    public Integer flowVersion;

    public static WithdrawFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        WithdrawFlowRequest self = new WithdrawFlowRequest();
        return TeaModel.build(map, self);
    }

    public WithdrawFlowRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public WithdrawFlowRequest setFlowVersion(Integer flowVersion) {
        this.flowVersion = flowVersion;
        return this;
    }
    public Integer getFlowVersion() {
        return this.flowVersion;
    }

}
