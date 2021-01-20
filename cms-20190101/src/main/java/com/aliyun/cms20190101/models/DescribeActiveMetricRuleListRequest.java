// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeActiveMetricRuleListRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    public static DescribeActiveMetricRuleListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveMetricRuleListRequest self = new DescribeActiveMetricRuleListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeActiveMetricRuleListRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
