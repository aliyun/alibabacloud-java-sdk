// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateAliasRequest extends TeaModel {
    @NameInMap("AliasName")
    public String aliasName;

    @NameInMap("KeyId")
    public String keyId;

    public static UpdateAliasRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAliasRequest self = new UpdateAliasRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAliasRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public UpdateAliasRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

}
