// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetFundAccountCanWithdrawAmountRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123212232</p>
     */
    @NameInMap("FundAccountId")
    public Long fundAccountId;

    public static GetFundAccountCanWithdrawAmountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFundAccountCanWithdrawAmountRequest self = new GetFundAccountCanWithdrawAmountRequest();
        return TeaModel.build(map, self);
    }

    public GetFundAccountCanWithdrawAmountRequest setFundAccountId(Long fundAccountId) {
        this.fundAccountId = fundAccountId;
        return this;
    }
    public Long getFundAccountId() {
        return this.fundAccountId;
    }

}
