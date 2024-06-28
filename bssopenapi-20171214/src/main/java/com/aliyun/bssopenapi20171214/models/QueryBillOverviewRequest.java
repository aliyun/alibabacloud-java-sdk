// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryBillOverviewRequest extends TeaModel {
    /**
     * <p>The ID of the member. If you specify a value for this parameter, you can query the bills of the specified member. If you leave this parameter empty, the bills of the current account are queried by default.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("BillOwnerId")
    public Long billOwnerId;

    /**
     * <p>The billing cycle, in the YYYY-MM format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-07</p>
     */
    @NameInMap("BillingCycle")
    public String billingCycle;

    /**
     * <p>The code of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The type of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li>Subscription: the subscription billing method</li>
     * <li>PayAsYouGo: the pay-as-you-go billing method</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Subscription</p>
     */
    @NameInMap("SubscriptionType")
    public String subscriptionType;

    public static QueryBillOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBillOverviewRequest self = new QueryBillOverviewRequest();
        return TeaModel.build(map, self);
    }

    public QueryBillOverviewRequest setBillOwnerId(Long billOwnerId) {
        this.billOwnerId = billOwnerId;
        return this;
    }
    public Long getBillOwnerId() {
        return this.billOwnerId;
    }

    public QueryBillOverviewRequest setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
        return this;
    }
    public String getBillingCycle() {
        return this.billingCycle;
    }

    public QueryBillOverviewRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public QueryBillOverviewRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public QueryBillOverviewRequest setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

}
