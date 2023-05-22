// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchAddDcdnDomainRequest extends TeaModel {
    /**
     * <p>The following table describes the fields in the Sources parameter.</p>
     * <br>
     * <p>| Field | Type | Required | Description |</p>
     * <p>| ----- | ---- | -------- | ----------- |</p>
     * <p>| type | String | Yes | The type of the origin server. Valid values: **ipaddr**: the IP address  </p>
     * <br>
     * <p>**domain**: the domain name  </p>
     * <br>
     * <p>**oss**: the endpoint of an Object Storage Service (OSS) bucket  </p>
     * <br>
     * <p>**fc_domain**: the domain name of Function Compute |</p>
     * <p>| content | String | Yes | The address of the origin server. You can specify an IP address or a domain name. |</p>
     * <p>| port | Integer | No | The port. Valid values: **80**: the default port  </p>
     * <br>
     * <p>**443**: the HTTPS port  </p>
     * <br>
     * <p>A custom port |</p>
     * <p>| priority | String | No | The priority of the origin server if multiple origin servers are specified. Default value: 20. Valid values: **20**: the primary origin server  </p>
     * <br>
     * <p>**30**: the secondary origin server |</p>
     * <p>| weight | String | No | The weight of the origin server if multiple origin servers are specified. Valid values: 0 to 100. Default value: 10. |</p>
     */
    @NameInMap("CheckUrl")
    public String checkUrl;

    /**
     * <p>The top-level domain name.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Adds one or more domain names to Dynamic Route for CDN (DCDN).</p>
     */
    @NameInMap("Scope")
    public String scope;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>**Prerequisites**:</p>
     * <br>
     * <p>*   The [DCDN service is activated](~~64926~~).</p>
     * <p>*   Internet Content Provider (ICP) filing is complete for the accelerated domain names.</p>
     * <br>
     * <p>> </p>
     * <p>*   If the content of the origin server is not stored on Alibaba Cloud, the content must be reviewed. After you submit the request, the review is complete by the end of the following business day.</p>
     * <p>*   The maximum number of domain names configured at a time is 50.</p>
     * <p>*   The maximum number of times that each user can call this operation per second is 30.</p>
     */
    @NameInMap("Sources")
    public String sources;

    @NameInMap("TopLevelDomain")
    public String topLevelDomain;

    public static BatchAddDcdnDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchAddDcdnDomainRequest self = new BatchAddDcdnDomainRequest();
        return TeaModel.build(map, self);
    }

    public BatchAddDcdnDomainRequest setCheckUrl(String checkUrl) {
        this.checkUrl = checkUrl;
        return this;
    }
    public String getCheckUrl() {
        return this.checkUrl;
    }

    public BatchAddDcdnDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public BatchAddDcdnDomainRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public BatchAddDcdnDomainRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchAddDcdnDomainRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public BatchAddDcdnDomainRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public BatchAddDcdnDomainRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public BatchAddDcdnDomainRequest setSources(String sources) {
        this.sources = sources;
        return this;
    }
    public String getSources() {
        return this.sources;
    }

    public BatchAddDcdnDomainRequest setTopLevelDomain(String topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
        return this;
    }
    public String getTopLevelDomain() {
        return this.topLevelDomain;
    }

}
