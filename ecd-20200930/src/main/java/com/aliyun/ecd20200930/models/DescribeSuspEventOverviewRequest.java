// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSuspEventOverviewRequest extends TeaModel {
    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeSuspEventOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventOverviewRequest self = new DescribeSuspEventOverviewRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventOverviewRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
