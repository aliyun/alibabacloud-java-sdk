// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAggregateFunctionRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeAggregateFunctionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAggregateFunctionRequest self = new DescribeAggregateFunctionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAggregateFunctionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
