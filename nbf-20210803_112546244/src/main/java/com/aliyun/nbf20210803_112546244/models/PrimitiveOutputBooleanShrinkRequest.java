// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210803_112546244.models;

import com.aliyun.tea.*;

public class PrimitiveOutputBooleanShrinkRequest extends TeaModel {
    @NameInMap("input")
    public String inputShrink;

    public static PrimitiveOutputBooleanShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PrimitiveOutputBooleanShrinkRequest self = new PrimitiveOutputBooleanShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PrimitiveOutputBooleanShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

}
