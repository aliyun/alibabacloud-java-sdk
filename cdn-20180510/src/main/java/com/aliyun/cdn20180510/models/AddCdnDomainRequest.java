// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class AddCdnDomainRequest extends TeaModel {
    // The workload type of the domain name. Valid values:
    // 
    // *   **web**: images and small files.
    // *   **download**: large files.
    // *   **video**: on-demand video and audio streaming.
    @NameInMap("CdnType")
    public String cdnType;

    // The URL that is used for health checks.
    @NameInMap("CheckUrl")
    public String checkUrl;

    // The domain names that you want to add to Alibaba Cloud CDN.
    // 
    // Wildcard domain names are supported.A wildcard domain name must start with a period (.), such as .example.com.
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The ID of the resource group.
    // 
    // If you do not set this parameter, the system uses the ID of the default resource group.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    // The accelerated region. Valid values:
    // 
    // *   **domestic**: regions in mainland China.
    // *   **overseas**: regions outside mainland China.
    // *   **global**: regions inside and outside mainland China.
    // 
    // Default value: **domestic**.
    @NameInMap("Scope")
    public String scope;

    @NameInMap("SecurityToken")
    public String securityToken;

    // The information about the origin address.
    @NameInMap("Sources")
    public String sources;

    // The tags.
    @NameInMap("Tag")
    public java.util.List<AddCdnDomainRequestTag> tag;

    // The top-level domain name.
    @NameInMap("TopLevelDomain")
    public String topLevelDomain;

    public static AddCdnDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCdnDomainRequest self = new AddCdnDomainRequest();
        return TeaModel.build(map, self);
    }

    public AddCdnDomainRequest setCdnType(String cdnType) {
        this.cdnType = cdnType;
        return this;
    }
    public String getCdnType() {
        return this.cdnType;
    }

    public AddCdnDomainRequest setCheckUrl(String checkUrl) {
        this.checkUrl = checkUrl;
        return this;
    }
    public String getCheckUrl() {
        return this.checkUrl;
    }

    public AddCdnDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddCdnDomainRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AddCdnDomainRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddCdnDomainRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public AddCdnDomainRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public AddCdnDomainRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public AddCdnDomainRequest setSources(String sources) {
        this.sources = sources;
        return this;
    }
    public String getSources() {
        return this.sources;
    }

    public AddCdnDomainRequest setTag(java.util.List<AddCdnDomainRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<AddCdnDomainRequestTag> getTag() {
        return this.tag;
    }

    public AddCdnDomainRequest setTopLevelDomain(String topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
        return this;
    }
    public String getTopLevelDomain() {
        return this.topLevelDomain;
    }

    public static class AddCdnDomainRequestTag extends TeaModel {
        // The key of tag.
        @NameInMap("Key")
        public String key;

        // The value of tag.
        @NameInMap("Value")
        public String value;

        public static AddCdnDomainRequestTag build(java.util.Map<String, ?> map) throws Exception {
            AddCdnDomainRequestTag self = new AddCdnDomainRequestTag();
            return TeaModel.build(map, self);
        }

        public AddCdnDomainRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AddCdnDomainRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
