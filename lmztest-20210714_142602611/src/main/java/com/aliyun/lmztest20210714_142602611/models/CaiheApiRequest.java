// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20210714_142602611.models;

import com.aliyun.tea.*;

public class CaiheApiRequest extends TeaModel {
    @NameInMap("x")
    public Integer x;

    @NameInMap("y")
    public Integer y;

    public static CaiheApiRequest build(java.util.Map<String, ?> map) throws Exception {
        CaiheApiRequest self = new CaiheApiRequest();
        return TeaModel.build(map, self);
    }

    public CaiheApiRequest setX(Integer x) {
        this.x = x;
        return this;
    }
    public Integer getX() {
        return this.x;
    }

    public CaiheApiRequest setY(Integer y) {
        this.y = y;
        return this;
    }
    public Integer getY() {
        return this.y;
    }

}
