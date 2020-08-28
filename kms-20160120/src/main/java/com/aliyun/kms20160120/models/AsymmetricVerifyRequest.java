// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class AsymmetricVerifyRequest extends TeaModel {
    @NameInMap("KeyId")
    @Validation(required = true)
    public String keyId;

    @NameInMap("KeyVersionId")
    @Validation(required = true)
    public String keyVersionId;

    @NameInMap("Algorithm")
    @Validation(required = true)
    public String algorithm;

    @NameInMap("Digest")
    @Validation(required = true)
    public String digest;

    @NameInMap("Value")
    @Validation(required = true)
    public String value;

    public static AsymmetricVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        AsymmetricVerifyRequest self = new AsymmetricVerifyRequest();
        return TeaModel.build(map, self);
    }

}
