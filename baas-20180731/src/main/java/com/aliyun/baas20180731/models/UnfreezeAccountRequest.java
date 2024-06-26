// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UnfreezeAccountRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("Bizid")
    public String bizid;

    public static UnfreezeAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        UnfreezeAccountRequest self = new UnfreezeAccountRequest();
        return TeaModel.build(map, self);
    }

    public UnfreezeAccountRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public UnfreezeAccountRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
