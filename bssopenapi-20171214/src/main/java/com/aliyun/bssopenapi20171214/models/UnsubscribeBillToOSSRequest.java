// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class UnsubscribeBillToOSSRequest extends TeaModel {
    /**
     * <p>For multi-level accounts, specifies the type of bill to push. Valid values:</p>
     * <ul>
     * <li>MA: Pushes the bill of the main account.</li>
     * <li>ACP1: Pushes the bill of the Partner Platform V2.0 sub-account.</li>
     * </ul>
     * <p>Default value: MA.</p>
     * 
     * <strong>example:</strong>
     * <p>MA</p>
     */
    @NameInMap("MultAccountRelSubscribe")
    public String multAccountRelSubscribe;

    /**
     * <p>The subscription type. Valid values:</p>
     * <ul>
     * <li>BillingItemDetailForBillingPeriod: billable item-level consumption details.</li>
     * <li>InstanceDetailForBillingPeriod: instance-level consumption details.</li>
     * <li>BillingItemDetailMonthly: billable item-level consumption summary by billing cycle.</li>
     * <li>InstanceDetailMonthly: instance-level consumption summary by billing cycle.</li>
     * <li>SplitItemDetailDaily: split bill summarized by day.</li>
     * <li>MonthBill: monthly bill in PDF format. Only MA subscriptions are supported.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BillingItemDetailForBillingPeriod</p>
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
