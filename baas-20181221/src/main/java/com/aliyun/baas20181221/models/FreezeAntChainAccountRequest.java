// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class FreezeAntChainAccountRequest extends TeaModel {
    @NameInMap("AntChainId")
    public String antChainId;

    @NameInMap("Account")
    public String account;

    public static FreezeAntChainAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        FreezeAntChainAccountRequest self = new FreezeAntChainAccountRequest();
        return TeaModel.build(map, self);
    }

    public FreezeAntChainAccountRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public FreezeAntChainAccountRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

}
