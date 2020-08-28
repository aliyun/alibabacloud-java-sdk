// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryInstanceBillRequest extends TeaModel {
    @NameInMap("BillingCycle")
    @Validation(required = true)
    public String billingCycle;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("SubscriptionType")
    public String subscriptionType;

    @NameInMap("IsBillingItem")
    public Boolean isBillingItem;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("IsHideZeroCharge")
    public Boolean isHideZeroCharge;

    @NameInMap("BillingDate")
    public String billingDate;

    @NameInMap("Granularity")
    public String granularity;

    public static QueryInstanceBillRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceBillRequest self = new QueryInstanceBillRequest();
        return TeaModel.build(map, self);
    }

}
