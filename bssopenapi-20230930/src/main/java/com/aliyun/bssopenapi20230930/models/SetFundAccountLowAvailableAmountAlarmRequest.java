// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class SetFundAccountLowAvailableAmountAlarmRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12321213</p>
     */
    @NameInMap("FundAccountId")
    public Long fundAccountId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ThresholdAmount")
    public String thresholdAmount;

    public static SetFundAccountLowAvailableAmountAlarmRequest build(java.util.Map<String, ?> map) throws Exception {
        SetFundAccountLowAvailableAmountAlarmRequest self = new SetFundAccountLowAvailableAmountAlarmRequest();
        return TeaModel.build(map, self);
    }

    public SetFundAccountLowAvailableAmountAlarmRequest setFundAccountId(Long fundAccountId) {
        this.fundAccountId = fundAccountId;
        return this;
    }
    public Long getFundAccountId() {
        return this.fundAccountId;
    }

    public SetFundAccountLowAvailableAmountAlarmRequest setThresholdAmount(String thresholdAmount) {
        this.thresholdAmount = thresholdAmount;
        return this;
    }
    public String getThresholdAmount() {
        return this.thresholdAmount;
    }

}
