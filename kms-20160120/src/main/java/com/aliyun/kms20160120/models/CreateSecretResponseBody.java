// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateSecretResponseBody extends TeaModel {
    @NameInMap("SecretName")
    public String secretName;

    @NameInMap("VersionId")
    public String versionId;

    @NameInMap("NextRotationDate")
    public String nextRotationDate;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecretType")
    public String secretType;

    @NameInMap("RotationInterval")
    public String rotationInterval;

    @NameInMap("ExtendedConfig")
    public String extendedConfig;

    @NameInMap("Arn")
    public String arn;

    @NameInMap("AutomaticRotation")
    public String automaticRotation;

    public static CreateSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSecretResponseBody self = new CreateSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSecretResponseBody setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public CreateSecretResponseBody setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public CreateSecretResponseBody setNextRotationDate(String nextRotationDate) {
        this.nextRotationDate = nextRotationDate;
        return this;
    }
    public String getNextRotationDate() {
        return this.nextRotationDate;
    }

    public CreateSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSecretResponseBody setSecretType(String secretType) {
        this.secretType = secretType;
        return this;
    }
    public String getSecretType() {
        return this.secretType;
    }

    public CreateSecretResponseBody setRotationInterval(String rotationInterval) {
        this.rotationInterval = rotationInterval;
        return this;
    }
    public String getRotationInterval() {
        return this.rotationInterval;
    }

    public CreateSecretResponseBody setExtendedConfig(String extendedConfig) {
        this.extendedConfig = extendedConfig;
        return this;
    }
    public String getExtendedConfig() {
        return this.extendedConfig;
    }

    public CreateSecretResponseBody setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public CreateSecretResponseBody setAutomaticRotation(String automaticRotation) {
        this.automaticRotation = automaticRotation;
        return this;
    }
    public String getAutomaticRotation() {
        return this.automaticRotation;
    }

}
