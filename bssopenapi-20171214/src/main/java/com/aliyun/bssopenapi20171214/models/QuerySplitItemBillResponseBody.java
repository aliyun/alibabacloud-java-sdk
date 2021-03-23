// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySplitItemBillResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public QuerySplitItemBillResponseBodyData data;

    public static QuerySplitItemBillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySplitItemBillResponseBody self = new QuerySplitItemBillResponseBody();
        return TeaModel.build(map, self);
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

    public QuerySplitItemBillResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySplitItemBillResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySplitItemBillResponseBody setData(QuerySplitItemBillResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySplitItemBillResponseBodyData getData() {
        return this.data;
    }

    public static class QuerySplitItemBillResponseBodyDataItemsItem extends TeaModel {
        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("BillingType")
        public String billingType;

        @NameInMap("CostUnit")
        public String costUnit;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductType")
        public String productType;

        @NameInMap("SubscriptionType")
        public String subscriptionType;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("ProductDetail")
        public String productDetail;

        @NameInMap("OwnerID")
        public String ownerID;

        @NameInMap("BillingItem")
        public String billingItem;

        @NameInMap("ListPrice")
        public String listPrice;

        @NameInMap("ListPriceUnit")
        public String listPriceUnit;

        @NameInMap("Usage")
        public String usage;

        @NameInMap("UsageUnit")
        public String usageUnit;

        @NameInMap("DeductedByResourcePackage")
        public String deductedByResourcePackage;

        @NameInMap("PretaxGrossAmount")
        public Float pretaxGrossAmount;

        @NameInMap("InvoiceDiscount")
        public Float invoiceDiscount;

        @NameInMap("DeductedByCoupons")
        public Float deductedByCoupons;

        @NameInMap("PretaxAmount")
        public Float pretaxAmount;

        @NameInMap("DeductedByCashCoupons")
        public Float deductedByCashCoupons;

        @NameInMap("DeductedByPrepaidCard")
        public Float deductedByPrepaidCard;

        @NameInMap("PaymentAmount")
        public Float paymentAmount;

        @NameInMap("OutstandingAmount")
        public Float outstandingAmount;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("ResourceGroup")
        public String resourceGroup;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("InstanceConfig")
        public String instanceConfig;

        @NameInMap("InstanceSpec")
        public String instanceSpec;

        @NameInMap("InternetIP")
        public String internetIP;

        @NameInMap("IntranetIP")
        public String intranetIP;

        @NameInMap("Region")
        public String region;

        @NameInMap("Zone")
        public String zone;

        @NameInMap("Item")
        public String item;

        @NameInMap("ServicePeriod")
        public String servicePeriod;

        @NameInMap("BillingDate")
        public String billingDate;

        @NameInMap("SplitItemID")
        public String splitItemID;

        @NameInMap("SplitItemName")
        public String splitItemName;

        @NameInMap("PipCode")
        public String pipCode;

        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("ServicePeriodUnit")
        public String servicePeriodUnit;

        @NameInMap("SplitCommodityCode")
        public String splitCommodityCode;

        @NameInMap("SplitProductDetail")
        public String splitProductDetail;

        @NameInMap("SplitAccountID")
        public String splitAccountID;

        @NameInMap("SplitAccountName")
        public String splitAccountName;

        @NameInMap("SplitBillingCycle")
        public String splitBillingCycle;

        public static QuerySplitItemBillResponseBodyDataItemsItem build(java.util.Map<String, ?> map) throws Exception {
            QuerySplitItemBillResponseBodyDataItemsItem self = new QuerySplitItemBillResponseBodyDataItemsItem();
            return TeaModel.build(map, self);
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setBillingType(String billingType) {
            this.billingType = billingType;
            return this;
        }
        public String getBillingType() {
            return this.billingType;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setCostUnit(String costUnit) {
            this.costUnit = costUnit;
            return this;
        }
        public String getCostUnit() {
            return this.costUnit;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setProductDetail(String productDetail) {
            this.productDetail = productDetail;
            return this;
        }
        public String getProductDetail() {
            return this.productDetail;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setOwnerID(String ownerID) {
            this.ownerID = ownerID;
            return this;
        }
        public String getOwnerID() {
            return this.ownerID;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setBillingItem(String billingItem) {
            this.billingItem = billingItem;
            return this;
        }
        public String getBillingItem() {
            return this.billingItem;
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

        public QuerySplitItemBillResponseBodyDataItemsItem setDeductedByResourcePackage(String deductedByResourcePackage) {
            this.deductedByResourcePackage = deductedByResourcePackage;
            return this;
        }
        public String getDeductedByResourcePackage() {
            return this.deductedByResourcePackage;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setPretaxGrossAmount(Float pretaxGrossAmount) {
            this.pretaxGrossAmount = pretaxGrossAmount;
            return this;
        }
        public Float getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setInvoiceDiscount(Float invoiceDiscount) {
            this.invoiceDiscount = invoiceDiscount;
            return this;
        }
        public Float getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setDeductedByCoupons(Float deductedByCoupons) {
            this.deductedByCoupons = deductedByCoupons;
            return this;
        }
        public Float getDeductedByCoupons() {
            return this.deductedByCoupons;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setPretaxAmount(Float pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public Float getPretaxAmount() {
            return this.pretaxAmount;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setDeductedByCashCoupons(Float deductedByCashCoupons) {
            this.deductedByCashCoupons = deductedByCashCoupons;
            return this;
        }
        public Float getDeductedByCashCoupons() {
            return this.deductedByCashCoupons;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setDeductedByPrepaidCard(Float deductedByPrepaidCard) {
            this.deductedByPrepaidCard = deductedByPrepaidCard;
            return this;
        }
        public Float getDeductedByPrepaidCard() {
            return this.deductedByPrepaidCard;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setPaymentAmount(Float paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }
        public Float getPaymentAmount() {
            return this.paymentAmount;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setOutstandingAmount(Float outstandingAmount) {
            this.outstandingAmount = outstandingAmount;
            return this;
        }
        public Float getOutstandingAmount() {
            return this.outstandingAmount;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setInstanceConfig(String instanceConfig) {
            this.instanceConfig = instanceConfig;
            return this;
        }
        public String getInstanceConfig() {
            return this.instanceConfig;
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

        public QuerySplitItemBillResponseBodyDataItemsItem setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setServicePeriod(String servicePeriod) {
            this.servicePeriod = servicePeriod;
            return this;
        }
        public String getServicePeriod() {
            return this.servicePeriod;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setBillingDate(String billingDate) {
            this.billingDate = billingDate;
            return this;
        }
        public String getBillingDate() {
            return this.billingDate;
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

        public QuerySplitItemBillResponseBodyDataItemsItem setPipCode(String pipCode) {
            this.pipCode = pipCode;
            return this;
        }
        public String getPipCode() {
            return this.pipCode;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setServicePeriodUnit(String servicePeriodUnit) {
            this.servicePeriodUnit = servicePeriodUnit;
            return this;
        }
        public String getServicePeriodUnit() {
            return this.servicePeriodUnit;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setSplitCommodityCode(String splitCommodityCode) {
            this.splitCommodityCode = splitCommodityCode;
            return this;
        }
        public String getSplitCommodityCode() {
            return this.splitCommodityCode;
        }

        public QuerySplitItemBillResponseBodyDataItemsItem setSplitProductDetail(String splitProductDetail) {
            this.splitProductDetail = splitProductDetail;
            return this;
        }
        public String getSplitProductDetail() {
            return this.splitProductDetail;
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
        @NameInMap("BillingCycle")
        public String billingCycle;

        @NameInMap("AccountID")
        public String accountID;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Items")
        public QuerySplitItemBillResponseBodyDataItems items;

        public static QuerySplitItemBillResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySplitItemBillResponseBodyData self = new QuerySplitItemBillResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySplitItemBillResponseBodyData setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
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

        public QuerySplitItemBillResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
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

        public QuerySplitItemBillResponseBodyData setItems(QuerySplitItemBillResponseBodyDataItems items) {
            this.items = items;
            return this;
        }
        public QuerySplitItemBillResponseBodyDataItems getItems() {
            return this.items;
        }

    }

}
