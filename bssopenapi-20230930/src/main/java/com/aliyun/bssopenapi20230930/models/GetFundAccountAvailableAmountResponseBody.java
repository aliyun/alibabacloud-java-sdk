// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetFundAccountAvailableAmountResponseBody extends TeaModel {
    /**
     * <p>Available amount</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("AvailableAmount")
    public String availableAmount;

    /**
     * <p>Available credit amount</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("AvailableCreditAmount")
    public String availableCreditAmount;

    /**
     * <p>Bank acceptance bill amount</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BankAcceptanceAmount")
    public String bankAcceptanceAmount;

    /**
     * <p>Cash balance</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("CashAmount")
    public String cashAmount;

    /**
     * <p>Credit quota</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("CreditAmount")
    public String creditAmount;

    /**
     * <p>Credit refund balance</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CreditRefundAmount")
    public String creditRefundAmount;

    /**
     * <p>Indicates whether credit control is enabled</p>
     */
    @NameInMap("CreditUser")
    public Boolean creditUser;

    /**
     * <p>Currency</p>
     * 
     * <strong>example:</strong>
     * <p>CNY</p>
     */
    @NameInMap("Currency")
    public String currency;

    /**
     * <p>Current month uncleared amount</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("CurrentMonthUnclearedAmount")
    public String currentMonthUnclearedAmount;

    /**
     * <p>Extended ledger list</p>
     */
    @NameInMap("ExtendLedgerList")
    public java.util.List<GetFundAccountAvailableAmountResponseBodyExtendLedgerList> extendLedgerList;

    /**
     * <p>Account ID</p>
     * 
     * <strong>example:</strong>
     * <p>12332112</p>
     */
    @NameInMap("FundAccountId")
    public String fundAccountId;

    /**
     * <p>Account ID of the fund account owner</p>
     * 
     * <strong>example:</strong>
     * <p>1344312434</p>
     */
    @NameInMap("FundAccountOwnerAccountId")
    public String fundAccountOwnerAccountId;

    /**
     * <p>Account status</p>
     * 
     * <strong>example:</strong>
     * <p>valid</p>
     */
    @NameInMap("FundAccountStatus")
    public String fundAccountStatus;

    /**
     * <p>Fund account type. Valid values:
     * DIRECT_USER: Alibaba Cloud direct customer account.
     * RESELLER_QUOTA: ecosystem account.</p>
     * 
     * <strong>example:</strong>
     * <p>REDIRECT_USER</p>
     */
    @NameInMap("FundAccountType")
    public String fundAccountType;

    /**
     * <p>Historical months uncleared amount</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("HistoryMonthUnclearedAmount")
    public String historyMonthUnclearedAmount;

    /**
     * <p>Response metadata</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <p>Negative bill amount</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NegativeBillAmount")
    public String negativeBillAmount;

    /**
     * <p>Original cash ledger list. International site users may have cash ledgers in multiple currencies.</p>
     */
    @NameInMap("OriginalCashAmountList")
    public java.util.List<GetFundAccountAvailableAmountResponseBodyOriginalCashAmountList> originalCashAmountList;

    /**
     * <p>Ecosystem end customer quota</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("QuotaAmount")
    public String quotaAmount;

    /**
     * <p>Consumed quota of ecosystem end customer</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("QuotaConsumedAmount")
    public String quotaConsumedAmount;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>F96A2D13-7509-5DF9-A60E-E7E3A3CB68E8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Uncleared amount (current month uncleared + historical months uncleared)</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("UnclearedAmount")
    public String unclearedAmount;

    public static GetFundAccountAvailableAmountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFundAccountAvailableAmountResponseBody self = new GetFundAccountAvailableAmountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFundAccountAvailableAmountResponseBody setAvailableAmount(String availableAmount) {
        this.availableAmount = availableAmount;
        return this;
    }
    public String getAvailableAmount() {
        return this.availableAmount;
    }

    public GetFundAccountAvailableAmountResponseBody setAvailableCreditAmount(String availableCreditAmount) {
        this.availableCreditAmount = availableCreditAmount;
        return this;
    }
    public String getAvailableCreditAmount() {
        return this.availableCreditAmount;
    }

    public GetFundAccountAvailableAmountResponseBody setBankAcceptanceAmount(String bankAcceptanceAmount) {
        this.bankAcceptanceAmount = bankAcceptanceAmount;
        return this;
    }
    public String getBankAcceptanceAmount() {
        return this.bankAcceptanceAmount;
    }

    public GetFundAccountAvailableAmountResponseBody setCashAmount(String cashAmount) {
        this.cashAmount = cashAmount;
        return this;
    }
    public String getCashAmount() {
        return this.cashAmount;
    }

    public GetFundAccountAvailableAmountResponseBody setCreditAmount(String creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }
    public String getCreditAmount() {
        return this.creditAmount;
    }

    public GetFundAccountAvailableAmountResponseBody setCreditRefundAmount(String creditRefundAmount) {
        this.creditRefundAmount = creditRefundAmount;
        return this;
    }
    public String getCreditRefundAmount() {
        return this.creditRefundAmount;
    }

    public GetFundAccountAvailableAmountResponseBody setCreditUser(Boolean creditUser) {
        this.creditUser = creditUser;
        return this;
    }
    public Boolean getCreditUser() {
        return this.creditUser;
    }

    public GetFundAccountAvailableAmountResponseBody setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public GetFundAccountAvailableAmountResponseBody setCurrentMonthUnclearedAmount(String currentMonthUnclearedAmount) {
        this.currentMonthUnclearedAmount = currentMonthUnclearedAmount;
        return this;
    }
    public String getCurrentMonthUnclearedAmount() {
        return this.currentMonthUnclearedAmount;
    }

    public GetFundAccountAvailableAmountResponseBody setExtendLedgerList(java.util.List<GetFundAccountAvailableAmountResponseBodyExtendLedgerList> extendLedgerList) {
        this.extendLedgerList = extendLedgerList;
        return this;
    }
    public java.util.List<GetFundAccountAvailableAmountResponseBodyExtendLedgerList> getExtendLedgerList() {
        return this.extendLedgerList;
    }

    public GetFundAccountAvailableAmountResponseBody setFundAccountId(String fundAccountId) {
        this.fundAccountId = fundAccountId;
        return this;
    }
    public String getFundAccountId() {
        return this.fundAccountId;
    }

    public GetFundAccountAvailableAmountResponseBody setFundAccountOwnerAccountId(String fundAccountOwnerAccountId) {
        this.fundAccountOwnerAccountId = fundAccountOwnerAccountId;
        return this;
    }
    public String getFundAccountOwnerAccountId() {
        return this.fundAccountOwnerAccountId;
    }

    public GetFundAccountAvailableAmountResponseBody setFundAccountStatus(String fundAccountStatus) {
        this.fundAccountStatus = fundAccountStatus;
        return this;
    }
    public String getFundAccountStatus() {
        return this.fundAccountStatus;
    }

    public GetFundAccountAvailableAmountResponseBody setFundAccountType(String fundAccountType) {
        this.fundAccountType = fundAccountType;
        return this;
    }
    public String getFundAccountType() {
        return this.fundAccountType;
    }

    public GetFundAccountAvailableAmountResponseBody setHistoryMonthUnclearedAmount(String historyMonthUnclearedAmount) {
        this.historyMonthUnclearedAmount = historyMonthUnclearedAmount;
        return this;
    }
    public String getHistoryMonthUnclearedAmount() {
        return this.historyMonthUnclearedAmount;
    }

    public GetFundAccountAvailableAmountResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public GetFundAccountAvailableAmountResponseBody setNegativeBillAmount(String negativeBillAmount) {
        this.negativeBillAmount = negativeBillAmount;
        return this;
    }
    public String getNegativeBillAmount() {
        return this.negativeBillAmount;
    }

    public GetFundAccountAvailableAmountResponseBody setOriginalCashAmountList(java.util.List<GetFundAccountAvailableAmountResponseBodyOriginalCashAmountList> originalCashAmountList) {
        this.originalCashAmountList = originalCashAmountList;
        return this;
    }
    public java.util.List<GetFundAccountAvailableAmountResponseBodyOriginalCashAmountList> getOriginalCashAmountList() {
        return this.originalCashAmountList;
    }

    public GetFundAccountAvailableAmountResponseBody setQuotaAmount(String quotaAmount) {
        this.quotaAmount = quotaAmount;
        return this;
    }
    public String getQuotaAmount() {
        return this.quotaAmount;
    }

    public GetFundAccountAvailableAmountResponseBody setQuotaConsumedAmount(String quotaConsumedAmount) {
        this.quotaConsumedAmount = quotaConsumedAmount;
        return this;
    }
    public String getQuotaConsumedAmount() {
        return this.quotaConsumedAmount;
    }

    public GetFundAccountAvailableAmountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFundAccountAvailableAmountResponseBody setUnclearedAmount(String unclearedAmount) {
        this.unclearedAmount = unclearedAmount;
        return this;
    }
    public String getUnclearedAmount() {
        return this.unclearedAmount;
    }

    public static class GetFundAccountAvailableAmountResponseBodyExtendLedgerList extends TeaModel {
        /**
         * <p>Currency of the ledger amount, such as CNY and USD.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>Ledger name</p>
         * 
         * <strong>example:</strong>
         * <p>应付对冲账本</p>
         */
        @NameInMap("LedgerName")
        public String ledgerName;

        /**
         * <p>Ledger balance</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("OriginalAmount")
        public String originalAmount;

        public static GetFundAccountAvailableAmountResponseBodyExtendLedgerList build(java.util.Map<String, ?> map) throws Exception {
            GetFundAccountAvailableAmountResponseBodyExtendLedgerList self = new GetFundAccountAvailableAmountResponseBodyExtendLedgerList();
            return TeaModel.build(map, self);
        }

        public GetFundAccountAvailableAmountResponseBodyExtendLedgerList setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GetFundAccountAvailableAmountResponseBodyExtendLedgerList setLedgerName(String ledgerName) {
            this.ledgerName = ledgerName;
            return this;
        }
        public String getLedgerName() {
            return this.ledgerName;
        }

        public GetFundAccountAvailableAmountResponseBodyExtendLedgerList setOriginalAmount(String originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public String getOriginalAmount() {
            return this.originalAmount;
        }

    }

    public static class GetFundAccountAvailableAmountResponseBodyOriginalCashAmountList extends TeaModel {
        /**
         * <p>Amount</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Amount")
        public String amount;

        /**
         * <p>Currency</p>
         * 
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("Currency")
        public String currency;

        public static GetFundAccountAvailableAmountResponseBodyOriginalCashAmountList build(java.util.Map<String, ?> map) throws Exception {
            GetFundAccountAvailableAmountResponseBodyOriginalCashAmountList self = new GetFundAccountAvailableAmountResponseBodyOriginalCashAmountList();
            return TeaModel.build(map, self);
        }

        public GetFundAccountAvailableAmountResponseBodyOriginalCashAmountList setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public GetFundAccountAvailableAmountResponseBodyOriginalCashAmountList setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

    }

}
