// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryBillOverviewRequest extends TeaModel {
    @NameInMap("BillingCycle")
    @Validation(required = true)
    public String billingCycle;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("SubscriptionType")
    public String subscriptionType;

    public static QueryBillOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBillOverviewRequest self = new QueryBillOverviewRequest();
        return TeaModel.build(map, self);
    }

}
