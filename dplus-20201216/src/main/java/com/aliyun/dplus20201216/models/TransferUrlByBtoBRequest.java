// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dplus20201216.models;

import com.aliyun.tea.*;

public class TransferUrlByBtoBRequest extends TeaModel {
    @NameInMap("OfferId")
    public Long offerId;

    @NameInMap("Pid")
    public String pid;

    public static TransferUrlByBtoBRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferUrlByBtoBRequest self = new TransferUrlByBtoBRequest();
        return TeaModel.build(map, self);
    }

    public TransferUrlByBtoBRequest setOfferId(Long offerId) {
        this.offerId = offerId;
        return this;
    }
    public Long getOfferId() {
        return this.offerId;
    }

    public TransferUrlByBtoBRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

}
