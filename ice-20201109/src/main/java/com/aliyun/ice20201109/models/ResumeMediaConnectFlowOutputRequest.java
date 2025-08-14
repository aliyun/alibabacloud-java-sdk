// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ResumeMediaConnectFlowOutputRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>34900dc6-90ec-4968-af3c-fcd87f231a5f</p>
     */
    @NameInMap("FlowId")
    public String flowId;

    /**
     * <strong>example:</strong>
     * <p>AliTestOutput</p>
     */
    @NameInMap("OutputName")
    public String outputName;

    public static ResumeMediaConnectFlowOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeMediaConnectFlowOutputRequest self = new ResumeMediaConnectFlowOutputRequest();
        return TeaModel.build(map, self);
    }

    public ResumeMediaConnectFlowOutputRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public ResumeMediaConnectFlowOutputRequest setOutputName(String outputName) {
        this.outputName = outputName;
        return this;
    }
    public String getOutputName() {
        return this.outputName;
    }

}
