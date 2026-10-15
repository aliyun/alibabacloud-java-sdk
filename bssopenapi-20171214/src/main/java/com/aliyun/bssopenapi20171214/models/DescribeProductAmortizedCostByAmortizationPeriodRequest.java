// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeProductAmortizedCostByAmortizationPeriodRequest extends TeaModel {
    /**
     * <p>The IDs of resource owners. The resource owner is the account that uses the resources.
     * You can specify a maximum of 10 IDs.</p>
     */
    @NameInMap("BillOwnerIdList")
    public java.util.List<String> billOwnerIdList;

    /**
     * <p>The IDs of billable accounts. This parameter is used to filter bills by the RAM user who pays for the resources. If you specify this parameter, you can query the bills of the specified RAM user. If you leave this parameter empty, the bills of the current account and all its RAM users are queried.
     * You can specify a maximum of 10 IDs.</p>
     */
    @NameInMap("BillUserIdList")
    public java.util.List<String> billUserIdList;

    /**
     * <p>The amortization month.
     * Format: YYYY-MM.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-10</p>
     */
    @NameInMap("BillingCycle")
    public String billingCycle;

    /**
     * <p>The filter for billing cycle months.
     * You can specify a maximum of 10 elements.</p>
     */
    @NameInMap("ConsumePeriodFilter")
    public java.util.List<String> consumePeriodFilter;

    /**
     * <p>The code of the cost center.</p>
     * 
     * <strong>example:</strong>
     * <p>123#</p>
     */
    @NameInMap("CostUnitCode")
    public String costUnitCode;

    /**
     * <p>The maximum number of entries to return. Default value: 20. Maximum value: 300.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that marks the position to start the query. If you leave this parameter empty, the query starts from the beginning. Set this parameter to the value of NextToken that is returned in the last response to query the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>CAESEgoQCg4KCmdtdF9jcmVhdGUEARgBIkgKCQBwhGmPcAEAAAo7AzYAAAAxTDgwMDcxMjg3ZDJhNmM3ZDguTDgwMDAwMDAwMDAwMzE1MTIuTDgwMDcyZDMyZTJkYzg3N2U</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The product code.
     * For more information about how to obtain this parameter, see QueryProductList and DescribeResourcePackageProduct.</p>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The details of the product.</p>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("ProductDetail")
    public String productDetail;

    /**
     * <p>The subscription type. Valid values:</p>
     * <ul>
     * <li><p>Subscription: subscription.</p>
     * </li>
     * <li><p>PayAsYouGo: pay-as-you-go.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Subscription</p>
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
