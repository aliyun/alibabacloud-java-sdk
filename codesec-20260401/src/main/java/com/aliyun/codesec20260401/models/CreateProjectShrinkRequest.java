// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401.models;

import com.aliyun.tea.*;

public class CreateProjectShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>This is default function description by fc-deploy component</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("engines")
    public String enginesShrink;

    /**
     * <strong>example:</strong>
     * <p>such as ignoring low-severity vulnerabilities, etc.</p>
     */
    @NameInMap("instructionPrompt")
    public String instructionPrompt;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_paswd_103</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("source")
    public String sourceShrink;

    public static CreateProjectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectShrinkRequest self = new CreateProjectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProjectShrinkRequest setEnginesShrink(String enginesShrink) {
        this.enginesShrink = enginesShrink;
        return this;
    }
    public String getEnginesShrink() {
        return this.enginesShrink;
    }

    public CreateProjectShrinkRequest setInstructionPrompt(String instructionPrompt) {
        this.instructionPrompt = instructionPrompt;
        return this;
    }
    public String getInstructionPrompt() {
        return this.instructionPrompt;
    }

    public CreateProjectShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateProjectShrinkRequest setSourceShrink(String sourceShrink) {
        this.sourceShrink = sourceShrink;
        return this;
    }
    public String getSourceShrink() {
        return this.sourceShrink;
    }

}
