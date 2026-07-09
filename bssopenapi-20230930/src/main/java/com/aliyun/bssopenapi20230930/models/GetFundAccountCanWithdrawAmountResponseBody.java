// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetFundAccountCanWithdrawAmountResponseBody extends TeaModel {
    /**
     * <p>Amount withdrawable via original payment method</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("CanOriginalWithdrawAmount")
    public String canOriginalWithdrawAmount;

    /**
     * <p>Withdrawable amount = Cash balance - Transfer ledger amount - (Outstanding invoice amount + Historical months unsettled amount + Current month unsettled amount - Transfer ledger amount) - Pay-as-you-go reserved amount</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("CanWithdrawAmount")
    public String canWithdrawAmount;

    /**
     * <p>Amount not withdrawable via original payment method</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("CannotOriginalWithdrawAmount")
    public String cannotOriginalWithdrawAmount;

    /**
     * <p>Cash balance</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("CashAmount")
    public String cashAmount;

    /**
     * <p>Outstanding invoice amount</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("CreditMemoAmount")
    public String creditMemoAmount;

    /**
     * <p>Current month unsettled amount</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("CurrentMonthUnclearedAmount")
    public String currentMonthUnclearedAmount;

    /**
     * <p>Historical months unsettled amount</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("HistoryMonthUnclearedAmount")
    public String historyMonthUnclearedAmount;

    /**
     * <p>Response structure metadata</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <p>Pay-as-you-go reserved amount</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PayAsYouGoReversedAmount")
    public String payAsYouGoReversedAmount;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>DF58589C-A06C-4224-8615-7797E6474FA3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Transfer amount</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TransferAmount")
    public String transferAmount;

    public static GetFundAccountCanWithdrawAmountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFundAccountCanWithdrawAmountResponseBody self = new GetFundAccountCanWithdrawAmountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFundAccountCanWithdrawAmountResponseBody setCanOriginalWithdrawAmount(String canOriginalWithdrawAmount) {
        this.canOriginalWithdrawAmount = canOriginalWithdrawAmount;
        return this;
    }
    public String getCanOriginalWithdrawAmount() {
        return this.canOriginalWithdrawAmount;
    }

    public GetFundAccountCanWithdrawAmountResponseBody setCanWithdrawAmount(String canWithdrawAmount) {
        this.canWithdrawAmount = canWithdrawAmount;
        return this;
    }
    public String getCanWithdrawAmount() {
        return this.canWithdrawAmount;
    }

    public GetFundAccountCanWithdrawAmountResponseBody setCannotOriginalWithdrawAmount(String cannotOriginalWithdrawAmount) {
        this.cannotOriginalWithdrawAmount = cannotOriginalWithdrawAmount;
        return this;
    }
    public String getCannotOriginalWithdrawAmount() {
        return this.cannotOriginalWithdrawAmount;
    }

    public GetFundAccountCanWithdrawAmountResponseBody setCashAmount(String cashAmount) {
        this.cashAmount = cashAmount;
        return this;
    }
    public String getCashAmount() {
        return this.cashAmount;
    }

    public GetFundAccountCanWithdrawAmountResponseBody setCreditMemoAmount(String creditMemoAmount) {
        this.creditMemoAmount = creditMemoAmount;
        return this;
    }
    public String getCreditMemoAmount() {
        return this.creditMemoAmount;
    }

    public GetFundAccountCanWithdrawAmountResponseBody setCurrentMonthUnclearedAmount(String currentMonthUnclearedAmount) {
        this.currentMonthUnclearedAmount = currentMonthUnclearedAmount;
        return this;
    }
    public String getCurrentMonthUnclearedAmount() {
        return this.currentMonthUnclearedAmount;
    }

    public GetFundAccountCanWithdrawAmountResponseBody setHistoryMonthUnclearedAmount(String historyMonthUnclearedAmount) {
        this.historyMonthUnclearedAmount = historyMonthUnclearedAmount;
        return this;
    }
    public String getHistoryMonthUnclearedAmount() {
        return this.historyMonthUnclearedAmount;
    }

    public GetFundAccountCanWithdrawAmountResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public GetFundAccountCanWithdrawAmountResponseBody setPayAsYouGoReversedAmount(String payAsYouGoReversedAmount) {
        this.payAsYouGoReversedAmount = payAsYouGoReversedAmount;
        return this;
    }
    public String getPayAsYouGoReversedAmount() {
        return this.payAsYouGoReversedAmount;
    }

    public GetFundAccountCanWithdrawAmountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFundAccountCanWithdrawAmountResponseBody setTransferAmount(String transferAmount) {
        this.transferAmount = transferAmount;
        return this;
    }
    public String getTransferAmount() {
        return this.transferAmount;
    }

}
