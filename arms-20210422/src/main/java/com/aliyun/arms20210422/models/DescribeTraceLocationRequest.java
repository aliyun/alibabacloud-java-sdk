// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class DescribeTraceLocationRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeTraceLocationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTraceLocationRequest self = new DescribeTraceLocationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTraceLocationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
