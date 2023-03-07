// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySplitItemBillResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public QuerySplitItemBillResponseBodyData data;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QuerySplitItemBillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySplitItemBillResponseBody self = new QuerySplitItemBillResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySplitItemBillResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySplitItemBillResponseBody setData(QuerySplitItemBillResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySplitItemBillResponseBodyData getData() {
        return this.data;
    }

    public QuerySplitItemBillResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySplitItemBillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySplitItemBillResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySplitItemBillResponseBodyDataItemsItem extends TeaModel {
        /**
         * <p>The amount deducted by using credit refunds.</p>
         */
        @NameInMap("AdjustAmount")
        public Float adjustAmount;

        /**
         * <p>The billing date, in the YYYY-MM-DD format.</p>
         */
        @NameInMap("BillingDate")
        public String billingDate;

        /**
         * <p>The billable item.</p>
         */
        @NameInMap("BillingItem")
        public String billingItem;

        /**
         * <p>The billing type.</p>
         */
        @NameInMap("BillingType")
        public String billingType;

        /**
         * <p>The amount paid in cash. The amount that was deducted by using credit refunds is not included.</p>
         */
        @NameInMap("CashAmount")
        public Float cashAmount;

        /**
         * <p>The code of the commodity. The commodity code is the same as that displayed in User Center.</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The cost center.</p>
         */
        @NameInMap("CostUnit")
        public String costUnit;

        /**
         * <p>The type of the currency. Valid values: CNY, USD, and JPY.</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The amount deducted by using vouchers.</p>
         */
        @NameInMap("DeductedByCashCoupons")
        public Float deductedByCashCoupons;

        /**
         * <p>The amount deducted by using coupons.</p>
         */
        @NameInMap("DeductedByCoupons")
        public Float deductedByCoupons;

        /**
         * <p>The amount deducted by using prepaid cards.</p>
         */
        @NameInMap("DeductedByPrepaidCard")
        public Float deductedByPrepaidCard;

        /**
         * <p>The amount deducted by using resource plans.</p>
         */
        @NameInMap("DeductedByResourcePackage")
        public String deductedByResourcePackage;

        /**
         * <p>The configurations of the instance.</p>
         */
        @NameInMap("InstanceConfig")
        public String instanceConfig;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceID")
        public String instanceID;

        /**
         * <p>The instance type of the instance.</p>
         */
        @NameInMap("InstanceSpec")
        public String instanceSpec;

        /**
         * <p>The public IP address.</p>
         */
        @NameInMap("InternetIP")
        public String internetIP;

        /**
         * <p>The private IP address.</p>
         */
        @NameInMap("IntranetIP")
        public String intranetIP;

        /**
         * <p>The discount amount.</p>
         */
        @NameInMap("InvoiceDiscount")
        public Float invoiceDiscount;

        /**
         * <p>The type of the bill. Valid values: SubscriptionOrder: subscription order PayAsYouGoBill: pay-as-you-go bill Refund: refund Adjustment: reconciliation</p>
         */
        @NameInMap("Item")
        public String item;

        /**
         * <p>The unit price. This parameter is returned only if the isBillingItem parameter is set to true.</p>
         */
        @NameInMap("ListPrice")
        public String listPrice;

        /**
         * <p>The unit of the unit price. This parameter is returned only if the isBillingItem parameter is set to true.</p>
         */
        @NameInMap("ListPriceUnit")
        public String listPriceUnit;

        /**
         * <p>The name of the instance.</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <p>The unsettled amount of the bill.</p>
         */
        @NameInMap("OutstandingAmount")
        public Float outstandingAmount;

        /**
         * <p>The ID of the member. This parameter is returned in a multi-account payment scenario.</p>
         */
        @NameInMap("OwnerID")
        public String ownerID;

        /**
         * <p>The amount paid in cash.</p>
         */
        @NameInMap("PaymentAmount")
        public Float paymentAmount;

        /**
         * <p>The code of the service. The service code is the same as that displayed in User Center.</p>
         */
        @NameInMap("PipCode")
        public String pipCode;

        /**
         * <p>The pretax amount.</p>
         */
        @NameInMap("PretaxAmount")
        public Float pretaxAmount;

        /**
         * <p>The pretax gross amount.</p>
         */
        @NameInMap("PretaxGrossAmount")
        public Float pretaxGrossAmount;

        /**
         * <p>The code of the service.</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The details of the service.</p>
         */
        @NameInMap("ProductDetail")
        public String productDetail;

        /**
         * <p>The name of the service.</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>The type of the service.</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The resource group.</p>
         */
        @NameInMap("ResourceGroup")
        public String resourceGroup;

        /**
         * <p>The validity period.</p>
         */
        @NameInMap("ServicePeriod")
        public String servicePeriod;

        /**
         * <p>The unit of the validity period.</p>
         */
        @NameInMap("ServicePeriodUnit")
        public String servicePeriodUnit;

        /**
         * <p>The ID of the account to which the split bill belongs.</p>
         */
        @NameInMap("SplitAccountID")
        public String splitAccountID;

        /**
         * <p>The name of the account to which the split item belongs.</p>
         */
        @NameInMap("SplitAccountName")
        public String splitAccountName;

        /**
         * <p>The month in which the split item is used.</p>
         */
        @NameInMap("SplitBillingCycle")
        public String splitBillingCycle;

        /**
         * <p>The commodity code of the split item.</p>
         */
        @NameInMap("SplitCommodityCode")
        public String splitCommodityCode;

        /**
         * <p>The ID of the split item.</p>
         */
        @NameInMap("SplitItemID")
        public String splitItemID;

        /**
         * <p>The name of the split item.</p>
         */
        @NameInMap("SplitItemName")
        public String splitItemName;

        /**
         * <p>The name of the service to which the split item belongs.</p>
         */
        @NameInMap("SplitProductDetail")
        public String splitProductDetail;

        /**
         * <p>The billing method. Valid values: Subscription: subscription PayAsYouGo: pay-as-you-go This parameter is returned together with the ProductCode parameter.</p>
         */
        @NameInMap("SubscriptionType")
        public String subscriptionType;

        /**
         * <p>The tag.</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The usage of the split item. This parameter is returned only if the isBillingItem parameter is set to true.</p>
         */
        @NameInMap("Usage")
        public String usage;

        /**
         * <p>The unit of usage. This parameter is returned only if the isBillingItem parameter is set to true.</p>
         */
        @NameInMap("UsageUnit")
        public String usageUnit;

        /**
         * <p>The ID of the zone.</p>
         */
        @NameInMap("Zone")
        public String zone;

        public static QuerySplitItemBillResponseBodyDataItemsItem build(java.util.Map<String, ?> map) throws Exception {
            QuerySplitItemBillResponseBodyDataItemsItem self = new QuerySplitItemBillResponseBodyDataItemsItem();
            return TeaModel.build(map, self);
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setAdjustAmount(Float adjustAmount) {
            this.adjustAmount = adjustAmount;
            return this;
        }
        public Float getAdjustAmount() {
            return this.adjustAmount;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setBillingDate(String billingDate) {
            this.billingDate = billingDate;
            return this;
        }
        public String getBillingDate() {
            return this.billingDate;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setBillingItem(String billingItem) {
            this.billingItem = billingItem;
            return this;
        }
        public String getBillingItem() {
            return this.billingItem;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setBillingType(String billingType) {
            this.billingType = billingType;
            return this;
        }
        public String getBillingType() {
            return this.billingType;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setCashAmount(Float cashAmount) {
            this.cashAmount = cashAmount;
            return this;
        }
        public Float getCashAmount() {
            return this.cashAmount;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setCostUnit(String costUnit) {
            this.costUnit = costUnit;
            return this;
        }
        public String getCostUnit() {
            return this.costUnit;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setDeductedByCashCoupons(Float deductedByCashCoupons) {
            this.deductedByCashCoupons = deductedByCashCoupons;
            return this;
        }
        public Float getDeductedByCashCoupons() {
            return this.deductedByCashCoupons;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setDeductedByCoupons(Float deductedByCoupons) {
            this.deductedByCoupons = deductedByCoupons;
            return this;
        }
        public Float getDeductedByCoupons() {
            return this.deductedByCoupons;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setDeductedByPrepaidCard(Float deductedByPrepaidCard) {
            this.deductedByPrepaidCard = deductedByPrepaidCard;
            return this;
        }
        public Float getDeductedByPrepaidCard() {
            return this.deductedByPrepaidCard;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setDeductedByResourcePackage(String deductedByResourcePackage) {
            this.deductedByResourcePackage = deductedByResourcePackage;
            return this;
        }
        public String getDeductedByResourcePackage() {
            return this.deductedByResourcePackage;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setInstanceConfig(String instanceConfig) {
            this.instanceConfig = instanceConfig;
            return this;
        }
        public String getInstanceConfig() {
            return this.instanceConfig;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setInternetIP(String internetIP) {
            this.internetIP = internetIP;
            return this;
        }
        public String getInternetIP() {
            return this.internetIP;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setIntranetIP(String intranetIP) {
            this.intranetIP = intranetIP;
            return this;
        }
        public String getIntranetIP() {
            return this.intranetIP;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setInvoiceDiscount(Float invoiceDiscount) {
            this.invoiceDiscount = invoiceDiscount;
            return this;
        }
        public Float getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setListPrice(String listPrice) {
            this.listPrice = listPrice;
            return this;
        }
        public String getListPrice() {
            return this.listPrice;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setListPriceUnit(String listPriceUnit) {
            this.listPriceUnit = listPriceUnit;
            return this;
        }
        public String getListPriceUnit() {
            return this.listPriceUnit;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setOutstandingAmount(Float outstandingAmount) {
            this.outstandingAmount = outstandingAmount;
            return this;
        }
        public Float getOutstandingAmount() {
            return this.outstandingAmount;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setOwnerID(String ownerID) {
            this.ownerID = ownerID;
            return this;
        }
        public String getOwnerID() {
            return this.ownerID;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setPaymentAmount(Float paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }
        public Float getPaymentAmount() {
            return this.paymentAmount;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setPipCode(String pipCode) {
            this.pipCode = pipCode;
            return this;
        }
        public String getPipCode() {
            return this.pipCode;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setPretaxAmount(Float pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public Float getPretaxAmount() {
            return this.pretaxAmount;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setPretaxGrossAmount(Float pretaxGrossAmount) {
            this.pretaxGrossAmount = pretaxGrossAmount;
            return this;
        }
        public Float getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setProductDetail(String productDetail) {
            this.productDetail = productDetail;
            return this;
        }
        public String getProductDetail() {
            return this.productDetail;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setServicePeriod(String servicePeriod) {
            this.servicePeriod = servicePeriod;
            return this;
        }
        public String getServicePeriod() {
            return this.servicePeriod;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setServicePeriodUnit(String servicePeriodUnit) {
            this.servicePeriodUnit = servicePeriodUnit;
            return this;
        }
        public String getServicePeriodUnit() {
            return this.servicePeriodUnit;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setSplitAccountID(String splitAccountID) {
            this.splitAccountID = splitAccountID;
            return this;
        }
        public String getSplitAccountID() {
            return this.splitAccountID;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setSplitAccountName(String splitAccountName) {
            this.splitAccountName = splitAccountName;
            return this;
        }
        public String getSplitAccountName() {
            return this.splitAccountName;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setSplitBillingCycle(String splitBillingCycle) {
            this.splitBillingCycle = splitBillingCycle;
            return this;
        }
        public String getSplitBillingCycle() {
            return this.splitBillingCycle;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setSplitCommodityCode(String splitCommodityCode) {
            this.splitCommodityCode = splitCommodityCode;
            return this;
        }
        public String getSplitCommodityCode() {
            return this.splitCommodityCode;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setSplitItemID(String splitItemID) {
            this.splitItemID = splitItemID;
            return this;
        }
        public String getSplitItemID() {
            return this.splitItemID;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setSplitItemName(String splitItemName) {
            this.splitItemName = splitItemName;
            return this;
        }
        public String getSplitItemName() {
            return this.splitItemName;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setSplitProductDetail(String splitProductDetail) {
            this.splitProductDetail = splitProductDetail;
            return this;
        }
        public String getSplitProductDetail() {
            return this.splitProductDetail;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setUsageUnit(String usageUnit) {
            this.usageUnit = usageUnit;
            return this;
        }
        public String getUsageUnit() {
            return this.usageUnit;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

    public static class QuerySplitItemBillResponseBodyDataItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<QuerySplitItemBillResponseBodyDataItemsItem> item;

        public static QuerySplitItemBillResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            QuerySplitItemBillResponseBodyDataItems self = new QuerySplitItemBillResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public QuerySplitItemBillResponseBodyDataItems setItem(java.util.List<QuerySplitItemBillResponseBodyDataItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<QuerySplitItemBillResponseBodyDataItemsItem> getItem() {
            return this.item;
        }

    }

    public static class QuerySplitItemBillResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the account.</p>
         */
        @NameInMap("AccountID")
        public String accountID;

        /**
         * <p>The name of the account.</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The billing cycle, in the YYYY-MM format.</p>
         */
        @NameInMap("BillingCycle")
        public String billingCycle;

        /**
         * <p>The details of the bills.</p>
         */
        @NameInMap("Items")
        public QuerySplitItemBillResponseBodyDataItems items;

        /**
         * <p>The page number of the returned page. Default value: 1.</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of entries returned on each page. Default value: 20. Maximum value: 300.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of returned entries.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static QuerySplitItemBillResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySplitItemBillResponseBodyData self = new QuerySplitItemBillResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySplitItemBillResponseBodyData setAccountID(String accountID) {
            this.accountID = accountID;
            return this;
        }
        public String getAccountID() {
            return this.accountID;
        }

        public QuerySplitItemBillResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public QuerySplitItemBillResponseBodyData setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public QuerySplitItemBillResponseBodyData setItems(QuerySplitItemBillResponseBodyDataItems items) {
            this.items = items;
            return this;
        }
        public QuerySplitItemBillResponseBodyDataItems getItems() {
            return this.items;
        }

        public QuerySplitItemBillResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QuerySplitItemBillResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySplitItemBillResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
