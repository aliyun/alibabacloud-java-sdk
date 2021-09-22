// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210722.models;

import com.aliyun.tea.*;

public class ReloadResourcesRequest extends TeaModel {
    @NameInMap("regionIds")
    public java.util.List<String> regionIds;

    public static ReloadResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ReloadResourcesRequest self = new ReloadResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ReloadResourcesRequest setRegionIds(java.util.List<String> regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public java.util.List<String> getRegionIds() {
        return this.regionIds;
    }

}
