// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryInstanceGaapCostRequest extends TeaModel {
    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("BillingCycle")
    @Validation(required = true)
    public String billingCycle;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("SubscriptionType")
    public String subscriptionType;

    public static QueryInstanceGaapCostRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceGaapCostRequest self = new QueryInstanceGaapCostRequest();
        return TeaModel.build(map, self);
    }

}
