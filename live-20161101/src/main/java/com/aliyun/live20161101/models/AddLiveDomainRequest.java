// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveDomainRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("LiveDomainType")
    public String liveDomainType;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Region")
    public String region;

    @NameInMap("CheckUrl")
    public String checkUrl;

    @NameInMap("Scope")
    public String scope;

    @NameInMap("TopLevelDomain")
    public String topLevelDomain;

    public static AddLiveDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLiveDomainRequest self = new AddLiveDomainRequest();
        return TeaModel.build(map, self);
    }

    public AddLiveDomainRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddLiveDomainRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AddLiveDomainRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public AddLiveDomainRequest setLiveDomainType(String liveDomainType) {
        this.liveDomainType = liveDomainType;
        return this;
    }
    public String getLiveDomainType() {
        return this.liveDomainType;
    }

    public AddLiveDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddLiveDomainRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public AddLiveDomainRequest setCheckUrl(String checkUrl) {
        this.checkUrl = checkUrl;
        return this;
    }
    public String getCheckUrl() {
        return this.checkUrl;
    }

    public AddLiveDomainRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public AddLiveDomainRequest setTopLevelDomain(String topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
        return this;
    }
    public String getTopLevelDomain() {
        return this.topLevelDomain;
    }

}
