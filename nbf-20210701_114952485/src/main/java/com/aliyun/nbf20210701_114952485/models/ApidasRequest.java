// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210701_114952485.models;

import com.aliyun.tea.*;

public class ApidasRequest extends TeaModel {
    @NameInMap("x")
    public Integer x;

    @NameInMap("y")
    public Integer y;

    public static ApidasRequest build(java.util.Map<String, ?> map) throws Exception {
        ApidasRequest self = new ApidasRequest();
        return TeaModel.build(map, self);
    }

    public ApidasRequest setX(Integer x) {
        this.x = x;
        return this;
    }
    public Integer getX() {
        return this.x;
    }

    public ApidasRequest setY(Integer y) {
        this.y = y;
        return this;
    }
    public Integer getY() {
        return this.y;
    }

}
