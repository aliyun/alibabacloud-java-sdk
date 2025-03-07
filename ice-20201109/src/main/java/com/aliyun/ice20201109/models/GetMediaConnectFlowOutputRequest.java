// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaConnectFlowOutputRequest extends TeaModel {
    /**
     * <p>The flow ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0381f478-7d53-4076-9d5f-27680a6f73e7</p>
     */
    @NameInMap("FlowId")
    public String flowId;

    /**
     * <p>The name of the output that you want to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AliTestOutput</p>
     */
    @NameInMap("OutputName")
    public String outputName;

    public static GetMediaConnectFlowOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMediaConnectFlowOutputRequest self = new GetMediaConnectFlowOutputRequest();
        return TeaModel.build(map, self);
    }

    public GetMediaConnectFlowOutputRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public GetMediaConnectFlowOutputRequest setOutputName(String outputName) {
        this.outputName = outputName;
        return this;
    }
    public String getOutputName() {
        return this.outputName;
    }

}
