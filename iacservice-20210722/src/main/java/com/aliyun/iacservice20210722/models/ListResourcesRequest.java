// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210722.models;

import com.aliyun.tea.*;

public class ListResourcesRequest extends TeaModel {
    @NameInMap("regionIds")
    public java.util.List<String> regionIds;

    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    public static ListResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesRequest self = new ListResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListResourcesRequest setRegionIds(java.util.List<String> regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public java.util.List<String> getRegionIds() {
        return this.regionIds;
    }

    public ListResourcesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
