// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeLogStoreRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeLogStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogStoreRequest self = new DescribeLogStoreRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLogStoreRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
