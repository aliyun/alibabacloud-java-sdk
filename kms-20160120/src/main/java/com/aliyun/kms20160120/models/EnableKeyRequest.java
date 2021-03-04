// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class EnableKeyRequest extends TeaModel {
    @NameInMap("KeyId")
    public String keyId;

    public static EnableKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableKeyRequest self = new EnableKeyRequest();
        return TeaModel.build(map, self);
    }

    public EnableKeyRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

}
