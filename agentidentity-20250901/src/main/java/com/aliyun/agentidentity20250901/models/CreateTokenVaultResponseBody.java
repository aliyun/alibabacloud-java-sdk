// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateTokenVaultResponseBody extends TeaModel {
    /**
     * <p>The unique identifier of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2A48EB1D-D645-5758-91AF-EDF8E36E257B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the token vault.</p>
     */
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
         * <p>The type of the encryption key. Valid values:</p>
         * <ul>
         * <li>SERVICE_MANAGED_KEY: service-managed key</li>
         * <li>CUSTOMER_MANAGED_KEY: customer-managed KMS key</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SERVICE_MANAGED_KEY</p>
         */
        @NameInMap("KeyType")
        public String keyType;

        /**
         * <p>The ARN of the KMS key used when KeyType is set to CUSTOMER_MANAGED_KEY.</p>
         * 
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
         * <p>The time when the token vault was created, in UTC ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-08T06:19:17Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the token vault.</p>
         * 
         * <strong>example:</strong>
         * <p>example description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The encryption configuration of the token vault.</p>
         */
        @NameInMap("EncryptionConfig")
        public CreateTokenVaultResponseBodyTokenVaultEncryptionConfig encryptionConfig;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the Resource Access Management (RAM) role used to authorize the AgentIdentity service to access other cloud resources such as KMS.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456:role/AliyunAgentIdentityVaultRole</p>
         */
        @NameInMap("RoleArn")
        public String roleArn;

        /**
         * <p>The ARN of the token vault.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:agentidentity:cn-beijing:123456:tokenvault/default</p>
         */
        @NameInMap("TokenVaultArn")
        public String tokenVaultArn;

        /**
         * <p>The name of the token vault. The name must be unique within the current Alibaba Cloud account.</p>
         * 
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
