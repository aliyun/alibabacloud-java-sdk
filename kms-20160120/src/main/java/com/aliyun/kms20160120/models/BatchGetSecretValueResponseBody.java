// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class BatchGetSecretValueResponseBody extends TeaModel {
    /**
     * <p>The list of errors for secrets that failed to be retrieved.</p>
     */
    @NameInMap("Errors")
    public java.util.List<BatchGetSecretValueResponseBodyErrors> errors;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8252db58-2036-408c-a3d5-56e656dc2551</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of secrets that are successfully retrieved.</p>
     */
    @NameInMap("SecretValues")
    public java.util.List<BatchGetSecretValueResponseBodySecretValues> secretValues;

    public static BatchGetSecretValueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetSecretValueResponseBody self = new BatchGetSecretValueResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetSecretValueResponseBody setErrors(java.util.List<BatchGetSecretValueResponseBodyErrors> errors) {
        this.errors = errors;
        return this;
    }
    public java.util.List<BatchGetSecretValueResponseBodyErrors> getErrors() {
        return this.errors;
    }

    public BatchGetSecretValueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetSecretValueResponseBody setSecretValues(java.util.List<BatchGetSecretValueResponseBodySecretValues> secretValues) {
        this.secretValues = secretValues;
        return this;
    }
    public java.util.List<BatchGetSecretValueResponseBodySecretValues> getSecretValues() {
        return this.secretValues;
    }

    public static class BatchGetSecretValueResponseBodyErrors extends TeaModel {
        /**
         * <p>The service error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Forbidden.ResourceNotFound</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The HTTP status code returned for the error.</p>
         * 
         * <strong>example:</strong>
         * <p>404</p>
         */
        @NameInMap("HttpStatus")
        public Integer httpStatus;

        /**
         * <p>The error message for the failed secret retrieval.</p>
         * 
         * <strong>example:</strong>
         * <p>Resource not found.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The secret name.</p>
         * 
         * <strong>example:</strong>
         * <p>secret002</p>
         */
        @NameInMap("SecretName")
        public String secretName;

        public static BatchGetSecretValueResponseBodyErrors build(java.util.Map<String, ?> map) throws Exception {
            BatchGetSecretValueResponseBodyErrors self = new BatchGetSecretValueResponseBodyErrors();
            return TeaModel.build(map, self);
        }

        public BatchGetSecretValueResponseBodyErrors setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public BatchGetSecretValueResponseBodyErrors setHttpStatus(Integer httpStatus) {
            this.httpStatus = httpStatus;
            return this;
        }
        public Integer getHttpStatus() {
            return this.httpStatus;
        }

        public BatchGetSecretValueResponseBodyErrors setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public BatchGetSecretValueResponseBodyErrors setSecretName(String secretName) {
            this.secretName = secretName;
            return this;
        }
        public String getSecretName() {
            return this.secretName;
        }

    }

    public static class BatchGetSecretValueResponseBodySecretValuesVersionStages extends TeaModel {
        /**
         * <p>The version stages of the secret.</p>
         */
        @NameInMap("VersionStage")
        public java.util.List<String> versionStage;

        public static BatchGetSecretValueResponseBodySecretValuesVersionStages build(java.util.Map<String, ?> map) throws Exception {
            BatchGetSecretValueResponseBodySecretValuesVersionStages self = new BatchGetSecretValueResponseBodySecretValuesVersionStages();
            return TeaModel.build(map, self);
        }

        public BatchGetSecretValueResponseBodySecretValuesVersionStages setVersionStage(java.util.List<String> versionStage) {
            this.versionStage = versionStage;
            return this;
        }
        public java.util.List<String> getVersionStage() {
            return this.versionStage;
        }

    }

    public static class BatchGetSecretValueResponseBodySecretValues extends TeaModel {
        /**
         * <p>Indicates whether automatic rotation is enabled. Valid values:</p>
         * <ul>
         * <li>Enabled: Automatic rotation is enabled.</li>
         * <li>Disabled: Automatic rotation is disabled.</li>
         * <li>Invalid: The rotation status is abnormal. KMS cannot automatically rotate the secret.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only for ApsaraDB RDS secrets, PolarDB secrets, Redis/Tair secrets, RAM secrets, or ECS secrets.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("AutomaticRotation")
        public String automaticRotation;

        /**
         * <p>The time when the secret was created (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2024-02-21T15:39:26Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The extended configuration of the secret.  </p>
         * <blockquote>
         * <p>This parameter is returned only for ApsaraDB RDS secrets, PolarDB secrets, Redis/Tair secrets, RAM secrets, or ECS secrets when FetchExtendedConfig is set to true.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;SecretSubType\&quot;:\&quot;SingleUser\&quot;, \&quot;DBInstanceId\&quot;:\&quot;rm-uf667446pc955****\&quot;,  \&quot;CustomData\&quot;:{} }</p>
         */
        @NameInMap("ExtendedConfig")
        public String extendedConfig;

        /**
         * <p>The time of the most recent rotation (UTC).</p>
         * <blockquote>
         * <p>This parameter is returned only when the secret has been rotated.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2023-07-05T08:22:03Z</p>
         */
        @NameInMap("LastRotationDate")
        public String lastRotationDate;

        /**
         * <p>The time of the next rotation (UTC).</p>
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
         * <p>The ID of this request, which is a unique identifier generated by Alibaba Cloud for troubleshooting purposes.</p>
         * 
         * <strong>example:</strong>
         * <p>8252db58-2036-408c-a3d5-56e656dc2551</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>The interval for automatic rotation of the secret.
         * The format is integer[unit], where integer specifies the duration and unit specifies the time unit. The value of unit is s (seconds). For example, a rotation interval of 7 days is 604800s.</p>
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
         * <p>The secret value. KMS decrypts the stored ciphertext secret value and returns this parameter.  </p>
         * <ul>
         * <li><p>A generic secret returns the secret value that you specified.</p>
         * </li>
         * <li><p>An ApsaraDB RDS secret or Redis/Tair secret returns the secret value in the following format: <code>{&quot;AccountName&quot;:&quot;&quot;,&quot;AccountPassword&quot;:&quot;&quot;}</code>.</p>
         * </li>
         * <li><p>A RAM secret returns the secret value in the following format: <code>{&quot;AccessKeyId&quot;:&quot;Adfdsfd&quot;,&quot;AccessKeySecret&quot;:&quot;fdsfdsf&quot;,&quot;GenerateTimestamp&quot;: &quot;2023-03-25T10:42:40Z&quot;}</code>.  </p>
         * </li>
         * <li><p>An ECS secret returns the secret value in the following formats:  </p>
         * <ul>
         * <li>Password-type secret: <code>{&quot;UserName&quot;:&quot;ecs-user&quot;,&quot;Password&quot;:&quot;H5asdasdsads****&quot;}</code>.  </li>
         * <li>Public-private key-type secret (private key in PEM format): <code>{&quot;UserName&quot;:&quot;ecs-user&quot;,&quot;PublicKey&quot;:&quot;ssh-rsa ****mKwnVix9YTFY9Rs= imported-openssh-key&quot;,&quot;PrivateKey&quot;: &quot;d6bee1cb-2e14-4277-ba6b-73786b21****&quot;}</code>.</li>
         * </ul>
         * </li>
         * <li><p>A PolarDB secret returns the secret value in the following format: <code>{&quot;AccountName&quot;:&quot;&quot;,&quot;AccountPassword&quot;:&quot;&quot;}</code>.</p>
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
         * <p>The secret name.</p>
         * 
         * <strong>example:</strong>
         * <p>secret001</p>
         */
        @NameInMap("SecretName")
        public String secretName;

        /**
         * <p>The type of the secret. Valid values:</p>
         * <ul>
         * <li>Generic: generic secret.  </li>
         * <li>Rds: ApsaraDB RDS secret.  </li>
         * <li>Redis: Redis/Tair secret.</li>
         * <li>RAMCredentials: RAM secret.  </li>
         * <li>ECS: ECS secret.</li>
         * <li>PolarDB: PolarDB secret.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Generic</p>
         */
        @NameInMap("SecretType")
        public String secretType;

        /**
         * <p>The version number of the secret.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("VersionId")
        public String versionId;

        /**
         * <p>The version stages of the secret.</p>
         */
        @NameInMap("VersionStages")
        public BatchGetSecretValueResponseBodySecretValuesVersionStages versionStages;

        public static BatchGetSecretValueResponseBodySecretValues build(java.util.Map<String, ?> map) throws Exception {
            BatchGetSecretValueResponseBodySecretValues self = new BatchGetSecretValueResponseBodySecretValues();
            return TeaModel.build(map, self);
        }

        public BatchGetSecretValueResponseBodySecretValues setAutomaticRotation(String automaticRotation) {
            this.automaticRotation = automaticRotation;
            return this;
        }
        public String getAutomaticRotation() {
            return this.automaticRotation;
        }

        public BatchGetSecretValueResponseBodySecretValues setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public BatchGetSecretValueResponseBodySecretValues setExtendedConfig(String extendedConfig) {
            this.extendedConfig = extendedConfig;
            return this;
        }
        public String getExtendedConfig() {
            return this.extendedConfig;
        }

        public BatchGetSecretValueResponseBodySecretValues setLastRotationDate(String lastRotationDate) {
            this.lastRotationDate = lastRotationDate;
            return this;
        }
        public String getLastRotationDate() {
            return this.lastRotationDate;
        }

        public BatchGetSecretValueResponseBodySecretValues setNextRotationDate(String nextRotationDate) {
            this.nextRotationDate = nextRotationDate;
            return this;
        }
        public String getNextRotationDate() {
            return this.nextRotationDate;
        }

        public BatchGetSecretValueResponseBodySecretValues setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public BatchGetSecretValueResponseBodySecretValues setRotationInterval(String rotationInterval) {
            this.rotationInterval = rotationInterval;
            return this;
        }
        public String getRotationInterval() {
            return this.rotationInterval;
        }

        public BatchGetSecretValueResponseBodySecretValues setSecretData(String secretData) {
            this.secretData = secretData;
            return this;
        }
        public String getSecretData() {
            return this.secretData;
        }

        public BatchGetSecretValueResponseBodySecretValues setSecretDataType(String secretDataType) {
            this.secretDataType = secretDataType;
            return this;
        }
        public String getSecretDataType() {
            return this.secretDataType;
        }

        public BatchGetSecretValueResponseBodySecretValues setSecretName(String secretName) {
            this.secretName = secretName;
            return this;
        }
        public String getSecretName() {
            return this.secretName;
        }

        public BatchGetSecretValueResponseBodySecretValues setSecretType(String secretType) {
            this.secretType = secretType;
            return this;
        }
        public String getSecretType() {
            return this.secretType;
        }

        public BatchGetSecretValueResponseBodySecretValues setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public BatchGetSecretValueResponseBodySecretValues setVersionStages(BatchGetSecretValueResponseBodySecretValuesVersionStages versionStages) {
            this.versionStages = versionStages;
            return this;
        }
        public BatchGetSecretValueResponseBodySecretValuesVersionStages getVersionStages() {
            return this.versionStages;
        }

    }

}
