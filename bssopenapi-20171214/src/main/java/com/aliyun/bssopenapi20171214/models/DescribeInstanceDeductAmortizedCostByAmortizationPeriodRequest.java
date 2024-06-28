// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeInstanceDeductAmortizedCostByAmortizationPeriodRequest extends TeaModel {
    @NameInMap("BillOwnerIdList")
    public java.util.List<String> billOwnerIdList;

    @NameInMap("BillUserIdList")
    public java.util.List<String> billUserIdList;

    /**
     * <strong>example:</strong>
     * <p>2023-04</p>
     */
    @NameInMap("BillingCycle")
    public String billingCycle;

    /**
     * <strong>example:</strong>
     * <p>123#</p>
     */
    @NameInMap("CostUnitCode")
    public String costUnitCode;

    @NameInMap("InstanceIdList")
    public java.util.List<String> instanceIdList;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>CAESEgoQCg4KCmdtdF9jcmVhdGUEARgBIkgKCQBwhGmPcAEAAAo7AzYAAAAxTDgwMDcxMjg3ZDJhNmM3ZDguTDgwMDAwMDAwMDAwMzE1MTIuTDgwMDcyZDMyZTJkYzg3N2U</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("ProductDetail")
    public String productDetail;

    /**
     * <strong>example:</strong>
     * <p>PayAsYouGo</p>
     */
    @NameInMap("SubscriptionType")
    public String subscriptionType;

    public static DescribeInstanceDeductAmortizedCostByAmortizationPeriodRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceDeductAmortizedCostByAmortizationPeriodRequest self = new DescribeInstanceDeductAmortizedCostByAmortizationPeriodRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceDeductAmortizedCostByAmortizationPeriodRequest setBillOwnerIdList(java.util.List<String> billOwnerIdList) {
        this.billOwnerIdList = billOwnerIdList;
        return this;
    }
    public java.util.List<String> getBillOwnerIdList() {
        return this.billOwnerIdList;
    }

    public DescribeInstanceDeductAmortizedCostByAmortizationPeriodRequest setBillUserIdList(java.util.List<String> billUserIdList) {
        this.billUserIdList = billUserIdList;
        return this;
    }
    public java.util.List<String> getBillUserIdList() {
        return this.billUserIdList;
    }

    public DescribeInstanceDeductAmortizedCostByAmortizationPeriodRequest setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
        return this;
    }
    public String getBillingCycle() {
        return this.billingCycle;
    }

    public DescribeInstanceDeductAmortizedCostByAmortizationPeriodRequest setCostUnitCode(String costUnitCode) {
        this.costUnitCode = costUnitCode;
        return this;
    }
    public String getCostUnitCode() {
        return this.costUnitCode;
    }

    public DescribeInstanceDeductAmortizedCostByAmortizationPeriodRequest setInstanceIdList(java.util.List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }
    public java.util.List<String> getInstanceIdList() {
        return this.instanceIdList;
    }

    public DescribeInstanceDeductAmortizedCostByAmortizationPeriodRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeInstanceDeductAmortizedCostByAmortizationPeriodRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeInstanceDeductAmortizedCostByAmortizationPeriodRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeInstanceDeductAmortizedCostByAmortizationPeriodRequest setProductDetail(String productDetail) {
        this.productDetail = productDetail;
        return this;
    }
    public String getProductDetail() {
        return this.productDetail;
    }

    public DescribeInstanceDeductAmortizedCostByAmortizationPeriodRequest setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

}
