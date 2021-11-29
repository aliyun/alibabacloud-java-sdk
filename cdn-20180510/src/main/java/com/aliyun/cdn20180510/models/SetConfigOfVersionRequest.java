// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetConfigOfVersionRequest extends TeaModel {
    @NameInMap("ConfigId")
    public String configId;

    @NameInMap("FunctionArgs")
    public String functionArgs;

    @NameInMap("FunctionId")
    public Long functionId;

    @NameInMap("FunctionMatches")
    public String functionMatches;

    @NameInMap("FunctionName")
    public String functionName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("VersionId")
    public String versionId;

    public static SetConfigOfVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        SetConfigOfVersionRequest self = new SetConfigOfVersionRequest();
        return TeaModel.build(map, self);
    }

    public SetConfigOfVersionRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public SetConfigOfVersionRequest setFunctionArgs(String functionArgs) {
        this.functionArgs = functionArgs;
        return this;
    }
    public String getFunctionArgs() {
        return this.functionArgs;
    }

    public SetConfigOfVersionRequest setFunctionId(Long functionId) {
        this.functionId = functionId;
        return this;
    }
    public Long getFunctionId() {
        return this.functionId;
    }

    public SetConfigOfVersionRequest setFunctionMatches(String functionMatches) {
        this.functionMatches = functionMatches;
        return this;
    }
    public String getFunctionMatches() {
        return this.functionMatches;
    }

    public SetConfigOfVersionRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public SetConfigOfVersionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SetConfigOfVersionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetConfigOfVersionRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public SetConfigOfVersionRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
