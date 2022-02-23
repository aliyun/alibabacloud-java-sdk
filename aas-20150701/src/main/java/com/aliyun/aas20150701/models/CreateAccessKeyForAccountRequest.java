// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class CreateAccessKeyForAccountRequest extends TeaModel {
    @NameInMap("AKSecret")
    public String AKSecret;

    @NameInMap("PK")
    public String PK;

    public static CreateAccessKeyForAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessKeyForAccountRequest self = new CreateAccessKeyForAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccessKeyForAccountRequest setAKSecret(String AKSecret) {
        this.AKSecret = AKSecret;
        return this;
    }
    public String getAKSecret() {
        return this.AKSecret;
    }

    public CreateAccessKeyForAccountRequest setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

}
