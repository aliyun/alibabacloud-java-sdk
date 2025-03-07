// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateMediaConnectFlowStatusRequest extends TeaModel {
    /**
     * <p>The flow ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>34900dc6-90ec-4968-af3c-fcd87f231a5f</p>
     */
    @NameInMap("FlowId")
    public String flowId;

    /**
     * <p>The flow state. Valid values:</p>
     * <ul>
     * <li>online: starts the flow.</li>
     * <li>offline: stops the flow.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("Status")
    public String status;

    public static UpdateMediaConnectFlowStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaConnectFlowStatusRequest self = new UpdateMediaConnectFlowStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMediaConnectFlowStatusRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public UpdateMediaConnectFlowStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
