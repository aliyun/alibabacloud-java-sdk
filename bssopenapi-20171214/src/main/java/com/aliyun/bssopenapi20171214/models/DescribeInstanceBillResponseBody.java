// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeInstanceBillResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeInstanceBillResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeInstanceBillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceBillResponseBody self = new DescribeInstanceBillResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceBillResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeInstanceBillResponseBody setData(DescribeInstanceBillResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeInstanceBillResponseBodyData getData() {
        return this.data;
    }

    public DescribeInstanceBillResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeInstanceBillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceBillResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeInstanceBillResponseBodyDataItems extends TeaModel {
        @NameInMap("AdjustAmount")
        public Float adjustAmount;

        @NameInMap("BillAccountID")
        public String billAccountID;

        @NameInMap("BillAccountName")
        public String billAccountName;

        @NameInMap("BillingDate")
        public String billingDate;

        @NameInMap("BillingItem")
        public String billingItem;

        @NameInMap("BillingItemCode")
        public String billingItemCode;

        @NameInMap("BillingType")
        public String billingType;

        @NameInMap("BizType")
        public String bizType;

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

        @NameInMap("ItemName")
        public String itemName;

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

        public static DescribeInstanceBillResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceBillResponseBodyDataItems self = new DescribeInstanceBillResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceBillResponseBodyDataItems setAdjustAmount(Float adjustAmount) {
            this.adjustAmount = adjustAmount;
            return this;
        }
        public Float getAdjustAmount() {
            return this.adjustAmount;
        }

        public DescribeInstanceBillResponseBodyDataItems setBillAccountID(String billAccountID) {
            this.billAccountID = billAccountID;
            return this;
        }
        public String getBillAccountID() {
            return this.billAccountID;
        }

        public DescribeInstanceBillResponseBodyDataItems setBillAccountName(String billAccountName) {
            this.billAccountName = billAccountName;
            return this;
        }
        public String getBillAccountName() {
            return this.billAccountName;
        }

        public DescribeInstanceBillResponseBodyDataItems setBillingDate(String billingDate) {
            this.billingDate = billingDate;
            return this;
        }
        public String getBillingDate() {
            return this.billingDate;
        }

        public DescribeInstanceBillResponseBodyDataItems setBillingItem(String billingItem) {
            this.billingItem = billingItem;
            return this;
        }
        public String getBillingItem() {
            return this.billingItem;
        }

        public DescribeInstanceBillResponseBodyDataItems setBillingItemCode(String billingItemCode) {
            this.billingItemCode = billingItemCode;
            return this;
        }
        public String getBillingItemCode() {
            return this.billingItemCode;
        }

        public DescribeInstanceBillResponseBodyDataItems setBillingType(String billingType) {
            this.billingType = billingType;
            return this;
        }
        public String getBillingType() {
            return this.billingType;
        }

        public DescribeInstanceBillResponseBodyDataItems setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribeInstanceBillResponseBodyDataItems setCashAmount(Float cashAmount) {
            this.cashAmount = cashAmount;
            return this;
        }
        public Float getCashAmount() {
            return this.cashAmount;
        }

        public DescribeInstanceBillResponseBodyDataItems setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeInstanceBillResponseBodyDataItems setCostUnit(String costUnit) {
            this.costUnit = costUnit;
            return this;
        }
        public String getCostUnit() {
            return this.costUnit;
        }

        public DescribeInstanceBillResponseBodyDataItems setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeInstanceBillResponseBodyDataItems setDeductedByCashCoupons(Float deductedByCashCoupons) {
            this.deductedByCashCoupons = deductedByCashCoupons;
            return this;
        }
        public Float getDeductedByCashCoupons() {
            return this.deductedByCashCoupons;
        }

        public DescribeInstanceBillResponseBodyDataItems setDeductedByCoupons(Float deductedByCoupons) {
            this.deductedByCoupons = deductedByCoupons;
            return this;
        }
        public Float getDeductedByCoupons() {
            return this.deductedByCoupons;
        }

        public DescribeInstanceBillResponseBodyDataItems setDeductedByPrepaidCard(Float deductedByPrepaidCard) {
            this.deductedByPrepaidCard = deductedByPrepaidCard;
            return this;
        }
        public Float getDeductedByPrepaidCard() {
            return this.deductedByPrepaidCard;
        }

        public DescribeInstanceBillResponseBodyDataItems setDeductedByResourcePackage(String deductedByResourcePackage) {
            this.deductedByResourcePackage = deductedByResourcePackage;
            return this;
        }
        public String getDeductedByResourcePackage() {
            return this.deductedByResourcePackage;
        }

        public DescribeInstanceBillResponseBodyDataItems setInstanceConfig(String instanceConfig) {
            this.instanceConfig = instanceConfig;
            return this;
        }
        public String getInstanceConfig() {
            return this.instanceConfig;
        }

        public DescribeInstanceBillResponseBodyDataItems setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeInstanceBillResponseBodyDataItems setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public DescribeInstanceBillResponseBodyDataItems setInternetIP(String internetIP) {
            this.internetIP = internetIP;
            return this;
        }
        public String getInternetIP() {
            return this.internetIP;
        }

        public DescribeInstanceBillResponseBodyDataItems setIntranetIP(String intranetIP) {
            this.intranetIP = intranetIP;
            return this;
        }
        public String getIntranetIP() {
            return this.intranetIP;
        }

        public DescribeInstanceBillResponseBodyDataItems setInvoiceDiscount(Float invoiceDiscount) {
            this.invoiceDiscount = invoiceDiscount;
            return this;
        }
        public Float getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        public DescribeInstanceBillResponseBodyDataItems setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public DescribeInstanceBillResponseBodyDataItems setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public DescribeInstanceBillResponseBodyDataItems setListPrice(String listPrice) {
            this.listPrice = listPrice;
            return this;
        }
        public String getListPrice() {
            return this.listPrice;
        }

        public DescribeInstanceBillResponseBodyDataItems setListPriceUnit(String listPriceUnit) {
            this.listPriceUnit = listPriceUnit;
            return this;
        }
        public String getListPriceUnit() {
            return this.listPriceUnit;
        }

        public DescribeInstanceBillResponseBodyDataItems setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public DescribeInstanceBillResponseBodyDataItems setOutstandingAmount(Float outstandingAmount) {
            this.outstandingAmount = outstandingAmount;
            return this;
        }
        public Float getOutstandingAmount() {
            return this.outstandingAmount;
        }

        public DescribeInstanceBillResponseBodyDataItems setOwnerID(String ownerID) {
            this.ownerID = ownerID;
            return this;
        }
        public String getOwnerID() {
            return this.ownerID;
        }

        public DescribeInstanceBillResponseBodyDataItems setPaymentAmount(Float paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }
        public Float getPaymentAmount() {
            return this.paymentAmount;
        }

        public DescribeInstanceBillResponseBodyDataItems setPipCode(String pipCode) {
            this.pipCode = pipCode;
            return this;
        }
        public String getPipCode() {
            return this.pipCode;
        }

        public DescribeInstanceBillResponseBodyDataItems setPretaxAmount(Float pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public Float getPretaxAmount() {
            return this.pretaxAmount;
        }

        public DescribeInstanceBillResponseBodyDataItems setPretaxGrossAmount(Float pretaxGrossAmount) {
            this.pretaxGrossAmount = pretaxGrossAmount;
            return this;
        }
        public Float getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        public DescribeInstanceBillResponseBodyDataItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeInstanceBillResponseBodyDataItems setProductDetail(String productDetail) {
            this.productDetail = productDetail;
            return this;
        }
        public String getProductDetail() {
            return this.productDetail;
        }

        public DescribeInstanceBillResponseBodyDataItems setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public DescribeInstanceBillResponseBodyDataItems setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public DescribeInstanceBillResponseBodyDataItems setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeInstanceBillResponseBodyDataItems setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public DescribeInstanceBillResponseBodyDataItems setServicePeriod(String servicePeriod) {
            this.servicePeriod = servicePeriod;
            return this;
        }
        public String getServicePeriod() {
            return this.servicePeriod;
        }

        public DescribeInstanceBillResponseBodyDataItems setServicePeriodUnit(String servicePeriodUnit) {
            this.servicePeriodUnit = servicePeriodUnit;
            return this;
        }
        public String getServicePeriodUnit() {
            return this.servicePeriodUnit;
        }

        public DescribeInstanceBillResponseBodyDataItems setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public DescribeInstanceBillResponseBodyDataItems setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeInstanceBillResponseBodyDataItems setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

        public DescribeInstanceBillResponseBodyDataItems setUsageUnit(String usageUnit) {
            this.usageUnit = usageUnit;
            return this;
        }
        public String getUsageUnit() {
            return this.usageUnit;
        }

        public DescribeInstanceBillResponseBodyDataItems setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

    public static class DescribeInstanceBillResponseBodyData extends TeaModel {
        @NameInMap("AccountID")
        public String accountID;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("BillingCycle")
        public String billingCycle;

        @NameInMap("Items")
        public java.util.List<DescribeInstanceBillResponseBodyDataItems> items;

        @NameInMap("MaxResults")
        public Integer maxResults;

        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeInstanceBillResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceBillResponseBodyData self = new DescribeInstanceBillResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceBillResponseBodyData setAccountID(String accountID) {
            this.accountID = accountID;
            return this;
        }
        public String getAccountID() {
            return this.accountID;
        }

        public DescribeInstanceBillResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeInstanceBillResponseBodyData setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public DescribeInstanceBillResponseBodyData setItems(java.util.List<DescribeInstanceBillResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeInstanceBillResponseBodyDataItems> getItems() {
            return this.items;
        }

        public DescribeInstanceBillResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public DescribeInstanceBillResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public DescribeInstanceBillResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
