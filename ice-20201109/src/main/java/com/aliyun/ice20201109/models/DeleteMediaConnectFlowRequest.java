// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteMediaConnectFlowRequest extends TeaModel {
    /**
     * <p>Flow instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0381f478-7d53-4076-9d5f-27680a6f73e7</p>
     */
    @NameInMap("FlowId")
    public String flowId;

    public static DeleteMediaConnectFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaConnectFlowRequest self = new DeleteMediaConnectFlowRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMediaConnectFlowRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

}
