// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteMediaConnectFlowOutputRequest extends TeaModel {
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
     * <p>The name of the output that you want to delete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AliTestOutput</p>
     */
    @NameInMap("OutputName")
    public String outputName;

    public static DeleteMediaConnectFlowOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaConnectFlowOutputRequest self = new DeleteMediaConnectFlowOutputRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMediaConnectFlowOutputRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public DeleteMediaConnectFlowOutputRequest setOutputName(String outputName) {
        this.outputName = outputName;
        return this;
    }
    public String getOutputName() {
        return this.outputName;
    }

}
