// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeProductAmortizedCostByAmortizationPeriodResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeProductAmortizedCostByAmortizationPeriodResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductAmortizedCostByAmortizationPeriodResponseBody self = new DescribeProductAmortizedCostByAmortizationPeriodResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProductAmortizedCostByAmortizationPeriodResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeProductAmortizedCostByAmortizationPeriodResponseBody setData(DescribeProductAmortizedCostByAmortizationPeriodResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyData getData() {
        return this.data;
    }

    public DescribeProductAmortizedCostByAmortizationPeriodResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeProductAmortizedCostByAmortizationPeriodResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProductAmortizedCostByAmortizationPeriodResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems extends TeaModel {
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

        @NameInMap("RoundDownDiscount")
        public Double roundDownDiscount;

        @NameInMap("SubscriptionType")
        public String subscriptionType;

        public static DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems self = new DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setAmortizationPeriod(String amortizationPeriod) {
            this.amortizationPeriod = amortizationPeriod;
            return this;
        }
        public String getAmortizationPeriod() {
            return this.amortizationPeriod;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setAmortizationStatus(String amortizationStatus) {
            this.amortizationStatus = amortizationStatus;
            return this;
        }
        public String getAmortizationStatus() {
            return this.amortizationStatus;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setBillAccountID(Long billAccountID) {
            this.billAccountID = billAccountID;
            return this;
        }
        public Long getBillAccountID() {
            return this.billAccountID;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setBillAccountName(String billAccountName) {
            this.billAccountName = billAccountName;
            return this;
        }
        public String getBillAccountName() {
            return this.billAccountName;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setBillOwnerID(Long billOwnerID) {
            this.billOwnerID = billOwnerID;
            return this;
        }
        public Long getBillOwnerID() {
            return this.billOwnerID;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setBillOwnerName(String billOwnerName) {
            this.billOwnerName = billOwnerName;
            return this;
        }
        public String getBillOwnerName() {
            return this.billOwnerName;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setConsumePeriod(String consumePeriod) {
            this.consumePeriod = consumePeriod;
            return this;
        }
        public String getConsumePeriod() {
            return this.consumePeriod;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setCurrentAmortizationDeductedByCashCoupons(Double currentAmortizationDeductedByCashCoupons) {
            this.currentAmortizationDeductedByCashCoupons = currentAmortizationDeductedByCashCoupons;
            return this;
        }
        public Double getCurrentAmortizationDeductedByCashCoupons() {
            return this.currentAmortizationDeductedByCashCoupons;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setCurrentAmortizationDeductedByCoupons(Double currentAmortizationDeductedByCoupons) {
            this.currentAmortizationDeductedByCoupons = currentAmortizationDeductedByCoupons;
            return this;
        }
        public Double getCurrentAmortizationDeductedByCoupons() {
            return this.currentAmortizationDeductedByCoupons;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setCurrentAmortizationDeductedByPrepaidCard(Double currentAmortizationDeductedByPrepaidCard) {
            this.currentAmortizationDeductedByPrepaidCard = currentAmortizationDeductedByPrepaidCard;
            return this;
        }
        public Double getCurrentAmortizationDeductedByPrepaidCard() {
            return this.currentAmortizationDeductedByPrepaidCard;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setCurrentAmortizationExpenditureAmount(Double currentAmortizationExpenditureAmount) {
            this.currentAmortizationExpenditureAmount = currentAmortizationExpenditureAmount;
            return this;
        }
        public Double getCurrentAmortizationExpenditureAmount() {
            return this.currentAmortizationExpenditureAmount;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setCurrentAmortizationInvoiceDiscount(Double currentAmortizationInvoiceDiscount) {
            this.currentAmortizationInvoiceDiscount = currentAmortizationInvoiceDiscount;
            return this;
        }
        public Double getCurrentAmortizationInvoiceDiscount() {
            return this.currentAmortizationInvoiceDiscount;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setCurrentAmortizationPretaxAmount(Double currentAmortizationPretaxAmount) {
            this.currentAmortizationPretaxAmount = currentAmortizationPretaxAmount;
            return this;
        }
        public Double getCurrentAmortizationPretaxAmount() {
            return this.currentAmortizationPretaxAmount;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setCurrentAmortizationPretaxGrossAmount(Double currentAmortizationPretaxGrossAmount) {
            this.currentAmortizationPretaxGrossAmount = currentAmortizationPretaxGrossAmount;
            return this;
        }
        public Double getCurrentAmortizationPretaxGrossAmount() {
            return this.currentAmortizationPretaxGrossAmount;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setCurrentAmortizationRoundDownDiscount(Double currentAmortizationRoundDownDiscount) {
            this.currentAmortizationRoundDownDiscount = currentAmortizationRoundDownDiscount;
            return this;
        }
        public Double getCurrentAmortizationRoundDownDiscount() {
            return this.currentAmortizationRoundDownDiscount;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setDeductedByCashCoupons(Double deductedByCashCoupons) {
            this.deductedByCashCoupons = deductedByCashCoupons;
            return this;
        }
        public Double getDeductedByCashCoupons() {
            return this.deductedByCashCoupons;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setDeductedByCoupons(Double deductedByCoupons) {
            this.deductedByCoupons = deductedByCoupons;
            return this;
        }
        public Double getDeductedByCoupons() {
            return this.deductedByCoupons;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setDeductedByPrepaidCard(Double deductedByPrepaidCard) {
            this.deductedByPrepaidCard = deductedByPrepaidCard;
            return this;
        }
        public Double getDeductedByPrepaidCard() {
            return this.deductedByPrepaidCard;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setExpenditureAmount(Double expenditureAmount) {
            this.expenditureAmount = expenditureAmount;
            return this;
        }
        public Double getExpenditureAmount() {
            return this.expenditureAmount;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setInvoiceDiscount(Double invoiceDiscount) {
            this.invoiceDiscount = invoiceDiscount;
            return this;
        }
        public Double getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setPretaxAmount(Double pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public Double getPretaxAmount() {
            return this.pretaxAmount;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setPretaxGrossAmount(Double pretaxGrossAmount) {
            this.pretaxGrossAmount = pretaxGrossAmount;
            return this;
        }
        public Double getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setPreviouslyAmortizedDeductedByCashCoupons(Double previouslyAmortizedDeductedByCashCoupons) {
            this.previouslyAmortizedDeductedByCashCoupons = previouslyAmortizedDeductedByCashCoupons;
            return this;
        }
        public Double getPreviouslyAmortizedDeductedByCashCoupons() {
            return this.previouslyAmortizedDeductedByCashCoupons;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setPreviouslyAmortizedDeductedByCoupons(Double previouslyAmortizedDeductedByCoupons) {
            this.previouslyAmortizedDeductedByCoupons = previouslyAmortizedDeductedByCoupons;
            return this;
        }
        public Double getPreviouslyAmortizedDeductedByCoupons() {
            return this.previouslyAmortizedDeductedByCoupons;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setPreviouslyAmortizedDeductedByPrepaidCard(Double previouslyAmortizedDeductedByPrepaidCard) {
            this.previouslyAmortizedDeductedByPrepaidCard = previouslyAmortizedDeductedByPrepaidCard;
            return this;
        }
        public Double getPreviouslyAmortizedDeductedByPrepaidCard() {
            return this.previouslyAmortizedDeductedByPrepaidCard;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setPreviouslyAmortizedExpenditureAmount(Double previouslyAmortizedExpenditureAmount) {
            this.previouslyAmortizedExpenditureAmount = previouslyAmortizedExpenditureAmount;
            return this;
        }
        public Double getPreviouslyAmortizedExpenditureAmount() {
            return this.previouslyAmortizedExpenditureAmount;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setPreviouslyAmortizedInvoiceDiscount(Double previouslyAmortizedInvoiceDiscount) {
            this.previouslyAmortizedInvoiceDiscount = previouslyAmortizedInvoiceDiscount;
            return this;
        }
        public Double getPreviouslyAmortizedInvoiceDiscount() {
            return this.previouslyAmortizedInvoiceDiscount;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setPreviouslyAmortizedPretaxAmount(Double previouslyAmortizedPretaxAmount) {
            this.previouslyAmortizedPretaxAmount = previouslyAmortizedPretaxAmount;
            return this;
        }
        public Double getPreviouslyAmortizedPretaxAmount() {
            return this.previouslyAmortizedPretaxAmount;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setPreviouslyAmortizedPretaxGrossAmount(Double previouslyAmortizedPretaxGrossAmount) {
            this.previouslyAmortizedPretaxGrossAmount = previouslyAmortizedPretaxGrossAmount;
            return this;
        }
        public Double getPreviouslyAmortizedPretaxGrossAmount() {
            return this.previouslyAmortizedPretaxGrossAmount;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setPreviouslyAmortizedRoundDownDiscount(Double previouslyAmortizedRoundDownDiscount) {
            this.previouslyAmortizedRoundDownDiscount = previouslyAmortizedRoundDownDiscount;
            return this;
        }
        public Double getPreviouslyAmortizedRoundDownDiscount() {
            return this.previouslyAmortizedRoundDownDiscount;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setProductDetail(String productDetail) {
            this.productDetail = productDetail;
            return this;
        }
        public String getProductDetail() {
            return this.productDetail;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setProductDetailCode(String productDetailCode) {
            this.productDetailCode = productDetailCode;
            return this;
        }
        public String getProductDetailCode() {
            return this.productDetailCode;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setRemainingAmortizationDeductedByCashCoupons(Double remainingAmortizationDeductedByCashCoupons) {
            this.remainingAmortizationDeductedByCashCoupons = remainingAmortizationDeductedByCashCoupons;
            return this;
        }
        public Double getRemainingAmortizationDeductedByCashCoupons() {
            return this.remainingAmortizationDeductedByCashCoupons;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setRemainingAmortizationDeductedByCoupons(Double remainingAmortizationDeductedByCoupons) {
            this.remainingAmortizationDeductedByCoupons = remainingAmortizationDeductedByCoupons;
            return this;
        }
        public Double getRemainingAmortizationDeductedByCoupons() {
            return this.remainingAmortizationDeductedByCoupons;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setRemainingAmortizationDeductedByPrepaidCard(Double remainingAmortizationDeductedByPrepaidCard) {
            this.remainingAmortizationDeductedByPrepaidCard = remainingAmortizationDeductedByPrepaidCard;
            return this;
        }
        public Double getRemainingAmortizationDeductedByPrepaidCard() {
            return this.remainingAmortizationDeductedByPrepaidCard;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setRemainingAmortizationExpenditureAmount(Double remainingAmortizationExpenditureAmount) {
            this.remainingAmortizationExpenditureAmount = remainingAmortizationExpenditureAmount;
            return this;
        }
        public Double getRemainingAmortizationExpenditureAmount() {
            return this.remainingAmortizationExpenditureAmount;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setRemainingAmortizationInvoiceDiscount(Double remainingAmortizationInvoiceDiscount) {
            this.remainingAmortizationInvoiceDiscount = remainingAmortizationInvoiceDiscount;
            return this;
        }
        public Double getRemainingAmortizationInvoiceDiscount() {
            return this.remainingAmortizationInvoiceDiscount;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setRemainingAmortizationPretaxAmount(Double remainingAmortizationPretaxAmount) {
            this.remainingAmortizationPretaxAmount = remainingAmortizationPretaxAmount;
            return this;
        }
        public Double getRemainingAmortizationPretaxAmount() {
            return this.remainingAmortizationPretaxAmount;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setRemainingAmortizationPretaxGrossAmount(Double remainingAmortizationPretaxGrossAmount) {
            this.remainingAmortizationPretaxGrossAmount = remainingAmortizationPretaxGrossAmount;
            return this;
        }
        public Double getRemainingAmortizationPretaxGrossAmount() {
            return this.remainingAmortizationPretaxGrossAmount;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setRemainingAmortizationRoundDownDiscount(Double remainingAmortizationRoundDownDiscount) {
            this.remainingAmortizationRoundDownDiscount = remainingAmortizationRoundDownDiscount;
            return this;
        }
        public Double getRemainingAmortizationRoundDownDiscount() {
            return this.remainingAmortizationRoundDownDiscount;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setRoundDownDiscount(Double roundDownDiscount) {
            this.roundDownDiscount = roundDownDiscount;
            return this;
        }
        public Double getRoundDownDiscount() {
            return this.roundDownDiscount;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

    }

    public static class DescribeProductAmortizedCostByAmortizationPeriodResponseBodyData extends TeaModel {
        @NameInMap("AccountID")
        public String accountID;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("HostId")
        public String hostId;

        @NameInMap("Items")
        public java.util.List<DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems> items;

        @NameInMap("MaxResults")
        public Integer maxResults;

        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeProductAmortizedCostByAmortizationPeriodResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductAmortizedCostByAmortizationPeriodResponseBodyData self = new DescribeProductAmortizedCostByAmortizationPeriodResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyData setAccountID(String accountID) {
            this.accountID = accountID;
            return this;
        }
        public String getAccountID() {
            return this.accountID;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyData setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyData setItems(java.util.List<DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems> getItems() {
            return this.items;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
