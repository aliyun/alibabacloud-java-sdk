// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetFundAccountCanTransferAmountRequest extends TeaModel {
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
     * <p>123212</p>
     */
    @NameInMap("FundAccountId")
    public String fundAccountId;

    public static GetFundAccountCanTransferAmountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFundAccountCanTransferAmountRequest self = new GetFundAccountCanTransferAmountRequest();
        return TeaModel.build(map, self);
    }

    public GetFundAccountCanTransferAmountRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public GetFundAccountCanTransferAmountRequest setFundAccountId(String fundAccountId) {
        this.fundAccountId = fundAccountId;
        return this;
    }
    public String getFundAccountId() {
        return this.fundAccountId;
    }

}
