// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetFundAccountAvailableAmountRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12332112</p>
     */
    @NameInMap("FundAccountId")
    public String fundAccountId;

    public static GetFundAccountAvailableAmountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFundAccountAvailableAmountRequest self = new GetFundAccountAvailableAmountRequest();
        return TeaModel.build(map, self);
    }

    public GetFundAccountAvailableAmountRequest setFundAccountId(String fundAccountId) {
        this.fundAccountId = fundAccountId;
        return this;
    }
    public String getFundAccountId() {
        return this.fundAccountId;
    }

}
