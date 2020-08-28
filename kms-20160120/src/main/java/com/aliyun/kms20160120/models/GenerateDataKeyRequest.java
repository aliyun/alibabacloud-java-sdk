// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GenerateDataKeyRequest extends TeaModel {
    @NameInMap("KeyId")
    @Validation(required = true)
    public String keyId;

    @NameInMap("KeySpec")
    public String keySpec;

    @NameInMap("NumberOfBytes")
    public Integer numberOfBytes;

    @NameInMap("EncryptionContext")
    public java.util.Map<String, Object> encryptionContext;

    public static GenerateDataKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateDataKeyRequest self = new GenerateDataKeyRequest();
        return TeaModel.build(map, self);
    }

}
