// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeStorageRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageRequest self = new DescribeStorageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStorageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
