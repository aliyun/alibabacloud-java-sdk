// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class EnableActiveMetricRuleRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    public static EnableActiveMetricRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableActiveMetricRuleRequest self = new EnableActiveMetricRuleRequest();
        return TeaModel.build(map, self);
    }

    public EnableActiveMetricRuleRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
