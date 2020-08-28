// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateSecretResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Arn")
    @Validation(required = true)
    public String arn;

    @NameInMap("VersionId")
    @Validation(required = true)
    public String versionId;

    @NameInMap("SecretName")
    @Validation(required = true)
    public String secretName;

    public static CreateSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSecretResponse self = new CreateSecretResponse();
        return TeaModel.build(map, self);
    }

}
