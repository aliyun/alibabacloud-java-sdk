// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeProductAmortizedCostByConsumePeriodRequest extends TeaModel {
    /**
     * <p>The filter conditions for the amortization month.
     * Maximum number of elements: 10.</p>
     */
    @NameInMap("AmortizationPeriodFilter")
    public java.util.List<String> amortizationPeriodFilter;

    /**
     * <p>The filter conditions for the IDs of resource owners.
     * The resource owner is the account that actually uses the resources.
     * Maximum number of elements: 10.</p>
     */
    @NameInMap("BillOwnerIdList")
    public java.util.List<String> billOwnerIdList;

    /**
     * <p>The filter conditions for the IDs of bill purchasers.
     * This is the ID of a RAM user. Set this parameter to view the bills of a RAM user. If you do not set this parameter, the bills of the current account and all its RAM users are returned.
     * Maximum number of elements: 10.</p>
     */
    @NameInMap("BillUserIdList")
    public java.util.List<String> billUserIdList;

    /**
     * <p>The billing cycle.
     * Format: YYYY-MM.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-10</p>
     */
    @NameInMap("BillingCycle")
    public String billingCycle;

    /**
     * <p>The code of the cost center.</p>
     * 
     * <strong>example:</strong>
     * <p>123#</p>
     */
    @NameInMap("CostUnitCode")
    public String costUnitCode;

    /**
     * <p>The maximum number of data records to return in this call. Default value: 20. Maximum value: 300.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that marks the position from which to start the query. If you leave this parameter empty, the query starts from the beginning. If you specify this parameter, set it to the value of <code>NextToken</code> that is returned in the last call.</p>
     * 
     * <strong>example:</strong>
     * <p>CAESEgoQCg4KCmdtdF9jcmVhdGUEARgBIkgKCQBwhGmPcAEAAAo7AzYAAAAxTDgwMDcxMjg3ZDJhNmM3ZDguTDgwMDAwMDAwMDAwMzE1MTIuTDgwMDcyZDMyZTJkYzg3N2U</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The product code. To obtain this value, call the QueryProductList operation to query product information or the DescribeResourcePackageProduct operation to query information about a resource plan.</p>
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

    public static DescribeProductAmortizedCostByConsumePeriodRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductAmortizedCostByConsumePeriodRequest self = new DescribeProductAmortizedCostByConsumePeriodRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProductAmortizedCostByConsumePeriodRequest setAmortizationPeriodFilter(java.util.List<String> amortizationPeriodFilter) {
        this.amortizationPeriodFilter = amortizationPeriodFilter;
        return this;
    }
    public java.util.List<String> getAmortizationPeriodFilter() {
        return this.amortizationPeriodFilter;
    }

    public DescribeProductAmortizedCostByConsumePeriodRequest setBillOwnerIdList(java.util.List<String> billOwnerIdList) {
        this.billOwnerIdList = billOwnerIdList;
        return this;
    }
    public java.util.List<String> getBillOwnerIdList() {
        return this.billOwnerIdList;
    }

    public DescribeProductAmortizedCostByConsumePeriodRequest setBillUserIdList(java.util.List<String> billUserIdList) {
        this.billUserIdList = billUserIdList;
        return this;
    }
    public java.util.List<String> getBillUserIdList() {
        return this.billUserIdList;
    }

    public DescribeProductAmortizedCostByConsumePeriodRequest setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
        return this;
    }
    public String getBillingCycle() {
        return this.billingCycle;
    }

    public DescribeProductAmortizedCostByConsumePeriodRequest setCostUnitCode(String costUnitCode) {
        this.costUnitCode = costUnitCode;
        return this;
    }
    public String getCostUnitCode() {
        return this.costUnitCode;
    }

    public DescribeProductAmortizedCostByConsumePeriodRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeProductAmortizedCostByConsumePeriodRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeProductAmortizedCostByConsumePeriodRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeProductAmortizedCostByConsumePeriodRequest setProductDetail(String productDetail) {
        this.productDetail = productDetail;
        return this;
    }
    public String getProductDetail() {
        return this.productDetail;
    }

    public DescribeProductAmortizedCostByConsumePeriodRequest setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

}
