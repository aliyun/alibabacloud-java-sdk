// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetDiscoveredResourceCountsGroupByResourceTypeRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     */
    @NameInMap("Region")
    public String region;

    public static GetDiscoveredResourceCountsGroupByResourceTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDiscoveredResourceCountsGroupByResourceTypeRequest self = new GetDiscoveredResourceCountsGroupByResourceTypeRequest();
        return TeaModel.build(map, self);
    }

    public GetDiscoveredResourceCountsGroupByResourceTypeRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
