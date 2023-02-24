// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetSecretValueResponseBody extends TeaModel {
    /**
     * <p>Indicates whether automatic rotation is enabled. Valid values:</p>
     * <br>
     * <p>*   Enabled: indicates that automatic rotation is enabled.</p>
     * <p>*   Disabled: indicates that automatic rotation is disabled.</p>
     * <p>*   Invalid: indicates that the status of automatic rotation is abnormal. In this case, Secrets Manager cannot automatically rotate the secret.</p>
     * <br>
     * <p>>  This parameter is returned only for a managed ApsaraDB RDS secret, a managed RAM secret, or a managed ECS secret.</p>
     */
    @NameInMap("AutomaticRotation")
    public String automaticRotation;

    /**
     * <p>The time when the secret was created.</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The extended configuration of the secret.</p>
     * <br>
     * <p>>  This parameter is returned if you set the FetchExtendedConfig parameter to true. This parameter is returned only for a managed ApsaraDB RDS secret, a managed RAM secret, or a managed ECS secret.</p>
     */
    @NameInMap("ExtendedConfig")
    public String extendedConfig;

    /**
     * <p>The time when the last rotation was performed.</p>
     * <br>
     * <p>>  This parameter is returned if the secret was rotated.</p>
     */
    @NameInMap("LastRotationDate")
    public String lastRotationDate;

    /**
     * <p>The time when the next rotation will be performed.</p>
     * <br>
     * <p>>  This parameter is returned if automatic rotation is enabled.</p>
     */
    @NameInMap("NextRotationDate")
    public String nextRotationDate;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The interval for automatic rotation.</p>
     * <br>
     * <p>The value is in the `integer[unit]` format. The `unit` field has a fixed value of s. For example, if the value is 604800s, automatic rotation is performed at a 7-day interval.</p>
     * <br>
     * <p>>  This parameter is returned if automatic rotation is enabled.</p>
     */
    @NameInMap("RotationInterval")
    public String rotationInterval;

    /**
     * <p>The secret value. Secrets Manager decrypts the ciphertext of the secret value and returns the plaintext of the secret value in this parameter.</p>
     * <br>
     * <p>*   For a generic secret, the secret value of the specified version is returned.</p>
     * <br>
     * <p>*   For a managed ApsaraDB RDS secret, the value is returned in the following format:`{"AccountName":"","AccountPassword":""}` .</p>
     * <br>
     * <p>*   For a managed RAM secret, the secret value is returned in the following format: `{"AccessKeyId":"Adfdsfd","AccessKeySecret":"fdsfdsf","GenerateTimestamp": "2016-03-25T10:42:40Z"}`.</p>
     * <br>
     * <p>*   For a managed ECS secret, the secret value is returned in one of the following formats:</p>
     * <br>
     * <p>    *   `{"UserName":"root","Password":"H5asdasdsads****"}`: The secret value is returned in this format if the ECS secret is a password.</p>
     * <p>    *   `{"UserName":"root","PublicKey":"ssh-rsa ****mKwnVix9YTFY9Rs= imported-openssh-key","PrivateKey": "d6bee1cb-2e14-4277-ba6b-73786b21****"}`: The secret value is returned in this format is the ECS secret is a pair of SSH keys. The private key is in the Privacy Enhanced Mail (PEM) format.</p>
     */
    @NameInMap("SecretData")
    public String secretData;

    /**
     * <p>The type of the secret value. Valid values:</p>
     * <br>
     * <p>*   text</p>
     * <p>*   binary</p>
     */
    @NameInMap("SecretDataType")
    public String secretDataType;

    /**
     * <p>The name of the secret.</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    /**
     * <p>The type of the secret. Valid values:</p>
     * <br>
     * <p>*   Generic: indicates a generic secret.</p>
     * <p>*   Rds: indicates a managed ApsaraDB RDS secret.</p>
     * <p>*   RAMCredentials: indicates a managed RAM secret.</p>
     * <p>*   ECS: indicates a managed ECS secret.</p>
     */
    @NameInMap("SecretType")
    public String secretType;

    /**
     * <p>The version number of the secret value.</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    /**
     * <p>The stage labels that mark the secret versions.</p>
     */
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
