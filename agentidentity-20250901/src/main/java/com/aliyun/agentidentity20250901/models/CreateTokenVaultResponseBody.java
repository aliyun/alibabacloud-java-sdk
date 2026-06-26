// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateTokenVaultResponseBody extends TeaModel {
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
        @NameInMap("KeyType")
        public String keyType;

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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("EncryptionConfig")
        public CreateTokenVaultResponseBodyTokenVaultEncryptionConfig encryptionConfig;

        @NameInMap("RoleArn")
        public String roleArn;

        @NameInMap("TokenVaultArn")
        public String tokenVaultArn;

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
