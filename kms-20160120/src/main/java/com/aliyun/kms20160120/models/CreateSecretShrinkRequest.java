// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateSecretShrinkRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("EnableAutomaticRotation")
    public Boolean enableAutomaticRotation;

    @NameInMap("EncryptionKeyId")
    public String encryptionKeyId;

    @NameInMap("ExtendedConfig")
    public String extendedConfigShrink;

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

    public static CreateSecretShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSecretShrinkRequest self = new CreateSecretShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSecretShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSecretShrinkRequest setEnableAutomaticRotation(Boolean enableAutomaticRotation) {
        this.enableAutomaticRotation = enableAutomaticRotation;
        return this;
    }
    public Boolean getEnableAutomaticRotation() {
        return this.enableAutomaticRotation;
    }

    public CreateSecretShrinkRequest setEncryptionKeyId(String encryptionKeyId) {
        this.encryptionKeyId = encryptionKeyId;
        return this;
    }
    public String getEncryptionKeyId() {
        return this.encryptionKeyId;
    }

    public CreateSecretShrinkRequest setExtendedConfigShrink(String extendedConfigShrink) {
        this.extendedConfigShrink = extendedConfigShrink;
        return this;
    }
    public String getExtendedConfigShrink() {
        return this.extendedConfigShrink;
    }

    public CreateSecretShrinkRequest setRotationInterval(String rotationInterval) {
        this.rotationInterval = rotationInterval;
        return this;
    }
    public String getRotationInterval() {
        return this.rotationInterval;
    }

    public CreateSecretShrinkRequest setSecretData(String secretData) {
        this.secretData = secretData;
        return this;
    }
    public String getSecretData() {
        return this.secretData;
    }

    public CreateSecretShrinkRequest setSecretDataType(String secretDataType) {
        this.secretDataType = secretDataType;
        return this;
    }
    public String getSecretDataType() {
        return this.secretDataType;
    }

    public CreateSecretShrinkRequest setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public CreateSecretShrinkRequest setSecretType(String secretType) {
        this.secretType = secretType;
        return this;
    }
    public String getSecretType() {
        return this.secretType;
    }

    public CreateSecretShrinkRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public CreateSecretShrinkRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
