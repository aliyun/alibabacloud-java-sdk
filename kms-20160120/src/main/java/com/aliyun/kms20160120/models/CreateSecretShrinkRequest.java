// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateSecretShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the KMS instance.</p>
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
     * <li><p>true: enables automatic rotation.</p>
     * </li>
     * <li><p>false (default): disables automatic rotation.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is valid only if SecretType is set to Rds, PolarDB, Redis, RAMCredentials, or ECS. If SecretType is set to Generic, automatic rotation is not supported. You can call the <a href="https://help.aliyun.com/document_detail/154503.html">PutSecretValue</a> operation to manually rotate the secret.</p>
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
     * <p>The key and the secret must be in the same KMS instance. The key must be a symmetric key.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>key-gzz63ff0db5hg3qje****</p>
     */
    @NameInMap("EncryptionKeyId")
    public String encryptionKeyId;

    /**
     * <p>The extended configuration of the secret. This parameter specifies the properties of the secret of a specific type. The value can be up to 1,024 characters in length.</p>
     * <ul>
     * <li><p>If SecretType is set to Generic, this parameter is ignored.</p>
     * </li>
     * <li><p>If SecretType is set to Rds, you must specify the following parameters in ExtendedConfig:</p>
     * <ul>
     * <li><p>SecretSubType (Required): The subtype of the secret. Valid values:</p>
     * <ul>
     * <li><p>SingleUser: Secrets Manager manages the RDS secret in single-account mode. When the secret is rotated, the password of the specified account is reset to a new random password.</p>
     * </li>
     * <li><p>DoubleUsers: Secrets Manager manages the RDS secret in double-account mode. ACSCurrent and ACSPrevious point to one of the accounts. When the secret is rotated, the password of the account pointed to by ACSPrevious is reset to a new random password. Then, Secrets Manager swaps the accounts that ACSCurrent and ACSPrevious point to.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>DBInstanceId (Required): The ID of the RDS instance to which the account belongs.</p>
     * </li>
     * <li><p>CustomData (Optional): The custom data. The value is a key-value pair in the JSON format. You can specify up to 10 key-value pairs. Separate multiple key-value pairs with commas (,). Example: <code>{&quot;Key1&quot;: &quot;v1&quot;, &quot;fds&quot;:&quot;fdsf&quot;}</code>. The default value is <code>{}</code>.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>If SecretType is set to Redis, you must specify the following parameters in ExtendedConfig:</p>
     * <ul>
     * <li><p>SecretSubType (Required): The subtype of the secret. Valid values:</p>
     * <ul>
     * <li>DoubleUsers: Secrets Manager manages the Redis secret in double-account mode. ACSCurrent and ACSPrevious point to one of the accounts. When the secret is rotated, the password of the account pointed to by ACSPrevious is reset to a new random password. Then, Secrets Manager swaps the accounts that ACSCurrent and ACSPrevious point to.</li>
     * </ul>
     * </li>
     * <li><p>AccountName (Required): The database username.</p>
     * </li>
     * <li><p>CloneAccountName (Required): The database username, which is the value of AccountName with the <code>_clone</code> suffix.</p>
     * </li>
     * <li><p>AccountPrivilege (Required): The permissions to access the database.</p>
     * </li>
     * <li><p>InstanceId (Required): The ID of the Redis instance.</p>
     * </li>
     * <li><p>RegionId (Required): The ID of the region where the Redis instance resides.</p>
     * </li>
     * <li><p>CustomData (Optional): The custom data. The value is a key-value pair in the JSON format. You can specify up to 10 key-value pairs. Separate multiple key-value pairs with commas (,). Example: <code>{&quot;Key1&quot;: &quot;v1&quot;, &quot;fds&quot;:&quot;fdsf&quot;}</code>. The default value is <code>{}</code>.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>If SecretType is set to RAMCredentials, you must specify the following parameters in ExtendedConfig:</p>
     * <ul>
     * <li><p>SecretSubType (Required): The subtype of the secret. The value is RamUserAccessKey.</p>
     * </li>
     * <li><p>UserName (Required): The name of the RAM user.</p>
     * </li>
     * <li><p>CustomData (Optional): The custom data. The value is a key-value pair in the JSON format. You can specify up to 10 key-value pairs. Separate multiple key-value pairs with commas (,). The default value is <code>{}</code>.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>If SecretType is set to ECS, you must specify the following parameters in ExtendedConfig:</p>
     * <ul>
     * <li><p>SecretSubType (Required): The subtype of the secret. Valid values:</p>
     * <ul>
     * <li><p>Password: an ECS password.</p>
     * </li>
     * <li><p>SSHKey: an ECS SSH key pair.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>RegionId (Required): The ID of the region where the ECS instance resides.</p>
     * </li>
     * <li><p>InstanceId (Required): The ID of the ECS instance.</p>
     * </li>
     * <li><p>CustomData (Optional): The custom data. The value is a key-value pair in the JSON format. You can specify up to 10 key-value pairs. Separate multiple key-value pairs with commas (,). The default value is <code>{}</code>.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>If SecretType is set to PolarDB, you must specify the following parameters in ExtendedConfig:</p>
     * <ul>
     * <li><p>SecretSubType (Required): The fixed value is DoubleUsers.</p>
     * </li>
     * <li><p>RegionId (Required): The region.</p>
     * </li>
     * <li><p>DBClusterId (Required): The ID of the PolarDB instance.</p>
     * </li>
     * <li><p>DBType (Required): MySQL or PostgreSQL.</p>
     * </li>
     * <li><p>AccountName (Required): The account name.</p>
     * </li>
     * <li><p>CloneAccountName: The value is AccountName_clone.</p>
     * </li>
     * <li><p>AccountType: Only Normal is supported.</p>
     * </li>
     * <li><p>AccountPrivilege: This parameter is available only for MySQL.</p>
     * </li>
     * <li><p>DBName: This parameter is available only for MySQL.</p>
     * </li>
     * <li><p>CustomData (Optional): The custom data. The value is a key-value pair in the JSON format. You can specify up to 10 key-value pairs. Separate multiple key-value pairs with commas (,). Example: {&quot;Key1&quot;: &quot;v1&quot;, &quot;fds&quot;:&quot;fdsf&quot;}. The default value is {}.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If SecretType is set to Rds, Redis, PolarDB, RAMCredentials, or ECS, you must configure this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;SecretSubType&quot;:&quot;SingleUser&quot;, &quot;DBInstanceId&quot;:&quot;rm-bp1b3dd3a506e****&quot; ,&quot;CustomData&quot;:{&quot;Key1&quot;: &quot;v1&quot;, &quot;fds&quot;:&quot;fdsf&quot;}}</p>
     */
    @NameInMap("ExtendedConfig")
    public String extendedConfigShrink;

    /**
     * <p>The content of the secret policy. The value is in the JSON format. The value can be up to 32,768 bytes in length.</p>
     * <p>For more information about secret policies, see <a href="https://help.aliyun.com/document_detail/2716465.html">Overview of secret policies</a>. If you do not specify this parameter, the default secret policy is used.</p>
     * <p>A secret policy contains the following parts:</p>
     * <ul>
     * <li><p>Version: The version of the secret policy. Only 1 is supported.</p>
     * </li>
     * <li><p>Statement: The statements of the secret policy. Each secret policy can contain one or more statements.</p>
     * </li>
     * </ul>
     * <p>The following is the format of a secret policy:</p>
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
     * <p>Details about a statement:</p>
     * <ul>
     * <li><p>Sid: (Optional) The custom identifier of the statement. The value can be up to 128 characters in length and can contain uppercase letters (A-Z), lowercase letters (a-z), digits (0-9), and special characters, including underscores (_), forward slashes (/), plus signs (+), equal signs (=), periods (.), at signs (@), and hyphens (-).</p>
     * </li>
     * <li><p>Effect: (Required) The effect of the policy statement. Valid values: Allow and Deny.</p>
     * </li>
     * <li><p>Principal: (Required) The principal that is authorized by the policy. You can specify the current Alibaba Cloud account (the account to which the secret belongs), a RAM user or RAM role of the current Alibaba Cloud account, or a RAM user or RAM role of another Alibaba Cloud account.</p>
     * </li>
     * <li><p>Action: (Required) The API operations that are allowed or denied. The value must start with &quot;kms:&quot;. For the list of supported operations, see <a href="https://help.aliyun.com/document_detail/2716465.html">Overview of secret policies</a>. If you specify an operation that is not in the list, the setting does not take effect.</p>
     * </li>
     * <li><p>Resource: (Required) The resource. The value can only be \*, which indicates the current KMS secret.</p>
     * </li>
     * <li><p>Condition: (Optional) The conditions for the authorization to take effect. You can use conditions to evaluate the context of an API request to determine whether to apply the policy statement. The format is <code>&quot;Condition&quot;: {&quot;condition operator&quot;: {&quot;condition key&quot;: &quot;condition value&quot;}}</code>. For more information, see <a href="https://help.aliyun.com/document_detail/2716465.html">Overview of secret policies</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>After you grant permissions to a RAM user or RAM role of another Alibaba Cloud account, you must use the Alibaba Cloud account to which the RAM user or RAM role belongs to grant the RAM user or RAM role the permissions to use the secret in the RAM console. Then, the RAM user or RAM role can use the secret. For more information, see <a href="https://help.aliyun.com/document_detail/480682.html">Custom policies for KMS</a>, <a href="https://help.aliyun.com/document_detail/116146.html">Grant permissions to a RAM user</a>, and <a href="https://help.aliyun.com/document_detail/116147.html">Grant permissions to a RAM role</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Version&quot;:&quot;1&quot;,&quot;Statement&quot;: [{&quot;Sid&quot;:&quot;kms default secret policy&quot;,&quot;Effect&quot;:&quot;Allow&quot;,&quot;Principal&quot;:{&quot;RAM&quot;: [&quot;acs:ram::119285303511****:<em>&quot;]},&quot;Action&quot;:[&quot;kms:</em>&quot;],&quot;Resource&quot;: [&quot;*&quot;] }] }</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The interval for automatic rotation. The value is in the range of 6 hours to 8,760 hours (365 days).<br>
     * The value is in the <code>integer[unit]</code> format. <code>integer</code> indicates the interval. <code>unit</code> indicates the unit of time.<br>
     * Valid values for unit: d (day), h (hour), m (minute), and s (second). For example, both 7d and 604,800s indicate a rotation interval of 7 days.<br><br></p>
     * <blockquote>
     * <p>You must specify this parameter if you set EnableAutomaticRotation to true. You do not need to specify this parameter if you set EnableAutomaticRotation to false.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30d</p>
     */
    @NameInMap("RotationInterval")
    public String rotationInterval;

    /**
     * <p>The value of the secret. The value can be up to 30,720 bytes (30 KB) in length. KMS encrypts the secret value with the specified key and stores the encrypted value in the initial version.</p>
     * <ul>
     * <li><p>If SecretType is set to Generic, you can specify a custom secret value.</p>
     * </li>
     * <li><p>If SecretType is set to Rds, the secret value must be in the following format: <code>{&quot;Accounts&quot;:[{&quot;AccountName&quot;:&quot;&quot;,&quot;AccountPassword&quot;:&quot;&quot;}]}</code>. In the format, <code>AccountName</code> specifies the username of the account for the RDS instance and <code>AccountPassword</code> specifies the password of the account.</p>
     * </li>
     * <li><p>If SecretType is set to Redis, set this parameter to <code>$Auto</code>.</p>
     * </li>
     * <li><p>If SecretType is set to RAMCredentials, the secret value must be in the following format: <code>{&quot;AccessKeys&quot;:[{&quot;AccessKeyId&quot;:&quot;&quot;,&quot;AccessKeySecret&quot;:&quot;&quot;}]}</code>. In the format, <code>AccessKeyId</code> specifies the AccessKey ID and <code>AccessKeySecret</code> specifies the AccessKey secret. You must specify all AccessKey pairs of the RAM user.</p>
     * </li>
     * <li><p>If SecretType is set to PolarDB, set this parameter to <code>$Auto</code>.</p>
     * </li>
     * <li><p>If SecretType is set to ECS, the secret value must be in one of the following formats:</p>
     * <ul>
     * <li><p>If SecretSubType in the ExtendedConfig parameter is set to Password: <code>{&quot;UserName&quot;:&quot;&quot;,&quot;Password&quot;: &quot;&quot;}</code>. In the format, <code>UserName</code> specifies the username used to log on to the ECS instance and <code>Password</code> specifies the password used to log on to the ECS instance.</p>
     * </li>
     * <li><p>If SecretSubType in the ExtendedConfig parameter is set to SSHKey: <code>{&quot;UserName&quot;:&quot;&quot;,&quot;PublicKey&quot;: &quot;&quot;, &quot;PrivateKey&quot;: &quot;&quot;}</code>. In the format, <code>PublicKey</code> specifies the SSH-formatted public key used to log on to the ECS instance and <code>PrivateKey</code> specifies the private key used to log on to the ECS instance.</p>
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
     * <li><p>text (default): The secret value is a text string.</p>
     * </li>
     * <li><p>binary: The secret value is a binary string.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If SecretType is set to Rds, Redis, PolarDB, RAMCredentials, or ECS, SecretDataType must be set to text.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("SecretDataType")
    public String secretDataType;

    /**
     * <p>The name of the secret. The name must be unique in the same region.
     * The name can be up to 192 characters in length and can contain letters, digits, underscores (_), forward slashes (/), plus signs (+), equal signs (=), periods (.), hyphens (-), and at signs (@). The following limits apply to secret names for different types of secrets:</p>
     * <ul>
     * <li><p>If SecretType is set to Generic, Rds, or Redis, the name cannot start with <code>acs/</code>.</p>
     * </li>
     * <li><p>If SecretType is set to RAMCredentials, set this parameter to the fixed value <code>$Auto</code>. In this case, KMS automatically generates a secret name that starts with <code>acs/ram/user/</code> and contains the display name of the RAM user.</p>
     * </li>
     * <li><p>If SecretType is set to ECS, the name must start with <code>acs/ecs/</code>.</p>
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
     * <li><p>Generic (default): a generic secret.</p>
     * </li>
     * <li><p>Rds: an RDS secret.</p>
     * </li>
     * <li><p>Redis: a Redis secret.</p>
     * </li>
     * <li><p>RAMCredentials: a RAM secret.</p>
     * </li>
     * <li><p>ECS: an ECS secret.</p>
     * </li>
     * <li><p>PolarDB: a PolarDB secret.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Rds</p>
     */
    @NameInMap("SecretType")
    public String secretType;

    /**
     * <p>The tags of the secret. Each tag consists of a key-value pair. A tag consists of a tag key and a tag value.</p>
     * <p>The tag key and tag value can be up to 128 characters in length and can contain letters, digits, forward slashes (/), backslashes (\), underscores (_), hyphens (-), periods (.), plus signs (+), equal signs (=), colons (:), and at signs (@).</p>
     * <ul>
     * <li><p>The tag key cannot start with aliyun or acs:.</p>
     * </li>
     * <li><p>You can specify up to 20 key-value pairs for each secret.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;TagKey\&quot;:\&quot;key1\&quot;,\&quot;TagValue\&quot;:\&quot;val1\&quot;},{\&quot;TagKey\&quot;:\&quot;key2\&quot;,\&quot;TagValue\&quot;:\&quot;val2\&quot;}]</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The version number of the initial version. The version number must be unique within the secret.
     * The version number can be up to 64 characters in length.</p>
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
