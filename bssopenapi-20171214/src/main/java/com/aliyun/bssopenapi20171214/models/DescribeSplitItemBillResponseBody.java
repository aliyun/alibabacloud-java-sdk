// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeSplitItemBillResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeSplitItemBillResponseBodyData data;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeSplitItemBillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSplitItemBillResponseBody self = new DescribeSplitItemBillResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSplitItemBillResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSplitItemBillResponseBody setData(DescribeSplitItemBillResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSplitItemBillResponseBodyData getData() {
        return this.data;
    }

    public DescribeSplitItemBillResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSplitItemBillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSplitItemBillResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeSplitItemBillResponseBodyDataItems extends TeaModel {
        /**
         * <p>The amount deducted with credit refund.</p>
         */
        @NameInMap("AdjustAmount")
        public Float adjustAmount;

        /**
         * <p>The ID of the account to which the bill belongs.</p>
         */
        @NameInMap("BillAccountID")
        public String billAccountID;

        /**
         * <p>The name of the account to which the bill belongs.</p>
         */
        @NameInMap("BillAccountName")
        public String billAccountName;

        /**
         * <p>The billing date. Format: YYYY-MM-DD. This parameter is not supported.</p>
         */
        @NameInMap("BillingDate")
        public String billingDate;

        /**
         * <p>The billable item.</p>
         */
        @NameInMap("BillingItem")
        public String billingItem;

        /**
         * <p>The code of the billable item.</p>
         */
        @NameInMap("BillingItemCode")
        public String billingItemCode;

        /**
         * <p>The billing method.</p>
         */
        @NameInMap("BillingType")
        public String billingType;

        /**
         * <p>The type of the business.</p>
         */
        @NameInMap("BizType")
        public String bizType;

        /**
         * <p>The amount paid in cash. The amount deducted with credit refund is not included.</p>
         */
        @NameInMap("CashAmount")
        public Float cashAmount;

        /**
         * <p>The code of the commodity. The code is the same as that displayed in the Split Bill module of the User Center console.</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The cost center.</p>
         */
        @NameInMap("CostUnit")
        public String costUnit;

        /**
         * <p>The type of currency. Valid values: CNY, USD, and JPY.</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The amount deducted with vouchers.</p>
         */
        @NameInMap("DeductedByCashCoupons")
        public Float deductedByCashCoupons;

        /**
         * <p>The amount deducted with coupons.</p>
         */
        @NameInMap("DeductedByCoupons")
        public Float deductedByCoupons;

        /**
         * <p>The amount deducted with prepaid cards.</p>
         */
        @NameInMap("DeductedByPrepaidCard")
        public Float deductedByPrepaidCard;

        /**
         * <p>The amount deducted with resource plans.</p>
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
         * <p>The type of the instance.</p>
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
         * <p>The type of the bill. Valid values: SubscriptionOrder: the subscription bill. PayAsYouGoBill: the pay-as-you-go bill. Refund: the refund. Adjustment: the adjustment bill.</p>
         */
        @NameInMap("Item")
        public String item;

        /**
         * <p>The name of the split item.</p>
         */
        @NameInMap("ItemName")
        public String itemName;

        /**
         * <p>The unit price.</p>
         */
        @NameInMap("ListPrice")
        public String listPrice;

        /**
         * <p>The unit of the unit price.</p>
         */
        @NameInMap("ListPriceUnit")
        public String listPriceUnit;

        /**
         * <p>The name of the instance.</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <p>The amount that is unsettled.</p>
         */
        @NameInMap("OutstandingAmount")
        public Float outstandingAmount;

        /**
         * <p>The ID of the account that owns the resource. This parameter is returned in multi-account scenario.</p>
         */
        @NameInMap("OwnerID")
        public String ownerID;

        /**
         * <p>The amount paid in cash. The amount deducted with credit refund is included.</p>
         */
        @NameInMap("PaymentAmount")
        public Float paymentAmount;

        /**
         * <p>The code of the service. The code is the same as that displayed in the Split Bill module of the User Center console.</p>
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
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceGroup")
        public String resourceGroup;

        /**
         * <p>The duration of the service.</p>
         */
        @NameInMap("ServicePeriod")
        public String servicePeriod;

        /**
         * <p>The unit of the service duration.</p>
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
         * <p>The billing cycle in which the bill is split.</p>
         */
        @NameInMap("SplitBillingCycle")
        public String splitBillingCycle;

        /**
         * <p>The day on which the bill is split.</p>
         */
        @NameInMap("SplitBillingDate")
        public String splitBillingDate;

        /**
         * <p>The code of the split item.</p>
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
         * <p>The details of the service.</p>
         */
        @NameInMap("SplitProductDetail")
        public String splitProductDetail;

        /**
         * <p>The billing method. Valid values: Subscription: the subscription billing method. PayAsYouGo: the pay-as-you-go billing method.</p>
         */
        @NameInMap("SubscriptionType")
        public String subscriptionType;

        /**
         * <p>The tag of the resource. If tags added to resources change, the bills generated during the period in which resources and tags are associated are returned.</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The amount of resource usage.</p>
         */
        @NameInMap("Usage")
        public String usage;

        /**
         * <p>The unit of usage.</p>
         */
        @NameInMap("UsageUnit")
        public String usageUnit;

        /**
         * <p>The zone.</p>
         */
        @NameInMap("Zone")
        public String zone;

        public static DescribeSplitItemBillResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSplitItemBillResponseBodyDataItems self = new DescribeSplitItemBillResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public DescribeSplitItemBillResponseBodyDataItems setAdjustAmount(Float adjustAmount) {
            this.adjustAmount = adjustAmount;
            return this;
        }
        public Float getAdjustAmount() {
            return this.adjustAmount;
        }

        public DescribeSplitItemBillResponseBodyDataItems setBillAccountID(String billAccountID) {
            this.billAccountID = billAccountID;
            return this;
        }
        public String getBillAccountID() {
            return this.billAccountID;
        }

        public DescribeSplitItemBillResponseBodyDataItems setBillAccountName(String billAccountName) {
            this.billAccountName = billAccountName;
            return this;
        }
        public String getBillAccountName() {
            return this.billAccountName;
        }

        public DescribeSplitItemBillResponseBodyDataItems setBillingDate(String billingDate) {
            this.billingDate = billingDate;
            return this;
        }
        public String getBillingDate() {
            return this.billingDate;
        }

        public DescribeSplitItemBillResponseBodyDataItems setBillingItem(String billingItem) {
            this.billingItem = billingItem;
            return this;
        }
        public String getBillingItem() {
            return this.billingItem;
        }

        public DescribeSplitItemBillResponseBodyDataItems setBillingItemCode(String billingItemCode) {
            this.billingItemCode = billingItemCode;
            return this;
        }
        public String getBillingItemCode() {
            return this.billingItemCode;
        }

        public DescribeSplitItemBillResponseBodyDataItems setBillingType(String billingType) {
            this.billingType = billingType;
            return this;
        }
        public String getBillingType() {
            return this.billingType;
        }

        public DescribeSplitItemBillResponseBodyDataItems setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribeSplitItemBillResponseBodyDataItems setCashAmount(Float cashAmount) {
            this.cashAmount = cashAmount;
            return this;
        }
        public Float getCashAmount() {
            return this.cashAmount;
        }

        public DescribeSplitItemBillResponseBodyDataItems setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeSplitItemBillResponseBodyDataItems setCostUnit(String costUnit) {
            this.costUnit = costUnit;
            return this;
        }
        public String getCostUnit() {
            return this.costUnit;
        }

        public DescribeSplitItemBillResponseBodyDataItems setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeSplitItemBillResponseBodyDataItems setDeductedByCashCoupons(Float deductedByCashCoupons) {
            this.deductedByCashCoupons = deductedByCashCoupons;
            return this;
        }
        public Float getDeductedByCashCoupons() {
            return this.deductedByCashCoupons;
        }

        public DescribeSplitItemBillResponseBodyDataItems setDeductedByCoupons(Float deductedByCoupons) {
            this.deductedByCoupons = deductedByCoupons;
            return this;
        }
        public Float getDeductedByCoupons() {
            return this.deductedByCoupons;
        }

        public DescribeSplitItemBillResponseBodyDataItems setDeductedByPrepaidCard(Float deductedByPrepaidCard) {
            this.deductedByPrepaidCard = deductedByPrepaidCard;
            return this;
        }
        public Float getDeductedByPrepaidCard() {
            return this.deductedByPrepaidCard;
        }

        public DescribeSplitItemBillResponseBodyDataItems setDeductedByResourcePackage(String deductedByResourcePackage) {
            this.deductedByResourcePackage = deductedByResourcePackage;
            return this;
        }
        public String getDeductedByResourcePackage() {
            return this.deductedByResourcePackage;
        }

        public DescribeSplitItemBillResponseBodyDataItems setInstanceConfig(String instanceConfig) {
            this.instanceConfig = instanceConfig;
            return this;
        }
        public String getInstanceConfig() {
            return this.instanceConfig;
        }

        public DescribeSplitItemBillResponseBodyDataItems setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeSplitItemBillResponseBodyDataItems setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public DescribeSplitItemBillResponseBodyDataItems setInternetIP(String internetIP) {
            this.internetIP = internetIP;
            return this;
        }
        public String getInternetIP() {
            return this.internetIP;
        }

        public DescribeSplitItemBillResponseBodyDataItems setIntranetIP(String intranetIP) {
            this.intranetIP = intranetIP;
            return this;
        }
        public String getIntranetIP() {
            return this.intranetIP;
        }

        public DescribeSplitItemBillResponseBodyDataItems setInvoiceDiscount(Float invoiceDiscount) {
            this.invoiceDiscount = invoiceDiscount;
            return this;
        }
        public Float getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        public DescribeSplitItemBillResponseBodyDataItems setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public DescribeSplitItemBillResponseBodyDataItems setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public DescribeSplitItemBillResponseBodyDataItems setListPrice(String listPrice) {
            this.listPrice = listPrice;
            return this;
        }
        public String getListPrice() {
            return this.listPrice;
        }

        public DescribeSplitItemBillResponseBodyDataItems setListPriceUnit(String listPriceUnit) {
            this.listPriceUnit = listPriceUnit;
            return this;
        }
        public String getListPriceUnit() {
            return this.listPriceUnit;
        }

        public DescribeSplitItemBillResponseBodyDataItems setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public DescribeSplitItemBillResponseBodyDataItems setOutstandingAmount(Float outstandingAmount) {
            this.outstandingAmount = outstandingAmount;
            return this;
        }
        public Float getOutstandingAmount() {
            return this.outstandingAmount;
        }

        public DescribeSplitItemBillResponseBodyDataItems setOwnerID(String ownerID) {
            this.ownerID = ownerID;
            return this;
        }
        public String getOwnerID() {
            return this.ownerID;
        }

        public DescribeSplitItemBillResponseBodyDataItems setPaymentAmount(Float paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }
        public Float getPaymentAmount() {
            return this.paymentAmount;
        }

        public DescribeSplitItemBillResponseBodyDataItems setPipCode(String pipCode) {
            this.pipCode = pipCode;
            return this;
        }
        public String getPipCode() {
            return this.pipCode;
        }

        public DescribeSplitItemBillResponseBodyDataItems setPretaxAmount(Float pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public Float getPretaxAmount() {
            return this.pretaxAmount;
        }

        public DescribeSplitItemBillResponseBodyDataItems setPretaxGrossAmount(Float pretaxGrossAmount) {
            this.pretaxGrossAmount = pretaxGrossAmount;
            return this;
        }
        public Float getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        public DescribeSplitItemBillResponseBodyDataItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeSplitItemBillResponseBodyDataItems setProductDetail(String productDetail) {
            this.productDetail = productDetail;
            return this;
        }
        public String getProductDetail() {
            return this.productDetail;
        }

        public DescribeSplitItemBillResponseBodyDataItems setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public DescribeSplitItemBillResponseBodyDataItems setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public DescribeSplitItemBillResponseBodyDataItems setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeSplitItemBillResponseBodyDataItems setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public DescribeSplitItemBillResponseBodyDataItems setServicePeriod(String servicePeriod) {
            this.servicePeriod = servicePeriod;
            return this;
        }
        public String getServicePeriod() {
            return this.servicePeriod;
        }

        public DescribeSplitItemBillResponseBodyDataItems setServicePeriodUnit(String servicePeriodUnit) {
            this.servicePeriodUnit = servicePeriodUnit;
            return this;
        }
        public String getServicePeriodUnit() {
            return this.servicePeriodUnit;
        }

        public DescribeSplitItemBillResponseBodyDataItems setSplitAccountID(String splitAccountID) {
            this.splitAccountID = splitAccountID;
            return this;
        }
        public String getSplitAccountID() {
            return this.splitAccountID;
        }

        public DescribeSplitItemBillResponseBodyDataItems setSplitAccountName(String splitAccountName) {
            this.splitAccountName = splitAccountName;
            return this;
        }
        public String getSplitAccountName() {
            return this.splitAccountName;
        }

        public DescribeSplitItemBillResponseBodyDataItems setSplitBillingCycle(String splitBillingCycle) {
            this.splitBillingCycle = splitBillingCycle;
            return this;
        }
        public String getSplitBillingCycle() {
            return this.splitBillingCycle;
        }

        public DescribeSplitItemBillResponseBodyDataItems setSplitBillingDate(String splitBillingDate) {
            this.splitBillingDate = splitBillingDate;
            return this;
        }
        public String getSplitBillingDate() {
            return this.splitBillingDate;
        }

        public DescribeSplitItemBillResponseBodyDataItems setSplitCommodityCode(String splitCommodityCode) {
            this.splitCommodityCode = splitCommodityCode;
            return this;
        }
        public String getSplitCommodityCode() {
            return this.splitCommodityCode;
        }

        public DescribeSplitItemBillResponseBodyDataItems setSplitItemID(String splitItemID) {
            this.splitItemID = splitItemID;
            return this;
        }
        public String getSplitItemID() {
            return this.splitItemID;
        }

        public DescribeSplitItemBillResponseBodyDataItems setSplitItemName(String splitItemName) {
            this.splitItemName = splitItemName;
            return this;
        }
        public String getSplitItemName() {
            return this.splitItemName;
        }

        public DescribeSplitItemBillResponseBodyDataItems setSplitProductDetail(String splitProductDetail) {
            this.splitProductDetail = splitProductDetail;
            return this;
        }
        public String getSplitProductDetail() {
            return this.splitProductDetail;
        }

        public DescribeSplitItemBillResponseBodyDataItems setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public DescribeSplitItemBillResponseBodyDataItems setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeSplitItemBillResponseBodyDataItems setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

        public DescribeSplitItemBillResponseBodyDataItems setUsageUnit(String usageUnit) {
            this.usageUnit = usageUnit;
            return this;
        }
        public String getUsageUnit() {
            return this.usageUnit;
        }

        public DescribeSplitItemBillResponseBodyDataItems setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

    public static class DescribeSplitItemBillResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the account.</p>
         */
        @NameInMap("AccountID")
        public String accountID;

        /**
         * <p>The ID of the account.</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The billing cycle. Format: YYYY-MM.</p>
         */
        @NameInMap("BillingCycle")
        public String billingCycle;

        /**
         * <p>The details of the bill.</p>
         */
        @NameInMap("Items")
        public java.util.List<DescribeSplitItemBillResponseBodyDataItems> items;

        /**
         * <p>The maximum number of entries returned.</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token used for the next query. If this parameter is empty, all the results are returned. When you perform the next query, you must set the NextToken parameter to this value.</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeSplitItemBillResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSplitItemBillResponseBodyData self = new DescribeSplitItemBillResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSplitItemBillResponseBodyData setAccountID(String accountID) {
            this.accountID = accountID;
            return this;
        }
        public String getAccountID() {
            return this.accountID;
        }

        public DescribeSplitItemBillResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeSplitItemBillResponseBodyData setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public DescribeSplitItemBillResponseBodyData setItems(java.util.List<DescribeSplitItemBillResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeSplitItemBillResponseBodyDataItems> getItems() {
            return this.items;
        }

        public DescribeSplitItemBillResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public DescribeSplitItemBillResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public DescribeSplitItemBillResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
