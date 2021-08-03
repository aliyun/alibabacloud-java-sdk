// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210803_112546244.models;

import com.aliyun.tea.*;

public class ArrayInputRequest extends TeaModel {
    @NameInMap("input")
    public java.util.List<String> input;

    public static ArrayInputRequest build(java.util.Map<String, ?> map) throws Exception {
        ArrayInputRequest self = new ArrayInputRequest();
        return TeaModel.build(map, self);
    }

    public ArrayInputRequest setInput(java.util.List<String> input) {
        this.input = input;
        return this;
    }
    public java.util.List<String> getInput() {
        return this.input;
    }

}
