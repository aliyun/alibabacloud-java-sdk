// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class AddDcdnIpaDomainRequest extends TeaModel {
    /**
     * <p>The URL that is used for health checks.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com/image_01.png</p>
     */
    @NameInMap("CheckUrl")
    public String checkUrl;

    /**
     * <p>The domain name to be added to IPA.</p>
     * <p>A wildcard domain that starts with a period (.) is supported, such as .example.com.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The protocol. Valid values:</p>
     * <ul>
     * <li><strong>udp</strong></li>
     * <li><strong>tcp</strong></li>
     * </ul>
     * <p>**</p>
     * <p><strong>Description</strong> For example: <code>{&quot;protocol&quot;:&quot;udp&quot;}</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>udp</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The ID of the resource group. If you do not specify a value for this parameter, the system automatically assigns the ID of the default resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The acceleration region. Default value: domestic. Valid values:</p>
     * <ul>
     * <li><strong>domestic</strong>: Chinese mainland</li>
     * <li><strong>overseas</strong>: outside the Chinese mainland</li>
     * <li><strong>global</strong>: global</li>
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
     * <p>*.com</p>
     */
    @NameInMap("TopLevelDomain")
    public String topLevelDomain;

    public static AddDcdnIpaDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDcdnIpaDomainRequest self = new AddDcdnIpaDomainRequest();
        return TeaModel.build(map, self);
    }

    public AddDcdnIpaDomainRequest setCheckUrl(String checkUrl) {
        this.checkUrl = checkUrl;
        return this;
    }
    public String getCheckUrl() {
        return this.checkUrl;
    }

    public AddDcdnIpaDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddDcdnIpaDomainRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AddDcdnIpaDomainRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddDcdnIpaDomainRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public AddDcdnIpaDomainRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public AddDcdnIpaDomainRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public AddDcdnIpaDomainRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public AddDcdnIpaDomainRequest setSources(String sources) {
        this.sources = sources;
        return this;
    }
    public String getSources() {
        return this.sources;
    }

    public AddDcdnIpaDomainRequest setTopLevelDomain(String topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
        return this;
    }
    public String getTopLevelDomain() {
        return this.topLevelDomain;
    }

}
