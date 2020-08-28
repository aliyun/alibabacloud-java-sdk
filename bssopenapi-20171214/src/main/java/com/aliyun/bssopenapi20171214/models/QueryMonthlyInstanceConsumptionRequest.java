// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryMonthlyInstanceConsumptionRequest extends TeaModel {
    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("BillingCycle")
    @Validation(required = true)
    public String billingCycle;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("SubscriptionType")
    public String subscriptionType;

    public static QueryMonthlyInstanceConsumptionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMonthlyInstanceConsumptionRequest self = new QueryMonthlyInstanceConsumptionRequest();
        return TeaModel.build(map, self);
    }

}
