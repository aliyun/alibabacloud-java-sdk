// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ImportKeyMaterialRequest extends TeaModel {
    @NameInMap("KeyId")
    @Validation(required = true)
    public String keyId;

    @NameInMap("EncryptedKeyMaterial")
    @Validation(required = true)
    public String encryptedKeyMaterial;

    @NameInMap("ImportToken")
    @Validation(required = true)
    public String importToken;

    @NameInMap("KeyMaterialExpireUnix")
    @Validation(required = true)
    public Long keyMaterialExpireUnix;

    public static ImportKeyMaterialRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportKeyMaterialRequest self = new ImportKeyMaterialRequest();
        return TeaModel.build(map, self);
    }

}
