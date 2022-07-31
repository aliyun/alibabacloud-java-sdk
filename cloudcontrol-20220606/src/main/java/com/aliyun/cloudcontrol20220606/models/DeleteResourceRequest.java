// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220606.models;

import com.aliyun.tea.*;

public class DeleteResourceRequest extends TeaModel {
    @NameInMap("regionId")
    public String regionId;

    @NameInMap("resourceTypeVersion")
    public String resourceTypeVersion;

    public static DeleteResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceRequest self = new DeleteResourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteResourceRequest setResourceTypeVersion(String resourceTypeVersion) {
        this.resourceTypeVersion = resourceTypeVersion;
        return this;
    }
    public String getResourceTypeVersion() {
        return this.resourceTypeVersion;
    }

}
