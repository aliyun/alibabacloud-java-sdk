// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateKeyVersionRequest extends TeaModel {
    /**
     * <p>The key ID, which is the globally unique identifier of the key.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>key-hzz62f1cb66fa42qo***</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    public static CreateKeyVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKeyVersionRequest self = new CreateKeyVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateKeyVersionRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

}
