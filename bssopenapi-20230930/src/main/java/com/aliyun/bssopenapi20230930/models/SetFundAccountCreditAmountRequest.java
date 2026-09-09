// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class SetFundAccountCreditAmountRequest extends TeaModel {
    /**
     * <p>Specifies whether to cancel credit control. Valid values:</p>
     * <ul>
     * <li>true: Cancel credit control.</li>
     * <li>false or empty: Set credit control.</li>
     * </ul>
     * <p>When canceling credit control, CreditAmount must be set to 0.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CancelCredit")
    public String cancelCredit;

    /**
     * <p>The credit limit.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("CreditAmount")
    public String creditAmount;

    /**
     * <p>The currency of the credit limit. Currently, only CNY is supported for Chinese mainland accounts, and only USD is supported for international accounts.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CNY</p>
     */
    @NameInMap("Currency")
    public String currency;

    /**
     * <p>The fund account ID. If this parameter is not specified, the account owned by the current account is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>1232312</p>
     */
    @NameInMap("FundAccountId")
    public Long fundAccountId;

    public static SetFundAccountCreditAmountRequest build(java.util.Map<String, ?> map) throws Exception {
        SetFundAccountCreditAmountRequest self = new SetFundAccountCreditAmountRequest();
        return TeaModel.build(map, self);
    }

    public SetFundAccountCreditAmountRequest setCancelCredit(String cancelCredit) {
        this.cancelCredit = cancelCredit;
        return this;
    }
    public String getCancelCredit() {
        return this.cancelCredit;
    }

    public SetFundAccountCreditAmountRequest setCreditAmount(String creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }
    public String getCreditAmount() {
        return this.creditAmount;
    }

    public SetFundAccountCreditAmountRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public SetFundAccountCreditAmountRequest setFundAccountId(Long fundAccountId) {
        this.fundAccountId = fundAccountId;
        return this;
    }
    public Long getFundAccountId() {
        return this.fundAccountId;
    }

}
