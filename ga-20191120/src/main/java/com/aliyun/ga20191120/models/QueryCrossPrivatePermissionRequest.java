// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class QueryCrossPrivatePermissionRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static QueryCrossPrivatePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCrossPrivatePermissionRequest self = new QueryCrossPrivatePermissionRequest();
        return TeaModel.build(map, self);
    }

    public QueryCrossPrivatePermissionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
