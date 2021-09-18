// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20210714_142602611.models;

import com.aliyun.tea.*;

public class AssetInfoTestResponseBody extends TeaModel {
    @NameInMap("sum")
    public Integer sum;

    public static AssetInfoTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssetInfoTestResponseBody self = new AssetInfoTestResponseBody();
        return TeaModel.build(map, self);
    }

    public AssetInfoTestResponseBody setSum(Integer sum) {
        this.sum = sum;
        return this;
    }
    public Integer getSum() {
        return this.sum;
    }

}
