// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DisableActiveMetricRuleRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("RegionId")
    public String regionId;

    public static DisableActiveMetricRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableActiveMetricRuleRequest self = new DisableActiveMetricRuleRequest();
        return TeaModel.build(map, self);
    }

    public DisableActiveMetricRuleRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public DisableActiveMetricRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
