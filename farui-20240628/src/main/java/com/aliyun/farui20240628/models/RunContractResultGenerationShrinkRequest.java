// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.farui20240628.models;

import com.aliyun.tea.*;

public class RunContractResultGenerationShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>farui</p>
     */
    @NameInMap("appId")
    public String appId;

    @NameInMap("assistant")
    public String assistantShrink;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("stream")
    public Boolean stream;

    public static RunContractResultGenerationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunContractResultGenerationShrinkRequest self = new RunContractResultGenerationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunContractResultGenerationShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RunContractResultGenerationShrinkRequest setAssistantShrink(String assistantShrink) {
        this.assistantShrink = assistantShrink;
        return this;
    }
    public String getAssistantShrink() {
        return this.assistantShrink;
    }

    public RunContractResultGenerationShrinkRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

}
