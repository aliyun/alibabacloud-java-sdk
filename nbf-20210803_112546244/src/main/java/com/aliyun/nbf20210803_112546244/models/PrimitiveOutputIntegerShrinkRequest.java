// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210803_112546244.models;

import com.aliyun.tea.*;

public class PrimitiveOutputIntegerShrinkRequest extends TeaModel {
    @NameInMap("input")
    public String inputShrink;

    public static PrimitiveOutputIntegerShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PrimitiveOutputIntegerShrinkRequest self = new PrimitiveOutputIntegerShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PrimitiveOutputIntegerShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

}
