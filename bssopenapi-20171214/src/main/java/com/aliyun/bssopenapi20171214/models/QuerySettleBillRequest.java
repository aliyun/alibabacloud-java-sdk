// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySettleBillRequest extends TeaModel {
    /**
     * <p>The ID of the member. If you specify a value for this parameter, you can query the bills of the specified member. If you leave this parameter empty, the bills of the current account are queried by default.</p>
     */
    @NameInMap("BillOwnerId")
    public Long billOwnerId;

    /**
     * <p>The billing cycle, in the YYYY-MM format.</p>
     */
    @NameInMap("BillingCycle")
    public String billingCycle;

    /**
     * <p>Specifies whether to display local currency information in bills.</p>
     */
    @NameInMap("IsDisplayLocalCurrency")
    public Boolean isDisplayLocalCurrency;

    /**
     * <p>Specifies whether to filter out a bill whose pretax gross amount is 0. By default, a bill whose pretax gross amount is 0 is not filtered out.</p>
     * <br>
     * <p>*   true: filters out a bill whose pretax gross amount is 0.</p>
     * <p>*   false: does not filter out a bill whose pretax gross amount is 0.</p>
     */
    @NameInMap("IsHideZeroCharge")
    public Boolean isHideZeroCharge;

    /**
     * <p>The maximum number of entries to return. Default value: 20. Maximum value: 300.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The starting position of the query. If this parameter is left empty, the query starts from the beginning.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The code of the service.</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The type of the service.</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The ID of the bill or order.</p>
     */
    @NameInMap("RecordID")
    public String recordID;

    /**
     * <p>The billing method. Valid values:</p>
     * <br>
     * <p>*   Subscription: the subscription billing method</p>
     * <p>*   PayAsYouGo: the pay-as-you-go billing method</p>
     * <br>
     * <p>**</p>
     * <br>
     * <p>****This parameter must be used together with the ProductCode parameter.</p>
     */
    @NameInMap("SubscriptionType")
    public String subscriptionType;

    /**
     * <p>The type of the bill. Valid values:</p>
     * <br>
     * <p>*   SubscriptionOrder: subscription order</p>
     * <p>*   PayAsYouGoBill: pay-as-you-go bill</p>
     * <p>*   Refund: refund</p>
     * <p>*   Adjustment: reconciliation</p>
     */
    @NameInMap("Type")
    public String type;

    public static QuerySettleBillRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySettleBillRequest self = new QuerySettleBillRequest();
        return TeaModel.build(map, self);
    }

    public QuerySettleBillRequest setBillOwnerId(Long billOwnerId) {
        this.billOwnerId = billOwnerId;
        return this;
    }
    public Long getBillOwnerId() {
        return this.billOwnerId;
    }

    public QuerySettleBillRequest setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
        return this;
    }
    public String getBillingCycle() {
        return this.billingCycle;
    }

    public QuerySettleBillRequest setIsDisplayLocalCurrency(Boolean isDisplayLocalCurrency) {
        this.isDisplayLocalCurrency = isDisplayLocalCurrency;
        return this;
    }
    public Boolean getIsDisplayLocalCurrency() {
        return this.isDisplayLocalCurrency;
    }

    public QuerySettleBillRequest setIsHideZeroCharge(Boolean isHideZeroCharge) {
        this.isHideZeroCharge = isHideZeroCharge;
        return this;
    }
    public Boolean getIsHideZeroCharge() {
        return this.isHideZeroCharge;
    }

    public QuerySettleBillRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public QuerySettleBillRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QuerySettleBillRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QuerySettleBillRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public QuerySettleBillRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public QuerySettleBillRequest setRecordID(String recordID) {
        this.recordID = recordID;
        return this;
    }
    public String getRecordID() {
        return this.recordID;
    }

    public QuerySettleBillRequest setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    public QuerySettleBillRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
