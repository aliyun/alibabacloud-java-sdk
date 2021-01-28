// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class SetDcdnConfigOfVersionRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("VersionId")
    public String versionId;

    @NameInMap("ConfigId")
    public String configId;

    @NameInMap("FunctionId")
    public Long functionId;

    @NameInMap("FunctionName")
    public String functionName;

    @NameInMap("FunctionArgs")
    public String functionArgs;

    public static SetDcdnConfigOfVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDcdnConfigOfVersionRequest self = new SetDcdnConfigOfVersionRequest();
        return TeaModel.build(map, self);
    }

    public SetDcdnConfigOfVersionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetDcdnConfigOfVersionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SetDcdnConfigOfVersionRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public SetDcdnConfigOfVersionRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public SetDcdnConfigOfVersionRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public SetDcdnConfigOfVersionRequest setFunctionId(Long functionId) {
        this.functionId = functionId;
        return this;
    }
    public Long getFunctionId() {
        return this.functionId;
    }

    public SetDcdnConfigOfVersionRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public SetDcdnConfigOfVersionRequest setFunctionArgs(String functionArgs) {
        this.functionArgs = functionArgs;
        return this;
    }
    public String getFunctionArgs() {
        return this.functionArgs;
    }

}
