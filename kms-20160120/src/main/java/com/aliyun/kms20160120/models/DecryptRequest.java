// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DecryptRequest extends TeaModel {
    @NameInMap("CiphertextBlob")
    @Validation(required = true)
    public String ciphertextBlob;

    @NameInMap("EncryptionContext")
    public java.util.Map<String, Object> encryptionContext;

    public static DecryptRequest build(java.util.Map<String, ?> map) throws Exception {
        DecryptRequest self = new DecryptRequest();
        return TeaModel.build(map, self);
    }

}
