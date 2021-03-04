// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class RotateSecretResponseBody extends TeaModel {
    @NameInMap("VersionId")
    public String versionId;

    @NameInMap("SecretName")
    public String secretName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Arn")
    public String arn;

    public static RotateSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RotateSecretResponseBody self = new RotateSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public RotateSecretResponseBody setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public RotateSecretResponseBody setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public RotateSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RotateSecretResponseBody setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

}
