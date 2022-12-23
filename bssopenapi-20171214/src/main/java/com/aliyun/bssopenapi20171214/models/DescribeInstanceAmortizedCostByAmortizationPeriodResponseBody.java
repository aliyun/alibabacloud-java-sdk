// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeInstanceAmortizedCostByAmortizationPeriodResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeInstanceAmortizedCostByAmortizationPeriodResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAmortizedCostByAmortizationPeriodResponseBody self = new DescribeInstanceAmortizedCostByAmortizationPeriodResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBody setData(DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyData getData() {
        return this.data;
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems extends TeaModel {
        @NameInMap("AmortizationPeriod")
        public String amortizationPeriod;

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

        @NameInMap("CurrentAmortizationDeductedByCashCoupons")
        public Double currentAmortizationDeductedByCashCoupons;

        @NameInMap("CurrentAmortizationDeductedByCoupons")
        public Double currentAmortizationDeductedByCoupons;

        @NameInMap("CurrentAmortizationDeductedByPrepaidCard")
        public Double currentAmortizationDeductedByPrepaidCard;

        @NameInMap("CurrentAmortizationExpenditureAmount")
        public Double currentAmortizationExpenditureAmount;

        @NameInMap("CurrentAmortizationInvoiceDiscount")
        public Double currentAmortizationInvoiceDiscount;

        @NameInMap("CurrentAmortizationPretaxAmount")
        public Double currentAmortizationPretaxAmount;

        @NameInMap("CurrentAmortizationPretaxGrossAmount")
        public Double currentAmortizationPretaxGrossAmount;

        @NameInMap("CurrentAmortizationRoundDownDiscount")
        public Double currentAmortizationRoundDownDiscount;

        @NameInMap("DeductedByCashCoupons")
        public Double deductedByCashCoupons;

        @NameInMap("DeductedByCoupons")
        public Double deductedByCoupons;

        @NameInMap("DeductedByPrepaidCard")
        public Double deductedByPrepaidCard;

        @NameInMap("ExpenditureAmount")
        public Double expenditureAmount;

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

        @NameInMap("PreviouslyAmortizedDeductedByCashCoupons")
        public Double previouslyAmortizedDeductedByCashCoupons;

        @NameInMap("PreviouslyAmortizedDeductedByCoupons")
        public Double previouslyAmortizedDeductedByCoupons;

        @NameInMap("PreviouslyAmortizedDeductedByPrepaidCard")
        public Double previouslyAmortizedDeductedByPrepaidCard;

        @NameInMap("PreviouslyAmortizedExpenditureAmount")
        public Double previouslyAmortizedExpenditureAmount;

        @NameInMap("PreviouslyAmortizedInvoiceDiscount")
        public Double previouslyAmortizedInvoiceDiscount;

        @NameInMap("PreviouslyAmortizedPretaxAmount")
        public Double previouslyAmortizedPretaxAmount;

        @NameInMap("PreviouslyAmortizedPretaxGrossAmount")
        public Double previouslyAmortizedPretaxGrossAmount;

        @NameInMap("PreviouslyAmortizedRoundDownDiscount")
        public Double previouslyAmortizedRoundDownDiscount;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductDetail")
        public String productDetail;

        @NameInMap("ProductDetailCode")
        public String productDetailCode;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("Region")
        public String region;

        @NameInMap("RemainingAmortizationDeductedByCashCoupons")
        public Double remainingAmortizationDeductedByCashCoupons;

        @NameInMap("RemainingAmortizationDeductedByCoupons")
        public Double remainingAmortizationDeductedByCoupons;

        @NameInMap("RemainingAmortizationDeductedByPrepaidCard")
        public Double remainingAmortizationDeductedByPrepaidCard;

        @NameInMap("RemainingAmortizationExpenditureAmount")
        public Double remainingAmortizationExpenditureAmount;

        @NameInMap("RemainingAmortizationInvoiceDiscount")
        public Double remainingAmortizationInvoiceDiscount;

        @NameInMap("RemainingAmortizationPretaxAmount")
        public Double remainingAmortizationPretaxAmount;

        @NameInMap("RemainingAmortizationPretaxGrossAmount")
        public Double remainingAmortizationPretaxGrossAmount;

        @NameInMap("RemainingAmortizationRoundDownDiscount")
        public Double remainingAmortizationRoundDownDiscount;

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

        @NameInMap("Zone")
        public String zone;

        public static DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems self = new DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setAmortizationPeriod(String amortizationPeriod) {
            this.amortizationPeriod = amortizationPeriod;
            return this;
        }
        public String getAmortizationPeriod() {
            return this.amortizationPeriod;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setAmortizationStatus(String amortizationStatus) {
            this.amortizationStatus = amortizationStatus;
            return this;
        }
        public String getAmortizationStatus() {
            return this.amortizationStatus;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setBillAccountID(Long billAccountID) {
            this.billAccountID = billAccountID;
            return this;
        }
        public Long getBillAccountID() {
            return this.billAccountID;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setBillAccountName(String billAccountName) {
            this.billAccountName = billAccountName;
            return this;
        }
        public String getBillAccountName() {
            return this.billAccountName;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setBillOwnerID(Long billOwnerID) {
            this.billOwnerID = billOwnerID;
            return this;
        }
        public Long getBillOwnerID() {
            return this.billOwnerID;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setBillOwnerName(String billOwnerName) {
            this.billOwnerName = billOwnerName;
            return this;
        }
        public String getBillOwnerName() {
            return this.billOwnerName;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setConsumePeriod(String consumePeriod) {
            this.consumePeriod = consumePeriod;
            return this;
        }
        public String getConsumePeriod() {
            return this.consumePeriod;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setCostUnit(String costUnit) {
            this.costUnit = costUnit;
            return this;
        }
        public String getCostUnit() {
            return this.costUnit;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setCostUnitCode(String costUnitCode) {
            this.costUnitCode = costUnitCode;
            return this;
        }
        public String getCostUnitCode() {
            return this.costUnitCode;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setCurrentAmortizationDeductedByCashCoupons(Double currentAmortizationDeductedByCashCoupons) {
            this.currentAmortizationDeductedByCashCoupons = currentAmortizationDeductedByCashCoupons;
            return this;
        }
        public Double getCurrentAmortizationDeductedByCashCoupons() {
            return this.currentAmortizationDeductedByCashCoupons;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setCurrentAmortizationDeductedByCoupons(Double currentAmortizationDeductedByCoupons) {
            this.currentAmortizationDeductedByCoupons = currentAmortizationDeductedByCoupons;
            return this;
        }
        public Double getCurrentAmortizationDeductedByCoupons() {
            return this.currentAmortizationDeductedByCoupons;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setCurrentAmortizationDeductedByPrepaidCard(Double currentAmortizationDeductedByPrepaidCard) {
            this.currentAmortizationDeductedByPrepaidCard = currentAmortizationDeductedByPrepaidCard;
            return this;
        }
        public Double getCurrentAmortizationDeductedByPrepaidCard() {
            return this.currentAmortizationDeductedByPrepaidCard;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setCurrentAmortizationExpenditureAmount(Double currentAmortizationExpenditureAmount) {
            this.currentAmortizationExpenditureAmount = currentAmortizationExpenditureAmount;
            return this;
        }
        public Double getCurrentAmortizationExpenditureAmount() {
            return this.currentAmortizationExpenditureAmount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setCurrentAmortizationInvoiceDiscount(Double currentAmortizationInvoiceDiscount) {
            this.currentAmortizationInvoiceDiscount = currentAmortizationInvoiceDiscount;
            return this;
        }
        public Double getCurrentAmortizationInvoiceDiscount() {
            return this.currentAmortizationInvoiceDiscount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setCurrentAmortizationPretaxAmount(Double currentAmortizationPretaxAmount) {
            this.currentAmortizationPretaxAmount = currentAmortizationPretaxAmount;
            return this;
        }
        public Double getCurrentAmortizationPretaxAmount() {
            return this.currentAmortizationPretaxAmount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setCurrentAmortizationPretaxGrossAmount(Double currentAmortizationPretaxGrossAmount) {
            this.currentAmortizationPretaxGrossAmount = currentAmortizationPretaxGrossAmount;
            return this;
        }
        public Double getCurrentAmortizationPretaxGrossAmount() {
            return this.currentAmortizationPretaxGrossAmount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setCurrentAmortizationRoundDownDiscount(Double currentAmortizationRoundDownDiscount) {
            this.currentAmortizationRoundDownDiscount = currentAmortizationRoundDownDiscount;
            return this;
        }
        public Double getCurrentAmortizationRoundDownDiscount() {
            return this.currentAmortizationRoundDownDiscount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setDeductedByCashCoupons(Double deductedByCashCoupons) {
            this.deductedByCashCoupons = deductedByCashCoupons;
            return this;
        }
        public Double getDeductedByCashCoupons() {
            return this.deductedByCashCoupons;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setDeductedByCoupons(Double deductedByCoupons) {
            this.deductedByCoupons = deductedByCoupons;
            return this;
        }
        public Double getDeductedByCoupons() {
            return this.deductedByCoupons;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setDeductedByPrepaidCard(Double deductedByPrepaidCard) {
            this.deductedByPrepaidCard = deductedByPrepaidCard;
            return this;
        }
        public Double getDeductedByPrepaidCard() {
            return this.deductedByPrepaidCard;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setExpenditureAmount(Double expenditureAmount) {
            this.expenditureAmount = expenditureAmount;
            return this;
        }
        public Double getExpenditureAmount() {
            return this.expenditureAmount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setInternetIP(String internetIP) {
            this.internetIP = internetIP;
            return this;
        }
        public String getInternetIP() {
            return this.internetIP;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setIntranetIP(String intranetIP) {
            this.intranetIP = intranetIP;
            return this;
        }
        public String getIntranetIP() {
            return this.intranetIP;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setInvoiceDiscount(Double invoiceDiscount) {
            this.invoiceDiscount = invoiceDiscount;
            return this;
        }
        public Double getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setPretaxAmount(Double pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public Double getPretaxAmount() {
            return this.pretaxAmount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setPretaxGrossAmount(Double pretaxGrossAmount) {
            this.pretaxGrossAmount = pretaxGrossAmount;
            return this;
        }
        public Double getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setPreviouslyAmortizedDeductedByCashCoupons(Double previouslyAmortizedDeductedByCashCoupons) {
            this.previouslyAmortizedDeductedByCashCoupons = previouslyAmortizedDeductedByCashCoupons;
            return this;
        }
        public Double getPreviouslyAmortizedDeductedByCashCoupons() {
            return this.previouslyAmortizedDeductedByCashCoupons;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setPreviouslyAmortizedDeductedByCoupons(Double previouslyAmortizedDeductedByCoupons) {
            this.previouslyAmortizedDeductedByCoupons = previouslyAmortizedDeductedByCoupons;
            return this;
        }
        public Double getPreviouslyAmortizedDeductedByCoupons() {
            return this.previouslyAmortizedDeductedByCoupons;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setPreviouslyAmortizedDeductedByPrepaidCard(Double previouslyAmortizedDeductedByPrepaidCard) {
            this.previouslyAmortizedDeductedByPrepaidCard = previouslyAmortizedDeductedByPrepaidCard;
            return this;
        }
        public Double getPreviouslyAmortizedDeductedByPrepaidCard() {
            return this.previouslyAmortizedDeductedByPrepaidCard;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setPreviouslyAmortizedExpenditureAmount(Double previouslyAmortizedExpenditureAmount) {
            this.previouslyAmortizedExpenditureAmount = previouslyAmortizedExpenditureAmount;
            return this;
        }
        public Double getPreviouslyAmortizedExpenditureAmount() {
            return this.previouslyAmortizedExpenditureAmount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setPreviouslyAmortizedInvoiceDiscount(Double previouslyAmortizedInvoiceDiscount) {
            this.previouslyAmortizedInvoiceDiscount = previouslyAmortizedInvoiceDiscount;
            return this;
        }
        public Double getPreviouslyAmortizedInvoiceDiscount() {
            return this.previouslyAmortizedInvoiceDiscount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setPreviouslyAmortizedPretaxAmount(Double previouslyAmortizedPretaxAmount) {
            this.previouslyAmortizedPretaxAmount = previouslyAmortizedPretaxAmount;
            return this;
        }
        public Double getPreviouslyAmortizedPretaxAmount() {
            return this.previouslyAmortizedPretaxAmount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setPreviouslyAmortizedPretaxGrossAmount(Double previouslyAmortizedPretaxGrossAmount) {
            this.previouslyAmortizedPretaxGrossAmount = previouslyAmortizedPretaxGrossAmount;
            return this;
        }
        public Double getPreviouslyAmortizedPretaxGrossAmount() {
            return this.previouslyAmortizedPretaxGrossAmount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setPreviouslyAmortizedRoundDownDiscount(Double previouslyAmortizedRoundDownDiscount) {
            this.previouslyAmortizedRoundDownDiscount = previouslyAmortizedRoundDownDiscount;
            return this;
        }
        public Double getPreviouslyAmortizedRoundDownDiscount() {
            return this.previouslyAmortizedRoundDownDiscount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setProductDetail(String productDetail) {
            this.productDetail = productDetail;
            return this;
        }
        public String getProductDetail() {
            return this.productDetail;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setProductDetailCode(String productDetailCode) {
            this.productDetailCode = productDetailCode;
            return this;
        }
        public String getProductDetailCode() {
            return this.productDetailCode;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setRemainingAmortizationDeductedByCashCoupons(Double remainingAmortizationDeductedByCashCoupons) {
            this.remainingAmortizationDeductedByCashCoupons = remainingAmortizationDeductedByCashCoupons;
            return this;
        }
        public Double getRemainingAmortizationDeductedByCashCoupons() {
            return this.remainingAmortizationDeductedByCashCoupons;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setRemainingAmortizationDeductedByCoupons(Double remainingAmortizationDeductedByCoupons) {
            this.remainingAmortizationDeductedByCoupons = remainingAmortizationDeductedByCoupons;
            return this;
        }
        public Double getRemainingAmortizationDeductedByCoupons() {
            return this.remainingAmortizationDeductedByCoupons;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setRemainingAmortizationDeductedByPrepaidCard(Double remainingAmortizationDeductedByPrepaidCard) {
            this.remainingAmortizationDeductedByPrepaidCard = remainingAmortizationDeductedByPrepaidCard;
            return this;
        }
        public Double getRemainingAmortizationDeductedByPrepaidCard() {
            return this.remainingAmortizationDeductedByPrepaidCard;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setRemainingAmortizationExpenditureAmount(Double remainingAmortizationExpenditureAmount) {
            this.remainingAmortizationExpenditureAmount = remainingAmortizationExpenditureAmount;
            return this;
        }
        public Double getRemainingAmortizationExpenditureAmount() {
            return this.remainingAmortizationExpenditureAmount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setRemainingAmortizationInvoiceDiscount(Double remainingAmortizationInvoiceDiscount) {
            this.remainingAmortizationInvoiceDiscount = remainingAmortizationInvoiceDiscount;
            return this;
        }
        public Double getRemainingAmortizationInvoiceDiscount() {
            return this.remainingAmortizationInvoiceDiscount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setRemainingAmortizationPretaxAmount(Double remainingAmortizationPretaxAmount) {
            this.remainingAmortizationPretaxAmount = remainingAmortizationPretaxAmount;
            return this;
        }
        public Double getRemainingAmortizationPretaxAmount() {
            return this.remainingAmortizationPretaxAmount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setRemainingAmortizationPretaxGrossAmount(Double remainingAmortizationPretaxGrossAmount) {
            this.remainingAmortizationPretaxGrossAmount = remainingAmortizationPretaxGrossAmount;
            return this;
        }
        public Double getRemainingAmortizationPretaxGrossAmount() {
            return this.remainingAmortizationPretaxGrossAmount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setRemainingAmortizationRoundDownDiscount(Double remainingAmortizationRoundDownDiscount) {
            this.remainingAmortizationRoundDownDiscount = remainingAmortizationRoundDownDiscount;
            return this;
        }
        public Double getRemainingAmortizationRoundDownDiscount() {
            return this.remainingAmortizationRoundDownDiscount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setRoundDownDiscount(Double roundDownDiscount) {
            this.roundDownDiscount = roundDownDiscount;
            return this;
        }
        public Double getRoundDownDiscount() {
            return this.roundDownDiscount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setSplitAccountName(String splitAccountName) {
            this.splitAccountName = splitAccountName;
            return this;
        }
        public String getSplitAccountName() {
            return this.splitAccountName;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setSplitItemID(String splitItemID) {
            this.splitItemID = splitItemID;
            return this;
        }
        public String getSplitItemID() {
            return this.splitItemID;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setSplitItemName(String splitItemName) {
            this.splitItemName = splitItemName;
            return this;
        }
        public String getSplitItemName() {
            return this.splitItemName;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setSplitProductDetail(String splitProductDetail) {
            this.splitProductDetail = splitProductDetail;
            return this;
        }
        public String getSplitProductDetail() {
            return this.splitProductDetail;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

    public static class DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyData extends TeaModel {
        @NameInMap("AccountID")
        public String accountID;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("HostId")
        public String hostId;

        @NameInMap("Items")
        public java.util.List<DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems> items;

        @NameInMap("MaxResults")
        public Integer maxResults;

        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyData self = new DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyData setAccountID(String accountID) {
            this.accountID = accountID;
            return this;
        }
        public String getAccountID() {
            return this.accountID;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyData setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyData setItems(java.util.List<DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyDataItems> getItems() {
            return this.items;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
