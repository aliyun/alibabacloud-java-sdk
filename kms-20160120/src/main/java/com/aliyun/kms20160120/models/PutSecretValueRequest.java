// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class PutSecretValueRequest extends TeaModel {
    /**
     * <p>The secret value. The value is encrypted and then stored in the new version.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SecretData")
    public String secretData;

    /**
     * <p>The type of the secret value. Valid values:</p>
     * <br>
     * <p>*   text: This is the default value.</p>
     * <p>*   binary</p>
     */
    @NameInMap("SecretDataType")
    public String secretDataType;

    /**
     * <p>The name of the secret.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    /**
     * <p>The new version of the secret value. Version numbers must be unique in each secret.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    /**
     * <p>The stage labels that are used to mark the new version. If you do not specify this parameter, Secrets Manager marks the new version with ACSCurrent.</p>
     */
    @NameInMap("VersionStages")
    public String versionStages;

    public static PutSecretValueRequest build(java.util.Map<String, ?> map) throws Exception {
        PutSecretValueRequest self = new PutSecretValueRequest();
        return TeaModel.build(map, self);
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

    public PutSecretValueRequest setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public PutSecretValueRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public PutSecretValueRequest setVersionStages(String versionStages) {
        this.versionStages = versionStages;
        return this;
    }
    public String getVersionStages() {
        return this.versionStages;
    }

}
