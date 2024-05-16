// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchUpdateCdnDomainRequest extends TeaModel {
    /**
     * <p>The accelerated domain names. You can specify one or more accelerated domain names. Separate domain names with commas (,).</p>
     * <br>
     * <p>This parameter is required.</p>
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
     * <p>The information about the addresses of origin servers.</p>
     * <br>
     * <p>> Do not set **Sources** and **TopLevelDomain** at the same time. If you set **Sources** and **TopLevelDomain** at the same time, **TopLevelDomain** does not take effect.</p>
     */
    @NameInMap("Sources")
    public String sources;

    /**
     * <p>The root domain.</p>
     * <br>
     * <p>> Do not set **Sources** and **TopLevelDomain** at the same time. If you set **Sources** and **TopLevelDomain** at the same time, **TopLevelDomain** does not take effect.</p>
     */
    @NameInMap("TopLevelDomain")
    public String topLevelDomain;

    public static BatchUpdateCdnDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateCdnDomainRequest self = new BatchUpdateCdnDomainRequest();
        return TeaModel.build(map, self);
    }

    public BatchUpdateCdnDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public BatchUpdateCdnDomainRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchUpdateCdnDomainRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public BatchUpdateCdnDomainRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public BatchUpdateCdnDomainRequest setSources(String sources) {
        this.sources = sources;
        return this;
    }
    public String getSources() {
        return this.sources;
    }

    public BatchUpdateCdnDomainRequest setTopLevelDomain(String topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
        return this;
    }
    public String getTopLevelDomain() {
        return this.topLevelDomain;
    }

}
