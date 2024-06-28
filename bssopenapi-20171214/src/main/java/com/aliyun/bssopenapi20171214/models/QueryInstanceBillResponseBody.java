// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryInstanceBillResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public QueryInstanceBillResponseBodyData data;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful!</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>79EE7556-0CFD-44EB-9CD6-B3B526E3A85F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryInstanceBillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceBillResponseBody self = new QueryInstanceBillResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryInstanceBillResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryInstanceBillResponseBody setData(QueryInstanceBillResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryInstanceBillResponseBodyData getData() {
        return this.data;
    }

    public QueryInstanceBillResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryInstanceBillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryInstanceBillResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryInstanceBillResponseBodyDataItemsItem extends TeaModel {
        /**
         * <p>The amount deducted by using credit refunds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AdjustAmount")
        public Float adjustAmount;

        /**
         * <p>The billing date. This parameter is returned only if the Granularity parameter is set to DAILY. Format: YYYY-MM-DD.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-03</p>
         */
        @NameInMap("BillingDate")
        public String billingDate;

        /**
         * <p>The billable item. This parameter is returned only if the IsBillingItem parameter is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>Other</p>
         */
        @NameInMap("BillingItem")
        public String billingItem;

        /**
         * <p>The billing type.</p>
         * 
         * <strong>example:</strong>
         * <p>Other</p>
         */
        @NameInMap("BillingType")
        public String billingType;

        /**
         * <p>The amount paid in cash. The amount that was deducted by using credit refunds is not included.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CashAmount")
        public Float cashAmount;

        /**
         * <p>The code of the commodity. The commodity code is the same as that displayed in User Center.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The cost center.</p>
         * 
         * <strong>example:</strong>
         * <p>Not allocated</p>
         */
        @NameInMap("CostUnit")
        public String costUnit;

        /**
         * <p>The type of the currency. Valid values:</p>
         * <ul>
         * <li>CNY</li>
         * <li>USD</li>
         * <li>JPY</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The amount deducted by using vouchers.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DeductedByCashCoupons")
        public Float deductedByCashCoupons;

        /**
         * <p>The amount deducted by using coupons.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DeductedByCoupons")
        public Float deductedByCoupons;

        /**
         * <p>The amount deducted by using prepaid cards.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DeductedByPrepaidCard")
        public Float deductedByPrepaidCard;

        /**
         * <p>The amount deducted by using resource plans.</p>
         * 
         * <strong>example:</strong>
         * <p>NULL</p>
         */
        @NameInMap("DeductedByResourcePackage")
        public String deductedByResourcePackage;

        /**
         * <p>The configurations of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>CPU:12</p>
         */
        @NameInMap("InstanceConfig")
        public String instanceConfig;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-kjhdskjgshfdlkjfdh</p>
         */
        @NameInMap("InstanceID")
        public String instanceID;

        /**
         * <p>The instance type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.sn1ne.3xlarge</p>
         */
        @NameInMap("InstanceSpec")
        public String instanceSpec;

        /**
         * <p>The public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>34.xx.x.x</p>
         */
        @NameInMap("InternetIP")
        public String internetIP;

        /**
         * <p>The private IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.xx.xx.xx</p>
         */
        @NameInMap("IntranetIP")
        public String intranetIP;

        /**
         * <p>The discount amount.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InvoiceDiscount")
        public Float invoiceDiscount;

        /**
         * <p>The type of the bill.</p>
         * <ul>
         * <li>SubscriptionOrder: subscription order</li>
         * <li>PayAsYouGoBill: pay-as-you-go bill</li>
         * <li>Refund: refund</li>
         * <li>Adjustment: reconciliation</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayAsYouGoBill</p>
         */
        @NameInMap("Item")
        public String item;

        /**
         * <p>The unit price. This parameter is returned only if the isBillingItem parameter is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ListPrice")
        public String listPrice;

        /**
         * <p>The unit of the unit price. This parameter is returned only if the isBillingItem parameter is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("ListPriceUnit")
        public String listPriceUnit;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <p>The unsettled amount.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OutstandingAmount")
        public Float outstandingAmount;

        /**
         * <p>The ID of the member account. This parameter is returned in a multi-account payment scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>169***013</p>
         */
        @NameInMap("OwnerID")
        public String ownerID;

        /**
         * <p>The amount paid in cash.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PaymentAmount")
        public Float paymentAmount;

        /**
         * <p>The code of the service. The service code is the same as that displayed in User Center.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("PipCode")
        public String pipCode;

        /**
         * <p>The pretax amount.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PretaxAmount")
        public Float pretaxAmount;

        /**
         * <p>The pretax gross amount.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PretaxGrossAmount")
        public Float pretaxGrossAmount;

        /**
         * <p>The code of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The details of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>ApsaraDB RDS</p>
         */
        @NameInMap("ProductDetail")
        public String productDetail;

        /**
         * <p>The name of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>ApsaraDB RDS</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>The type of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The region.</p>
         * 
         * <strong>example:</strong>
         * <p>China (Hangzhou)</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>Default resource group</p>
         */
        @NameInMap("ResourceGroup")
        public String resourceGroup;

        /**
         * <p>The validity period.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ServicePeriod")
        public String servicePeriod;

        /**
         * <p>The unit of the validity period.</p>
         * 
         * <strong>example:</strong>
         * <p>Seconds</p>
         */
        @NameInMap("ServicePeriodUnit")
        public String servicePeriodUnit;

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li>Subscription: the subscription billing method</li>
         * <li>PayAsYouGo: the pay-as-you-go billing method</li>
         * </ul>
         * <p>**</p>
         * <p>****This parameter is returned together with the ProductCode parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>PayAsYouGo</p>
         */
        @NameInMap("SubscriptionType")
        public String subscriptionType;

        /**
         * <p>The tag.</p>
         * 
         * <strong>example:</strong>
         * <p>tag</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The usage of the billable item. This parameter is returned only if the isBillingItem parameter is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Usage")
        public String usage;

        /**
         * <p>The unit of usage. This parameter is returned only if the isBillingItem parameter is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>GB</p>
         */
        @NameInMap("UsageUnit")
        public String usageUnit;

        /**
         * <p>The ID of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("Zone")
        public String zone;

        public static QueryInstanceBillResponseBodyDataItemsItem build(java.util.Map<String, ?> map) throws Exception {
            QueryInstanceBillResponseBodyDataItemsItem self = new QueryInstanceBillResponseBodyDataItemsItem();
            return TeaModel.build(map, self);
        }

        public QueryInstanceBillResponseBodyDataItemsItem setAdjustAmount(Float adjustAmount) {
            this.adjustAmount = adjustAmount;
            return this;
        }
        public Float getAdjustAmount() {
            return this.adjustAmount;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setBillingDate(String billingDate) {
            this.billingDate = billingDate;
            return this;
        }
        public String getBillingDate() {
            return this.billingDate;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setBillingItem(String billingItem) {
            this.billingItem = billingItem;
            return this;
        }
        public String getBillingItem() {
            return this.billingItem;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setBillingType(String billingType) {
            this.billingType = billingType;
            return this;
        }
        public String getBillingType() {
            return this.billingType;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setCashAmount(Float cashAmount) {
            this.cashAmount = cashAmount;
            return this;
        }
        public Float getCashAmount() {
            return this.cashAmount;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setCostUnit(String costUnit) {
            this.costUnit = costUnit;
            return this;
        }
        public String getCostUnit() {
            return this.costUnit;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setDeductedByCashCoupons(Float deductedByCashCoupons) {
            this.deductedByCashCoupons = deductedByCashCoupons;
            return this;
        }
        public Float getDeductedByCashCoupons() {
            return this.deductedByCashCoupons;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setDeductedByCoupons(Float deductedByCoupons) {
            this.deductedByCoupons = deductedByCoupons;
            return this;
        }
        public Float getDeductedByCoupons() {
            return this.deductedByCoupons;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setDeductedByPrepaidCard(Float deductedByPrepaidCard) {
            this.deductedByPrepaidCard = deductedByPrepaidCard;
            return this;
        }
        public Float getDeductedByPrepaidCard() {
            return this.deductedByPrepaidCard;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setDeductedByResourcePackage(String deductedByResourcePackage) {
            this.deductedByResourcePackage = deductedByResourcePackage;
            return this;
        }
        public String getDeductedByResourcePackage() {
            return this.deductedByResourcePackage;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setInstanceConfig(String instanceConfig) {
            this.instanceConfig = instanceConfig;
            return this;
        }
        public String getInstanceConfig() {
            return this.instanceConfig;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setInternetIP(String internetIP) {
            this.internetIP = internetIP;
            return this;
        }
        public String getInternetIP() {
            return this.internetIP;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setIntranetIP(String intranetIP) {
            this.intranetIP = intranetIP;
            return this;
        }
        public String getIntranetIP() {
            return this.intranetIP;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setInvoiceDiscount(Float invoiceDiscount) {
            this.invoiceDiscount = invoiceDiscount;
            return this;
        }
        public Float getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setListPrice(String listPrice) {
            this.listPrice = listPrice;
            return this;
        }
        public String getListPrice() {
            return this.listPrice;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setListPriceUnit(String listPriceUnit) {
            this.listPriceUnit = listPriceUnit;
            return this;
        }
        public String getListPriceUnit() {
            return this.listPriceUnit;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setOutstandingAmount(Float outstandingAmount) {
            this.outstandingAmount = outstandingAmount;
            return this;
        }
        public Float getOutstandingAmount() {
            return this.outstandingAmount;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setOwnerID(String ownerID) {
            this.ownerID = ownerID;
            return this;
        }
        public String getOwnerID() {
            return this.ownerID;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setPaymentAmount(Float paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }
        public Float getPaymentAmount() {
            return this.paymentAmount;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setPipCode(String pipCode) {
            this.pipCode = pipCode;
            return this;
        }
        public String getPipCode() {
            return this.pipCode;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setPretaxAmount(Float pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public Float getPretaxAmount() {
            return this.pretaxAmount;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setPretaxGrossAmount(Float pretaxGrossAmount) {
            this.pretaxGrossAmount = pretaxGrossAmount;
            return this;
        }
        public Float getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setProductDetail(String productDetail) {
            this.productDetail = productDetail;
            return this;
        }
        public String getProductDetail() {
            return this.productDetail;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setServicePeriod(String servicePeriod) {
            this.servicePeriod = servicePeriod;
            return this;
        }
        public String getServicePeriod() {
            return this.servicePeriod;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setServicePeriodUnit(String servicePeriodUnit) {
            this.servicePeriodUnit = servicePeriodUnit;
            return this;
        }
        public String getServicePeriodUnit() {
            return this.servicePeriodUnit;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setUsageUnit(String usageUnit) {
            this.usageUnit = usageUnit;
            return this;
        }
        public String getUsageUnit() {
            return this.usageUnit;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

    public static class QueryInstanceBillResponseBodyDataItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<QueryInstanceBillResponseBodyDataItemsItem> item;

        public static QueryInstanceBillResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            QueryInstanceBillResponseBodyDataItems self = new QueryInstanceBillResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public QueryInstanceBillResponseBodyDataItems setItem(java.util.List<QueryInstanceBillResponseBodyDataItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<QueryInstanceBillResponseBodyDataItemsItem> getItem() {
            return this.item;
        }

    }

    public static class QueryInstanceBillResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>185xxxx3489</p>
         */
        @NameInMap("AccountID")
        public String accountID;

        /**
         * <p>The name of the account.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@test.aliyunid.com">test@test.aliyunid.com</a></p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The billing cycle in the YYYY-MM format.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-03</p>
         */
        @NameInMap("BillingCycle")
        public String billingCycle;

        /**
         * <p>The details of the bill.</p>
         */
        @NameInMap("Items")
        public QueryInstanceBillResponseBodyDataItems items;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static QueryInstanceBillResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryInstanceBillResponseBodyData self = new QueryInstanceBillResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryInstanceBillResponseBodyData setAccountID(String accountID) {
            this.accountID = accountID;
            return this;
        }
        public String getAccountID() {
            return this.accountID;
        }

        public QueryInstanceBillResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public QueryInstanceBillResponseBodyData setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public QueryInstanceBillResponseBodyData setItems(QueryInstanceBillResponseBodyDataItems items) {
            this.items = items;
            return this;
        }
        public QueryInstanceBillResponseBodyDataItems getItems() {
            return this.items;
        }

        public QueryInstanceBillResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryInstanceBillResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryInstanceBillResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
