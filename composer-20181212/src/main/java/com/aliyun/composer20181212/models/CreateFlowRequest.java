// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class CreateFlowRequest extends TeaModel {
    // The definition of the workflow, which must be a JSON string.
    @NameInMap("Definition")
    public String definition;

    // The description of the workflow.
    @NameInMap("FlowDescription")
    public String flowDescription;

    // The name of the workflow.
    @NameInMap("FlowName")
    public String flowName;

    // The source of the workflow. Valid values:
    // 
    // *   Default: Create the workflow in the console.
    // *   CloudConfig: Create the workflow by using Cloud Config.
    // *   Solution: Create the workflow by using Logic Composer.
    @NameInMap("FlowSource")
    public String flowSource;

    // The ID of the resource group.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    // The ID of the template.
    @NameInMap("TemplateId")
    public String templateId;

    public static CreateFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowRequest self = new CreateFlowRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public CreateFlowRequest setFlowDescription(String flowDescription) {
        this.flowDescription = flowDescription;
        return this;
    }
    public String getFlowDescription() {
        return this.flowDescription;
    }

    public CreateFlowRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public CreateFlowRequest setFlowSource(String flowSource) {
        this.flowSource = flowSource;
        return this;
    }
    public String getFlowSource() {
        return this.flowSource;
    }

    public CreateFlowRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateFlowRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
