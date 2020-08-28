// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribePricingModuleRequest extends TeaModel {
    @NameInMap("ProductCode")
    @Validation(required = true)
    public String productCode;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("SubscriptionType")
    @Validation(required = true)
    public String subscriptionType;

    public static DescribePricingModuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePricingModuleRequest self = new DescribePricingModuleRequest();
        return TeaModel.build(map, self);
    }

}
