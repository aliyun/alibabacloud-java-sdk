// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateTokenVaultRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("EncryptionConfig")
    public EncryptionConfig encryptionConfig;

    @NameInMap("RoleArn")
    public String roleArn;

    @NameInMap("TokenVaultName")
    public String tokenVaultName;

    public static CreateTokenVaultRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTokenVaultRequest self = new CreateTokenVaultRequest();
        return TeaModel.build(map, self);
    }

    public CreateTokenVaultRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTokenVaultRequest setEncryptionConfig(EncryptionConfig encryptionConfig) {
        this.encryptionConfig = encryptionConfig;
        return this;
    }
    public EncryptionConfig getEncryptionConfig() {
        return this.encryptionConfig;
    }

    public CreateTokenVaultRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public CreateTokenVaultRequest setTokenVaultName(String tokenVaultName) {
        this.tokenVaultName = tokenVaultName;
        return this;
    }
    public String getTokenVaultName() {
        return this.tokenVaultName;
    }

}
