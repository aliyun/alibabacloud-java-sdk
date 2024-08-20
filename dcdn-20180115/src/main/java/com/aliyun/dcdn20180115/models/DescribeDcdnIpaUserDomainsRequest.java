// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnIpaUserDomainsRequest extends TeaModel {
    /**
     * <p>Specifies whether to display domain names that are under review, failed the review, or failed to be configured. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CheckDomainShow")
    public Boolean checkDomainShow;

    /**
     * <p>The domain name that is used as a keyword to filter domain names. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The search method. Default value: full_match. Valid values:</p>
     * <ul>
     * <li><strong>fuzzy_match</strong>: fuzzy match</li>
     * <li><strong>pre_match</strong>: prefix match</li>
     * <li><strong>suf_match</strong>: suffix match</li>
     * <li><strong>full_match</strong>: exact match</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>fuzzy_match</p>
     */
    @NameInMap("DomainSearchType")
    public String domainSearchType;

    /**
     * <p>The status of the domain name. Valid values:</p>
     * <ul>
     * <li><strong>online</strong>: enabled</li>
     * <li><strong>offline</strong>: disabled</li>
     * <li><strong>configuring</strong>: configuring</li>
     * <li><strong>configure_failed</strong>: configuration failed</li>
     * <li><strong>checking</strong>: reviewing</li>
     * <li><strong>check_failed:</strong> review failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("DomainStatus")
    public String domainStatus;

    /**
     * <p>The status of the feature.</p>
     * <ul>
     * <li>config: The feature is enabled.</li>
     * <li>unconfig: The feature is not enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>config</p>
     */
    @NameInMap("FuncFilter")
    public String funcFilter;

    /**
     * <p>The ID of the feature. For example, a value of 7 specifies the feature of configuring an expiration rule for a specific directory. For more information about feature IDs, see <a href="https://help.aliyun.com/document_detail/410622.html">Parameters for configuring features for domain names</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("FuncId")
    public String funcId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Valid values: <strong>1</strong> to <strong>100000</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of domain names per page. Default value: <strong>20</strong>.**** Valid values: <strong>1</strong> to <strong>500</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>abcd1234abcd****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags of the command.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeDcdnIpaUserDomainsRequestTag> tag;

    public static DescribeDcdnIpaUserDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnIpaUserDomainsRequest self = new DescribeDcdnIpaUserDomainsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnIpaUserDomainsRequest setCheckDomainShow(Boolean checkDomainShow) {
        this.checkDomainShow = checkDomainShow;
        return this;
    }
    public Boolean getCheckDomainShow() {
        return this.checkDomainShow;
    }

    public DescribeDcdnIpaUserDomainsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnIpaUserDomainsRequest setDomainSearchType(String domainSearchType) {
        this.domainSearchType = domainSearchType;
        return this;
    }
    public String getDomainSearchType() {
        return this.domainSearchType;
    }

    public DescribeDcdnIpaUserDomainsRequest setDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
        return this;
    }
    public String getDomainStatus() {
        return this.domainStatus;
    }

    public DescribeDcdnIpaUserDomainsRequest setFuncFilter(String funcFilter) {
        this.funcFilter = funcFilter;
        return this;
    }
    public String getFuncFilter() {
        return this.funcFilter;
    }

    public DescribeDcdnIpaUserDomainsRequest setFuncId(String funcId) {
        this.funcId = funcId;
        return this;
    }
    public String getFuncId() {
        return this.funcId;
    }

    public DescribeDcdnIpaUserDomainsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDcdnIpaUserDomainsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDcdnIpaUserDomainsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDcdnIpaUserDomainsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDcdnIpaUserDomainsRequest setTag(java.util.List<DescribeDcdnIpaUserDomainsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeDcdnIpaUserDomainsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeDcdnIpaUserDomainsRequestTag extends TeaModel {
        /**
         * <p>The tag key. Valid values of N: 1 to 20. You can call the TagDcdnResources operation to set a tag for a domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. Valid values of N: 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDcdnIpaUserDomainsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnIpaUserDomainsRequestTag self = new DescribeDcdnIpaUserDomainsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnIpaUserDomainsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDcdnIpaUserDomainsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
