// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryInstanceBillResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryInstanceBillResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AdjustAmount")
        public Float adjustAmount;

        @NameInMap("BillingDate")
        public String billingDate;

        @NameInMap("BillingItem")
        public String billingItem;

        @NameInMap("BillingType")
        public String billingType;

        @NameInMap("CashAmount")
        public Float cashAmount;

        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("CostUnit")
        public String costUnit;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("DeductedByCashCoupons")
        public Float deductedByCashCoupons;

        @NameInMap("DeductedByCoupons")
        public Float deductedByCoupons;

        @NameInMap("DeductedByPrepaidCard")
        public Float deductedByPrepaidCard;

        @NameInMap("DeductedByResourcePackage")
        public String deductedByResourcePackage;

        @NameInMap("InstanceConfig")
        public String instanceConfig;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("InstanceSpec")
        public String instanceSpec;

        @NameInMap("InternetIP")
        public String internetIP;

        @NameInMap("IntranetIP")
        public String intranetIP;

        @NameInMap("InvoiceDiscount")
        public Float invoiceDiscount;

        @NameInMap("Item")
        public String item;

        @NameInMap("ListPrice")
        public String listPrice;

        @NameInMap("ListPriceUnit")
        public String listPriceUnit;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("OutstandingAmount")
        public Float outstandingAmount;

        @NameInMap("OwnerID")
        public String ownerID;

        @NameInMap("PaymentAmount")
        public Float paymentAmount;

        @NameInMap("PipCode")
        public String pipCode;

        @NameInMap("PretaxAmount")
        public Float pretaxAmount;

        @NameInMap("PretaxGrossAmount")
        public Float pretaxGrossAmount;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductDetail")
        public String productDetail;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("ProductType")
        public String productType;

        @NameInMap("Region")
        public String region;

        @NameInMap("ResourceGroup")
        public String resourceGroup;

        @NameInMap("ServicePeriod")
        public String servicePeriod;

        @NameInMap("ServicePeriodUnit")
        public String servicePeriodUnit;

        @NameInMap("SubscriptionType")
        public String subscriptionType;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("Usage")
        public String usage;

        @NameInMap("UsageUnit")
        public String usageUnit;

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
        @NameInMap("AccountID")
        public String accountID;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("BillingCycle")
        public String billingCycle;

        @NameInMap("Items")
        public QueryInstanceBillResponseBodyDataItems items;

        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

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
