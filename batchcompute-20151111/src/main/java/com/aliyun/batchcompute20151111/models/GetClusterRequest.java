// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.batchcompute20151111.models;

import com.aliyun.tea.*;

public class GetClusterRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static GetClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterRequest self = new GetClusterRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
