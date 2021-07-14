// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210713_204422439.models;

import com.aliyun.tea.*;

public class SubstractRequest extends TeaModel {
    @NameInMap("a")
    public Integer a;

    @NameInMap("b")
    public Integer b;

    public static SubstractRequest build(java.util.Map<String, ?> map) throws Exception {
        SubstractRequest self = new SubstractRequest();
        return TeaModel.build(map, self);
    }

    public SubstractRequest setA(Integer a) {
        this.a = a;
        return this;
    }
    public Integer getA() {
        return this.a;
    }

    public SubstractRequest setB(Integer b) {
        this.b = b;
        return this;
    }
    public Integer getB() {
        return this.b;
    }

}
