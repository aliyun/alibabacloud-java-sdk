// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ForbidMediaConnectFlowOutputRequest extends TeaModel {
    /**
     * <p>The ID of the MediaConnect flow.</p>
     * 
     * <strong>example:</strong>
     * <p>34900dc6-90ec-4968-af3c-fcd87f231a5f</p>
     */
    @NameInMap("FlowId")
    public String flowId;

    /**
     * <p>The name of the output.</p>
     * 
     * <strong>example:</strong>
     * <p>AliTestOutput</p>
     */
    @NameInMap("OutputName")
    public String outputName;

    public static ForbidMediaConnectFlowOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        ForbidMediaConnectFlowOutputRequest self = new ForbidMediaConnectFlowOutputRequest();
        return TeaModel.build(map, self);
    }

    public ForbidMediaConnectFlowOutputRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public ForbidMediaConnectFlowOutputRequest setOutputName(String outputName) {
        this.outputName = outputName;
        return this;
    }
    public String getOutputName() {
        return this.outputName;
    }

}
