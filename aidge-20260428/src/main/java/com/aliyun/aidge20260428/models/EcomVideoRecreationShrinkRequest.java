// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class EcomVideoRecreationShrinkRequest extends TeaModel {
    /**
     * <p>The input parameters for video remix.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public String inputShrink;

    /**
     * <p>The output specifications for the final video.</p>
     */
    @NameInMap("Output")
    public String outputShrink;

    public static EcomVideoRecreationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        EcomVideoRecreationShrinkRequest self = new EcomVideoRecreationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public EcomVideoRecreationShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

    public EcomVideoRecreationShrinkRequest setOutputShrink(String outputShrink) {
        this.outputShrink = outputShrink;
        return this;
    }
    public String getOutputShrink() {
        return this.outputShrink;
    }

}
