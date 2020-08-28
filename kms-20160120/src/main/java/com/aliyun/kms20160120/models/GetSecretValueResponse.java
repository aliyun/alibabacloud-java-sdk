// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetSecretValueResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SecretName")
    @Validation(required = true)
    public String secretName;

    @NameInMap("VersionId")
    @Validation(required = true)
    public String versionId;

    @NameInMap("CreateTime")
    @Validation(required = true)
    public String createTime;

    @NameInMap("SecretData")
    @Validation(required = true)
    public String secretData;

    @NameInMap("SecretDataType")
    @Validation(required = true)
    public String secretDataType;

    @NameInMap("VersionStages")
    @Validation(required = true)
    public GetSecretValueResponseVersionStages versionStages;

    public static GetSecretValueResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSecretValueResponse self = new GetSecretValueResponse();
        return TeaModel.build(map, self);
    }

    public static class GetSecretValueResponseVersionStages extends TeaModel {
        @NameInMap("VersionStage")
        @Validation(required = true)
        public java.util.List<String> versionStage;

        public static GetSecretValueResponseVersionStages build(java.util.Map<String, ?> map) throws Exception {
            GetSecretValueResponseVersionStages self = new GetSecretValueResponseVersionStages();
            return TeaModel.build(map, self);
        }

    }

}
