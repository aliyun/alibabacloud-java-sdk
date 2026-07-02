// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetSecretValueResponseBody extends TeaModel {
    /**
     * <p>Indicates whether automatic rotation is enabled. Valid values:  </p>
     * <ul>
     * <li>Enabled: Automatic rotation is enabled.  </li>
     * <li>Disabled: Automatic rotation is disabled.  </li>
     * <li>Invalid: The rotation status is abnormal, and KMS cannot automatically rotate the credential for you.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is returned only for RDS credentials, PolarDB credentials, Redis/Tair credentials, RAM credentials, or ECS credentials.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("AutomaticRotation")
    public String automaticRotation;

    /**
     * <p>The time when the credential was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-02-21T15:39:26Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The extended configuration of the credential.  </p>
     * <blockquote>
     * <p>This parameter is returned only for RDS credentials, PolarDB credentials, Redis/Tair credentials, RAM credentials, or ECS credentials when FetchExtendedConfig is set to true.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;SecretSubType\&quot;:\&quot;SingleUser\&quot;, \&quot;DBInstanceId\&quot;:\&quot;rm-uf667446pc955****\&quot;,  \&quot;CustomData\&quot;:{} }</p>
     */
    @NameInMap("ExtendedConfig")
    public String extendedConfig;

    /**
     * <p>The time of the most recent rotation.  </p>
     * <blockquote>
     * <p>This parameter is returned only if the credential has been rotated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2023-07-05T08:22:03Z</p>
     */
    @NameInMap("LastRotationDate")
    public String lastRotationDate;

    /**
     * <p>The time of the next rotation.  </p>
     * <blockquote>
     * <p>This parameter is returned only when automatic rotation is enabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2024-07-06T18:22:03Z</p>
     */
    @NameInMap("NextRotationDate")
    public String nextRotationDate;

    /**
     * <p>The ID of the current request. Alibaba Cloud generates a unique identifier for each request, which can be used for troubleshooting and issue tracking.</p>
     * 
     * <strong>example:</strong>
     * <p>6a3e9c36-1150-4881-84d3-eb8672fcafad</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The epoch for automatic credential rotation.<br>The format is <code>integer[unit]</code>, where <code>integer</code> indicates the time duration and <code>unit</code> indicates the time unit. Valid value for <code>unit</code>: s (seconds). For example, a 7-day rotation epoch is 604800s.</p>
     * <blockquote>
     * <p>This parameter is returned only when automatic rotation is enabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>604800s</p>
     */
    @NameInMap("RotationInterval")
    public String rotationInterval;

    /**
     * <p>The value of the credential. KMS decrypts the stored ciphertext and returns this parameter.  </p>
     * <ul>
     * <li><p>For generic secrets, the credential value you specified is returned.  </p>
     * </li>
     * <li><p>For RDS credentials and Redis/Tair credentials, the credential value is in the format: <code>{&quot;AccountName&quot;:&quot;&quot;,&quot;AccountPassword&quot;:&quot;&quot;}</code>.  </p>
     * </li>
     * <li><p>For RAM credentials, the credential value is in the format: <code>{&quot;AccessKeyId&quot;:&quot;Adfdsfd&quot;,&quot;AccessKeySecret&quot;:&quot;fdsfdsf&quot;,&quot;GenerateTimestamp&quot;: &quot;2023-03-25T10:42:40Z&quot;}</code>.  </p>
     * </li>
     * <li><p>For ECS credentials, the credential value is in one of the following formats:  </p>
     * <ul>
     * <li>Security token type: <code>{&quot;UserName&quot;:&quot;ecs-user&quot;,&quot;Password&quot;:&quot;H5asdasdsads****&quot;}</code>.  </li>
     * <li>Public-private key pair type (private key in PEM format): <code>{&quot;UserName&quot;:&quot;ecs-user&quot;,&quot;PublicKey&quot;:&quot;ssh-rsa ****mKwnVix9YTFY9Rs= imported-openssh-key&quot;,&quot;PrivateKey&quot;: &quot;d6bee1cb-2e14-4277-ba6b-73786b21****&quot;}</code>.</li>
     * </ul>
     * </li>
     * <li><p>For PolarDB credentials, the credential value is in the format: <code>{&quot;AccountName&quot;:&quot;&quot;,&quot;AccountPassword&quot;:&quot;&quot;}</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>testdata1</p>
     */
    @NameInMap("SecretData")
    public String secretData;

    /**
     * <p>The value type of the credential. Valid values:</p>
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
     * <p>The name of the credential.</p>
     * 
     * <strong>example:</strong>
     * <p>secret001</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    /**
     * <p>The type of the credential. Valid values:</p>
     * <ul>
     * <li>Generic: generic secret.  </li>
     * <li>Rds: RDS credential.  </li>
     * <li>Redis: Redis/Tair credential.</li>
     * <li>RAMCredentials: RAM credential.  </li>
     * <li>ECS: ECS credential.</li>
     * <li>PolarDB: PolarDB credential.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Generic</p>
     */
    @NameInMap("SecretType")
    public String secretType;

    /**
     * <p>The version number of the credential.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    @NameInMap("VersionStages")
    public GetSecretValueResponseBodyVersionStages versionStages;

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

    public GetSecretValueResponseBody setVersionStages(GetSecretValueResponseBodyVersionStages versionStages) {
        this.versionStages = versionStages;
        return this;
    }
    public GetSecretValueResponseBodyVersionStages getVersionStages() {
        return this.versionStages;
    }

    public static class GetSecretValueResponseBodyVersionStages extends TeaModel {
        @NameInMap("VersionStage")
        public java.util.List<String> versionStage;

        public static GetSecretValueResponseBodyVersionStages build(java.util.Map<String, ?> map) throws Exception {
            GetSecretValueResponseBodyVersionStages self = new GetSecretValueResponseBodyVersionStages();
            return TeaModel.build(map, self);
        }

        public GetSecretValueResponseBodyVersionStages setVersionStage(java.util.List<String> versionStage) {
            this.versionStage = versionStage;
            return this;
        }
        public java.util.List<String> getVersionStage() {
            return this.versionStage;
        }

    }

}
