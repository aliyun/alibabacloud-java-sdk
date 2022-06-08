// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateAliasRequest extends TeaModel {
    @NameInMap("AliasName")
    public String aliasName;

    @NameInMap("KeyId")
    public String keyId;

    public static CreateAliasRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAliasRequest self = new CreateAliasRequest();
        return TeaModel.build(map, self);
    }

    public CreateAliasRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public CreateAliasRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

}
