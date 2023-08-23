// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ChangeCdnDomainToDcdnRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Operation")
    public String operation;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ChangeCdnDomainToDcdnRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeCdnDomainToDcdnRequest self = new ChangeCdnDomainToDcdnRequest();
        return TeaModel.build(map, self);
    }

    public ChangeCdnDomainToDcdnRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public ChangeCdnDomainToDcdnRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public ChangeCdnDomainToDcdnRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ChangeCdnDomainToDcdnRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ChangeCdnDomainToDcdnRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
