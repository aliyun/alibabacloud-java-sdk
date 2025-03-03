// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class SetFundAccountCreditAmountRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("CreditAmount")
    public String creditAmount;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CNY</p>
     */
    @NameInMap("Currency")
    public String currency;

    /**
     * <strong>example:</strong>
     * <p>1232312</p>
     */
    @NameInMap("FundAccountId")
    public Long fundAccountId;

    public static SetFundAccountCreditAmountRequest build(java.util.Map<String, ?> map) throws Exception {
        SetFundAccountCreditAmountRequest self = new SetFundAccountCreditAmountRequest();
        return TeaModel.build(map, self);
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
