// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20210714_142602611.models;

import com.aliyun.tea.*;

public class AssetInfoTestRequest extends TeaModel {
    @NameInMap("x")
    public Integer x;

    @NameInMap("y")
    public Integer y;

    public static AssetInfoTestRequest build(java.util.Map<String, ?> map) throws Exception {
        AssetInfoTestRequest self = new AssetInfoTestRequest();
        return TeaModel.build(map, self);
    }

    public AssetInfoTestRequest setX(Integer x) {
        this.x = x;
        return this;
    }
    public Integer getX() {
        return this.x;
    }

    public AssetInfoTestRequest setY(Integer y) {
        this.y = y;
        return this;
    }
    public Integer getY() {
        return this.y;
    }

}
