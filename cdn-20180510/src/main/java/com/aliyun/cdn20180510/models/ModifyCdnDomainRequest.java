// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ModifyCdnDomainRequest extends TeaModel {
    /**
     * <p>The accelerated domain name. You can specify only one domain name in each request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmyuji4b6r4**</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The information about the addresses of origin servers.</p>
     * <blockquote>
     * <p>Do not set <strong>Sources</strong> and <strong>TopLevelDomain</strong> at the same time. If you set <strong>Sources</strong> and <strong>TopLevelDomain</strong> at the same time, <strong>TopLevelDomain</strong> does not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;content&quot;:&quot;1.1.1.1&quot;,&quot;type&quot;:&quot;ipaddr&quot;,&quot;priority&quot;:&quot;20&quot;,&quot;port&quot;:80,&quot;weight&quot;:&quot;15&quot;}]</p>
     */
    @NameInMap("Sources")
    public String sources;

    /**
     * <p>The root domain. To add a root domain name, you must be added to the whitelist specified by the CDN_TOP_LEVEL_DOMAIN_GREY_USER_LIST parameter.</p>
     * <blockquote>
     * <p>Do not set <strong>Sources</strong> and <strong>TopLevelDomain</strong> at the same time. If you set <strong>Sources</strong> and <strong>TopLevelDomain</strong> at the same time, <strong>TopLevelDomain</strong> does not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>aliyundoc.com</p>
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
