// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class UpdateAndPublishAgentSelectiveShrinkRequest extends TeaModel {
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

    public static UpdateAndPublishAgentSelectiveShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAndPublishAgentSelectiveShrinkRequest self = new UpdateAndPublishAgentSelectiveShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAndPublishAgentSelectiveShrinkRequest setApplicationConfigShrink(String applicationConfigShrink) {
        this.applicationConfigShrink = applicationConfigShrink;
        return this;
    }
    public String getApplicationConfigShrink() {
        return this.applicationConfigShrink;
    }

    public UpdateAndPublishAgentSelectiveShrinkRequest setInstructions(String instructions) {
        this.instructions = instructions;
        return this;
    }
    public String getInstructions() {
        return this.instructions;
    }

    public UpdateAndPublishAgentSelectiveShrinkRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public UpdateAndPublishAgentSelectiveShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAndPublishAgentSelectiveShrinkRequest setSampleLibraryShrink(String sampleLibraryShrink) {
        this.sampleLibraryShrink = sampleLibraryShrink;
        return this;
    }
    public String getSampleLibraryShrink() {
        return this.sampleLibraryShrink;
    }

}
