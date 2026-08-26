// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveDomainRequest extends TeaModel {
    /**
     * <p>The health check URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://demo.aliyundoc.com/status.html">http://demo.aliyundoc.com/status.html</a></p>
     */
    @NameInMap("CheckUrl")
    public String checkUrl;

    /**
     * <p>The ingest domain or streaming domain to be connected to ApsaraVideo Live. Wildcard domain names are supported and must start with a period (.).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The type of the domain name. Valid values:</p>
     * <ul>
     * <li><strong>liveVideo</strong>: streaming domain. If you set DomainName (the domain name to be connected to ApsaraVideo Live) to a streaming domain, you must set this parameter to liveVideo.</li>
     * <li><strong>liveEdge</strong>: edge ingest domain. If you set DomainName (the domain name to be connected to ApsaraVideo Live) to an ingest domain, you must set this parameter to liveEdge.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveVideo</p>
     */
    @NameInMap("LiveDomainType")
    public String liveDomainType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The unit information of the live streaming domain name. Valid values:</p>
     * <ul>
     * <li><strong>cn-beijing</strong>: Beijing.</li>
     * <li><strong>cn-shanghai</strong>: Shanghai.</li>
     * <li><strong>cn-shenzhen</strong>: Shenzhen.</li>
     * <li><strong>cn-qingdao</strong>: Qingdao.</li>
     * <li><strong>ap-southeast-1</strong>: Singapore.</li>
     * <li><strong>eu-central-1</strong>: Germany.</li>
     * <li><strong>ap-northeast-1</strong>: Tokyo.</li>
     * <li><strong>ap-southeast-5</strong>: Jakarta.</li>
     * </ul>
     * <blockquote>
     * <p>Region (unit information of the live streaming domain name) and Scope (acceleration region) do not restrict each other.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The resource group ID. For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/2381067.html">What is a resource group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzw******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The acceleration region. This parameter takes effect for international users and China site users at L3 or above. Valid values:</p>
     * <ul>
     * <li><strong>domestic</strong> (default): the Chinese mainland.</li>
     * <li><strong>overseas</strong>: outside the Chinese mainland, including Hong Kong (China), Macao (China), and Taiwan (China).</li>
     * <li><strong>global</strong>: global acceleration.</li>
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
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<AddLiveDomainRequestTag> tag;

    /**
     * <p>The top-level domain name for access.</p>
     * 
     * <strong>example:</strong>
     * <p>learn.aliyundoc.com</p>
     */
    @NameInMap("TopLevelDomain")
    public String topLevelDomain;

    public static AddLiveDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLiveDomainRequest self = new AddLiveDomainRequest();
        return TeaModel.build(map, self);
    }

    public AddLiveDomainRequest setCheckUrl(String checkUrl) {
        this.checkUrl = checkUrl;
        return this;
    }
    public String getCheckUrl() {
        return this.checkUrl;
    }

    public AddLiveDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddLiveDomainRequest setLiveDomainType(String liveDomainType) {
        this.liveDomainType = liveDomainType;
        return this;
    }
    public String getLiveDomainType() {
        return this.liveDomainType;
    }

    public AddLiveDomainRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AddLiveDomainRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddLiveDomainRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public AddLiveDomainRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public AddLiveDomainRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public AddLiveDomainRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public AddLiveDomainRequest setTag(java.util.List<AddLiveDomainRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<AddLiveDomainRequestTag> getTag() {
        return this.tag;
    }

    public AddLiveDomainRequest setTopLevelDomain(String topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
        return this;
    }
    public String getTopLevelDomain() {
        return this.topLevelDomain;
    }

    public static class AddLiveDomainRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static AddLiveDomainRequestTag build(java.util.Map<String, ?> map) throws Exception {
            AddLiveDomainRequestTag self = new AddLiveDomainRequestTag();
            return TeaModel.build(map, self);
        }

        public AddLiveDomainRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AddLiveDomainRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
