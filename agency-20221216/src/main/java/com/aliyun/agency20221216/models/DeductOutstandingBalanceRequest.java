// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class DeductOutstandingBalanceRequest extends TeaModel {
    @NameInMap("DeductAmount")
    public String deductAmount;

    @NameInMap("Uid")
    public Long uid;

    public static DeductOutstandingBalanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeductOutstandingBalanceRequest self = new DeductOutstandingBalanceRequest();
        return TeaModel.build(map, self);
    }

    public DeductOutstandingBalanceRequest setDeductAmount(String deductAmount) {
        this.deductAmount = deductAmount;
        return this;
    }
    public String getDeductAmount() {
        return this.deductAmount;
    }

    public DeductOutstandingBalanceRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
