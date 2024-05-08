// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateSecretShrinkRequest extends TeaModel {
    /**
     * <p>The version number of the secret.</p>
     */
    @NameInMap("DKMSInstanceId")
    public String DKMSInstanceId;

    /**
     * <p>Specifies whether to enable automatic rotation. Valid values:</p>
     * <br>
     * <p>*   true: specifies to enable automatic rotation.</p>
     * <p>*   false: specifies to disable automatic rotation. This is the default value.</p>
     * <br>
     * <p>>  This parameter is valid if you set the SecretType parameter to Rds, RAMCredentials, or ECS.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Indicates whether automatic rotation is enabled. Valid values:</p>
     * <br>
     * <p>*   Enabled: indicates that automatic rotation is enabled.</p>
     * <p>*   Disabled: indicates that automatic rotation is disabled.</p>
     * <p>*   Invalid: indicates that the status of automatic rotation is abnormal. In this case, Secrets Manager cannot automatically rotate the secret.</p>
     * <br>
     * <p>>  This parameter is returned if you set the SecretType parameter to Rds, RAMCredentials, or ECS.</p>
     */
    @NameInMap("EnableAutomaticRotation")
    public Boolean enableAutomaticRotation;

    /**
     * <p>The description of the secret.</p>
     */
    @NameInMap("EncryptionKeyId")
    public String encryptionKeyId;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("ExtendedConfig")
    public String extendedConfigShrink;

    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The name of the secret.</p>
     */
    @NameInMap("RotationInterval")
    public String rotationInterval;

    /**
     * <p>The tags of the secret.</p>
     */
    @NameInMap("SecretData")
    public String secretData;

    /**
     * <p>The extended configuration of the secret. This parameter specifies the properties of the secret of the specific type. The description can be up to 1,024 characters in length.</p>
     * <br>
     * <p>*   If you set the SecretType parameter to Generic, you do not need to configure this parameter.</p>
     * <br>
     * <p>*   If you set the SecretType parameter to Rds, configure the following fields for the ExtendedConfig parameter:</p>
     * <br>
     * <p>    *   SecretSubType: required. The subtype of the secret. Valid values:</p>
     * <br>
     * <p>        *   SingleUser: Secrets Manager manages the ApsaraDB RDS secret in single-account mode. When the secret is rotated, the password of the specified account is reset to a new random password.</p>
     * <p>        *   DoubleUsers: Secrets Manager manages the ApsaraDB RDS secret in dual-account mode. One account is referenced by the ACSCurrent version, and the other account is referenced by the ACSPrevious version. When the secret is rotated, the password of the account referenced by the ACSPrevious version is reset to a new random password. Then, Secrets Manager switches the referenced accounts between the ACSCurrent and ACSPrevious versions.</p>
     * <br>
     * <p>    *   DBInstanceId: required. The ApsaraDB RDS instance to which the ApsaraDB RDS account belongs.</p>
     * <br>
     * <p>    *   CustomData: optional. The custom data. The value is a collection of key-value pairs in the JSON format. Up to 10 key-value pairs can be specified. Separate multiple key-value pairs with commas (,). Example: `{"Key1": "v1", "fds":"fdsf"}`. The default value is a pair of empty braces (`{}`).</p>
     * <br>
     * <p>*   If you set the SecretType parameter to RAMCredentials, configure the following fields for the ExtendedConfig parameter:</p>
     * <br>
     * <p>    *   SecretSubType: required. The subtype of the secret. Set the value to RamUserAccessKey.</p>
     * <p>    *   UserName: required. The name of the RAM user.</p>
     * <p>    *   CustomData: optional. The custom data. The value is a collection of key-value pairs in the JSON format. Up to 10 key-value pairs can be specified. Separate multiple key-value pairs with commas (,). The default value is a pair of empty braces (`{}`).</p>
     * <br>
     * <p>*   If you set the SecretType parameter to ECS, configure the following fields for the ExtendedConfig parameter:</p>
     * <br>
     * <p>    *   SecretSubType: required. The subtype of the secret. Valid values:</p>
     * <br>
     * <p>        *   Password: the password that is used to log on to the ECS instance.</p>
     * <p>        *   SSHKey: the SSH public key and private key that are used to log on to the ECS instance.</p>
     * <br>
     * <p>    *   RegionId: required. The ID of the region in which the ECS instance resides.</p>
     * <br>
     * <p>    *   InstanceId: required. The ID of the ECS instance.</p>
     * <br>
     * <p>    *   CustomData: optional. The custom data. The value is a collection of key-value pairs in the JSON format. Up to 10 key-value pairs can be specified. Separate multiple key-value pairs with commas (,). The default value is a pair of empty braces (`{}`).</p>
     * <br>
     * <p>>  This parameter is required if you set the SecretType parameter to Rds, RAMCredentials, or ECS.</p>
     */
    @NameInMap("SecretDataType")
    public String secretDataType;

    /**
     * <p>The value of the secret that you want to create. Secrets Manager encrypts the secret value and stores the encrypted value in the initial version.</p>
     * <br>
     * <p>*   If you set the SecretType parameter to Generic that indicates a generic secret, you can customize the secret value.</p>
     * <br>
     * <p>*   If you set the SecretType parameter to Rds that indicates a managed ApsaraDB RDS secret, the secret value must be in the format of `{"Accounts":[{"AccountName":"","AccountPassword":""}]}`. In the preceding format, `AccountName` indicates the username of the account that is used to connect to your ApsaraDB RDS instance, and `AccountPassword` specifies the password of the account.</p>
     * <br>
     * <p>*   If you set the SecretType parameter to RAMCredentials that indicates a managed RAM secret, the secret value must be in the format of `{"AccessKeys":[{"AccessKeyId":"","AccessKeySecret":"",}]}`. In the preceding format, `AccessKeyId` indicates the AccessKey ID of the RAM user and `AccessKeySecret` specifies the AccessKey secret of the RAM user. You must specify all the AccessKey pairs of the RAM user.</p>
     * <br>
     * <p>*   If you set the SecretType parameter to ECS that indicates a managed ECS secret, the secret value must be in one of the following formats:</p>
     * <br>
     * <p>    *   `{"UserName":"","Password": ""}`: In the format, `UserName` specifies the username that is used to log on to the ECS instance, and `Password` specifies the password that is used to log on to the ECS instance.</p>
     * <p>    *   `{"UserName":"","PublicKey": "", "PrivateKey": ""}`: In the format, `PublicKey` indicates the SSH public key that is used to log on to the ECS instance, and `PrivateKey` specifies the SSH private key that is used to log on to the ECS instance.</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    /**
     * <p>The ID of the dedicated KMS instance.</p>
     */
    @NameInMap("SecretType")
    public String secretType;

    /**
     * <p>The interval for automatic rotation. Valid values: 6 hours to 8,760 hours (365 days).</p>
     * <br>
     * <p>The value is in the `integer[unit]` format.</p>
     * <br>
     * <p>The unit can be d (day), h (hour), m (minute), or s (second). For example, both 7d and 604800s indicate a seven-day interval.</p>
     * <br>
     * <p>>  This parameter is required if you set the EnableAutomaticRotation parameter to true. This parameter is ignored if you set the EnableAutomaticRotation parameter to false or if the EnableAutomaticRotation parameter is not configured.</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The type of the secret value. Valid values:</p>
     * <br>
     * <p>*   text</p>
     * <p>*   binary</p>
     * <br>
     * <p>>  If you set the SecretType parameter to Rds, RAMCredentials, or ECS, the SecretDataType parameter must be set to text.</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static CreateSecretShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSecretShrinkRequest self = new CreateSecretShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSecretShrinkRequest setDKMSInstanceId(String DKMSInstanceId) {
        this.DKMSInstanceId = DKMSInstanceId;
        return this;
    }
    public String getDKMSInstanceId() {
        return this.DKMSInstanceId;
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

    public CreateSecretShrinkRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
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
