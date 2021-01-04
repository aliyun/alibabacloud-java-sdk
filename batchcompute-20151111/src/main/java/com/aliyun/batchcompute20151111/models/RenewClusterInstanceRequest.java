// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.batchcompute20151111.models;

import com.aliyun.tea.*;

public class RenewClusterInstanceRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static RenewClusterInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewClusterInstanceRequest self = new RenewClusterInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RenewClusterInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
