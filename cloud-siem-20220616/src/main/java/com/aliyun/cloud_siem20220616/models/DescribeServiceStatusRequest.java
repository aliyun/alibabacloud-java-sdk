// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeServiceStatusRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeServiceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceStatusRequest self = new DescribeServiceStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServiceStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
