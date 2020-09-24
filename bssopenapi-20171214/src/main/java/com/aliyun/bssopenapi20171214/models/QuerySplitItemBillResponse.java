// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySplitItemBillResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public QuerySplitItemBillResponseData data;

    public static QuerySplitItemBillResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySplitItemBillResponse self = new QuerySplitItemBillResponse();
        return TeaModel.build(map, self);
    }

    public QuerySplitItemBillResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySplitItemBillResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QuerySplitItemBillResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySplitItemBillResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySplitItemBillResponse setData(QuerySplitItemBillResponseData data) {
        this.data = data;
        return this;
    }
    public QuerySplitItemBillResponseData getData() {
        return this.data;
    }

    public static class QuerySplitItemBillResponseDataItemsItem extends TeaModel {
        @NameInMap("InstanceID")
        @Validation(required = true)
        public String instanceID;

        @NameInMap("BillingType")
        @Validation(required = true)
        public String billingType;

        @NameInMap("CostUnit")
        @Validation(required = true)
        public String costUnit;

        @NameInMap("ProductCode")
        @Validation(required = true)
        public String productCode;

        @NameInMap("ProductType")
        @Validation(required = true)
        public String productType;

        @NameInMap("SubscriptionType")
        @Validation(required = true)
        public String subscriptionType;

        @NameInMap("ProductName")
        @Validation(required = true)
        public String productName;

        @NameInMap("ProductDetail")
        @Validation(required = true)
        public String productDetail;

        @NameInMap("OwnerID")
        @Validation(required = true)
        public String ownerID;

        @NameInMap("BillingItem")
        @Validation(required = true)
        public String billingItem;

        @NameInMap("ListPrice")
        @Validation(required = true)
        public String listPrice;

        @NameInMap("ListPriceUnit")
        @Validation(required = true)
        public String listPriceUnit;

        @NameInMap("Usage")
        @Validation(required = true)
        public String usage;

        @NameInMap("UsageUnit")
        @Validation(required = true)
        public String usageUnit;

        @NameInMap("DeductedByResourcePackage")
        @Validation(required = true)
        public String deductedByResourcePackage;

        @NameInMap("PretaxGrossAmount")
        @Validation(required = true)
        public Float pretaxGrossAmount;

        @NameInMap("InvoiceDiscount")
        @Validation(required = true)
        public Float invoiceDiscount;

        @NameInMap("DeductedByCoupons")
        @Validation(required = true)
        public Float deductedByCoupons;

        @NameInMap("PretaxAmount")
        @Validation(required = true)
        public Float pretaxAmount;

        @NameInMap("DeductedByCashCoupons")
        @Validation(required = true)
        public Float deductedByCashCoupons;

        @NameInMap("DeductedByPrepaidCard")
        @Validation(required = true)
        public Float deductedByPrepaidCard;

        @NameInMap("PaymentAmount")
        @Validation(required = true)
        public Float paymentAmount;

        @NameInMap("OutstandingAmount")
        @Validation(required = true)
        public Float outstandingAmount;

        @NameInMap("Currency")
        @Validation(required = true)
        public String currency;

        @NameInMap("NickName")
        @Validation(required = true)
        public String nickName;

        @NameInMap("ResourceGroup")
        @Validation(required = true)
        public String resourceGroup;

        @NameInMap("Tag")
        @Validation(required = true)
        public String tag;

        @NameInMap("InstanceConfig")
        @Validation(required = true)
        public String instanceConfig;

        @NameInMap("InstanceSpec")
        @Validation(required = true)
        public String instanceSpec;

        @NameInMap("InternetIP")
        @Validation(required = true)
        public String internetIP;

        @NameInMap("IntranetIP")
        @Validation(required = true)
        public String intranetIP;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("Zone")
        @Validation(required = true)
        public String zone;

        @NameInMap("Item")
        @Validation(required = true)
        public String item;

        @NameInMap("ServicePeriod")
        @Validation(required = true)
        public String servicePeriod;

        @NameInMap("BillingDate")
        @Validation(required = true)
        public String billingDate;

        @NameInMap("SplitItemID")
        @Validation(required = true)
        public String splitItemID;

        @NameInMap("SplitItemName")
        @Validation(required = true)
        public String splitItemName;

        @NameInMap("PipCode")
        @Validation(required = true)
        public String pipCode;

        @NameInMap("CommodityCode")
        @Validation(required = true)
        public String commodityCode;

        public static QuerySplitItemBillResponseDataItemsItem build(java.util.Map<String, ?> map) throws Exception {
            QuerySplitItemBillResponseDataItemsItem self = new QuerySplitItemBillResponseDataItemsItem();
            return TeaModel.build(map, self);
        }

        public QuerySplitItemBillResponseDataItemsItem setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public QuerySplitItemBillResponseDataItemsItem setBillingType(String billingType) {
            this.billingType = billingType;
            return this;
        }
        public String getBillingType() {
            return this.billingType;
        }

        public QuerySplitItemBillResponseDataItemsItem setCostUnit(String costUnit) {
            this.costUnit = costUnit;
            return this;
        }
        public String getCostUnit() {
            return this.costUnit;
        }

        public QuerySplitItemBillResponseDataItemsItem setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public QuerySplitItemBillResponseDataItemsItem setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public QuerySplitItemBillResponseDataItemsItem setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public QuerySplitItemBillResponseDataItemsItem setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QuerySplitItemBillResponseDataItemsItem setProductDetail(String productDetail) {
            this.productDetail = productDetail;
            return this;
        }
        public String getProductDetail() {
            return this.productDetail;
        }

        public QuerySplitItemBillResponseDataItemsItem setOwnerID(String ownerID) {
            this.ownerID = ownerID;
            return this;
        }
        public String getOwnerID() {
            return this.ownerID;
        }

        public QuerySplitItemBillResponseDataItemsItem setBillingItem(String billingItem) {
            this.billingItem = billingItem;
            return this;
        }
        public String getBillingItem() {
            return this.billingItem;
        }

        public QuerySplitItemBillResponseDataItemsItem setListPrice(String listPrice) {
            this.listPrice = listPrice;
            return this;
        }
        public String getListPrice() {
            return this.listPrice;
        }

        public QuerySplitItemBillResponseDataItemsItem setListPriceUnit(String listPriceUnit) {
            this.listPriceUnit = listPriceUnit;
            return this;
        }
        public String getListPriceUnit() {
            return this.listPriceUnit;
        }

        public QuerySplitItemBillResponseDataItemsItem setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

        public QuerySplitItemBillResponseDataItemsItem setUsageUnit(String usageUnit) {
            this.usageUnit = usageUnit;
            return this;
        }
        public String getUsageUnit() {
            return this.usageUnit;
        }

        public QuerySplitItemBillResponseDataItemsItem setDeductedByResourcePackage(String deductedByResourcePackage) {
            this.deductedByResourcePackage = deductedByResourcePackage;
            return this;
        }
        public String getDeductedByResourcePackage() {
            return this.deductedByResourcePackage;
        }

        public QuerySplitItemBillResponseDataItemsItem setPretaxGrossAmount(Float pretaxGrossAmount) {
            this.pretaxGrossAmount = pretaxGrossAmount;
            return this;
        }
        public Float getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        public QuerySplitItemBillResponseDataItemsItem setInvoiceDiscount(Float invoiceDiscount) {
            this.invoiceDiscount = invoiceDiscount;
            return this;
        }
        public Float getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        public QuerySplitItemBillResponseDataItemsItem setDeductedByCoupons(Float deductedByCoupons) {
            this.deductedByCoupons = deductedByCoupons;
            return this;
        }
        public Float getDeductedByCoupons() {
            return this.deductedByCoupons;
        }

        public QuerySplitItemBillResponseDataItemsItem setPretaxAmount(Float pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public Float getPretaxAmount() {
            return this.pretaxAmount;
        }

        public QuerySplitItemBillResponseDataItemsItem setDeductedByCashCoupons(Float deductedByCashCoupons) {
            this.deductedByCashCoupons = deductedByCashCoupons;
            return this;
        }
        public Float getDeductedByCashCoupons() {
            return this.deductedByCashCoupons;
        }

        public QuerySplitItemBillResponseDataItemsItem setDeductedByPrepaidCard(Float deductedByPrepaidCard) {
            this.deductedByPrepaidCard = deductedByPrepaidCard;
            return this;
        }
        public Float getDeductedByPrepaidCard() {
            return this.deductedByPrepaidCard;
        }

        public QuerySplitItemBillResponseDataItemsItem setPaymentAmount(Float paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }
        public Float getPaymentAmount() {
            return this.paymentAmount;
        }

        public QuerySplitItemBillResponseDataItemsItem setOutstandingAmount(Float outstandingAmount) {
            this.outstandingAmount = outstandingAmount;
            return this;
        }
        public Float getOutstandingAmount() {
            return this.outstandingAmount;
        }

        public QuerySplitItemBillResponseDataItemsItem setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QuerySplitItemBillResponseDataItemsItem setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public QuerySplitItemBillResponseDataItemsItem setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public QuerySplitItemBillResponseDataItemsItem setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public QuerySplitItemBillResponseDataItemsItem setInstanceConfig(String instanceConfig) {
            this.instanceConfig = instanceConfig;
            return this;
        }
        public String getInstanceConfig() {
            return this.instanceConfig;
        }

        public QuerySplitItemBillResponseDataItemsItem setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public QuerySplitItemBillResponseDataItemsItem setInternetIP(String internetIP) {
            this.internetIP = internetIP;
            return this;
        }
        public String getInternetIP() {
            return this.internetIP;
        }

        public QuerySplitItemBillResponseDataItemsItem setIntranetIP(String intranetIP) {
            this.intranetIP = intranetIP;
            return this;
        }
        public String getIntranetIP() {
            return this.intranetIP;
        }

        public QuerySplitItemBillResponseDataItemsItem setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QuerySplitItemBillResponseDataItemsItem setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public QuerySplitItemBillResponseDataItemsItem setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public QuerySplitItemBillResponseDataItemsItem setServicePeriod(String servicePeriod) {
            this.servicePeriod = servicePeriod;
            return this;
        }
        public String getServicePeriod() {
            return this.servicePeriod;
        }

        public QuerySplitItemBillResponseDataItemsItem setBillingDate(String billingDate) {
            this.billingDate = billingDate;
            return this;
        }
        public String getBillingDate() {
            return this.billingDate;
        }

        public QuerySplitItemBillResponseDataItemsItem setSplitItemID(String splitItemID) {
            this.splitItemID = splitItemID;
            return this;
        }
        public String getSplitItemID() {
            return this.splitItemID;
        }

        public QuerySplitItemBillResponseDataItemsItem setSplitItemName(String splitItemName) {
            this.splitItemName = splitItemName;
            return this;
        }
        public String getSplitItemName() {
            return this.splitItemName;
        }

        public QuerySplitItemBillResponseDataItemsItem setPipCode(String pipCode) {
            this.pipCode = pipCode;
            return this;
        }
        public String getPipCode() {
            return this.pipCode;
        }

        public QuerySplitItemBillResponseDataItemsItem setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

    }

    public static class QuerySplitItemBillResponseDataItems extends TeaModel {
        @NameInMap("Item")
        @Validation(required = true)
        public java.util.List<QuerySplitItemBillResponseDataItemsItem> item;

        public static QuerySplitItemBillResponseDataItems build(java.util.Map<String, ?> map) throws Exception {
            QuerySplitItemBillResponseDataItems self = new QuerySplitItemBillResponseDataItems();
            return TeaModel.build(map, self);
        }

        public QuerySplitItemBillResponseDataItems setItem(java.util.List<QuerySplitItemBillResponseDataItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<QuerySplitItemBillResponseDataItemsItem> getItem() {
            return this.item;
        }

    }

    public static class QuerySplitItemBillResponseData extends TeaModel {
        @NameInMap("BillingCycle")
        @Validation(required = true)
        public String billingCycle;

        @NameInMap("AccountID")
        @Validation(required = true)
        public String accountID;

        @NameInMap("AccountName")
        @Validation(required = true)
        public String accountName;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("PageNum")
        @Validation(required = true)
        public Integer pageNum;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("Items")
        @Validation(required = true)
        public QuerySplitItemBillResponseDataItems items;

        public static QuerySplitItemBillResponseData build(java.util.Map<String, ?> map) throws Exception {
            QuerySplitItemBillResponseData self = new QuerySplitItemBillResponseData();
            return TeaModel.build(map, self);
        }

        public QuerySplitItemBillResponseData setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public QuerySplitItemBillResponseData setAccountID(String accountID) {
            this.accountID = accountID;
            return this;
        }
        public String getAccountID() {
            return this.accountID;
        }

        public QuerySplitItemBillResponseData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public QuerySplitItemBillResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QuerySplitItemBillResponseData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QuerySplitItemBillResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySplitItemBillResponseData setItems(QuerySplitItemBillResponseDataItems items) {
            this.items = items;
            return this;
        }
        public QuerySplitItemBillResponseDataItems getItems() {
            return this.items;
        }

    }

}
