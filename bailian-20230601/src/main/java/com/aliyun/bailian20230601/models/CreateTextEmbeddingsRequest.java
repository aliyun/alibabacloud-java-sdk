// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class CreateTextEmbeddingsRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("Input")
    public java.util.List<String> input;

    @NameInMap("TextType")
    public String textType;

    public static CreateTextEmbeddingsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTextEmbeddingsRequest self = new CreateTextEmbeddingsRequest();
        return TeaModel.build(map, self);
    }

    public CreateTextEmbeddingsRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateTextEmbeddingsRequest setInput(java.util.List<String> input) {
        this.input = input;
        return this;
    }
    public java.util.List<String> getInput() {
        return this.input;
    }

    public CreateTextEmbeddingsRequest setTextType(String textType) {
        this.textType = textType;
        return this;
    }
    public String getTextType() {
        return this.textType;
    }

}
