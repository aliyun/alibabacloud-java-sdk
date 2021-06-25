// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeSplitItemBillResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public DescribeSplitItemBillResponseBodyData data;

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

    public DescribeSplitItemBillResponseBody setData(DescribeSplitItemBillResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSplitItemBillResponseBodyData getData() {
        return this.data;
    }

    public static class DescribeSplitItemBillResponseBodyDataItems extends TeaModel {
        @NameInMap("SplitAccountID")
        public String splitAccountID;

        @NameInMap("BillAccountName")
        public String billAccountName;

        @NameInMap("SubscriptionType")
        public String subscriptionType;

        @NameInMap("InstanceSpec")
        public String instanceSpec;

        @NameInMap("DeductedByCoupons")
        public Float deductedByCoupons;

        @NameInMap("Region")
        public String region;

        @NameInMap("OutstandingAmount")
        public Float outstandingAmount;

        @NameInMap("PipCode")
        public String pipCode;

        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("ProductDetail")
        public String productDetail;

        @NameInMap("Usage")
        public String usage;

        @NameInMap("IntranetIP")
        public String intranetIP;

        @NameInMap("UsageUnit")
        public String usageUnit;

        @NameInMap("SplitCommodityCode")
        public String splitCommodityCode;

        @NameInMap("BillAccountID")
        public String billAccountID;

        @NameInMap("ProductType")
        public String productType;

        @NameInMap("DeductedByResourcePackage")
        public String deductedByResourcePackage;

        @NameInMap("PaymentAmount")
        public Float paymentAmount;

        @NameInMap("SplitBillingCycle")
        public String splitBillingCycle;

        @NameInMap("ServicePeriod")
        public String servicePeriod;

        @NameInMap("SplitItemName")
        public String splitItemName;

        @NameInMap("ListPrice")
        public String listPrice;

        @NameInMap("Zone")
        public String zone;

        @NameInMap("PretaxGrossAmount")
        public Float pretaxGrossAmount;

        @NameInMap("InstanceConfig")
        public String instanceConfig;

        @NameInMap("BillingDate")
        public String billingDate;

        @NameInMap("InternetIP")
        public String internetIP;

        @NameInMap("Item")
        public String item;

        @NameInMap("SplitItemID")
        public String splitItemID;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("DeductedByCashCoupons")
        public Float deductedByCashCoupons;

        @NameInMap("BizType")
        public String bizType;

        @NameInMap("BillingItem")
        public String billingItem;

        @NameInMap("CostUnit")
        public String costUnit;

        @NameInMap("ListPriceUnit")
        public String listPriceUnit;

        @NameInMap("ResourceGroup")
        public String resourceGroup;

        @NameInMap("PretaxAmount")
        public Float pretaxAmount;

        @NameInMap("ServicePeriodUnit")
        public String servicePeriodUnit;

        @NameInMap("SplitBillingDate")
        public String splitBillingDate;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("SplitProductDetail")
        public String splitProductDetail;

        @NameInMap("OwnerID")
        public String ownerID;

        @NameInMap("DeductedByPrepaidCard")
        public Float deductedByPrepaidCard;

        @NameInMap("InvoiceDiscount")
        public Float invoiceDiscount;

        @NameInMap("SplitAccountName")
        public String splitAccountName;

        @NameInMap("BillingType")
        public String billingType;

        @NameInMap("ProductCode")
        public String productCode;

        public static DescribeSplitItemBillResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSplitItemBillResponseBodyDataItems self = new DescribeSplitItemBillResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public DescribeSplitItemBillResponseBodyDataItems setSplitAccountID(String splitAccountID) {
            this.splitAccountID = splitAccountID;
            return this;
        }
        public String getSplitAccountID() {
            return this.splitAccountID;
        }

        public DescribeSplitItemBillResponseBodyDataItems setBillAccountName(String billAccountName) {
            this.billAccountName = billAccountName;
            return this;
        }
        public String getBillAccountName() {
            return this.billAccountName;
        }

        public DescribeSplitItemBillResponseBodyDataItems setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public DescribeSplitItemBillResponseBodyDataItems setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public DescribeSplitItemBillResponseBodyDataItems setDeductedByCoupons(Float deductedByCoupons) {
            this.deductedByCoupons = deductedByCoupons;
            return this;
        }
        public Float getDeductedByCoupons() {
            return this.deductedByCoupons;
        }

        public DescribeSplitItemBillResponseBodyDataItems setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeSplitItemBillResponseBodyDataItems setOutstandingAmount(Float outstandingAmount) {
            this.outstandingAmount = outstandingAmount;
            return this;
        }
        public Float getOutstandingAmount() {
            return this.outstandingAmount;
        }

        public DescribeSplitItemBillResponseBodyDataItems setPipCode(String pipCode) {
            this.pipCode = pipCode;
            return this;
        }
        public String getPipCode() {
            return this.pipCode;
        }

        public DescribeSplitItemBillResponseBodyDataItems setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeSplitItemBillResponseBodyDataItems setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public DescribeSplitItemBillResponseBodyDataItems setProductDetail(String productDetail) {
            this.productDetail = productDetail;
            return this;
        }
        public String getProductDetail() {
            return this.productDetail;
        }

        public DescribeSplitItemBillResponseBodyDataItems setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

        public DescribeSplitItemBillResponseBodyDataItems setIntranetIP(String intranetIP) {
            this.intranetIP = intranetIP;
            return this;
        }
        public String getIntranetIP() {
            return this.intranetIP;
        }

        public DescribeSplitItemBillResponseBodyDataItems setUsageUnit(String usageUnit) {
            this.usageUnit = usageUnit;
            return this;
        }
        public String getUsageUnit() {
            return this.usageUnit;
        }

        public DescribeSplitItemBillResponseBodyDataItems setSplitCommodityCode(String splitCommodityCode) {
            this.splitCommodityCode = splitCommodityCode;
            return this;
        }
        public String getSplitCommodityCode() {
            return this.splitCommodityCode;
        }

        public DescribeSplitItemBillResponseBodyDataItems setBillAccountID(String billAccountID) {
            this.billAccountID = billAccountID;
            return this;
        }
        public String getBillAccountID() {
            return this.billAccountID;
        }

        public DescribeSplitItemBillResponseBodyDataItems setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public DescribeSplitItemBillResponseBodyDataItems setDeductedByResourcePackage(String deductedByResourcePackage) {
            this.deductedByResourcePackage = deductedByResourcePackage;
            return this;
        }
        public String getDeductedByResourcePackage() {
            return this.deductedByResourcePackage;
        }

        public DescribeSplitItemBillResponseBodyDataItems setPaymentAmount(Float paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }
        public Float getPaymentAmount() {
            return this.paymentAmount;
        }

        public DescribeSplitItemBillResponseBodyDataItems setSplitBillingCycle(String splitBillingCycle) {
            this.splitBillingCycle = splitBillingCycle;
            return this;
        }
        public String getSplitBillingCycle() {
            return this.splitBillingCycle;
        }

        public DescribeSplitItemBillResponseBodyDataItems setServicePeriod(String servicePeriod) {
            this.servicePeriod = servicePeriod;
            return this;
        }
        public String getServicePeriod() {
            return this.servicePeriod;
        }

        public DescribeSplitItemBillResponseBodyDataItems setSplitItemName(String splitItemName) {
            this.splitItemName = splitItemName;
            return this;
        }
        public String getSplitItemName() {
            return this.splitItemName;
        }

        public DescribeSplitItemBillResponseBodyDataItems setListPrice(String listPrice) {
            this.listPrice = listPrice;
            return this;
        }
        public String getListPrice() {
            return this.listPrice;
        }

        public DescribeSplitItemBillResponseBodyDataItems setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public DescribeSplitItemBillResponseBodyDataItems setPretaxGrossAmount(Float pretaxGrossAmount) {
            this.pretaxGrossAmount = pretaxGrossAmount;
            return this;
        }
        public Float getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        public DescribeSplitItemBillResponseBodyDataItems setInstanceConfig(String instanceConfig) {
            this.instanceConfig = instanceConfig;
            return this;
        }
        public String getInstanceConfig() {
            return this.instanceConfig;
        }

        public DescribeSplitItemBillResponseBodyDataItems setBillingDate(String billingDate) {
            this.billingDate = billingDate;
            return this;
        }
        public String getBillingDate() {
            return this.billingDate;
        }

        public DescribeSplitItemBillResponseBodyDataItems setInternetIP(String internetIP) {
            this.internetIP = internetIP;
            return this;
        }
        public String getInternetIP() {
            return this.internetIP;
        }

        public DescribeSplitItemBillResponseBodyDataItems setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public DescribeSplitItemBillResponseBodyDataItems setSplitItemID(String splitItemID) {
            this.splitItemID = splitItemID;
            return this;
        }
        public String getSplitItemID() {
            return this.splitItemID;
        }

        public DescribeSplitItemBillResponseBodyDataItems setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeSplitItemBillResponseBodyDataItems setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
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

        public DescribeSplitItemBillResponseBodyDataItems setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribeSplitItemBillResponseBodyDataItems setBillingItem(String billingItem) {
            this.billingItem = billingItem;
            return this;
        }
        public String getBillingItem() {
            return this.billingItem;
        }

        public DescribeSplitItemBillResponseBodyDataItems setCostUnit(String costUnit) {
            this.costUnit = costUnit;
            return this;
        }
        public String getCostUnit() {
            return this.costUnit;
        }

        public DescribeSplitItemBillResponseBodyDataItems setListPriceUnit(String listPriceUnit) {
            this.listPriceUnit = listPriceUnit;
            return this;
        }
        public String getListPriceUnit() {
            return this.listPriceUnit;
        }

        public DescribeSplitItemBillResponseBodyDataItems setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public DescribeSplitItemBillResponseBodyDataItems setPretaxAmount(Float pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public Float getPretaxAmount() {
            return this.pretaxAmount;
        }

        public DescribeSplitItemBillResponseBodyDataItems setServicePeriodUnit(String servicePeriodUnit) {
            this.servicePeriodUnit = servicePeriodUnit;
            return this;
        }
        public String getServicePeriodUnit() {
            return this.servicePeriodUnit;
        }

        public DescribeSplitItemBillResponseBodyDataItems setSplitBillingDate(String splitBillingDate) {
            this.splitBillingDate = splitBillingDate;
            return this;
        }
        public String getSplitBillingDate() {
            return this.splitBillingDate;
        }

        public DescribeSplitItemBillResponseBodyDataItems setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public DescribeSplitItemBillResponseBodyDataItems setSplitProductDetail(String splitProductDetail) {
            this.splitProductDetail = splitProductDetail;
            return this;
        }
        public String getSplitProductDetail() {
            return this.splitProductDetail;
        }

        public DescribeSplitItemBillResponseBodyDataItems setOwnerID(String ownerID) {
            this.ownerID = ownerID;
            return this;
        }
        public String getOwnerID() {
            return this.ownerID;
        }

        public DescribeSplitItemBillResponseBodyDataItems setDeductedByPrepaidCard(Float deductedByPrepaidCard) {
            this.deductedByPrepaidCard = deductedByPrepaidCard;
            return this;
        }
        public Float getDeductedByPrepaidCard() {
            return this.deductedByPrepaidCard;
        }

        public DescribeSplitItemBillResponseBodyDataItems setInvoiceDiscount(Float invoiceDiscount) {
            this.invoiceDiscount = invoiceDiscount;
            return this;
        }
        public Float getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        public DescribeSplitItemBillResponseBodyDataItems setSplitAccountName(String splitAccountName) {
            this.splitAccountName = splitAccountName;
            return this;
        }
        public String getSplitAccountName() {
            return this.splitAccountName;
        }

        public DescribeSplitItemBillResponseBodyDataItems setBillingType(String billingType) {
            this.billingType = billingType;
            return this;
        }
        public String getBillingType() {
            return this.billingType;
        }

        public DescribeSplitItemBillResponseBodyDataItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

    public static class DescribeSplitItemBillResponseBodyData extends TeaModel {
        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("BillingCycle")
        public String billingCycle;

        @NameInMap("MaxResults")
        public Integer maxResults;

        @NameInMap("AccountID")
        public String accountID;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("Items")
        public java.util.List<DescribeSplitItemBillResponseBodyDataItems> items;

        public static DescribeSplitItemBillResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSplitItemBillResponseBodyData self = new DescribeSplitItemBillResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSplitItemBillResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public DescribeSplitItemBillResponseBodyData setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public DescribeSplitItemBillResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public DescribeSplitItemBillResponseBodyData setAccountID(String accountID) {
            this.accountID = accountID;
            return this;
        }
        public String getAccountID() {
            return this.accountID;
        }

        public DescribeSplitItemBillResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeSplitItemBillResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeSplitItemBillResponseBodyData setItems(java.util.List<DescribeSplitItemBillResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeSplitItemBillResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
