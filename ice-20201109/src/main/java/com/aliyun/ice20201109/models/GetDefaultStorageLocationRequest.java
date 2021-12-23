// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetDefaultStorageLocationRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static GetDefaultStorageLocationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDefaultStorageLocationRequest self = new GetDefaultStorageLocationRequest();
        return TeaModel.build(map, self);
    }

    public GetDefaultStorageLocationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
