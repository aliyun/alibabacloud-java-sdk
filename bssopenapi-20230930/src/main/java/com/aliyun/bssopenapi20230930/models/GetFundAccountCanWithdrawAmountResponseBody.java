// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetFundAccountCanWithdrawAmountResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("CanOriginalWithdrawAmount")
    public String canOriginalWithdrawAmount;

    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("CanWithdrawAmount")
    public String canWithdrawAmount;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("CannotOriginalWithdrawAmount")
    public String cannotOriginalWithdrawAmount;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("CashAmount")
    public String cashAmount;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("CreditMemoAmount")
    public String creditMemoAmount;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("CurrentMonthUnclearedAmount")
    public String currentMonthUnclearedAmount;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("HistoryMonthUnclearedAmount")
    public String historyMonthUnclearedAmount;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PayAsYouGoReversedAmount")
    public String payAsYouGoReversedAmount;

    /**
     * <strong>example:</strong>
     * <p>DF58589C-A06C-4224-8615-7797E6474FA3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
