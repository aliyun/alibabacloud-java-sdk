// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.batchcompute20151111.models;

import com.aliyun.tea.*;

public class GetClusterInstanceRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static GetClusterInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterInstanceRequest self = new GetClusterInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
