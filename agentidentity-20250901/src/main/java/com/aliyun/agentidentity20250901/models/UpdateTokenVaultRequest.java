// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateTokenVaultRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("RoleArn")
    public String roleArn;

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
