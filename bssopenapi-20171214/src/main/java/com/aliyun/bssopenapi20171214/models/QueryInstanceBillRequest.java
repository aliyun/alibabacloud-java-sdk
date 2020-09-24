// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryInstanceBillRequest extends TeaModel {
    @NameInMap("BillingCycle")
    @Validation(required = true)
    public String billingCycle;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("SubscriptionType")
    public String subscriptionType;

    @NameInMap("IsBillingItem")
    public Boolean isBillingItem;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("IsHideZeroCharge")
    public Boolean isHideZeroCharge;

    @NameInMap("BillingDate")
    public String billingDate;

    @NameInMap("Granularity")
    public String granularity;

    @NameInMap("BillOwnerId")
    public Long billOwnerId;

    public static QueryInstanceBillRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceBillRequest self = new QueryInstanceBillRequest();
        return TeaModel.build(map, self);
    }

    public QueryInstanceBillRequest setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
        return this;
    }
    public String getBillingCycle() {
        return this.billingCycle;
    }

    public QueryInstanceBillRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public QueryInstanceBillRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public QueryInstanceBillRequest setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    public QueryInstanceBillRequest setIsBillingItem(Boolean isBillingItem) {
        this.isBillingItem = isBillingItem;
        return this;
    }
    public Boolean getIsBillingItem() {
        return this.isBillingItem;
    }

    public QueryInstanceBillRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryInstanceBillRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryInstanceBillRequest setIsHideZeroCharge(Boolean isHideZeroCharge) {
        this.isHideZeroCharge = isHideZeroCharge;
        return this;
    }
    public Boolean getIsHideZeroCharge() {
        return this.isHideZeroCharge;
    }

    public QueryInstanceBillRequest setBillingDate(String billingDate) {
        this.billingDate = billingDate;
        return this;
    }
    public String getBillingDate() {
        return this.billingDate;
    }

    public QueryInstanceBillRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public QueryInstanceBillRequest setBillOwnerId(Long billOwnerId) {
        this.billOwnerId = billOwnerId;
        return this;
    }
    public Long getBillOwnerId() {
        return this.billOwnerId;
    }

}
