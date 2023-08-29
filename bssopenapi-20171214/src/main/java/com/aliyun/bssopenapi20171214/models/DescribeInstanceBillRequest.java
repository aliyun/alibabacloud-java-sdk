// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeInstanceBillRequest extends TeaModel {
    /**
     * <p>The ID of the member. If you specify this parameter, the bills of the member are queried. If you do not specify this parameter, the bills of the current account are queried by default.</p>
     */
    @NameInMap("BillOwnerId")
    public Long billOwnerId;

    /**
     * <p>The billing cycle. Specify the parameter in the YYYY-MM format.</p>
     * <p>Only the latest 18 month billing cycle is supported.</p>
     */
    @NameInMap("BillingCycle")
    public String billingCycle;

    /**
     * <p>The billing date. This parameter is required only when the Granularity parameter is set to DAILY. Format: YYYY-MM-DD.</p>
     */
    @NameInMap("BillingDate")
    public String billingDate;

    /**
     * <p>The granularity at which bills are queried. Valid values:</p>
     * <br>
     * <p>*   MONTHLY: queries bills on a monthly basis. The data that you query is the same as the data searched by instances on the Billing Details tab of the Bill Details page in the User Center console.</p>
     * <p>*   DAILY: queries bills on a daily basis. The data that you query is the same as the data searched by days on the Billing Details tab of the Bill Details page in the User Center console.</p>
     * <br>
     * <p>The BillingDate parameter is required if you set the Granularity parameter to DAILY.</p>
     */
    @NameInMap("Granularity")
    public String granularity;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceID")
    public String instanceID;

    /**
     * <p>Specifies whether to query data by billable items. Valid values:</p>
     * <br>
     * <p>*   false: The data that you query is the same as the data searched by instances on the Billing Details tab of the Bill Details page in the User Center console.</p>
     * <p>*   true: The data that you query is the same as the data searched by billable items on the Billing Details tab of the Bill Details page in the User Center console.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("IsBillingItem")
    public Boolean isBillingItem;

    /**
     * <p>Specifies whether to filter bills if both the pretax gross amount and pretax amount are 0. Valid values:</p>
     * <br>
     * <p>*   false: does not filter bills.</p>
     * <p>*   true: filters bills.</p>
     */
    @NameInMap("IsHideZeroCharge")
    public Boolean isHideZeroCharge;

    /**
     * <p>The maximum number of entries to return. Default value: 20. Maximum value: 300.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to indicate the position where the results for the current call start. The parameter must be left empty or set to the value of the NextToken parameter that is returned from the last call. Otherwise, an error is returned. If the parameter is left empty, data is queried from the first item.</p>
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
     * <p>The billing method. Valid values:</p>
     * <br>
     * <p>*   Subscription: the subscription billing method.</p>
     * <p>*   PayAsYouGo: the pay-as-you-go billing method.</p>
     */
    @NameInMap("SubscriptionType")
    public String subscriptionType;

    public static DescribeInstanceBillRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceBillRequest self = new DescribeInstanceBillRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceBillRequest setBillOwnerId(Long billOwnerId) {
        this.billOwnerId = billOwnerId;
        return this;
    }
    public Long getBillOwnerId() {
        return this.billOwnerId;
    }

    public DescribeInstanceBillRequest setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
        return this;
    }
    public String getBillingCycle() {
        return this.billingCycle;
    }

    public DescribeInstanceBillRequest setBillingDate(String billingDate) {
        this.billingDate = billingDate;
        return this;
    }
    public String getBillingDate() {
        return this.billingDate;
    }

    public DescribeInstanceBillRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public DescribeInstanceBillRequest setInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }
    public String getInstanceID() {
        return this.instanceID;
    }

    public DescribeInstanceBillRequest setIsBillingItem(Boolean isBillingItem) {
        this.isBillingItem = isBillingItem;
        return this;
    }
    public Boolean getIsBillingItem() {
        return this.isBillingItem;
    }

    public DescribeInstanceBillRequest setIsHideZeroCharge(Boolean isHideZeroCharge) {
        this.isHideZeroCharge = isHideZeroCharge;
        return this;
    }
    public Boolean getIsHideZeroCharge() {
        return this.isHideZeroCharge;
    }

    public DescribeInstanceBillRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeInstanceBillRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeInstanceBillRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeInstanceBillRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeInstanceBillRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public DescribeInstanceBillRequest setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

}
