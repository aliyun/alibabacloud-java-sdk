// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210722.models;

import com.aliyun.tea.*;

public class ListResourcesShrinkRequest extends TeaModel {
    @NameInMap("regionIds")
    public String regionIdsShrink;

    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    public static ListResourcesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesShrinkRequest self = new ListResourcesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListResourcesShrinkRequest setRegionIdsShrink(String regionIdsShrink) {
        this.regionIdsShrink = regionIdsShrink;
        return this;
    }
    public String getRegionIdsShrink() {
        return this.regionIdsShrink;
    }

    public ListResourcesShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
