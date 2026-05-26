// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateTokenVaultShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>example description</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("EncryptionConfig")
    public String encryptionConfigShrink;

    /**
     * <strong>example:</strong>
     * <p>acs:ram::123456:role/AliyunAgentIdentityVaultRole</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("TokenVaultName")
    public String tokenVaultName;

    public static CreateTokenVaultShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTokenVaultShrinkRequest self = new CreateTokenVaultShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateTokenVaultShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTokenVaultShrinkRequest setEncryptionConfigShrink(String encryptionConfigShrink) {
        this.encryptionConfigShrink = encryptionConfigShrink;
        return this;
    }
    public String getEncryptionConfigShrink() {
        return this.encryptionConfigShrink;
    }

    public CreateTokenVaultShrinkRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public CreateTokenVaultShrinkRequest setTokenVaultName(String tokenVaultName) {
        this.tokenVaultName = tokenVaultName;
        return this;
    }
    public String getTokenVaultName() {
        return this.tokenVaultName;
    }

}
