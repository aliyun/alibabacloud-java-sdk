// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class CreateTextEmbeddingsShrinkRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("Input")
    public String inputShrink;

    @NameInMap("TextType")
    public String textType;

    public static CreateTextEmbeddingsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTextEmbeddingsShrinkRequest self = new CreateTextEmbeddingsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateTextEmbeddingsShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateTextEmbeddingsShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

    public CreateTextEmbeddingsShrinkRequest setTextType(String textType) {
        this.textType = textType;
        return this;
    }
    public String getTextType() {
        return this.textType;
    }

}
