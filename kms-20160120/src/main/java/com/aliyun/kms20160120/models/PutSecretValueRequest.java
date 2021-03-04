// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class PutSecretValueRequest extends TeaModel {
    @NameInMap("VersionId")
    public String versionId;

    @NameInMap("SecretName")
    public String secretName;

    @NameInMap("SecretData")
    public String secretData;

    @NameInMap("SecretDataType")
    public String secretDataType;

    @NameInMap("VersionStages")
    public String versionStages;

    public static PutSecretValueRequest build(java.util.Map<String, ?> map) throws Exception {
        PutSecretValueRequest self = new PutSecretValueRequest();
        return TeaModel.build(map, self);
    }

    public PutSecretValueRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public PutSecretValueRequest setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public PutSecretValueRequest setSecretData(String secretData) {
        this.secretData = secretData;
        return this;
    }
    public String getSecretData() {
        return this.secretData;
    }

    public PutSecretValueRequest setSecretDataType(String secretDataType) {
        this.secretDataType = secretDataType;
        return this;
    }
    public String getSecretDataType() {
        return this.secretDataType;
    }

    public PutSecretValueRequest setVersionStages(String versionStages) {
        this.versionStages = versionStages;
        return this;
    }
    public String getVersionStages() {
        return this.versionStages;
    }

}
