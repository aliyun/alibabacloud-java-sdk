// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210715_103740905.models;

import com.aliyun.tea.*;

public class YxTestSingleApiRequest extends TeaModel {
    @NameInMap("x")
    public Integer x;

    @NameInMap("y")
    public Integer y;

    public static YxTestSingleApiRequest build(java.util.Map<String, ?> map) throws Exception {
        YxTestSingleApiRequest self = new YxTestSingleApiRequest();
        return TeaModel.build(map, self);
    }

    public YxTestSingleApiRequest setX(Integer x) {
        this.x = x;
        return this;
    }
    public Integer getX() {
        return this.x;
    }

    public YxTestSingleApiRequest setY(Integer y) {
        this.y = y;
        return this;
    }
    public Integer getY() {
        return this.y;
    }

}
