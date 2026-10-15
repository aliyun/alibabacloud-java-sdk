// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryInstanceBillRequest extends TeaModel {
    /**
     * <p>The ID of the account that owns the resources. This account is the actual user of the resources.</p>
     * 
     * <strong>example:</strong>
     * <p>122</p>
     */
    @NameInMap("BillOwnerId")
    public Long billOwnerId;

    /**
     * <p>The billing cycle in YYYY-MM format. Data from the last 18 months is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-03</p>
     */
    @NameInMap("BillingCycle")
    public String billingCycle;

    /**
     * <p>The billing date. This parameter is required only when the <strong>Granularity</strong> parameter is set to DAILY. The value must be in the YYYY-MM-DD format.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-03-03</p>
     */
    @NameInMap("BillingDate")
    public String billingDate;

    /**
     * <p>The granularity at which to query bills. Valid values:</p>
     * <ul>
     * <li><p>MONTHLY: queries bills by month. The data is consistent with the bill details on the Billing Cycle tab of the Bills page in the User Center.</p>
     * </li>
     * <li><p>DAILY: queries bills by day. The data is consistent with the bill details on the By Day tab of the Bills page in the User Center.</p>
     * </li>
     * </ul>
     * <p>If you set this parameter to DAILY, you must also specify the <strong>BillingDate</strong> parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>MONTHLY</p>
     */
    @NameInMap("Granularity")
    public String granularity;

    /**
     * <p>Specifies whether to query data by billable item.</p>
     * <ul>
     * <li><p>false: The data is consistent with the bill details on the Instance tab of the Bills page in the User Center.</p>
     * </li>
     * <li><p>true: The data is consistent with the bill details on the Billable Item tab of the Bills page in the User Center.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsBillingItem")
    public Boolean isBillingItem;

    /**
     * <p>Specifies whether to filter out bills for which the pretax gross amount (<strong>PretaxGrossAmount</strong>) and pretax amount (<strong>PretaxAmount</strong>) are both 0. Valid values:</p>
     * <ul>
     * <li><p>false.</p>
     * </li>
     * <li><p>true.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsHideZeroCharge")
    public Boolean isHideZeroCharge;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page. Default value: 20. Maximum value: 300.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The code of the product.</p>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The type of the product. Required when the ProductCode parameter is set to the code of an Alibaba Cloud Marketplace product.</p>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The subscription type. Valid values:</p>
     * <ul>
     * <li><p>Subscription: subscription.</p>
     * </li>
     * <li><p>PayAsYouGo: pay-as-you-go.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter must be used with the <strong>ProductCode</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PayAsYouGo</p>
     */
    @NameInMap("SubscriptionType")
    public String subscriptionType;

    public static QueryInstanceBillRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceBillRequest self = new QueryInstanceBillRequest();
        return TeaModel.build(map, self);
    }

    public QueryInstanceBillRequest setBillOwnerId(Long billOwnerId) {
        this.billOwnerId = billOwnerId;
        return this;
    }
    public Long getBillOwnerId() {
        return this.billOwnerId;
    }

    public QueryInstanceBillRequest setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
        return this;
    }
    public String getBillingCycle() {
        return this.billingCycle;
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

    public QueryInstanceBillRequest setIsBillingItem(Boolean isBillingItem) {
        this.isBillingItem = isBillingItem;
        return this;
    }
    public Boolean getIsBillingItem() {
        return this.isBillingItem;
    }

    public QueryInstanceBillRequest setIsHideZeroCharge(Boolean isHideZeroCharge) {
        this.isHideZeroCharge = isHideZeroCharge;
        return this;
    }
    public Boolean getIsHideZeroCharge() {
        return this.isHideZeroCharge;
    }

    public QueryInstanceBillRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

}
