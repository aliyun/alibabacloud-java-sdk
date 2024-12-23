// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class UpdateAndPublishAgentShrinkRequest extends TeaModel {
    @NameInMap("applicationConfig")
    public String applicationConfigShrink;

    @NameInMap("instructions")
    public String instructions;

    @NameInMap("modelId")
    public String modelId;

    @NameInMap("name")
    public String name;

    @NameInMap("sampleLibrary")
    public String sampleLibraryShrink;

    public static UpdateAndPublishAgentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAndPublishAgentShrinkRequest self = new UpdateAndPublishAgentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAndPublishAgentShrinkRequest setApplicationConfigShrink(String applicationConfigShrink) {
        this.applicationConfigShrink = applicationConfigShrink;
        return this;
    }
    public String getApplicationConfigShrink() {
        return this.applicationConfigShrink;
    }

    public UpdateAndPublishAgentShrinkRequest setInstructions(String instructions) {
        this.instructions = instructions;
        return this;
    }
    public String getInstructions() {
        return this.instructions;
    }

    public UpdateAndPublishAgentShrinkRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public UpdateAndPublishAgentShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAndPublishAgentShrinkRequest setSampleLibraryShrink(String sampleLibraryShrink) {
        this.sampleLibraryShrink = sampleLibraryShrink;
        return this;
    }
    public String getSampleLibraryShrink() {
        return this.sampleLibraryShrink;
    }

}
