// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.batchcompute20151111.models;

import com.aliyun.tea.*;

public class RecreateClusterInstanceRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static RecreateClusterInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecreateClusterInstanceRequest self = new RecreateClusterInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RecreateClusterInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
