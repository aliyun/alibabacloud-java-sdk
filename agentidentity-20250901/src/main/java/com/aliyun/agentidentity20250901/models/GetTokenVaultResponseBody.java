// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetTokenVaultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2A48EB1D-D645-5758-91AF-EDF8E36E257B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TokenVault")
    public GetTokenVaultResponseBodyTokenVault tokenVault;

    public static GetTokenVaultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTokenVaultResponseBody self = new GetTokenVaultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTokenVaultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTokenVaultResponseBody setTokenVault(GetTokenVaultResponseBodyTokenVault tokenVault) {
        this.tokenVault = tokenVault;
        return this;
    }
    public GetTokenVaultResponseBodyTokenVault getTokenVault() {
        return this.tokenVault;
    }

    public static class GetTokenVaultResponseBodyTokenVaultEncryptionConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SERVICE_MANAGED_KEY</p>
         */
        @NameInMap("KeyType")
        public String keyType;

        /**
         * <strong>example:</strong>
         * <p>acs:kms:cn-beijing:123456:key/key-bjxxxxxxxx</p>
         */
        @NameInMap("KmsKeyArn")
        public String kmsKeyArn;

        public static GetTokenVaultResponseBodyTokenVaultEncryptionConfig build(java.util.Map<String, ?> map) throws Exception {
            GetTokenVaultResponseBodyTokenVaultEncryptionConfig self = new GetTokenVaultResponseBodyTokenVaultEncryptionConfig();
            return TeaModel.build(map, self);
        }

        public GetTokenVaultResponseBodyTokenVaultEncryptionConfig setKeyType(String keyType) {
            this.keyType = keyType;
            return this;
        }
        public String getKeyType() {
            return this.keyType;
        }

        public GetTokenVaultResponseBodyTokenVaultEncryptionConfig setKmsKeyArn(String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }
        public String getKmsKeyArn() {
            return this.kmsKeyArn;
        }

    }

    public static class GetTokenVaultResponseBodyTokenVault extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-05-08T06:19:17Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>example description</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("EncryptionConfig")
        public GetTokenVaultResponseBodyTokenVaultEncryptionConfig encryptionConfig;

        /**
         * <strong>example:</strong>
         * <p>acs:ram::123456:role/AliyunAgentIdentityVaultRole</p>
         */
        @NameInMap("RoleArn")
        public String roleArn;

        /**
         * <strong>example:</strong>
         * <p>acs:agentidentity:cn-beijing:123456:tokenvault/default</p>
         */
        @NameInMap("TokenVaultArn")
        public String tokenVaultArn;

        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("TokenVaultName")
        public String tokenVaultName;

        /**
         * <strong>example:</strong>
         * <p>2026-05-08T06:19:17Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetTokenVaultResponseBodyTokenVault build(java.util.Map<String, ?> map) throws Exception {
            GetTokenVaultResponseBodyTokenVault self = new GetTokenVaultResponseBodyTokenVault();
            return TeaModel.build(map, self);
        }

        public GetTokenVaultResponseBodyTokenVault setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetTokenVaultResponseBodyTokenVault setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetTokenVaultResponseBodyTokenVault setEncryptionConfig(GetTokenVaultResponseBodyTokenVaultEncryptionConfig encryptionConfig) {
            this.encryptionConfig = encryptionConfig;
            return this;
        }
        public GetTokenVaultResponseBodyTokenVaultEncryptionConfig getEncryptionConfig() {
            return this.encryptionConfig;
        }

        public GetTokenVaultResponseBodyTokenVault setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public GetTokenVaultResponseBodyTokenVault setTokenVaultArn(String tokenVaultArn) {
            this.tokenVaultArn = tokenVaultArn;
            return this;
        }
        public String getTokenVaultArn() {
            return this.tokenVaultArn;
        }

        public GetTokenVaultResponseBodyTokenVault setTokenVaultName(String tokenVaultName) {
            this.tokenVaultName = tokenVaultName;
            return this;
        }
        public String getTokenVaultName() {
            return this.tokenVaultName;
        }

        public GetTokenVaultResponseBodyTokenVault setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
