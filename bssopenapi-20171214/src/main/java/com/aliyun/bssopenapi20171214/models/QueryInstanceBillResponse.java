// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryInstanceBillResponse extends TeaModel {
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
    public QueryInstanceBillResponseData data;

    public static QueryInstanceBillResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceBillResponse self = new QueryInstanceBillResponse();
        return TeaModel.build(map, self);
    }

    public QueryInstanceBillResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryInstanceBillResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryInstanceBillResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryInstanceBillResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryInstanceBillResponse setData(QueryInstanceBillResponseData data) {
        this.data = data;
        return this;
    }
    public QueryInstanceBillResponseData getData() {
        return this.data;
    }

    public static class QueryInstanceBillResponseDataItemsItem extends TeaModel {
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

        @NameInMap("ServicePeriodUnit")
        @Validation(required = true)
        public String servicePeriodUnit;

        @NameInMap("PipCode")
        @Validation(required = true)
        public String pipCode;

        @NameInMap("CommodityCode")
        @Validation(required = true)
        public String commodityCode;

        public static QueryInstanceBillResponseDataItemsItem build(java.util.Map<String, ?> map) throws Exception {
            QueryInstanceBillResponseDataItemsItem self = new QueryInstanceBillResponseDataItemsItem();
            return TeaModel.build(map, self);
        }

        public QueryInstanceBillResponseDataItemsItem setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public QueryInstanceBillResponseDataItemsItem setBillingType(String billingType) {
            this.billingType = billingType;
            return this;
        }
        public String getBillingType() {
            return this.billingType;
        }

        public QueryInstanceBillResponseDataItemsItem setCostUnit(String costUnit) {
            this.costUnit = costUnit;
            return this;
        }
        public String getCostUnit() {
            return this.costUnit;
        }

        public QueryInstanceBillResponseDataItemsItem setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public QueryInstanceBillResponseDataItemsItem setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public QueryInstanceBillResponseDataItemsItem setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public QueryInstanceBillResponseDataItemsItem setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryInstanceBillResponseDataItemsItem setProductDetail(String productDetail) {
            this.productDetail = productDetail;
            return this;
        }
        public String getProductDetail() {
            return this.productDetail;
        }

        public QueryInstanceBillResponseDataItemsItem setOwnerID(String ownerID) {
            this.ownerID = ownerID;
            return this;
        }
        public String getOwnerID() {
            return this.ownerID;
        }

        public QueryInstanceBillResponseDataItemsItem setBillingItem(String billingItem) {
            this.billingItem = billingItem;
            return this;
        }
        public String getBillingItem() {
            return this.billingItem;
        }

        public QueryInstanceBillResponseDataItemsItem setListPrice(String listPrice) {
            this.listPrice = listPrice;
            return this;
        }
        public String getListPrice() {
            return this.listPrice;
        }

        public QueryInstanceBillResponseDataItemsItem setListPriceUnit(String listPriceUnit) {
            this.listPriceUnit = listPriceUnit;
            return this;
        }
        public String getListPriceUnit() {
            return this.listPriceUnit;
        }

        public QueryInstanceBillResponseDataItemsItem setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

        public QueryInstanceBillResponseDataItemsItem setUsageUnit(String usageUnit) {
            this.usageUnit = usageUnit;
            return this;
        }
        public String getUsageUnit() {
            return this.usageUnit;
        }

        public QueryInstanceBillResponseDataItemsItem setDeductedByResourcePackage(String deductedByResourcePackage) {
            this.deductedByResourcePackage = deductedByResourcePackage;
            return this;
        }
        public String getDeductedByResourcePackage() {
            return this.deductedByResourcePackage;
        }

        public QueryInstanceBillResponseDataItemsItem setPretaxGrossAmount(Float pretaxGrossAmount) {
            this.pretaxGrossAmount = pretaxGrossAmount;
            return this;
        }
        public Float getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        public QueryInstanceBillResponseDataItemsItem setInvoiceDiscount(Float invoiceDiscount) {
            this.invoiceDiscount = invoiceDiscount;
            return this;
        }
        public Float getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        public QueryInstanceBillResponseDataItemsItem setDeductedByCoupons(Float deductedByCoupons) {
            this.deductedByCoupons = deductedByCoupons;
            return this;
        }
        public Float getDeductedByCoupons() {
            return this.deductedByCoupons;
        }

        public QueryInstanceBillResponseDataItemsItem setPretaxAmount(Float pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public Float getPretaxAmount() {
            return this.pretaxAmount;
        }

        public QueryInstanceBillResponseDataItemsItem setDeductedByCashCoupons(Float deductedByCashCoupons) {
            this.deductedByCashCoupons = deductedByCashCoupons;
            return this;
        }
        public Float getDeductedByCashCoupons() {
            return this.deductedByCashCoupons;
        }

        public QueryInstanceBillResponseDataItemsItem setDeductedByPrepaidCard(Float deductedByPrepaidCard) {
            this.deductedByPrepaidCard = deductedByPrepaidCard;
            return this;
        }
        public Float getDeductedByPrepaidCard() {
            return this.deductedByPrepaidCard;
        }

        public QueryInstanceBillResponseDataItemsItem setPaymentAmount(Float paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }
        public Float getPaymentAmount() {
            return this.paymentAmount;
        }

        public QueryInstanceBillResponseDataItemsItem setOutstandingAmount(Float outstandingAmount) {
            this.outstandingAmount = outstandingAmount;
            return this;
        }
        public Float getOutstandingAmount() {
            return this.outstandingAmount;
        }

        public QueryInstanceBillResponseDataItemsItem setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryInstanceBillResponseDataItemsItem setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public QueryInstanceBillResponseDataItemsItem setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public QueryInstanceBillResponseDataItemsItem setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public QueryInstanceBillResponseDataItemsItem setInstanceConfig(String instanceConfig) {
            this.instanceConfig = instanceConfig;
            return this;
        }
        public String getInstanceConfig() {
            return this.instanceConfig;
        }

        public QueryInstanceBillResponseDataItemsItem setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public QueryInstanceBillResponseDataItemsItem setInternetIP(String internetIP) {
            this.internetIP = internetIP;
            return this;
        }
        public String getInternetIP() {
            return this.internetIP;
        }

        public QueryInstanceBillResponseDataItemsItem setIntranetIP(String intranetIP) {
            this.intranetIP = intranetIP;
            return this;
        }
        public String getIntranetIP() {
            return this.intranetIP;
        }

        public QueryInstanceBillResponseDataItemsItem setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryInstanceBillResponseDataItemsItem setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public QueryInstanceBillResponseDataItemsItem setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public QueryInstanceBillResponseDataItemsItem setServicePeriod(String servicePeriod) {
            this.servicePeriod = servicePeriod;
            return this;
        }
        public String getServicePeriod() {
            return this.servicePeriod;
        }

        public QueryInstanceBillResponseDataItemsItem setBillingDate(String billingDate) {
            this.billingDate = billingDate;
            return this;
        }
        public String getBillingDate() {
            return this.billingDate;
        }

        public QueryInstanceBillResponseDataItemsItem setServicePeriodUnit(String servicePeriodUnit) {
            this.servicePeriodUnit = servicePeriodUnit;
            return this;
        }
        public String getServicePeriodUnit() {
            return this.servicePeriodUnit;
        }

        public QueryInstanceBillResponseDataItemsItem setPipCode(String pipCode) {
            this.pipCode = pipCode;
            return this;
        }
        public String getPipCode() {
            return this.pipCode;
        }

        public QueryInstanceBillResponseDataItemsItem setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

    }

    public static class QueryInstanceBillResponseDataItems extends TeaModel {
        @NameInMap("Item")
        @Validation(required = true)
        public java.util.List<QueryInstanceBillResponseDataItemsItem> item;

        public static QueryInstanceBillResponseDataItems build(java.util.Map<String, ?> map) throws Exception {
            QueryInstanceBillResponseDataItems self = new QueryInstanceBillResponseDataItems();
            return TeaModel.build(map, self);
        }

        public QueryInstanceBillResponseDataItems setItem(java.util.List<QueryInstanceBillResponseDataItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<QueryInstanceBillResponseDataItemsItem> getItem() {
            return this.item;
        }

    }

    public static class QueryInstanceBillResponseData extends TeaModel {
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
        public QueryInstanceBillResponseDataItems items;

        public static QueryInstanceBillResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryInstanceBillResponseData self = new QueryInstanceBillResponseData();
            return TeaModel.build(map, self);
        }

        public QueryInstanceBillResponseData setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public QueryInstanceBillResponseData setAccountID(String accountID) {
            this.accountID = accountID;
            return this;
        }
        public String getAccountID() {
            return this.accountID;
        }

        public QueryInstanceBillResponseData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public QueryInstanceBillResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryInstanceBillResponseData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryInstanceBillResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryInstanceBillResponseData setItems(QueryInstanceBillResponseDataItems items) {
            this.items = items;
            return this;
        }
        public QueryInstanceBillResponseDataItems getItems() {
            return this.items;
        }

    }

}
