// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CancelFundAccountLowAvailableAmountAlarmRequest extends TeaModel {
    /**
     * <p>The ID of the fund account. If this parameter is not specified, the ID of the account owned by the current account is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>123321123</p>
     */
    @NameInMap("FundAccountId")
    public Long fundAccountId;

    public static CancelFundAccountLowAvailableAmountAlarmRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelFundAccountLowAvailableAmountAlarmRequest self = new CancelFundAccountLowAvailableAmountAlarmRequest();
        return TeaModel.build(map, self);
    }

    public CancelFundAccountLowAvailableAmountAlarmRequest setFundAccountId(Long fundAccountId) {
        this.fundAccountId = fundAccountId;
        return this;
    }
    public Long getFundAccountId() {
        return this.fundAccountId;
    }

}
