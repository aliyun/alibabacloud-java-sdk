// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetDiscoveredResourceRequest extends TeaModel {
    @NameInMap("Region")
    public String region;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceType")
    public String resourceType;

    public static GetDiscoveredResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDiscoveredResourceRequest self = new GetDiscoveredResourceRequest();
        return TeaModel.build(map, self);
    }

    public GetDiscoveredResourceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetDiscoveredResourceRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public GetDiscoveredResourceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
