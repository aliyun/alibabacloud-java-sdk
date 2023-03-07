// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeProductAmortizedCostByAmortizationPeriodRequest extends TeaModel {
    /**
     * <p>The instance ID that is used to filter bills. You can specify multiple instance IDs to query bills of multiple instances. If you leave this parameter empty, the bills of all instances are queried by default. You can specify a maximum of 10 instance IDs.</p>
     */
    @NameInMap("BillOwnerIdList")
    public java.util.List<String> billOwnerIdList;

    /**
     * <p>The ID of the member that needs to settle the bill. The member ID is used to filter bills. If you specify a value for this parameter, you can query the bills of the specified member. If you leave this parameter empty, the bills of the current account and all members of the current account are queried by default. You can specify a maximum of 10 IDs.</p>
     */
    @NameInMap("BillUserIdList")
    public java.util.List<String> billUserIdList;

    /**
     * <p>The allocation month. Format: YYYY-MM.</p>
     */
    @NameInMap("BillingCycle")
    public String billingCycle;

    /**
     * <p>The billing cycle that is used to filter bills. You can specify a maximum of 10 billing cycles.</p>
     */
    @NameInMap("ConsumePeriodFilter")
    public java.util.List<String> consumePeriodFilter;

    /**
     * <p>The code of the cost center.</p>
     */
    @NameInMap("CostUnitCode")
    public String costUnitCode;

    /**
     * <p>The maximum number of entries to return. Default value: 20. Maximum value: 300.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The position from which the query starts. The parameter must be left empty or set to the value of the NextToken parameter returned from the last call. Otherwise, an error is returned. If this parameter is left empty, data is queried from the beginning.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The code of the service. You can obtain the value of this parameter by calling the QueryProductList operation or the DescribeResourcePackageProduct operation.</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The specific service resource.</p>
     */
    @NameInMap("ProductDetail")
    public String productDetail;

    /**
     * <p>The billing method. Valid values:</p>
     * <br>
     * <p>*   Subscription: the subscription billing method</p>
     * <p>*   PayAsYouGo: the pay-as-you-go billing method</p>
     */
    @NameInMap("SubscriptionType")
    public String subscriptionType;

    public static DescribeProductAmortizedCostByAmortizationPeriodRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductAmortizedCostByAmortizationPeriodRequest self = new DescribeProductAmortizedCostByAmortizationPeriodRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProductAmortizedCostByAmortizationPeriodRequest setBillOwnerIdList(java.util.List<String> billOwnerIdList) {
        this.billOwnerIdList = billOwnerIdList;
        return this;
    }
    public java.util.List<String> getBillOwnerIdList() {
        return this.billOwnerIdList;
    }

    public DescribeProductAmortizedCostByAmortizationPeriodRequest setBillUserIdList(java.util.List<String> billUserIdList) {
        this.billUserIdList = billUserIdList;
        return this;
    }
    public java.util.List<String> getBillUserIdList() {
        return this.billUserIdList;
    }

    public DescribeProductAmortizedCostByAmortizationPeriodRequest setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
        return this;
    }
    public String getBillingCycle() {
        return this.billingCycle;
    }

    public DescribeProductAmortizedCostByAmortizationPeriodRequest setConsumePeriodFilter(java.util.List<String> consumePeriodFilter) {
        this.consumePeriodFilter = consumePeriodFilter;
        return this;
    }
    public java.util.List<String> getConsumePeriodFilter() {
        return this.consumePeriodFilter;
    }

    public DescribeProductAmortizedCostByAmortizationPeriodRequest setCostUnitCode(String costUnitCode) {
        this.costUnitCode = costUnitCode;
        return this;
    }
    public String getCostUnitCode() {
        return this.costUnitCode;
    }

    public DescribeProductAmortizedCostByAmortizationPeriodRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeProductAmortizedCostByAmortizationPeriodRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeProductAmortizedCostByAmortizationPeriodRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeProductAmortizedCostByAmortizationPeriodRequest setProductDetail(String productDetail) {
        this.productDetail = productDetail;
        return this;
    }
    public String getProductDetail() {
        return this.productDetail;
    }

    public DescribeProductAmortizedCostByAmortizationPeriodRequest setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

}
