// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210713_204716107.models;

import com.aliyun.tea.*;

public class AnyOneApiRequest extends TeaModel {
    @NameInMap("x")
    public Integer x;

    @NameInMap("y")
    public Integer y;

    public static AnyOneApiRequest build(java.util.Map<String, ?> map) throws Exception {
        AnyOneApiRequest self = new AnyOneApiRequest();
        return TeaModel.build(map, self);
    }

    public AnyOneApiRequest setX(Integer x) {
        this.x = x;
        return this;
    }
    public Integer getX() {
        return this.x;
    }

    public AnyOneApiRequest setY(Integer y) {
        this.y = y;
        return this;
    }
    public Integer getY() {
        return this.y;
    }

}
