// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210715_103740905.models;

import com.aliyun.tea.*;

public class YxTestDynamicSpiRequest extends TeaModel {
    @NameInMap("method")
    public String method;

    @NameInMap("x")
    public Integer x;

    @NameInMap("y")
    public Integer y;

    public static YxTestDynamicSpiRequest build(java.util.Map<String, ?> map) throws Exception {
        YxTestDynamicSpiRequest self = new YxTestDynamicSpiRequest();
        return TeaModel.build(map, self);
    }

    public YxTestDynamicSpiRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public YxTestDynamicSpiRequest setX(Integer x) {
        this.x = x;
        return this;
    }
    public Integer getX() {
        return this.x;
    }

    public YxTestDynamicSpiRequest setY(Integer y) {
        this.y = y;
        return this;
    }
    public Integer getY() {
        return this.y;
    }

}
