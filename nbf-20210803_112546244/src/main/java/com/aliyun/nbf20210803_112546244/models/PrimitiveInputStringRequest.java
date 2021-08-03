// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210803_112546244.models;

import com.aliyun.tea.*;

public class PrimitiveInputStringRequest extends TeaModel {
    @NameInMap("input")
    public String input;

    public static PrimitiveInputStringRequest build(java.util.Map<String, ?> map) throws Exception {
        PrimitiveInputStringRequest self = new PrimitiveInputStringRequest();
        return TeaModel.build(map, self);
    }

    public PrimitiveInputStringRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

}
