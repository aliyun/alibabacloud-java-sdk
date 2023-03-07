// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class UnsubscribeBillToOSSRequest extends TeaModel {
    /**
     * <p>The type of accounts whose bills are to be pushed if multi-tier accounts are involved. Valid values:</p>
     * <br>
     * <p>*   MA: management account.</p>
     * <p>*   ACP1: member account of a virtual network operator (VNO).</p>
     * <br>
     * <p>Default value: MA.</p>
     */
    @NameInMap("MultAccountRelSubscribe")
    public String multAccountRelSubscribe;

    /**
     * <p>The type of the bill to which you want to subscribe. Valid values:</p>
     * <br>
     * <p>*   BillingItemDetailForBillingPeriod: bills of billable items</p>
     * <p>*   InstanceDetailForBillingPeriod: bills of instances</p>
     * <p>*   BillingItemDetailMonthly: billable item-based bills summarized by billing cycle</p>
     * <p>*   InstanceDetailMonthly: instance-based bills summarized by billing cycle</p>
     * <p>*   SplitItemDetailDaily: split bills summarized by day</p>
     * <p>*   MonthBill: monthly bills in the PDF format You can subscribe to the monthly PDF bills only of the master account.</p>
     */
    @NameInMap("SubscribeType")
    public String subscribeType;

    public static UnsubscribeBillToOSSRequest build(java.util.Map<String, ?> map) throws Exception {
        UnsubscribeBillToOSSRequest self = new UnsubscribeBillToOSSRequest();
        return TeaModel.build(map, self);
    }

    public UnsubscribeBillToOSSRequest setMultAccountRelSubscribe(String multAccountRelSubscribe) {
        this.multAccountRelSubscribe = multAccountRelSubscribe;
        return this;
    }
    public String getMultAccountRelSubscribe() {
        return this.multAccountRelSubscribe;
    }

    public UnsubscribeBillToOSSRequest setSubscribeType(String subscribeType) {
        this.subscribeType = subscribeType;
        return this;
    }
    public String getSubscribeType() {
        return this.subscribeType;
    }

}
