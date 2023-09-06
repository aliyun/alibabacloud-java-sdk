// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBody self = new DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBody setData(DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyData getData() {
        return this.data;
    }

    public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems extends TeaModel {
        @NameInMap("AmortizationPeriod")
        public String amortizationPeriod;

        @NameInMap("AmortizationPeriodDay")
        public String amortizationPeriodDay;

        @NameInMap("AmortizationStatus")
        public String amortizationStatus;

        @NameInMap("BillAccountID")
        public Long billAccountID;

        @NameInMap("BillAccountName")
        public String billAccountName;

        @NameInMap("BillOwnerID")
        public Long billOwnerID;

        @NameInMap("BillOwnerName")
        public String billOwnerName;

        @NameInMap("BizType")
        public String bizType;

        @NameInMap("ConsumePeriod")
        public String consumePeriod;

        @NameInMap("CostUnit")
        public String costUnit;

        @NameInMap("CostUnitCode")
        public String costUnitCode;

        @NameInMap("CurrentAmortizationDeductedByCoupons")
        public Double currentAmortizationDeductedByCoupons;

        @NameInMap("CurrentAmortizationInvoiceDiscount")
        public Double currentAmortizationInvoiceDiscount;

        @NameInMap("CurrentAmortizationPretaxAmount")
        public Double currentAmortizationPretaxAmount;

        @NameInMap("CurrentAmortizationPretaxGrossAmount")
        public Double currentAmortizationPretaxGrossAmount;

        @NameInMap("CurrentAmortizationRoundDownDiscount")
        public Double currentAmortizationRoundDownDiscount;

        @NameInMap("DeductedByCoupons")
        public Double deductedByCoupons;

        @NameInMap("InstanceConfig")
        public String instanceConfig;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("InternetIP")
        public String internetIP;

        @NameInMap("IntranetIP")
        public String intranetIP;

        @NameInMap("InvoiceDiscount")
        public Double invoiceDiscount;

        @NameInMap("PretaxAmount")
        public Double pretaxAmount;

        @NameInMap("PretaxGrossAmount")
        public Double pretaxGrossAmount;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductDetail")
        public String productDetail;

        @NameInMap("ProductDetailCode")
        public String productDetailCode;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("ReferFrInstanceID")
        public String referFrInstanceID;

        @NameInMap("ReferFrOwnerID")
        public String referFrOwnerID;

        @NameInMap("ReferFrProductDetailCode")
        public String referFrProductDetailCode;

        @NameInMap("Region")
        public String region;

        @NameInMap("ResourceGroup")
        public String resourceGroup;

        @NameInMap("RoundDownDiscount")
        public Double roundDownDiscount;

        @NameInMap("SplitAccountName")
        public String splitAccountName;

        @NameInMap("SplitItemID")
        public String splitItemID;

        @NameInMap("SplitItemName")
        public String splitItemName;

        @NameInMap("SplitProductDetail")
        public String splitProductDetail;

        @NameInMap("SubscriptionType")
        public String subscriptionType;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("UnusedAmortizationDeductedByCoupons")
        public Double unusedAmortizationDeductedByCoupons;

        @NameInMap("UnusedAmortizationInvoiceDiscount")
        public Double unusedAmortizationInvoiceDiscount;

        @NameInMap("UnusedAmortizationPretaxAmount")
        public Double unusedAmortizationPretaxAmount;

        @NameInMap("UnusedAmortizationPretaxGrossAmount")
        public Double unusedAmortizationPretaxGrossAmount;

        @NameInMap("UnusedAmortizationRoundDownDiscount")
        public Double unusedAmortizationRoundDownDiscount;

        @NameInMap("Zone")
        public String zone;

        public static DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems self = new DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setAmortizationPeriod(String amortizationPeriod) {
            this.amortizationPeriod = amortizationPeriod;
            return this;
        }
        public String getAmortizationPeriod() {
            return this.amortizationPeriod;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setAmortizationPeriodDay(String amortizationPeriodDay) {
            this.amortizationPeriodDay = amortizationPeriodDay;
            return this;
        }
        public String getAmortizationPeriodDay() {
            return this.amortizationPeriodDay;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setAmortizationStatus(String amortizationStatus) {
            this.amortizationStatus = amortizationStatus;
            return this;
        }
        public String getAmortizationStatus() {
            return this.amortizationStatus;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setBillAccountID(Long billAccountID) {
            this.billAccountID = billAccountID;
            return this;
        }
        public Long getBillAccountID() {
            return this.billAccountID;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setBillAccountName(String billAccountName) {
            this.billAccountName = billAccountName;
            return this;
        }
        public String getBillAccountName() {
            return this.billAccountName;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setBillOwnerID(Long billOwnerID) {
            this.billOwnerID = billOwnerID;
            return this;
        }
        public Long getBillOwnerID() {
            return this.billOwnerID;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setBillOwnerName(String billOwnerName) {
            this.billOwnerName = billOwnerName;
            return this;
        }
        public String getBillOwnerName() {
            return this.billOwnerName;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setConsumePeriod(String consumePeriod) {
            this.consumePeriod = consumePeriod;
            return this;
        }
        public String getConsumePeriod() {
            return this.consumePeriod;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setCostUnit(String costUnit) {
            this.costUnit = costUnit;
            return this;
        }
        public String getCostUnit() {
            return this.costUnit;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setCostUnitCode(String costUnitCode) {
            this.costUnitCode = costUnitCode;
            return this;
        }
        public String getCostUnitCode() {
            return this.costUnitCode;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setCurrentAmortizationDeductedByCoupons(Double currentAmortizationDeductedByCoupons) {
            this.currentAmortizationDeductedByCoupons = currentAmortizationDeductedByCoupons;
            return this;
        }
        public Double getCurrentAmortizationDeductedByCoupons() {
            return this.currentAmortizationDeductedByCoupons;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setCurrentAmortizationInvoiceDiscount(Double currentAmortizationInvoiceDiscount) {
            this.currentAmortizationInvoiceDiscount = currentAmortizationInvoiceDiscount;
            return this;
        }
        public Double getCurrentAmortizationInvoiceDiscount() {
            return this.currentAmortizationInvoiceDiscount;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setCurrentAmortizationPretaxAmount(Double currentAmortizationPretaxAmount) {
            this.currentAmortizationPretaxAmount = currentAmortizationPretaxAmount;
            return this;
        }
        public Double getCurrentAmortizationPretaxAmount() {
            return this.currentAmortizationPretaxAmount;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setCurrentAmortizationPretaxGrossAmount(Double currentAmortizationPretaxGrossAmount) {
            this.currentAmortizationPretaxGrossAmount = currentAmortizationPretaxGrossAmount;
            return this;
        }
        public Double getCurrentAmortizationPretaxGrossAmount() {
            return this.currentAmortizationPretaxGrossAmount;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setCurrentAmortizationRoundDownDiscount(Double currentAmortizationRoundDownDiscount) {
            this.currentAmortizationRoundDownDiscount = currentAmortizationRoundDownDiscount;
            return this;
        }
        public Double getCurrentAmortizationRoundDownDiscount() {
            return this.currentAmortizationRoundDownDiscount;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setDeductedByCoupons(Double deductedByCoupons) {
            this.deductedByCoupons = deductedByCoupons;
            return this;
        }
        public Double getDeductedByCoupons() {
            return this.deductedByCoupons;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setInstanceConfig(String instanceConfig) {
            this.instanceConfig = instanceConfig;
            return this;
        }
        public String getInstanceConfig() {
            return this.instanceConfig;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setInternetIP(String internetIP) {
            this.internetIP = internetIP;
            return this;
        }
        public String getInternetIP() {
            return this.internetIP;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setIntranetIP(String intranetIP) {
            this.intranetIP = intranetIP;
            return this;
        }
        public String getIntranetIP() {
            return this.intranetIP;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setInvoiceDiscount(Double invoiceDiscount) {
            this.invoiceDiscount = invoiceDiscount;
            return this;
        }
        public Double getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setPretaxAmount(Double pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public Double getPretaxAmount() {
            return this.pretaxAmount;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setPretaxGrossAmount(Double pretaxGrossAmount) {
            this.pretaxGrossAmount = pretaxGrossAmount;
            return this;
        }
        public Double getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setProductDetail(String productDetail) {
            this.productDetail = productDetail;
            return this;
        }
        public String getProductDetail() {
            return this.productDetail;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setProductDetailCode(String productDetailCode) {
            this.productDetailCode = productDetailCode;
            return this;
        }
        public String getProductDetailCode() {
            return this.productDetailCode;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setReferFrInstanceID(String referFrInstanceID) {
            this.referFrInstanceID = referFrInstanceID;
            return this;
        }
        public String getReferFrInstanceID() {
            return this.referFrInstanceID;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setReferFrOwnerID(String referFrOwnerID) {
            this.referFrOwnerID = referFrOwnerID;
            return this;
        }
        public String getReferFrOwnerID() {
            return this.referFrOwnerID;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setReferFrProductDetailCode(String referFrProductDetailCode) {
            this.referFrProductDetailCode = referFrProductDetailCode;
            return this;
        }
        public String getReferFrProductDetailCode() {
            return this.referFrProductDetailCode;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setRoundDownDiscount(Double roundDownDiscount) {
            this.roundDownDiscount = roundDownDiscount;
            return this;
        }
        public Double getRoundDownDiscount() {
            return this.roundDownDiscount;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setSplitAccountName(String splitAccountName) {
            this.splitAccountName = splitAccountName;
            return this;
        }
        public String getSplitAccountName() {
            return this.splitAccountName;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setSplitItemID(String splitItemID) {
            this.splitItemID = splitItemID;
            return this;
        }
        public String getSplitItemID() {
            return this.splitItemID;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setSplitItemName(String splitItemName) {
            this.splitItemName = splitItemName;
            return this;
        }
        public String getSplitItemName() {
            return this.splitItemName;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setSplitProductDetail(String splitProductDetail) {
            this.splitProductDetail = splitProductDetail;
            return this;
        }
        public String getSplitProductDetail() {
            return this.splitProductDetail;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setUnusedAmortizationDeductedByCoupons(Double unusedAmortizationDeductedByCoupons) {
            this.unusedAmortizationDeductedByCoupons = unusedAmortizationDeductedByCoupons;
            return this;
        }
        public Double getUnusedAmortizationDeductedByCoupons() {
            return this.unusedAmortizationDeductedByCoupons;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setUnusedAmortizationInvoiceDiscount(Double unusedAmortizationInvoiceDiscount) {
            this.unusedAmortizationInvoiceDiscount = unusedAmortizationInvoiceDiscount;
            return this;
        }
        public Double getUnusedAmortizationInvoiceDiscount() {
            return this.unusedAmortizationInvoiceDiscount;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setUnusedAmortizationPretaxAmount(Double unusedAmortizationPretaxAmount) {
            this.unusedAmortizationPretaxAmount = unusedAmortizationPretaxAmount;
            return this;
        }
        public Double getUnusedAmortizationPretaxAmount() {
            return this.unusedAmortizationPretaxAmount;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setUnusedAmortizationPretaxGrossAmount(Double unusedAmortizationPretaxGrossAmount) {
            this.unusedAmortizationPretaxGrossAmount = unusedAmortizationPretaxGrossAmount;
            return this;
        }
        public Double getUnusedAmortizationPretaxGrossAmount() {
            return this.unusedAmortizationPretaxGrossAmount;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setUnusedAmortizationRoundDownDiscount(Double unusedAmortizationRoundDownDiscount) {
            this.unusedAmortizationRoundDownDiscount = unusedAmortizationRoundDownDiscount;
            return this;
        }
        public Double getUnusedAmortizationRoundDownDiscount() {
            return this.unusedAmortizationRoundDownDiscount;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

    public static class DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyData extends TeaModel {
        @NameInMap("AccountID")
        public String accountID;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("Items")
        public java.util.List<DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems> items;

        @NameInMap("MaxResults")
        public Integer maxResults;

        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyData self = new DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyData setAccountID(String accountID) {
            this.accountID = accountID;
            return this;
        }
        public String getAccountID() {
            return this.accountID;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyData setItems(java.util.List<DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyDataItems> getItems() {
            return this.items;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
