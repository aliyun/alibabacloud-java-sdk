// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class CancelSubscriptionBillRequest extends TeaModel {
    /**
     * <p>The type of the bill to which you want to cancel the subscription. Valid values: PartnerBillingItemDetailForBillingPeriod, PartnerBillingItemDetailMonthly, PartnerInstanceDetailForBillingPeriod, and PartnerInstanceDetailMonthly.</p>
     */
    @NameInMap("SubscribeType")
    public String subscribeType;

    public static CancelSubscriptionBillRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelSubscriptionBillRequest self = new CancelSubscriptionBillRequest();
        return TeaModel.build(map, self);
    }

    public CancelSubscriptionBillRequest setSubscribeType(String subscribeType) {
        this.subscribeType = subscribeType;
        return this;
    }
    public String getSubscribeType() {
        return this.subscribeType;
    }

}
