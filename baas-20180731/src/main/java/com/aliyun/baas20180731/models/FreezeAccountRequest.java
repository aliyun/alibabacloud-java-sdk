// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class FreezeAccountRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("Bizid")
    public String bizid;

    public static FreezeAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        FreezeAccountRequest self = new FreezeAccountRequest();
        return TeaModel.build(map, self);
    }

    public FreezeAccountRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public FreezeAccountRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
