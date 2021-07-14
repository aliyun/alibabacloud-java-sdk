// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210713_204422439.models;

import com.aliyun.tea.*;

public class YxTestSingleHsfApiRequest extends TeaModel {
    @NameInMap("x")
    public Integer x;

    @NameInMap("y")
    public Integer y;

    public static YxTestSingleHsfApiRequest build(java.util.Map<String, ?> map) throws Exception {
        YxTestSingleHsfApiRequest self = new YxTestSingleHsfApiRequest();
        return TeaModel.build(map, self);
    }

    public YxTestSingleHsfApiRequest setX(Integer x) {
        this.x = x;
        return this;
    }
    public Integer getX() {
        return this.x;
    }

    public YxTestSingleHsfApiRequest setY(Integer y) {
        this.y = y;
        return this;
    }
    public Integer getY() {
        return this.y;
    }

}
