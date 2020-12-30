// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchAddCdnDomainRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("CdnType")
    public String cdnType;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Sources")
    public String sources;

    @NameInMap("CheckUrl")
    public String checkUrl;

    @NameInMap("Scope")
    public String scope;

    @NameInMap("TopLevelDomain")
    public String topLevelDomain;

    public static BatchAddCdnDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchAddCdnDomainRequest self = new BatchAddCdnDomainRequest();
        return TeaModel.build(map, self);
    }

    public BatchAddCdnDomainRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchAddCdnDomainRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public BatchAddCdnDomainRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public BatchAddCdnDomainRequest setCdnType(String cdnType) {
        this.cdnType = cdnType;
        return this;
    }
    public String getCdnType() {
        return this.cdnType;
    }

    public BatchAddCdnDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public BatchAddCdnDomainRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public BatchAddCdnDomainRequest setSources(String sources) {
        this.sources = sources;
        return this;
    }
    public String getSources() {
        return this.sources;
    }

    public BatchAddCdnDomainRequest setCheckUrl(String checkUrl) {
        this.checkUrl = checkUrl;
        return this;
    }
    public String getCheckUrl() {
        return this.checkUrl;
    }

    public BatchAddCdnDomainRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public BatchAddCdnDomainRequest setTopLevelDomain(String topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
        return this;
    }
    public String getTopLevelDomain() {
        return this.topLevelDomain;
    }

}
