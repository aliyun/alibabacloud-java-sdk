// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class InvokeFlowRequest extends TeaModel {
    // The token that is used to guarantee idempotence to avoid repeated operations.
    @NameInMap("ClientToken")
    public String clientToken;

    // The data for invoking the workflow.
    @NameInMap("Data")
    public String data;

    // The parameters required by the template, which must be in JSON format.
    @NameInMap("FlowId")
    public String flowId;

    // The input parameters required by the trigger of the workflow execution, which must be in JSON format.
    @NameInMap("Parameters")
    public String parameters;

    public static InvokeFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeFlowRequest self = new InvokeFlowRequest();
        return TeaModel.build(map, self);
    }

    public InvokeFlowRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public InvokeFlowRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public InvokeFlowRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public InvokeFlowRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

}
