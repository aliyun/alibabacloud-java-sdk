// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetFundAccountCanRecycleAmountRequest extends TeaModel {
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
     * <p>122321223</p>
     */
    @NameInMap("RecycleFromFundAccountId")
    public String recycleFromFundAccountId;

    public static GetFundAccountCanRecycleAmountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFundAccountCanRecycleAmountRequest self = new GetFundAccountCanRecycleAmountRequest();
        return TeaModel.build(map, self);
    }

    public GetFundAccountCanRecycleAmountRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public GetFundAccountCanRecycleAmountRequest setRecycleFromFundAccountId(String recycleFromFundAccountId) {
        this.recycleFromFundAccountId = recycleFromFundAccountId;
        return this;
    }
    public String getRecycleFromFundAccountId() {
        return this.recycleFromFundAccountId;
    }

}
