// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeProductAmortizedCostByAmortizationPeriodResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeProductAmortizedCostByAmortizationPeriodResponseBodyData data;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful！</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>79EE7556-0CFD-44EB-9CD6-B3B526E3A85F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The allocation month. Format: YYYYMM.</p>
         * 
         * <strong>example:</strong>
         * <p>202210</p>
         */
        @NameInMap("AmortizationPeriod")
        public String amortizationPeriod;

        /**
         * <p>The allocation status. Valid values:</p>
         * <ul>
         * <li>amortized: allocated</li>
         * <li>unAmortized: not allocated</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>amortized</p>
         */
        @NameInMap("AmortizationStatus")
        public String amortizationStatus;

        /**
         * <p>The ID of the account to which the bill belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>185xxxxx489</p>
         */
        @NameInMap("BillAccountID")
        public Long billAccountID;

        /**
         * <p>The name of the account to which the bill belongs.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@test.aliyunid.com">test@test.aliyunid.com</a></p>
         */
        @NameInMap("BillAccountName")
        public String billAccountName;

        /**
         * <p>The ID of the account to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>185xxxxx489</p>
         */
        @NameInMap("BillOwnerID")
        public Long billOwnerID;

        /**
         * <p>The name of the account to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@test.aliyunid.com">test@test.aliyunid.com</a></p>
         */
        @NameInMap("BillOwnerName")
        public String billOwnerName;

        /**
         * <p>The business type.</p>
         * 
         * <strong>example:</strong>
         * <p>trusteeship</p>
         */
        @NameInMap("BizType")
        public String bizType;

        /**
         * <p>The billing cycle. Format: YYYYMM.</p>
         * 
         * <strong>example:</strong>
         * <p>202210</p>
         */
        @NameInMap("ConsumePeriod")
        public String consumePeriod;

        /**
         * <p>The amount deducted by using vouchers and allocated to the current allocation month.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CurrentAmortizationDeductedByCashCoupons")
        public Double currentAmortizationDeductedByCashCoupons;

        /**
         * <p>The amount deducted by using coupons and allocated to the current allocation month.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CurrentAmortizationDeductedByCoupons")
        public Double currentAmortizationDeductedByCoupons;

        /**
         * <p>The amount deducted by using prepaid cards and allocated to the current allocation month.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CurrentAmortizationDeductedByPrepaidCard")
        public Double currentAmortizationDeductedByPrepaidCard;

        /**
         * <p>The expenditure amount allocated to the current allocation month. Invoicing is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CurrentAmortizationExpenditureAmount")
        public Double currentAmortizationExpenditureAmount;

        /**
         * <p>The discount amount allocated to the current allocation month.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CurrentAmortizationInvoiceDiscount")
        public Double currentAmortizationInvoiceDiscount;

        /**
         * <p>The pretax amount allocated to the current allocation month.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CurrentAmortizationPretaxAmount")
        public Double currentAmortizationPretaxAmount;

        /**
         * <p>The pretax gross amount allocated to the current allocation month.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CurrentAmortizationPretaxGrossAmount")
        public Double currentAmortizationPretaxGrossAmount;

        /**
         * <p>The round-off amount allocated to the current allocation month.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CurrentAmortizationRoundDownDiscount")
        public Double currentAmortizationRoundDownDiscount;

        /**
         * <p>The amount deducted by using vouchers.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DeductedByCashCoupons")
        public Double deductedByCashCoupons;

        /**
         * <p>The amount deducted by using coupons.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DeductedByCoupons")
        public Double deductedByCoupons;

        /**
         * <p>The amount deducted by using prepaid cards.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DeductedByPrepaidCard")
        public Double deductedByPrepaidCard;

        /**
         * <p>The expenditure amount. Invoicing is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExpenditureAmount")
        public Double expenditureAmount;

        /**
         * <p>The discount amount.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InvoiceDiscount")
        public Double invoiceDiscount;

        /**
         * <p>The pretax amount.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PretaxAmount")
        public Double pretaxAmount;

        /**
         * <p>The pretax gross amount.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PretaxGrossAmount")
        public Double pretaxGrossAmount;

        /**
         * <p>The amount deducted by using vouchers and allocated before the current allocation month.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PreviouslyAmortizedDeductedByCashCoupons")
        public Double previouslyAmortizedDeductedByCashCoupons;

        /**
         * <p>The amount deducted by using coupons and allocated before the current allocation month.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PreviouslyAmortizedDeductedByCoupons")
        public Double previouslyAmortizedDeductedByCoupons;

        /**
         * <p>The amount deducted by using prepaid cards and allocated before the current allocation month.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PreviouslyAmortizedDeductedByPrepaidCard")
        public Double previouslyAmortizedDeductedByPrepaidCard;

        /**
         * <p>The expenditure amount allocated before the current allocation month. Invoicing is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PreviouslyAmortizedExpenditureAmount")
        public Double previouslyAmortizedExpenditureAmount;

        /**
         * <p>The discount amount allocated before the current allocation month.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PreviouslyAmortizedInvoiceDiscount")
        public Double previouslyAmortizedInvoiceDiscount;

        /**
         * <p>The pretax amount allocated before the current allocation month.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PreviouslyAmortizedPretaxAmount")
        public Double previouslyAmortizedPretaxAmount;

        /**
         * <p>The pretax gross amount allocated before the current allocation month.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PreviouslyAmortizedPretaxGrossAmount")
        public Double previouslyAmortizedPretaxGrossAmount;

        /**
         * <p>The round-off amount allocated before the current allocation month.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PreviouslyAmortizedRoundDownDiscount")
        public Double previouslyAmortizedRoundDownDiscount;

        /**
         * <p>The code of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The specific service resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ApsaraDB RDS</p>
         */
        @NameInMap("ProductDetail")
        public String productDetail;

        /**
         * <p>The code of the specific service resource.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("ProductDetailCode")
        public String productDetailCode;

        /**
         * <p>The name of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>ApsaraDB RDS</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>The amount deducted by using vouchers and to be allocated to one or more future allocation months.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RemainingAmortizationDeductedByCashCoupons")
        public Double remainingAmortizationDeductedByCashCoupons;

        /**
         * <p>The amount deducted by using coupons and to be allocated to one or more future allocation months.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RemainingAmortizationDeductedByCoupons")
        public Double remainingAmortizationDeductedByCoupons;

        /**
         * <p>The amount deducted by using prepaid cards and to be allocated to one or more future allocation months.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RemainingAmortizationDeductedByPrepaidCard")
        public Double remainingAmortizationDeductedByPrepaidCard;

        /**
         * <p>The expenditure amount to be allocated to one or more future allocation months. Invoicing is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RemainingAmortizationExpenditureAmount")
        public Double remainingAmortizationExpenditureAmount;

        /**
         * <p>The discount amount to be allocated to one or more future allocation months.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RemainingAmortizationInvoiceDiscount")
        public Double remainingAmortizationInvoiceDiscount;

        /**
         * <p>The pretax amount to be allocated to one or more future allocation months.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RemainingAmortizationPretaxAmount")
        public Double remainingAmortizationPretaxAmount;

        /**
         * <p>The pretax gross amount to be allocated to one or more future allocation months.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RemainingAmortizationPretaxGrossAmount")
        public Double remainingAmortizationPretaxGrossAmount;

        /**
         * <p>The round-off amount to be allocated to one or more future allocation months.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RemainingAmortizationRoundDownDiscount")
        public Double remainingAmortizationRoundDownDiscount;

        /**
         * <p>The round-off amount.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RoundDownDiscount")
        public Double roundDownDiscount;

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li>Subscription: the subscription billing method</li>
         * <li>PayAsYouGo: the pay-as-you-go billing method</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayAsYouGo</p>
         */
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
        /**
         * <p>The ID of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>185766xxxx</p>
         */
        @NameInMap("AccountID")
        public String accountID;

        /**
         * <p>The name of the account.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@test.aliyunid.com">test@test.aliyunid.com</a></p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The data entries returned.</p>
         */
        @NameInMap("Items")
        public java.util.List<DescribeProductAmortizedCostByAmortizationPeriodResponseBodyDataItems> items;

        /**
         * <p>The maximum number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The position from which the results started to return. The parameter must be left empty or set to the value of the NextToken parameter returned from the last call. Otherwise, an error is returned. If this parameter is left empty, data is queried from the beginning.</p>
         * 
         * <strong>example:</strong>
         * <p>CAESEgoQCg4KCmdtdF9jcmVhdGUEARgBIkgKCQBwhGmPcAEAAAo7AzYAAAAxTDgwMDcxMjg3ZDJhNmM3ZDguTDgwMDAwMDAwMDAwMzE1MTIuTDgwMDcyZDMyZTJkYzg3N2U</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
