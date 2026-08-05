// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class BatchGetSecretValueRequest extends TeaModel {
    /**
     * <p>The list of secret information. You can query up to 20 different secrets at a time.</p>
     */
    @NameInMap("SecretsList")
    public java.util.List<BatchGetSecretValueRequestSecretsList> secretsList;

    public static BatchGetSecretValueRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetSecretValueRequest self = new BatchGetSecretValueRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetSecretValueRequest setSecretsList(java.util.List<BatchGetSecretValueRequestSecretsList> secretsList) {
        this.secretsList = secretsList;
        return this;
    }
    public java.util.List<BatchGetSecretValueRequestSecretsList> getSecretsList() {
        return this.secretsList;
    }

    public static class BatchGetSecretValueRequestSecretsList extends TeaModel {
        /**
         * <p>Specifies whether to retrieve the extended configuration of the secret. Valid values:</p>
         * <ul>
         * <li>true: Retrieve the extended configuration.</li>
         * <li>false (default): Do not retrieve the extended configuration.</li>
         * </ul>
         * <blockquote>
         * <p>Generic secrets do not support extended configurations. This parameter is ignored for generic secrets.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FetchExtendedConfig")
        public String fetchExtendedConfig;

        /**
         * <p>The secret name or secret Alibaba Cloud Resource Name (ARN).</p>
         * <blockquote>
         * <p>When accessing a secret in another Alibaba Cloud account, you must specify the secret ARN. The format of a secret ARN is <code>acs:kms:${region}:${account}:secret/${secret-name}</code>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>secret001</p>
         */
        @NameInMap("SecretName")
        public String secretName;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("VersionId")
        public String versionId;

        /**
         * <p>The version stage. Default value: ACSCurrent.</p>
         * <p>If you specify this parameter, the secret value of the specified version stage is returned. If you do not specify this parameter, the secret value of the ACSCurrent version stage is returned.</p>
         * <blockquote>
         * <p>For ApsaraDB RDS secrets, PolarDB secrets, Redis/Tair secrets, RAM secrets, and ECS secrets, you can retrieve only the secret values of the ACSPrevious and ACSCurrent versions.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ACSCurrent</p>
         */
        @NameInMap("VersionStage")
        public String versionStage;

        public static BatchGetSecretValueRequestSecretsList build(java.util.Map<String, ?> map) throws Exception {
            BatchGetSecretValueRequestSecretsList self = new BatchGetSecretValueRequestSecretsList();
            return TeaModel.build(map, self);
        }

        public BatchGetSecretValueRequestSecretsList setFetchExtendedConfig(String fetchExtendedConfig) {
            this.fetchExtendedConfig = fetchExtendedConfig;
            return this;
        }
        public String getFetchExtendedConfig() {
            return this.fetchExtendedConfig;
        }

        public BatchGetSecretValueRequestSecretsList setSecretName(String secretName) {
            this.secretName = secretName;
            return this;
        }
        public String getSecretName() {
            return this.secretName;
        }

        public BatchGetSecretValueRequestSecretsList setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public BatchGetSecretValueRequestSecretsList setVersionStage(String versionStage) {
            this.versionStage = versionStage;
            return this;
        }
        public String getVersionStage() {
            return this.versionStage;
        }

    }

}
