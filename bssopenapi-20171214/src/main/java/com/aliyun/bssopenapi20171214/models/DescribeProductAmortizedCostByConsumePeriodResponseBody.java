// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeProductAmortizedCostByConsumePeriodResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeProductAmortizedCostByConsumePeriodResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeProductAmortizedCostByConsumePeriodResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductAmortizedCostByConsumePeriodResponseBody self = new DescribeProductAmortizedCostByConsumePeriodResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProductAmortizedCostByConsumePeriodResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeProductAmortizedCostByConsumePeriodResponseBody setData(DescribeProductAmortizedCostByConsumePeriodResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeProductAmortizedCostByConsumePeriodResponseBodyData getData() {
        return this.data;
    }

    public DescribeProductAmortizedCostByConsumePeriodResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeProductAmortizedCostByConsumePeriodResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProductAmortizedCostByConsumePeriodResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems extends TeaModel {
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

        public static DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems self = new DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setAmortizationPeriod(String amortizationPeriod) {
            this.amortizationPeriod = amortizationPeriod;
            return this;
        }
        public String getAmortizationPeriod() {
            return this.amortizationPeriod;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setAmortizationStatus(String amortizationStatus) {
            this.amortizationStatus = amortizationStatus;
            return this;
        }
        public String getAmortizationStatus() {
            return this.amortizationStatus;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setBillAccountID(Long billAccountID) {
            this.billAccountID = billAccountID;
            return this;
        }
        public Long getBillAccountID() {
            return this.billAccountID;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setBillAccountName(String billAccountName) {
            this.billAccountName = billAccountName;
            return this;
        }
        public String getBillAccountName() {
            return this.billAccountName;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setBillOwnerID(Long billOwnerID) {
            this.billOwnerID = billOwnerID;
            return this;
        }
        public Long getBillOwnerID() {
            return this.billOwnerID;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setBillOwnerName(String billOwnerName) {
            this.billOwnerName = billOwnerName;
            return this;
        }
        public String getBillOwnerName() {
            return this.billOwnerName;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setConsumePeriod(String consumePeriod) {
            this.consumePeriod = consumePeriod;
            return this;
        }
        public String getConsumePeriod() {
            return this.consumePeriod;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setCurrentAmortizationDeductedByCashCoupons(Double currentAmortizationDeductedByCashCoupons) {
            this.currentAmortizationDeductedByCashCoupons = currentAmortizationDeductedByCashCoupons;
            return this;
        }
        public Double getCurrentAmortizationDeductedByCashCoupons() {
            return this.currentAmortizationDeductedByCashCoupons;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setCurrentAmortizationDeductedByCoupons(Double currentAmortizationDeductedByCoupons) {
            this.currentAmortizationDeductedByCoupons = currentAmortizationDeductedByCoupons;
            return this;
        }
        public Double getCurrentAmortizationDeductedByCoupons() {
            return this.currentAmortizationDeductedByCoupons;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setCurrentAmortizationDeductedByPrepaidCard(Double currentAmortizationDeductedByPrepaidCard) {
            this.currentAmortizationDeductedByPrepaidCard = currentAmortizationDeductedByPrepaidCard;
            return this;
        }
        public Double getCurrentAmortizationDeductedByPrepaidCard() {
            return this.currentAmortizationDeductedByPrepaidCard;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setCurrentAmortizationExpenditureAmount(Double currentAmortizationExpenditureAmount) {
            this.currentAmortizationExpenditureAmount = currentAmortizationExpenditureAmount;
            return this;
        }
        public Double getCurrentAmortizationExpenditureAmount() {
            return this.currentAmortizationExpenditureAmount;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setCurrentAmortizationInvoiceDiscount(Double currentAmortizationInvoiceDiscount) {
            this.currentAmortizationInvoiceDiscount = currentAmortizationInvoiceDiscount;
            return this;
        }
        public Double getCurrentAmortizationInvoiceDiscount() {
            return this.currentAmortizationInvoiceDiscount;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setCurrentAmortizationPretaxAmount(Double currentAmortizationPretaxAmount) {
            this.currentAmortizationPretaxAmount = currentAmortizationPretaxAmount;
            return this;
        }
        public Double getCurrentAmortizationPretaxAmount() {
            return this.currentAmortizationPretaxAmount;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setCurrentAmortizationPretaxGrossAmount(Double currentAmortizationPretaxGrossAmount) {
            this.currentAmortizationPretaxGrossAmount = currentAmortizationPretaxGrossAmount;
            return this;
        }
        public Double getCurrentAmortizationPretaxGrossAmount() {
            return this.currentAmortizationPretaxGrossAmount;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setCurrentAmortizationRoundDownDiscount(Double currentAmortizationRoundDownDiscount) {
            this.currentAmortizationRoundDownDiscount = currentAmortizationRoundDownDiscount;
            return this;
        }
        public Double getCurrentAmortizationRoundDownDiscount() {
            return this.currentAmortizationRoundDownDiscount;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setDeductedByCashCoupons(Double deductedByCashCoupons) {
            this.deductedByCashCoupons = deductedByCashCoupons;
            return this;
        }
        public Double getDeductedByCashCoupons() {
            return this.deductedByCashCoupons;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setDeductedByCoupons(Double deductedByCoupons) {
            this.deductedByCoupons = deductedByCoupons;
            return this;
        }
        public Double getDeductedByCoupons() {
            return this.deductedByCoupons;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setDeductedByPrepaidCard(Double deductedByPrepaidCard) {
            this.deductedByPrepaidCard = deductedByPrepaidCard;
            return this;
        }
        public Double getDeductedByPrepaidCard() {
            return this.deductedByPrepaidCard;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setExpenditureAmount(Double expenditureAmount) {
            this.expenditureAmount = expenditureAmount;
            return this;
        }
        public Double getExpenditureAmount() {
            return this.expenditureAmount;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setInvoiceDiscount(Double invoiceDiscount) {
            this.invoiceDiscount = invoiceDiscount;
            return this;
        }
        public Double getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setPretaxAmount(Double pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public Double getPretaxAmount() {
            return this.pretaxAmount;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setPretaxGrossAmount(Double pretaxGrossAmount) {
            this.pretaxGrossAmount = pretaxGrossAmount;
            return this;
        }
        public Double getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setPreviouslyAmortizedDeductedByCashCoupons(Double previouslyAmortizedDeductedByCashCoupons) {
            this.previouslyAmortizedDeductedByCashCoupons = previouslyAmortizedDeductedByCashCoupons;
            return this;
        }
        public Double getPreviouslyAmortizedDeductedByCashCoupons() {
            return this.previouslyAmortizedDeductedByCashCoupons;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setPreviouslyAmortizedDeductedByCoupons(Double previouslyAmortizedDeductedByCoupons) {
            this.previouslyAmortizedDeductedByCoupons = previouslyAmortizedDeductedByCoupons;
            return this;
        }
        public Double getPreviouslyAmortizedDeductedByCoupons() {
            return this.previouslyAmortizedDeductedByCoupons;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setPreviouslyAmortizedDeductedByPrepaidCard(Double previouslyAmortizedDeductedByPrepaidCard) {
            this.previouslyAmortizedDeductedByPrepaidCard = previouslyAmortizedDeductedByPrepaidCard;
            return this;
        }
        public Double getPreviouslyAmortizedDeductedByPrepaidCard() {
            return this.previouslyAmortizedDeductedByPrepaidCard;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setPreviouslyAmortizedExpenditureAmount(Double previouslyAmortizedExpenditureAmount) {
            this.previouslyAmortizedExpenditureAmount = previouslyAmortizedExpenditureAmount;
            return this;
        }
        public Double getPreviouslyAmortizedExpenditureAmount() {
            return this.previouslyAmortizedExpenditureAmount;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setPreviouslyAmortizedInvoiceDiscount(Double previouslyAmortizedInvoiceDiscount) {
            this.previouslyAmortizedInvoiceDiscount = previouslyAmortizedInvoiceDiscount;
            return this;
        }
        public Double getPreviouslyAmortizedInvoiceDiscount() {
            return this.previouslyAmortizedInvoiceDiscount;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setPreviouslyAmortizedPretaxAmount(Double previouslyAmortizedPretaxAmount) {
            this.previouslyAmortizedPretaxAmount = previouslyAmortizedPretaxAmount;
            return this;
        }
        public Double getPreviouslyAmortizedPretaxAmount() {
            return this.previouslyAmortizedPretaxAmount;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setPreviouslyAmortizedPretaxGrossAmount(Double previouslyAmortizedPretaxGrossAmount) {
            this.previouslyAmortizedPretaxGrossAmount = previouslyAmortizedPretaxGrossAmount;
            return this;
        }
        public Double getPreviouslyAmortizedPretaxGrossAmount() {
            return this.previouslyAmortizedPretaxGrossAmount;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setPreviouslyAmortizedRoundDownDiscount(Double previouslyAmortizedRoundDownDiscount) {
            this.previouslyAmortizedRoundDownDiscount = previouslyAmortizedRoundDownDiscount;
            return this;
        }
        public Double getPreviouslyAmortizedRoundDownDiscount() {
            return this.previouslyAmortizedRoundDownDiscount;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setProductDetail(String productDetail) {
            this.productDetail = productDetail;
            return this;
        }
        public String getProductDetail() {
            return this.productDetail;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setProductDetailCode(String productDetailCode) {
            this.productDetailCode = productDetailCode;
            return this;
        }
        public String getProductDetailCode() {
            return this.productDetailCode;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setRemainingAmortizationDeductedByCashCoupons(Double remainingAmortizationDeductedByCashCoupons) {
            this.remainingAmortizationDeductedByCashCoupons = remainingAmortizationDeductedByCashCoupons;
            return this;
        }
        public Double getRemainingAmortizationDeductedByCashCoupons() {
            return this.remainingAmortizationDeductedByCashCoupons;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setRemainingAmortizationDeductedByCoupons(Double remainingAmortizationDeductedByCoupons) {
            this.remainingAmortizationDeductedByCoupons = remainingAmortizationDeductedByCoupons;
            return this;
        }
        public Double getRemainingAmortizationDeductedByCoupons() {
            return this.remainingAmortizationDeductedByCoupons;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setRemainingAmortizationDeductedByPrepaidCard(Double remainingAmortizationDeductedByPrepaidCard) {
            this.remainingAmortizationDeductedByPrepaidCard = remainingAmortizationDeductedByPrepaidCard;
            return this;
        }
        public Double getRemainingAmortizationDeductedByPrepaidCard() {
            return this.remainingAmortizationDeductedByPrepaidCard;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setRemainingAmortizationExpenditureAmount(Double remainingAmortizationExpenditureAmount) {
            this.remainingAmortizationExpenditureAmount = remainingAmortizationExpenditureAmount;
            return this;
        }
        public Double getRemainingAmortizationExpenditureAmount() {
            return this.remainingAmortizationExpenditureAmount;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setRemainingAmortizationInvoiceDiscount(Double remainingAmortizationInvoiceDiscount) {
            this.remainingAmortizationInvoiceDiscount = remainingAmortizationInvoiceDiscount;
            return this;
        }
        public Double getRemainingAmortizationInvoiceDiscount() {
            return this.remainingAmortizationInvoiceDiscount;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setRemainingAmortizationPretaxAmount(Double remainingAmortizationPretaxAmount) {
            this.remainingAmortizationPretaxAmount = remainingAmortizationPretaxAmount;
            return this;
        }
        public Double getRemainingAmortizationPretaxAmount() {
            return this.remainingAmortizationPretaxAmount;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setRemainingAmortizationPretaxGrossAmount(Double remainingAmortizationPretaxGrossAmount) {
            this.remainingAmortizationPretaxGrossAmount = remainingAmortizationPretaxGrossAmount;
            return this;
        }
        public Double getRemainingAmortizationPretaxGrossAmount() {
            return this.remainingAmortizationPretaxGrossAmount;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setRemainingAmortizationRoundDownDiscount(Double remainingAmortizationRoundDownDiscount) {
            this.remainingAmortizationRoundDownDiscount = remainingAmortizationRoundDownDiscount;
            return this;
        }
        public Double getRemainingAmortizationRoundDownDiscount() {
            return this.remainingAmortizationRoundDownDiscount;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setRoundDownDiscount(Double roundDownDiscount) {
            this.roundDownDiscount = roundDownDiscount;
            return this;
        }
        public Double getRoundDownDiscount() {
            return this.roundDownDiscount;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

    }

    public static class DescribeProductAmortizedCostByConsumePeriodResponseBodyData extends TeaModel {
        @NameInMap("AccountID")
        public String accountID;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("Items")
        public java.util.List<DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems> items;

        @NameInMap("MaxResults")
        public Integer maxResults;

        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeProductAmortizedCostByConsumePeriodResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductAmortizedCostByConsumePeriodResponseBodyData self = new DescribeProductAmortizedCostByConsumePeriodResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyData setAccountID(String accountID) {
            this.accountID = accountID;
            return this;
        }
        public String getAccountID() {
            return this.accountID;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyData setItems(java.util.List<DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeProductAmortizedCostByConsumePeriodResponseBodyDataItems> getItems() {
            return this.items;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public DescribeProductAmortizedCostByConsumePeriodResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
