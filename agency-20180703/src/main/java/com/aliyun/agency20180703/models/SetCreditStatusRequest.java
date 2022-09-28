// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class SetCreditStatusRequest extends TeaModel {
    @NameInMap("CreditStatus")
    public Long creditStatus;

    @NameInMap("Uid")
    public Long uid;

    public static SetCreditStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCreditStatusRequest self = new SetCreditStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetCreditStatusRequest setCreditStatus(Long creditStatus) {
        this.creditStatus = creditStatus;
        return this;
    }
    public Long getCreditStatus() {
        return this.creditStatus;
    }

    public SetCreditStatusRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
