// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeInstanceAmortizedCostByAmortizationPeriodRequest extends TeaModel {
    @NameInMap("BillOwnerIdList")
    public java.util.List<String> billOwnerIdList;

    @NameInMap("BillUserIdList")
    public java.util.List<String> billUserIdList;

    @NameInMap("BillingCycle")
    public String billingCycle;

    @NameInMap("ConsumePeriodFilter")
    public java.util.List<String> consumePeriodFilter;

    @NameInMap("CostUnitCode")
    public String costUnitCode;

    @NameInMap("InstanceIdList")
    public java.util.List<String> instanceIdList;

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

    public static DescribeInstanceAmortizedCostByAmortizationPeriodRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAmortizedCostByAmortizationPeriodRequest self = new DescribeInstanceAmortizedCostByAmortizationPeriodRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodRequest setBillOwnerIdList(java.util.List<String> billOwnerIdList) {
        this.billOwnerIdList = billOwnerIdList;
        return this;
    }
    public java.util.List<String> getBillOwnerIdList() {
        return this.billOwnerIdList;
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodRequest setBillUserIdList(java.util.List<String> billUserIdList) {
        this.billUserIdList = billUserIdList;
        return this;
    }
    public java.util.List<String> getBillUserIdList() {
        return this.billUserIdList;
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodRequest setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
        return this;
    }
    public String getBillingCycle() {
        return this.billingCycle;
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodRequest setConsumePeriodFilter(java.util.List<String> consumePeriodFilter) {
        this.consumePeriodFilter = consumePeriodFilter;
        return this;
    }
    public java.util.List<String> getConsumePeriodFilter() {
        return this.consumePeriodFilter;
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodRequest setCostUnitCode(String costUnitCode) {
        this.costUnitCode = costUnitCode;
        return this;
    }
    public String getCostUnitCode() {
        return this.costUnitCode;
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodRequest setInstanceIdList(java.util.List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }
    public java.util.List<String> getInstanceIdList() {
        return this.instanceIdList;
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodRequest setProductDetail(String productDetail) {
        this.productDetail = productDetail;
        return this;
    }
    public String getProductDetail() {
        return this.productDetail;
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodRequest setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

}
