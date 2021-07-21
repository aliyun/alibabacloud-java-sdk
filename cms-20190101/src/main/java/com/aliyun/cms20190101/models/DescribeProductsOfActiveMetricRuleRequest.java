// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeProductsOfActiveMetricRuleRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeProductsOfActiveMetricRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductsOfActiveMetricRuleRequest self = new DescribeProductsOfActiveMetricRuleRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProductsOfActiveMetricRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
