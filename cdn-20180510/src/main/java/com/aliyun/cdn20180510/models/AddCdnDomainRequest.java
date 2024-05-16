// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class AddCdnDomainRequest extends TeaModel {
    /**
     * <p>The workload type of the accelerated domain name. Valid values:</p>
     * <br>
     * <p>*   **web**: images and small files</p>
     * <p>*   **download**: large files</p>
     * <p>*   **video**: on-demand video and audio streaming</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CdnType")
    public String cdnType;

    /**
     * <p>The URL that is used to check the accessibility of the origin server.</p>
     */
    @NameInMap("CheckUrl")
    public String checkUrl;

    /**
     * <p>The domain name that you want to add to Alibaba Cloud CDN.</p>
     * <br>
     * <p>A wildcard domain that starts with a period (.) is supported, such as .example.com.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the resource group.</p>
     * <br>
     * <p>If you do not set this parameter, the system uses the ID of the default resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The acceleration region. Default value: domestic. Valid values:</p>
     * <br>
     * <p>*   **domestic**: Chinese mainland</p>
     * <p>*   **overseas**: global (excluding the Chinese mainland)</p>
     * <p>*   **global**: global</p>
     */
    @NameInMap("Scope")
    public String scope;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The information about the addresses of origin servers.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Sources")
    public String sources;

    /**
     * <p>Details about the tags. You can specify up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<AddCdnDomainRequestTag> tag;

    /**
     * <p>The top-level domain.</p>
     */
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
        /**
         * <p>The key of the tag. Valid values of N: **1 to 20**.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. Valid values of N: **1 to 20**.</p>
         */
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
