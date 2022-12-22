// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class UpdateFlowRequest extends TeaModel {
    // The new definition that you want to specify for the workflow.
    @NameInMap("Definition")
    public String definition;

    // The new description that you want to specify for the workflow.
    @NameInMap("FlowDescription")
    public String flowDescription;

    // The ID of the workflow whose information you want to update.
    @NameInMap("FlowId")
    public String flowId;

    // The new name that you want to specify for the workflow.
    @NameInMap("FlowName")
    public String flowName;

    public static UpdateFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowRequest self = new UpdateFlowRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFlowRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public UpdateFlowRequest setFlowDescription(String flowDescription) {
        this.flowDescription = flowDescription;
        return this;
    }
    public String getFlowDescription() {
        return this.flowDescription;
    }

    public UpdateFlowRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public UpdateFlowRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

}
