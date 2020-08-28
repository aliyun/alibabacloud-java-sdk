// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class PutSecretValueResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SecretName")
    @Validation(required = true)
    public String secretName;

    @NameInMap("VersionId")
    @Validation(required = true)
    public String versionId;

    @NameInMap("VersionStages")
    @Validation(required = true)
    public PutSecretValueResponseVersionStages versionStages;

    public static PutSecretValueResponse build(java.util.Map<String, ?> map) throws Exception {
        PutSecretValueResponse self = new PutSecretValueResponse();
        return TeaModel.build(map, self);
    }

    public static class PutSecretValueResponseVersionStages extends TeaModel {
        @NameInMap("VersionStage")
        @Validation(required = true)
        public java.util.List<String> versionStage;

        public static PutSecretValueResponseVersionStages build(java.util.Map<String, ?> map) throws Exception {
            PutSecretValueResponseVersionStages self = new PutSecretValueResponseVersionStages();
            return TeaModel.build(map, self);
        }

    }

}
