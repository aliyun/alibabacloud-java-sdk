// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210713_204422439.models;

import com.aliyun.tea.*;

public class AddRequest extends TeaModel {
    @NameInMap("a")
    public Integer a;

    @NameInMap("b")
    public Integer b;

    public static AddRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRequest self = new AddRequest();
        return TeaModel.build(map, self);
    }

    public AddRequest setA(Integer a) {
        this.a = a;
        return this;
    }
    public Integer getA() {
        return this.a;
    }

    public AddRequest setB(Integer b) {
        this.b = b;
        return this;
    }
    public Integer getB() {
        return this.b;
    }

}
