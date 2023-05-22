// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnIpaUserDomainsRequest extends TeaModel {
    /**
     * <p>The tag key. Valid values of N: 1 to 20. You can call the TagDcdnResources operation to set a tag for a domain name.</p>
     */
    @NameInMap("CheckDomainShow")
    public Boolean checkDomainShow;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The status of the feature.</p>
     * <br>
     * <p>*   config: The feature is enabled.</p>
     * <p>*   unconfig: The feature is not enabled.</p>
     */
    @NameInMap("DomainSearchType")
    public String domainSearchType;

    /**
     * <p>The ID of the feature. For example, a value of 7 specifies the feature of configuring an expiration rule for a specific directory. For more information about feature IDs, see [Parameters for configuring features for domain names](~~410622~~).</p>
     */
    @NameInMap("DomainStatus")
    public String domainStatus;

    /**
     * <p>The number of the returned page.</p>
     */
    @NameInMap("FuncFilter")
    public String funcFilter;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("FuncId")
    public String funcId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to display domain names that are under review, failed the review, or failed to be configured. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The search method. Default value: full_match. Valid values:</p>
     * <br>
     * <p>*   **fuzzy_match**: fuzzy match</p>
     * <p>*   **pre_match**: prefix match</p>
     * <p>*   **suf_match**: suffix match</p>
     * <p>*   **full_match**: exact match</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The tag value. Valid values of N: 1 to 20.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The number of domain names returned per page.</p>
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
         * <p>The array that consists of multiple PageData parameters. The details about each accelerated domain name are included in a separate PageData parameter.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The time when the accelerated domain name was added to Alibaba Cloud Dynamic Route for CDN (DCDN).</p>
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
