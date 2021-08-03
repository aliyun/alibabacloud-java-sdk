// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210803_112546244.models;

import com.aliyun.tea.*;

public class ArrayInputShrinkRequest extends TeaModel {
    @NameInMap("input")
    public String inputShrink;

    public static ArrayInputShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ArrayInputShrinkRequest self = new ArrayInputShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ArrayInputShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

}
