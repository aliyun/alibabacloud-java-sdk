// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeRegionsRequest extends TeaModel {
    @NameInMap("Region")
    public String region;

    public static DescribeRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsRequest self = new DescribeRegionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
