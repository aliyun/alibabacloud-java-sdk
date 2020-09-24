// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryMonthlyBillRequest extends TeaModel {
    @NameInMap("BillingCycle")
    @Validation(required = true)
    public String billingCycle;

    public static QueryMonthlyBillRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMonthlyBillRequest self = new QueryMonthlyBillRequest();
        return TeaModel.build(map, self);
    }

    public QueryMonthlyBillRequest setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
        return this;
    }
    public String getBillingCycle() {
        return this.billingCycle;
    }

}
