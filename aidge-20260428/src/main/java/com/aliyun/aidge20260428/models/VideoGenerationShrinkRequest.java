// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class VideoGenerationShrinkRequest extends TeaModel {
    /**
     * <p>The product input.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public String inputShrink;

    /**
     * <p>The intent parameters. Currently unavailable.</p>
     */
    @NameInMap("Intent")
    public String intentShrink;

    /**
     * <p>The output parameters.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Output")
    public String outputShrink;

    public static VideoGenerationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        VideoGenerationShrinkRequest self = new VideoGenerationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public VideoGenerationShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

    public VideoGenerationShrinkRequest setIntentShrink(String intentShrink) {
        this.intentShrink = intentShrink;
        return this;
    }
    public String getIntentShrink() {
        return this.intentShrink;
    }

    public VideoGenerationShrinkRequest setOutputShrink(String outputShrink) {
        this.outputShrink = outputShrink;
        return this;
    }
    public String getOutputShrink() {
        return this.outputShrink;
    }

}
