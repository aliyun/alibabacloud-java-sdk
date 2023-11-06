// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetDiscoveredResourceCountsGroupByRegionRequest extends TeaModel {
    /**
     * <p>The resource type.</p>
     * <br>
     * <p>For more information about how to obtain the type of a resource, see [ListDiscoveredResources](~~169620~~).</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static GetDiscoveredResourceCountsGroupByRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDiscoveredResourceCountsGroupByRegionRequest self = new GetDiscoveredResourceCountsGroupByRegionRequest();
        return TeaModel.build(map, self);
    }

    public GetDiscoveredResourceCountsGroupByRegionRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
