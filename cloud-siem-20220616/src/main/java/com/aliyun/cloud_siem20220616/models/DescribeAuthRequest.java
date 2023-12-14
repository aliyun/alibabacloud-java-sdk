// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAuthRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuthRequest self = new DescribeAuthRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAuthRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
