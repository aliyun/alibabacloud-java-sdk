// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ModifyCdnDomainRequest extends TeaModel {
    /**
     * <p>The accelerated domain name. You can specify only one domain name in each call.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The list of origin URLs.</p>
     * <br>
     * <p>>  You cannot set both the **Sources** and **TopLevelDomain** parameters in the same request. Otherwise, ********the **TopLevelDomain** parameter cannot take effect.</p>
     */
    @NameInMap("Sources")
    public String sources;

    /**
     * <p>The top-level domain name. To add a top-level domain name, set the parameter CDN_TOP_LEVEL_DOMAIN_GREY_USER_LIST. This feature is available to only selected users.</p>
     * <br>
     * <p>>  You cannot set both the **Sources** and **TopLevelDomain** parameters in the same request. Otherwise, ****the **TopLevelDomain** parameter cannot take effect.</p>
     */
    @NameInMap("TopLevelDomain")
    public String topLevelDomain;

    public static ModifyCdnDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCdnDomainRequest self = new ModifyCdnDomainRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCdnDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public ModifyCdnDomainRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyCdnDomainRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyCdnDomainRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyCdnDomainRequest setSources(String sources) {
        this.sources = sources;
        return this;
    }
    public String getSources() {
        return this.sources;
    }

    public ModifyCdnDomainRequest setTopLevelDomain(String topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
        return this;
    }
    public String getTopLevelDomain() {
        return this.topLevelDomain;
    }

}
