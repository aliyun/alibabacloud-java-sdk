// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20210714_142602611.models;

import com.aliyun.tea.*;

public class OpenApiBRequest extends TeaModel {
    @NameInMap("x")
    public Integer x;

    @NameInMap("y")
    public Integer y;

    public static OpenApiBRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenApiBRequest self = new OpenApiBRequest();
        return TeaModel.build(map, self);
    }

    public OpenApiBRequest setX(Integer x) {
        this.x = x;
        return this;
    }
    public Integer getX() {
        return this.x;
    }

    public OpenApiBRequest setY(Integer y) {
        this.y = y;
        return this;
    }
    public Integer getY() {
        return this.y;
    }

}
