// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateAntChainKmsAccountNewRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>accountname</p>
     */
    @NameInMap("Account")
    public String account;

    /**
     * <strong>example:</strong>
     * <p>8bd720bde18c4b37b0f4a1c7834db163</p>
     */
    @NameInMap("AntChainId")
    public String antChainId;

    public static CreateAntChainKmsAccountNewRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAntChainKmsAccountNewRequest self = new CreateAntChainKmsAccountNewRequest();
        return TeaModel.build(map, self);
    }

    public CreateAntChainKmsAccountNewRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public CreateAntChainKmsAccountNewRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

}
