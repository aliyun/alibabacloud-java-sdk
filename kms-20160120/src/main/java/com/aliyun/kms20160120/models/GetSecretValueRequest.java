// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetSecretValueRequest extends TeaModel {
    @NameInMap("SecretName")
    @Validation(required = true)
    public String secretName;

    @NameInMap("VersionStage")
    public String versionStage;

    @NameInMap("VersionId")
    public String versionId;

    public static GetSecretValueRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSecretValueRequest self = new GetSecretValueRequest();
        return TeaModel.build(map, self);
    }

}
