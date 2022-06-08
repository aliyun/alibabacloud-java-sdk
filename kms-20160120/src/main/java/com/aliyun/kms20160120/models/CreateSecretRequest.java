// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateSecretRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("EnableAutomaticRotation")
    public Boolean enableAutomaticRotation;

    @NameInMap("EncryptionKeyId")
    public String encryptionKeyId;

    @NameInMap("ExtendedConfig")
    public java.util.Map<String, ?> extendedConfig;

    @NameInMap("RotationInterval")
    public String rotationInterval;

    @NameInMap("SecretData")
    public String secretData;

    @NameInMap("SecretDataType")
    public String secretDataType;

    @NameInMap("SecretName")
    public String secretName;

    @NameInMap("SecretType")
    public String secretType;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("VersionId")
    public String versionId;

    public static CreateSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSecretRequest self = new CreateSecretRequest();
        return TeaModel.build(map, self);
    }

    public CreateSecretRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSecretRequest setEnableAutomaticRotation(Boolean enableAutomaticRotation) {
        this.enableAutomaticRotation = enableAutomaticRotation;
        return this;
    }
    public Boolean getEnableAutomaticRotation() {
        return this.enableAutomaticRotation;
    }

    public CreateSecretRequest setEncryptionKeyId(String encryptionKeyId) {
        this.encryptionKeyId = encryptionKeyId;
        return this;
    }
    public String getEncryptionKeyId() {
        return this.encryptionKeyId;
    }

    public CreateSecretRequest setExtendedConfig(java.util.Map<String, ?> extendedConfig) {
        this.extendedConfig = extendedConfig;
        return this;
    }
    public java.util.Map<String, ?> getExtendedConfig() {
        return this.extendedConfig;
    }

    public CreateSecretRequest setRotationInterval(String rotationInterval) {
        this.rotationInterval = rotationInterval;
        return this;
    }
    public String getRotationInterval() {
        return this.rotationInterval;
    }

    public CreateSecretRequest setSecretData(String secretData) {
        this.secretData = secretData;
        return this;
    }
    public String getSecretData() {
        return this.secretData;
    }

    public CreateSecretRequest setSecretDataType(String secretDataType) {
        this.secretDataType = secretDataType;
        return this;
    }
    public String getSecretDataType() {
        return this.secretDataType;
    }

    public CreateSecretRequest setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public CreateSecretRequest setSecretType(String secretType) {
        this.secretType = secretType;
        return this;
    }
    public String getSecretType() {
        return this.secretType;
    }

    public CreateSecretRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public CreateSecretRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
