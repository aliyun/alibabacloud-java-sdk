// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetSyntheticTaskMonitorsRequest extends TeaModel {
    /**
     * <p>The ID of the region in which the application is located.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetSyntheticTaskMonitorsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSyntheticTaskMonitorsRequest self = new GetSyntheticTaskMonitorsRequest();
        return TeaModel.build(map, self);
    }

    public GetSyntheticTaskMonitorsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
