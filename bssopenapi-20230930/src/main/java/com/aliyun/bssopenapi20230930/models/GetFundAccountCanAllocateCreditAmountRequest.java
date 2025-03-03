// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetFundAccountCanAllocateCreditAmountRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1233231</p>
     */
    @NameInMap("FundAccountId")
    public Long fundAccountId;

    public static GetFundAccountCanAllocateCreditAmountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFundAccountCanAllocateCreditAmountRequest self = new GetFundAccountCanAllocateCreditAmountRequest();
        return TeaModel.build(map, self);
    }

    public GetFundAccountCanAllocateCreditAmountRequest setFundAccountId(Long fundAccountId) {
        this.fundAccountId = fundAccountId;
        return this;
    }
    public Long getFundAccountId() {
        return this.fundAccountId;
    }

}
