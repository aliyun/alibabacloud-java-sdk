// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class AsymmetricDecryptRequest extends TeaModel {
    @NameInMap("CiphertextBlob")
    @Validation(required = true)
    public String ciphertextBlob;

    @NameInMap("KeyId")
    @Validation(required = true)
    public String keyId;

    @NameInMap("KeyVersionId")
    @Validation(required = true)
    public String keyVersionId;

    @NameInMap("Algorithm")
    @Validation(required = true)
    public String algorithm;

    public static AsymmetricDecryptRequest build(java.util.Map<String, ?> map) throws Exception {
        AsymmetricDecryptRequest self = new AsymmetricDecryptRequest();
        return TeaModel.build(map, self);
    }

}
