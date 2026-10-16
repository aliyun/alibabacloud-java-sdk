// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateTokenVaultRequest extends TeaModel {
    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>example description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ARN of the RAM role used to grant the AgentIdentity service access to other cloud resources such as KMS.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456:role/AliyunAgentIdentityVaultRole</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    /**
     * <p>The name of the token vault. The name must be unique within the current Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("TokenVaultName")
    public String tokenVaultName;

    public static UpdateTokenVaultRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTokenVaultRequest self = new UpdateTokenVaultRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTokenVaultRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTokenVaultRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public UpdateTokenVaultRequest setTokenVaultName(String tokenVaultName) {
        this.tokenVaultName = tokenVaultName;
        return this;
    }
    public String getTokenVaultName() {
        return this.tokenVaultName;
    }

}
