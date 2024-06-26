// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UnfreezeAntChainAccountRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Account")
    public String account;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AntChainId")
    public String antChainId;

    public static UnfreezeAntChainAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        UnfreezeAntChainAccountRequest self = new UnfreezeAntChainAccountRequest();
        return TeaModel.build(map, self);
    }

    public UnfreezeAntChainAccountRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public UnfreezeAntChainAccountRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

}
