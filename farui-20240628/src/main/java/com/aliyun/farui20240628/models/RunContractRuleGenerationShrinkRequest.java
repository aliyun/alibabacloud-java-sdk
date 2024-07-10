// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.farui20240628.models;

import com.aliyun.tea.*;

public class RunContractRuleGenerationShrinkRequest extends TeaModel {
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

    public static RunContractRuleGenerationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunContractRuleGenerationShrinkRequest self = new RunContractRuleGenerationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunContractRuleGenerationShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RunContractRuleGenerationShrinkRequest setAssistantShrink(String assistantShrink) {
        this.assistantShrink = assistantShrink;
        return this;
    }
    public String getAssistantShrink() {
        return this.assistantShrink;
    }

    public RunContractRuleGenerationShrinkRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

}
