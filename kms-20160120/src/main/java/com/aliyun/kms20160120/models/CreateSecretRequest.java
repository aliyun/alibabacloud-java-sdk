// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateSecretRequest extends TeaModel {
    @NameInMap("SecretName")
    @Validation(required = true)
    public String secretName;

    @NameInMap("VersionId")
    @Validation(required = true)
    public String versionId;

    @NameInMap("EncryptionKeyId")
    public String encryptionKeyId;

    @NameInMap("SecretData")
    @Validation(required = true)
    public String secretData;

    @NameInMap("SecretDataType")
    public String secretDataType;

    @NameInMap("Description")
    public String description;

    @NameInMap("Tags")
    public String tags;

    public static CreateSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSecretRequest self = new CreateSecretRequest();
        return TeaModel.build(map, self);
    }

}
