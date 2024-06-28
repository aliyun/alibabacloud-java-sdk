// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Successful！</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>79EE7556-0CFD-44EB-9CD6-B3B526E3A85F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBody self = new DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBody setData(DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyData getData() {
        return this.data;
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-10</p>
         */
        @NameInMap("AmortizationPeriod")
        public String amortizationPeriod;

        /**
         * <strong>example:</strong>
         * <p>2022-10-10</p>
         */
        @NameInMap("AmortizationPeriodDay")
        public String amortizationPeriodDay;

        /**
         * <strong>example:</strong>
         * <p>amortized</p>
         */
        @NameInMap("AmortizationStatus")
        public String amortizationStatus;

        /**
         * <strong>example:</strong>
         * <p>185xxxxx489</p>
         */
        @NameInMap("BillAccountID")
        public Long billAccountID;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:test@test.aliyunid.com">test@test.aliyunid.com</a></p>
         */
        @NameInMap("BillAccountName")
        public String billAccountName;

        /**
         * <strong>example:</strong>
         * <p>185xxxxx489</p>
         */
        @NameInMap("BillOwnerID")
        public Long billOwnerID;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:test@test.aliyunid.com">test@test.aliyunid.com</a></p>
         */
        @NameInMap("BillOwnerName")
        public String billOwnerName;

        /**
         * <strong>example:</strong>
         * <p>trusteeship</p>
         */
        @NameInMap("BizType")
        public String bizType;

        /**
         * <strong>example:</strong>
         * <p>2022-10</p>
         */
        @NameInMap("ConsumePeriod")
        public String consumePeriod;

        /**
         * <strong>example:</strong>
         * <p>2022-10-10</p>
         */
        @NameInMap("ConsumePeriodDay")
        public String consumePeriodDay;

        @NameInMap("CostUnit")
        public String costUnit;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("CostUnitCode")
        public String costUnitCode;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CurrentAmortizationDeductedByCashCoupons")
        public Double currentAmortizationDeductedByCashCoupons;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CurrentAmortizationDeductedByCoupons")
        public Double currentAmortizationDeductedByCoupons;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CurrentAmortizationDeductedByPrepaidCard")
        public Double currentAmortizationDeductedByPrepaidCard;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CurrentAmortizationExpenditureAmount")
        public Double currentAmortizationExpenditureAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CurrentAmortizationInvoiceDiscount")
        public Double currentAmortizationInvoiceDiscount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CurrentAmortizationPretaxAmount")
        public Double currentAmortizationPretaxAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CurrentAmortizationPretaxGrossAmount")
        public Double currentAmortizationPretaxGrossAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CurrentAmortizationRoundDownDiscount")
        public Double currentAmortizationRoundDownDiscount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DeductedByCashCoupons")
        public Double deductedByCashCoupons;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DeductedByCoupons")
        public Double deductedByCoupons;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DeductedByPrepaidCard")
        public Double deductedByPrepaidCard;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExpenditureAmount")
        public Double expenditureAmount;

        /**
         * <strong>example:</strong>
         * <p>i-kjhdskjgshfdlkjfdh</p>
         */
        @NameInMap("InstanceID")
        public String instanceID;

        /**
         * <strong>example:</strong>
         * <p>34.xx.x.x</p>
         */
        @NameInMap("InternetIP")
        public String internetIP;

        /**
         * <strong>example:</strong>
         * <p>192.xx.xx.xx</p>
         */
        @NameInMap("IntranetIP")
        public String intranetIP;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InvoiceDiscount")
        public Double invoiceDiscount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PretaxAmount")
        public Double pretaxAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PretaxGrossAmount")
        public Double pretaxGrossAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PreviouslyAmortizedDeductedByCashCoupons")
        public Double previouslyAmortizedDeductedByCashCoupons;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PreviouslyAmortizedDeductedByCoupons")
        public Double previouslyAmortizedDeductedByCoupons;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PreviouslyAmortizedDeductedByPrepaidCard")
        public Double previouslyAmortizedDeductedByPrepaidCard;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PreviouslyAmortizedExpenditureAmount")
        public Double previouslyAmortizedExpenditureAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PreviouslyAmortizedInvoiceDiscount")
        public Double previouslyAmortizedInvoiceDiscount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PreviouslyAmortizedPretaxAmount")
        public Double previouslyAmortizedPretaxAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PreviouslyAmortizedPretaxGrossAmount")
        public Double previouslyAmortizedPretaxGrossAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PreviouslyAmortizedRoundDownDiscount")
        public Double previouslyAmortizedRoundDownDiscount;

        /**
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductDetail")
        public String productDetail;

        /**
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("ProductDetailCode")
        public String productDetailCode;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RemainingAmortizationDeductedByCashCoupons")
        public Double remainingAmortizationDeductedByCashCoupons;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RemainingAmortizationDeductedByCoupons")
        public Double remainingAmortizationDeductedByCoupons;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RemainingAmortizationDeductedByPrepaidCard")
        public Double remainingAmortizationDeductedByPrepaidCard;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RemainingAmortizationExpenditureAmount")
        public Double remainingAmortizationExpenditureAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RemainingAmortizationInvoiceDiscount")
        public Double remainingAmortizationInvoiceDiscount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RemainingAmortizationPretaxAmount")
        public Double remainingAmortizationPretaxAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RemainingAmortizationPretaxGrossAmount")
        public Double remainingAmortizationPretaxGrossAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RemainingAmortizationRoundDownDiscount")
        public Double remainingAmortizationRoundDownDiscount;

        @NameInMap("ResourceGroup")
        public String resourceGroup;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RoundDownDiscount")
        public Double roundDownDiscount;

        /**
         * <strong>example:</strong>
         * <p>test**1122</p>
         */
        @NameInMap("SplitAccountName")
        public String splitAccountName;

        /**
         * <strong>example:</strong>
         * <p>i-28bycvyb4</p>
         */
        @NameInMap("SplitItemID")
        public String splitItemID;

        /**
         * <strong>example:</strong>
         * <p>iZ28bycvyb4Z</p>
         */
        @NameInMap("SplitItemName")
        public String splitItemName;

        /**
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("SplitProductDetail")
        public String splitProductDetail;

        /**
         * <strong>example:</strong>
         * <p>PayAsYouGo</p>
         */
        @NameInMap("SubscriptionType")
        public String subscriptionType;

        /**
         * <strong>example:</strong>
         * <p>tag</p>
         */
        @NameInMap("Tag")
        public String tag;

        @NameInMap("Zone")
        public String zone;

        public static DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems self = new DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setAmortizationPeriod(String amortizationPeriod) {
            this.amortizationPeriod = amortizationPeriod;
            return this;
        }
        public String getAmortizationPeriod() {
            return this.amortizationPeriod;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setAmortizationPeriodDay(String amortizationPeriodDay) {
            this.amortizationPeriodDay = amortizationPeriodDay;
            return this;
        }
        public String getAmortizationPeriodDay() {
            return this.amortizationPeriodDay;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setAmortizationStatus(String amortizationStatus) {
            this.amortizationStatus = amortizationStatus;
            return this;
        }
        public String getAmortizationStatus() {
            return this.amortizationStatus;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setBillAccountID(Long billAccountID) {
            this.billAccountID = billAccountID;
            return this;
        }
        public Long getBillAccountID() {
            return this.billAccountID;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setBillAccountName(String billAccountName) {
            this.billAccountName = billAccountName;
            return this;
        }
        public String getBillAccountName() {
            return this.billAccountName;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setBillOwnerID(Long billOwnerID) {
            this.billOwnerID = billOwnerID;
            return this;
        }
        public Long getBillOwnerID() {
            return this.billOwnerID;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setBillOwnerName(String billOwnerName) {
            this.billOwnerName = billOwnerName;
            return this;
        }
        public String getBillOwnerName() {
            return this.billOwnerName;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setConsumePeriod(String consumePeriod) {
            this.consumePeriod = consumePeriod;
            return this;
        }
        public String getConsumePeriod() {
            return this.consumePeriod;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setConsumePeriodDay(String consumePeriodDay) {
            this.consumePeriodDay = consumePeriodDay;
            return this;
        }
        public String getConsumePeriodDay() {
            return this.consumePeriodDay;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setCostUnit(String costUnit) {
            this.costUnit = costUnit;
            return this;
        }
        public String getCostUnit() {
            return this.costUnit;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setCostUnitCode(String costUnitCode) {
            this.costUnitCode = costUnitCode;
            return this;
        }
        public String getCostUnitCode() {
            return this.costUnitCode;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setCurrentAmortizationDeductedByCashCoupons(Double currentAmortizationDeductedByCashCoupons) {
            this.currentAmortizationDeductedByCashCoupons = currentAmortizationDeductedByCashCoupons;
            return this;
        }
        public Double getCurrentAmortizationDeductedByCashCoupons() {
            return this.currentAmortizationDeductedByCashCoupons;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setCurrentAmortizationDeductedByCoupons(Double currentAmortizationDeductedByCoupons) {
            this.currentAmortizationDeductedByCoupons = currentAmortizationDeductedByCoupons;
            return this;
        }
        public Double getCurrentAmortizationDeductedByCoupons() {
            return this.currentAmortizationDeductedByCoupons;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setCurrentAmortizationDeductedByPrepaidCard(Double currentAmortizationDeductedByPrepaidCard) {
            this.currentAmortizationDeductedByPrepaidCard = currentAmortizationDeductedByPrepaidCard;
            return this;
        }
        public Double getCurrentAmortizationDeductedByPrepaidCard() {
            return this.currentAmortizationDeductedByPrepaidCard;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setCurrentAmortizationExpenditureAmount(Double currentAmortizationExpenditureAmount) {
            this.currentAmortizationExpenditureAmount = currentAmortizationExpenditureAmount;
            return this;
        }
        public Double getCurrentAmortizationExpenditureAmount() {
            return this.currentAmortizationExpenditureAmount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setCurrentAmortizationInvoiceDiscount(Double currentAmortizationInvoiceDiscount) {
            this.currentAmortizationInvoiceDiscount = currentAmortizationInvoiceDiscount;
            return this;
        }
        public Double getCurrentAmortizationInvoiceDiscount() {
            return this.currentAmortizationInvoiceDiscount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setCurrentAmortizationPretaxAmount(Double currentAmortizationPretaxAmount) {
            this.currentAmortizationPretaxAmount = currentAmortizationPretaxAmount;
            return this;
        }
        public Double getCurrentAmortizationPretaxAmount() {
            return this.currentAmortizationPretaxAmount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setCurrentAmortizationPretaxGrossAmount(Double currentAmortizationPretaxGrossAmount) {
            this.currentAmortizationPretaxGrossAmount = currentAmortizationPretaxGrossAmount;
            return this;
        }
        public Double getCurrentAmortizationPretaxGrossAmount() {
            return this.currentAmortizationPretaxGrossAmount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setCurrentAmortizationRoundDownDiscount(Double currentAmortizationRoundDownDiscount) {
            this.currentAmortizationRoundDownDiscount = currentAmortizationRoundDownDiscount;
            return this;
        }
        public Double getCurrentAmortizationRoundDownDiscount() {
            return this.currentAmortizationRoundDownDiscount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setDeductedByCashCoupons(Double deductedByCashCoupons) {
            this.deductedByCashCoupons = deductedByCashCoupons;
            return this;
        }
        public Double getDeductedByCashCoupons() {
            return this.deductedByCashCoupons;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setDeductedByCoupons(Double deductedByCoupons) {
            this.deductedByCoupons = deductedByCoupons;
            return this;
        }
        public Double getDeductedByCoupons() {
            return this.deductedByCoupons;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setDeductedByPrepaidCard(Double deductedByPrepaidCard) {
            this.deductedByPrepaidCard = deductedByPrepaidCard;
            return this;
        }
        public Double getDeductedByPrepaidCard() {
            return this.deductedByPrepaidCard;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setExpenditureAmount(Double expenditureAmount) {
            this.expenditureAmount = expenditureAmount;
            return this;
        }
        public Double getExpenditureAmount() {
            return this.expenditureAmount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setInternetIP(String internetIP) {
            this.internetIP = internetIP;
            return this;
        }
        public String getInternetIP() {
            return this.internetIP;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setIntranetIP(String intranetIP) {
            this.intranetIP = intranetIP;
            return this;
        }
        public String getIntranetIP() {
            return this.intranetIP;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setInvoiceDiscount(Double invoiceDiscount) {
            this.invoiceDiscount = invoiceDiscount;
            return this;
        }
        public Double getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setPretaxAmount(Double pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public Double getPretaxAmount() {
            return this.pretaxAmount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setPretaxGrossAmount(Double pretaxGrossAmount) {
            this.pretaxGrossAmount = pretaxGrossAmount;
            return this;
        }
        public Double getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setPreviouslyAmortizedDeductedByCashCoupons(Double previouslyAmortizedDeductedByCashCoupons) {
            this.previouslyAmortizedDeductedByCashCoupons = previouslyAmortizedDeductedByCashCoupons;
            return this;
        }
        public Double getPreviouslyAmortizedDeductedByCashCoupons() {
            return this.previouslyAmortizedDeductedByCashCoupons;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setPreviouslyAmortizedDeductedByCoupons(Double previouslyAmortizedDeductedByCoupons) {
            this.previouslyAmortizedDeductedByCoupons = previouslyAmortizedDeductedByCoupons;
            return this;
        }
        public Double getPreviouslyAmortizedDeductedByCoupons() {
            return this.previouslyAmortizedDeductedByCoupons;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setPreviouslyAmortizedDeductedByPrepaidCard(Double previouslyAmortizedDeductedByPrepaidCard) {
            this.previouslyAmortizedDeductedByPrepaidCard = previouslyAmortizedDeductedByPrepaidCard;
            return this;
        }
        public Double getPreviouslyAmortizedDeductedByPrepaidCard() {
            return this.previouslyAmortizedDeductedByPrepaidCard;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setPreviouslyAmortizedExpenditureAmount(Double previouslyAmortizedExpenditureAmount) {
            this.previouslyAmortizedExpenditureAmount = previouslyAmortizedExpenditureAmount;
            return this;
        }
        public Double getPreviouslyAmortizedExpenditureAmount() {
            return this.previouslyAmortizedExpenditureAmount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setPreviouslyAmortizedInvoiceDiscount(Double previouslyAmortizedInvoiceDiscount) {
            this.previouslyAmortizedInvoiceDiscount = previouslyAmortizedInvoiceDiscount;
            return this;
        }
        public Double getPreviouslyAmortizedInvoiceDiscount() {
            return this.previouslyAmortizedInvoiceDiscount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setPreviouslyAmortizedPretaxAmount(Double previouslyAmortizedPretaxAmount) {
            this.previouslyAmortizedPretaxAmount = previouslyAmortizedPretaxAmount;
            return this;
        }
        public Double getPreviouslyAmortizedPretaxAmount() {
            return this.previouslyAmortizedPretaxAmount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setPreviouslyAmortizedPretaxGrossAmount(Double previouslyAmortizedPretaxGrossAmount) {
            this.previouslyAmortizedPretaxGrossAmount = previouslyAmortizedPretaxGrossAmount;
            return this;
        }
        public Double getPreviouslyAmortizedPretaxGrossAmount() {
            return this.previouslyAmortizedPretaxGrossAmount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setPreviouslyAmortizedRoundDownDiscount(Double previouslyAmortizedRoundDownDiscount) {
            this.previouslyAmortizedRoundDownDiscount = previouslyAmortizedRoundDownDiscount;
            return this;
        }
        public Double getPreviouslyAmortizedRoundDownDiscount() {
            return this.previouslyAmortizedRoundDownDiscount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setProductDetail(String productDetail) {
            this.productDetail = productDetail;
            return this;
        }
        public String getProductDetail() {
            return this.productDetail;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setProductDetailCode(String productDetailCode) {
            this.productDetailCode = productDetailCode;
            return this;
        }
        public String getProductDetailCode() {
            return this.productDetailCode;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setRemainingAmortizationDeductedByCashCoupons(Double remainingAmortizationDeductedByCashCoupons) {
            this.remainingAmortizationDeductedByCashCoupons = remainingAmortizationDeductedByCashCoupons;
            return this;
        }
        public Double getRemainingAmortizationDeductedByCashCoupons() {
            return this.remainingAmortizationDeductedByCashCoupons;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setRemainingAmortizationDeductedByCoupons(Double remainingAmortizationDeductedByCoupons) {
            this.remainingAmortizationDeductedByCoupons = remainingAmortizationDeductedByCoupons;
            return this;
        }
        public Double getRemainingAmortizationDeductedByCoupons() {
            return this.remainingAmortizationDeductedByCoupons;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setRemainingAmortizationDeductedByPrepaidCard(Double remainingAmortizationDeductedByPrepaidCard) {
            this.remainingAmortizationDeductedByPrepaidCard = remainingAmortizationDeductedByPrepaidCard;
            return this;
        }
        public Double getRemainingAmortizationDeductedByPrepaidCard() {
            return this.remainingAmortizationDeductedByPrepaidCard;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setRemainingAmortizationExpenditureAmount(Double remainingAmortizationExpenditureAmount) {
            this.remainingAmortizationExpenditureAmount = remainingAmortizationExpenditureAmount;
            return this;
        }
        public Double getRemainingAmortizationExpenditureAmount() {
            return this.remainingAmortizationExpenditureAmount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setRemainingAmortizationInvoiceDiscount(Double remainingAmortizationInvoiceDiscount) {
            this.remainingAmortizationInvoiceDiscount = remainingAmortizationInvoiceDiscount;
            return this;
        }
        public Double getRemainingAmortizationInvoiceDiscount() {
            return this.remainingAmortizationInvoiceDiscount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setRemainingAmortizationPretaxAmount(Double remainingAmortizationPretaxAmount) {
            this.remainingAmortizationPretaxAmount = remainingAmortizationPretaxAmount;
            return this;
        }
        public Double getRemainingAmortizationPretaxAmount() {
            return this.remainingAmortizationPretaxAmount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setRemainingAmortizationPretaxGrossAmount(Double remainingAmortizationPretaxGrossAmount) {
            this.remainingAmortizationPretaxGrossAmount = remainingAmortizationPretaxGrossAmount;
            return this;
        }
        public Double getRemainingAmortizationPretaxGrossAmount() {
            return this.remainingAmortizationPretaxGrossAmount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setRemainingAmortizationRoundDownDiscount(Double remainingAmortizationRoundDownDiscount) {
            this.remainingAmortizationRoundDownDiscount = remainingAmortizationRoundDownDiscount;
            return this;
        }
        public Double getRemainingAmortizationRoundDownDiscount() {
            return this.remainingAmortizationRoundDownDiscount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setRoundDownDiscount(Double roundDownDiscount) {
            this.roundDownDiscount = roundDownDiscount;
            return this;
        }
        public Double getRoundDownDiscount() {
            return this.roundDownDiscount;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setSplitAccountName(String splitAccountName) {
            this.splitAccountName = splitAccountName;
            return this;
        }
        public String getSplitAccountName() {
            return this.splitAccountName;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setSplitItemID(String splitItemID) {
            this.splitItemID = splitItemID;
            return this;
        }
        public String getSplitItemID() {
            return this.splitItemID;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setSplitItemName(String splitItemName) {
            this.splitItemName = splitItemName;
            return this;
        }
        public String getSplitItemName() {
            return this.splitItemName;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setSplitProductDetail(String splitProductDetail) {
            this.splitProductDetail = splitProductDetail;
            return this;
        }
        public String getSplitProductDetail() {
            return this.splitProductDetail;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

    public static class DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>185766xxxx</p>
         */
        @NameInMap("AccountID")
        public String accountID;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:test@test.aliyunid.com">test@test.aliyunid.com</a></p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <strong>example:</strong>
         * <p>cn</p>
         */
        @NameInMap("HostId")
        public String hostId;

        @NameInMap("Items")
        public java.util.List<DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems> items;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <strong>example:</strong>
         * <p>CAESEgoQCg4KCmdtdF9jcmVhdGUEARgBIkgKCQBwhGmPcAEAAAo7AzYAAAAxTDgwMDcxMjg3ZDJhNmM3ZDguTDgwMDAwMDAwMDAwMzE1MTIuTDgwMDcyZDMyZTJkYzg3N2U</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyData self = new DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyData setAccountID(String accountID) {
            this.accountID = accountID;
            return this;
        }
        public String getAccountID() {
            return this.accountID;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyData setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyData setItems(java.util.List<DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyDataItems> getItems() {
            return this.items;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
