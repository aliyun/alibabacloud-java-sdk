// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateTokenVaultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2A48EB1D-D645-5758-91AF-EDF8E36E257B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TokenVault")
    public CreateTokenVaultResponseBodyTokenVault tokenVault;

    public static CreateTokenVaultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTokenVaultResponseBody self = new CreateTokenVaultResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTokenVaultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTokenVaultResponseBody setTokenVault(CreateTokenVaultResponseBodyTokenVault tokenVault) {
        this.tokenVault = tokenVault;
        return this;
    }
    public CreateTokenVaultResponseBodyTokenVault getTokenVault() {
        return this.tokenVault;
    }

    public static class CreateTokenVaultResponseBodyTokenVaultEncryptionConfig extends TeaModel {
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

        public static CreateTokenVaultResponseBodyTokenVaultEncryptionConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateTokenVaultResponseBodyTokenVaultEncryptionConfig self = new CreateTokenVaultResponseBodyTokenVaultEncryptionConfig();
            return TeaModel.build(map, self);
        }

        public CreateTokenVaultResponseBodyTokenVaultEncryptionConfig setKeyType(String keyType) {
            this.keyType = keyType;
            return this;
        }
        public String getKeyType() {
            return this.keyType;
        }

        public CreateTokenVaultResponseBodyTokenVaultEncryptionConfig setKmsKeyArn(String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }
        public String getKmsKeyArn() {
            return this.kmsKeyArn;
        }

    }

    public static class CreateTokenVaultResponseBodyTokenVault extends TeaModel {
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
        public CreateTokenVaultResponseBodyTokenVaultEncryptionConfig encryptionConfig;

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

        public static CreateTokenVaultResponseBodyTokenVault build(java.util.Map<String, ?> map) throws Exception {
            CreateTokenVaultResponseBodyTokenVault self = new CreateTokenVaultResponseBodyTokenVault();
            return TeaModel.build(map, self);
        }

        public CreateTokenVaultResponseBodyTokenVault setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateTokenVaultResponseBodyTokenVault setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateTokenVaultResponseBodyTokenVault setEncryptionConfig(CreateTokenVaultResponseBodyTokenVaultEncryptionConfig encryptionConfig) {
            this.encryptionConfig = encryptionConfig;
            return this;
        }
        public CreateTokenVaultResponseBodyTokenVaultEncryptionConfig getEncryptionConfig() {
            return this.encryptionConfig;
        }

        public CreateTokenVaultResponseBodyTokenVault setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public CreateTokenVaultResponseBodyTokenVault setTokenVaultArn(String tokenVaultArn) {
            this.tokenVaultArn = tokenVaultArn;
            return this;
        }
        public String getTokenVaultArn() {
            return this.tokenVaultArn;
        }

        public CreateTokenVaultResponseBodyTokenVault setTokenVaultName(String tokenVaultName) {
            this.tokenVaultName = tokenVaultName;
            return this;
        }
        public String getTokenVaultName() {
            return this.tokenVaultName;
        }

    }

}
