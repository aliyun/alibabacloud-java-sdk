// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class EncryptResponse extends TeaModel {
    @NameInMap("CiphertextBlob")
    @Validation(required = true)
    public String ciphertextBlob;

    @NameInMap("KeyId")
    @Validation(required = true)
    public String keyId;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("KeyVersionId")
    @Validation(required = true)
    public String keyVersionId;

    public static EncryptResponse build(java.util.Map<String, ?> map) throws Exception {
        EncryptResponse self = new EncryptResponse();
        return TeaModel.build(map, self);
    }

}
