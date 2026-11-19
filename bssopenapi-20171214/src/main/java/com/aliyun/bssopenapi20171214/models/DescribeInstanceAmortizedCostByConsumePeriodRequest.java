// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeInstanceAmortizedCostByConsumePeriodRequest extends TeaModel {
    /**
     * <p>The filter for the amortization month. Maximum number of elements: 10.</p>
     */
    @NameInMap("AmortizationPeriodFilter")
    public java.util.List<String> amortizationPeriodFilter;

    /**
     * <p>The filter for the resource ownership account. The resource ownership account ID. The resource ownership account is the account that actually uses the resources. Maximum number of elements: 10.</p>
     */
    @NameInMap("BillOwnerIdList")
    public java.util.List<String> billOwnerIdList;

    /**
     * <p>The filter for the bill purchaser ID, which is the RAM user ID. Specify this parameter to view the bills of RAM users. If you leave this parameter empty, the bills of the current account and all its RAM users are queried by default. Maximum number of elements: 10.</p>
     */
    @NameInMap("BillUserIdList")
    public java.util.List<String> billUserIdList;

    /**
     * <p>The billing cycle. Format: YYYY-MM.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-10</p>
     */
    @NameInMap("BillingCycle")
    public String billingCycle;

    /**
     * <p>The code of the cost unit.</p>
     * 
     * <strong>example:</strong>
     * <p>123#</p>
     */
    @NameInMap("CostUnitCode")
    public String costUnitCode;

    /**
     * <p>The filter for the instance ID. You can query multiple instances. If you do not specify this parameter, all instances are queried by default. Maximum number of elements: 10.</p>
     */
    @NameInMap("InstanceIdList")
    public java.util.List<String> instanceIdList;

    /**
     * <p>The maximum number of data records to read in the current call. Default value: 20. Maximum value: 300.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that specifies the position where the current call starts to read. The value must be empty or set to the NextToken value returned in the previous response. Otherwise, an error occurs. An empty value indicates that the read starts from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>CAESEgoQCg4KCmdtdF9jcmVhdGUEARgBIkgKCQBwhGmPcAEAAAo7AzYAAAAxTDgwMDcxMjg3ZDJhNmM3ZDguTDgwMDAwMDAwMDAwMzE1MTIuTDgwMDcyZDMyZTJkYzg3N2U</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The product code. You can obtain the value from the following operations:</p>
     * <ul>
     * <li>QueryProductList: queries product information.</li>
     * <li>DescribeResourcePackageProduct: queries information about a specific resource plan product.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The product detail.</p>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("ProductDetail")
    public String productDetail;

    /**
     * <p>The subscription type. Valid values:</p>
     * <ul>
     * <li>Subscription: subscription.</li>
     * <li>PayAsYouGo: pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Subscription</p>
     */
    @NameInMap("SubscriptionType")
    public String subscriptionType;

    public static DescribeInstanceAmortizedCostByConsumePeriodRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAmortizedCostByConsumePeriodRequest self = new DescribeInstanceAmortizedCostByConsumePeriodRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAmortizedCostByConsumePeriodRequest setAmortizationPeriodFilter(java.util.List<String> amortizationPeriodFilter) {
        this.amortizationPeriodFilter = amortizationPeriodFilter;
        return this;
    }
    public java.util.List<String> getAmortizationPeriodFilter() {
        return this.amortizationPeriodFilter;
    }

    public DescribeInstanceAmortizedCostByConsumePeriodRequest setBillOwnerIdList(java.util.List<String> billOwnerIdList) {
        this.billOwnerIdList = billOwnerIdList;
        return this;
    }
    public java.util.List<String> getBillOwnerIdList() {
        return this.billOwnerIdList;
    }

    public DescribeInstanceAmortizedCostByConsumePeriodRequest setBillUserIdList(java.util.List<String> billUserIdList) {
        this.billUserIdList = billUserIdList;
        return this;
    }
    public java.util.List<String> getBillUserIdList() {
        return this.billUserIdList;
    }

    public DescribeInstanceAmortizedCostByConsumePeriodRequest setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
        return this;
    }
    public String getBillingCycle() {
        return this.billingCycle;
    }

    public DescribeInstanceAmortizedCostByConsumePeriodRequest setCostUnitCode(String costUnitCode) {
        this.costUnitCode = costUnitCode;
        return this;
    }
    public String getCostUnitCode() {
        return this.costUnitCode;
    }

    public DescribeInstanceAmortizedCostByConsumePeriodRequest setInstanceIdList(java.util.List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }
    public java.util.List<String> getInstanceIdList() {
        return this.instanceIdList;
    }

    public DescribeInstanceAmortizedCostByConsumePeriodRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeInstanceAmortizedCostByConsumePeriodRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeInstanceAmortizedCostByConsumePeriodRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeInstanceAmortizedCostByConsumePeriodRequest setProductDetail(String productDetail) {
        this.productDetail = productDetail;
        return this;
    }
    public String getProductDetail() {
        return this.productDetail;
    }

    public DescribeInstanceAmortizedCostByConsumePeriodRequest setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

}
