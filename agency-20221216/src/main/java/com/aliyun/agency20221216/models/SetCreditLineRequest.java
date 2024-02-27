// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class SetCreditLineRequest extends TeaModel {
    /**
     * <p>New Credit Line</p>
     */
    @NameInMap("CreditLine")
    public String creditLine;

    /**
     * <p>The UID of Sub Account.</p>
     */
    @NameInMap("Uid")
    public Long uid;

    public static SetCreditLineRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCreditLineRequest self = new SetCreditLineRequest();
        return TeaModel.build(map, self);
    }

    public SetCreditLineRequest setCreditLine(String creditLine) {
        this.creditLine = creditLine;
        return this;
    }
    public String getCreditLine() {
        return this.creditLine;
    }

    public SetCreditLineRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
