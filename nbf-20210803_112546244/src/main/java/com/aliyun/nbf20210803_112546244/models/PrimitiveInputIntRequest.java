// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210803_112546244.models;

import com.aliyun.tea.*;

public class PrimitiveInputIntRequest extends TeaModel {
    @NameInMap("input")
    public Integer input;

    public static PrimitiveInputIntRequest build(java.util.Map<String, ?> map) throws Exception {
        PrimitiveInputIntRequest self = new PrimitiveInputIntRequest();
        return TeaModel.build(map, self);
    }

    public PrimitiveInputIntRequest setInput(Integer input) {
        this.input = input;
        return this;
    }
    public Integer getInput() {
        return this.input;
    }

}
