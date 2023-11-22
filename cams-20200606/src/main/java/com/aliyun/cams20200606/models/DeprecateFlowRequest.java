// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class DeprecateFlowRequest extends TeaModel {
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>Flow ID。</p>
     */
    @NameInMap("FlowId")
    public String flowId;

    public static DeprecateFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        DeprecateFlowRequest self = new DeprecateFlowRequest();
        return TeaModel.build(map, self);
    }

    public DeprecateFlowRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public DeprecateFlowRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

}
