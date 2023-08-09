// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetSyntheticMonitorsShrinkRequest extends TeaModel {
    @NameInMap("Filter")
    public String filterShrink;

    @NameInMap("RegionId")
    public String regionId;

    public static GetSyntheticMonitorsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSyntheticMonitorsShrinkRequest self = new GetSyntheticMonitorsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetSyntheticMonitorsShrinkRequest setFilterShrink(String filterShrink) {
        this.filterShrink = filterShrink;
        return this;
    }
    public String getFilterShrink() {
        return this.filterShrink;
    }

    public GetSyntheticMonitorsShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
