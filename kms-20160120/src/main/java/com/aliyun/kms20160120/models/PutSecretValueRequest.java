// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class PutSecretValueRequest extends TeaModel {
    @NameInMap("VersionId")
    @Validation(required = true)
    public String versionId;

    @NameInMap("SecretName")
    @Validation(required = true)
    public String secretName;

    @NameInMap("SecretData")
    @Validation(required = true)
    public String secretData;

    @NameInMap("SecretDataType")
    public String secretDataType;

    @NameInMap("VersionStages")
    public String versionStages;

    public static PutSecretValueRequest build(java.util.Map<String, ?> map) throws Exception {
        PutSecretValueRequest self = new PutSecretValueRequest();
        return TeaModel.build(map, self);
    }

}
