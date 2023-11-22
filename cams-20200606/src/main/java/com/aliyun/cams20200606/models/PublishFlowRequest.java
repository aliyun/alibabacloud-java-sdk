// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class PublishFlowRequest extends TeaModel {
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>Flow ID。</p>
     */
    @NameInMap("FlowId")
    public String flowId;

    public static PublishFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishFlowRequest self = new PublishFlowRequest();
        return TeaModel.build(map, self);
    }

    public PublishFlowRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public PublishFlowRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

}
