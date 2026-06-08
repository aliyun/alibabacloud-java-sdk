// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateAgentShrinkRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Metadata")
    public String metadataShrink;

    /**
     * <strong>example:</strong>
     * <p>my-agent</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Prompt")
    public String prompt;

    public static CreateAgentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentShrinkRequest self = new CreateAgentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAgentShrinkRequest setMetadataShrink(String metadataShrink) {
        this.metadataShrink = metadataShrink;
        return this;
    }
    public String getMetadataShrink() {
        return this.metadataShrink;
    }

    public CreateAgentShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAgentShrinkRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

}
