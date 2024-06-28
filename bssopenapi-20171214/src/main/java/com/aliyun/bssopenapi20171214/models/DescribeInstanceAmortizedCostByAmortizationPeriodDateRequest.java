// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeInstanceAmortizedCostByAmortizationPeriodDateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-05-10</p>
     */
    @NameInMap("AmortizationDateEnd")
    public String amortizationDateEnd;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-05-10</p>
     */
    @NameInMap("AmortizationDateStart")
    public String amortizationDateStart;

    @NameInMap("BillOwnerIdList")
    public java.util.List<String> billOwnerIdList;

    @NameInMap("BillUserIdList")
    public java.util.List<String> billUserIdList;

    /**
     * <strong>example:</strong>
     * <p>2023-05</p>
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
     * <p>Subscription</p>
     */
    @NameInMap("SubscriptionType")
    public String subscriptionType;

    public static DescribeInstanceAmortizedCostByAmortizationPeriodDateRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAmortizedCostByAmortizationPeriodDateRequest self = new DescribeInstanceAmortizedCostByAmortizationPeriodDateRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodDateRequest setAmortizationDateEnd(String amortizationDateEnd) {
        this.amortizationDateEnd = amortizationDateEnd;
        return this;
    }
    public String getAmortizationDateEnd() {
        return this.amortizationDateEnd;
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodDateRequest setAmortizationDateStart(String amortizationDateStart) {
        this.amortizationDateStart = amortizationDateStart;
        return this;
    }
    public String getAmortizationDateStart() {
        return this.amortizationDateStart;
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodDateRequest setBillOwnerIdList(java.util.List<String> billOwnerIdList) {
        this.billOwnerIdList = billOwnerIdList;
        return this;
    }
    public java.util.List<String> getBillOwnerIdList() {
        return this.billOwnerIdList;
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodDateRequest setBillUserIdList(java.util.List<String> billUserIdList) {
        this.billUserIdList = billUserIdList;
        return this;
    }
    public java.util.List<String> getBillUserIdList() {
        return this.billUserIdList;
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodDateRequest setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
        return this;
    }
    public String getBillingCycle() {
        return this.billingCycle;
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodDateRequest setCostUnitCode(String costUnitCode) {
        this.costUnitCode = costUnitCode;
        return this;
    }
    public String getCostUnitCode() {
        return this.costUnitCode;
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodDateRequest setInstanceIdList(java.util.List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }
    public java.util.List<String> getInstanceIdList() {
        return this.instanceIdList;
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodDateRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodDateRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodDateRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodDateRequest setProductDetail(String productDetail) {
        this.productDetail = productDetail;
        return this;
    }
    public String getProductDetail() {
        return this.productDetail;
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodDateRequest setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

}
