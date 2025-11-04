// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class OpenMediaConnectFlowFailoverRequest extends TeaModel {
    /**
     * <p>The ID of the MediaConnect flow.</p>
     * 
     * <strong>example:</strong>
     * <p>34900dc6-90ec-4968-af3c-fcd87f231a5f</p>
     */
    @NameInMap("FlowId")
    public String flowId;

    public static OpenMediaConnectFlowFailoverRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenMediaConnectFlowFailoverRequest self = new OpenMediaConnectFlowFailoverRequest();
        return TeaModel.build(map, self);
    }

    public OpenMediaConnectFlowFailoverRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

}
