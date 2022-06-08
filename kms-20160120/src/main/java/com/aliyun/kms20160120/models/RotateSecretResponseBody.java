// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class RotateSecretResponseBody extends TeaModel {
    @NameInMap("Arn")
    public String arn;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecretName")
    public String secretName;

    @NameInMap("VersionId")
    public String versionId;

    public static RotateSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RotateSecretResponseBody self = new RotateSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public RotateSecretResponseBody setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public RotateSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RotateSecretResponseBody setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public RotateSecretResponseBody setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
