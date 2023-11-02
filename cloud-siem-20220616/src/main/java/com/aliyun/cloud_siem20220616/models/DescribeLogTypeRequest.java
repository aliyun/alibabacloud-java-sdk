// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeLogTypeRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeLogTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogTypeRequest self = new DescribeLogTypeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLogTypeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
