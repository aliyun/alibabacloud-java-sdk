// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210701_114952485.models;

import com.aliyun.tea.*;

public class TestTwoRequest extends TeaModel {
    @NameInMap("x")
    public Integer x;

    @NameInMap("y")
    public Integer y;

    public static TestTwoRequest build(java.util.Map<String, ?> map) throws Exception {
        TestTwoRequest self = new TestTwoRequest();
        return TeaModel.build(map, self);
    }

    public TestTwoRequest setX(Integer x) {
        this.x = x;
        return this;
    }
    public Integer getX() {
        return this.x;
    }

    public TestTwoRequest setY(Integer y) {
        this.y = y;
        return this;
    }
    public Integer getY() {
        return this.y;
    }

}
