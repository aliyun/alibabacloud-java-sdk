// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryBillRequest extends TeaModel {
    @NameInMap("BillingCycle")
    @Validation(required = true)
    public String billingCycle;

    @NameInMap("Type")
    public String type;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("SubscriptionType")
    public String subscriptionType;

    @NameInMap("IsHideZeroCharge")
    public Boolean isHideZeroCharge;

    @NameInMap("IsDisplayLocalCurrency")
    public Boolean isDisplayLocalCurrency;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryBillRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBillRequest self = new QueryBillRequest();
        return TeaModel.build(map, self);
    }

}
