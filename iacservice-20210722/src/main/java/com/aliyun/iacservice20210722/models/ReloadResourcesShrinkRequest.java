// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210722.models;

import com.aliyun.tea.*;

public class ReloadResourcesShrinkRequest extends TeaModel {
    @NameInMap("regionIds")
    public String regionIdsShrink;

    public static ReloadResourcesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ReloadResourcesShrinkRequest self = new ReloadResourcesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ReloadResourcesShrinkRequest setRegionIdsShrink(String regionIdsShrink) {
        this.regionIdsShrink = regionIdsShrink;
        return this;
    }
    public String getRegionIdsShrink() {
        return this.regionIdsShrink;
    }

}
