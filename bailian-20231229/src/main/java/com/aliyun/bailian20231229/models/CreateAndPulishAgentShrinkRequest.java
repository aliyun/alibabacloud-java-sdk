// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class CreateAndPulishAgentShrinkRequest extends TeaModel {
    @NameInMap("applicationConfig")
    public String applicationConfigShrink;

    @NameInMap("instructions")
    public String instructions;

    @NameInMap("modelId")
    public String modelId;

    @NameInMap("name")
    public String name;

    public static CreateAndPulishAgentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAndPulishAgentShrinkRequest self = new CreateAndPulishAgentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAndPulishAgentShrinkRequest setApplicationConfigShrink(String applicationConfigShrink) {
        this.applicationConfigShrink = applicationConfigShrink;
        return this;
    }
    public String getApplicationConfigShrink() {
        return this.applicationConfigShrink;
    }

    public CreateAndPulishAgentShrinkRequest setInstructions(String instructions) {
        this.instructions = instructions;
        return this;
    }
    public String getInstructions() {
        return this.instructions;
    }

    public CreateAndPulishAgentShrinkRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public CreateAndPulishAgentShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
