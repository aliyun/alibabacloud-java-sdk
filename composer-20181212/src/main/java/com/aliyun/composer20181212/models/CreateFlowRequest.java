// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class CreateFlowRequest extends TeaModel {
    @NameInMap("FlowName")
    public String flowName;

    @NameInMap("FlowDescription")
    public String flowDescription;

    @NameInMap("Definition")
    public String definition;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("FlowSource")
    public String flowSource;

    public static CreateFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowRequest self = new CreateFlowRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public CreateFlowRequest setFlowDescription(String flowDescription) {
        this.flowDescription = flowDescription;
        return this;
    }
    public String getFlowDescription() {
        return this.flowDescription;
    }

    public CreateFlowRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public CreateFlowRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateFlowRequest setFlowSource(String flowSource) {
        this.flowSource = flowSource;
        return this;
    }
    public String getFlowSource() {
        return this.flowSource;
    }

}
