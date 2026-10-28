// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class CancelSubscriptionBillRequest extends TeaModel {
    /**
     * <p>Subscription type.</p>
     * <ul>
     * <li>PartnerBillingItemDetailForBillingPeriod: Billing item bill details.</li>
     * <li>PartnerBillingItemDetailMonthly: Billing item monthly bill.</li>
     * <li>PartnerInstanceDetailForBillingPeriod: Instance bill details.</li>
     * <li>PartnerInstanceDetailMonthly: Instance monthly bill.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PartnerBillingItemDetailForBillingPeriod</p>
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
