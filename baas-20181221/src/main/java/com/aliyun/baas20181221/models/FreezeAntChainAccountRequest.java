// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class FreezeAntChainAccountRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>accountname</p>
     */
    @NameInMap("Account")
    public String account;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1q8B5R9p</p>
     */
    @NameInMap("AntChainId")
    public String antChainId;

    public static FreezeAntChainAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        FreezeAntChainAccountRequest self = new FreezeAntChainAccountRequest();
        return TeaModel.build(map, self);
    }

    public FreezeAntChainAccountRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public FreezeAntChainAccountRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

}
