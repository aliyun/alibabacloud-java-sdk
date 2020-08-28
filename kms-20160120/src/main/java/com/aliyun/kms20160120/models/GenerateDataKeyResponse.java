// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GenerateDataKeyResponse extends TeaModel {
    @NameInMap("CiphertextBlob")
    @Validation(required = true)
    public String ciphertextBlob;

    @NameInMap("KeyId")
    @Validation(required = true)
    public String keyId;

    @NameInMap("Plaintext")
    @Validation(required = true)
    public String plaintext;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("KeyVersionId")
    @Validation(required = true)
    public String keyVersionId;

    public static GenerateDataKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateDataKeyResponse self = new GenerateDataKeyResponse();
        return TeaModel.build(map, self);
    }

}
