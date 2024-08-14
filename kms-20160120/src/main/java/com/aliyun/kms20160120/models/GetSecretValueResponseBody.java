// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetSecretValueResponseBody extends TeaModel {
    /**
     * <p>Indicates whether automatic rotation is enabled. Valid values:</p>
     * <ul>
     * <li>Enabled: indicates that automatic rotation is enabled.</li>
     * <li>Disabled: indicates that automatic rotation is disabled.</li>
     * <li>Invalid: indicates that the status of automatic rotation is abnormal. In this case, Secrets Manager cannot automatically rotate the secret.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is returned only for a managed ApsaraDB RDS secret, a managed RAM secret, or a managed ECS secret.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("AutomaticRotation")
    public String automaticRotation;

    /**
     * <p>The time when the secret was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-02-21T15:39:26Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The extended configuration of the secret.</p>
     * <blockquote>
     * <p> This parameter is returned if you set the FetchExtendedConfig parameter to true. This parameter is returned only for a managed ApsaraDB RDS secret, a managed RAM secret, or a managed ECS secret.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;SecretSubType\&quot;:\&quot;SingleUser\&quot;, \&quot;DBInstanceId\&quot;:\&quot;rm-uf667446pc955****\&quot;,  \&quot;CustomData\&quot;:{} }</p>
     */
    @NameInMap("ExtendedConfig")
    public String extendedConfig;

    /**
     * <p>The time when the last rotation was performed.</p>
     * <blockquote>
     * <p> This parameter is returned if the secret was rotated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2020-07-05T08:22:03Z</p>
     */
    @NameInMap("LastRotationDate")
    public String lastRotationDate;

    /**
     * <p>The time when the next rotation will be performed.</p>
     * <blockquote>
     * <p> This parameter is returned if automatic rotation is enabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2020-07-06T18:22:03Z</p>
     */
    @NameInMap("NextRotationDate")
    public String nextRotationDate;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6a3e9c36-1150-4881-84d3-eb8672fcafad</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The interval for automatic rotation.</p>
     * <p>The value is in the <code>integer[unit]</code> format. The <code>unit</code> field has a fixed value of s. For example, if the value is 604800s, automatic rotation is performed at a 7-day interval.</p>
     * <blockquote>
     * <p> This parameter is returned if automatic rotation is enabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>604800s</p>
     */
    @NameInMap("RotationInterval")
    public String rotationInterval;

    /**
     * <p>The secret value. Secrets Manager decrypts the ciphertext of the secret value and returns the plaintext of the secret value in this parameter.</p>
     * <ul>
     * <li><p>For a generic secret, the secret value of the specified version is returned.</p>
     * </li>
     * <li><p>For a managed ApsaraDB RDS secret, the value is returned in the following format:<code>{&quot;AccountName&quot;:&quot;&quot;,&quot;AccountPassword&quot;:&quot;&quot;}</code> .</p>
     * </li>
     * <li><p>For a managed RAM secret, the secret value is returned in the following format: <code>{&quot;AccessKeyId&quot;:&quot;Adfdsfd&quot;,&quot;AccessKeySecret&quot;:&quot;fdsfdsf&quot;,&quot;GenerateTimestamp&quot;: &quot;2016-03-25T10:42:40Z&quot;}</code>.</p>
     * </li>
     * <li><p>For a managed ECS secret, the secret value is returned in one of the following formats:</p>
     * <ul>
     * <li><code>{&quot;UserName&quot;:&quot;root&quot;,&quot;Password&quot;:&quot;H5asdasdsads****&quot;}</code>: The secret value is returned in this format if the ECS secret is a password.</li>
     * <li><code>{&quot;UserName&quot;:&quot;root&quot;,&quot;PublicKey&quot;:&quot;ssh-rsa ****mKwnVix9YTFY9Rs= imported-openssh-key&quot;,&quot;PrivateKey&quot;: &quot;d6bee1cb-2e14-4277-ba6b-73786b21****&quot;}</code>: The secret value is returned in this format is the ECS secret is a pair of SSH keys. The private key is in the Privacy Enhanced Mail (PEM) format.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>testdata1</p>
     */
    @NameInMap("SecretData")
    public String secretData;

    /**
     * <p>The type of the secret value. Valid values:</p>
     * <ul>
     * <li>text</li>
     * <li>binary</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>binary</p>
     */
    @NameInMap("SecretDataType")
    public String secretDataType;

    /**
     * <p>The name of the secret.</p>
     * 
     * <strong>example:</strong>
     * <p>secret001</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    /**
     * <p>The type of the secret. Valid values:</p>
     * <ul>
     * <li>Generic: indicates a generic secret.</li>
     * <li>Rds: indicates a managed ApsaraDB RDS secret.</li>
     * <li>RAMCredentials: indicates a managed RAM secret.</li>
     * <li>ECS: indicates a managed ECS secret.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Generic</p>
     */
    @NameInMap("SecretType")
    public String secretType;

    /**
     * <p>The version number of the secret value.</p>
     * 
     * <strong>example:</strong>
     * <p>00000000000000000000000000000001</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    /**
     * <p>The stage labels that mark the secret versions.</p>
     */
    @NameInMap("VersionStages")
    public java.util.List<String> versionStages;

    public static GetSecretValueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSecretValueResponseBody self = new GetSecretValueResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSecretValueResponseBody setAutomaticRotation(String automaticRotation) {
        this.automaticRotation = automaticRotation;
        return this;
    }
    public String getAutomaticRotation() {
        return this.automaticRotation;
    }

    public GetSecretValueResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetSecretValueResponseBody setExtendedConfig(String extendedConfig) {
        this.extendedConfig = extendedConfig;
        return this;
    }
    public String getExtendedConfig() {
        return this.extendedConfig;
    }

    public GetSecretValueResponseBody setLastRotationDate(String lastRotationDate) {
        this.lastRotationDate = lastRotationDate;
        return this;
    }
    public String getLastRotationDate() {
        return this.lastRotationDate;
    }

    public GetSecretValueResponseBody setNextRotationDate(String nextRotationDate) {
        this.nextRotationDate = nextRotationDate;
        return this;
    }
    public String getNextRotationDate() {
        return this.nextRotationDate;
    }

    public GetSecretValueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSecretValueResponseBody setRotationInterval(String rotationInterval) {
        this.rotationInterval = rotationInterval;
        return this;
    }
    public String getRotationInterval() {
        return this.rotationInterval;
    }

    public GetSecretValueResponseBody setSecretData(String secretData) {
        this.secretData = secretData;
        return this;
    }
    public String getSecretData() {
        return this.secretData;
    }

    public GetSecretValueResponseBody setSecretDataType(String secretDataType) {
        this.secretDataType = secretDataType;
        return this;
    }
    public String getSecretDataType() {
        return this.secretDataType;
    }

    public GetSecretValueResponseBody setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public GetSecretValueResponseBody setSecretType(String secretType) {
        this.secretType = secretType;
        return this;
    }
    public String getSecretType() {
        return this.secretType;
    }

    public GetSecretValueResponseBody setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public GetSecretValueResponseBody setVersionStages(java.util.List<String> versionStages) {
        this.versionStages = versionStages;
        return this;
    }
    public java.util.List<String> getVersionStages() {
        return this.versionStages;
    }

}
