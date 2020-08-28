// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class AsymmetricEncryptRequest extends TeaModel {
    @NameInMap("Plaintext")
    @Validation(required = true)
    public String plaintext;

    @NameInMap("KeyId")
    @Validation(required = true)
    public String keyId;

    @NameInMap("KeyVersionId")
    @Validation(required = true)
    public String keyVersionId;

    @NameInMap("Algorithm")
    @Validation(required = true)
    public String algorithm;

    public static AsymmetricEncryptRequest build(java.util.Map<String, ?> map) throws Exception {
        AsymmetricEncryptRequest self = new AsymmetricEncryptRequest();
        return TeaModel.build(map, self);
    }

}
