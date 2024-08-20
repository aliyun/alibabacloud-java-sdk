// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class AddDcdnDomainRequest extends TeaModel {
    /**
     * <p>The URL that is used for health checks.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("CheckUrl")
    public String checkUrl;

    /**
     * <p>The domain name that you want to add. You can specify only one domain name in each request.</p>
     * <p>Wildcard domain names are supported. A wildcard domain name must start with a period (.), such as .example.com.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Computing service type. Valid values:</p>
     * <ul>
     * <li><strong>routine</strong></li>
     * <li><strong>image</strong></li>
     * <li><strong>cloudFunction</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>routine</p>
     */
    @NameInMap("FunctionType")
    public String functionType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the resource group. If you do not specify a value for this parameter, the system automatically assigns the ID of the default resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmyuji4b6r4**</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The Acceleration scen. Supported:</p>
     * <ul>
     * <li>apiscene:API acceleration.</li>
     * <li>webservicescene: accelerate website business.</li>
     * <li>staticscene: video and graphic acceleration.</li>
     * <li>(Empty): no scene.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>apiscene</p>
     */
    @NameInMap("Scene")
    public String scene;

    /**
     * <p>The acceleration region. Valid values:</p>
     * <ul>
     * <li><strong>domestic</strong>: Chinese mainland</li>
     * <li><strong>overseas</strong>: outside the Chinese mainland</li>
     * <li><strong>global</strong>: global</li>
     * </ul>
     * <p>Default value: <strong>domestic</strong>.</p>
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
     * 
     * <strong>example:</strong>
     * <p>[{&quot;content&quot;:&quot;10.10.10.10&quot;,&quot;type&quot;:&quot;ipaddr&quot;,&quot;priority&quot;:&quot;20&quot;,&quot;port&quot;:80}]</p>
     */
    @NameInMap("Sources")
    public String sources;

    /**
     * <p>The information about the tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<AddDcdnDomainRequestTag> tag;

    /**
     * <p>The top-level domain.</p>
     * 
     * <strong>example:</strong>
     * <p>yourTopLevelDomain</p>
     */
    @NameInMap("TopLevelDomain")
    public String topLevelDomain;

    public static AddDcdnDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDcdnDomainRequest self = new AddDcdnDomainRequest();
        return TeaModel.build(map, self);
    }

    public AddDcdnDomainRequest setCheckUrl(String checkUrl) {
        this.checkUrl = checkUrl;
        return this;
    }
    public String getCheckUrl() {
        return this.checkUrl;
    }

    public AddDcdnDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddDcdnDomainRequest setFunctionType(String functionType) {
        this.functionType = functionType;
        return this;
    }
    public String getFunctionType() {
        return this.functionType;
    }

    public AddDcdnDomainRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AddDcdnDomainRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddDcdnDomainRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public AddDcdnDomainRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public AddDcdnDomainRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public AddDcdnDomainRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public AddDcdnDomainRequest setSources(String sources) {
        this.sources = sources;
        return this;
    }
    public String getSources() {
        return this.sources;
    }

    public AddDcdnDomainRequest setTag(java.util.List<AddDcdnDomainRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<AddDcdnDomainRequestTag> getTag() {
        return this.tag;
    }

    public AddDcdnDomainRequest setTopLevelDomain(String topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
        return this;
    }
    public String getTopLevelDomain() {
        return this.topLevelDomain;
    }

    public static class AddDcdnDomainRequestTag extends TeaModel {
        /**
         * <p>The key of a tag. Valid values of N: <strong>1 to 20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of a tag. Valid values of N: <strong>1 to 20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static AddDcdnDomainRequestTag build(java.util.Map<String, ?> map) throws Exception {
            AddDcdnDomainRequestTag self = new AddDcdnDomainRequestTag();
            return TeaModel.build(map, self);
        }

        public AddDcdnDomainRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AddDcdnDomainRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
