// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeProductAmortizedCostByConsumePeriodRequest extends TeaModel {
    @NameInMap("AmortizationPeriodFilter")
    public java.util.List<String> amortizationPeriodFilter;

    @NameInMap("BillOwnerIdList")
    public java.util.List<String> billOwnerIdList;

    @NameInMap("BillUserIdList")
    public java.util.List<String> billUserIdList;

    @NameInMap("BillingCycle")
    public String billingCycle;

    @NameInMap("CostUnitCode")
    public String costUnitCode;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ProductDetail")
    public String productDetail;

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
