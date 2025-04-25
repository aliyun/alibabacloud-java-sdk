// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteMediaConnectFlowInputRequest extends TeaModel {
    /**
     * <p>The flow ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0381f478-7d53-4076-9d5f-27680a6f73e7</p>
     */
    @NameInMap("FlowId")
    public String flowId;

    @NameInMap("InputName")
    public String inputName;

    public static DeleteMediaConnectFlowInputRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaConnectFlowInputRequest self = new DeleteMediaConnectFlowInputRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMediaConnectFlowInputRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public DeleteMediaConnectFlowInputRequest setInputName(String inputName) {
        this.inputName = inputName;
        return this;
    }
    public String getInputName() {
        return this.inputName;
    }

}
