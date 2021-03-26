// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeInstanceBillRequest extends TeaModel {
    @NameInMap("BillingCycle")
    public String billingCycle;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("SubscriptionType")
    public String subscriptionType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("IsBillingItem")
    public Boolean isBillingItem;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("IsHideZeroCharge")
    public Boolean isHideZeroCharge;

    @NameInMap("BillingDate")
    public String billingDate;

    @NameInMap("Granularity")
    public String granularity;

    @NameInMap("BillOwnerId")
    public Long billOwnerId;

    @NameInMap("InstanceID")
    public String instanceID;

    public static DescribeInstanceBillRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceBillRequest self = new DescribeInstanceBillRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceBillRequest setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
        return this;
    }
    public String getBillingCycle() {
        return this.billingCycle;
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

    public DescribeInstanceBillRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeInstanceBillRequest setIsBillingItem(Boolean isBillingItem) {
        this.isBillingItem = isBillingItem;
        return this;
    }
    public Boolean getIsBillingItem() {
        return this.isBillingItem;
    }

    public DescribeInstanceBillRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeInstanceBillRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeInstanceBillRequest setIsHideZeroCharge(Boolean isHideZeroCharge) {
        this.isHideZeroCharge = isHideZeroCharge;
        return this;
    }
    public Boolean getIsHideZeroCharge() {
        return this.isHideZeroCharge;
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

    public DescribeInstanceBillRequest setBillOwnerId(Long billOwnerId) {
        this.billOwnerId = billOwnerId;
        return this;
    }
    public Long getBillOwnerId() {
        return this.billOwnerId;
    }

    public DescribeInstanceBillRequest setInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }
    public String getInstanceID() {
        return this.instanceID;
    }

}
