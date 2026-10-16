// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateSecretShrinkRequest extends TeaModel {
    /**
     * <p>The instance ID of the KMS instance.</p>
     * 
     * <strong>example:</strong>
     * <p>kst-bjj62d8f5e0sgtx8h****</p>
     */
    @NameInMap("DKMSInstanceId")
    public String DKMSInstanceId;

    /**
     * <p>The description of the secret.</p>
     * 
     * <strong>example:</strong>
     * <p>mydbinfo</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable automatic rotation. Valid values:</p>
     * <ul>
     * <li>true: enables automatic rotation.</li>
     * <li>false: disables automatic rotation. This is the default value.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when SecretType is set to Rds (ApsaraDB RDS secret), PolarDB (PolarDB secret), Redis (Redis secret), RAMCredentials (RAM secret), or ECS (ECS secret). When SecretType is set to Generic (generic secret), automatic rotation is not supported. You can call the <a href="https://help.aliyun.com/document_detail/154503.html">PutSecretValue</a> operation to manually rotate the secret.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAutomaticRotation")
    public Boolean enableAutomaticRotation;

    /**
     * <p>The ID of the key used to encrypt the secret value.</p>
     * <blockquote>
     * <p>The key and the secret must belong to the same KMS instance, and the key must be a symmetric key.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>key-gzz63ff0db5hg3qje****</p>
     */
    @NameInMap("EncryptionKeyId")
    public String encryptionKeyId;

    /**
     * <p>The extended configuration of the secret, which is used to specify the property of a specific secret type. The value can be up to 1,024 characters in length.</p>
     * <ul>
     * <li><p>When SecretType is set to Generic (generic secret), this parameter is ignored.</p>
     * </li>
     * <li><p>When SecretType is set to Rds (ApsaraDB RDS secret), you must specify the following parameters in ExtendedConfig:</p>
     * <ul>
     * <li><p>SecretSubType (required): the child class of the secret. Valid values:  </p>
     * <ul>
     * <li>SingleUser: specifies that Secrets Manager manages the ApsaraDB RDS secret in single-account pattern. During secret rotation, the password of the specified account is reset to a new random password.</li>
     * <li>DoubleUsers: specifies that Secrets Manager manages the ApsaraDB RDS secret in dual-account pattern. ACSCurrent and ACSPrevious reference one account each. During secret rotation, the password of the account referenced by ACSPrevious is reset to a new random password, and then Secrets Manager swaps the accounts referenced by ACSCurrent and ACSPrevious.</li>
     * </ul>
     * </li>
     * <li><p>DBInstanceId (required): instance ID of the ApsaraDB RDS instance to which the account belongs.</p>
     * </li>
     * <li><p>CustomData (optional): custom data. The value is a JSON-formatted key-value pair. You can specify up to 10 key-value pairs, separated by commas (,). Example: <code>{&quot;Key1&quot;: &quot;v1&quot;, &quot;fds&quot;:&quot;fdsf&quot;}</code>. Default value: <code>{}</code>.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>When SecretType is set to Redis (Redis secret), you must specify the following parameters in ExtendedConfig:</p>
     * <ul>
     * <li>SecretSubType (required): the child class of the secret. Valid values:  <ul>
     * <li>DoubleUsers: specifies that Secrets Manager manages the Redis secret in dual-account pattern. ACSCurrent and ACSPrevious reference one account each. During secret rotation, the password of the account referenced by ACSPrevious is reset to a new random password, and then Secrets Manager swaps the accounts referenced by ACSCurrent and ACSPrevious.</li>
     * </ul>
     * </li>
     * <li>AccountName (required): the database username.</li>
     * <li>CloneAccountName (required): the database username, which is the value of AccountName appended with the <code>_clone</code> suffix.</li>
     * <li>AccountPrivilege (required): the permissions to access the database.</li>
     * <li>InstanceId (required): instance ID of the Redis instance.</li>
     * <li>RegionId (required): the region ID of the Redis instance.</li>
     * <li>CustomData (optional): custom data. The value is a JSON-formatted key-value pair. You can specify up to 10 key-value pairs, separated by commas (,). Example: <code>{&quot;Key1&quot;: &quot;v1&quot;, &quot;fds&quot;:&quot;fdsf&quot;}</code>. Default value: <code>{}</code>.</li>
     * </ul>
     * </li>
     * <li><p>When SecretType is set to RAMCredentials (RAM secret), you must specify the following parameters in ExtendedConfig:</p>
     * <ul>
     * <li>SecretSubType (required): the child class of the secret. Valid value: RamUserAccessKey.</li>
     * <li>UserName (required): the name of the Resource Access Management (RAM) user.</li>
     * <li>CustomData (optional): custom data. The value is a JSON-formatted key-value pair. You can specify up to 10 key-value pairs, separated by commas (,). Default value: <code>{}</code>.</li>
     * </ul>
     * </li>
     * <li><p>When SecretType is set to ECS (ECS secret), you must specify the following parameters in ExtendedConfig:</p>
     * <ul>
     * <li><p>SecretSubType (required): the child class of the secret. Valid values:  </p>
     * <ul>
     * <li>Password: ECS password.</li>
     * <li>SSHKey: ECS SSH public and private keys.</li>
     * </ul>
     * </li>
     * <li><p>RegionId (required): the region ID of the ECS instance.  </p>
     * </li>
     * <li><p>InstanceId (required): instance ID of the ECS instance.</p>
     * </li>
     * <li><p>CustomData (optional): custom data. The value is a JSON-formatted key-value pair. You can specify up to 10 key-value pairs, separated by commas (,). Default value: <code>{}</code>.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>When SecretType is set to PolarDB, you must specify the following parameters in ExtendedConfig:</p>
     * <ul>
     * <li><p>SecretSubType (required): DoubleUsers (fixed value).</p>
     * </li>
     * <li><p>RegionId (required): the region ID.</p>
     * </li>
     * <li><p>DBClusterId (required): instance ID of the PolarDB cluster.</p>
     * </li>
     * <li><p>DBType (required): MySQL or PostgreSQL.</p>
     * </li>
     * <li><p>AccountName (required): the account name.</p>
     * </li>
     * <li><p>CloneAccountName: the value of AccountName appended with <code>_clone</code>.</p>
     * </li>
     * <li><p>AccountType: the account type. Only Normal is supported.</p>
     * </li>
     * <li><p>AccountPrivilege: the account permissions. This parameter is available only for MySQL.</p>
     * </li>
     * <li><p>DBName: the database name. This parameter is available only for MySQL.</p>
     * </li>
     * <li><p>CustomData (optional): custom data. The value is a JSON-formatted key-value pair. You can specify up to 10 key-value pairs, separated by commas (,). Example: <code>{&quot;Key1&quot;: &quot;v1&quot;, &quot;fds&quot;:&quot;fdsf&quot;}</code>. Default value: <code>{}</code>.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>When SecretType is set to Rds, Redis, PolarDB, RAMCredentials, or ECS, you must set this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;SecretSubType&quot;:&quot;SingleUser&quot;, &quot;DBInstanceId&quot;:&quot;rm-bp1b3dd3a506e****&quot; ,&quot;CustomData&quot;:{&quot;Key1&quot;: &quot;v1&quot;, &quot;fds&quot;:&quot;fdsf&quot;}}</p>
     */
    @NameInMap("ExtendedConfig")
    public String extendedConfigShrink;

    /**
     * <p>The content of the access policy in JSON format. The maximum length is 32,768 bytes.</p>
     * <p>For more information about secret policies, see <a href="https://help.aliyun.com/document_detail/2716465.html">Overview of secret policies</a>. If you do not specify this parameter, the default access policy is used.</p>
     * <p>The access policy includes the following fields:</p>
     * <ul>
     * <li>Version: the version of the access policy. Currently, only version 1 is supported.</li>
     * <li>Statement: the statements in the access policy. Each access policy contains one or more statements.</li>
     * </ul>
     * <p>The access policy uses the following format:</p>
     * <pre><code>{
     *     &quot;Version&quot;: &quot;1&quot;,
     *     &quot;Statement&quot;: [
     *         {
     *             &quot;Sid&quot;: &quot;Enable RAM User Permissions&quot;,
     *             &quot;Effect&quot;: &quot;Allow&quot;,
     *             &quot;Principal&quot;: {
     *               &quot;RAM&quot;: [&quot;acs:ram::12345678****:*&quot;]
     *             },
     *             &quot;Action&quot;: [
     *                 &quot;kms:*&quot;
     *             ],
     *             &quot;Resource&quot;: [
     *                 &quot;*&quot;
     *             ]
     *         }
     *     ]
     * }
     * </code></pre>
     * <p>Statement details:</p>
     * <ul>
     * <li><p>Sid: optional. The custom statement identifier. The value can be up to 128 characters in length and can contain uppercase letters (A-Z), lowercase letters (a-z), digits (0-9), and special characters (_/+=.@-).</p>
     * </li>
     * <li><p>Effect: required. Specifies whether to allow or deny the permissions in the policy statement. Valid values: Allow and Deny.</p>
     * </li>
     * <li><p>Principal: required. The principal to which the policy is attached. You can set this field to the current Alibaba Cloud account (the account to which the secret belongs), a RAM user or RAM role under the current Alibaba Cloud account, or a RAM user or RAM role under another Alibaba Cloud account.</p>
     * </li>
     * <li><p>Action: required. The API operations to allow or deny. The value must start with &quot;kms:&quot;. For the list of available operations, see <a href="https://help.aliyun.com/document_detail/2716465.html">Overview of secret policies</a>. If you specify an operation that is not in the list, the setting does not take effect.</p>
     * </li>
     * <li><p>Resource: required. The value can only be *, which indicates the current KMS secret.</p>
     * </li>
     * <li><p>Condition: optional. The conditions that must be met for the authorization to take effect. You can use conditions to evaluate the context of an API request to determine whether the policy statement applies. The format is <code>&quot;Condition&quot;: {&quot;condition operator&quot;: {&quot;condition key&quot;: &quot;condition value&quot;}}</code>. For more information, see <a href="https://help.aliyun.com/document_detail/2716465.html">Overview of secret policies</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>After you grant Resource Access Management (RAM) user or RAM role under another Alibaba Cloud account, you must also use the Alibaba Cloud account of the RAM user or RAM role to authorize them to use the secret in the RAM console. Only then can the RAM user or RAM role use the secret. For more information, see <a href="https://help.aliyun.com/document_detail/480682.html">Custom policy examples for Key Management Service</a>, <a href="https://help.aliyun.com/document_detail/116146.html">Grant Resource Access Management (RAM) user</a>, and <a href="https://help.aliyun.com/document_detail/116147.html">Grant permissions to a RAM role</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Version&quot;:&quot;1&quot;,&quot;Statement&quot;: [{&quot;Sid&quot;:&quot;kms default secret policy&quot;,&quot;Effect&quot;:&quot;Allow&quot;,&quot;Principal&quot;:{&quot;RAM&quot;: [&quot;acs:ram::119285303511****:<em>&quot;]},&quot;Action&quot;:[&quot;kms:</em>&quot;],&quot;Resource&quot;: [&quot;*&quot;] }] }</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The interval for automatic rotation. Valid values: 6 hours to 8,760 hours (365 days).<br>The value must be in the <code>integer[unit]</code> format. <code>integer</code> specifies the time length, and <code>unit</code> specifies the time unit.<br>Valid values for <code>unit</code>: d (days), h (hours), m (minutes), and s (seconds). For example, both 7d and 604,800s indicate a 7-day interval.  </p>
     * <blockquote>
     * <p>You must set this parameter only when EnableAutomaticRotation is set to true.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30d</p>
     */
    @NameInMap("RotationInterval")
    public String rotationInterval;

    /**
     * <p>The secret value. The value can be up to 30,720 bytes (30 KB) in length. KMS encrypts the value by using the specified key and stores it in the initial version.</p>
     * <ul>
     * <li><p>When SecretType is set to Generic (generic secret), you can customize the secret value.</p>
     * </li>
     * <li><p>When SecretType is set to Rds (ApsaraDB RDS secret), the secret value must be in the following format: <code>{&quot;Accounts&quot;:[{&quot;AccountName&quot;:&quot;&quot;,&quot;AccountPassword&quot;:&quot;&quot;}]}</code>. <code>AccountName</code> specifies the username of the ApsaraDB RDS instance, and <code>AccountPassword</code> specifies the password of the account.  </p>
     * </li>
     * <li><p>When SecretType is set to Redis (Redis secret), set this parameter to <code>$Auto</code>.</p>
     * </li>
     * <li><p>When SecretType is set to RAMCredentials (RAM secret), the secret value must be in the following format: <code>{&quot;AccessKeys&quot;:[{&quot;AccessKeyId&quot;:&quot;&quot;,&quot;AccessKeySecret&quot;:&quot;&quot;}]}</code>. <code>AccessKeyId</code> specifies the AccessKey ID, and <code>AccessKeySecret</code> specifies the AccessKey secret. You must specify all AccessKey pairs of the Resource Access Management (RAM) user.</p>
     * </li>
     * <li><p>When SecretType is set to PolarDB, set this parameter to <code>$Auto</code>.</p>
     * </li>
     * <li><p>When SecretType is set to ECS (ECS secret), the secret value must be in one of the following formats:  </p>
     * <ul>
     * <li><p>When SecretSubType in the ExtendedConfig parameter is set to Password: <code>{&quot;UserName&quot;:&quot;&quot;,&quot;Password&quot;: &quot;&quot;}</code>. <code>UserName</code> specifies the username used to log on to the ECS instance, and <code>Password</code> specifies the logon password.  </p>
     * </li>
     * <li><p>When SecretSubType in the ExtendedConfig parameter is set to SSHKey: <code>{&quot;UserName&quot;:&quot;&quot;,&quot;PublicKey&quot;: &quot;&quot;, &quot;PrivateKey&quot;: &quot;&quot;}</code>. <code>PublicKey</code> specifies the SSH public key used to log on to the ECS instance, and <code>PrivateKey</code> specifies the private key.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Accounts&quot;:[{&quot;AccountName&quot;:&quot;user1&quot;,&quot;AccountPassword&quot;:&quot;****&quot;}]}</p>
     */
    @NameInMap("SecretData")
    public String secretData;

    /**
     * <p>The type of the secret value. Valid values:</p>
     * <ul>
     * <li>text: text. This is the default value.</li>
     * <li>binary: binary data.</li>
     * </ul>
     * <blockquote>
     * <p>When SecretType is set to Rds, Redis, PolarDB, RAMCredentials, or ECS, SecretDataType can only be set to text.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("SecretDataType")
    public String secretDataType;

    /**
     * <p>The secret name. The secret name must be unique within the current region.
     * The name can be up to 192 characters in length and can contain letters, digits, underscores (_), forward slashes (/), plus signs (+), equal signs (=), periods (.), hyphens (-), and at signs (@). The naming requirements vary based on the secret type:  </p>
     * <ul>
     * <li><p>When SecretType is set to Generic (generic secret), Rds (ApsaraDB RDS secret), or Redis (Redis or Tair secret), the name cannot start with <code>acs/</code>.  </p>
     * </li>
     * <li><p>When SecretType is set to RAMCredentials (RAM secret), use the fixed value <code>$Auto</code>. In this case, KMS automatically generates the secret name, which starts with <code>acs/ram/user/</code> and includes the display name of the Resource Access Management (RAM) user.</p>
     * </li>
     * <li><p>When SecretType is set to ECS (ECS secret), the name must start with <code>acs/ecs/</code>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mydbconninfo</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    /**
     * <p>The type of the secret. Valid values:</p>
     * <ul>
     * <li><p>Generic: generic secret. This is the default value.  </p>
     * </li>
     * <li><p>Rds: ApsaraDB RDS secret.  </p>
     * </li>
     * <li><p>Redis: Redis secret.</p>
     * </li>
     * <li><p>RAMCredentials: RAM secret.  </p>
     * </li>
     * <li><p>ECS: ECS secret.</p>
     * </li>
     * <li><p>PolarDB: PolarDB secret.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Rds</p>
     */
    @NameInMap("SecretType")
    public String secretType;

    /**
     * <p>The tags of the secret. Each tag is a key-value pair that consists of a tag key and a tag value.</p>
     * <p>The tag key and tag value can be up to 128 characters in length and can contain uppercase and lowercase letters, digits, forward slashes (/), backslashes (\), underscores (_), hyphens (-), periods (.), plus signs (+), equal signs (=), colons (:), and at signs (@).</p>
     * <ul>
     * <li><p>A tag key cannot start with aliyun or acs:.</p>
     * </li>
     * <li><p>You can add up to 20 tags to each secret.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;TagKey\&quot;:\&quot;key1\&quot;,\&quot;TagValue\&quot;:\&quot;val1\&quot;},{\&quot;TagKey\&quot;:\&quot;key2\&quot;,\&quot;TagValue\&quot;:\&quot;val2\&quot;}]</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The version ID of the initial version. The version ID must be unique within the secret.
     * The version ID can be up to 64 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
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
