// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class BatchDeleteLiveDomainConfigsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("DomainNames")
    public String domainNames;

    @NameInMap("FunctionNames")
    public String functionNames;

    public static BatchDeleteLiveDomainConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteLiveDomainConfigsRequest self = new BatchDeleteLiveDomainConfigsRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteLiveDomainConfigsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchDeleteLiveDomainConfigsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public BatchDeleteLiveDomainConfigsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public BatchDeleteLiveDomainConfigsRequest setDomainNames(String domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public String getDomainNames() {
        return this.domainNames;
    }

    public BatchDeleteLiveDomainConfigsRequest setFunctionNames(String functionNames) {
        this.functionNames = functionNames;
        return this;
    }
    public String getFunctionNames() {
        return this.functionNames;
    }

}
