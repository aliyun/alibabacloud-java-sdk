// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchAddCdnDomainRequest extends TeaModel {
    // The workload type of the domain name to be accelerated. Valid values:
    // 
    // *   **web**: images and small files.
    // *   **download**: large files.
    // *   **video**: on-demand video and audio streaming.
    @NameInMap("CdnType")
    public String cdnType;

    // The URL that is used for health checks.
    @NameInMap("CheckUrl")
    public String checkUrl;

    // The domain names that you want to add to Alibaba Cloud CDN. Separate domain names with commas (,).
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The ID of the resource group. If you do not set this parameter, the system uses the ID of the default resource group.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    // The accelerated region. Valid values:
    // 
    // *   **domestic**: mainland China only
    // *   **overseas**: global (excluding mainland China)
    // *   **global**: global
    @NameInMap("Scope")
    public String scope;

    @NameInMap("SecurityToken")
    public String securityToken;

    // The information about the addresses of the origin servers.
    @NameInMap("Sources")
    public String sources;

    // The top-level domain name.
    @NameInMap("TopLevelDomain")
    public String topLevelDomain;

    public static BatchAddCdnDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchAddCdnDomainRequest self = new BatchAddCdnDomainRequest();
        return TeaModel.build(map, self);
    }

    public BatchAddCdnDomainRequest setCdnType(String cdnType) {
        this.cdnType = cdnType;
        return this;
    }
    public String getCdnType() {
        return this.cdnType;
    }

    public BatchAddCdnDomainRequest setCheckUrl(String checkUrl) {
        this.checkUrl = checkUrl;
        return this;
    }
    public String getCheckUrl() {
        return this.checkUrl;
    }

    public BatchAddCdnDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public BatchAddCdnDomainRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public BatchAddCdnDomainRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchAddCdnDomainRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public BatchAddCdnDomainRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public BatchAddCdnDomainRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public BatchAddCdnDomainRequest setSources(String sources) {
        this.sources = sources;
        return this;
    }
    public String getSources() {
        return this.sources;
    }

    public BatchAddCdnDomainRequest setTopLevelDomain(String topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
        return this;
    }
    public String getTopLevelDomain() {
        return this.topLevelDomain;
    }

}
