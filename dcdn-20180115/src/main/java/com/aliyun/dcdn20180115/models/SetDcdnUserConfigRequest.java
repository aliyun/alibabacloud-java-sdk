// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class SetDcdnUserConfigRequest extends TeaModel {
    /**
     * <p>The configuration parameters of the feature.</p>
     */
    @NameInMap("Configs")
    public String configs;

    /**
     * <p>The ID of the feature.</p>
     */
    @NameInMap("FunctionId")
    public Integer functionId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static SetDcdnUserConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDcdnUserConfigRequest self = new SetDcdnUserConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetDcdnUserConfigRequest setConfigs(String configs) {
        this.configs = configs;
        return this;
    }
    public String getConfigs() {
        return this.configs;
    }

    public SetDcdnUserConfigRequest setFunctionId(Integer functionId) {
        this.functionId = functionId;
        return this;
    }
    public Integer getFunctionId() {
        return this.functionId;
    }

    public SetDcdnUserConfigRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SetDcdnUserConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetDcdnUserConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
