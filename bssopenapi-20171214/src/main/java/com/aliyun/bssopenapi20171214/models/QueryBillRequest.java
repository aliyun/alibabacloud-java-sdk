// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryBillRequest extends TeaModel {
    /**
     * <p>The ID of the member.</p>
     */
    @NameInMap("BillOwnerId")
    public Long billOwnerId;

    /**
     * <p>The billing cycle, in the YYYY-MM format.</p>
     */
    @NameInMap("BillingCycle")
    public String billingCycle;

    /**
     * <p>Specifies whether to display local currency information in bills. The parameter will be discontinued.</p>
     */
    @NameInMap("IsDisplayLocalCurrency")
    public Boolean isDisplayLocalCurrency;

    /**
     * <p>Specifies whether to filter out a bill whose pretax gross amount is 0. By default, a bill whose pretax gross amount is 0 is not filtered out. Valid values:</p>
     * <br>
     * <p>*   true: filters out a bill whose pretax gross amount is 0.</p>
     * <p>*   false: does not filter out a bill whose pretax gross amount is 0.</p>
     */
    @NameInMap("IsHideZeroCharge")
    public Boolean isHideZeroCharge;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Default value: 1.</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries to return on each page. Default value: 20. Maximum value: 300.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The code of the service.</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The type of the service.</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The billing method. Valid values:</p>
     * <br>
     * <p>*   Subscription</p>
     * <p>*   PayAsYouGo</p>
     * <br>
     * <p>**</p>
     * <br>
     * <p>****This parameter must be used together with the ProductCode parameter.</p>
     */
    @NameInMap("SubscriptionType")
    public String subscriptionType;

    /**
     * <p>The type of the bill. Valid values:</p>
     * <br>
     * <p>*   SubscriptionOrder</p>
     * <p>*   PayAsYouGoBill</p>
     * <p>*   Refund</p>
     * <p>*   Adjustment</p>
     */
    @NameInMap("Type")
    public String type;

    public static QueryBillRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBillRequest self = new QueryBillRequest();
        return TeaModel.build(map, self);
    }

    public QueryBillRequest setBillOwnerId(Long billOwnerId) {
        this.billOwnerId = billOwnerId;
        return this;
    }
    public Long getBillOwnerId() {
        return this.billOwnerId;
    }

    public QueryBillRequest setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
        return this;
    }
    public String getBillingCycle() {
        return this.billingCycle;
    }

    public QueryBillRequest setIsDisplayLocalCurrency(Boolean isDisplayLocalCurrency) {
        this.isDisplayLocalCurrency = isDisplayLocalCurrency;
        return this;
    }
    public Boolean getIsDisplayLocalCurrency() {
        return this.isDisplayLocalCurrency;
    }

    public QueryBillRequest setIsHideZeroCharge(Boolean isHideZeroCharge) {
        this.isHideZeroCharge = isHideZeroCharge;
        return this;
    }
    public Boolean getIsHideZeroCharge() {
        return this.isHideZeroCharge;
    }

    public QueryBillRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryBillRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryBillRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryBillRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public QueryBillRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public QueryBillRequest setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    public QueryBillRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
