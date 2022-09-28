// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class SetCreditLimitStatusRequest extends TeaModel {
    @NameInMap("CreditStatus")
    public Long creditStatus;

    @NameInMap("Uid")
    public Long uid;

    public static SetCreditLimitStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCreditLimitStatusRequest self = new SetCreditLimitStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetCreditLimitStatusRequest setCreditStatus(Long creditStatus) {
        this.creditStatus = creditStatus;
        return this;
    }
    public Long getCreditStatus() {
        return this.creditStatus;
    }

    public SetCreditLimitStatusRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
