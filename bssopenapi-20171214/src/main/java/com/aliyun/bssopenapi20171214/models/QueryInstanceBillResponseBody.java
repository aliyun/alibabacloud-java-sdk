// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryInstanceBillResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public QueryInstanceBillResponseBodyData data;

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

    public QueryInstanceBillResponseBody setData(QueryInstanceBillResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryInstanceBillResponseBodyData getData() {
        return this.data;
    }

    public static class QueryInstanceBillResponseBodyDataItemsItem extends TeaModel {
        @NameInMap("BillingDate")
        public String billingDate;

        @NameInMap("InstanceConfig")
        public String instanceConfig;

        @NameInMap("InternetIP")
        public String internetIP;

        @NameInMap("Item")
        public String item;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("DeductedByCashCoupons")
        public Float deductedByCashCoupons;

        @NameInMap("SubscriptionType")
        public String subscriptionType;

        @NameInMap("InstanceSpec")
        public String instanceSpec;

        @NameInMap("DeductedByCoupons")
        public Float deductedByCoupons;

        @NameInMap("BillingItem")
        public String billingItem;

        @NameInMap("Region")
        public String region;

        @NameInMap("OutstandingAmount")
        public Float outstandingAmount;

        @NameInMap("CostUnit")
        public String costUnit;

        @NameInMap("ListPriceUnit")
        public String listPriceUnit;

        @NameInMap("ResourceGroup")
        public String resourceGroup;

        @NameInMap("PipCode")
        public String pipCode;

        @NameInMap("ServicePeriodUnit")
        public String servicePeriodUnit;

        @NameInMap("PretaxAmount")
        public Float pretaxAmount;

        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("ProductDetail")
        public String productDetail;

        @NameInMap("Usage")
        public String usage;

        @NameInMap("IntranetIP")
        public String intranetIP;

        @NameInMap("OwnerID")
        public String ownerID;

        @NameInMap("DeductedByPrepaidCard")
        public Float deductedByPrepaidCard;

        @NameInMap("UsageUnit")
        public String usageUnit;

        @NameInMap("PaymentAmount")
        public Float paymentAmount;

        @NameInMap("InvoiceDiscount")
        public Float invoiceDiscount;

        @NameInMap("DeductedByResourcePackage")
        public String deductedByResourcePackage;

        @NameInMap("ProductType")
        public String productType;

        @NameInMap("ServicePeriod")
        public String servicePeriod;

        @NameInMap("Zone")
        public String zone;

        @NameInMap("ListPrice")
        public String listPrice;

        @NameInMap("PretaxGrossAmount")
        public Float pretaxGrossAmount;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("BillingType")
        public String billingType;

        public static QueryInstanceBillResponseBodyDataItemsItem build(java.util.Map<String, ?> map) throws Exception {
            QueryInstanceBillResponseBodyDataItemsItem self = new QueryInstanceBillResponseBodyDataItemsItem();
            return TeaModel.build(map, self);
        }

        public QueryInstanceBillResponseBodyDataItemsItem setBillingDate(String billingDate) {
            this.billingDate = billingDate;
            return this;
        }
        public String getBillingDate() {
            return this.billingDate;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setInstanceConfig(String instanceConfig) {
            this.instanceConfig = instanceConfig;
            return this;
        }
        public String getInstanceConfig() {
            return this.instanceConfig;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setInternetIP(String internetIP) {
            this.internetIP = internetIP;
            return this;
        }
        public String getInternetIP() {
            return this.internetIP;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
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

        public QueryInstanceBillResponseBodyDataItemsItem setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setDeductedByCoupons(Float deductedByCoupons) {
            this.deductedByCoupons = deductedByCoupons;
            return this;
        }
        public Float getDeductedByCoupons() {
            return this.deductedByCoupons;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setBillingItem(String billingItem) {
            this.billingItem = billingItem;
            return this;
        }
        public String getBillingItem() {
            return this.billingItem;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setOutstandingAmount(Float outstandingAmount) {
            this.outstandingAmount = outstandingAmount;
            return this;
        }
        public Float getOutstandingAmount() {
            return this.outstandingAmount;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setCostUnit(String costUnit) {
            this.costUnit = costUnit;
            return this;
        }
        public String getCostUnit() {
            return this.costUnit;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setListPriceUnit(String listPriceUnit) {
            this.listPriceUnit = listPriceUnit;
            return this;
        }
        public String getListPriceUnit() {
            return this.listPriceUnit;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setPipCode(String pipCode) {
            this.pipCode = pipCode;
            return this;
        }
        public String getPipCode() {
            return this.pipCode;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setServicePeriodUnit(String servicePeriodUnit) {
            this.servicePeriodUnit = servicePeriodUnit;
            return this;
        }
        public String getServicePeriodUnit() {
            return this.servicePeriodUnit;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setPretaxAmount(Float pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public Float getPretaxAmount() {
            return this.pretaxAmount;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setProductDetail(String productDetail) {
            this.productDetail = productDetail;
            return this;
        }
        public String getProductDetail() {
            return this.productDetail;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setIntranetIP(String intranetIP) {
            this.intranetIP = intranetIP;
            return this;
        }
        public String getIntranetIP() {
            return this.intranetIP;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setOwnerID(String ownerID) {
            this.ownerID = ownerID;
            return this;
        }
        public String getOwnerID() {
            return this.ownerID;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setDeductedByPrepaidCard(Float deductedByPrepaidCard) {
            this.deductedByPrepaidCard = deductedByPrepaidCard;
            return this;
        }
        public Float getDeductedByPrepaidCard() {
            return this.deductedByPrepaidCard;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setUsageUnit(String usageUnit) {
            this.usageUnit = usageUnit;
            return this;
        }
        public String getUsageUnit() {
            return this.usageUnit;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setPaymentAmount(Float paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }
        public Float getPaymentAmount() {
            return this.paymentAmount;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setInvoiceDiscount(Float invoiceDiscount) {
            this.invoiceDiscount = invoiceDiscount;
            return this;
        }
        public Float getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setDeductedByResourcePackage(String deductedByResourcePackage) {
            this.deductedByResourcePackage = deductedByResourcePackage;
            return this;
        }
        public String getDeductedByResourcePackage() {
            return this.deductedByResourcePackage;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setServicePeriod(String servicePeriod) {
            this.servicePeriod = servicePeriod;
            return this;
        }
        public String getServicePeriod() {
            return this.servicePeriod;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public QueryInstanceBillResponseBodyDataItemsItem setListPrice(String listPrice) {
            this.listPrice = listPrice;
            return this;
        }
        public String getListPrice() {
            return this.listPrice;
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

        public QueryInstanceBillResponseBodyDataItemsItem setBillingType(String billingType) {
            this.billingType = billingType;
            return this;
        }
        public String getBillingType() {
            return this.billingType;
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
        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("BillingCycle")
        public String billingCycle;

        @NameInMap("AccountID")
        public String accountID;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("Items")
        public QueryInstanceBillResponseBodyDataItems items;

        public static QueryInstanceBillResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryInstanceBillResponseBodyData self = new QueryInstanceBillResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryInstanceBillResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryInstanceBillResponseBodyData setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public QueryInstanceBillResponseBodyData setAccountID(String accountID) {
            this.accountID = accountID;
            return this;
        }
        public String getAccountID() {
            return this.accountID;
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

        public QueryInstanceBillResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public QueryInstanceBillResponseBodyData setItems(QueryInstanceBillResponseBodyDataItems items) {
            this.items = items;
            return this;
        }
        public QueryInstanceBillResponseBodyDataItems getItems() {
            return this.items;
        }

    }

}
