// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchAddDcdnDomainRequest extends TeaModel {
    /**
     * <p>The URL that is used for health checks.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com/test.html">www.example.com/test.html</a></p>
     */
    @NameInMap("CheckUrl")
    public String checkUrl;

    /**
     * <p>You can add up to 20 domain names to DCDN for each of your Alibaba Cloud account. If you specify multiple domain names, separate them with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com,example.org</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the resource group. If you do not specify a value for this parameter, the system uses the ID of the default resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>testID</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The acceleration region. Default value: domestic. Valid values:</p>
     * <ul>
     * <li>domestic: Chinese mainland</li>
     * <li>overseas: global (excluding the Chinese mainland)</li>
     * <li>global: global</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>domestic</p>
     */
    @NameInMap("Scope")
    public String scope;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The information about the addresses of origin servers.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;content&quot;:&quot;10.10.10.10&quot;,&quot;type&quot;:&quot;ipaddr&quot;,&quot;priority&quot;:&quot;20&quot;,&quot;port&quot;:80,&quot;weight&quot;:&quot;15&quot;}]</p>
     */
    @NameInMap("Sources")
    public String sources;

    /**
     * <p>The top-level domain.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
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
