// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class PostISConvRewriterShrinkRequest extends TeaModel {
    @NameInMap("Algorithm")
    public String algorithm;

    @NameInMap("Debug")
    public Boolean debug;

    @NameInMap("Input")
    public String inputShrink;

    @NameInMap("Model")
    public String model;

    @NameInMap("Parameters")
    public String parametersShrink;

    public static PostISConvRewriterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PostISConvRewriterShrinkRequest self = new PostISConvRewriterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PostISConvRewriterShrinkRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public PostISConvRewriterShrinkRequest setDebug(Boolean debug) {
        this.debug = debug;
        return this;
    }
    public Boolean getDebug() {
        return this.debug;
    }

    public PostISConvRewriterShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

    public PostISConvRewriterShrinkRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public PostISConvRewriterShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

}
