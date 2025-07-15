// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveDomainRequest extends TeaModel {
    /**
     * <p>The URL that is used for health checks.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://demo.aliyundoc.com/status.html">http://demo.aliyundoc.com/status.html</a></p>
     */
    @NameInMap("CheckUrl")
    public String checkUrl;

    /**
     * <p>The ingest domain or streaming domain that you want to add. Wildcard domain names that start with a period (.) are supported.</p>
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
     * <li><strong>liveVideo</strong>: streaming domain. This value is required if you set the DomainName parameter to a streaming domain.</li>
     * <li><strong>liveEdge</strong>: ingest domain. This value is required if you set the DomainName parameter to an ingest domain.</li>
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
     * <p>The region in which the domain name resides. Valid values:</p>
     * <ul>
     * <li><strong>cn-beijing</strong>: China (Beijing)</li>
     * <li><strong>cn-shanghai</strong>: China (Shanghai)</li>
     * <li><strong>cn-shenzhen</strong>: China (Shenzhen)</li>
     * <li><strong>cn-qingdao</strong>: China (Qingdao)</li>
     * <li><strong>ap-southeast-1</strong>: Singapore</li>
     * <li><strong>eu-central-1</strong>: Germany (Frankfurt)</li>
     * <li><strong>ap-northeast-1</strong>: Japan (Tokyo)</li>
     * <li><strong>ap-southeast-5</strong>: Indonesia (Jakarta)</li>
     * </ul>
     * <blockquote>
     * <p> Make sure that the settings of the Region and Scope parameters do not conflict with each other.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The ID of the resource group. For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/2381067.html">Resource groups</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzw******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The edge group. This parameter is applicable to users of level 3 or higher in mainland China and users outside mainland China. Valid values:</p>
     * <ul>
     * <li><strong>domestic</strong>: mainland China. This is the default value.</li>
     * <li><strong>overseas</strong>: outside mainland China.</li>
     * <li><strong>global</strong>: regions in and outside mainland China.</li>
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
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<AddLiveDomainRequestTag> tag;

    /**
     * <p>The top-level domain name.</p>
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
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
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
