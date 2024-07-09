// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class AddCdnDomainRequest extends TeaModel {
    /**
     * <p>The workload type of the accelerated domain name. Valid values:</p>
     * <ul>
     * <li><strong>web</strong>: images and small files</li>
     * <li><strong>download</strong>: large files</li>
     * <li><strong>video</strong>: on-demand video and audio streaming</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>web</p>
     */
    @NameInMap("CdnType")
    public String cdnType;

    /**
     * <p>The URL that is used to check the accessibility of the origin server.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com/test.html">www.example.com/test.html</a></p>
     */
    @NameInMap("CheckUrl")
    public String checkUrl;

    /**
     * <p>The domain name that you want to add to Alibaba Cloud CDN.</p>
     * <p>A wildcard domain that starts with a period (.) is supported, such as .example.com.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>.example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the resource group.</p>
     * <p>If you do not set this parameter, the system uses the ID of the default resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmyuji4b6r4**</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The acceleration region. Default value: domestic. Valid values:</p>
     * <ul>
     * <li><strong>domestic</strong>: Chinese mainland</li>
     * <li><strong>overseas</strong>: global (excluding the Chinese mainland)</li>
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
     * <p>[
     *       {
     *             &quot;content&quot;: &quot;192.0.2.0&quot;,
     *             &quot;type&quot;: &quot;ipaddr&quot;,
     *             &quot;priority&quot;: &quot;20&quot;,
     *             &quot;port&quot;: 80,
     *             &quot;weight&quot;: &quot;15&quot;
     *       }
     * ]</p>
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
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
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
         * <p>The key of the tag. Valid values of N: <strong>1 to 20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. Valid values of N: <strong>1 to 20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
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
