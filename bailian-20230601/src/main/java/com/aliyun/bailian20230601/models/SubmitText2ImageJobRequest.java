// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class SubmitText2ImageJobRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("N")
    public Integer n;

    @NameInMap("NegativePrompt")
    public String negativePrompt;

    @NameInMap("Prompt")
    public String prompt;

    @NameInMap("Seed")
    public Integer seed;

    @NameInMap("Size")
    public String size;

    @NameInMap("Style")
    public String style;

    public static SubmitText2ImageJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitText2ImageJobRequest self = new SubmitText2ImageJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitText2ImageJobRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public SubmitText2ImageJobRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SubmitText2ImageJobRequest setN(Integer n) {
        this.n = n;
        return this;
    }
    public Integer getN() {
        return this.n;
    }

    public SubmitText2ImageJobRequest setNegativePrompt(String negativePrompt) {
        this.negativePrompt = negativePrompt;
        return this;
    }
    public String getNegativePrompt() {
        return this.negativePrompt;
    }

    public SubmitText2ImageJobRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public SubmitText2ImageJobRequest setSeed(Integer seed) {
        this.seed = seed;
        return this;
    }
    public Integer getSeed() {
        return this.seed;
    }

    public SubmitText2ImageJobRequest setSize(String size) {
        this.size = size;
        return this;
    }
    public String getSize() {
        return this.size;
    }

    public SubmitText2ImageJobRequest setStyle(String style) {
        this.style = style;
        return this;
    }
    public String getStyle() {
        return this.style;
    }

}
