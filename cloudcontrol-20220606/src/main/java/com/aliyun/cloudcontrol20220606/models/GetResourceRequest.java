// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220606.models;

import com.aliyun.tea.*;

public class GetResourceRequest extends TeaModel {
    @NameInMap("regionId")
    public String regionId;

    @NameInMap("resourceTypeVersion")
    public String resourceTypeVersion;

    public static GetResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceRequest self = new GetResourceRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetResourceRequest setResourceTypeVersion(String resourceTypeVersion) {
        this.resourceTypeVersion = resourceTypeVersion;
        return this;
    }
    public String getResourceTypeVersion() {
        return this.resourceTypeVersion;
    }

}
