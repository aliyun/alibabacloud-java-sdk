// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListClusterTypesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static ListClusterTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterTypesRequest self = new ListClusterTypesRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterTypesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
