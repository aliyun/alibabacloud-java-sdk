// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class GetStorageRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static GetStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStorageRequest self = new GetStorageRequest();
        return TeaModel.build(map, self);
    }

    public GetStorageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
