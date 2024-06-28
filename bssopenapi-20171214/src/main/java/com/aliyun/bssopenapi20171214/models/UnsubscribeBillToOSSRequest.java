// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class UnsubscribeBillToOSSRequest extends TeaModel {
    /**
     * <p>The type of accounts whose bills are to be pushed if multi-tier accounts are involved. Valid values:</p>
     * <ul>
     * <li>MA: management account.</li>
     * <li>ACP1: member account of a virtual network operator (VNO).</li>
     * </ul>
     * <p>Default value: MA.</p>
     * 
     * <strong>example:</strong>
     * <p>MA</p>
     */
    @NameInMap("MultAccountRelSubscribe")
    public String multAccountRelSubscribe;

    /**
     * <p>The type of the bill to which you want to subscribe. Valid values:</p>
     * <ul>
     * <li>BillingItemDetailForBillingPeriod: bills of billable items</li>
     * <li>InstanceDetailForBillingPeriod: bills of instances</li>
     * <li>BillingItemDetailMonthly: billable item-based bills summarized by billing cycle</li>
     * <li>InstanceDetailMonthly: instance-based bills summarized by billing cycle</li>
     * <li>SplitItemDetailDaily: split bills summarized by day</li>
     * <li>MonthBill: monthly bills in the PDF format You can subscribe to the monthly PDF bills only of the master account.</li>
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
