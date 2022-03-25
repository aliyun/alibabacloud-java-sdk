// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class BimTransModelStatusShrinkRequest extends TeaModel {
    // 转换图纸集合
    @NameInMap("Ids")
    public String idsShrink;

    public static BimTransModelStatusShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BimTransModelStatusShrinkRequest self = new BimTransModelStatusShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BimTransModelStatusShrinkRequest setIdsShrink(String idsShrink) {
        this.idsShrink = idsShrink;
        return this;
    }
    public String getIdsShrink() {
        return this.idsShrink;
    }

}
