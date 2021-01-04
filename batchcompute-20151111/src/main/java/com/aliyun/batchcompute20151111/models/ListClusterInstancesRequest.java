// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.batchcompute20151111.models;

import com.aliyun.tea.*;

public class ListClusterInstancesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static ListClusterInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterInstancesRequest self = new ListClusterInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
