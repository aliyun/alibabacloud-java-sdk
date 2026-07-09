// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetFundAccountLowAvailableAmountAlarmRequest extends TeaModel {
    /**
     * <p>Fund account ID. If not specified, the account ID owned by the current account is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>12332112</p>
     */
    @NameInMap("FundAccountId")
    public Long fundAccountId;

    public static GetFundAccountLowAvailableAmountAlarmRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFundAccountLowAvailableAmountAlarmRequest self = new GetFundAccountLowAvailableAmountAlarmRequest();
        return TeaModel.build(map, self);
    }

    public GetFundAccountLowAvailableAmountAlarmRequest setFundAccountId(Long fundAccountId) {
        this.fundAccountId = fundAccountId;
        return this;
    }
    public Long getFundAccountId() {
        return this.fundAccountId;
    }

}
