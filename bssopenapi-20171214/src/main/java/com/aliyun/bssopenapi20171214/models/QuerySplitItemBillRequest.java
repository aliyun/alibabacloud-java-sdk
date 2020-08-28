// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySplitItemBillRequest extends TeaModel {
    @NameInMap("BillingCycle")
    @Validation(required = true)
    public String billingCycle;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("SubscriptionType")
    public String subscriptionType;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QuerySplitItemBillRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySplitItemBillRequest self = new QuerySplitItemBillRequest();
        return TeaModel.build(map, self);
    }

}
